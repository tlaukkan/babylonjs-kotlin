import BABYLON.AbstractMesh
import BABYLON.ParticleSystem
import BABYLON.Skeleton
import org.w3c.dom.HTMLCanvasElement
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

        // Create camera
        var camera = BABYLON.FreeCamera("camera1", BABYLON.Vector3(0,1.5,0), scene)
        camera.setTarget(BABYLON.Vector3(0,1.0,3))
        camera.attachControl(canvas, false)

        // Create sky and sunlight
        val sunPosition = BABYLON.Vector3(30, 100, 30)
        val sunLight = BABYLON.DirectionalLight("DirectionalLight", sunPosition.scale(-1), scene)

        /*val skyMaterial = BABYLON.SkyMaterial("skyMaterial", scene)
        skyMaterial.backFaceCulling = false
        skyMaterial.rayleigh = 1
        skyMaterial.useSunPosition = true // Do not set sun position from azimuth and inclination
        skyMaterial.sunPosition = sunPosition
        val skybox = BABYLON.Mesh.CreateBox("skyBox", 512.0, scene)
        skybox.material = skyMaterial*/

        val envTexture = BABYLON.CubeTexture("assets/skyboxes/nebula/", scene, arrayOf("box_right1.png", "box_top3.png", "box_front5.png", "box_left2.png", "box_bottom4.png", "box_back6.png"))
        val skybox = scene.createDefaultSkybox(envTexture, false, 4096)

        // Create water
        /*val waterMaterial = BABYLON.WaterMaterial("water_material", scene)
        waterMaterial.backFaceCulling = true
        waterMaterial.windForce = 0
        waterMaterial.waveHeight = 0.25
        waterMaterial.bumpHeight = 0.05
        waterMaterial.waveLength = 0.1
        waterMaterial.colorBlendFactor = 0.2
        waterMaterial.bumpTexture = BABYLON.Texture("images/waterbump.jpg", scene) // Set the bump texture
        waterMaterial.addToRenderList(skybox)
        val water = BABYLON.Mesh.CreateGround("water", 512, 512, 32, scene)
        water.position.y = -5
        water.material = waterMaterial*/

        // Create sphere
        var sphere = BABYLON.Mesh.CreateSphere("sphere1", 16, 1, scene)
        sphere.position.z = 3

        BABYLON.SceneLoader.ImportMesh("", "assets/models/buddha/", "buddha.babylon", scene, { newMeshes : Array<AbstractMesh>, particleSystems : Array<ParticleSystem>, skeletons : Array<Skeleton> ->

            for (newMesh in newMeshes) {
                newMesh.position = BABYLON.Vector3(0, 0, 5)
                break
            }

        })


        // run the render loop
        engine.runRenderLoop({
            scene.render()
        })

        // the canvas/window resize event handler
        window.addEventListener("resize", {
            engine.resize()
        })

        if (navigator.getVRDisplays != undefined) {
            println("WebVRCamera.")
            camera = BABYLON.WebVRFreeCamera("WebVRCamera",
                    BABYLON.Vector3(0,1.5,0), scene)
        }
        else {
            println("VRDeviceOrientation.")
            camera = BABYLON.VRDeviceOrientationFreeCamera("VRDeviceOrientation",
                    BABYLON.Vector3(0,1.5,0), scene)
        }

        // Touch or click the rendering canvas to enter VR Mode
        scene.onPointerDown = { evt, pickInfo ->
            println("Starting VR.")
            scene.activeCamera = camera

            scene.onPointerDown = { evt, pickInfo -> }
            camera.attachControl(canvas, true)
        }
    })

}