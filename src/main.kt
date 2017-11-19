import BABYLON.*
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.events.KeyboardEvent
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    val message = "Hello JavaScript!"
    println(message)

    window.addEventListener("DOMContentLoaded", {
        // Get canvas
        var canvas = document.getElementById("renderCanvas")
        // Create engine
        var engine = BABYLON.Engine(canvas as HTMLCanvasElement, true)
        // Create scene

        var scene = BABYLON.Scene(engine)

        scene.actionManager = BABYLON.ActionManager(scene)

        // Create camera
        var freeCamera = BABYLON.FreeCamera("camera1", BABYLON.Vector3(0,1.5,0), scene)
        freeCamera.setTarget(BABYLON.Vector3(0,1.0,3))
        freeCamera.attachControl(canvas, true)
        setCameraWSADKeys(freeCamera)

        // Create lighting
        val light = BABYLON.DirectionalLight("DirectionalLight", BABYLON.Vector3(1, -0.3, 1), scene)
        scene.ambientColor = Color3(0.2, 0.2, 0.2)

        // Create skybox
        val envTexture = BABYLON.CubeTexture("assets/skyboxes/nebula/", scene, arrayOf("box_right1.png", "box_top3.png", "box_front5.png", "box_left2.png", "box_bottom4.png", "box_back6.png"))
        val skybox = scene.createDefaultSkybox(envTexture, false, 4096)

        // Load soundscape
        var soundscape: BABYLON.Sound? = null
        soundscape = BABYLON.Sound("chanting", "assets/soundscapes/singing-bowls.wav", scene)
        soundscape.autoplay = true
        soundscape.loop = true
        soundscape.setVolume(0.5)

        // Load model and attach soundscape to it.
        BABYLON.SceneLoader.ImportMesh("", "assets/models/buddha/", "buddha.babylon", scene, { meshes : Array<Mesh>, particleSystems : Array<ParticleSystem>, skeletons : Array<Skeleton> ->
            var first = true
            for (mesh in meshes) {
                if (first) {
                    soundscape!!.attachToMesh(mesh)
                    first = false
                }
                scene.removeMesh(mesh)
            }
            var newMesh = BABYLON.Mesh.MergeMeshes(meshes, allow32BitsIndices = true)
            //newMesh.material = marple
            newMesh.position.z = 5
            scene.addMesh(newMesh)
        })

        // Create sphere
        // val marble = BABYLON.StandardMaterial("SphereMarble", scene)
        // marble.specularColor = Color3(0.2, 0.2, 0.2)
        // marble.diffuseTexture = BABYLON.Texture("assets/models/buddha/marble-3.jpg", scene)
        // var sphere = BABYLON.Mesh.CreateSphere("sphere1", 16, 1, scene)
        // sphere.material = marble
        // sphere.position.z = 3

        // run the render loop
        engine.runRenderLoop({
            scene.render()
        })

        // the canvas/window resize event handler
        window.addEventListener("resize", {
            engine.resize()
        })

        val vrCamera: WebVRFreeCamera?
        if (navigator.getVRDisplays != undefined) {
            vrCamera = BABYLON.WebVRFreeCamera("WebVRCamera", BABYLON.Vector3(0,1.5,0), scene)
            setCameraWSADKeys(vrCamera)
        } else {
            vrCamera = null
        }

        var mockVrCamera = BABYLON.VRDeviceOrientationFreeCamera("VRDeviceOrientation", BABYLON.Vector3(0,1.5,0), scene)
        setCameraWSADKeys(mockVrCamera)

        scene.actionManager.registerAction(BABYLON.ExecuteCodeAction(BABYLON.ActionManager.OnKeyUpTrigger, { evt ->
            println((evt.sourceEvent as KeyboardEvent).keyCode)
            if ((evt.sourceEvent as KeyboardEvent).keyCode == 220) {
                if (vrCamera != null) {
                    if (scene.activeCamera != vrCamera) {
                        scene.activeCamera.detachControl(canvas)
                        scene.activeCamera = vrCamera
                        scene.activeCamera.attachControl(canvas, true)
                    } else {
                        scene.activeCamera.detachControl(canvas)
                        scene.activeCamera = freeCamera
                        scene.activeCamera.attachControl(canvas, true)
                    }
                } else {
                    if (scene.activeCamera != mockVrCamera) {
                        scene.activeCamera.detachControl(canvas)
                        scene.activeCamera = mockVrCamera
                        scene.activeCamera.attachControl(canvas, true)
                    } else {
                        scene.activeCamera.detachControl(canvas)
                        scene.activeCamera = freeCamera
                        scene.activeCamera.attachControl(canvas, true)
                    }
                }
            }
        }))
    })

}

fun setCameraWSADKeys(camera: FreeCamera) {
    camera.keysUp = arrayOf(87)
    camera.keysDown = arrayOf(83)
    camera.keysLeft= arrayOf(65)
    camera.keysRight = arrayOf(68)
    camera.speed = 0.25
}