package org.w3c.dom

import org.w3c.dom.events.EventTarget
import org.w3c.dom.events.MouseEvent
import org.w3c.dom.events.WheelEvent

external interface ClientRect {
    var bottom: Number
    var height: Number
    var left: Number
    var right: Number
    var top: Number
    var width: Number
}

external open class PointerEvent : MouseEvent {
    var currentPoint: Any
    var height: Number
    var hwTimestamp: Number
    var intermediatePoints: Any
    var isPrimary: Boolean
    var pointerId: Number
    var pointerType: Any
    var pressure: Number
    var rotation: Number
    var tiltX: Number
    var tiltY: Number
    var width: Number
    fun getCurrentPoint(element: Element)
    fun getIntermediatePoints(element: Element)
    fun initPointerEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, detailArg: Number, screenXArg: Number, screenYArg: Number, clientXArg: Number, clientYArg: Number, ctrlKeyArg: Boolean, altKeyArg: Boolean, shiftKeyArg: Boolean, metaKeyArg: Boolean, buttonArg: Number, relatedTargetArg: EventTarget, offsetXArg: Number, offsetYArg: Number, widthArg: Number, heightArg: Number, pressure: Number, rotation: Number, tiltX: Number, tiltY: Number, pointerIdArg: Number, pointerType: Any, hwTimestampArg: Number, isPrimary: Boolean)
}

external open class MouseWheelEvent : WheelEvent

external interface GamepadButton {
    var pressed: Boolean
    var value: Number
}

external interface ExtendedGamepadButton : GamepadButton {
    override var pressed: Boolean
    var touched: Boolean
    override var value: Number
}

external interface DeviceOrientationEventInit : EventInit {
    var absolute: Boolean? get() = definedExternally; set(value) = definedExternally
    var alpha: Number? get() = definedExternally; set(value) = definedExternally
    var beta: Number? get() = definedExternally; set(value) = definedExternally
    var gamma: Number? get() = definedExternally; set(value) = definedExternally
}