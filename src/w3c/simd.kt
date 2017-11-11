@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("SIMD")
package SIMD

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

external interface Float32x4 {
    var constructor: Float32x4Constructor
    fun valueOf(): Float32x4
    fun toLocaleString(): String
    override fun toString(): String
}
external interface Float32x4Constructor {
    @nativeInvoke
    operator fun invoke(s0: Number? = definedExternally /* null */, s1: Number? = definedExternally /* null */, s2: Number? = definedExternally /* null */, s3: Number? = definedExternally /* null */): Float32x4
    var prototype: Float32x4
    fun extractLane(simd: SIMD.Float32x4, lane: Number): Number
    fun swizzle(a: SIMD.Float32x4, l1: Number, l2: Number, l3: Number, l4: Number): SIMD.Float32x4
    fun shuffle(a: SIMD.Float32x4, b: SIMD.Float32x4, l1: Number, l2: Number, l3: Number, l4: Number): SIMD.Float32x4
    fun check(a: SIMD.Float32x4): SIMD.Float32x4
    fun splat(n: Number): SIMD.Float32x4
    fun replaceLane(simd: SIMD.Float32x4, lane: Number, value: Number): SIMD.Float32x4
    fun select(selector: SIMD.Bool32x4, a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4
    fun equal(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4
    fun notEqual(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4
    fun lessThan(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4
    fun lessThanOrEqual(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4
    fun greaterThan(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4
    fun greaterThanOrEqual(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4
    fun add(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4
    fun sub(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4
    fun mul(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4
    fun div(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4
    fun neg(a: SIMD.Float32x4): SIMD.Float32x4
    fun abs(a: SIMD.Float32x4): SIMD.Float32x4
    fun min(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4
    fun max(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4
    fun minNum(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4
    fun maxNum(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4
    fun reciprocalApproximation(a: SIMD.Float32x4): SIMD.Float32x4
    fun reciprocalSqrtApproximation(a: SIMD.Float32x4): SIMD.Float32x4
    fun sqrt(a: SIMD.Float32x4): SIMD.Float32x4
    fun load(tarray: Uint8Array, index: Number): SIMD.Float32x4
    fun load(tarray: Uint8ClampedArray, index: Number): SIMD.Float32x4
    fun load(tarray: Int16Array, index: Number): SIMD.Float32x4
    fun load(tarray: Uint16Array, index: Number): SIMD.Float32x4
    fun load(tarray: Int32Array, index: Number): SIMD.Float32x4
    fun load(tarray: Uint32Array, index: Number): SIMD.Float32x4
    fun load(tarray: Float32Array, index: Number): SIMD.Float32x4
    fun load(tarray: Float64Array, index: Number): SIMD.Float32x4
    fun load1(tarray: Uint8Array, index: Number): SIMD.Float32x4
    fun load1(tarray: Uint8ClampedArray, index: Number): SIMD.Float32x4
    fun load1(tarray: Int16Array, index: Number): SIMD.Float32x4
    fun load1(tarray: Uint16Array, index: Number): SIMD.Float32x4
    fun load1(tarray: Int32Array, index: Number): SIMD.Float32x4
    fun load1(tarray: Uint32Array, index: Number): SIMD.Float32x4
    fun load1(tarray: Float32Array, index: Number): SIMD.Float32x4
    fun load1(tarray: Float64Array, index: Number): SIMD.Float32x4
    fun load2(tarray: Uint8Array, index: Number): SIMD.Float32x4
    fun load2(tarray: Uint8ClampedArray, index: Number): SIMD.Float32x4
    fun load2(tarray: Int16Array, index: Number): SIMD.Float32x4
    fun load2(tarray: Uint16Array, index: Number): SIMD.Float32x4
    fun load2(tarray: Int32Array, index: Number): SIMD.Float32x4
    fun load2(tarray: Uint32Array, index: Number): SIMD.Float32x4
    fun load2(tarray: Float32Array, index: Number): SIMD.Float32x4
    fun load2(tarray: Float64Array, index: Number): SIMD.Float32x4
    fun load3(tarray: Uint8Array, index: Number): SIMD.Float32x4
    fun load3(tarray: Uint8ClampedArray, index: Number): SIMD.Float32x4
    fun load3(tarray: Int16Array, index: Number): SIMD.Float32x4
    fun load3(tarray: Uint16Array, index: Number): SIMD.Float32x4
    fun load3(tarray: Int32Array, index: Number): SIMD.Float32x4
    fun load3(tarray: Uint32Array, index: Number): SIMD.Float32x4
    fun load3(tarray: Float32Array, index: Number): SIMD.Float32x4
    fun load3(tarray: Float64Array, index: Number): SIMD.Float32x4
    fun store(tarray: Uint8Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store(tarray: Uint8ClampedArray, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store(tarray: Int16Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store(tarray: Uint16Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store(tarray: Int32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store(tarray: Uint32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store(tarray: Float32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store(tarray: Float64Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store1(tarray: Uint8Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store1(tarray: Uint8ClampedArray, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store1(tarray: Int16Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store1(tarray: Uint16Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store1(tarray: Int32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store1(tarray: Uint32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store1(tarray: Float32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store1(tarray: Float64Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store2(tarray: Uint8Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store2(tarray: Uint8ClampedArray, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store2(tarray: Int16Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store2(tarray: Uint16Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store2(tarray: Int32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store2(tarray: Uint32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store2(tarray: Float32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store2(tarray: Float64Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store3(tarray: Uint8Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store3(tarray: Uint8ClampedArray, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store3(tarray: Int16Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store3(tarray: Uint16Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store3(tarray: Int32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store3(tarray: Uint32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store3(tarray: Float32Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun store3(tarray: Float64Array, index: Number, value: SIMD.Float32x4): SIMD.Float32x4
    fun fromInt32x4(value: SIMD.Int32x4): SIMD.Float32x4
    fun fromUint32x4(value: SIMD.Uint32x4): SIMD.Float32x4
    fun fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Float32x4
    fun fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Float32x4
    fun fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Float32x4
    fun fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Float32x4
    fun fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Float32x4
    fun fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Float32x4
}
external interface Int32x4 {
    var constructor: Int32x4Constructor
    fun valueOf(): Int32x4
    fun toLocaleString(): String
    override fun toString(): String
}
external interface Int32x4Constructor {
    @nativeInvoke
    operator fun invoke(s0: Number? = definedExternally /* null */, s1: Number? = definedExternally /* null */, s2: Number? = definedExternally /* null */, s3: Number? = definedExternally /* null */): Int32x4
    var prototype: Int32x4
    fun extractLane(simd: SIMD.Int32x4, lane: Number): Number
    fun swizzle(a: SIMD.Int32x4, l1: Number, l2: Number, l3: Number, l4: Number): SIMD.Int32x4
    fun shuffle(a: SIMD.Int32x4, b: SIMD.Int32x4, l1: Number, l2: Number, l3: Number, l4: Number): SIMD.Int32x4
    fun check(a: SIMD.Int32x4): SIMD.Int32x4
    fun splat(n: Number): SIMD.Int32x4
    fun replaceLane(simd: SIMD.Int32x4, lane: Number, value: Number): SIMD.Int32x4
    fun select(selector: SIMD.Bool32x4, a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4
    fun equal(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4
    fun notEqual(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4
    fun lessThan(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4
    fun lessThanOrEqual(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4
    fun greaterThan(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4
    fun greaterThanOrEqual(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4
    fun and(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4
    fun or(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4
    fun xor(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4
    fun not(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4
    fun add(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4
    fun sub(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4
    fun mul(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4
    fun neg(a: SIMD.Int32x4): SIMD.Int32x4
    fun shiftLeftByScalar(a: SIMD.Int32x4, bits: Number): SIMD.Int32x4
    fun shiftRightByScalar(a: SIMD.Int32x4, bits: Number): SIMD.Int32x4
    fun load(tarray: Uint8Array, index: Number): SIMD.Int32x4
    fun load(tarray: Uint8ClampedArray, index: Number): SIMD.Int32x4
    fun load(tarray: Int16Array, index: Number): SIMD.Int32x4
    fun load(tarray: Uint16Array, index: Number): SIMD.Int32x4
    fun load(tarray: Int32Array, index: Number): SIMD.Int32x4
    fun load(tarray: Uint32Array, index: Number): SIMD.Int32x4
    fun load(tarray: Float32Array, index: Number): SIMD.Int32x4
    fun load(tarray: Float64Array, index: Number): SIMD.Int32x4
    fun load1(tarray: Uint8Array, index: Number): SIMD.Int32x4
    fun load1(tarray: Uint8ClampedArray, index: Number): SIMD.Int32x4
    fun load1(tarray: Int16Array, index: Number): SIMD.Int32x4
    fun load1(tarray: Uint16Array, index: Number): SIMD.Int32x4
    fun load1(tarray: Int32Array, index: Number): SIMD.Int32x4
    fun load1(tarray: Uint32Array, index: Number): SIMD.Int32x4
    fun load1(tarray: Float32Array, index: Number): SIMD.Int32x4
    fun load1(tarray: Float64Array, index: Number): SIMD.Int32x4
    fun load2(tarray: Uint8Array, index: Number): SIMD.Int32x4
    fun load2(tarray: Uint8ClampedArray, index: Number): SIMD.Int32x4
    fun load2(tarray: Int16Array, index: Number): SIMD.Int32x4
    fun load2(tarray: Uint16Array, index: Number): SIMD.Int32x4
    fun load2(tarray: Int32Array, index: Number): SIMD.Int32x4
    fun load2(tarray: Uint32Array, index: Number): SIMD.Int32x4
    fun load2(tarray: Float32Array, index: Number): SIMD.Int32x4
    fun load2(tarray: Float64Array, index: Number): SIMD.Int32x4
    fun load3(tarray: Uint8Array, index: Number): SIMD.Int32x4
    fun load3(tarray: Uint8ClampedArray, index: Number): SIMD.Int32x4
    fun load3(tarray: Int16Array, index: Number): SIMD.Int32x4
    fun load3(tarray: Uint16Array, index: Number): SIMD.Int32x4
    fun load3(tarray: Int32Array, index: Number): SIMD.Int32x4
    fun load3(tarray: Uint32Array, index: Number): SIMD.Int32x4
    fun load3(tarray: Float32Array, index: Number): SIMD.Int32x4
    fun load3(tarray: Float64Array, index: Number): SIMD.Int32x4
    fun store(tarray: Uint8Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store(tarray: Uint8ClampedArray, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store(tarray: Int16Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store(tarray: Uint16Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store(tarray: Int32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store(tarray: Uint32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store(tarray: Float32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store(tarray: Float64Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store1(tarray: Uint8Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store1(tarray: Uint8ClampedArray, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store1(tarray: Int16Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store1(tarray: Uint16Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store1(tarray: Int32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store1(tarray: Uint32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store1(tarray: Float32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store1(tarray: Float64Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store2(tarray: Uint8Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store2(tarray: Uint8ClampedArray, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store2(tarray: Int16Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store2(tarray: Uint16Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store2(tarray: Int32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store2(tarray: Uint32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store2(tarray: Float32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store2(tarray: Float64Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store3(tarray: Uint8Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store3(tarray: Uint8ClampedArray, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store3(tarray: Int16Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store3(tarray: Uint16Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store3(tarray: Int32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store3(tarray: Uint32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store3(tarray: Float32Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun store3(tarray: Float64Array, index: Number, value: SIMD.Int32x4): SIMD.Int32x4
    fun fromFloat32x4(value: SIMD.Float32x4): SIMD.Int32x4
    fun fromUint32x4(value: SIMD.Uint32x4): SIMD.Int32x4
    fun fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Int32x4
    fun fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Int32x4
    fun fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Int32x4
    fun fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Int32x4
    fun fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Int32x4
    fun fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Int32x4
}
external interface Int16x8 {
    var constructor: Int16x8Constructor
    fun valueOf(): Int16x8
    fun toLocaleString(): String
    override fun toString(): String
}
external interface Int16x8Constructor {
    @nativeInvoke
    operator fun invoke(s0: Number? = definedExternally /* null */, s1: Number? = definedExternally /* null */, s2: Number? = definedExternally /* null */, s3: Number? = definedExternally /* null */, s4: Number? = definedExternally /* null */, s5: Number? = definedExternally /* null */, s6: Number? = definedExternally /* null */, s7: Number? = definedExternally /* null */): Int16x8
    var prototype: Int16x8
    fun extractLane(simd: SIMD.Int16x8, lane: Number): Number
    fun swizzle(a: SIMD.Int16x8, l1: Number, l2: Number, l3: Number, l4: Number, l5: Number, l6: Number, l7: Number, l8: Number): SIMD.Int16x8
    fun shuffle(a: SIMD.Int16x8, b: SIMD.Int16x8, l1: Number, l2: Number, l3: Number, l4: Number, l5: Number, l6: Number, l7: Number, l8: Number): SIMD.Int16x8
    fun check(a: SIMD.Int16x8): SIMD.Int16x8
    fun splat(n: Number): SIMD.Int16x8
    fun replaceLane(simd: SIMD.Int16x8, lane: Number, value: Number): SIMD.Int16x8
    fun select(selector: SIMD.Bool16x8, a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8
    fun equal(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8
    fun notEqual(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8
    fun lessThan(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8
    fun lessThanOrEqual(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8
    fun greaterThan(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8
    fun greaterThanOrEqual(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8
    fun and(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8
    fun or(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8
    fun xor(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8
    fun not(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8
    fun add(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8
    fun sub(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8
    fun mul(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8
    fun neg(a: SIMD.Int16x8): SIMD.Int16x8
    fun shiftLeftByScalar(a: SIMD.Int16x8, bits: Number): SIMD.Int16x8
    fun shiftRightByScalar(a: SIMD.Int16x8, bits: Number): SIMD.Int16x8
    fun addSaturate(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8
    fun subSaturate(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8
    fun load(tarray: Uint8Array, index: Number): SIMD.Int16x8
    fun load(tarray: Uint8ClampedArray, index: Number): SIMD.Int16x8
    fun load(tarray: Int16Array, index: Number): SIMD.Int16x8
    fun load(tarray: Uint16Array, index: Number): SIMD.Int16x8
    fun load(tarray: Int32Array, index: Number): SIMD.Int16x8
    fun load(tarray: Uint32Array, index: Number): SIMD.Int16x8
    fun load(tarray: Float32Array, index: Number): SIMD.Int16x8
    fun load(tarray: Float64Array, index: Number): SIMD.Int16x8
    fun store(tarray: Uint8Array, index: Number, value: SIMD.Int16x8): SIMD.Int16x8
    fun store(tarray: Uint8ClampedArray, index: Number, value: SIMD.Int16x8): SIMD.Int16x8
    fun store(tarray: Int16Array, index: Number, value: SIMD.Int16x8): SIMD.Int16x8
    fun store(tarray: Uint16Array, index: Number, value: SIMD.Int16x8): SIMD.Int16x8
    fun store(tarray: Int32Array, index: Number, value: SIMD.Int16x8): SIMD.Int16x8
    fun store(tarray: Uint32Array, index: Number, value: SIMD.Int16x8): SIMD.Int16x8
    fun store(tarray: Float32Array, index: Number, value: SIMD.Int16x8): SIMD.Int16x8
    fun store(tarray: Float64Array, index: Number, value: SIMD.Int16x8): SIMD.Int16x8
    fun fromUint16x8(value: SIMD.Uint16x8): SIMD.Int16x8
    fun fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Int16x8
    fun fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Int16x8
    fun fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Int16x8
    fun fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Int16x8
    fun fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Int16x8
    fun fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Int16x8
}
external interface Int8x16 {
    var constructor: Int8x16Constructor
    fun valueOf(): Int8x16
    fun toLocaleString(): String
    override fun toString(): String
}
external interface Int8x16Constructor {
    @nativeInvoke
    operator fun invoke(s0: Number? = definedExternally /* null */, s1: Number? = definedExternally /* null */, s2: Number? = definedExternally /* null */, s3: Number? = definedExternally /* null */, s4: Number? = definedExternally /* null */, s5: Number? = definedExternally /* null */, s6: Number? = definedExternally /* null */, s7: Number? = definedExternally /* null */, s8: Number? = definedExternally /* null */, s9: Number? = definedExternally /* null */, s10: Number? = definedExternally /* null */, s11: Number? = definedExternally /* null */, s12: Number? = definedExternally /* null */, s13: Number? = definedExternally /* null */, s14: Number? = definedExternally /* null */, s15: Number? = definedExternally /* null */): Int8x16
    var prototype: Int8x16
    fun extractLane(simd: SIMD.Int8x16, lane: Number): Number
    fun swizzle(a: SIMD.Int8x16, l1: Number, l2: Number, l3: Number, l4: Number, l5: Number, l6: Number, l7: Number, l8: Number, l9: Number, l10: Number, l11: Number, l12: Number, l13: Number, l14: Number, l15: Number, l16: Number): SIMD.Int8x16
    fun shuffle(a: SIMD.Int8x16, b: SIMD.Int8x16, l1: Number, l2: Number, l3: Number, l4: Number, l5: Number, l6: Number, l7: Number, l8: Number, l9: Number, l10: Number, l11: Number, l12: Number, l13: Number, l14: Number, l15: Number, l16: Number): SIMD.Int8x16
    fun check(a: SIMD.Int8x16): SIMD.Int8x16
    fun splat(n: Number): SIMD.Int8x16
    fun replaceLane(simd: SIMD.Int8x16, lane: Number, value: Number): SIMD.Int8x16
    fun select(selector: SIMD.Bool8x16, a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16
    fun equal(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16
    fun notEqual(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16
    fun lessThan(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16
    fun lessThanOrEqual(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16
    fun greaterThan(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16
    fun greaterThanOrEqual(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16
    fun and(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16
    fun or(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16
    fun xor(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16
    fun not(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16
    fun add(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16
    fun sub(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16
    fun mul(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16
    fun neg(a: SIMD.Int8x16): SIMD.Int8x16
    fun shiftLeftByScalar(a: SIMD.Int8x16, bits: Number): SIMD.Int8x16
    fun shiftRightByScalar(a: SIMD.Int8x16, bits: Number): SIMD.Int8x16
    fun addSaturate(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16
    fun subSaturate(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16
    fun load(tarray: Uint8Array, index: Number): SIMD.Int8x16
    fun load(tarray: Uint8ClampedArray, index: Number): SIMD.Int8x16
    fun load(tarray: Int16Array, index: Number): SIMD.Int8x16
    fun load(tarray: Uint16Array, index: Number): SIMD.Int8x16
    fun load(tarray: Int32Array, index: Number): SIMD.Int8x16
    fun load(tarray: Uint32Array, index: Number): SIMD.Int8x16
    fun load(tarray: Float32Array, index: Number): SIMD.Int8x16
    fun load(tarray: Float64Array, index: Number): SIMD.Int8x16
    fun store(tarray: Uint8Array, index: Number, value: SIMD.Int8x16): SIMD.Int8x16
    fun store(tarray: Uint8ClampedArray, index: Number, value: SIMD.Int8x16): SIMD.Int8x16
    fun store(tarray: Int16Array, index: Number, value: SIMD.Int8x16): SIMD.Int8x16
    fun store(tarray: Uint16Array, index: Number, value: SIMD.Int8x16): SIMD.Int8x16
    fun store(tarray: Int32Array, index: Number, value: SIMD.Int8x16): SIMD.Int8x16
    fun store(tarray: Uint32Array, index: Number, value: SIMD.Int8x16): SIMD.Int8x16
    fun store(tarray: Float32Array, index: Number, value: SIMD.Int8x16): SIMD.Int8x16
    fun store(tarray: Float64Array, index: Number, value: SIMD.Int8x16): SIMD.Int8x16
    fun fromUint8x16(value: SIMD.Uint8x16): SIMD.Int8x16
    fun fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Int8x16
    fun fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Int8x16
    fun fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Int8x16
    fun fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Int8x16
    fun fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Int8x16
    fun fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Int8x16
}
external interface Uint32x4 {
    var constructor: Uint32x4Constructor
    fun valueOf(): Uint32x4
    fun toLocaleString(): String
    override fun toString(): String
}
external interface Uint32x4Constructor {
    @nativeInvoke
    operator fun invoke(s0: Number? = definedExternally /* null */, s1: Number? = definedExternally /* null */, s2: Number? = definedExternally /* null */, s3: Number? = definedExternally /* null */): Uint32x4
    var prototype: Uint32x4
    fun extractLane(simd: SIMD.Uint32x4, lane: Number): Number
    fun swizzle(a: SIMD.Uint32x4, l1: Number, l2: Number, l3: Number, l4: Number): SIMD.Uint32x4
    fun shuffle(a: SIMD.Uint32x4, b: SIMD.Uint32x4, l1: Number, l2: Number, l3: Number, l4: Number): SIMD.Uint32x4
    fun check(a: SIMD.Uint32x4): SIMD.Uint32x4
    fun splat(n: Number): SIMD.Uint32x4
    fun replaceLane(simd: SIMD.Uint32x4, lane: Number, value: Number): SIMD.Uint32x4
    fun select(selector: SIMD.Bool32x4, a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4
    fun equal(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4
    fun notEqual(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4
    fun lessThan(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4
    fun lessThanOrEqual(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4
    fun greaterThan(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4
    fun greaterThanOrEqual(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4
    fun and(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4
    fun or(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4
    fun xor(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4
    fun not(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4
    fun add(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4
    fun sub(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4
    fun mul(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4
    fun shiftLeftByScalar(a: SIMD.Uint32x4, bits: Number): SIMD.Uint32x4
    fun shiftRightByScalar(a: SIMD.Uint32x4, bits: Number): SIMD.Uint32x4
    fun load(tarray: Uint8Array, index: Number): SIMD.Uint32x4
    fun load(tarray: Uint8ClampedArray, index: Number): SIMD.Uint32x4
    fun load(tarray: Int16Array, index: Number): SIMD.Uint32x4
    fun load(tarray: Uint16Array, index: Number): SIMD.Uint32x4
    fun load(tarray: Int32Array, index: Number): SIMD.Uint32x4
    fun load(tarray: Uint32Array, index: Number): SIMD.Uint32x4
    fun load(tarray: Float32Array, index: Number): SIMD.Uint32x4
    fun load(tarray: Float64Array, index: Number): SIMD.Uint32x4
    fun load1(tarray: Uint8Array, index: Number): SIMD.Uint32x4
    fun load1(tarray: Uint8ClampedArray, index: Number): SIMD.Uint32x4
    fun load1(tarray: Int16Array, index: Number): SIMD.Uint32x4
    fun load1(tarray: Uint16Array, index: Number): SIMD.Uint32x4
    fun load1(tarray: Int32Array, index: Number): SIMD.Uint32x4
    fun load1(tarray: Uint32Array, index: Number): SIMD.Uint32x4
    fun load1(tarray: Float32Array, index: Number): SIMD.Uint32x4
    fun load1(tarray: Float64Array, index: Number): SIMD.Uint32x4
    fun load2(tarray: Uint8Array, index: Number): SIMD.Uint32x4
    fun load2(tarray: Uint8ClampedArray, index: Number): SIMD.Uint32x4
    fun load2(tarray: Int16Array, index: Number): SIMD.Uint32x4
    fun load2(tarray: Uint16Array, index: Number): SIMD.Uint32x4
    fun load2(tarray: Int32Array, index: Number): SIMD.Uint32x4
    fun load2(tarray: Uint32Array, index: Number): SIMD.Uint32x4
    fun load2(tarray: Float32Array, index: Number): SIMD.Uint32x4
    fun load2(tarray: Float64Array, index: Number): SIMD.Uint32x4
    fun load3(tarray: Uint8Array, index: Number): SIMD.Uint32x4
    fun load3(tarray: Uint8ClampedArray, index: Number): SIMD.Uint32x4
    fun load3(tarray: Int16Array, index: Number): SIMD.Uint32x4
    fun load3(tarray: Uint16Array, index: Number): SIMD.Uint32x4
    fun load3(tarray: Int32Array, index: Number): SIMD.Uint32x4
    fun load3(tarray: Uint32Array, index: Number): SIMD.Uint32x4
    fun load3(tarray: Float32Array, index: Number): SIMD.Uint32x4
    fun load3(tarray: Float64Array, index: Number): SIMD.Uint32x4
    fun store(tarray: Uint8Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store(tarray: Uint8ClampedArray, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store(tarray: Int16Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store(tarray: Uint16Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store(tarray: Int32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store(tarray: Uint32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store(tarray: Float32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store(tarray: Float64Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store1(tarray: Uint8Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store1(tarray: Uint8ClampedArray, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store1(tarray: Int16Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store1(tarray: Uint16Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store1(tarray: Int32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store1(tarray: Uint32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store1(tarray: Float32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store1(tarray: Float64Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store2(tarray: Uint8Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store2(tarray: Uint8ClampedArray, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store2(tarray: Int16Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store2(tarray: Uint16Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store2(tarray: Int32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store2(tarray: Uint32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store2(tarray: Float32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store2(tarray: Float64Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store3(tarray: Uint8Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store3(tarray: Uint8ClampedArray, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store3(tarray: Int16Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store3(tarray: Uint16Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store3(tarray: Int32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store3(tarray: Uint32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store3(tarray: Float32Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun store3(tarray: Float64Array, index: Number, value: SIMD.Uint32x4): SIMD.Uint32x4
    fun fromFloat32x4(value: SIMD.Float32x4): SIMD.Uint32x4
    fun fromInt32x4(value: SIMD.Int32x4): SIMD.Uint32x4
    fun fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Uint32x4
    fun fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Uint32x4
    fun fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Uint32x4
    fun fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Uint32x4
    fun fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Uint32x4
    fun fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Uint32x4
}
external interface Uint16x8 {
    var constructor: Uint16x8Constructor
    fun valueOf(): Uint16x8
    fun toLocaleString(): String
    override fun toString(): String
}
external interface Uint16x8Constructor {
    @nativeInvoke
    operator fun invoke(s0: Number? = definedExternally /* null */, s1: Number? = definedExternally /* null */, s2: Number? = definedExternally /* null */, s3: Number? = definedExternally /* null */, s4: Number? = definedExternally /* null */, s5: Number? = definedExternally /* null */, s6: Number? = definedExternally /* null */, s7: Number? = definedExternally /* null */): Uint16x8
    var prototype: Uint16x8
    fun extractLane(simd: SIMD.Uint16x8, lane: Number): Number
    fun swizzle(a: SIMD.Uint16x8, l1: Number, l2: Number, l3: Number, l4: Number, l5: Number, l6: Number, l7: Number, l8: Number): SIMD.Uint16x8
    fun shuffle(a: SIMD.Uint16x8, b: SIMD.Uint16x8, l1: Number, l2: Number, l3: Number, l4: Number, l5: Number, l6: Number, l7: Number, l8: Number): SIMD.Uint16x8
    fun check(a: SIMD.Uint16x8): SIMD.Uint16x8
    fun splat(n: Number): SIMD.Uint16x8
    fun replaceLane(simd: SIMD.Uint16x8, lane: Number, value: Number): SIMD.Uint16x8
    fun select(selector: SIMD.Bool16x8, a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8
    fun equal(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8
    fun notEqual(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8
    fun lessThan(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8
    fun lessThanOrEqual(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8
    fun greaterThan(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8
    fun greaterThanOrEqual(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8
    fun and(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8
    fun or(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8
    fun xor(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8
    fun not(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8
    fun add(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8
    fun sub(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8
    fun mul(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8
    fun shiftLeftByScalar(a: SIMD.Uint16x8, bits: Number): SIMD.Uint16x8
    fun shiftRightByScalar(a: SIMD.Uint16x8, bits: Number): SIMD.Uint16x8
    fun addSaturate(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8
    fun subSaturate(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8
    fun load(tarray: Uint8Array, index: Number): SIMD.Uint16x8
    fun load(tarray: Uint8ClampedArray, index: Number): SIMD.Uint16x8
    fun load(tarray: Int16Array, index: Number): SIMD.Uint16x8
    fun load(tarray: Uint16Array, index: Number): SIMD.Uint16x8
    fun load(tarray: Int32Array, index: Number): SIMD.Uint16x8
    fun load(tarray: Uint32Array, index: Number): SIMD.Uint16x8
    fun load(tarray: Float32Array, index: Number): SIMD.Uint16x8
    fun load(tarray: Float64Array, index: Number): SIMD.Uint16x8
    fun store(tarray: Uint8Array, index: Number, value: SIMD.Uint16x8): SIMD.Uint16x8
    fun store(tarray: Uint8ClampedArray, index: Number, value: SIMD.Uint16x8): SIMD.Uint16x8
    fun store(tarray: Int16Array, index: Number, value: SIMD.Uint16x8): SIMD.Uint16x8
    fun store(tarray: Uint16Array, index: Number, value: SIMD.Uint16x8): SIMD.Uint16x8
    fun store(tarray: Int32Array, index: Number, value: SIMD.Uint16x8): SIMD.Uint16x8
    fun store(tarray: Uint32Array, index: Number, value: SIMD.Uint16x8): SIMD.Uint16x8
    fun store(tarray: Float32Array, index: Number, value: SIMD.Uint16x8): SIMD.Uint16x8
    fun store(tarray: Float64Array, index: Number, value: SIMD.Uint16x8): SIMD.Uint16x8
    fun fromInt16x8(value: SIMD.Int16x8): SIMD.Uint16x8
    fun fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Uint16x8
    fun fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Uint16x8
    fun fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Uint16x8
    fun fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Uint16x8
    fun fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Uint16x8
    fun fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Uint16x8
}
external interface Uint8x16 {
    var constructor: Uint8x16Constructor
    fun valueOf(): Uint8x16
    fun toLocaleString(): String
    override fun toString(): String
}
external interface Uint8x16Constructor {
    @nativeInvoke
    operator fun invoke(s0: Number? = definedExternally /* null */, s1: Number? = definedExternally /* null */, s2: Number? = definedExternally /* null */, s3: Number? = definedExternally /* null */, s4: Number? = definedExternally /* null */, s5: Number? = definedExternally /* null */, s6: Number? = definedExternally /* null */, s7: Number? = definedExternally /* null */, s8: Number? = definedExternally /* null */, s9: Number? = definedExternally /* null */, s10: Number? = definedExternally /* null */, s11: Number? = definedExternally /* null */, s12: Number? = definedExternally /* null */, s13: Number? = definedExternally /* null */, s14: Number? = definedExternally /* null */, s15: Number? = definedExternally /* null */): Uint8x16
    var prototype: Uint8x16
    fun extractLane(simd: SIMD.Uint8x16, lane: Number): Number
    fun swizzle(a: SIMD.Uint8x16, l1: Number, l2: Number, l3: Number, l4: Number, l5: Number, l6: Number, l7: Number, l8: Number, l9: Number, l10: Number, l11: Number, l12: Number, l13: Number, l14: Number, l15: Number, l16: Number): SIMD.Uint8x16
    fun shuffle(a: SIMD.Uint8x16, b: SIMD.Uint8x16, l1: Number, l2: Number, l3: Number, l4: Number, l5: Number, l6: Number, l7: Number, l8: Number, l9: Number, l10: Number, l11: Number, l12: Number, l13: Number, l14: Number, l15: Number, l16: Number): SIMD.Uint8x16
    fun check(a: SIMD.Uint8x16): SIMD.Uint8x16
    fun splat(n: Number): SIMD.Uint8x16
    fun replaceLane(simd: SIMD.Uint8x16, lane: Number, value: Number): SIMD.Uint8x16
    fun select(selector: SIMD.Bool8x16, a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16
    fun equal(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16
    fun notEqual(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16
    fun lessThan(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16
    fun lessThanOrEqual(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16
    fun greaterThan(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16
    fun greaterThanOrEqual(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16
    fun and(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16
    fun or(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16
    fun xor(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16
    fun not(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16
    fun add(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16
    fun sub(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16
    fun mul(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16
    fun shiftLeftByScalar(a: SIMD.Uint8x16, bits: Number): SIMD.Uint8x16
    fun shiftRightByScalar(a: SIMD.Uint8x16, bits: Number): SIMD.Uint8x16
    fun addSaturate(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16
    fun subSaturate(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16
    fun load(tarray: Uint8Array, index: Number): SIMD.Uint8x16
    fun load(tarray: Uint8ClampedArray, index: Number): SIMD.Uint8x16
    fun load(tarray: Int16Array, index: Number): SIMD.Uint8x16
    fun load(tarray: Uint16Array, index: Number): SIMD.Uint8x16
    fun load(tarray: Int32Array, index: Number): SIMD.Uint8x16
    fun load(tarray: Uint32Array, index: Number): SIMD.Uint8x16
    fun load(tarray: Float32Array, index: Number): SIMD.Uint8x16
    fun load(tarray: Float64Array, index: Number): SIMD.Uint8x16
    fun store(tarray: Uint8Array, index: Number, value: SIMD.Uint8x16): SIMD.Uint8x16
    fun store(tarray: Uint8ClampedArray, index: Number, value: SIMD.Uint8x16): SIMD.Uint8x16
    fun store(tarray: Int16Array, index: Number, value: SIMD.Uint8x16): SIMD.Uint8x16
    fun store(tarray: Uint16Array, index: Number, value: SIMD.Uint8x16): SIMD.Uint8x16
    fun store(tarray: Int32Array, index: Number, value: SIMD.Uint8x16): SIMD.Uint8x16
    fun store(tarray: Uint32Array, index: Number, value: SIMD.Uint8x16): SIMD.Uint8x16
    fun store(tarray: Float32Array, index: Number, value: SIMD.Uint8x16): SIMD.Uint8x16
    fun store(tarray: Float64Array, index: Number, value: SIMD.Uint8x16): SIMD.Uint8x16
    fun fromInt8x16(value: SIMD.Int8x16): SIMD.Uint8x16
    fun fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Uint8x16
    fun fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Uint8x16
    fun fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Uint8x16
    fun fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Uint8x16
    fun fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Uint8x16
    fun fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Uint8x16
}
external interface Bool32x4 {
    var constructor: Bool32x4Constructor
    fun valueOf(): Bool32x4
    fun toLocaleString(): String
    override fun toString(): String
}
external interface Bool32x4Constructor {
    @nativeInvoke
    operator fun invoke(s0: Boolean? = definedExternally /* null */, s1: Boolean? = definedExternally /* null */, s2: Boolean? = definedExternally /* null */, s3: Boolean? = definedExternally /* null */): Bool32x4
    var prototype: Bool32x4
    fun extractLane(simd: SIMD.Bool32x4, lane: Number): Boolean
    fun check(a: SIMD.Bool32x4): SIMD.Bool32x4
    fun splat(n: Boolean): SIMD.Bool32x4
    fun replaceLane(simd: SIMD.Bool32x4, lane: Number, value: Boolean): SIMD.Bool32x4
    fun allTrue(a: SIMD.Bool32x4): Boolean
    fun anyTrue(a: SIMD.Bool32x4): Boolean
    fun and(a: SIMD.Bool32x4, b: SIMD.Bool32x4): SIMD.Bool32x4
    fun or(a: SIMD.Bool32x4, b: SIMD.Bool32x4): SIMD.Bool32x4
    fun xor(a: SIMD.Bool32x4, b: SIMD.Bool32x4): SIMD.Bool32x4
    fun not(a: SIMD.Bool32x4, b: SIMD.Bool32x4): SIMD.Bool32x4
}
external interface Bool16x8 {
    var constructor: Bool16x8Constructor
    fun valueOf(): Bool16x8
    fun toLocaleString(): String
    override fun toString(): String
}
external interface Bool16x8Constructor {
    @nativeInvoke
    operator fun invoke(s0: Boolean? = definedExternally /* null */, s1: Boolean? = definedExternally /* null */, s2: Boolean? = definedExternally /* null */, s3: Boolean? = definedExternally /* null */, s4: Boolean? = definedExternally /* null */, s5: Boolean? = definedExternally /* null */, s6: Boolean? = definedExternally /* null */, s7: Boolean? = definedExternally /* null */): Bool16x8
    var prototype: Bool16x8
    fun extractLane(simd: SIMD.Bool16x8, lane: Number): Boolean
    fun check(a: SIMD.Bool16x8): SIMD.Bool16x8
    fun splat(n: Boolean): SIMD.Bool16x8
    fun replaceLane(simd: SIMD.Bool16x8, lane: Number, value: Boolean): SIMD.Bool16x8
    fun allTrue(a: SIMD.Bool16x8): Boolean
    fun anyTrue(a: SIMD.Bool16x8): Boolean
    fun and(a: SIMD.Bool16x8, b: SIMD.Bool16x8): SIMD.Bool16x8
    fun or(a: SIMD.Bool16x8, b: SIMD.Bool16x8): SIMD.Bool16x8
    fun xor(a: SIMD.Bool16x8, b: SIMD.Bool16x8): SIMD.Bool16x8
    fun not(a: SIMD.Bool16x8, b: SIMD.Bool16x8): SIMD.Bool16x8
}
external interface Bool8x16 {
    var constructor: Bool8x16Constructor
    fun valueOf(): Bool8x16
    fun toLocaleString(): String
    override fun toString(): String
}
external interface Bool8x16Constructor {
    @nativeInvoke
    operator fun invoke(s0: Boolean? = definedExternally /* null */, s1: Boolean? = definedExternally /* null */, s2: Boolean? = definedExternally /* null */, s3: Boolean? = definedExternally /* null */, s4: Boolean? = definedExternally /* null */, s5: Boolean? = definedExternally /* null */, s6: Boolean? = definedExternally /* null */, s7: Boolean? = definedExternally /* null */, s8: Boolean? = definedExternally /* null */, s9: Boolean? = definedExternally /* null */, s10: Boolean? = definedExternally /* null */, s11: Boolean? = definedExternally /* null */, s12: Boolean? = definedExternally /* null */, s13: Boolean? = definedExternally /* null */, s14: Boolean? = definedExternally /* null */, s15: Boolean? = definedExternally /* null */): Bool8x16
    var prototype: Bool8x16
    fun extractLane(simd: SIMD.Bool8x16, lane: Number): Boolean
    fun check(a: SIMD.Bool8x16): SIMD.Bool8x16
    fun splat(n: Boolean): SIMD.Bool8x16
    fun replaceLane(simd: SIMD.Bool8x16, lane: Number, value: Boolean): SIMD.Bool8x16
    fun allTrue(a: SIMD.Bool8x16): Boolean
    fun anyTrue(a: SIMD.Bool8x16): Boolean
    fun and(a: SIMD.Bool8x16, b: SIMD.Bool8x16): SIMD.Bool8x16
    fun or(a: SIMD.Bool8x16, b: SIMD.Bool8x16): SIMD.Bool8x16
    fun xor(a: SIMD.Bool8x16, b: SIMD.Bool8x16): SIMD.Bool8x16
    fun not(a: SIMD.Bool8x16, b: SIMD.Bool8x16): SIMD.Bool8x16
}
