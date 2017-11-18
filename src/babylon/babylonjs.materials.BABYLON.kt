@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("BABYLON")
package BABYLON

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

external open class ShadowOnlyMaterial(name: String, scene: Scene) : PushMaterial {
    open var _renderId: Any = definedExternally
    open var _activeLight: Any = definedExternally
    override fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open var activeLight: IShadowLight = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    override open fun clone(name: String): ShadowOnlyMaterial = definedExternally
    override  fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): ShadowOnlyMaterial = definedExternally
    }
}
external open class GradientMaterial(name: String, scene: Scene) : PushMaterial {
    open var _maxSimultaneousLights: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var topColor: Color3 = definedExternally
    open var topColorAlpha: Number = definedExternally
    open var bottomColor: Color3 = definedExternally
    open var bottomColorAlpha: Number = definedExternally
    open var offset: Number = definedExternally
    open var smoothness: Number = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var _scaledDiffuse: Any = definedExternally
    open var _renderId: Any = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): GradientMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): GradientMaterial = definedExternally
    }
}
external open class NormalMaterial(name: String, scene: Scene) : PushMaterial {
    open var _diffuseTexture: Any = definedExternally
    open var diffuseTexture: BaseTexture = definedExternally
    open var diffuseColor: Color3 = definedExternally
    open var _disableLighting: Any = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var _maxSimultaneousLights: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var _renderId: Any = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override open fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): NormalMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): NormalMaterial = definedExternally
    }
}
external open class LavaMaterial(name: String, scene: Scene) : PushMaterial {
    open var _diffuseTexture: Any = definedExternally
    open var diffuseTexture: BaseTexture = definedExternally
    open var noiseTexture: BaseTexture = definedExternally
    open var fogColor: Color3 = definedExternally
    open var speed: Number = definedExternally
    open var movingSpeed: Number = definedExternally
    open var lowFrequencySpeed: Number = definedExternally
    open var fogDensity: Number = definedExternally
    open var _lastTime: Any = definedExternally
    open var diffuseColor: Color3 = definedExternally
    open var _disableLighting: Any = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var _maxSimultaneousLights: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var _scaledDiffuse: Any = definedExternally
    open var _renderId: Any = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override open fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): LavaMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): LavaMaterial = definedExternally
    }
}
external open class SimpleMaterial(name: String, scene: Scene) : PushMaterial {
    open var _diffuseTexture: Any = definedExternally
    open var diffuseTexture: BaseTexture = definedExternally
    open var diffuseColor: Color3 = definedExternally
    open var _disableLighting: Any = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var _maxSimultaneousLights: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var _renderId: Any = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override open fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): SimpleMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): SimpleMaterial = definedExternally
    }
}
external open class WaterMaterial(name: String, scene: Scene, renderTargetSize: Vector2? = definedExternally /* null */) : PushMaterial {
    open var renderTargetSize: Vector2 = definedExternally
    open var _bumpTexture: Any = definedExternally
    open var bumpTexture: BaseTexture = definedExternally
    open var diffuseColor: Color3 = definedExternally
    open var specularColor: Color3 = definedExternally
    open var specularPower: Number = definedExternally
    open var _disableLighting: Any = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var _maxSimultaneousLights: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var windForce: Number = definedExternally
    open var windDirection: Vector2 = definedExternally
    open var waveHeight: Number = definedExternally
    open var bumpHeight: Number = definedExternally
    open var _bumpSuperimpose: Any = definedExternally
    open var bumpSuperimpose: Boolean = definedExternally
    open var _fresnelSeparate: Any = definedExternally
    open var fresnelSeparate: Boolean = definedExternally
    open var _bumpAffectsReflection: Any = definedExternally
    open var bumpAffectsReflection: Boolean = definedExternally
    open var waterColor: Color3 = definedExternally
    open var colorBlendFactor: Number = definedExternally
    open var waterColor2: Color3 = definedExternally
    open var colorBlendFactor2: Number = definedExternally
    open var waveLength: Number = definedExternally
    open var waveSpeed: Number = definedExternally
    open var _renderTargets: SmartArray<RenderTargetTexture> = definedExternally
    open var _mesh: Any = definedExternally
    open var _refractionRTT: Any = definedExternally
    open var _reflectionRTT: Any = definedExternally
    open var _reflectionTransform: Any = definedExternally
    open var _lastTime: Any = definedExternally
    open var _lastDeltaTime: Any = definedExternally
    open var _renderId: Any = definedExternally
    open var _useLogarithmicDepth: Any = definedExternally
    open var useLogarithmicDepth: Boolean = definedExternally
    open var refractionTexture: RenderTargetTexture = definedExternally
    open var reflectionTexture: RenderTargetTexture = definedExternally
    open fun addToRenderList(node: Any): Unit = definedExternally
    open fun enableRenderTargets(enable: Boolean): Unit = definedExternally
    open fun getRenderList(): Array<AbstractMesh>? = definedExternally
    open var renderTargetsEnabled: Boolean = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun _createRenderTargets(scene: Any, renderTargetSize: Any): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override open fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): WaterMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): WaterMaterial = definedExternally
        fun CreateDefaultMesh(name: String, scene: Scene): Mesh = definedExternally
    }
}
external open class FireMaterial(name: String, scene: Scene) : PushMaterial {
    open var _diffuseTexture: Any = definedExternally
    open var diffuseTexture: BaseTexture? = definedExternally
    open var _distortionTexture: Any = definedExternally
    open var distortionTexture: BaseTexture? = definedExternally
    open var _opacityTexture: Any = definedExternally
    open var opacityTexture: BaseTexture? = definedExternally
    open var diffuseColor: Color3 = definedExternally
    open var speed: Number = definedExternally
    open var _scaledDiffuse: Any = definedExternally
    open var _renderId: Any = definedExternally
    open var _lastTime: Any = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override open fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    override open fun getClassName(): String = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): FireMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): FireMaterial = definedExternally
    }
}
external open class FurMaterial(name: String, scene: Scene) : PushMaterial {
    open var _diffuseTexture: Any = definedExternally
    open var diffuseTexture: BaseTexture = definedExternally
    open var _heightTexture: Any = definedExternally
    open var heightTexture: BaseTexture = definedExternally
    open var diffuseColor: Color3 = definedExternally
    open var furLength: Number = definedExternally
    open var furAngle: Number = definedExternally
    open var furColor: Color3 = definedExternally
    open var furOffset: Number = definedExternally
    open var furSpacing: Number = definedExternally
    open var furGravity: Vector3 = definedExternally
    open var furSpeed: Number = definedExternally
    open var furDensity: Number = definedExternally
    open var furTexture: DynamicTexture = definedExternally
    open var _disableLighting: Any = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var _maxSimultaneousLights: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var highLevelFur: Boolean = definedExternally
    open var _meshes: Array<AbstractMesh> = definedExternally
    open var _renderId: Any = definedExternally
    open var _furTime: Any = definedExternally
    open var furTime: Number = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun updateFur(): Unit = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override open fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): FurMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): FurMaterial = definedExternally
        fun GenerateTexture(name: String, scene: Scene): DynamicTexture = definedExternally
        fun FurifyMesh(sourceMesh: Mesh, quality: Number): Array<Mesh> = definedExternally
    }
}
external open class TerrainMaterial(name: String, scene: Scene) : PushMaterial {
    open var _mixTexture: Any = definedExternally
    open var mixTexture: BaseTexture = definedExternally
    open var _diffuseTexture1: Any = definedExternally
    open var diffuseTexture1: Texture = definedExternally
    open var _diffuseTexture2: Any = definedExternally
    open var diffuseTexture2: Texture = definedExternally
    open var _diffuseTexture3: Any = definedExternally
    open var diffuseTexture3: Texture = definedExternally
    open var _bumpTexture1: Any = definedExternally
    open var bumpTexture1: Texture = definedExternally
    open var _bumpTexture2: Any = definedExternally
    open var bumpTexture2: Texture = definedExternally
    open var _bumpTexture3: Any = definedExternally
    open var bumpTexture3: Texture = definedExternally
    open var diffuseColor: Color3 = definedExternally
    open var specularColor: Color3 = definedExternally
    open var specularPower: Number = definedExternally
    open var _disableLighting: Any = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var _maxSimultaneousLights: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var _renderId: Any = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override open fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): TerrainMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): TerrainMaterial = definedExternally
    }
}
external open class TriPlanarMaterial(name: String, scene: Scene) : PushMaterial {
    open var mixTexture: BaseTexture = definedExternally
    open var _diffuseTextureX: Any = definedExternally
    open var diffuseTextureX: BaseTexture = definedExternally
    open var _diffuseTextureY: Any = definedExternally
    open var diffuseTextureY: BaseTexture = definedExternally
    open var _diffuseTextureZ: Any = definedExternally
    open var diffuseTextureZ: BaseTexture = definedExternally
    open var _normalTextureX: Any = definedExternally
    open var normalTextureX: BaseTexture = definedExternally
    open var _normalTextureY: Any = definedExternally
    open var normalTextureY: BaseTexture = definedExternally
    open var _normalTextureZ: Any = definedExternally
    open var normalTextureZ: BaseTexture = definedExternally
    open var tileSize: Number = definedExternally
    open var diffuseColor: Color3 = definedExternally
    open var specularColor: Color3 = definedExternally
    open var specularPower: Number = definedExternally
    open var _disableLighting: Any = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var _maxSimultaneousLights: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var _renderId: Any = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override open fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): TriPlanarMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): TriPlanarMaterial = definedExternally
    }
}
external open class SkyMaterial(name: String, scene: Scene) : PushMaterial {
    open var luminance: Number = definedExternally
    open var turbidity: Number = definedExternally
    open var rayleigh: Number = definedExternally
    open var mieCoefficient: Number = definedExternally
    open var mieDirectionalG: Number = definedExternally
    open var distance: Number = definedExternally
    open var inclination: Number = definedExternally
    open var azimuth: Number = definedExternally
    open var sunPosition: Vector3 = definedExternally
    open var useSunPosition: Boolean = definedExternally
    open var _cameraPosition: Any = definedExternally
    open var _renderId: Any = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): SkyMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): SkyMaterial = definedExternally
    }
}
external open class GridMaterial(name: String, scene: Scene) : BABYLON.PushMaterial {
    open var mainColor: Color3 = definedExternally
    open var lineColor: Color3 = definedExternally
    open var gridRatio: Number = definedExternally
    open var gridOffset: Vector3 = definedExternally
    open var majorUnitFrequency: Number = definedExternally
    open var minorUnitVisibility: Number = definedExternally
    open var opacity: Number = definedExternally
    open var preMultiplyAlpha: Boolean = definedExternally
    open var _gridControl: Any = definedExternally
    open var _renderId: Any = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    open fun needAlphaBlendingForMesh(mesh: AbstractMesh): Boolean = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun clone(name: String): GridMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    override open fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): GridMaterial = definedExternally
    }
}
external open class StandardMaterialDefines_OldVer : MaterialDefines, IImageProcessingConfigurationDefines {
    open var DIFFUSE: Boolean = definedExternally
    open var AMBIENT: Boolean = definedExternally
    open var OPACITY: Boolean = definedExternally
    open var OPACITYRGB: Boolean = definedExternally
    open var REFLECTION: Boolean = definedExternally
    open var EMISSIVE: Boolean = definedExternally
    open var SPECULAR: Boolean = definedExternally
    open var BUMP: Boolean = definedExternally
    open var PARALLAX: Boolean = definedExternally
    open var PARALLAXOCCLUSION: Boolean = definedExternally
    open var SPECULAROVERALPHA: Boolean = definedExternally
    open var CLIPPLANE: Boolean = definedExternally
    open var ALPHATEST: Boolean = definedExternally
    open var ALPHAFROMDIFFUSE: Boolean = definedExternally
    open var POINTSIZE: Boolean = definedExternally
    open var FOG: Boolean = definedExternally
    open var SPECULARTERM: Boolean = definedExternally
    open var DIFFUSEFRESNEL: Boolean = definedExternally
    open var OPACITYFRESNEL: Boolean = definedExternally
    open var REFLECTIONFRESNEL: Boolean = definedExternally
    open var REFRACTIONFRESNEL: Boolean = definedExternally
    open var EMISSIVEFRESNEL: Boolean = definedExternally
    open var FRESNEL: Boolean = definedExternally
    open var NORMAL: Boolean = definedExternally
    open var UV1: Boolean = definedExternally
    open var UV2: Boolean = definedExternally
    open var VERTEXCOLOR: Boolean = definedExternally
    open var VERTEXALPHA: Boolean = definedExternally
    open var NUM_BONE_INFLUENCERS: Number = definedExternally
    open var BonesPerMesh: Number = definedExternally
    open var INSTANCES: Boolean = definedExternally
    open var GLOSSINESS: Boolean = definedExternally
    open var ROUGHNESS: Boolean = definedExternally
    open var EMISSIVEASILLUMINATION: Boolean = definedExternally
    open var LINKEMISSIVEWITHDIFFUSE: Boolean = definedExternally
    open var REFLECTIONFRESNELFROMSPECULAR: Boolean = definedExternally
    open var LIGHTMAP: Boolean = definedExternally
    open var USELIGHTMAPASSHADOWMAP: Boolean = definedExternally
    open var REFLECTIONMAP_3D: Boolean = definedExternally
    open var REFLECTIONMAP_SPHERICAL: Boolean = definedExternally
    open var REFLECTIONMAP_PLANAR: Boolean = definedExternally
    open var REFLECTIONMAP_CUBIC: Boolean = definedExternally
    open var REFLECTIONMAP_PROJECTION: Boolean = definedExternally
    open var REFLECTIONMAP_SKYBOX: Boolean = definedExternally
    open var REFLECTIONMAP_EXPLICIT: Boolean = definedExternally
    open var REFLECTIONMAP_EQUIRECTANGULAR: Boolean = definedExternally
    open var REFLECTIONMAP_EQUIRECTANGULAR_FIXED: Boolean = definedExternally
    open var REFLECTIONMAP_MIRROREDEQUIRECTANGULAR_FIXED: Boolean = definedExternally
    open var INVERTCUBICMAP: Boolean = definedExternally
    open var LOGARITHMICDEPTH: Boolean = definedExternally
    open var REFRACTION: Boolean = definedExternally
    open var REFRACTIONMAP_3D: Boolean = definedExternally
    open var REFLECTIONOVERALPHA: Boolean = definedExternally
    open var TWOSIDEDLIGHTING: Boolean = definedExternally
    open var SHADOWFLOAT: Boolean = definedExternally
    open var MORPHTARGETS: Boolean = definedExternally
    open var MORPHTARGETS_NORMAL: Boolean = definedExternally
    open var MORPHTARGETS_TANGENT: Boolean = definedExternally
    open var NUM_MORPH_INFLUENCERS: Number = definedExternally
    override open var IMAGEPROCESSING: Boolean = definedExternally
    override open var VIGNETTE: Boolean = definedExternally
    override open var VIGNETTEBLENDMODEMULTIPLY: Boolean = definedExternally
    override open var VIGNETTEBLENDMODEOPAQUE: Boolean = definedExternally
    override open var TONEMAPPING: Boolean = definedExternally
    override open var CONTRAST: Boolean = definedExternally
    override open var COLORCURVES: Boolean = definedExternally
    override open var COLORGRADING: Boolean = definedExternally
    open var COLORGRADING3D: Boolean = definedExternally
    override open var SAMPLER3DGREENDEPTH: Boolean = definedExternally
    override open var SAMPLER3DBGRMAP: Boolean = definedExternally
    override open var IMAGEPROCESSINGPOSTPROCESS: Boolean = definedExternally
    override open var EXPOSURE: Boolean = definedExternally
    open fun setReflectionMode(modeToEnable: String): Unit = definedExternally
}
external open class StandardMaterial_OldVer(name: String, scene: Scene) : PushMaterial {
    open var _diffuseTexture: Any = definedExternally
    open var diffuseTexture: BaseTexture = definedExternally
    open var _ambientTexture: Any = definedExternally
    open var ambientTexture: BaseTexture = definedExternally
    open var _opacityTexture: Any = definedExternally
    open var opacityTexture: BaseTexture = definedExternally
    open var _reflectionTexture: Any = definedExternally
    open var reflectionTexture: BaseTexture = definedExternally
    open var _emissiveTexture: Any = definedExternally
    open var emissiveTexture: BaseTexture = definedExternally
    open var _specularTexture: Any = definedExternally
    open var specularTexture: BaseTexture = definedExternally
    open var _bumpTexture: Any = definedExternally
    open var bumpTexture: BaseTexture = definedExternally
    open var _lightmapTexture: Any = definedExternally
    open var lightmapTexture: BaseTexture = definedExternally
    open var _refractionTexture: Any = definedExternally
    open var refractionTexture: BaseTexture = definedExternally
    open var ambientColor: Color3 = definedExternally
    open var diffuseColor: Color3 = definedExternally
    open var specularColor: Color3 = definedExternally
    open var emissiveColor: Color3 = definedExternally
    open var specularPower: Number = definedExternally
    open var _useAlphaFromDiffuseTexture: Any = definedExternally
    open var useAlphaFromDiffuseTexture: Boolean = definedExternally
    open var _useEmissiveAsIllumination: Any = definedExternally
    open var useEmissiveAsIllumination: Boolean = definedExternally
    open var _linkEmissiveWithDiffuse: Any = definedExternally
    open var linkEmissiveWithDiffuse: Boolean = definedExternally
    open var _useSpecularOverAlpha: Any = definedExternally
    open var useSpecularOverAlpha: Boolean = definedExternally
    open var _useReflectionOverAlpha: Any = definedExternally
    open var useReflectionOverAlpha: Boolean = definedExternally
    open var _disableLighting: Any = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var _useParallax: Any = definedExternally
    open var useParallax: Boolean = definedExternally
    open var _useParallaxOcclusion: Any = definedExternally
    open var useParallaxOcclusion: Boolean = definedExternally
    open var parallaxScaleBias: Number = definedExternally
    open var _roughness: Any = definedExternally
    open var roughness: Number = definedExternally
    open var indexOfRefraction: Number = definedExternally
    open var invertRefractionY: Boolean = definedExternally
    open var _useLightmapAsShadowmap: Any = definedExternally
    open var useLightmapAsShadowmap: Boolean = definedExternally
    open var _diffuseFresnelParameters: Any = definedExternally
    open var diffuseFresnelParameters: FresnelParameters = definedExternally
    open var _opacityFresnelParameters: Any = definedExternally
    open var opacityFresnelParameters: FresnelParameters = definedExternally
    open var _reflectionFresnelParameters: Any = definedExternally
    open var reflectionFresnelParameters: FresnelParameters = definedExternally
    open var _refractionFresnelParameters: Any = definedExternally
    open var refractionFresnelParameters: FresnelParameters = definedExternally
    open var _emissiveFresnelParameters: Any = definedExternally
    open var emissiveFresnelParameters: FresnelParameters = definedExternally
    open var _useReflectionFresnelFromSpecular: Any = definedExternally
    open var useReflectionFresnelFromSpecular: Boolean = definedExternally
    open var _useGlossinessFromSpecularMapAlpha: Any = definedExternally
    open var useGlossinessFromSpecularMapAlpha: Boolean = definedExternally
    open var _maxSimultaneousLights: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var _invertNormalMapX: Any = definedExternally
    open var invertNormalMapX: Boolean = definedExternally
    open var _invertNormalMapY: Any = definedExternally
    open var invertNormalMapY: Boolean = definedExternally
    open var _twoSidedLighting: Any = definedExternally
    open var twoSidedLighting: Boolean = definedExternally
    open var _imageProcessingConfiguration: ImageProcessingConfiguration = definedExternally
    open var imageProcessingConfiguration: ImageProcessingConfiguration = definedExternally
    open var _imageProcessingObserver: Any = definedExternally
    open fun _attachImageProcessingConfiguration(configuration: ImageProcessingConfiguration?): Unit = definedExternally
    open var cameraColorCurvesEnabled: Boolean = definedExternally
    open var cameraColorGradingEnabled: Boolean = definedExternally
    open var cameraToneMappingEnabled: Boolean = definedExternally
    open var cameraExposure: Number = definedExternally
    open var cameraContrast: Number = definedExternally
    open var cameraColorGradingTexture: BaseTexture? = definedExternally
    open var customShaderNameResolve: (shaderName: String, uniforms: Array<String>, uniformBuffers: Array<String>, samplers: Array<String>, defines: StandardMaterialDefines_OldVer) -> String = definedExternally
    open var _renderTargets: SmartArray<RenderTargetTexture> = definedExternally
    open var _worldViewProjectionMatrix: Matrix = definedExternally
    open var _globalAmbientColor: Color3 = definedExternally
    open var _useLogarithmicDepth: Boolean = definedExternally
    override open fun getClassName(): String = definedExternally
    open var useLogarithmicDepth: Boolean = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    open fun _shouldUseAlphaFromDiffuseTexture(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun buildUniformLayout(): Unit = definedExternally
    override open fun unbind(): Unit = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override open fun dispose(forceDisposeEffect: Boolean?, forceDisposeTextures: Boolean?): Unit = definedExternally
    override open fun clone(name: String): StandardMaterial_OldVer = definedExternally
    override open fun serialize(): Any = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): StandardMaterial_OldVer = definedExternally
        var _DiffuseTextureEnabled: Boolean = definedExternally
        var DiffuseTextureEnabled: Boolean = definedExternally
        var _AmbientTextureEnabled: Boolean = definedExternally
        var AmbientTextureEnabled: Boolean = definedExternally
        var _OpacityTextureEnabled: Boolean = definedExternally
        var OpacityTextureEnabled: Boolean = definedExternally
        var _ReflectionTextureEnabled: Boolean = definedExternally
        var ReflectionTextureEnabled: Boolean = definedExternally
        var _EmissiveTextureEnabled: Boolean = definedExternally
        var EmissiveTextureEnabled: Boolean = definedExternally
        var _SpecularTextureEnabled: Boolean = definedExternally
        var SpecularTextureEnabled: Boolean = definedExternally
        var _BumpTextureEnabled: Boolean = definedExternally
        var BumpTextureEnabled: Boolean = definedExternally
        var _LightmapTextureEnabled: Boolean = definedExternally
        var LightmapTextureEnabled: Boolean = definedExternally
        var _RefractionTextureEnabled: Boolean = definedExternally
        var RefractionTextureEnabled: Boolean = definedExternally
        var _ColorGradingTextureEnabled: Boolean = definedExternally
        var ColorGradingTextureEnabled: Boolean = definedExternally
        var _FresnelEnabled: Boolean = definedExternally
        var FresnelEnabled: Boolean = definedExternally
    }
}
external open class CustomShaderStructure {
    open var FragmentStore: String = definedExternally
    open var VertexStore: String = definedExternally
}
external open class ShaderSpecialParts {
    open var Fragment_Begin: String = definedExternally
    open var Fragment_Definitions: String = definedExternally
    open var Fragment_MainBegin: String = definedExternally
    open var Fragment_Custom_Diffuse: String = definedExternally
    open var Fragment_Custom_Alpha: String = definedExternally
    open var Fragment_Before_FragColor: String = definedExternally
    open var Vertex_Begin: String = definedExternally
    open var Vertex_Definitions: String = definedExternally
    open var Vertex_MainBegin: String = definedExternally
    open var Vertex_Before_PositionUpdated: String = definedExternally
    open var Vertex_Before_NormalUpdated: String = definedExternally
}
external open class ShaderForVer3_0 : CustomShaderStructure
external open class StandardShaderVersions {
    companion object {
        var Ver3_0: String = definedExternally
    }
}
external open class CustomMaterial(name: String, scene: Scene) : StandardMaterial_OldVer {
    open var CustomParts: ShaderSpecialParts = definedExternally
    open var ShaderVersion: CustomShaderStructure = definedExternally
    open var _isCreatedShader: Boolean = definedExternally
    open var _createdShaderName: String = definedExternally
    open var _customUniform: Array<String> = definedExternally
    open var _newUniforms: Array<String> = definedExternally
    open var _newUniformInstances: Array<Any> = definedExternally
    open var _newSamplerInstances: Array<Texture> = definedExternally
    open fun AttachAfterBind(mesh: Mesh, effect: Effect): Unit = definedExternally
    open fun ReviewUniform(name: String, arr: Array<String>): Array<String> = definedExternally
    open fun Builder(shaderName: String, uniforms: Array<String>, uniformBuffers: Array<String>, samplers: Array<String>, defines: StandardMaterialDefines_OldVer): String = definedExternally
    open fun SelectVersion(ver: String): Unit = definedExternally
    open fun AddUniform(name: String, kind: String, param: Any): CustomMaterial = definedExternally
    open fun Fragment_Begin(shaderPart: String): CustomMaterial = definedExternally
    open fun Fragment_Definitions(shaderPart: String): CustomMaterial = definedExternally
    open fun Fragment_MainBegin(shaderPart: String): CustomMaterial = definedExternally
    open fun Fragment_Custom_Diffuse(shaderPart: String): CustomMaterial = definedExternally
    open fun Fragment_Custom_Alpha(shaderPart: String): CustomMaterial = definedExternally
    open fun Fragment_Before_FragColor(shaderPart: String): CustomMaterial = definedExternally
    open fun Vertex_Begin(shaderPart: String): CustomMaterial = definedExternally
    open fun Vertex_Definitions(shaderPart: String): CustomMaterial = definedExternally
    open fun Vertex_MainBegin(shaderPart: String): CustomMaterial = definedExternally
    open fun Vertex_Before_PositionUpdated(shaderPart: String): CustomMaterial = definedExternally
    open fun Vertex_Before_NormalUpdated(shaderPart: String): CustomMaterial = definedExternally
    companion object {
        var ShaderIndexer: Number = definedExternally
    }
}
external open class CellMaterial(name: String, scene: Scene) : PushMaterial {
    open var _diffuseTexture: Any = definedExternally
    open var diffuseTexture: BaseTexture = definedExternally
    open var diffuseColor: Color3 = definedExternally
    open var _computeHighLevel: Boolean = definedExternally
    open var computeHighLevel: Boolean = definedExternally
    open var _disableLighting: Any = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var _maxSimultaneousLights: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var _renderId: Any = definedExternally
    override open fun needAlphaBlending(): Boolean = definedExternally
    override open fun needAlphaTesting(): Boolean = definedExternally
    override open fun getAlphaTestTexture(): BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    override open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override open fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
    override open fun getClassName(): String = definedExternally
    override open fun clone(name: String): CellMaterial = definedExternally
    override open fun serialize(): Any = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): CellMaterial = definedExternally
    }
}
