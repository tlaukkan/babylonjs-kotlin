@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("BABYLON.Debug")
package BABYLON.Debug

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

external open class AxesViewer(scene: Scene, scaleLines: Number? = definedExternally /* null */) {
    open var _xline: Any = definedExternally
    open var _yline: Any = definedExternally
    open var _zline: Any = definedExternally
    open var _xmesh: Any = definedExternally
    open var _ymesh: Any = definedExternally
    open var _zmesh: Any = definedExternally
    open var scene: Scene = definedExternally
    open var scaleLines: Number = definedExternally
    open fun update(position: Vector3, xaxis: Vector3, yaxis: Vector3, zaxis: Vector3): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class BoneAxesViewer(scene: Scene, bone: Bone, mesh: Mesh, scaleLines: Number? = definedExternally /* null */) : AxesViewer {
    open var mesh: Mesh = definedExternally
    open var bone: Bone = definedExternally
    open var pos: Vector3 = definedExternally
    open var xaxis: Vector3 = definedExternally
    open var yaxis: Vector3 = definedExternally
    open var zaxis: Vector3 = definedExternally
    open fun update(): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
}
external open class PhysicsViewer(scene: Scene) {
    open var _impostors: Array<PhysicsImpostor> = definedExternally
    open var _meshes: Array<AbstractMesh> = definedExternally
    open var _scene: Scene = definedExternally
    open var _numMeshes: Number = definedExternally
    open var _physicsEnginePlugin: IPhysicsEnginePlugin = definedExternally
    open var _renderFunction: Any = definedExternally
    open var _debugBoxMesh: Any = definedExternally
    open var _debugSphereMesh: Any = definedExternally
    open var _debugMaterial: Any = definedExternally
    open fun _updateDebugMeshes(): Unit = definedExternally
    open fun showImpostor(impostor: PhysicsImpostor): Unit = definedExternally
    open fun hideImpostor(impostor: PhysicsImpostor): Unit = definedExternally
    open fun _getDebugMaterial(scene: Any): Unit = definedExternally
    open fun _getDebugBoxMesh(scene: Any): Unit = definedExternally
    open fun _getDebugSphereMesh(scene: Any): Unit = definedExternally
    open fun _getDebugMesh(impostor: Any, scene: Any): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class SkeletonViewer(skeleton: Skeleton, mesh: AbstractMesh, scene: Scene, autoUpdateBonesMatrices: Boolean? = definedExternally /* null */, renderingGroupId: Number? = definedExternally /* null */) {
    open var skeleton: Skeleton = definedExternally
    open var mesh: AbstractMesh = definedExternally
    open var autoUpdateBonesMatrices: Boolean = definedExternally
    open var renderingGroupId: Number = definedExternally
    open var color: Color3 = definedExternally
    open var _scene: Any = definedExternally
    open var _debugLines: Any = definedExternally
    open var _debugMesh: Any = definedExternally
    open var _isEnabled: Any = definedExternally
    open var _renderFunction: Any = definedExternally
    open var isEnabled: Boolean = definedExternally
    open fun _getBonePosition(position: Any, bone: Any, meshMat: Any, x: Any? = definedExternally /* null */, y: Any? = definedExternally /* null */, z: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _getLinesForBonesWithLength(bones: Any, meshMat: Any): Unit = definedExternally
    open fun _getLinesForBonesNoLength(bones: Any, meshMat: Any): Unit = definedExternally
    open fun update(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
