@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("BABYLON.Geometry.Internals")
package BABYLON.Internals

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

external open class MeshLODLevel(distance: Number, mesh: Mesh) {
    open var distance: Number = definedExternally
    open var mesh: Mesh = definedExternally
}
external open class _AlphaState {
    open var _isAlphaBlendDirty: Any = definedExternally
    open var _isBlendFunctionParametersDirty: Any = definedExternally
    open var _isBlendEquationParametersDirty: Any = definedExternally
    open var _isBlendConstantsDirty: Any = definedExternally
    open var _alphaBlend: Any = definedExternally
    open var _blendFunctionParameters: Any = definedExternally
    open var _blendEquationParameters: Any = definedExternally
    open var _blendConstants: Any = definedExternally
    open var isDirty: Boolean = definedExternally
    open var alphaBlend: Boolean = definedExternally
    open fun setAlphaBlendConstants(r: Number, g: Number, b: Number, a: Number): Unit = definedExternally
    open fun setAlphaBlendFunctionParameters(value0: Number, value1: Number, value2: Number, value3: Number): Unit = definedExternally
    open fun setAlphaEquationParameters(rgb: Number, alpha: Any): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    open fun apply(gl: WebGLRenderingContext): Unit = definedExternally
}
external open class _DepthCullingState {
    open var _isDepthTestDirty: Any = definedExternally
    open var _isDepthMaskDirty: Any = definedExternally
    open var _isDepthFuncDirty: Any = definedExternally
    open var _isCullFaceDirty: Any = definedExternally
    open var _isCullDirty: Any = definedExternally
    open var _isZOffsetDirty: Any = definedExternally
    open var _depthTest: Any = definedExternally
    open var _depthMask: Any = definedExternally
    open var _depthFunc: Any = definedExternally
    open var _cull: Any = definedExternally
    open var _cullFace: Any = definedExternally
    open var _zOffset: Any = definedExternally
    open var isDirty: Boolean = definedExternally
    open var zOffset: Number = definedExternally
    open var cullFace: Number = definedExternally
    open var cull: Boolean = definedExternally
    open var depthFunc: Number = definedExternally
    open var depthMask: Boolean = definedExternally
    open var depthTest: Boolean = definedExternally
    open fun reset(): Unit = definedExternally
    open fun apply(gl: WebGLRenderingContext): Unit = definedExternally
}
external open class _StencilState {
    open var _isStencilTestDirty: Any = definedExternally
    open var _isStencilMaskDirty: Any = definedExternally
    open var _isStencilFuncDirty: Any = definedExternally
    open var _isStencilOpDirty: Any = definedExternally
    open var _stencilTest: Any = definedExternally
    open var _stencilMask: Any = definedExternally
    open var _stencilFunc: Any = definedExternally
    open var _stencilFuncRef: Any = definedExternally
    open var _stencilFuncMask: Any = definedExternally
    open var _stencilOpStencilFail: Any = definedExternally
    open var _stencilOpDepthFail: Any = definedExternally
    open var _stencilOpStencilDepthPass: Any = definedExternally
    open var isDirty: Boolean = definedExternally
    open var stencilFunc: Number = definedExternally
    open var stencilFuncRef: Number = definedExternally
    open var stencilFuncMask: Number = definedExternally
    open var stencilOpStencilFail: Number = definedExternally
    open var stencilOpDepthFail: Number = definedExternally
    open var stencilOpStencilDepthPass: Number = definedExternally
    open var stencilMask: Number = definedExternally
    open var stencilTest: Boolean = definedExternally
    open fun reset(): Unit = definedExternally
    open fun apply(gl: WebGLRenderingContext): Unit = definedExternally
}
external open class AndOrNotEvaluator {
    companion object {
        fun Eval(query: String, evaluateCallback: (value: Any) -> Boolean): Boolean = definedExternally
        fun _HandleParenthesisContent(parenthesisContent: Any, evaluateCallback: Any): Unit = definedExternally
        fun _SimplifyNegation(booleanString: Any): Unit = definedExternally
    }
}
external interface DDSInfo {
    var width: Number
    var height: Number
    var mipmapCount: Number
    var isFourCC: Boolean
    var isRGB: Boolean
    var isLuminance: Boolean
    var isCube: Boolean
    var isCompressed: Boolean
    var dxgiFormat: Number
    var textureType: Number
}
external open class DDSTools {
    companion object {
        var StoreLODInAlphaChannel: Boolean = definedExternally
        fun GetDDSInfo(arrayBuffer: Any): DDSInfo = definedExternally
        var _FloatView: Any = definedExternally
        var _Int32View: Any = definedExternally
        fun _ToHalfFloat(value: Any): Unit = definedExternally
        fun _FromHalfFloat(value: Any): Unit = definedExternally
        fun _GetHalfFloatAsFloatRGBAArrayBuffer(width: Any, height: Any, dataOffset: Any, dataLength: Any, arrayBuffer: Any, lod: Any): Unit = definedExternally
        fun _GetHalfFloatRGBAArrayBuffer(width: Any, height: Any, dataOffset: Any, dataLength: Any, arrayBuffer: Any, lod: Any): Unit = definedExternally
        fun _GetFloatRGBAArrayBuffer(width: Any, height: Any, dataOffset: Any, dataLength: Any, arrayBuffer: Any, lod: Any): Unit = definedExternally
        fun _GetFloatAsUIntRGBAArrayBuffer(width: Any, height: Any, dataOffset: Any, dataLength: Any, arrayBuffer: Any, lod: Any): Unit = definedExternally
        fun _GetHalfFloatAsUIntRGBAArrayBuffer(width: Any, height: Any, dataOffset: Any, dataLength: Any, arrayBuffer: Any, lod: Any): Unit = definedExternally
        fun _GetRGBAArrayBuffer(width: Any, height: Any, dataOffset: Any, dataLength: Any, arrayBuffer: Any): Unit = definedExternally
        fun _GetRGBArrayBuffer(width: Any, height: Any, dataOffset: Any, dataLength: Any, arrayBuffer: Any): Unit = definedExternally
        fun _GetLuminanceArrayBuffer(width: Any, height: Any, dataOffset: Any, dataLength: Any, arrayBuffer: Any): Unit = definedExternally
        fun UploadDDSLevels(engine: Engine, arrayBuffer: Any, info: DDSInfo, loadMipmaps: Boolean, faces: Number, lodIndex: Number? = definedExternally /* null */): Unit = definedExternally
    }
}
external open class KhronosTextureContainer(arrayBuffer: Any, facesExpected: Number, threeDExpected: Boolean? = definedExternally /* null */, textureArrayExpected: Boolean? = definedExternally /* null */) {
    open var arrayBuffer: Any = definedExternally
    open var glType: Number = definedExternally
    open var glTypeSize: Number = definedExternally
    open var glFormat: Number = definedExternally
    open var glInternalFormat: Number = definedExternally
    open var glBaseInternalFormat: Number = definedExternally
    open var pixelWidth: Number = definedExternally
    open var pixelHeight: Number = definedExternally
    open var pixelDepth: Number = definedExternally
    open var numberOfArrayElements: Number = definedExternally
    open var numberOfFaces: Number = definedExternally
    open var numberOfMipmapLevels: Number = definedExternally
    open var bytesOfKeyValueData: Number = definedExternally
    open var loadType: Number = definedExternally
    open fun switchEndainness(`val`: Number): Number = definedExternally
    open fun uploadLevels(gl: WebGLRenderingContext, loadMipmaps: Boolean): Unit = definedExternally
    open fun _upload2DCompressedLevels(gl: Any, loadMipmaps: Any): Unit = definedExternally
    companion object {
        var HEADER_LEN: Number = definedExternally
        var COMPRESSED_2D: Number = definedExternally
        var COMPRESSED_3D: Number = definedExternally
        var TEX_2D: Number = definedExternally
        var TEX_3D: Number = definedExternally
    }
}
external open class TGATools {
    companion object {
        var _TYPE_NO_DATA: Any = definedExternally
        var _TYPE_INDEXED: Any = definedExternally
        var _TYPE_RGB: Any = definedExternally
        var _TYPE_GREY: Any = definedExternally
        var _TYPE_RLE_INDEXED: Any = definedExternally
        var _TYPE_RLE_RGB: Any = definedExternally
        var _TYPE_RLE_GREY: Any = definedExternally
        var _ORIGIN_MASK: Any = definedExternally
        var _ORIGIN_SHIFT: Any = definedExternally
        var _ORIGIN_BL: Any = definedExternally
        var _ORIGIN_BR: Any = definedExternally
        var _ORIGIN_UL: Any = definedExternally
        var _ORIGIN_UR: Any = definedExternally
        fun GetTGAHeader(data: Uint8Array): Any = definedExternally
        fun UploadContent(gl: WebGLRenderingContext, data: Uint8Array): Unit = definedExternally
        fun _getImageData8bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array = definedExternally
        fun _getImageData16bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array = definedExternally
        fun _getImageData24bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array = definedExternally
        fun _getImageData32bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array = definedExternally
        fun _getImageDataGrey8bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array = definedExternally
        fun _getImageDataGrey16bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array = definedExternally
    }
}
external open class PBRBaseSimpleMaterial(name: String, scene: Scene) : PBRBaseMaterial {
    open var maxSimultaneousLights: Number = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var environmentTexture: BaseTexture = definedExternally
    open var invertNormalMapX: Boolean = definedExternally
    open var invertNormalMapY: Boolean = definedExternally
    open var normalTexture: BaseTexture = definedExternally
    open var emissiveColor: Color3 = definedExternally
    open var emissiveTexture: BaseTexture = definedExternally
    open var occlusionStrength: Number = definedExternally
    open var occlusionTexture: BaseTexture = definedExternally
    open var alphaCutOff: Number = definedExternally
    open var _transparencyMode: Number = definedExternally
    open var transparencyMode: Number = definedExternally
    open var doubleSided: Boolean = definedExternally
    override fun _shouldUseAlphaFromAlbedoTexture(): Boolean = definedExternally
    override fun needAlphaBlending(): Boolean = definedExternally
    override fun needAlphaTesting(): Boolean = definedExternally
}
external open class CubeMapToSphericalPolynomialTools {
    companion object {
        var FileFaces: Any = definedExternally
        fun ConvertCubeMapTextureToSphericalPolynomial(texture: BaseTexture): SphericalPolynomial = definedExternally
        fun ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): SphericalPolynomial = definedExternally
    }
}
external interface HDRInfo {
    var height: Number
    var width: Number
    var dataPosition: Number
}
external open class HDRTools {
    companion object {
        fun Ldexp(mantissa: Any, exponent: Any): Unit = definedExternally
        fun Rgbe2float(float32array: Any, red: Any, green: Any, blue: Any, exponent: Any, index: Any): Unit = definedExternally
        fun readStringLine(uint8array: Any, startIndex: Any): Unit = definedExternally
        fun RGBE_ReadHeader(uint8array: Uint8Array): HDRInfo = definedExternally
        fun GetCubeMapTextureData(buffer: ArrayBuffer, size: Number): CubeMapInfo = definedExternally
        fun RGBE_ReadPixels(uint8array: Uint8Array, hdrInfo: HDRInfo): Float32Array = definedExternally
        fun RGBE_ReadPixels_RLE(uint8array: Any, hdrInfo: Any): Unit = definedExternally
    }
}
external interface CubeMapInfo {
    var front: ArrayBufferView
    var back: ArrayBufferView
    var left: ArrayBufferView
    var right: ArrayBufferView
    var up: ArrayBufferView
    var down: ArrayBufferView
    var size: Number
    var format: Number
    var type: Number
    var gammaSpace: Boolean
}
external open class PanoramaToCubeMapTools {
    companion object {
        var FACE_FRONT: Any = definedExternally
        var FACE_BACK: Any = definedExternally
        var FACE_RIGHT: Any = definedExternally
        var FACE_LEFT: Any = definedExternally
        var FACE_DOWN: Any = definedExternally
        var FACE_UP: Any = definedExternally
        fun ConvertPanoramaToCubemap(float32Array: Float32Array, inputWidth: Number, inputHeight: Number, size: Number): CubeMapInfo = definedExternally
        fun CreateCubemapTexture(texSize: Any, faceData: Any, float32Array: Any, inputWidth: Any, inputHeight: Any): Unit = definedExternally
        fun CalcProjectionSpherical(vDir: Any, float32Array: Any, inputWidth: Any, inputHeight: Any): Unit = definedExternally
    }
}
