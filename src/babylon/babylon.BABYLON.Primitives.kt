@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("BABYLON.Primitives")
package BABYLON.Primitives

import BABYLON.*
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

external open class _Primitive(id: String, scene: Scene, _canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */) : Geometry {
    open var _canBeRegenerated: Any = definedExternally
    open var _beingRegenerated: Any = definedExternally
    open fun canBeRegenerated(): Boolean = definedExternally
    open fun regenerate(): Unit = definedExternally
    open fun asNewGeometry(id: String): Geometry = definedExternally
    override fun setAllVerticesData(vertexData: VertexData, updatable: Boolean?): Unit = definedExternally
    override fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean?): Unit = definedExternally
    override fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean?): Unit = definedExternally
    open fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
    override fun serialize(): Any = definedExternally
}
external open class Ribbon(id: String, scene: Scene, pathArray: Array<Array<Vector3>>, closeArray: Boolean, closePath: Boolean, offset: Number, canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */, side: Number? = definedExternally /* null */) : _Primitive {
    open var pathArray: Array<Array<Vector3>> = definedExternally
    open var closeArray: Boolean = definedExternally
    open var closePath: Boolean = definedExternally
    open var offset: Number = definedExternally
    open var side: Number = definedExternally
    override fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
}
external open class Box(id: String, scene: Scene, size: Number, canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */, side: Number? = definedExternally /* null */) : _Primitive {
    open var size: Number = definedExternally
    open var side: Number = definedExternally
    override fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(parsedBox: Any, scene: Scene): Box = definedExternally
    }
}
external open class Sphere(id: String, scene: Scene, segments: Number, diameter: Number, canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */, side: Number? = definedExternally /* null */) : _Primitive {
    open var segments: Number = definedExternally
    open var diameter: Number = definedExternally
    open var side: Number = definedExternally
    override fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(parsedSphere: Any, scene: Scene): BABYLON.Primitives.Sphere = definedExternally
    }
}
external open class Disc(id: String, scene: Scene, radius: Number, tessellation: Number, canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */, side: Number? = definedExternally /* null */) : _Primitive {
    open var radius: Number = definedExternally
    open var tessellation: Number = definedExternally
    open var side: Number = definedExternally
    override fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
}
external open class Cylinder(id: String, scene: Scene, height: Number, diameterTop: Number, diameterBottom: Number, tessellation: Number, subdivisions: Number? = definedExternally /* null */, canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */, side: Number? = definedExternally /* null */) : _Primitive {
    open var height: Number = definedExternally
    open var diameterTop: Number = definedExternally
    open var diameterBottom: Number = definedExternally
    open var tessellation: Number = definedExternally
    open var subdivisions: Number = definedExternally
    open var side: Number = definedExternally
    override fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(parsedCylinder: Any, scene: Scene): BABYLON.Primitives.Cylinder = definedExternally
    }
}
external open class Torus(id: String, scene: Scene, diameter: Number, thickness: Number, tessellation: Number, canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */, side: Number? = definedExternally /* null */) : _Primitive {
    open var diameter: Number = definedExternally
    open var thickness: Number = definedExternally
    open var tessellation: Number = definedExternally
    open var side: Number = definedExternally
    override fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(parsedTorus: Any, scene: Scene): BABYLON.Primitives.Torus = definedExternally
    }
}
external open class Ground(id: String, scene: Scene, width: Number, height: Number, subdivisions: Number, canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */) : _Primitive {
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var subdivisions: Number = definedExternally
    override fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(parsedGround: Any, scene: Scene): BABYLON.Primitives.Ground = definedExternally
    }
}
external interface `T$26` {
    var w: Number
    var h: Number
}
external open class TiledGround(id: String, scene: Scene, xmin: Number, zmin: Number, xmax: Number, zmax: Number, subdivisions: `T$26`, precision: `T$26`, canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */) : _Primitive {
    open var xmin: Number = definedExternally
    open var zmin: Number = definedExternally
    open var xmax: Number = definedExternally
    open var zmax: Number = definedExternally
    open var subdivisions: `T$26` = definedExternally
    open var precision: `T$26` = definedExternally
    override fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
}
external open class Plane(id: String, scene: Scene, size: Number, canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */, side: Number? = definedExternally /* null */) : _Primitive {
    open var size: Number = definedExternally
    open var side: Number = definedExternally
    override fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(parsedPlane: Any, scene: Scene): BABYLON.Primitives.Plane = definedExternally
    }
}
external open class TorusKnot(id: String, scene: Scene, radius: Number, tube: Number, radialSegments: Number, tubularSegments: Number, p: Number, q: Number, canBeRegenerated: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */, side: Number? = definedExternally /* null */) : _Primitive {
    open var radius: Number = definedExternally
    open var tube: Number = definedExternally
    open var radialSegments: Number = definedExternally
    open var tubularSegments: Number = definedExternally
    open var p: Number = definedExternally
    open var q: Number = definedExternally
    open var side: Number = definedExternally
    override fun _regenerateVertexData(): VertexData = definedExternally
    override fun copy(id: String): Geometry = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(parsedTorusKnot: Any, scene: Scene): BABYLON.Primitives.TorusKnot = definedExternally
    }
}
