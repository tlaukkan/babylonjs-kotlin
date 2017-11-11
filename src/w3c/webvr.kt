package org.w3c.webvr

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external open class VRDisplay : EventTarget {
    open var isConnected: Boolean = definedExternally
    open var isPresenting: Boolean = definedExternally
    open var capabilities: VRDisplayCapabilities = definedExternally
    open var stageParameters: VRStageParameters = definedExternally
    open fun getEyeParameters(whichEye: String): VREyeParameters = definedExternally
    open var displayId: Number = definedExternally
    open var displayName: String = definedExternally
    open fun getFrameData(frameData: VRFrameData): Boolean = definedExternally
    open fun getPose(): VRPose = definedExternally
    open fun getImmediatePose(): VRPose = definedExternally
    open fun resetPose(): Unit = definedExternally
    open var depthNear: Number = definedExternally
    open var depthFar: Number = definedExternally
    open fun requestAnimationFrame(callback: FrameRequestCallback): Number = definedExternally
    open fun cancelAnimationFrame(handle: Number): Unit = definedExternally
    open fun requestPresent(layers: Array<VRLayer>): Promise<Unit> = definedExternally
    open fun exitPresent(): Promise<Unit> = definedExternally
    open fun getLayers(): Array<VRLayer> = definedExternally
    open fun submitFrame(pose: VRPose? = definedExternally /* null */): Unit = definedExternally
}

typealias FrameRequestCallback = (Number)->Unit

external interface `T$0` {
    var source: HTMLCanvasElement? get() = definedExternally; set(value) = definedExternally
    var leftBounds: Array<Number>? get() = definedExternally; set(value) = definedExternally
    var rightBounds: Array<Number>? get() = definedExternally; set(value) = definedExternally
}
external interface VRDisplayCapabilities {
    var hasPosition: Boolean
    var hasOrientation: Boolean
    var hasExternalDisplay: Boolean
    var canPresent: Boolean
    var maxLayers: Number
}
external interface VRFieldOfView {
    var upDegrees: Number
    var rightDegrees: Number
    var downDegrees: Number
    var leftDegrees: Number
}
external interface VRPose {
    var timestamp: Number
    var position: Float32Array
    var linearVelocity: Float32Array
    var linearAcceleration: Float32Array
    var orientation: Float32Array
    var angularVelocity: Float32Array
    var angularAcceleration: Float32Array
}
external open class VRFrameData {
    open var timestamp: Number = definedExternally
    open var leftProjectionMatrix: Float32Array = definedExternally
    open var leftViewMatrix: Float32Array = definedExternally
    open var rightProjectionMatrix: Float32Array = definedExternally
    open var rightViewMatrix: Float32Array = definedExternally
    open var pose: VRPose = definedExternally
}
external interface VREyeParameters {
    var offset: Float32Array
    var fieldOfView: VRFieldOfView
    var renderWidth: Number
    var renderHeight: Number
}
external interface VRStageParameters {
    var sittingToStandingTransform: Float32Array
    var sizeX: Number
    var sizeZ: Number
}
/*
external interface Navigator {
    fun getVRDisplays(): Promise<Array<VRDisplay>>
    var activeVRDisplays: Array<VRDisplay>
}
external interface Window {
    var onvrdisplayconnected: (ev: Event) -> Any
    var onvrdisplaydisconnected: (ev: Event) -> Any
    var onvrdisplaypresentchange: (ev: Event) -> Any
    fun addEventListener(type: Any /* "vrdisplayconnected" */, listener: (ev: Event) -> Any, useCapture: Boolean? = definedExternally /* null */)
    fun addEventListener(type: Any /* "vrdisplaydisconnected" */, listener: (ev: Event) -> Any, useCapture: Boolean? = definedExternally /* null */)
    fun addEventListener(type: Any /* "vrdisplaypresentchange" */, listener: (ev: Event) -> Any, useCapture: Boolean? = definedExternally /* null */)
}
external interface Gamepad {
    var displayId: Number
}
*/
external interface VRLayer {
    var source: HTMLCanvasElement
    var leftBounds: Array<Number>
    var rightBounds: Array<Number>
}