import org.w3c.dom.HTMLCanvasElement
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    val message = "Hello JavaScript!"
    println(message)

    window.addEventListener("DOMContentLoaded", {
        // get the canvas DOM element
        var canvas = document.getElementById("renderCanvas")

        // load the 3D engine
        var engine = BABYLON.Engine(canvas as HTMLCanvasElement, true)

        // create a basic BJS Scene object
        var scene = BABYLON.Scene(engine)

        // create a FreeCamera, and set its position to (x:0, y:5, z:-10)
        var camera = BABYLON.FreeCamera("camera1", BABYLON.Vector3(0, 5,-10), scene)

        // target the camera to scene origin
        camera.setTarget(BABYLON.Vector3.Zero())

        // attach the camera to the canvas
        camera.attachControl(canvas, false)

        // create a basic light, aiming 0,1,0 - meaning, to the sky
        var light = BABYLON.HemisphericLight("light1", BABYLON.Vector3(0,1,0), scene)

        // create a built-in "sphere" shape; its constructor takes 5 params: name, width, depth, subdivisions, scene
        var sphere = BABYLON.Mesh.CreateSphere("sphere1", 16, 2, scene)

        // move the sphere upward 1/2 of its height
        sphere.position.y = 1

        // create a built-in "ground" shape; its constructor takes the same 5 params as the sphere's one
        var ground = BABYLON.Mesh.CreateGround("ground1", 6, 6, 2, scene)

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
                    BABYLON.Vector3(1.1057981719934822, 1, 4.489641138090739), scene)
        }
        else {
            println("VRDeviceOrientation.")
            camera = BABYLON.VRDeviceOrientationFreeCamera("VRDeviceOrientation",
                    BABYLON.Vector3(1.1057981719934822, 2, 4.489641138090739), scene)
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