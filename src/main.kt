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
        val light = BABYLON.DirectionalLight("DirectionalLight", BABYLON.Vector3(-0.5664,-0.594,0.5712), scene)
        scene.ambientColor = Color3(0.5, 0.5, 0.5)

        // Create skybox
        val envTexture = BABYLON.CubeTexture("assets/skyboxes/nebula/", scene, arrayOf("box_right1.png", "box_top3.png", "box_front5.png", "box_left2.png", "box_bottom4.png", "box_back6.png"))
        val skybox = scene.createDefaultSkybox(envTexture, false, 4096)

        // Load soundscape
        val soundscape: BABYLON.Sound = BABYLON.Sound("chanting", "assets/soundscapes/singing-bowls.wav", scene)
        soundscape.loop = true
        soundscape.autoplay = true
        soundscape.setVolume(0.5)

        //val shadowGenerator = BABYLON.ShadowGenerator(1024, light)

        // Load model and attach soundscape to it.
        loadBabylonScene("buddha-statue-1", "assets/models/temple/", "temple.babylon", scene)

        // Load model and attach soundscape to it.
        loadBabylonModel("buddha-statue-1", "assets/models/buddha/", "buddha.babylon", scene, { mesh ->
            mesh.position = Vector3(0, 1, 4.4)
            mesh.scaling = Vector3(0.1, 0.1, 0.1)
            soundscape.attachToMesh(mesh)
            //mesh.receiveShadows = true
            //shadowGenerator.getShadowMap().renderList = arrayOf(mesh)
        })

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

private fun loadBabylonScene(meshName: String, rootUrl: String, modelFileName: String, scene: Scene) {
    SceneLoader.ImportMesh("", rootUrl, modelFileName, scene, { meshes: Array<Mesh>, particleSystems: Array<ParticleSystem>, skeletons: Array<Skeleton> ->
        println("Loaded: " + meshName)
    })
}

private fun loadBabylonModel(meshName: String, rootUrl: String, modelFileName: String, scene: Scene, onSuccess: (mesh: Mesh) -> Unit) {
    SceneLoader.ImportMesh("", rootUrl, modelFileName, scene, { meshes: Array<Mesh>, particleSystems: Array<ParticleSystem>, skeletons: Array<Skeleton> ->
        for (mesh in meshes) {
            scene.removeMesh(mesh)
        }
        var newMesh = Mesh.MergeMeshes(meshes, allow32BitsIndices = true)
        newMesh.id = meshName
        newMesh.name = meshName

        scene.addMesh(newMesh)
        println("Loaded: " + newMesh.id)
        onSuccess(newMesh)
    })
}

fun setCameraWSADKeys(camera: FreeCamera) {
    camera.keysUp = arrayOf(87)
    camera.keysDown = arrayOf(83)
    camera.keysLeft= arrayOf(65)
    camera.keysRight = arrayOf(68)
    camera.speed = 0.25
}