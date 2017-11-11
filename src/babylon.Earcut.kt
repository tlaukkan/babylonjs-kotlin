@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("Earcut")
package Earcut

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

external fun earcut(data: Array<Number>, holeIndices: Array<Number>, dim: Number): Array<Any> = definedExternally
external fun deviation(data: Array<Number>, holeIndices: Array<Number>, dim: Number, triangles: Array<Number>): Number = definedExternally
external interface `T$81` {
    var vertices: Array<Any>
    var holes: Array<Any>
    var dimensions: Number
}
external fun flatten(data: Array<Array<Array<Number>>>): `T$81` = definedExternally
