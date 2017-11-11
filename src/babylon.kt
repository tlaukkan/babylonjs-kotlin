@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

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

external interface HTMLURL {
    fun createObjectURL(param1: Any, param2: Any? = definedExternally /* null */): Any
}

external interface MSStyleCSSProperties {
    var webkitTransform: String
    var webkitTransition: String
}

external interface GamepadPose {
    var hasOrientation: Boolean
    var hasPosition: Boolean
    var position: Float32Array? get() = definedExternally; set(value) = definedExternally
    var linearVelocity: Float32Array? get() = definedExternally; set(value) = definedExternally
    var linearAcceleration: Float32Array? get() = definedExternally; set(value) = definedExternally
    var orientation: Float32Array? get() = definedExternally; set(value) = definedExternally
    var angularVelocity: Float32Array? get() = definedExternally; set(value) = definedExternally
    var angularAcceleration: Float32Array? get() = definedExternally; set(value) = definedExternally
}
external interface ImageBitmap {
    var width: Number
    var height: Number
    fun close()
}

external var HMDVRDevice: Any = definedExternally
external var VRDisplay: Any = definedExternally
external var VRFrameData: Any = definedExternally
