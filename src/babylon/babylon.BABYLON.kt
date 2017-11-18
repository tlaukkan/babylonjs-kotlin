@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("BABYLON")
package BABYLON

import BABYLON.Primitives.*
import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.webaudio.*
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

external interface ArrayLike<T> {
    var length: Number
    @nativeGetter
    operator fun get(n: Number): T?
    @nativeSetter
    operator fun set(n: Number, value: T)
}


external open class InstancingAttributeInfo {
    open var index: Number = definedExternally
    open var attributeSize: Number = definedExternally
    open var attribyteType: Number = definedExternally
    open var normalized: Boolean = definedExternally
    open var offset: Number = definedExternally
    open var attributeName: String = definedExternally
}
external open class EngineCapabilities {
    open var maxTexturesImageUnits: Number = definedExternally
    open var maxVertexTextureImageUnits: Number = definedExternally
    open var maxTextureSize: Number = definedExternally
    open var maxCubemapTextureSize: Number = definedExternally
    open var maxRenderTextureSize: Number = definedExternally
    open var maxVertexAttribs: Number = definedExternally
    open var maxVaryingVectors: Number = definedExternally
    open var maxVertexUniformVectors: Number = definedExternally
    open var maxFragmentUniformVectors: Number = definedExternally
    open var standardDerivatives: Boolean = definedExternally
    open var s3tc: WEBGL_compressed_texture_s3tc = definedExternally
    open var pvrtc: Any = definedExternally
    open var etc1: Any = definedExternally
    open var etc2: Any = definedExternally
    open var astc: Any = definedExternally
    open var textureFloat: Boolean = definedExternally
    open var vertexArrayObject: Boolean = definedExternally
    open var textureAnisotropicFilterExtension: EXT_texture_filter_anisotropic = definedExternally
    open var maxAnisotropy: Number = definedExternally
    open var instancedArrays: Boolean = definedExternally
    open var uintIndices: Boolean = definedExternally
    open var highPrecisionShaderSupported: Boolean = definedExternally
    open var fragmentDepthSupported: Boolean = definedExternally
    open var textureFloatLinearFiltering: Boolean = definedExternally
    open var textureFloatRender: Boolean = definedExternally
    open var textureHalfFloat: Boolean = definedExternally
    open var textureHalfFloatLinearFiltering: Boolean = definedExternally
    open var textureHalfFloatRender: Boolean = definedExternally
    open var textureLOD: Boolean = definedExternally
    open var drawBuffersExtension: Any = definedExternally
    open var colorBufferFloat: Boolean = definedExternally
}
external interface EngineOptions : WebGLContextAttributes {
    var limitDeviceRatio: Number? get() = definedExternally; set(value) = definedExternally
    var autoEnableWebVR: Boolean? get() = definedExternally; set(value) = definedExternally
    var disableWebGL2Support: Boolean? get() = definedExternally; set(value) = definedExternally
    var audioEngine: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$0` {
    var vendor: String
    var renderer: String
    var version: String
}
external interface `T$1` {
    @nativeGetter
    operator fun get(key: String): VertexBuffer?
    @nativeSetter
    operator fun set(key: String, value: VertexBuffer)
}
external interface `T$2` {
    @nativeGetter
    operator fun get(key: String): VertexBuffer?
    @nativeSetter
    operator fun set(key: String, value: VertexBuffer)
}
external open class Engine(canvas: HTMLCanvasElement, antialias: Boolean? = definedExternally /* null */, options: EngineOptions? = definedExternally /* null */, adaptToDeviceRatio: Boolean? = definedExternally /* null */) {
    open var isFullscreen: Boolean = definedExternally
    open var isPointerLock: Boolean = definedExternally
    open var cullBackFaces: Boolean = definedExternally
    open var renderEvenInBackground: Boolean = definedExternally
    open var preventCacheWipeBetweenFrames: Boolean = definedExternally
    open var enableOfflineSupport: Boolean = definedExternally
    open var scenes: Array<Scene> = definedExternally
    open var onResizeObservable: Observable<Engine> = definedExternally
    open var onCanvasBlurObservable: Observable<Engine> = definedExternally
    open var vrDisplaysPromise: Any = definedExternally
    open var _vrDisplays: Any = definedExternally
    open var _vrDisplayEnabled: Any = definedExternally
    open var _oldSize: Any = definedExternally
    open var _oldHardwareScaleFactor: Any = definedExternally
    open var _vrAnimationFrameHandler: Any = definedExternally
    open var _gl: WebGLRenderingContext = definedExternally
    open var _renderingCanvas: Any = definedExternally
    open var _windowIsBackground: Any = definedExternally
    open var _webGLVersion: Any = definedExternally
    open var _badOS: Any = definedExternally
    open var badOS: Boolean = definedExternally
    open var _badDesktopOS: Any = definedExternally
    open var badDesktopOS: Boolean = definedExternally
    open var _onCanvasBlur: Any = definedExternally
    open var _onBlur: Any = definedExternally
    open var _onFocus: Any = definedExternally
    open var _onFullscreenChange: Any = definedExternally
    open var _onPointerLockChange: Any = definedExternally
    open var _hardwareScalingLevel: Any = definedExternally
    open var _caps: Any = definedExternally
    open var _pointerLockRequested: Any = definedExternally
    open var _alphaTest: Any = definedExternally
    open var _isStencilEnable: Any = definedExternally
    open var _loadingScreen: Any = definedExternally
    open var _drawCalls: PerfCounter = definedExternally
    open var _glVersion: Any = definedExternally
    open var _glRenderer: Any = definedExternally
    open var _glVendor: Any = definedExternally
    open var _videoTextureSupported: Any = definedExternally
    open var _renderingQueueLaunched: Any = definedExternally
    open var _activeRenderLoops: Any = definedExternally
    open var fpsRange: Any = definedExternally
    open var previousFramesDuration: Any = definedExternally
    open var fps: Any = definedExternally
    open var deltaTime: Any = definedExternally
    open var _depthCullingState: Any = definedExternally
    open var _stencilState: Any = definedExternally
    open var _alphaState: Any = definedExternally
    open var _alphaMode: Any = definedExternally
    open var _loadedTexturesCache: Any = definedExternally
    open var _maxTextureChannels: Any = definedExternally
    open var _activeTexture: Any = definedExternally
    open var _activeTexturesCache: Any = definedExternally
    open var _currentEffect: Any = definedExternally
    open var _currentProgram: Any = definedExternally
    open var _compiledEffects: Any = definedExternally
    open var _vertexAttribArraysEnabled: Any = definedExternally
    open var _cachedViewport: Any = definedExternally
    open var _cachedVertexArrayObject: Any = definedExternally
    open var _cachedVertexBuffers: Any = definedExternally
    open var _cachedIndexBuffer: Any = definedExternally
    open var _cachedEffectForVertexBuffers: Any = definedExternally
    open var _currentRenderTarget: Any = definedExternally
    open var _uintIndicesCurrentlySet: Any = definedExternally
    open var _currentBoundBuffer: Any = definedExternally
    open var _currentFramebuffer: Any = definedExternally
    open var _currentBufferPointers: Any = definedExternally
    open var _currentInstanceLocations: Any = definedExternally
    open var _currentInstanceBuffers: Any = definedExternally
    open var _textureUnits: Any = definedExternally
    open var _workingCanvas: Any = definedExternally
    open var _workingContext: Any = definedExternally
    open var _dummyFramebuffer: Any = definedExternally
    open var _externalData: Any = definedExternally
    open var _bindedRenderFunction: Any = definedExternally
    open var _vaoRecordInProgress: Any = definedExternally
    open var _mustWipeVertexAttributes: Any = definedExternally
    open var _emptyTexture: Any = definedExternally
    open var _emptyCubeTexture: Any = definedExternally
    open var _texturesSupported: Any = definedExternally
    open var _textureFormatInUse: Any = definedExternally
    open var texturesSupported: Array<String> = definedExternally
    open var textureFormatInUse: String = definedExternally
    open var emptyTexture: WebGLTexture = definedExternally
    open var emptyCubeTexture: WebGLTexture = definedExternally
    open var webGLVersion: Number = definedExternally
    open var isStencilEnable: Boolean = definedExternally
    open fun _prepareWorkingCanvas(): Unit = definedExternally
    open fun resetTextureCache(): Unit = definedExternally
    open fun getGlInfo(): `T$0` = definedExternally
    open fun getAspectRatio(camera: Camera, useScreen: Boolean? = definedExternally /* null */): Number = definedExternally
    open fun getRenderWidth(useScreen: Boolean? = definedExternally /* null */): Number = definedExternally
    open fun getRenderHeight(useScreen: Boolean? = definedExternally /* null */): Number = definedExternally
    open fun getRenderingCanvas(): HTMLCanvasElement = definedExternally
    open fun getRenderingCanvasClientRect(): ClientRect = definedExternally
    open fun setHardwareScalingLevel(level: Number): Unit = definedExternally
    open fun getHardwareScalingLevel(): Number = definedExternally
    open fun getLoadedTexturesCache(): Array<WebGLTexture> = definedExternally
    open fun getCaps(): EngineCapabilities = definedExternally
    open var drawCalls: Number = definedExternally
    open var drawCallsPerfCounter: PerfCounter = definedExternally
    open fun getDepthFunction(): Number = definedExternally
    open fun setDepthFunction(depthFunc: Number): Unit = definedExternally
    open fun setDepthFunctionToGreater(): Unit = definedExternally
    open fun setDepthFunctionToGreaterOrEqual(): Unit = definedExternally
    open fun setDepthFunctionToLess(): Unit = definedExternally
    open fun setDepthFunctionToLessOrEqual(): Unit = definedExternally
    open fun getStencilBuffer(): Boolean = definedExternally
    open fun setStencilBuffer(enable: Boolean): Unit = definedExternally
    open fun getStencilMask(): Number = definedExternally
    open fun setStencilMask(mask: Number): Unit = definedExternally
    open fun getStencilFunction(): Number = definedExternally
    open fun getStencilFunctionReference(): Number = definedExternally
    open fun getStencilFunctionMask(): Number = definedExternally
    open fun setStencilFunction(stencilFunc: Number): Unit = definedExternally
    open fun setStencilFunctionReference(reference: Number): Unit = definedExternally
    open fun setStencilFunctionMask(mask: Number): Unit = definedExternally
    open fun getStencilOperationFail(): Number = definedExternally
    open fun getStencilOperationDepthFail(): Number = definedExternally
    open fun getStencilOperationPass(): Number = definedExternally
    open fun setStencilOperationFail(operation: Number): Unit = definedExternally
    open fun setStencilOperationDepthFail(operation: Number): Unit = definedExternally
    open fun setStencilOperationPass(operation: Number): Unit = definedExternally
    open fun setDitheringState(value: Boolean): Unit = definedExternally
    open fun stopRenderLoop(renderFunction: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
    open fun _renderLoop(): Unit = definedExternally
    open fun runRenderLoop(renderFunction: () -> Unit): Unit = definedExternally
    open fun switchFullscreen(requestPointerLock: Boolean): Unit = definedExternally
    open fun clear(color: Color4, backBuffer: Boolean, depth: Boolean, stencil: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun scissorClear(x: Number, y: Number, width: Number, height: Number, clearColor: Color4): Unit = definedExternally
    open fun setViewport(viewport: Viewport, requiredWidth: Number? = definedExternally /* null */, requiredHeight: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setDirectViewport(x: Number, y: Number, width: Number, height: Number): Viewport = definedExternally
    open fun beginFrame(): Unit = definedExternally
    open fun endFrame(): Unit = definedExternally
    open fun resize(): Unit = definedExternally
    open fun setSize(width: Number, height: Number): Unit = definedExternally
    open fun isVRDevicePresent(callback: (result: Boolean) -> Unit): Unit = definedExternally
    open fun getVRDevice(name: String, callback: (device: Any) -> Unit): Unit = definedExternally
    open fun initWebVR(): Unit = definedExternally
    open fun enableVR(vrDevice: Any): Unit = definedExternally
    open fun disableVR(): Unit = definedExternally
    open var _onVRFullScreenTriggered: Any = definedExternally
    open fun _getVRDisplays(): Unit = definedExternally
    open fun bindFramebuffer(texture: WebGLTexture, faceIndex: Number? = definedExternally /* null */, requiredWidth: Number? = definedExternally /* null */, requiredHeight: Number? = definedExternally /* null */): Unit = definedExternally
    open fun bindUnboundFramebuffer(framebuffer: Any): Unit = definedExternally
    open fun unBindFramebuffer(texture: WebGLTexture, disableGenerateMipMaps: Boolean? = definedExternally /* null */, onBeforeUnbind: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
    open fun generateMipMapsForCubemap(texture: WebGLTexture): Unit = definedExternally
    open fun flushFramebuffer(): Unit = definedExternally
    open fun restoreDefaultFramebuffer(): Unit = definedExternally
    open fun createUniformBuffer(elements: Array<Number>): WebGLBuffer = definedExternally
    open fun createUniformBuffer(elements: Float32Array): WebGLBuffer = definedExternally
    open fun createDynamicUniformBuffer(elements: Array<Number>): WebGLBuffer = definedExternally
    open fun createDynamicUniformBuffer(elements: Float32Array): WebGLBuffer = definedExternally
    open fun updateUniformBuffer(uniformBuffer: WebGLBuffer, elements: Array<Number>, offset: Number? = definedExternally /* null */, count: Number? = definedExternally /* null */): Unit = definedExternally
    open fun updateUniformBuffer(uniformBuffer: WebGLBuffer, elements: Float32Array, offset: Number? = definedExternally /* null */, count: Number? = definedExternally /* null */): Unit = definedExternally
    open fun _resetVertexBufferBinding(): Unit = definedExternally
    open fun createVertexBuffer(vertices: Array<Number>): WebGLBuffer = definedExternally
    open fun createVertexBuffer(vertices: Float32Array): WebGLBuffer = definedExternally
    open fun createDynamicVertexBuffer(vertices: Array<Number>): WebGLBuffer = definedExternally
    open fun createDynamicVertexBuffer(vertices: Float32Array): WebGLBuffer = definedExternally
    open fun updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: Array<Number>, offset: Number? = definedExternally /* null */, count: Number? = definedExternally /* null */): Unit = definedExternally
    open fun updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: Float32Array, offset: Number? = definedExternally /* null */, count: Number? = definedExternally /* null */): Unit = definedExternally
    open fun _resetIndexBufferBinding(): Unit = definedExternally
    open fun createIndexBuffer(indices: Array<Number>): WebGLBuffer = definedExternally
    open fun bindArrayBuffer(buffer: WebGLBuffer): Unit = definedExternally
    open fun bindUniformBuffer(buffer: WebGLBuffer? = definedExternally /* null */): Unit = definedExternally
    open fun bindUniformBufferBase(buffer: WebGLBuffer, location: Number): Unit = definedExternally
    open fun bindUniformBlock(shaderProgram: WebGLProgram, blockName: String, index: Number): Unit = definedExternally
    open fun bindIndexBuffer(buffer: Any): Unit = definedExternally
    open fun bindBuffer(buffer: Any, target: Any): Unit = definedExternally
    open fun updateArrayBuffer(data: Float32Array): Unit = definedExternally
    open fun vertexAttribPointer(buffer: Any, indx: Any, size: Any, type: Any, normalized: Any, stride: Any, offset: Any): Unit = definedExternally
    open fun _bindIndexBufferWithCache(indexBuffer: Any): Unit = definedExternally
    open fun _bindVertexBuffersAttributes(vertexBuffers: Any, effect: Any): Unit = definedExternally
    open fun recordVertexArrayObject(vertexBuffers: `T$1`, indexBuffer: WebGLBuffer, effect: Effect): WebGLVertexArrayObject = definedExternally
    open fun bindVertexArrayObject(vertexArrayObject: WebGLVertexArrayObject, indexBuffer: WebGLBuffer): Unit = definedExternally
    open fun bindBuffersDirectly(vertexBuffer: WebGLBuffer, indexBuffer: WebGLBuffer, vertexDeclaration: Array<Number>, vertexStrideSize: Number, effect: Effect): Unit = definedExternally
    open fun _unBindVertexArrayObject(): Unit = definedExternally
    open fun bindBuffers(vertexBuffers: `T$2`, indexBuffer: WebGLBuffer, effect: Effect): Unit = definedExternally
    open fun unbindInstanceAttributes(): Unit = definedExternally
    open fun releaseVertexArrayObject(vao: WebGLVertexArrayObject): Unit = definedExternally
    open fun _releaseBuffer(buffer: WebGLBuffer): Boolean = definedExternally
    open fun createInstancesBuffer(capacity: Number): WebGLBuffer = definedExternally
    open fun deleteInstancesBuffer(buffer: WebGLBuffer): Unit = definedExternally
    open fun updateAndBindInstancesBuffer(instancesBuffer: WebGLBuffer, data: Float32Array, offsetLocations: Array<Number>): Unit = definedExternally
    open fun updateAndBindInstancesBuffer(instancesBuffer: WebGLBuffer, data: Float32Array, offsetLocations: Array<InstancingAttributeInfo>): Unit = definedExternally
    open fun applyStates(): Unit = definedExternally
    open fun draw(useTriangles: Boolean, indexStart: Number, indexCount: Number, instancesCount: Number? = definedExternally /* null */): Unit = definedExternally
    open fun drawPointClouds(verticesStart: Number, verticesCount: Number, instancesCount: Number? = definedExternally /* null */): Unit = definedExternally
    open fun drawUnIndexed(useTriangles: Boolean, verticesStart: Number, verticesCount: Number, instancesCount: Number? = definedExternally /* null */): Unit = definedExternally
    open fun _releaseEffect(effect: Effect): Unit = definedExternally
    open fun createEffect(baseName: Any, attributesNamesOrOptions: Array<String>, uniformsNamesOrEngine: Array<String>, samplers: Array<String>? = definedExternally /* null */, defines: String? = definedExternally /* null */, fallbacks: EffectFallbacks? = definedExternally /* null */, onCompiled: ((effect: Effect) -> Unit)? = definedExternally /* null */, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */): Effect = definedExternally
    open fun createEffect(baseName: Any, attributesNamesOrOptions: Array<String>, uniformsNamesOrEngine: Engine, samplers: Array<String>? = definedExternally /* null */, defines: String? = definedExternally /* null */, fallbacks: EffectFallbacks? = definedExternally /* null */, onCompiled: ((effect: Effect) -> Unit)? = definedExternally /* null */, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */): Effect = definedExternally
    open fun createEffect(baseName: Any, attributesNamesOrOptions: EffectCreationOptions, uniformsNamesOrEngine: Array<String>, samplers: Array<String>? = definedExternally /* null */, defines: String? = definedExternally /* null */, fallbacks: EffectFallbacks? = definedExternally /* null */, onCompiled: ((effect: Effect) -> Unit)? = definedExternally /* null */, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */): Effect = definedExternally
    open fun createEffect(baseName: Any, attributesNamesOrOptions: EffectCreationOptions, uniformsNamesOrEngine: Engine, samplers: Array<String>? = definedExternally /* null */, defines: String? = definedExternally /* null */, fallbacks: EffectFallbacks? = definedExternally /* null */, onCompiled: ((effect: Effect) -> Unit)? = definedExternally /* null */, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */): Effect = definedExternally
    open fun createEffectForParticles(fragmentName: String, uniformsNames: Array<String>? = definedExternally /* null */, samplers: Array<String>? = definedExternally /* null */, defines: String? = definedExternally /* null */, fallbacks: EffectFallbacks? = definedExternally /* null */, onCompiled: ((effect: Effect) -> Unit)? = definedExternally /* null */, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally /* null */): Effect = definedExternally
    open fun createShaderProgram(vertexCode: String, fragmentCode: String, defines: String, context: WebGLRenderingContext? = definedExternally /* null */): WebGLProgram = definedExternally
    open fun getUniforms(shaderProgram: WebGLProgram, uniformsNames: Array<String>): Array<WebGLUniformLocation> = definedExternally
    open fun getAttributes(shaderProgram: WebGLProgram, attributesNames: Array<String>): Array<Number> = definedExternally
    open fun enableEffect(effect: Effect): Unit = definedExternally
    open fun setIntArray(uniform: WebGLUniformLocation, array: Int32Array): Unit = definedExternally
    open fun setIntArray2(uniform: WebGLUniformLocation, array: Int32Array): Unit = definedExternally
    open fun setIntArray3(uniform: WebGLUniformLocation, array: Int32Array): Unit = definedExternally
    open fun setIntArray4(uniform: WebGLUniformLocation, array: Int32Array): Unit = definedExternally
    open fun setFloatArray(uniform: WebGLUniformLocation, array: Float32Array): Unit = definedExternally
    open fun setFloatArray2(uniform: WebGLUniformLocation, array: Float32Array): Unit = definedExternally
    open fun setFloatArray3(uniform: WebGLUniformLocation, array: Float32Array): Unit = definedExternally
    open fun setFloatArray4(uniform: WebGLUniformLocation, array: Float32Array): Unit = definedExternally
    open fun setArray(uniform: WebGLUniformLocation, array: Array<Number>): Unit = definedExternally
    open fun setArray2(uniform: WebGLUniformLocation, array: Array<Number>): Unit = definedExternally
    open fun setArray3(uniform: WebGLUniformLocation, array: Array<Number>): Unit = definedExternally
    open fun setArray4(uniform: WebGLUniformLocation, array: Array<Number>): Unit = definedExternally
    open fun setMatrices(uniform: WebGLUniformLocation, matrices: Float32Array): Unit = definedExternally
    open fun setMatrix(uniform: WebGLUniformLocation, matrix: Matrix): Unit = definedExternally
    open fun setMatrix3x3(uniform: WebGLUniformLocation, matrix: Float32Array): Unit = definedExternally
    open fun setMatrix2x2(uniform: WebGLUniformLocation, matrix: Float32Array): Unit = definedExternally
    open fun setFloat(uniform: WebGLUniformLocation, value: Number): Unit = definedExternally
    open fun setFloat2(uniform: WebGLUniformLocation, x: Number, y: Number): Unit = definedExternally
    open fun setFloat3(uniform: WebGLUniformLocation, x: Number, y: Number, z: Number): Unit = definedExternally
    open fun setBool(uniform: WebGLUniformLocation, bool: Number): Unit = definedExternally
    open fun setFloat4(uniform: WebGLUniformLocation, x: Number, y: Number, z: Number, w: Number): Unit = definedExternally
    open fun setColor3(uniform: WebGLUniformLocation, color3: Color3): Unit = definedExternally
    open fun setColor4(uniform: WebGLUniformLocation, color3: Color3, alpha: Number): Unit = definedExternally
    open fun setState(culling: Boolean, zOffset: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, reverseSide: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setZOffset(value: Number): Unit = definedExternally
    open fun getZOffset(): Number = definedExternally
    open fun setDepthBuffer(enable: Boolean): Unit = definedExternally
    open fun getDepthWrite(): Boolean = definedExternally
    open fun setDepthWrite(enable: Boolean): Unit = definedExternally
    open fun setColorWrite(enable: Boolean): Unit = definedExternally
    open fun setAlphaConstants(r: Number, g: Number, b: Number, a: Number): Unit = definedExternally
    open fun setAlphaMode(mode: Number, noDepthWriteChange: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun getAlphaMode(): Number = definedExternally
    open fun setAlphaTesting(enable: Boolean): Unit = definedExternally
    open fun getAlphaTesting(): Boolean = definedExternally
    open fun wipeCaches(bruteForce: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setTextureFormatToUse(formatsAvailable: Array<String>): String = definedExternally
    open fun createTexture(urlArg: String, noMipmap: Boolean, invertY: Boolean, scene: Scene, samplingMode: Number? = definedExternally /* null */, onLoad: (() -> Unit)? = definedExternally /* null */, onError: (() -> Unit)? = definedExternally /* null */, buffer: ArrayBuffer? = definedExternally /* null */, fallBack: WebGLTexture? = definedExternally /* null */, format: Number? = definedExternally /* null */): WebGLTexture = definedExternally
    open fun createTexture(urlArg: String, noMipmap: Boolean, invertY: Boolean, scene: Scene, samplingMode: Number? = definedExternally /* null */, onLoad: (() -> Unit)? = definedExternally /* null */, onError: (() -> Unit)? = definedExternally /* null */, buffer: HTMLImageElement? = definedExternally /* null */, fallBack: WebGLTexture? = definedExternally /* null */, format: Number? = definedExternally /* null */): WebGLTexture = definedExternally
    open fun _getInternalFormat(format: Any): Unit = definedExternally
    open fun updateRawTexture(texture: WebGLTexture, data: ArrayBufferView, format: Number, invertY: Boolean, compression: String? = definedExternally /* null */): Unit = definedExternally
    open fun createRawTexture(data: ArrayBufferView, width: Number, height: Number, format: Number, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Number, compression: String? = definedExternally /* null */): WebGLTexture = definedExternally
    open fun createDynamicTexture(width: Number, height: Number, generateMipMaps: Boolean, samplingMode: Number): WebGLTexture = definedExternally
    open fun updateTextureSamplingMode(samplingMode: Number, texture: WebGLTexture): Unit = definedExternally
    open fun updateDynamicTexture(texture: WebGLTexture, canvas: HTMLCanvasElement, invertY: Boolean, premulAlpha: Boolean? = definedExternally /* null */, format: Number? = definedExternally /* null */): Unit = definedExternally
    open fun updateVideoTexture(texture: WebGLTexture, video: HTMLVideoElement, invertY: Boolean): Unit = definedExternally
    open fun createRenderTargetTexture(size: Any, options: Any): WebGLTexture = definedExternally
    open fun createMultipleRenderTarget(size: Any, options: Any): Array<WebGLTexture> = definedExternally
    open fun _setupFramebufferDepthAttachments(generateStencilBuffer: Any, generateDepthBuffer: Any, width: Any, height: Any, samples: Any? = definedExternally /* null */): Unit = definedExternally
    open fun updateRenderTargetTextureSampleCount(texture: WebGLTexture, samples: Number): Number = definedExternally
    open fun _uploadDataToTexture(target: Number, lod: Number, internalFormat: Number, width: Number, height: Number, format: Number, type: Number, data: ArrayBufferView): Unit = definedExternally
    open fun _uploadCompressedDataToTexture(target: Number, lod: Number, internalFormat: Number, width: Number, height: Number, data: ArrayBufferView): Unit = definedExternally
    open fun createRenderTargetCubeTexture(size: Number, options: Any? = definedExternally /* null */): WebGLTexture = definedExternally
    open fun createPrefilteredCubeTexture(rootUrl: String, scene: Scene, scale: Number, offset: Number, onLoad: () -> Unit, onError: (() -> Unit)? = definedExternally /* null */, format: Number? = definedExternally /* null */): WebGLTexture = definedExternally
    open fun createCubeTexture(rootUrl: String, scene: Scene, files: Array<String>, noMipmap: Boolean? = definedExternally /* null */, onLoad: ((data: Any? /*= null*/) -> Unit)? = definedExternally /* null */, onError: (() -> Unit)? = definedExternally /* null */, format: Number? = definedExternally /* null */): WebGLTexture = definedExternally
    open fun updateTextureSize(texture: WebGLTexture, width: Number, height: Number): Unit = definedExternally
    open fun updateRawCubeTexture(texture: WebGLTexture, data: Array<ArrayBufferView>, format: Number, type: Number, invertY: Boolean, compression: String? = definedExternally /* null */, level: Number? = definedExternally /* null */): Unit = definedExternally
    open fun createRawCubeTexture(data: Array<ArrayBufferView>, size: Number, format: Number, type: Number, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Number, compression: String? = definedExternally /* null */): WebGLTexture = definedExternally
    open fun createRawCubeTextureFromUrl(url: String, scene: Scene, size: Number, format: Number, type: Number, noMipmap: Boolean, callback: (ArrayBuffer: ArrayBuffer) -> Array<ArrayBufferView>, mipmmapGenerator: (faces: Array<ArrayBufferView>) -> Array<Array<ArrayBufferView>>, onLoad: (() -> Unit)? = definedExternally /* null */, onError: (() -> Unit)? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */): WebGLTexture = definedExternally
    open fun _convertRGBtoRGBATextureData(rgbData: Any, width: Any, height: Any, textureType: Any): Unit = definedExternally
    open fun _releaseFramebufferObjects(texture: WebGLTexture): Unit = definedExternally
    open fun _releaseTexture(texture: WebGLTexture): Unit = definedExternally
    open fun setProgram(program: Any): Unit = definedExternally
    open fun bindSamplers(effect: Effect): Unit = definedExternally
    open fun activateTexture(texture: Any): Unit = definedExternally
    open fun _bindTextureDirectly(target: Number, texture: WebGLTexture): Unit = definedExternally
    open fun _bindTexture(channel: Number, texture: WebGLTexture): Unit = definedExternally
    open fun setTextureFromPostProcess(channel: Number, postProcess: PostProcess): Unit = definedExternally
    open fun unbindAllTextures(): Unit = definedExternally
    open fun setTexture(channel: Number, uniform: WebGLUniformLocation, texture: BaseTexture): Unit = definedExternally
    open fun _setTexture(channel: Any, texture: Any): Unit = definedExternally
    open fun setTextureArray(channel: Number, uniform: WebGLUniformLocation, textures: Array<BaseTexture>): Unit = definedExternally
    open fun _setAnisotropicLevel(key: Number, texture: BaseTexture): Unit = definedExternally
    open fun readPixels(x: Number, y: Number, width: Number, height: Number): Uint8Array = definedExternally
    open fun <T> addExternalData(key: String, data: T): Boolean = definedExternally
    open fun <T> getExternalData(key: String): T = definedExternally
    open fun <T> getOrAddExternalDataWithFactory(key: String, factory: (k: String) -> T): T = definedExternally
    open fun removeExternalData(key: Any): Boolean = definedExternally
    open fun releaseInternalTexture(texture: WebGLTexture): Unit = definedExternally
    open fun unbindAllAttributes(): Unit = definedExternally
    open fun releaseEffects(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun displayLoadingUI(): Unit = definedExternally
    open fun hideLoadingUI(): Unit = definedExternally
    open var loadingScreen: ILoadingScreen = definedExternally
    open var loadingUIText: String = definedExternally
    open var loadingUIBackgroundColor: String = definedExternally
    open fun attachContextLostEvent(callback: (event: WebGLContextEvent) -> Unit): Unit = definedExternally
    open fun attachContextRestoredEvent(callback: (event: WebGLContextEvent) -> Unit): Unit = definedExternally
    open fun getVertexShaderSource(program: WebGLProgram): String = definedExternally
    open fun getFragmentShaderSource(program: WebGLProgram): String = definedExternally
    open fun getError(): Number = definedExternally
    open fun getFps(): Number = definedExternally
    open fun getDeltaTime(): Number = definedExternally
    open fun _measureFps(): Unit = definedExternally
    open fun _readTexturePixels(texture: WebGLTexture, width: Number, height: Number, faceIndex: Number? = definedExternally /* null */): ArrayBufferView = definedExternally
    open fun _canRenderToFloatFramebuffer(): Unit = definedExternally
    open fun _canRenderToHalfFloatFramebuffer(): Unit = definedExternally
    open fun _canRenderToFramebuffer(type: Any): Unit = definedExternally
    open fun _getWebGLTextureType(type: Number): Number = definedExternally
    open fun _getRGBABufferInternalSizedFormat(type: Number): Number = definedExternally
    companion object {
        var Instances: Array<Engine> = definedExternally
        var LastCreatedEngine: Engine = definedExternally
        var LastCreatedScene: Scene = definedExternally
        fun MarkAllMaterialsAsDirty(flag: Number, predicate: ((mat: Material) -> Boolean)? = definedExternally /* null */): Unit = definedExternally
        var _ALPHA_DISABLE: Any = definedExternally
        var _ALPHA_ADD: Any = definedExternally
        var _ALPHA_COMBINE: Any = definedExternally
        var _ALPHA_SUBTRACT: Any = definedExternally
        var _ALPHA_MULTIPLY: Any = definedExternally
        var _ALPHA_MAXIMIZED: Any = definedExternally
        var _ALPHA_ONEONE: Any = definedExternally
        var _ALPHA_PREMULTIPLIED: Any = definedExternally
        var _ALPHA_PREMULTIPLIED_PORTERDUFF: Any = definedExternally
        var _ALPHA_INTERPOLATE: Any = definedExternally
        var _ALPHA_SCREENMODE: Any = definedExternally
        var _DELAYLOADSTATE_NONE: Any = definedExternally
        var _DELAYLOADSTATE_LOADED: Any = definedExternally
        var _DELAYLOADSTATE_LOADING: Any = definedExternally
        var _DELAYLOADSTATE_NOTLOADED: Any = definedExternally
        var _TEXTUREFORMAT_ALPHA: Any = definedExternally
        var _TEXTUREFORMAT_LUMINANCE: Any = definedExternally
        var _TEXTUREFORMAT_LUMINANCE_ALPHA: Any = definedExternally
        var _TEXTUREFORMAT_RGB: Any = definedExternally
        var _TEXTUREFORMAT_RGBA: Any = definedExternally
        var _TEXTURETYPE_UNSIGNED_INT: Any = definedExternally
        var _TEXTURETYPE_FLOAT: Any = definedExternally
        var _TEXTURETYPE_HALF_FLOAT: Any = definedExternally
        var _NEVER: Any = definedExternally
        var _ALWAYS: Any = definedExternally
        var _LESS: Any = definedExternally
        var _EQUAL: Any = definedExternally
        var _LEQUAL: Any = definedExternally
        var _GREATER: Any = definedExternally
        var _GEQUAL: Any = definedExternally
        var _NOTEQUAL: Any = definedExternally
        var NEVER: Number = definedExternally
        var ALWAYS: Number = definedExternally
        var LESS: Number = definedExternally
        var EQUAL: Number = definedExternally
        var LEQUAL: Number = definedExternally
        var GREATER: Number = definedExternally
        var GEQUAL: Number = definedExternally
        var NOTEQUAL: Number = definedExternally
        var _KEEP: Any = definedExternally
        var _REPLACE: Any = definedExternally
        var _INCR: Any = definedExternally
        var _DECR: Any = definedExternally
        var _INVERT: Any = definedExternally
        var _INCR_WRAP: Any = definedExternally
        var _DECR_WRAP: Any = definedExternally
        var KEEP: Number = definedExternally
        var REPLACE: Number = definedExternally
        var INCR: Number = definedExternally
        var DECR: Number = definedExternally
        var INVERT: Number = definedExternally
        var INCR_WRAP: Number = definedExternally
        var DECR_WRAP: Number = definedExternally
        var ALPHA_DISABLE: Number = definedExternally
        var ALPHA_ONEONE: Number = definedExternally
        var ALPHA_ADD: Number = definedExternally
        var ALPHA_COMBINE: Number = definedExternally
        var ALPHA_SUBTRACT: Number = definedExternally
        var ALPHA_MULTIPLY: Number = definedExternally
        var ALPHA_MAXIMIZED: Number = definedExternally
        var ALPHA_PREMULTIPLIED: Number = definedExternally
        var ALPHA_PREMULTIPLIED_PORTERDUFF: Number = definedExternally
        var ALPHA_INTERPOLATE: Number = definedExternally
        var ALPHA_SCREENMODE: Number = definedExternally
        var DELAYLOADSTATE_NONE: Number = definedExternally
        var DELAYLOADSTATE_LOADED: Number = definedExternally
        var DELAYLOADSTATE_LOADING: Number = definedExternally
        var DELAYLOADSTATE_NOTLOADED: Number = definedExternally
        var TEXTUREFORMAT_ALPHA: Number = definedExternally
        var TEXTUREFORMAT_LUMINANCE: Number = definedExternally
        var TEXTUREFORMAT_LUMINANCE_ALPHA: Number = definedExternally
        var TEXTUREFORMAT_RGB: Number = definedExternally
        var TEXTUREFORMAT_RGBA: Number = definedExternally
        var TEXTURETYPE_UNSIGNED_INT: Number = definedExternally
        var TEXTURETYPE_FLOAT: Number = definedExternally
        var TEXTURETYPE_HALF_FLOAT: Number = definedExternally
        var _SCALEMODE_FLOOR: Any = definedExternally
        var _SCALEMODE_NEAREST: Any = definedExternally
        var _SCALEMODE_CEILING: Any = definedExternally
        var SCALEMODE_FLOOR: Number = definedExternally
        var SCALEMODE_NEAREST: Number = definedExternally
        var SCALEMODE_CEILING: Number = definedExternally
        var Version: String = definedExternally
        var CollisionsEpsilon: Number = definedExternally
        var CodeRepository: String = definedExternally
        var ShadersRepository: String = definedExternally
        var audioEngine: AudioEngine = definedExternally
        fun isSupported(): Boolean = definedExternally
    }
}
external open class Node(name: String, scene: Scene) {
    open var name: String = definedExternally
    open var id: String = definedExternally
    open var uniqueId: Number = definedExternally
    open var state: String = definedExternally
    open var metadata: Any = definedExternally
    open var doNotSerialize: Boolean = definedExternally
    open var animations: Array<Animation> = definedExternally
    open var _ranges: Any = definedExternally
    open var onReady: (node: Node) -> Unit = definedExternally
    open var _childrenFlag: Any = definedExternally
    open var _isEnabled: Any = definedExternally
    open var _isReady: Any = definedExternally
    open var _currentRenderId: Number = definedExternally
    open var _parentRenderId: Any = definedExternally
    open var _waitingParentId: String = definedExternally
    open var _scene: Any = definedExternally
    open var _cache: Any = definedExternally
    open var _parentNode: Any = definedExternally
    open var _children: Any = definedExternally
    open var parent: Node = definedExternally
    open fun getClassName(): String = definedExternally
    open var onDisposeObservable: Observable<Node> = definedExternally
    open var _onDisposeObserver: Any = definedExternally
    open var onDispose: () -> Unit = definedExternally
    open fun getScene(): Scene = definedExternally
    open fun getEngine(): Engine = definedExternally
    open fun getWorldMatrix(): Matrix = definedExternally
    open fun _initCache(): Unit = definedExternally
    open fun updateCache(force: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _updateCache(ignoreParentClass: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _isSynchronized(): Boolean = definedExternally
    open fun _markSyncedWithParent(): Unit = definedExternally
    open fun isSynchronizedWithParent(): Boolean = definedExternally
    open fun isSynchronized(updateCache: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun hasNewParent(update: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun isReady(): Boolean = definedExternally
    open fun isEnabled(): Boolean = definedExternally
    open fun setEnabled(value: Boolean): Unit = definedExternally
    open fun isDescendantOf(ancestor: Node): Boolean = definedExternally
    open fun _getDescendants(results: Array<Node>, directDescendantsOnly: Boolean? = definedExternally /* null */, predicate: ((node: Node) -> Boolean)? = definedExternally /* null */): Unit = definedExternally
    open fun getDescendants(directDescendantsOnly: Boolean? = definedExternally /* null */, predicate: ((node: Node) -> Boolean)? = definedExternally /* null */): Array<Node> = definedExternally
    open fun getChildMeshes(directDecendantsOnly: Boolean? = definedExternally /* null */, predicate: ((node: Node) -> Boolean)? = definedExternally /* null */): Array<AbstractMesh> = definedExternally
    open fun getChildren(predicate: ((node: Node) -> Boolean)? = definedExternally /* null */): Array<Node> = definedExternally
    open fun _setReady(state: Boolean): Unit = definedExternally
    open fun getAnimationByName(name: String): Animation = definedExternally
    open fun createAnimationRange(name: String, from: Number, to: Number): Unit = definedExternally
    open fun deleteAnimationRange(name: String, deleteFrames: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun getAnimationRange(name: String): AnimationRange = definedExternally
    open fun beginAnimation(name: String, loop: Boolean? = definedExternally /* null */, speedRatio: Number? = definedExternally /* null */, onAnimationEnd: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
    open fun serializeAnimationRanges(): Any = definedExternally
    open fun dispose(): Unit = definedExternally
    companion object {
        fun ParseAnimationRanges(node: Node, parsedNode: Any, scene: Scene): Unit = definedExternally
    }
}
external interface IDisposable {
    fun dispose()
}
external open class PointerEventTypes {
    companion object {
        var _POINTERDOWN: Number = definedExternally
        var _POINTERUP: Number = definedExternally
        var _POINTERMOVE: Number = definedExternally
        var _POINTERWHEEL: Number = definedExternally
        var _POINTERPICK: Number = definedExternally
        var _POINTERTAP: Number = definedExternally
        var _POINTERDOUBLETAP: Number = definedExternally
        var POINTERDOWN: Number = definedExternally
        var POINTERUP: Number = definedExternally
        var POINTERMOVE: Number = definedExternally
        var POINTERWHEEL: Number = definedExternally
        var POINTERPICK: Number = definedExternally
        var POINTERTAP: Number = definedExternally
        var POINTERDOUBLETAP: Number = definedExternally
    }
}
external open class PointerInfoBase {
    constructor(type: Number, event: PointerEvent)
    constructor(type: Number, event: MouseWheelEvent)
    open var type: Number = definedExternally
    open var event: dynamic /* PointerEvent | MouseWheelEvent */ = definedExternally
}
external open class PointerInfoPre : PointerInfoBase {
    constructor(type: Number, event: PointerEvent, localX: Any, localY: Any)
    constructor(type: Number, event: MouseWheelEvent, localX: Any, localY: Any)
    open var localPosition: Vector2 = definedExternally
    open var skipOnPointerObservable: Boolean = definedExternally
}
external open class PointerInfo : PointerInfoBase {
    constructor(type: Number, event: PointerEvent, pickInfo: PickingInfo)
    constructor(type: Number, event: MouseWheelEvent, pickInfo: PickingInfo)
    open var pickInfo: PickingInfo = definedExternally
}
external open class RenderingGroupInfo {
    open var scene: Scene = definedExternally
    open var camera: Camera = definedExternally
    open var renderingGroupId: Number = definedExternally
    open var renderStage: Number = definedExternally
    companion object {
        var STAGE_PRECLEAR: Number = definedExternally
        var STAGE_PREOPAQUE: Number = definedExternally
        var STAGE_PRETRANSPARENT: Number = definedExternally
        var STAGE_POSTTRANSPARENT: Number = definedExternally
    }
}
external interface `T$3` {
    var min: Vector3
    var max: Vector3
}
external open class Scene(engine: Engine) : IAnimatable {
    open var autoClear: Boolean = definedExternally
    open var autoClearDepthAndStencil: Boolean = definedExternally
    open var clearColor: Color4 = definedExternally
    open var ambientColor: Color3 = definedExternally
    open var _environmentBRDFTexture: BaseTexture = definedExternally
    open var _environmentTexture: BaseTexture = definedExternally
    open var environmentTexture: BaseTexture = definedExternally
    open var _imageProcessingConfiguration: ImageProcessingConfiguration = definedExternally
    open var imageProcessingConfiguration: ImageProcessingConfiguration = definedExternally
    open var forceWireframe: Boolean = definedExternally
    open var _forcePointsCloud: Any = definedExternally
    open var forcePointsCloud: Boolean = definedExternally
    open var forceShowBoundingBoxes: Boolean = definedExternally
    open var clipPlane: Plane = definedExternally
    open var animationsEnabled: Boolean = definedExternally
    open var constantlyUpdateMeshUnderPointer: Boolean = definedExternally
    open var hoverCursor: String = definedExternally
    open var metadata: Any = definedExternally
    open var onDisposeObservable: Observable<Scene> = definedExternally
    open var _onDisposeObserver: Any = definedExternally
    open var onDispose: () -> Unit = definedExternally
    open var onBeforeRenderObservable: Observable<Scene> = definedExternally
    open var _onBeforeRenderObserver: Any = definedExternally
    open var beforeRender: () -> Unit = definedExternally
    open var onAfterRenderObservable: Observable<Scene> = definedExternally
    open var _onAfterRenderObserver: Any = definedExternally
    open var afterRender: () -> Unit = definedExternally
    open var onReadyObservable: Observable<Scene> = definedExternally
    open var onBeforeCameraRenderObservable: Observable<Camera> = definedExternally
    open var _onBeforeCameraRenderObserver: Any = definedExternally
    open var beforeCameraRender: () -> Unit = definedExternally
    open var onAfterCameraRenderObservable: Observable<Camera> = definedExternally
    open var _onAfterCameraRenderObserver: Any = definedExternally
    open var afterCameraRender: () -> Unit = definedExternally
    open var onNewCameraAddedObservable: Observable<Camera> = definedExternally
    open var onCameraRemovedObservable: Observable<Camera> = definedExternally
    open var onNewLightAddedObservable: Observable<Light> = definedExternally
    open var onLightRemovedObservable: Observable<Light> = definedExternally
    open var onNewGeometryAddedObservable: Observable<Geometry> = definedExternally
    open var onGeometryRemovedObservable: Observable<Geometry> = definedExternally
    open var onNewMeshAddedObservable: Observable<AbstractMesh> = definedExternally
    open var onMeshRemovedObservable: Observable<AbstractMesh> = definedExternally
    open var onRenderingGroupObservable: Observable<RenderingGroupInfo> = definedExternally
    override var animations: Array<Animation> = definedExternally
    open var pointerDownPredicate: (Mesh: AbstractMesh) -> Boolean = definedExternally
    open var pointerUpPredicate: (Mesh: AbstractMesh) -> Boolean = definedExternally
    open var pointerMovePredicate: (Mesh: AbstractMesh) -> Boolean = definedExternally
    open var _onPointerMove: Any = definedExternally
    open var _onPointerDown: Any = definedExternally
    open var _onPointerUp: Any = definedExternally
    open var onPointerMove: (evt: PointerEvent, pickInfo: PickingInfo) -> Unit = definedExternally
    open var onPointerDown: (evt: PointerEvent, pickInfo: PickingInfo) -> Unit = definedExternally
    open var onPointerUp: (evt: PointerEvent, pickInfo: PickingInfo) -> Unit = definedExternally
    open var onPointerPick: (evt: PointerEvent, pickInfo: PickingInfo) -> Unit = definedExternally
    open var onPrePointerObservable: Observable<PointerInfoPre> = definedExternally
    open var onPointerObservable: Observable<PointerInfo> = definedExternally
    open var unTranslatedPointer: Vector2 = definedExternally
    open var _initClickEvent: Any = definedExternally
    open var _initActionManager: Any = definedExternally
    open var _delayedSimpleClick: Any = definedExternally
    open var _delayedSimpleClickTimeout: Any = definedExternally
    open var _previousDelayedSimpleClickTimeout: Any = definedExternally
    open var _meshPickProceed: Any = definedExternally
    open var _previousButtonPressed: Any = definedExternally
    open var _previousHasSwiped: Any = definedExternally
    open var _currentPickResult: Any = definedExternally
    open var _previousPickResult: Any = definedExternally
    open var _isButtonPressed: Any = definedExternally
    open var _doubleClickOccured: Any = definedExternally
    open var cameraToUseForPointers: Camera = definedExternally
    open var _pointerX: Any = definedExternally
    open var _pointerY: Any = definedExternally
    open var _unTranslatedPointerX: Any = definedExternally
    open var _unTranslatedPointerY: Any = definedExternally
    open var _startingPointerPosition: Any = definedExternally
    open var _previousStartingPointerPosition: Any = definedExternally
    open var _startingPointerTime: Any = definedExternally
    open var _previousStartingPointerTime: Any = definedExternally
    open var _mirroredCameraPosition: Vector3 = definedExternally
    open var _onKeyDown: Any = definedExternally
    open var _onKeyUp: Any = definedExternally
    open var _useRightHandedSystem: Any = definedExternally
    open var useRightHandedSystem: Boolean = definedExternally
    open var _fogEnabled: Any = definedExternally
    open var fogEnabled: Boolean = definedExternally
    open var _fogMode: Any = definedExternally
    open var fogMode: Number = definedExternally
    open var fogColor: Color3 = definedExternally
    open var fogDensity: Number = definedExternally
    open var fogStart: Number = definedExternally
    open var fogEnd: Number = definedExternally
    open var _shadowsEnabled: Any = definedExternally
    open var shadowsEnabled: Boolean = definedExternally
    open var _lightsEnabled: Any = definedExternally
    open var lightsEnabled: Boolean = definedExternally
    open var lights: Array<Light> = definedExternally
    open var cameras: Array<Camera> = definedExternally
    open var activeCameras: Array<Camera> = definedExternally
    open var activeCamera: Camera = definedExternally
    open var meshes: Array<AbstractMesh> = definedExternally
    open var _geometries: Any = definedExternally
    open var materials: Array<Material> = definedExternally
    open var multiMaterials: Array<MultiMaterial> = definedExternally
    open var _defaultMaterial: Any = definedExternally
    open var defaultMaterial: Material = definedExternally
    open var _texturesEnabled: Any = definedExternally
    open var texturesEnabled: Boolean = definedExternally
    open var textures: Array<BaseTexture> = definedExternally
    open var particlesEnabled: Boolean = definedExternally
    open var particleSystems: Array<ParticleSystem> = definedExternally
    open var spritesEnabled: Boolean = definedExternally
    open var spriteManagers: Array<SpriteManager> = definedExternally
    open var layers: Array<Layer> = definedExternally
    open var highlightLayers: Array<HighlightLayer> = definedExternally
    open var _skeletonsEnabled: Any = definedExternally
    open var skeletonsEnabled: Boolean = definedExternally
    open var skeletons: Array<Skeleton> = definedExternally
    open var morphTargetManagers: Array<MorphTargetManager> = definedExternally
    open var lensFlaresEnabled: Boolean = definedExternally
    open var lensFlareSystems: Array<LensFlareSystem> = definedExternally
    open var collisionsEnabled: Boolean = definedExternally
    open var _workerCollisions: Any = definedExternally
    open var collisionCoordinator: ICollisionCoordinator = definedExternally
    open var gravity: Vector3 = definedExternally
    open var postProcessesEnabled: Boolean = definedExternally
    open var postProcessManager: PostProcessManager = definedExternally
    open var _postProcessRenderPipelineManager: Any = definedExternally
    open var postProcessRenderPipelineManager: PostProcessRenderPipelineManager = definedExternally
    open var renderTargetsEnabled: Boolean = definedExternally
    open var dumpNextRenderTargets: Boolean = definedExternally
    open var customRenderTargets: Array<RenderTargetTexture> = definedExternally
    open var useDelayedTextureLoading: Boolean = definedExternally
    open var importedMeshesFiles: Array<String> = definedExternally
    open var probesEnabled: Boolean = definedExternally
    open var reflectionProbes: Array<ReflectionProbe> = definedExternally
    open var database: Any = definedExternally
    open var actionManager: ActionManager = definedExternally
    open var _actionManagers: Array<ActionManager> = definedExternally
    open var _meshesForIntersections: Any = definedExternally
    open var proceduralTexturesEnabled: Boolean = definedExternally
    open var _proceduralTextures: Array<ProceduralTexture> = definedExternally
    open var mainSoundTrack: SoundTrack = definedExternally
    open var soundTracks: Array<SoundTrack> = definedExternally
    open var _audioEnabled: Any = definedExternally
    open var _headphone: Any = definedExternally
    open var simplificationQueue: SimplificationQueue = definedExternally
    open var _engine: Any = definedExternally
    open var _totalMeshesCounter: Any = definedExternally
    open var _totalLightsCounter: Any = definedExternally
    open var _totalMaterialsCounter: Any = definedExternally
    open var _totalTexturesCounter: Any = definedExternally
    open var _totalVertices: Any = definedExternally
    open var _activeIndices: PerfCounter = definedExternally
    open var _activeParticles: PerfCounter = definedExternally
    open var _lastFrameDuration: Any = definedExternally
    open var _evaluateActiveMeshesDuration: Any = definedExternally
    open var _renderTargetsDuration: Any = definedExternally
    open var _particlesDuration: PerfCounter = definedExternally
    open var _renderDuration: Any = definedExternally
    open var _spritesDuration: PerfCounter = definedExternally
    open var _activeBones: PerfCounter = definedExternally
    open var _animationRatio: Any = definedExternally
    open var _animationTimeLast: Any = definedExternally
    open var _animationTime: Any = definedExternally
    open var animationTimeScale: Number = definedExternally
    open var _cachedMaterial: Material = definedExternally
    open var _cachedEffect: Effect = definedExternally
    open var _cachedVisibility: Number = definedExternally
    open var _renderId: Any = definedExternally
    open var _executeWhenReadyTimeoutId: Any = definedExternally
    open var _intermediateRendering: Any = definedExternally
    open var _viewUpdateFlag: Any = definedExternally
    open var _projectionUpdateFlag: Any = definedExternally
    open var _toBeDisposed: SmartArray<IDisposable> = definedExternally
    open var _pendingData: Any = definedExternally
    open var _activeMeshes: Any = definedExternally
    open var _processedMaterials: Any = definedExternally
    open var _renderTargets: Any = definedExternally
    open var _activeParticleSystems: SmartArray<ParticleSystem> = definedExternally
    open var _activeSkeletons: Any = definedExternally
    open var _softwareSkinnedMeshes: Any = definedExternally
    open var _renderingManager: Any = definedExternally
    open var _physicsEngine: Any = definedExternally
    open var _activeAnimatables: Array<Animatable> = definedExternally
    open var _transformMatrix: Any = definedExternally
    open var _sceneUbo: Any = definedExternally
    open var _pickWithRayInverseMatrix: Any = definedExternally
    open var _boundingBoxRenderer: Any = definedExternally
    open var _outlineRenderer: Any = definedExternally
    open var _viewMatrix: Any = definedExternally
    open var _projectionMatrix: Any = definedExternally
    open var _frustumPlanes: Any = definedExternally
    open var frustumPlanes: Array<Plane> = definedExternally
    open var requireLightSorting: Boolean = definedExternally
    open var _selectionOctree: Any = definedExternally
    open var _pointerOverMesh: Any = definedExternally
    open var _pointerOverSprite: Any = definedExternally
    open var _debugLayer: Any = definedExternally
    open var _depthRenderer: Any = definedExternally
    open var _geometryBufferRenderer: Any = definedExternally
    open var _uniqueIdCounter: Any = definedExternally
    open var _pickedDownMesh: Any = definedExternally
    open var _pickedUpMesh: Any = definedExternally
    open var _pickedDownSprite: Any = definedExternally
    open var _externalData: Any = definedExternally
    open var _uid: Any = definedExternally
    open var debugLayer: DebugLayer = definedExternally
    open var workerCollisions: Boolean = definedExternally
    open var selectionOctree: Octree<AbstractMesh> = definedExternally
    open var meshUnderPointer: AbstractMesh = definedExternally
    open var pointerX: Number = definedExternally
    open var pointerY: Number = definedExternally
    open fun getCachedMaterial(): Material = definedExternally
    open fun getCachedEffect(): Effect = definedExternally
    open fun getCachedVisibility(): Number = definedExternally
    open fun isCachedMaterialValid(material: Material, effect: Effect, visibility: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun getBoundingBoxRenderer(): BoundingBoxRenderer = definedExternally
    open fun getOutlineRenderer(): OutlineRenderer = definedExternally
    open fun getEngine(): Engine = definedExternally
    open fun getTotalVertices(): Number = definedExternally
    open var totalVerticesPerfCounter: PerfCounter = definedExternally
    open fun getActiveIndices(): Number = definedExternally
    open var totalActiveIndicesPerfCounter: PerfCounter = definedExternally
    open fun getActiveParticles(): Number = definedExternally
    open var activeParticlesPerfCounter: PerfCounter = definedExternally
    open fun getActiveBones(): Number = definedExternally
    open var activeBonesPerfCounter: PerfCounter = definedExternally
    open fun getLastFrameDuration(): Number = definedExternally
    open var lastFramePerfCounter: PerfCounter = definedExternally
    open fun getEvaluateActiveMeshesDuration(): Number = definedExternally
    open var evaluateActiveMeshesDurationPerfCounter: PerfCounter = definedExternally
    open fun getActiveMeshes(): SmartArray<Mesh> = definedExternally
    open fun getRenderTargetsDuration(): Number = definedExternally
    open fun getRenderDuration(): Number = definedExternally
    open var renderDurationPerfCounter: PerfCounter = definedExternally
    open fun getParticlesDuration(): Number = definedExternally
    open var particlesDurationPerfCounter: PerfCounter = definedExternally
    open fun getSpritesDuration(): Number = definedExternally
    open var spriteDuractionPerfCounter: PerfCounter = definedExternally
    open fun getAnimationRatio(): Number = definedExternally
    open fun getRenderId(): Number = definedExternally
    open fun incrementRenderId(): Unit = definedExternally
    open fun _updatePointerPosition(evt: Any): Unit = definedExternally
    open fun _createUbo(): Unit = definedExternally
    open fun attachControl(attachUp: Boolean? = definedExternally /* null */, attachDown: Boolean? = definedExternally /* null */, attachMove: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(): Unit = definedExternally
    open fun isReady(): Boolean = definedExternally
    open fun resetCachedMaterial(): Unit = definedExternally
    open fun registerBeforeRender(func: () -> Unit): Unit = definedExternally
    open fun unregisterBeforeRender(func: () -> Unit): Unit = definedExternally
    open fun registerAfterRender(func: () -> Unit): Unit = definedExternally
    open fun unregisterAfterRender(func: () -> Unit): Unit = definedExternally
    open fun _addPendingData(data: Any): Unit = definedExternally
    open fun _removePendingData(data: Any): Unit = definedExternally
    open fun getWaitingItemsCount(): Number = definedExternally
    open fun executeWhenReady(func: () -> Unit): Unit = definedExternally
    open fun _checkIsReady(): Unit = definedExternally
    open fun beginAnimation(target: Any, from: Number, to: Number, loop: Boolean? = definedExternally /* null */, speedRatio: Number? = definedExternally /* null */, onAnimationEnd: (() -> Unit)? = definedExternally /* null */, animatable: Animatable? = definedExternally /* null */): Animatable = definedExternally
    open fun beginDirectAnimation(target: Any, animations: Array<Animation>, from: Number, to: Number, loop: Boolean? = definedExternally /* null */, speedRatio: Number? = definedExternally /* null */, onAnimationEnd: (() -> Unit)? = definedExternally /* null */): Animatable = definedExternally
    open fun getAnimatableByTarget(target: Any): Animatable = definedExternally
    open var Animatables: Array<Animatable> = definedExternally
    open fun stopAnimation(target: Any, animationName: String? = definedExternally /* null */): Unit = definedExternally
    open fun _animate(): Unit = definedExternally
    open fun getViewMatrix(): Matrix = definedExternally
    open fun getProjectionMatrix(): Matrix = definedExternally
    open fun getTransformMatrix(): Matrix = definedExternally
    open fun setTransformMatrix(view: Matrix, projection: Matrix): Unit = definedExternally
    open fun getSceneUniformBuffer(): UniformBuffer = definedExternally
    open fun getUniqueId(): Number = definedExternally
    open fun addMesh(newMesh: AbstractMesh): Unit = definedExternally
    open fun removeMesh(toRemove: AbstractMesh): Number = definedExternally
    open fun removeSkeleton(toRemove: Skeleton): Number = definedExternally
    open fun removeMorphTargetManager(toRemove: MorphTargetManager): Number = definedExternally
    open fun removeLight(toRemove: Light): Number = definedExternally
    open fun removeCamera(toRemove: Camera): Number = definedExternally
    open fun addLight(newLight: Light): Unit = definedExternally
    open fun sortLightsByPriority(): Unit = definedExternally
    open fun addCamera(newCamera: Camera): Unit = definedExternally
    open fun switchActiveCamera(newCamera: Camera, attachControl: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setActiveCameraByID(id: String): Camera = definedExternally
    open fun setActiveCameraByName(name: String): Camera = definedExternally
    open fun getMaterialByID(id: String): Material = definedExternally
    open fun getMaterialByName(name: String): Material = definedExternally
    open fun getLensFlareSystemByName(name: String): LensFlareSystem = definedExternally
    open fun getLensFlareSystemByID(id: String): LensFlareSystem = definedExternally
    open fun getCameraByID(id: String): Camera = definedExternally
    open fun getCameraByUniqueID(uniqueId: Number): Camera = definedExternally
    open fun getCameraByName(name: String): Camera = definedExternally
    open fun getBoneByID(id: String): Bone = definedExternally
    open fun getBoneByName(name: String): Bone = definedExternally
    open fun getLightByName(name: String): Light = definedExternally
    open fun getLightByID(id: String): Light = definedExternally
    open fun getLightByUniqueID(uniqueId: Number): Light = definedExternally
    open fun getParticleSystemByID(id: String): ParticleSystem = definedExternally
    open fun getGeometryByID(id: String): Geometry = definedExternally
    open fun pushGeometry(geometry: Geometry, force: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun removeGeometry(geometry: Geometry): Boolean = definedExternally
    open fun getGeometries(): Array<Geometry> = definedExternally
    open fun getMeshByID(id: String): AbstractMesh = definedExternally
    open fun getMeshesByID(id: String): Array<AbstractMesh> = definedExternally
    open fun getMeshByUniqueID(uniqueId: Number): AbstractMesh = definedExternally
    open fun getLastMeshByID(id: String): AbstractMesh = definedExternally
    open fun getLastEntryByID(id: String): Node = definedExternally
    open fun getNodeByID(id: String): Node = definedExternally
    open fun getNodeByName(name: String): Node = definedExternally
    open fun getMeshByName(name: String): AbstractMesh = definedExternally
    open fun getSoundByName(name: String): Sound = definedExternally
    open fun getLastSkeletonByID(id: String): Skeleton = definedExternally
    open fun getSkeletonById(id: String): Skeleton = definedExternally
    open fun getSkeletonByName(name: String): Skeleton = definedExternally
    open fun getMorphTargetManagerById(id: Number): MorphTargetManager = definedExternally
    open fun isActiveMesh(mesh: Mesh): Boolean = definedExternally
    open fun getHighlightLayerByName(name: String): HighlightLayer = definedExternally
    open var uid: String = definedExternally
    open fun <T> addExternalData(key: String, data: T): Boolean = definedExternally
    open fun <T> getExternalData(key: String): T = definedExternally
    open fun <T> getOrAddExternalDataWithFactory(key: String, factory: (k: String) -> T): T = definedExternally
    open fun removeExternalData(key: Any): Boolean = definedExternally
    open fun _evaluateSubMesh(subMesh: Any, mesh: Any): Unit = definedExternally
    open fun _isInIntermediateRendering(): Boolean = definedExternally
    open fun _evaluateActiveMeshes(): Unit = definedExternally
    open fun _activeMesh(sourceMesh: Any, mesh: Any): Unit = definedExternally
    open fun updateTransformMatrix(force: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _renderForCamera(camera: Any): Unit = definedExternally
    open fun _processSubCameras(camera: Any): Unit = definedExternally
    open fun _checkIntersections(): Unit = definedExternally
    open fun render(): Unit = definedExternally
    open fun _updateAudioParameters(): Unit = definedExternally
    open var audioEnabled: Boolean = definedExternally
    open fun _disableAudio(): Unit = definedExternally
    open fun _enableAudio(): Unit = definedExternally
    open var headphone: Boolean = definedExternally
    open fun _switchAudioModeForHeadphones(): Unit = definedExternally
    open fun _switchAudioModeForNormalSpeakers(): Unit = definedExternally
    open fun enableDepthRenderer(): DepthRenderer = definedExternally
    open fun disableDepthRenderer(): Unit = definedExternally
    open fun enableGeometryBufferRenderer(ratio: Number? = definedExternally /* null */): GeometryBufferRenderer = definedExternally
    open fun disableGeometryBufferRenderer(): Unit = definedExternally
    open fun freezeMaterials(): Unit = definedExternally
    open fun unfreezeMaterials(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open var isDisposed: Boolean = definedExternally
    open fun disposeSounds(): Unit = definedExternally
    open fun getWorldExtends(): `T$3` = definedExternally
    open fun createOrUpdateSelectionOctree(maxCapacity: Number? = definedExternally /* null */, maxDepth: Number? = definedExternally /* null */): Octree<AbstractMesh> = definedExternally
    open fun createPickingRay(x: Number, y: Number, world: Matrix, camera: Camera, cameraViewSpace: Boolean? = definedExternally /* null */): Ray = definedExternally
    open fun createPickingRayInCameraSpace(x: Number, y: Number, camera: Camera): Ray = definedExternally
    open fun _internalPick(rayFunction: Any, predicate: Any, fastCheck: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _internalMultiPick(rayFunction: Any, predicate: Any): Unit = definedExternally
    open fun _internalPickSprites(ray: Any, predicate: Any? = definedExternally /* null */, fastCheck: Any? = definedExternally /* null */, camera: Any? = definedExternally /* null */): Unit = definedExternally
    open fun pick(x: Number, y: Number, predicate: ((mesh: AbstractMesh) -> Boolean)? = definedExternally /* null */, fastCheck: Boolean? = definedExternally /* null */, camera: Camera? = definedExternally /* null */): PickingInfo = definedExternally
    open fun pickSprite(x: Number, y: Number, predicate: ((sprite: Sprite) -> Boolean)? = definedExternally /* null */, fastCheck: Boolean? = definedExternally /* null */, camera: Camera? = definedExternally /* null */): PickingInfo = definedExternally
    open fun pickWithRay(ray: Ray, predicate: (mesh: Mesh) -> Boolean, fastCheck: Boolean? = definedExternally /* null */): PickingInfo = definedExternally
    open fun multiPick(x: Number, y: Number, predicate: ((mesh: AbstractMesh) -> Boolean)? = definedExternally /* null */, camera: Camera? = definedExternally /* null */): Array<PickingInfo> = definedExternally
    open fun multiPickWithRay(ray: Ray, predicate: (mesh: Mesh) -> Boolean): Array<PickingInfo> = definedExternally
    open fun setPointerOverMesh(mesh: AbstractMesh): Unit = definedExternally
    open fun getPointerOverMesh(): AbstractMesh = definedExternally
    open fun setPointerOverSprite(sprite: Sprite): Unit = definedExternally
    open fun getPointerOverSprite(): Sprite = definedExternally
    open fun getPhysicsEngine(): PhysicsEngine = definedExternally
    open fun enablePhysics(gravity: Vector3? = definedExternally /* null */, plugin: IPhysicsEnginePlugin? = definedExternally /* null */): Boolean = definedExternally
    open fun disablePhysicsEngine(): Unit = definedExternally
    open fun isPhysicsEnabled(): Boolean = definedExternally
    open fun deleteCompoundImpostor(compound: Any): Unit = definedExternally
    open fun createDefaultCameraOrLight(createArcRotateCamera: Boolean? = definedExternally /* null */, replace: Boolean? = definedExternally /* null */, attachCameraControls: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun createDefaultSkybox(environmentTexture: BaseTexture? = definedExternally /* null */, pbr: Boolean? = definedExternally /* null */, scale: Number? = definedExternally /* null */, blur: Number? = definedExternally /* null */): Mesh = definedExternally
    open fun _getByTags(list: Any, tagsQuery: Any, forEach: Any? = definedExternally /* null */): Unit = definedExternally
    open fun getMeshesByTags(tagsQuery: String, forEach: ((mesh: AbstractMesh) -> Unit)? = definedExternally /* null */): Array<Mesh> = definedExternally
    open fun getCamerasByTags(tagsQuery: String, forEach: ((camera: Camera) -> Unit)? = definedExternally /* null */): Array<Camera> = definedExternally
    open fun getLightsByTags(tagsQuery: String, forEach: ((light: Light) -> Unit)? = definedExternally /* null */): Array<Light> = definedExternally
    open fun getMaterialByTags(tagsQuery: String, forEach: ((material: Material) -> Unit)? = definedExternally /* null */): Array<Material> = definedExternally
    open fun setRenderingOrder(renderingGroupId: Number, opaqueSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */, alphaTestSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */, transparentSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */): Unit = definedExternally
    open fun setRenderingAutoClearDepthStencil(renderingGroupId: Number, autoClearDepthStencil: Boolean, depth: Boolean? = definedExternally /* null */, stencil: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun markAllMaterialsAsDirty(flag: Number, predicate: ((mat: Material) -> Boolean)? = definedExternally /* null */): Unit = definedExternally
    companion object {
        var _FOGMODE_NONE: Any = definedExternally
        var _FOGMODE_EXP: Any = definedExternally
        var _FOGMODE_EXP2: Any = definedExternally
        var _FOGMODE_LINEAR: Any = definedExternally
        var MinDeltaTime: Number = definedExternally
        var MaxDeltaTime: Number = definedExternally
        var FOGMODE_NONE: Number = definedExternally
        var FOGMODE_EXP: Number = definedExternally
        var FOGMODE_EXP2: Number = definedExternally
        var FOGMODE_LINEAR: Number = definedExternally
        var DragMovementThreshold: Number = definedExternally
        var LongPressDelay: Number = definedExternally
        var DoubleClickDelay: Number = definedExternally
        var ExclusiveDoubleClickMode: Boolean = definedExternally
    }
}
external interface `T$9` {
    var name: String
    var targetType: String
    var value: String
}
external open class Action(triggerOptions: Any, condition: Condition? = definedExternally /* null */) {
    open var triggerOptions: Any = definedExternally
    open var trigger: Number = definedExternally
    open var _actionManager: ActionManager = definedExternally
    open var _nextActiveAction: Any = definedExternally
    open var _child: Any = definedExternally
    open var _condition: Any = definedExternally
    open var _triggerParameter: Any = definedExternally
    open fun _prepare(): Unit = definedExternally
    open fun getTriggerParameter(): Any = definedExternally
    open fun _executeCurrent(evt: ActionEvent): Unit = definedExternally
    open fun execute(evt: ActionEvent): Unit = definedExternally
    open fun skipToNextActiveAction(): Unit = definedExternally
    open fun then(action: Action): Action = definedExternally
    open fun _getProperty(propertyPath: String): String = definedExternally
    open fun _getEffectiveTarget(target: Any, propertyPath: String): Any = definedExternally
    open fun serialize(parent: Any): Any = definedExternally
    open fun _serialize(serializedAction: Any, parent: Any? = definedExternally /* null */): Any = definedExternally
    companion object {
        var _SerializeValueAsString: (value: Any) -> String = definedExternally
        /*var _GetTargetProperty: `(target: dynamic /* Scene | Node */) -> `T$9`` = definedExternally*/
    }
}
external open class ActionEvent(source: Any, pointerX: Number, pointerY: Number, meshUnderPointer: AbstractMesh, sourceEvent: Any? = definedExternally /* null */, additionalData: Any? = definedExternally /* null */) {
    open var source: Any = definedExternally
    open var pointerX: Number = definedExternally
    open var pointerY: Number = definedExternally
    open var meshUnderPointer: AbstractMesh = definedExternally
    open var sourceEvent: Any = definedExternally
    open var additionalData: Any = definedExternally
    companion object {
        fun CreateNew(source: AbstractMesh, evt: Event? = definedExternally /* null */, additionalData: Any? = definedExternally /* null */): ActionEvent = definedExternally
        fun CreateNewFromSprite(source: Sprite, scene: Scene, evt: Event? = definedExternally /* null */, additionalData: Any? = definedExternally /* null */): ActionEvent = definedExternally
        fun CreateNewFromScene(scene: Scene, evt: Event): ActionEvent = definedExternally
        fun CreateNewFromPrimitive(prim: Any, pointerPos: Vector2, evt: Event? = definedExternally /* null */, additionalData: Any? = definedExternally /* null */): ActionEvent = definedExternally
    }
}
external open class ActionManager(scene: Scene) {
    open var actions: Array<Action> = definedExternally
    open var hoverCursor: String = definedExternally
    open var _scene: Any = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun getScene(): Scene = definedExternally
    open fun hasSpecificTriggers(triggers: Array<Number>): Boolean = definedExternally
    open fun hasSpecificTrigger(trigger: Number): Boolean = definedExternally
    open var hasPointerTriggers: Boolean = definedExternally
    open var hasPickTriggers: Boolean = definedExternally
    open fun registerAction(action: Action): Action = definedExternally
    open fun processTrigger(trigger: Number, evt: ActionEvent): Unit = definedExternally
    open fun _getEffectiveTarget(target: Any, propertyPath: String): Any = definedExternally
    open fun _getProperty(propertyPath: String): String = definedExternally
    open fun serialize(name: String): Any = definedExternally
    companion object {
        var _NothingTrigger: Any = definedExternally
        var _OnPickTrigger: Any = definedExternally
        var _OnLeftPickTrigger: Any = definedExternally
        var _OnRightPickTrigger: Any = definedExternally
        var _OnCenterPickTrigger: Any = definedExternally
        var _OnPickDownTrigger: Any = definedExternally
        var _OnDoublePickTrigger: Any = definedExternally
        var _OnPickUpTrigger: Any = definedExternally
        var _OnLongPressTrigger: Any = definedExternally
        var _OnPointerOverTrigger: Any = definedExternally
        var _OnPointerOutTrigger: Any = definedExternally
        var _OnEveryFrameTrigger: Any = definedExternally
        var _OnIntersectionEnterTrigger: Any = definedExternally
        var _OnIntersectionExitTrigger: Any = definedExternally
        var _OnKeyDownTrigger: Any = definedExternally
        var _OnKeyUpTrigger: Any = definedExternally
        var _OnPickOutTrigger: Any = definedExternally
        var NothingTrigger: Number = definedExternally
        var OnPickTrigger: Number = definedExternally
        var OnLeftPickTrigger: Number = definedExternally
        var OnRightPickTrigger: Number = definedExternally
        var OnCenterPickTrigger: Number = definedExternally
        var OnPickDownTrigger: Number = definedExternally
        var OnDoublePickTrigger: Number = definedExternally
        var OnPickUpTrigger: Number = definedExternally
        var OnPickOutTrigger: Number = definedExternally
        var OnLongPressTrigger: Number = definedExternally
        var OnPointerOverTrigger: Number = definedExternally
        var OnPointerOutTrigger: Number = definedExternally
        var OnEveryFrameTrigger: Number = definedExternally
        var OnIntersectionEnterTrigger: Number = definedExternally
        var OnIntersectionExitTrigger: Number = definedExternally
        var OnKeyDownTrigger: Number = definedExternally
        var OnKeyUpTrigger: Number = definedExternally
        var Triggers: Any = definedExternally
        var HasTriggers: Boolean = definedExternally
        var HasPickTriggers: Boolean = definedExternally
        fun HasSpecificTrigger(trigger: Number): Boolean = definedExternally
        fun Parse(parsedActions: Any, `object`: AbstractMesh, scene: Scene): Unit = definedExternally
        fun GetTriggerName(trigger: Number): String = definedExternally
    }
}
external open class Condition(actionManager: ActionManager) {
    open var _actionManager: ActionManager = definedExternally
    open var _evaluationId: Number = definedExternally
    open var _currentResult: Boolean = definedExternally
    open fun isValid(): Boolean = definedExternally
    open fun _getProperty(propertyPath: String): String = definedExternally
    open fun _getEffectiveTarget(target: Any, propertyPath: String): Any = definedExternally
    open fun serialize(): Any = definedExternally
    open fun _serialize(serializedCondition: Any): Any = definedExternally
}
external open class ValueCondition(actionManager: ActionManager, target: Any, propertyPath: String, value: Any, operator: Number? = definedExternally /* null */) : Condition {
    open var propertyPath: String = definedExternally
    open var value: Any = definedExternally
    open var operator: Number = definedExternally
    override var _actionManager: ActionManager = definedExternally
    open var _target: Any = definedExternally
    open var _effectiveTarget: Any = definedExternally
    open var _property: Any = definedExternally
    override fun isValid(): Boolean = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        var _IsEqual: Any = definedExternally
        var _IsDifferent: Any = definedExternally
        var _IsGreater: Any = definedExternally
        var _IsLesser: Any = definedExternally
        var IsEqual: Number = definedExternally
        var IsDifferent: Number = definedExternally
        var IsGreater: Number = definedExternally
        var IsLesser: Number = definedExternally
        fun GetOperatorName(operator: Number): String = definedExternally
    }
}
external open class PredicateCondition(actionManager: ActionManager, predicate: () -> Boolean) : Condition {
    open var predicate: () -> Boolean = definedExternally
    override var _actionManager: ActionManager = definedExternally
    override fun isValid(): Boolean = definedExternally
}
external open class StateCondition(actionManager: ActionManager, target: Any, value: String) : Condition {
    open var value: String = definedExternally
    override var _actionManager: ActionManager = definedExternally
    open var _target: Any = definedExternally
    override fun isValid(): Boolean = definedExternally
    override fun serialize(): Any = definedExternally
}
external open class SwitchBooleanAction(triggerOptions: Any, target: Any, propertyPath: String, condition: Condition? = definedExternally /* null */) : Action {
    open var propertyPath: String = definedExternally
    open var _target: Any = definedExternally
    open var _effectiveTarget: Any = definedExternally
    open var _property: Any = definedExternally
    override fun _prepare(): Unit = definedExternally
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class SetStateAction(triggerOptions: Any, target: Any, value: String, condition: Condition? = definedExternally /* null */) : Action {
    open var value: String = definedExternally
    open var _target: Any = definedExternally
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class SetValueAction(triggerOptions: Any, target: Any, propertyPath: String, value: Any, condition: Condition? = definedExternally /* null */) : Action {
    open var propertyPath: String = definedExternally
    open var value: Any = definedExternally
    open var _target: Any = definedExternally
    open var _effectiveTarget: Any = definedExternally
    open var _property: Any = definedExternally
    override fun _prepare(): Unit = definedExternally
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class IncrementValueAction(triggerOptions: Any, target: Any, propertyPath: String, value: Any, condition: Condition? = definedExternally /* null */) : Action {
    open var propertyPath: String = definedExternally
    open var value: Any = definedExternally
    open var _target: Any = definedExternally
    open var _effectiveTarget: Any = definedExternally
    open var _property: Any = definedExternally
    override fun _prepare(): Unit = definedExternally
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class PlayAnimationAction(triggerOptions: Any, target: Any, from: Number, to: Number, loop: Boolean? = definedExternally /* null */, condition: Condition? = definedExternally /* null */) : Action {
    open var from: Number = definedExternally
    open var to: Number = definedExternally
    open var loop: Boolean = definedExternally
    open var _target: Any = definedExternally
    override fun _prepare(): Unit = definedExternally
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class StopAnimationAction(triggerOptions: Any, target: Any, condition: Condition? = definedExternally /* null */) : Action {
    open var _target: Any = definedExternally
    override fun _prepare(): Unit = definedExternally
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class DoNothingAction(triggerOptions: Any? = definedExternally /* null */, condition: Condition? = definedExternally /* null */) : Action {
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class CombineAction(triggerOptions: Any, children: Array<Action>, condition: Condition? = definedExternally /* null */) : Action {
    open var children: Array<Action> = definedExternally
    override fun _prepare(): Unit = definedExternally
    override fun execute(evt: ActionEvent): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class ExecuteCodeAction(triggerOptions: Any, func: (evt: ActionEvent) -> Unit, condition: Condition? = definedExternally /* null */) : Action {
    open var func: (evt: ActionEvent) -> Unit = definedExternally
    override fun execute(evt: ActionEvent): Unit = definedExternally
}
external open class SetParentAction(triggerOptions: Any, target: Any, parent: Any, condition: Condition? = definedExternally /* null */) : Action {
    open var _parent: Any = definedExternally
    open var _target: Any = definedExternally
    override fun _prepare(): Unit = definedExternally
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class PlaySoundAction(triggerOptions: Any, sound: Sound, condition: Condition? = definedExternally /* null */) : Action {
    open var _sound: Any = definedExternally
    override fun _prepare(): Unit = definedExternally
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class StopSoundAction(triggerOptions: Any, sound: Sound, condition: Condition? = definedExternally /* null */) : Action {
    open var _sound: Any = definedExternally
    override fun _prepare(): Unit = definedExternally
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class InterpolateValueAction(triggerOptions: Any, target: Any, propertyPath: String, value: Any, duration: Number? = definedExternally /* null */, condition: Condition? = definedExternally /* null */, stopOtherAnimations: Boolean? = definedExternally /* null */, onInterpolationDone: (() -> Unit)? = definedExternally /* null */) : Action {
    open var propertyPath: String = definedExternally
    open var value: Any = definedExternally
    open var duration: Number = definedExternally
    open var stopOtherAnimations: Boolean = definedExternally
    open var onInterpolationDone: () -> Unit = definedExternally
    open var _target: Any = definedExternally
    open var _effectiveTarget: Any = definedExternally
    open var _property: Any = definedExternally
    override fun _prepare(): Unit = definedExternally
    open fun execute(): Unit = definedExternally
    override fun serialize(parent: Any): Any = definedExternally
}
external open class Animatable(scene: Scene, target: Any, fromFrame: Number? = definedExternally /* null */, toFrame: Number? = definedExternally /* null */, loopAnimation: Boolean? = definedExternally /* null */, speedRatio: Number? = definedExternally /* null */, onAnimationEnd: Any? = definedExternally /* null */, animations: Any? = definedExternally /* null */) {
    open var target: Any = definedExternally
    open var fromFrame: Number = definedExternally
    open var toFrame: Number = definedExternally
    open var loopAnimation: Boolean = definedExternally
    open var speedRatio: Number = definedExternally
    open var onAnimationEnd: Any = definedExternally
    open var _localDelayOffset: Any = definedExternally
    open var _pausedDelay: Any = definedExternally
    open var _animations: Any = definedExternally
    open var _paused: Any = definedExternally
    open var _scene: Any = definedExternally
    open var animationStarted: Boolean = definedExternally
    open fun getAnimations(): Array<Animation> = definedExternally
    open fun appendAnimations(target: Any, animations: Array<Animation>): Unit = definedExternally
    open fun getAnimationByTargetProperty(property: String): Animation = definedExternally
    open fun reset(): Unit = definedExternally
    open fun enableBlending(blendingSpeed: Number): Unit = definedExternally
    open fun disableBlending(): Unit = definedExternally
    open fun goToFrame(frame: Number): Unit = definedExternally
    open fun pause(): Unit = definedExternally
    open fun restart(): Unit = definedExternally
    open fun stop(animationName: String? = definedExternally /* null */): Unit = definedExternally
    open fun _animate(delay: Number): Boolean = definedExternally
}
external open class AnimationRange(name: String, from: Number, to: Number) {
    open var name: String = definedExternally
    open var from: Number = definedExternally
    open var to: Number = definedExternally
    open fun clone(): AnimationRange = definedExternally
}
external open class AnimationEvent(frame: Number, action: () -> Unit, onlyOnce: Boolean? = definedExternally /* null */) {
    open var frame: Number = definedExternally
    open var action: () -> Unit = definedExternally
    open var onlyOnce: Boolean = definedExternally
    open var isDone: Boolean = definedExternally
}
external open class PathCursor(path: Path2) {
    open var path: Any = definedExternally
    open var _onchange: Any = definedExternally
    open var value: Number = definedExternally
    open var animations: Array<Animation> = definedExternally
    open fun getPoint(): Vector3 = definedExternally
    open fun moveAhead(step: Number? = definedExternally /* null */): PathCursor = definedExternally
    open fun moveBack(step: Number? = definedExternally /* null */): PathCursor = definedExternally
    open fun move(step: Number): PathCursor = definedExternally
    open fun ensureLimits(): Unit = definedExternally
    open fun markAsDirty(propertyName: Any): Unit = definedExternally
    open fun raiseOnChange(): Unit = definedExternally
    open fun onchange(f: (cursor: PathCursor) -> Unit): PathCursor = definedExternally
}
external interface `T$10` {
    var frame: Number
    var value: Any
}
external interface `T$11` {
    var frame: Number
    var value: Any
}
external open class Animation(name: String, targetProperty: String, framePerSecond: Number, dataType: Number, loopMode: Number? = definedExternally /* null */, enableBlending: Boolean? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var targetProperty: String = definedExternally
    open var framePerSecond: Number = definedExternally
    open var dataType: Number = definedExternally
    open var loopMode: Number = definedExternally
    open var enableBlending: Boolean = definedExternally
    open var _keys: Any = definedExternally
    open var _offsetsCache: Any = definedExternally
    open var _highLimitsCache: Any = definedExternally
    open var _stopped: Any = definedExternally
    open var _target: Any = definedExternally
    open var _blendingFactor: Any = definedExternally
    open var _easingFunction: Any = definedExternally
    open var _events: Any = definedExternally
    open var targetPropertyPath: Array<String> = definedExternally
    open var currentFrame: Number = definedExternally
    open var allowMatricesInterpolation: Boolean = definedExternally
    open var blendingSpeed: Number = definedExternally
    open var _originalBlendValue: Any = definedExternally
    open var _ranges: Any = definedExternally
    open fun toString(fullDetails: Boolean? = definedExternally /* null */): String = definedExternally
    open fun addEvent(event: AnimationEvent): Unit = definedExternally
    open fun removeEvents(frame: Number): Unit = definedExternally
    open fun createRange(name: String, from: Number, to: Number): Unit = definedExternally
    open fun deleteRange(name: String, deleteFrames: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun getRange(name: String): AnimationRange = definedExternally
    open fun reset(): Unit = definedExternally
    open fun isStopped(): Boolean = definedExternally
    open fun getKeys(): Array<`T$10`> = definedExternally
    open fun getHighestFrame(): Number = definedExternally
    open fun getEasingFunction(): IEasingFunction = definedExternally
    open fun setEasingFunction(easingFunction: EasingFunction): Unit = definedExternally
    open fun floatInterpolateFunction(startValue: Number, endValue: Number, gradient: Number): Number = definedExternally
    open fun floatInterpolateFunctionWithTangents(startValue: Number, outTangent: Number, endValue: Number, inTangent: Number, gradient: Number): Number = definedExternally
    open fun quaternionInterpolateFunction(startValue: Quaternion, endValue: Quaternion, gradient: Number): Quaternion = definedExternally
    open fun quaternionInterpolateFunctionWithTangents(startValue: Quaternion, outTangent: Quaternion, endValue: Quaternion, inTangent: Quaternion, gradient: Number): Quaternion = definedExternally
    open fun vector3InterpolateFunction(startValue: Vector3, endValue: Vector3, gradient: Number): Vector3 = definedExternally
    open fun vector3InterpolateFunctionWithTangents(startValue: Vector3, outTangent: Vector3, endValue: Vector3, inTangent: Vector3, gradient: Number): Vector3 = definedExternally
    open fun vector2InterpolateFunction(startValue: Vector2, endValue: Vector2, gradient: Number): Vector2 = definedExternally
    open fun vector2InterpolateFunctionWithTangents(startValue: Vector2, outTangent: Vector2, endValue: Vector2, inTangent: Vector2, gradient: Number): Vector2 = definedExternally
    open fun sizeInterpolateFunction(startValue: Size, endValue: Size, gradient: Number): Size = definedExternally
    open fun color3InterpolateFunction(startValue: Color3, endValue: Color3, gradient: Number): Color3 = definedExternally
    open fun matrixInterpolateFunction(startValue: Matrix, endValue: Matrix, gradient: Number): Matrix = definedExternally
    open fun clone(): Animation = definedExternally
    open fun setKeys(values: Array<`T$11`>): Unit = definedExternally
    open fun _getKeyValue(value: Any): Unit = definedExternally
    open fun _interpolate(currentFrame: Any, repeatCount: Any, loopMode: Any, offsetValue: Any? = definedExternally /* null */, highLimitValue: Any? = definedExternally /* null */): Unit = definedExternally
    open fun setValue(currentValue: Any, blend: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun goToFrame(frame: Number): Unit = definedExternally
    open fun animate(delay: Number, from: Number, to: Number, loop: Boolean, speedRatio: Number, blend: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        fun _PrepareAnimation(name: String, targetProperty: String, framePerSecond: Number, totalFrame: Number, from: Any, to: Any, loopMode: Number? = definedExternally /* null */, easingFunction: EasingFunction? = definedExternally /* null */): Animation = definedExternally
        fun CreateAndStartAnimation(name: String, node: Node, targetProperty: String, framePerSecond: Number, totalFrame: Number, from: Any, to: Any, loopMode: Number? = definedExternally /* null */, easingFunction: EasingFunction? = definedExternally /* null */, onAnimationEnd: (() -> Unit)? = definedExternally /* null */): Animatable = definedExternally
        fun CreateMergeAndStartAnimation(name: String, node: Node, targetProperty: String, framePerSecond: Number, totalFrame: Number, from: Any, to: Any, loopMode: Number? = definedExternally /* null */, easingFunction: EasingFunction? = definedExternally /* null */, onAnimationEnd: (() -> Unit)? = definedExternally /* null */): Animatable = definedExternally
        var _ANIMATIONTYPE_FLOAT: Any = definedExternally
        var _ANIMATIONTYPE_VECTOR3: Any = definedExternally
        var _ANIMATIONTYPE_QUATERNION: Any = definedExternally
        var _ANIMATIONTYPE_MATRIX: Any = definedExternally
        var _ANIMATIONTYPE_COLOR3: Any = definedExternally
        var _ANIMATIONTYPE_VECTOR2: Any = definedExternally
        var _ANIMATIONTYPE_SIZE: Any = definedExternally
        var _ANIMATIONLOOPMODE_RELATIVE: Any = definedExternally
        var _ANIMATIONLOOPMODE_CYCLE: Any = definedExternally
        var _ANIMATIONLOOPMODE_CONSTANT: Any = definedExternally
        var ANIMATIONTYPE_FLOAT: Number = definedExternally
        var ANIMATIONTYPE_VECTOR3: Number = definedExternally
        var ANIMATIONTYPE_VECTOR2: Number = definedExternally
        var ANIMATIONTYPE_SIZE: Number = definedExternally
        var ANIMATIONTYPE_QUATERNION: Number = definedExternally
        var ANIMATIONTYPE_MATRIX: Number = definedExternally
        var ANIMATIONTYPE_COLOR3: Number = definedExternally
        var ANIMATIONLOOPMODE_RELATIVE: Number = definedExternally
        var ANIMATIONLOOPMODE_CYCLE: Number = definedExternally
        var ANIMATIONLOOPMODE_CONSTANT: Number = definedExternally
        fun Parse(parsedAnimation: Any): Animation = definedExternally
        fun AppendSerializedAnimations(source: IAnimatable, destination: Any): Any = definedExternally
    }
}
external interface IEasingFunction {
    fun ease(gradient: Number): Number
}
external open class EasingFunction : IEasingFunction {
    open var _easingMode: Any = definedExternally
    open fun setEasingMode(easingMode: Number): Unit = definedExternally
    open fun getEasingMode(): Number = definedExternally
    open fun easeInCore(gradient: Number): Number = definedExternally
    override fun ease(gradient: Number): Number = definedExternally
    companion object {
        var _EASINGMODE_EASEIN: Any = definedExternally
        var _EASINGMODE_EASEOUT: Any = definedExternally
        var _EASINGMODE_EASEINOUT: Any = definedExternally
        var EASINGMODE_EASEIN: Number = definedExternally
        var EASINGMODE_EASEOUT: Number = definedExternally
        var EASINGMODE_EASEINOUT: Number = definedExternally
    }
}
external open class CircleEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class BackEase(amplitude: Number? = definedExternally /* null */) : EasingFunction, IEasingFunction {
    open var amplitude: Number = definedExternally
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class BounceEase(bounces: Number? = definedExternally /* null */, bounciness: Number? = definedExternally /* null */) : EasingFunction, IEasingFunction {
    open var bounces: Number = definedExternally
    open var bounciness: Number = definedExternally
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class CubicEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class ElasticEase(oscillations: Number? = definedExternally /* null */, springiness: Number? = definedExternally /* null */) : EasingFunction, IEasingFunction {
    open var oscillations: Number = definedExternally
    open var springiness: Number = definedExternally
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class ExponentialEase(exponent: Number? = definedExternally /* null */) : EasingFunction, IEasingFunction {
    open var exponent: Number = definedExternally
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class PowerEase(power: Number? = definedExternally /* null */) : EasingFunction, IEasingFunction {
    open var power: Number = definedExternally
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class QuadraticEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class QuarticEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class QuinticEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class SineEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external open class BezierCurveEase(x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */) : EasingFunction, IEasingFunction {
    open var x1: Number = definedExternally
    open var y1: Number = definedExternally
    open var x2: Number = definedExternally
    open var y2: Number = definedExternally
    override fun easeInCore(gradient: Number): Number = definedExternally
}
external interface `T$12` {
    var x: Number
    var y: Number
}
external interface `T$13` {
    var width: Number
    var height: Number
}
external open class Analyser(scene: Scene) {
    open var SMOOTHING: Number = definedExternally
    open var FFT_SIZE: Number = definedExternally
    open var BARGRAPHAMPLITUDE: Number = definedExternally
    open var DEBUGCANVASPOS: `T$12` = definedExternally
    open var DEBUGCANVASSIZE: `T$13` = definedExternally
    open var _byteFreqs: Any = definedExternally
    open var _byteTime: Any = definedExternally
    open var _floatFreqs: Any = definedExternally
    open var _webAudioAnalyser: Any = definedExternally
    open var _debugCanvas: Any = definedExternally
    open var _debugCanvasContext: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _registerFunc: Any = definedExternally
    open var _audioEngine: Any = definedExternally
    open fun getFrequencyBinCount(): Number = definedExternally
    open fun getByteFrequencyData(): Uint8Array = definedExternally
    open fun getByteTimeDomainData(): Uint8Array = definedExternally
    open fun getFloatFrequencyData(): Uint8Array = definedExternally
    open fun drawDebugCanvas(): Unit = definedExternally
    open fun stopDebugCanvas(): Unit = definedExternally
    open fun connectAudioNodes(inputAudioNode: AudioNode, outputAudioNode: AudioNode): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class AudioEngine {
    open var _audioContext: Any = definedExternally
    open var _audioContextInitialized: Any = definedExternally
    open var canUseWebAudio: Boolean = definedExternally
    open var masterGain: GainNode = definedExternally
    open var _connectedAnalyser: Any = definedExternally
    open var WarnedWebAudioUnsupported: Boolean = definedExternally
    open var unlocked: Boolean = definedExternally
    open var onAudioUnlocked: () -> Any = definedExternally
    open var isMP3supported: Boolean = definedExternally
    open var isOGGsupported: Boolean = definedExternally
    open var audioContext: AudioContext = definedExternally
    open fun _unlockiOSaudio(): Unit = definedExternally
    open fun _initializeAudioContext(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun getGlobalVolume(): Number = definedExternally
    open fun setGlobalVolume(newVolume: Number): Unit = definedExternally
    open fun connectToAnalyser(analyser: Analyser): Unit = definedExternally
}
external open class Sound(name: String, urlOrArrayBuffer: Any, scene: Scene, readyToPlayCallback: (() -> Unit)? = definedExternally /* null */, options: Any? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var autoplay: Boolean = definedExternally
    open var loop: Boolean = definedExternally
    open var useCustomAttenuation: Boolean = definedExternally
    open var soundTrackId: Number = definedExternally
    open var spatialSound: Boolean = definedExternally
    open var refDistance: Number = definedExternally
    open var rolloffFactor: Number = definedExternally
    open var maxDistance: Number = definedExternally
    open var distanceModel: String = definedExternally
    open var _panningModel: Any = definedExternally
    open var onended: () -> Any = definedExternally
    open var _playbackRate: Any = definedExternally
    open var _streaming: Any = definedExternally
    open var _startTime: Any = definedExternally
    open var _startOffset: Any = definedExternally
    open var _position: Any = definedExternally
    open var _localDirection: Any = definedExternally
    open var _volume: Any = definedExternally
    open var _isLoaded: Any = definedExternally
    open var _isReadyToPlay: Any = definedExternally
    open var isPlaying: Boolean = definedExternally
    open var isPaused: Boolean = definedExternally
    open var _isDirectional: Any = definedExternally
    open var _readyToPlayCallback: Any = definedExternally
    open var _audioBuffer: Any = definedExternally
    open var _soundSource: Any = definedExternally
    open var _streamingSource: Any = definedExternally
    open var _soundPanner: Any = definedExternally
    open var _soundGain: Any = definedExternally
    open var _inputAudioNode: Any = definedExternally
    open var _ouputAudioNode: Any = definedExternally
    open var _coneInnerAngle: Any = definedExternally
    open var _coneOuterAngle: Any = definedExternally
    open var _coneOuterGain: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _connectedMesh: Any = definedExternally
    open var _customAttenuationFunction: Any = definedExternally
    open var _registerFunc: Any = definedExternally
    open var _isOutputConnected: Any = definedExternally
    open var _htmlAudioElement: Any = definedExternally
    open var _urlType: Any = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun isReady(): Boolean = definedExternally
    open fun _soundLoaded(audioData: Any): Unit = definedExternally
    open fun setAudioBuffer(audioBuffer: AudioBuffer): Unit = definedExternally
    open fun updateOptions(options: Any): Unit = definedExternally
    open fun _createSpatialParameters(): Unit = definedExternally
    open fun _updateSpatialParameters(): Unit = definedExternally
    open fun switchPanningModelToHRTF(): Unit = definedExternally
    open fun switchPanningModelToEqualPower(): Unit = definedExternally
    open fun _switchPanningModel(): Unit = definedExternally
    open fun connectToSoundTrackAudioNode(soundTrackAudioNode: AudioNode): Unit = definedExternally
    open fun setDirectionalCone(coneInnerAngle: Number, coneOuterAngle: Number, coneOuterGain: Number): Unit = definedExternally
    open fun setPosition(newPosition: Vector3): Unit = definedExternally
    open fun setLocalDirectionToMesh(newLocalDirection: Vector3): Unit = definedExternally
    open fun _updateDirection(): Unit = definedExternally
    open fun updateDistanceFromListener(): Unit = definedExternally
    open fun setAttenuationFunction(callback: (currentVolume: Number, currentDistance: Number, maxDistance: Number, refDistance: Number, rolloffFactor: Number) -> Number): Unit = definedExternally
    open fun play(time: Number? = definedExternally /* null */, offset: Number? = definedExternally /* null */): Unit = definedExternally
    open fun _onended(): Unit = definedExternally
    open fun stop(time: Number? = definedExternally /* null */): Unit = definedExternally
    open fun pause(): Unit = definedExternally
    open fun setVolume(newVolume: Number, time: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setPlaybackRate(newPlaybackRate: Number): Unit = definedExternally
    open fun getVolume(): Number = definedExternally
    open fun attachToMesh(meshToConnectTo: AbstractMesh): Unit = definedExternally
    open fun detachFromMesh(): Unit = definedExternally
    open fun _onRegisterAfterWorldMatrixUpdate(connectedMesh: Any): Unit = definedExternally
    open fun clone(): Sound = definedExternally
    open fun getAudioBuffer(): AudioBuffer = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        fun Parse(parsedSound: Any, scene: Scene, rootUrl: String, sourceSound: Sound? = definedExternally /* null */): Sound = definedExternally
    }
}
external open class SoundTrack(scene: Scene, options: Any? = definedExternally /* null */) {
    open var _outputAudioNode: Any = definedExternally
    open var _inputAudioNode: Any = definedExternally
    open var _trackConvolver: Any = definedExternally
    open var _scene: Any = definedExternally
    open var id: Number = definedExternally
    open var soundCollection: Array<Sound> = definedExternally
    open var _isMainTrack: Any = definedExternally
    open var _connectedAnalyser: Any = definedExternally
    open var _options: Any = definedExternally
    open var _isInitialized: Any = definedExternally
    open fun _initializeSoundTrackAudioGraph(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun AddSound(sound: Sound): Unit = definedExternally
    open fun RemoveSound(sound: Sound): Unit = definedExternally
    open fun setVolume(newVolume: Number): Unit = definedExternally
    open fun switchPanningModelToHRTF(): Unit = definedExternally
    open fun switchPanningModelToEqualPower(): Unit = definedExternally
    open fun connectToAnalyser(analyser: Analyser): Unit = definedExternally
}
external open class Bone(name: String, skeleton: Skeleton, parentBone: Bone? = definedExternally /* null */, matrix: Matrix? = definedExternally /* null */, restPose: Matrix? = definedExternally /* null */) : Node {
    override var name: String = definedExternally
    open var children: Array<Bone> = definedExternally
    override var animations: Array<Animation> = definedExternally
    open var length: Number = definedExternally
    open var _skeleton: Any = definedExternally
    open var _localMatrix: Any = definedExternally
    open var _restPose: Any = definedExternally
    open var _baseMatrix: Any = definedExternally
    open var _worldTransform: Any = definedExternally
    open var _absoluteTransform: Any = definedExternally
    open var _invertedAbsoluteTransform: Any = definedExternally
    open var _parent: Any = definedExternally
    open var _scaleMatrix: Any = definedExternally
    open var _scaleVector: Any = definedExternally
    open var _negateScaleChildren: Any = definedExternally
    open var _scalingDeterminant: Any = definedExternally
    open var _matrix: Matrix = definedExternally
    open fun getSkeleton(): Skeleton = definedExternally
    open fun getParent(): Bone = definedExternally
    open fun setParent(parent: Bone, updateDifferenceMatrix: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun getLocalMatrix(): Matrix = definedExternally
    open fun getBaseMatrix(): Matrix = definedExternally
    open fun getRestPose(): Matrix = definedExternally
    open fun returnToRest(): Unit = definedExternally
    override fun getWorldMatrix(): Matrix = definedExternally
    open fun getInvertedAbsoluteTransform(): Matrix = definedExternally
    open fun getAbsoluteTransform(): Matrix = definedExternally
    open var position: Vector3 = definedExternally
    open var rotation: Vector3 = definedExternally
    open var rotationQuaternion: Quaternion = definedExternally
    open var scaling: Vector3 = definedExternally
    open fun updateMatrix(matrix: Matrix, updateDifferenceMatrix: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _updateDifferenceMatrix(rootMatrix: Matrix? = definedExternally /* null */): Unit = definedExternally
    open fun markAsDirty(): Unit = definedExternally
    open fun copyAnimationRange(source: Bone, rangeName: String, frameOffset: Number, rescaleAsRequired: Boolean? = definedExternally /* null */, skelDimensionsRatio: Vector3? = definedExternally /* null */): Boolean = definedExternally
    open fun translate(vec: Vector3, space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Unit = definedExternally
    open fun setPosition(position: Vector3, space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Unit = definedExternally
    open fun setAbsolutePosition(position: Vector3, mesh: AbstractMesh? = definedExternally /* null */): Unit = definedExternally
    open fun setScale(x: Number, y: Number, z: Number, scaleChildren: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun scale(x: Number, y: Number, z: Number, scaleChildren: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setYawPitchRoll(yaw: Number, pitch: Number, roll: Number, space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Unit = definedExternally
    open fun rotate(axis: Vector3, amount: Number, space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Unit = definedExternally
    open fun setAxisAngle(axis: Vector3, angle: Number, space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Unit = definedExternally
    open fun setRotation(rotation: Vector3, space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Unit = definedExternally
    open fun setRotationQuaternion(quat: Quaternion, space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Unit = definedExternally
    open fun setRotationMatrix(rotMat: Matrix, space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Unit = definedExternally
    open fun _rotateWithMatrix(rmat: Any, space: Any? = definedExternally /* null */, mesh: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _getNegativeRotationToRef(rotMatInv: Any, space: Any? = definedExternally /* null */, mesh: Any? = definedExternally /* null */): Unit = definedExternally
    open fun getScale(): Vector3 = definedExternally
    open fun getScaleToRef(result: Vector3): Unit = definedExternally
    open fun getPosition(space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Vector3 = definedExternally
    open fun getPositionToRef(space: Space, mesh: AbstractMesh, result: Vector3): Unit = definedExternally
    open fun getAbsolutePosition(mesh: AbstractMesh? = definedExternally /* null */): Vector3 = definedExternally
    open fun getAbsolutePositionToRef(mesh: AbstractMesh, result: Vector3): Unit = definedExternally
    open fun computeAbsoluteTransforms(): Unit = definedExternally
    open fun _syncScaleVector(): Unit = definedExternally
    open fun getDirection(localAxis: Vector3, mesh: AbstractMesh? = definedExternally /* null */): Vector3 = definedExternally
    open fun getDirectionToRef(localAxis: Vector3, mesh: AbstractMesh, result: Vector3): Unit = definedExternally
    open fun getRotation(space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Vector3 = definedExternally
    open fun getRotationToRef(space: Space, mesh: AbstractMesh, result: Vector3): Unit = definedExternally
    open fun getRotationQuaternion(space: Space? = definedExternally /* null */, mesh: AbstractMesh? = definedExternally /* null */): Quaternion = definedExternally
    open fun getRotationQuaternionToRef(space: Space, mesh: AbstractMesh, result: Quaternion): Unit = definedExternally
    open fun getRotationMatrix(space: Space, mesh: AbstractMesh): Matrix = definedExternally
    open fun getRotationMatrixToRef(space: Space, mesh: AbstractMesh, result: Matrix): Unit = definedExternally
    open fun getAbsolutePositionFromLocal(position: Vector3, mesh: AbstractMesh? = definedExternally /* null */): Vector3 = definedExternally
    open fun getAbsolutePositionFromLocalToRef(position: Vector3, mesh: AbstractMesh, result: Vector3): Unit = definedExternally
    open fun getLocalPositionFromAbsolute(position: Vector3, mesh: AbstractMesh? = definedExternally /* null */): Vector3 = definedExternally
    open fun getLocalPositionFromAbsoluteToRef(position: Vector3, mesh: AbstractMesh, result: Vector3): Unit = definedExternally
    companion object {
        var _tmpVecs: Any = definedExternally
        var _tmpQuat: Any = definedExternally
        var _tmpMats: Any = definedExternally
    }
}
external interface `T$14` {
    var targetMesh: AbstractMesh? get() = definedExternally; set(value) = definedExternally
    var poleTargetMesh: AbstractMesh? get() = definedExternally; set(value) = definedExternally
    var poleTargetBone: Bone? get() = definedExternally; set(value) = definedExternally
    var poleTargetLocalOffset: Vector3? get() = definedExternally; set(value) = definedExternally
    var poleAngle: Number? get() = definedExternally; set(value) = definedExternally
    var bendAxis: Vector3? get() = definedExternally; set(value) = definedExternally
    var maxAngle: Number? get() = definedExternally; set(value) = definedExternally
    var slerpAmount: Number? get() = definedExternally; set(value) = definedExternally
}
external open class BoneIKController(mesh: AbstractMesh, bone: Bone, options: `T$14`? = definedExternally /* null */) {
    open var targetMesh: AbstractMesh = definedExternally
    open var poleTargetMesh: AbstractMesh = definedExternally
    open var poleTargetBone: Bone = definedExternally
    open var targetPosition: Vector3 = definedExternally
    open var poleTargetPosition: Vector3 = definedExternally
    open var poleTargetLocalOffset: Vector3 = definedExternally
    open var poleAngle: Number = definedExternally
    open var mesh: AbstractMesh = definedExternally
    open var slerpAmount: Number = definedExternally
    open var _bone1Quat: Any = definedExternally
    open var _bone1Mat: Any = definedExternally
    open var _bone2Ang: Any = definedExternally
    open var _bone1: Any = definedExternally
    open var _bone2: Any = definedExternally
    open var _bone1Length: Any = definedExternally
    open var _bone2Length: Any = definedExternally
    open var _maxAngle: Any = definedExternally
    open var _maxReach: Any = definedExternally
    open var _rightHandedSystem: Any = definedExternally
    open var _bendAxis: Any = definedExternally
    open var _slerping: Any = definedExternally
    open var _adjustRoll: Any = definedExternally
    open var maxAngle: Number = definedExternally
    open fun _setMaxAngle(ang: Any): Unit = definedExternally
    open fun update(): Unit = definedExternally
    companion object {
        var _tmpVecs: Any = definedExternally
        var _tmpQuat: Any = definedExternally
        var _tmpMats: Any = definedExternally
    }
}
external interface `T$15` {
    var maxYaw: Number? get() = definedExternally; set(value) = definedExternally
    var minYaw: Number? get() = definedExternally; set(value) = definedExternally
    var maxPitch: Number? get() = definedExternally; set(value) = definedExternally
    var minPitch: Number? get() = definedExternally; set(value) = definedExternally
    var slerpAmount: Number? get() = definedExternally; set(value) = definedExternally
    var upAxis: Vector3? get() = definedExternally; set(value) = definedExternally
    var upAxisSpace: Space? get() = definedExternally; set(value) = definedExternally
    var yawAxis: Vector3? get() = definedExternally; set(value) = definedExternally
    var pitchAxis: Vector3? get() = definedExternally; set(value) = definedExternally
    var adjustYaw: Number? get() = definedExternally; set(value) = definedExternally
    var adjustPitch: Number? get() = definedExternally; set(value) = definedExternally
    var adjustRoll: Number? get() = definedExternally; set(value) = definedExternally
}
external open class BoneLookController(mesh: AbstractMesh, bone: Bone, target: Vector3, options: `T$15`? = definedExternally /* null */) {
    open var target: Vector3 = definedExternally
    open var mesh: AbstractMesh = definedExternally
    open var bone: Bone = definedExternally
    open var upAxis: Vector3 = definedExternally
    open var upAxisSpace: Space = definedExternally
    open var adjustYaw: Number = definedExternally
    open var adjustPitch: Number = definedExternally
    open var adjustRoll: Number = definedExternally
    open var slerpAmount: Number = definedExternally
    open var _minYaw: Any = definedExternally
    open var _maxYaw: Any = definedExternally
    open var _minPitch: Any = definedExternally
    open var _maxPitch: Any = definedExternally
    open var _minYawSin: Any = definedExternally
    open var _minYawCos: Any = definedExternally
    open var _maxYawSin: Any = definedExternally
    open var _maxYawCos: Any = definedExternally
    open var _midYawConstraint: Any = definedExternally
    open var _minPitchTan: Any = definedExternally
    open var _maxPitchTan: Any = definedExternally
    open var _boneQuat: Any = definedExternally
    open var _slerping: Any = definedExternally
    open var _transformYawPitch: Any = definedExternally
    open var _transformYawPitchInv: Any = definedExternally
    open var _firstFrameSkipped: Any = definedExternally
    open var _yawRange: Any = definedExternally
    open var _fowardAxis: Any = definedExternally
    open var minYaw: Number = definedExternally
    open var maxYaw: Number = definedExternally
    open var minPitch: Number = definedExternally
    open var maxPitch: Number = definedExternally
    open fun update(): Unit = definedExternally
    open fun _getAngleDiff(ang1: Any, ang2: Any): Unit = definedExternally
    open fun _getAngleBetween(ang1: Any, ang2: Any): Unit = definedExternally
    open fun _isAngleBetween(ang: Any, ang1: Any, ang2: Any): Unit = definedExternally
    companion object {
        var _tmpVecs: Any = definedExternally
        var _tmpQuat: Any = definedExternally
        var _tmpMats: Any = definedExternally
    }
}
external open class Skeleton(name: String, id: String, scene: Scene) {
    open var name: String = definedExternally
    open var id: String = definedExternally
    open var bones: Array<Bone> = definedExternally
    open var dimensionsAtRest: Vector3 = definedExternally
    open var needInitialSkinMatrix: Boolean = definedExternally
    open var _scene: Any = definedExternally
    open var _isDirty: Any = definedExternally
    open var _transformMatrices: Any = definedExternally
    open var _meshesWithPoseMatrix: Any = definedExternally
    open var _animatables: Any = definedExternally
    open var _identity: Any = definedExternally
    open var _synchronizedWithMesh: Any = definedExternally
    open var _ranges: Any = definedExternally
    open var _lastAbsoluteTransformsUpdateId: Any = definedExternally
    open var onBeforeComputeObservable: Observable<Skeleton> = definedExternally
    open fun getTransformMatrices(mesh: AbstractMesh): Float32Array = definedExternally
    open fun getScene(): Scene = definedExternally
    open fun toString(fullDetails: Boolean? = definedExternally /* null */): String = definedExternally
    open fun getBoneIndexByName(name: String): Number = definedExternally
    open fun createAnimationRange(name: String, from: Number, to: Number): Unit = definedExternally
    open fun deleteAnimationRange(name: String, deleteFrames: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun getAnimationRange(name: String): AnimationRange = definedExternally
    open fun getAnimationRanges(): Array<AnimationRange> = definedExternally
    open fun copyAnimationRange(source: Skeleton, name: String, rescaleAsRequired: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun returnToRest(): Unit = definedExternally
    open fun _getHighestAnimationFrame(): Unit = definedExternally
    open fun beginAnimation(name: String, loop: Boolean? = definedExternally /* null */, speedRatio: Number? = definedExternally /* null */, onAnimationEnd: (() -> Unit)? = definedExternally /* null */): Animatable = definedExternally
    open fun _markAsDirty(): Unit = definedExternally
    open fun _registerMeshWithPoseMatrix(mesh: AbstractMesh): Unit = definedExternally
    open fun _unregisterMeshWithPoseMatrix(mesh: AbstractMesh): Unit = definedExternally
    open fun _computeTransformMatrices(targetMatrix: Float32Array, initialSkinMatrix: Matrix): Unit = definedExternally
    open fun prepare(): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    open fun clone(name: String, id: String): Skeleton = definedExternally
    open fun enableBlending(blendingSpeed: Number? = definedExternally /* null */): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun serialize(): Any = definedExternally
    open fun computeAbsoluteTransforms(forceUpdate: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun getPoseMatrix(): Matrix = definedExternally
    companion object {
        fun Parse(parsedSkeleton: Any, scene: Scene): Skeleton = definedExternally
    }
}
external open class ArcRotateCamera(name: String, alpha: Number, beta: Number, radius: Number, target: Vector3, scene: Scene) : TargetCamera {
    open var alpha: Number = definedExternally
    open var beta: Number = definedExternally
    open var radius: Number = definedExternally
    open var _target: Vector3 = definedExternally
    open var _targetHost: AbstractMesh = definedExternally
    open var target: Vector3 = definedExternally
    open var inertialAlphaOffset: Number = definedExternally
    open var inertialBetaOffset: Number = definedExternally
    open var inertialRadiusOffset: Number = definedExternally
    open var lowerAlphaLimit: Any = definedExternally
    open var upperAlphaLimit: Any = definedExternally
    open var lowerBetaLimit: Number = definedExternally
    open var upperBetaLimit: Number = definedExternally
    open var lowerRadiusLimit: Any = definedExternally
    open var upperRadiusLimit: Any = definedExternally
    open var inertialPanningX: Number = definedExternally
    open var inertialPanningY: Number = definedExternally
    open var panningInertia: Number = definedExternally
    open var angularSensibilityX: Number = definedExternally
    open var angularSensibilityY: Number = definedExternally
    open var pinchPrecision: Number = definedExternally
    open var panningSensibility: Number = definedExternally
    open var keysUp: Array<Number> = definedExternally
    open var keysDown: Array<Number> = definedExternally
    open var keysLeft: Array<Number> = definedExternally
    open var keysRight: Array<Number> = definedExternally
    open var wheelPrecision: Number = definedExternally
    open var zoomOnFactor: Number = definedExternally
    open var targetScreenOffset: Vector2 = definedExternally
    open var allowUpsideDown: Boolean = definedExternally
    override var _viewMatrix: Matrix = definedExternally
    open var _useCtrlForPanning: Boolean = definedExternally
    open var _panningMouseButton: Number = definedExternally
    override var inputs: CameraInputsManager<Camera> = definedExternally
    override var _reset: () -> Unit = definedExternally
    open var panningAxis: Vector3 = definedExternally
    open var _localDirection: Vector3 = definedExternally
    open var _transformedDirection: Vector3 = definedExternally
    open var onCollide: (collidedMesh: AbstractMesh) -> Unit = definedExternally
    open var checkCollisions: Boolean = definedExternally
    open var collisionRadius: Vector3 = definedExternally
    open var _collider: Collider = definedExternally
    open var _previousPosition: Vector3 = definedExternally
    open var _collisionVelocity: Vector3 = definedExternally
    open var _newPosition: Vector3 = definedExternally
    open var _previousAlpha: Number = definedExternally
    open var _previousBeta: Number = definedExternally
    open var _previousRadius: Number = definedExternally
    open var _collisionTriggered: Boolean = definedExternally
    open var _targetBoundingCenter: Vector3 = definedExternally
    override fun _initCache(): Unit = definedExternally
    override fun _updateCache(ignoreParentClass: Boolean?): Unit = definedExternally
    open fun _getTargetPosition(): Vector3 = definedExternally
    override fun _isSynchronizedViewMatrix(): Boolean = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */, useCtrlForPanning: Boolean? = definedExternally /* null */, panningMouseButton: Number? = definedExternally /* null */): Unit = definedExternally
    override fun detachControl(element: HTMLElement): Unit = definedExternally
    override fun _checkInputs(): Unit = definedExternally
    open fun _checkLimits(): Unit = definedExternally
    open fun rebuildAnglesAndRadius(): Unit = definedExternally
    open fun setPosition(position: Vector3): Unit = definedExternally
    open fun setTarget(target: AbstractMesh, toBoundingCenter: Boolean? = definedExternally /* null */, allowSamePosition: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setTarget(target: Vector3, toBoundingCenter: Boolean? = definedExternally /* null */, allowSamePosition: Boolean? = definedExternally /* null */): Unit = definedExternally
    override fun _getViewMatrix(): Matrix = definedExternally
    open var _onCollisionPositionChange: (collisionId: Number, newPosition: Vector3, collidedMesh: AbstractMesh? /*= null*/) -> Unit = definedExternally
    open fun zoomOn(meshes: Array<AbstractMesh>? = definedExternally /* null */, doNotUpdateMaxZ: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun focusOn(meshesOrMinMaxVectorAndDistance: Any, doNotUpdateMaxZ: Boolean? = definedExternally /* null */): Unit = definedExternally
    override fun createRigCamera(name: String, cameraIndex: Number): Camera = definedExternally
    override fun _updateRigCameras(): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
    override fun getClassName(): String = definedExternally
}
external open class ArcRotateCameraInputsManager(camera: ArcRotateCamera) : CameraInputsManager<ArcRotateCamera> {
    open fun addMouseWheel(): ArcRotateCameraInputsManager = definedExternally
    open fun addPointers(): ArcRotateCameraInputsManager = definedExternally
    open fun addKeyboard(): ArcRotateCameraInputsManager = definedExternally
    open fun addGamepad(): ArcRotateCameraInputsManager = definedExternally
    open fun addVRDeviceOrientation(): ArcRotateCameraInputsManager = definedExternally
}
external open class Camera(name: String, position: Vector3, scene: Scene) : Node {
    open var inputs: CameraInputsManager<Camera> = definedExternally
    open var position: Vector3 = definedExternally
    open var upVector: Vector3 = definedExternally
    open var orthoLeft: Any = definedExternally
    open var orthoRight: Any = definedExternally
    open var orthoBottom: Any = definedExternally
    open var orthoTop: Any = definedExternally
    open var fov: Number = definedExternally
    open var minZ: Number = definedExternally
    open var maxZ: Number = definedExternally
    open var inertia: Number = definedExternally
    open var mode: Number = definedExternally
    open var isIntermediate: Boolean = definedExternally
    open var viewport: Viewport = definedExternally
    open var layerMask: Number = definedExternally
    open var fovMode: Number = definedExternally
    open var cameraRigMode: Number = definedExternally
    open var interaxialDistance: Number = definedExternally
    open var isStereoscopicSideBySide: Boolean = definedExternally
    open var _cameraRigParams: Any = definedExternally
    open var _rigCameras: Array<Camera> = definedExternally
    open var _rigPostProcess: PostProcess = definedExternally
    open var _webvrViewMatrix: Matrix = definedExternally
    open var customRenderTargets: Array<RenderTargetTexture> = definedExternally
    open var _computedViewMatrix: Any = definedExternally
    open var _projectionMatrix: Matrix = definedExternally
    open var _doNotComputeProjectionMatrix: Any = definedExternally
    open var _worldMatrix: Any = definedExternally
    open var _postProcesses: Array<PostProcess> = definedExternally
    open var _transformMatrix: Any = definedExternally
    open var _activeMeshes: SmartArray<Mesh> = definedExternally
    open var _globalPosition: Any = definedExternally
    open var _frustumPlanes: Any = definedExternally
    open var _refreshFrustumPlanes: Any = definedExternally
    override fun getClassName(): String = definedExternally
    open fun toString(fullDetails: Boolean? = definedExternally /* null */): String = definedExternally
    open var globalPosition: Vector3 = definedExternally
    open fun getActiveMeshes(): SmartArray<Mesh> = definedExternally
    open fun isActiveMesh(mesh: Mesh): Boolean = definedExternally
    override fun _initCache(): Unit = definedExternally
    override fun _updateCache(ignoreParentClass: Boolean?): Unit = definedExternally
    open fun _updateFromScene(): Unit = definedExternally
    override fun _isSynchronized(): Boolean = definedExternally
    open fun _isSynchronizedViewMatrix(): Boolean = definedExternally
    open fun _isSynchronizedProjectionMatrix(): Boolean = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    open fun update(): Unit = definedExternally
    open fun _checkInputs(): Unit = definedExternally
    open var rigCameras: Array<Camera> = definedExternally
    open var rigPostProcess: PostProcess = definedExternally
    open fun _cascadePostProcessesToRigCams(): Unit = definedExternally
    open fun attachPostProcess(postProcess: PostProcess, insertAt: Number? = definedExternally /* null */): Number = definedExternally
    open fun detachPostProcess(postProcess: PostProcess, atIndices: Any? = definedExternally /* null */): Array<Number> = definedExternally
    override fun getWorldMatrix(): Matrix = definedExternally
    open fun _getViewMatrix(): Matrix = definedExternally
    open fun getViewMatrix(force: Boolean? = definedExternally /* null */): Matrix = definedExternally
    open fun _computeViewMatrix(force: Boolean? = definedExternally /* null */): Matrix = definedExternally
    open fun freezeProjectionMatrix(projection: Matrix? = definedExternally /* null */): Unit = definedExternally
    open fun unfreezeProjectionMatrix(): Unit = definedExternally
    open fun getProjectionMatrix(force: Boolean? = definedExternally /* null */): Matrix = definedExternally
    open fun getTranformationMatrix(): Matrix = definedExternally
    open fun updateFrustumPlanes(): Unit = definedExternally
    open fun isInFrustum(target: ICullable): Boolean = definedExternally
    open fun isCompletelyInFrustum(target: ICullable): Boolean = definedExternally
    open fun getForwardRay(length: Number? = definedExternally /* null */, transform: Matrix? = definedExternally /* null */, origin: Vector3? = definedExternally /* null */): Ray = definedExternally
    override fun dispose(): Unit = definedExternally
    open var leftCamera: FreeCamera = definedExternally
    open var rightCamera: FreeCamera = definedExternally
    open fun getLeftTarget(): Vector3 = definedExternally
    open fun getRightTarget(): Vector3 = definedExternally
    open fun setCameraRigMode(mode: Number, rigParams: Any): Unit = definedExternally
    open fun _getVRProjectionMatrix(): Unit = definedExternally
    open fun _updateCameraRotationMatrix(): Unit = definedExternally
    open fun _updateWebVRCameraRotationMatrix(): Unit = definedExternally
    open fun _getWebVRProjectionMatrix(): Matrix = definedExternally
    open fun _getWebVRViewMatrix(): Matrix = definedExternally
    open fun setCameraRigParameter(name: String, value: Any): Unit = definedExternally
    open fun createRigCamera(name: String, cameraIndex: Number): Camera = definedExternally
    open fun _updateRigCameras(): Unit = definedExternally
    open fun _setupInputs(): Unit = definedExternally
    open fun serialize(): Any = definedExternally
    open fun clone(name: String): Camera = definedExternally
    open fun getDirection(localAxis: Vector3): Vector3 = definedExternally
    open fun getDirectionToRef(localAxis: Vector3, result: Vector3): Unit = definedExternally
    companion object {
        var _PERSPECTIVE_CAMERA: Any = definedExternally
        var _ORTHOGRAPHIC_CAMERA: Any = definedExternally
        var _FOVMODE_VERTICAL_FIXED: Any = definedExternally
        var _FOVMODE_HORIZONTAL_FIXED: Any = definedExternally
        var _RIG_MODE_NONE: Any = definedExternally
        var _RIG_MODE_STEREOSCOPIC_ANAGLYPH: Any = definedExternally
        var _RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL: Any = definedExternally
        var _RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED: Any = definedExternally
        var _RIG_MODE_STEREOSCOPIC_OVERUNDER: Any = definedExternally
        var _RIG_MODE_VR: Any = definedExternally
        var _RIG_MODE_WEBVR: Any = definedExternally
        var PERSPECTIVE_CAMERA: Number = definedExternally
        var ORTHOGRAPHIC_CAMERA: Number = definedExternally
        var FOVMODE_VERTICAL_FIXED: Number = definedExternally
        var FOVMODE_HORIZONTAL_FIXED: Number = definedExternally
        var RIG_MODE_NONE: Number = definedExternally
        var RIG_MODE_STEREOSCOPIC_ANAGLYPH: Number = definedExternally
        var RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL: Number = definedExternally
        var RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED: Number = definedExternally
        var RIG_MODE_STEREOSCOPIC_OVERUNDER: Number = definedExternally
        var RIG_MODE_VR: Number = definedExternally
        var RIG_MODE_WEBVR: Number = definedExternally
        var ForceAttachControlToAlwaysPreventDefault: Boolean = definedExternally
        fun GetConstructorFromName(type: String, name: String, scene: Scene, interaxial_distance: Number? = definedExternally /* null */, isStereoscopicSideBySide: Boolean? = definedExternally /* null */): () -> Camera = definedExternally
        fun Parse(parsedCamera: Any, scene: Scene): Camera = definedExternally
    }
}
external var CameraInputTypes: Any = definedExternally
external interface ICameraInput<TCamera : BABYLON.Camera> {
    var camera: TCamera
    fun getTypeName(): String
    fun getSimpleName(): String
    var attachControl: (element: HTMLElement, noPreventDefault: Boolean? /*= null*/) -> Unit
    var detachControl: (element: HTMLElement) -> Unit
    var checkInputs: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface CameraInputsMap<TCamera : BABYLON.Camera> {
    @nativeGetter
    operator fun get(name: String): ICameraInput<TCamera>?
    @nativeSetter
    operator fun set(name: String, value: ICameraInput<TCamera>)
    @nativeGetter
    operator fun get(idx: Number): ICameraInput<TCamera>?
    @nativeSetter
    operator fun set(idx: Number, value: ICameraInput<TCamera>)
}
external open class CameraInputsManager<TCamera : BABYLON.Camera>(camera: TCamera) {
    open var attached: CameraInputsMap<TCamera> = definedExternally
    open var attachedElement: HTMLElement = definedExternally
    open var noPreventDefault: Boolean = definedExternally
    open var camera: TCamera = definedExternally
    open var checkInputs: () -> Unit = definedExternally
    open fun add(input: ICameraInput<TCamera>): Unit = definedExternally
    open fun remove(inputToRemove: ICameraInput<TCamera>): Unit = definedExternally
    open fun removeByType(inputType: String): Unit = definedExternally
    open fun _addCheckInputs(fn: Any): Unit = definedExternally
    open fun attachInput(input: ICameraInput<TCamera>): Unit = definedExternally
    open fun attachElement(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachElement(element: HTMLElement): Unit = definedExternally
    open fun rebuildInputCheck(): Unit = definedExternally
    open fun clear(): Unit = definedExternally
    open fun serialize(serializedCamera: Any): Unit = definedExternally
    open fun parse(parsedCamera: Any): Unit = definedExternally
}
external open class DeviceOrientationCamera(name: String, position: Vector3, scene: Scene) : FreeCamera {
    open var _initialQuaternion: Any = definedExternally
    open var _quaternionCache: Any = definedExternally
    override fun getClassName(): String = definedExternally
    override fun _checkInputs(): Unit = definedExternally
    open fun resetToCurrentRotation(axis: Axis? = definedExternally /* null */): Unit = definedExternally
}
external open class FollowCamera(name: String, position: Vector3, scene: Scene, lockedTarget: AbstractMesh? = definedExternally /* null */) : TargetCamera {
    open var radius: Number = definedExternally
    open var rotationOffset: Number = definedExternally
    open var heightOffset: Number = definedExternally
    open var cameraAcceleration: Number = definedExternally
    open var maxCameraSpeed: Number = definedExternally
    override var lockedTarget: Any = definedExternally
    open fun getRadians(degrees: Any): Unit = definedExternally
    open fun follow(cameraTarget: Any): Unit = definedExternally
    override fun _checkInputs(): Unit = definedExternally
    override fun getClassName(): String = definedExternally
}
external open class ArcFollowCamera(name: String, alpha: Number, beta: Number, radius: Number, target: AbstractMesh, scene: Scene) : TargetCamera {
    open var alpha: Number = definedExternally
    open var beta: Number = definedExternally
    open var radius: Number = definedExternally
    open var target: AbstractMesh = definedExternally
    open var _cartesianCoordinates: Any = definedExternally
    open fun follow(): Unit = definedExternally
    override fun _checkInputs(): Unit = definedExternally
    override fun getClassName(): String = definedExternally
}
external open class FreeCamera(name: String, position: Vector3, scene: Scene) : TargetCamera {
    open var ellipsoid: Vector3 = definedExternally
    open var checkCollisions: Boolean = definedExternally
    open var applyGravity: Boolean = definedExternally
    override var inputs: CameraInputsManager<Camera> = definedExternally
    open var angularSensibility: Number = definedExternally
    open var keysUp: Array<Number> = definedExternally
    open var keysDown: Array<Number> = definedExternally
    open var keysLeft: Array<Number> = definedExternally
    open var keysRight: Array<Number> = definedExternally
    open var onCollide: (collidedMesh: AbstractMesh) -> Unit = definedExternally
    open var _collider: Any = definedExternally
    open var _needMoveForGravity: Any = definedExternally
    open var _oldPosition: Any = definedExternally
    open var _diffPosition: Any = definedExternally
    open var _newPosition: Any = definedExternally
    open var _localDirection: Vector3 = definedExternally
    open var _transformedDirection: Vector3 = definedExternally
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean?): Unit = definedExternally
    override fun detachControl(element: HTMLElement): Unit = definedExternally
    open var _collisionMask: Any = definedExternally
    open var collisionMask: Number = definedExternally
    open fun _collideWithWorld(velocity: Vector3): Unit = definedExternally
    open var _onCollisionPositionChange: Any = definedExternally
    override fun _checkInputs(): Unit = definedExternally
    override fun _decideIfNeedsToMove(): Boolean = definedExternally
    override fun _updatePosition(): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
    override fun getClassName(): String = definedExternally
}
external open class FreeCameraInputsManager(camera: FreeCamera) : CameraInputsManager<FreeCamera> {
    open fun addKeyboard(): FreeCameraInputsManager = definedExternally
    open fun addMouse(touchEnabled: Boolean? = definedExternally /* null */): FreeCameraInputsManager = definedExternally
    open fun addGamepad(): FreeCameraInputsManager = definedExternally
    open fun addDeviceOrientation(): FreeCameraInputsManager = definedExternally
    open fun addTouch(): FreeCameraInputsManager = definedExternally
    open fun addVirtualJoystick(): FreeCameraInputsManager = definedExternally
}
external open class GamepadCamera(name: String, position: Vector3, scene: Scene) : UniversalCamera {
    override var gamepadAngularSensibility: Number = definedExternally
    override var gamepadMoveSensibility: Number = definedExternally
    override fun getClassName(): String = definedExternally
}
external open class AnaglyphFreeCamera(name: String, position: Vector3, interaxialDistance: Number, scene: Scene) : FreeCamera {
    override fun getClassName(): String = definedExternally
}
external open class AnaglyphArcRotateCamera(name: String, alpha: Number, beta: Number, radius: Number, target: Any, interaxialDistance: Number, scene: Scene) : ArcRotateCamera {
    override fun getClassName(): String = definedExternally
}
external open class AnaglyphGamepadCamera(name: String, position: Vector3, interaxialDistance: Number, scene: Scene) : GamepadCamera {
    override fun getClassName(): String = definedExternally
}
external open class AnaglyphUniversalCamera(name: String, position: Vector3, interaxialDistance: Number, scene: Scene) : UniversalCamera {
    override fun getClassName(): String = definedExternally
}
external open class StereoscopicFreeCamera(name: String, position: Vector3, interaxialDistance: Number, isStereoscopicSideBySide: Boolean, scene: Scene) : FreeCamera {
    override fun getClassName(): String = definedExternally
}
external open class StereoscopicArcRotateCamera(name: String, alpha: Number, beta: Number, radius: Number, target: Any, interaxialDistance: Number, isStereoscopicSideBySide: Boolean, scene: Scene) : ArcRotateCamera {
    override fun getClassName(): String = definedExternally
}
external open class StereoscopicGamepadCamera(name: String, position: Vector3, interaxialDistance: Number, isStereoscopicSideBySide: Boolean, scene: Scene) : GamepadCamera {
    override fun getClassName(): String = definedExternally
}
external open class StereoscopicUniversalCamera(name: String, position: Vector3, interaxialDistance: Number, isStereoscopicSideBySide: Boolean, scene: Scene) : UniversalCamera {
    override fun getClassName(): String = definedExternally
}
external open class TargetCamera(name: String, position: Vector3, scene: Scene) : Camera {
    open var cameraDirection: Vector3 = definedExternally
    open var cameraRotation: Vector2 = definedExternally
    open var rotation: Vector3 = definedExternally
    open var rotationQuaternion: Quaternion = definedExternally
    open var speed: Number = definedExternally
    open var noRotationConstraint: Boolean = definedExternally
    open var lockedTarget: Any = definedExternally
    open var _currentTarget: Vector3 = definedExternally
    open var _viewMatrix: Matrix = definedExternally
    open var _camMatrix: Matrix = definedExternally
    open var _cameraTransformMatrix: Matrix = definedExternally
    open var _cameraRotationMatrix: Matrix = definedExternally
    open var _rigCamTransformMatrix: Any = definedExternally
    open var _referencePoint: Vector3 = definedExternally
    open var _defaultUpVector: Any = definedExternally
    open var _transformedReferencePoint: Vector3 = definedExternally
    open var _lookAtTemp: Matrix = definedExternally
    open var _tempMatrix: Matrix = definedExternally
    open var _reset: () -> Unit = definedExternally
    open fun getFrontPosition(distance: Number): Vector3 = definedExternally
    open fun _getLockedTargetPosition(): Vector3 = definedExternally
    override fun _initCache(): Unit = definedExternally
    override fun _updateCache(ignoreParentClass: Boolean?): Unit = definedExternally
    override fun _isSynchronizedViewMatrix(): Boolean = definedExternally
    open fun _computeLocalCameraSpeed(): Number = definedExternally
    open fun setTarget(target: Vector3): Unit = definedExternally
    open fun getTarget(): Vector3 = definedExternally
    open fun _decideIfNeedsToMove(): Boolean = definedExternally
    open fun _updatePosition(): Unit = definedExternally
    override fun _checkInputs(): Unit = definedExternally
    override fun _updateCameraRotationMatrix(): Unit = definedExternally
    override fun _getViewMatrix(): Matrix = definedExternally
    override fun createRigCamera(name: String, cameraIndex: Number): Camera = definedExternally
    override fun _updateRigCameras(): Unit = definedExternally
    open fun _getRigCamPosition(halfSpace: Any, result: Any): Unit = definedExternally
    override fun getClassName(): String = definedExternally
}
external open class TouchCamera(name: String, position: Vector3, scene: Scene) : FreeCamera {
    open var touchAngularSensibility: Number = definedExternally
    open var touchMoveSensibility: Number = definedExternally
    override fun getClassName(): String = definedExternally
    override fun _setupInputs(): Unit = definedExternally
}
external open class UniversalCamera(name: String, position: Vector3, scene: Scene) : TouchCamera {
    open var gamepadAngularSensibility: Number = definedExternally
    open var gamepadMoveSensibility: Number = definedExternally
    override fun getClassName(): String = definedExternally
}
external open class VirtualJoysticksCamera(name: String, position: Vector3, scene: Scene) : FreeCamera {
    override fun getClassName(): String = definedExternally
}
external open class Collider {
    open var radius: Vector3 = definedExternally
    open var retry: Number = definedExternally
    open var velocity: Vector3 = definedExternally
    open var basePoint: Vector3 = definedExternally
    open var epsilon: Number = definedExternally
    open var collisionFound: Boolean = definedExternally
    open var velocityWorldLength: Number = definedExternally
    open var basePointWorld: Vector3 = definedExternally
    open var velocityWorld: Vector3 = definedExternally
    open var normalizedVelocity: Vector3 = definedExternally
    open var initialVelocity: Vector3 = definedExternally
    open var initialPosition: Vector3 = definedExternally
    open var nearestDistance: Number = definedExternally
    open var intersectionPoint: Vector3 = definedExternally
    open var collidedMesh: AbstractMesh = definedExternally
    open var _collisionPoint: Any = definedExternally
    open var _planeIntersectionPoint: Any = definedExternally
    open var _tempVector: Any = definedExternally
    open var _tempVector2: Any = definedExternally
    open var _tempVector3: Any = definedExternally
    open var _tempVector4: Any = definedExternally
    open var _edge: Any = definedExternally
    open var _baseToVertex: Any = definedExternally
    open var _destinationPoint: Any = definedExternally
    open var _slidePlaneNormal: Any = definedExternally
    open var _displacementVector: Any = definedExternally
    open var _collisionMask: Any = definedExternally
    open var collisionMask: Number = definedExternally
    open fun _initialize(source: Vector3, dir: Vector3, e: Number): Unit = definedExternally
    open fun _checkPointInTriangle(point: Vector3, pa: Vector3, pb: Vector3, pc: Vector3, n: Vector3): Boolean = definedExternally
    open fun _canDoCollision(sphereCenter: Vector3, sphereRadius: Number, vecMin: Vector3, vecMax: Vector3): Boolean = definedExternally
    open fun _testTriangle(faceIndex: Number, trianglePlaneArray: Array<Plane>, p1: Vector3, p2: Vector3, p3: Vector3, hasMaterial: Boolean): Unit = definedExternally
    open fun _collide(trianglePlaneArray: Array<Plane>, pts: Array<Vector3>, indices: Array<Number>, indexStart: Number, indexEnd: Number, decal: Number, hasMaterial: Boolean): Unit = definedExternally
    open fun _getResponse(pos: Vector3, vel: Vector3): Unit = definedExternally
}
external var CollisionWorker: String = definedExternally
external interface ICollisionCoordinator {
    fun getNewPosition(position: Vector3, velocity: Vector3, collider: Collider, maximumRetry: Number, excludedMesh: AbstractMesh, onNewPosition: (collisionIndex: Number, newPosition: Vector3, collidedMesh: AbstractMesh? /*= null*/) -> Unit, collisionIndex: Number)
    fun init(scene: Scene)
    fun destroy()
    fun onMeshAdded(mesh: AbstractMesh): Any
    fun onMeshUpdated(mesh: AbstractMesh): Any
    fun onMeshRemoved(mesh: AbstractMesh): Any
    fun onGeometryAdded(geometry: Geometry): Any
    fun onGeometryUpdated(geometry: Geometry): Any
    fun onGeometryDeleted(geometry: Geometry): Any
}
external interface SerializedMesh {
    var id: String
    var name: String
    var uniqueId: Number
    var geometryId: String
    var sphereCenter: Array<Number>
    var sphereRadius: Number
    var boxMinimum: Array<Number>
    var boxMaximum: Array<Number>
    var worldMatrixFromCache: Any
    var subMeshes: Array<SerializedSubMesh>
    var checkCollisions: Boolean
}
external interface SerializedSubMesh {
    var position: Number
    var verticesStart: Number
    var verticesCount: Number
    var indexStart: Number
    var indexCount: Number
    var hasMaterial: Boolean
    var sphereCenter: Array<Number>
    var sphereRadius: Number
    var boxMinimum: Array<Number>
    var boxMaximum: Array<Number>
}
external interface SerializedGeometry {
    var id: String
    var positions: Float32Array
    var indices: Uint32Array
    var normals: Float32Array
}
external interface BabylonMessage {
    var taskType: WorkerTaskType
    var payload: dynamic /* InitPayload | CollidePayload | UpdatePayload */
}
external interface SerializedColliderToWorker {
    var position: Array<Number>
    var velocity: Array<Number>
    var radius: Array<Number>
}
external enum class WorkerTaskType {
    INIT /* = 0 */,
    UPDATE /* = 1 */,
    COLLIDE /* = 2 */
}
external interface WorkerReply {
    var error: WorkerReplyType
    var taskType: WorkerTaskType
    var payload: Any? get() = definedExternally; set(value) = definedExternally
}
external interface CollisionReplyPayload {
    var newPosition: Array<Number>
    var collisionId: Number
    var collidedMeshUniqueId: Number
}
external interface InitPayload
external interface CollidePayload {
    var collisionId: Number
    var collider: SerializedColliderToWorker
    var maximumRetry: Number
    var excludedMeshUniqueId: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$16` {
    @nativeGetter
    operator fun get(n: Number): SerializedMesh?
    @nativeSetter
    operator fun set(n: Number, value: SerializedMesh)
}
external interface `T$17` {
    @nativeGetter
    operator fun get(s: String): SerializedGeometry?
    @nativeSetter
    operator fun set(s: String, value: SerializedGeometry)
}
external interface UpdatePayload {
    var updatedMeshes: `T$16`
    var updatedGeometries: `T$17`
    var removedMeshes: Array<Number>
    var removedGeometries: Array<String>
}
external enum class WorkerReplyType {
    SUCCESS /* = 0 */,
    UNKNOWN_ERROR /* = 1 */
}
external open class CollisionCoordinatorWorker : ICollisionCoordinator {
    open var _scene: Any = definedExternally
    open var _scaledPosition: Any = definedExternally
    open var _scaledVelocity: Any = definedExternally
    open var _collisionsCallbackArray: Any = definedExternally
    open var _init: Any = definedExternally
    open var _runningUpdated: Any = definedExternally
    open var _runningCollisionTask: Any = definedExternally
    open var _worker: Any = definedExternally
    open var _addUpdateMeshesList: Any = definedExternally
    open var _addUpdateGeometriesList: Any = definedExternally
    open var _toRemoveMeshesArray: Any = definedExternally
    open var _toRemoveGeometryArray: Any = definedExternally
    override  fun getNewPosition(position: Vector3, velocity: Vector3, collider: Collider, maximumRetry: Number, excludedMesh: AbstractMesh, onNewPosition: (collisionIndex: Number, newPosition: Vector3, collidedMesh: AbstractMesh? /*= null*/) -> Unit, collisionIndex: Number): Unit = definedExternally
    override fun init(scene: Scene): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
    override fun onMeshAdded(mesh: AbstractMesh): Unit = definedExternally
    override fun onMeshUpdated(mesh: AbstractMesh): Any = definedExternally
    override fun onMeshRemoved(mesh: AbstractMesh): Unit = definedExternally
    override fun onGeometryAdded(geometry: Geometry): Unit = definedExternally
    override fun onGeometryUpdated(geometry: Geometry): Any = definedExternally
    override fun onGeometryDeleted(geometry: Geometry): Unit = definedExternally
    open var _afterRender: Any = definedExternally
    open var _onMessageFromWorker: Any = definedExternally
    companion object {
        var SerializeMesh: (mesh: AbstractMesh) -> SerializedMesh = definedExternally
        var SerializeGeometry: (geometry: Geometry) -> SerializedGeometry = definedExternally
    }
}
external open class CollisionCoordinatorLegacy : ICollisionCoordinator {
    open var _scene: Any = definedExternally
    open var _scaledPosition: Any = definedExternally
    open var _scaledVelocity: Any = definedExternally
    open var _finalPosition: Any = definedExternally
    override fun getNewPosition(position: Vector3, velocity: Vector3, collider: Collider, maximumRetry: Number, excludedMesh: AbstractMesh, onNewPosition: (collisionIndex: Number, newPosition: Vector3, collidedMesh: AbstractMesh? /*= null*/) -> Unit, collisionIndex: Number): Unit = definedExternally
    override fun init(scene: Scene): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
    override fun onMeshAdded(mesh: AbstractMesh): Unit = definedExternally
    override fun onMeshUpdated(mesh: AbstractMesh): Unit = definedExternally
    override fun onMeshRemoved(mesh: AbstractMesh): Unit = definedExternally
    override fun onGeometryAdded(geometry: Geometry): Unit = definedExternally
    override fun onGeometryUpdated(geometry: Geometry): Unit = definedExternally
    override fun onGeometryDeleted(geometry: Geometry): Unit = definedExternally
    open fun _collideWithWorld(position: Any, velocity: Any, collider: Any, maximumRetry: Any, finalPosition: Any, excludedMesh: Any? = definedExternally /* null */): Unit = definedExternally
}
external var WorkerIncluded: Boolean = definedExternally
external interface `T$18` {
    @nativeGetter
    operator fun get(n: Number): SerializedMesh?
    @nativeSetter
    operator fun set(n: Number, value: SerializedMesh)
}
external interface `T$19` {
    @nativeGetter
    operator fun get(s: Number): SerializedGeometry?
    @nativeSetter
    operator fun set(s: Number, value: SerializedGeometry)
}
external open class CollisionCache {
    open var _meshes: Any = definedExternally
    open var _geometries: Any = definedExternally
    open fun getMeshes(): `T$18` = definedExternally
    open fun getGeometries(): `T$19` = definedExternally
    open fun getMesh(id: Any): SerializedMesh = definedExternally
    open fun addMesh(mesh: SerializedMesh): Unit = definedExternally
    open fun removeMesh(uniqueId: Number): Unit = definedExternally
    open fun getGeometry(id: String): SerializedGeometry = definedExternally
    open fun addGeometry(geometry: SerializedGeometry): Unit = definedExternally
    open fun removeGeometry(id: String): Unit = definedExternally
}
external open class CollideWorker(collider: Collider, _collisionCache: CollisionCache, finalPosition: Vector3) {
    open var collider: Collider = definedExternally
    open var _collisionCache: Any = definedExternally
    open var finalPosition: Any = definedExternally
    open var collisionsScalingMatrix: Any = definedExternally
    open var collisionTranformationMatrix: Any = definedExternally
    open fun collideWithWorld(position: Vector3, velocity: Vector3, maximumRetry: Number, excludedMeshUniqueId: Number? = definedExternally /* null */): Unit = definedExternally
    open fun checkCollision(mesh: Any): Unit = definedExternally
    open fun processCollisionsForSubMeshes(transformMatrix: Any, mesh: Any): Unit = definedExternally
    open fun collideForSubMesh(subMesh: Any, transformMatrix: Any, meshGeometry: Any): Unit = definedExternally
    open fun checkSubmeshCollision(subMesh: Any): Unit = definedExternally
}
external interface ICollisionDetector {
    fun onInit(payload: InitPayload)
    fun onUpdate(payload: UpdatePayload)
    fun onCollision(payload: CollidePayload)
}
external open class CollisionDetectorTransferable : ICollisionDetector {
    open var _collisionCache: Any = definedExternally
    override fun onInit(payload: InitPayload): Unit = definedExternally
    override fun onUpdate(payload: UpdatePayload): Unit = definedExternally
    override fun onCollision(payload: CollidePayload): Unit = definedExternally
}
external open class IntersectionInfo(bu: Number, bv: Number, distance: Number) {
    open var bu: Number = definedExternally
    open var bv: Number = definedExternally
    open var distance: Number = definedExternally
    open var faceId: Number = definedExternally
    open var subMeshId: Number = definedExternally
}
external open class PickingInfo {
    open var hit: Boolean = definedExternally
    open var distance: Number = definedExternally
    open var pickedPoint: Vector3 = definedExternally
    open var pickedMesh: AbstractMesh = definedExternally
    open var bu: Number = definedExternally
    open var bv: Number = definedExternally
    open var faceId: Number = definedExternally
    open var subMeshId: Number = definedExternally
    open var pickedSprite: Sprite = definedExternally
    open fun getNormal(useWorldCoordinates: Boolean? = definedExternally /* null */, useVerticesNormals: Boolean? = definedExternally /* null */): Vector3 = definedExternally
    open fun getTextureCoordinates(): Vector2 = definedExternally
}
external interface `T$20` {
    var backgroundColor: String? get() = definedExternally; set(value) = definedExternally
    var backgroundColorLighter: String? get() = definedExternally; set(value) = definedExternally
    var backgroundColorLighter2: String? get() = definedExternally; set(value) = definedExternally
    var backgroundColorLighter3: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var colorTop: String? get() = definedExternally; set(value) = definedExternally
    var colorBot: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$21` {
    var popup: Boolean? get() = definedExternally; set(value) = definedExternally
    var initialTab: Number? get() = definedExternally; set(value) = definedExternally
    var parentElement: HTMLElement? get() = definedExternally; set(value) = definedExternally
    var newColors: `T$20`? get() = definedExternally; set(value) = definedExternally
}
external open class DebugLayer(scene: Scene) {
    open var _scene: Any = definedExternally
    open var _inspector: Any = definedExternally
    open fun _createInspector(config: Any? = definedExternally /* null */): Unit = definedExternally
    open fun isVisible(): Boolean = definedExternally
    open fun hide(): Unit = definedExternally
    open fun show(config: `T$21`? = definedExternally /* null */): Unit = definedExternally
    companion object {
        var InspectorURL: String = definedExternally
    }
}
external open class RayHelper(ray: Ray) {
    open var ray: Ray = definedExternally
    open var _renderPoints: Any = definedExternally
    open var _renderLine: Any = definedExternally
    open var _renderFunction: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _updateToMeshFunction: Any = definedExternally
    open var _attachedToMesh: Any = definedExternally
    open var _meshSpaceDirection: Any = definedExternally
    open var _meshSpaceOrigin: Any = definedExternally
    open fun show(scene: Scene, color: Color3): Unit = definedExternally
    open fun hide(): Unit = definedExternally
    open fun _render(): Unit = definedExternally
    open fun attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3? = definedExternally /* null */, meshSpaceOrigin: Vector3? = definedExternally /* null */, length: Number? = definedExternally /* null */): Unit = definedExternally
    open fun detachFromMesh(): Unit = definedExternally
    open fun _updateToMesh(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    companion object {
        fun CreateAndShow(ray: Ray, scene: Scene, color: Color3): RayHelper = definedExternally
    }
}
external open class BoundingBox(minimum: Vector3, maximum: Vector3) : ICullable {
    open var minimum: Vector3 = definedExternally
    open var maximum: Vector3 = definedExternally
    open var vectors: Array<Vector3> = definedExternally
    open var center: Vector3 = definedExternally
    open var centerWorld: Vector3 = definedExternally
    open var extendSize: Vector3 = definedExternally
    open var extendSizeWorld: Vector3 = definedExternally
    open var directions: Array<Vector3> = definedExternally
    open var vectorsWorld: Array<Vector3> = definedExternally
    open var minimumWorld: Vector3 = definedExternally
    open var maximumWorld: Vector3 = definedExternally
    open var _worldMatrix: Any = definedExternally
    open fun getWorldMatrix(): Matrix = definedExternally
    open fun setWorldMatrix(matrix: Matrix): BoundingBox = definedExternally
    open fun _update(world: Matrix): Unit = definedExternally
    override fun isInFrustum(frustumPlanes: Array<Plane>): Boolean = definedExternally
    override fun isCompletelyInFrustum(frustumPlanes: Array<Plane>): Boolean = definedExternally
    open fun intersectsPoint(point: Vector3): Boolean = definedExternally
    open fun intersectsSphere(sphere: BoundingSphere): Boolean = definedExternally
    open fun intersectsMinMax(min: Vector3, max: Vector3): Boolean = definedExternally
    companion object {
        fun Intersects(box0: BoundingBox, box1: BoundingBox): Boolean = definedExternally
        fun IntersectsSphere(minPoint: Vector3, maxPoint: Vector3, sphereCenter: Vector3, sphereRadius: Number): Boolean = definedExternally
        fun IsCompletelyInFrustum(boundingVectors: Array<Vector3>, frustumPlanes: Array<Plane>): Boolean = definedExternally
        fun IsInFrustum(boundingVectors: Array<Vector3>, frustumPlanes: Array<Plane>): Boolean = definedExternally
    }
}
external interface ICullable {
    fun isInFrustum(frustumPlanes: Array<Plane>): Boolean
    fun isCompletelyInFrustum(frustumPlanes: Array<Plane>): Boolean
}
external open class BoundingInfo(minimum: Vector3, maximum: Vector3) : ICullable {
    open var minimum: Vector3 = definedExternally
    open var maximum: Vector3 = definedExternally
    open var boundingBox: BoundingBox = definedExternally
    open var boundingSphere: BoundingSphere = definedExternally
    open var _isLocked: Any = definedExternally
    open var isLocked: Boolean = definedExternally
    open fun update(world: Matrix): Unit = definedExternally
    override fun isInFrustum(frustumPlanes: Array<Plane>): Boolean = definedExternally
    override fun isCompletelyInFrustum(frustumPlanes: Array<Plane>): Boolean = definedExternally
    open fun _checkCollision(collider: Collider): Boolean = definedExternally
    open fun intersectsPoint(point: Vector3): Boolean = definedExternally
    open fun intersects(boundingInfo: BoundingInfo, precise: Boolean): Boolean = definedExternally
}
external open class BoundingSphere(minimum: Vector3, maximum: Vector3) {
    open var minimum: Vector3 = definedExternally
    open var maximum: Vector3 = definedExternally
    open var center: Vector3 = definedExternally
    open var radius: Number = definedExternally
    open var centerWorld: Vector3 = definedExternally
    open var radiusWorld: Number = definedExternally
    open var _tempRadiusVector: Any = definedExternally
    open fun _update(world: Matrix): Unit = definedExternally
    open fun isInFrustum(frustumPlanes: Array<Plane>): Boolean = definedExternally
    open fun intersectsPoint(point: Vector3): Boolean = definedExternally
    companion object {
        fun Intersects(sphere0: BoundingSphere, sphere1: BoundingSphere): Boolean = definedExternally
    }
}
external open class Ray(origin: Vector3, direction: Vector3, length: Number? = definedExternally /* null */) {
    open var origin: Vector3 = definedExternally
    open var direction: Vector3 = definedExternally
    open var length: Number = definedExternally
    open var _edge1: Any = definedExternally
    open var _edge2: Any = definedExternally
    open var _pvec: Any = definedExternally
    open var _tvec: Any = definedExternally
    open var _qvec: Any = definedExternally
    open var _tmpRay: Any = definedExternally
    open var _rayHelper: Any = definedExternally
    open fun intersectsBoxMinMax(minimum: Vector3, maximum: Vector3): Boolean = definedExternally
    open fun intersectsBox(box: BoundingBox): Boolean = definedExternally
    open fun intersectsSphere(sphere: BoundingSphere): Boolean = definedExternally
    open fun intersectsTriangle(vertex0: Vector3, vertex1: Vector3, vertex2: Vector3): IntersectionInfo = definedExternally
    open fun intersectsPlane(plane: Plane): Number = definedExternally
    open fun intersectsMesh(mesh: AbstractMesh, fastCheck: Boolean? = definedExternally /* null */): PickingInfo = definedExternally
    open fun intersectsMeshes(meshes: Array<AbstractMesh>, fastCheck: Boolean? = definedExternally /* null */, results: Array<PickingInfo>? = definedExternally /* null */): Array<PickingInfo> = definedExternally
    open fun _comparePickingInfo(pickingInfoA: Any, pickingInfoB: Any): Unit = definedExternally
    open fun intersectionSegment(sega: Vector3, segb: Vector3, threshold: Number): Number = definedExternally
    companion object {
        var smallnum: Any = definedExternally
        var rayl: Any = definedExternally
        fun CreateNew(x: Number, y: Number, viewportWidth: Number, viewportHeight: Number, world: Matrix, view: Matrix, projection: Matrix): Ray = definedExternally
        fun CreateNewFromTo(origin: Vector3, end: Vector3, world: Matrix? = definedExternally /* null */): Ray = definedExternally
        fun Transform(ray: Ray, matrix: Matrix): Ray = definedExternally
        fun TransformToRef(ray: Ray, matrix: Matrix, result: Ray): Unit = definedExternally
    }
}
external interface IHighlightLayerOptions {
    var mainTextureRatio: Number? get() = definedExternally; set(value) = definedExternally
    var mainTextureFixedSize: Number? get() = definedExternally; set(value) = definedExternally
    var blurTextureSizeRatio: Number? get() = definedExternally; set(value) = definedExternally
    var blurVerticalSize: Number? get() = definedExternally; set(value) = definedExternally
    var blurHorizontalSize: Number? get() = definedExternally; set(value) = definedExternally
    var alphaBlendingMode: Number? get() = definedExternally; set(value) = definedExternally
    var camera: Camera? get() = definedExternally; set(value) = definedExternally
}
external open class HighlightLayer(name: String, scene: Scene, options: IHighlightLayerOptions? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var _scene: Any = definedExternally
    open var _engine: Any = definedExternally
    open var _options: Any = definedExternally
    open var _vertexBuffers: Any = definedExternally
    open var _indexBuffer: Any = definedExternally
    open var _downSamplePostprocess: Any = definedExternally
    open var _horizontalBlurPostprocess: Any = definedExternally
    open var _verticalBlurPostprocess: Any = definedExternally
    open var _cachedDefines: Any = definedExternally
    open var _glowMapGenerationEffect: Any = definedExternally
    open var _glowMapMergeEffect: Any = definedExternally
    open var _blurTexture: Any = definedExternally
    open var _mainTexture: Any = definedExternally
    open var _mainTextureDesiredSize: Any = definedExternally
    open var _meshes: Any = definedExternally
    open var _maxSize: Any = definedExternally
    open var _shouldRender: Any = definedExternally
    open var _instanceGlowingMeshStencilReference: Any = definedExternally
    open var _excludedMeshes: Any = definedExternally
    open var innerGlow: Boolean = definedExternally
    open var outerGlow: Boolean = definedExternally
    open var isEnabled: Boolean = definedExternally
    open var blurHorizontalSize: Number = definedExternally
    open var blurVerticalSize: Number = definedExternally
    open var camera: Camera = definedExternally
    open var onDisposeObservable: Observable<HighlightLayer> = definedExternally
    open var onBeforeRenderMainTextureObservable: Observable<HighlightLayer> = definedExternally
    open var onBeforeBlurObservable: Observable<HighlightLayer> = definedExternally
    open var onAfterBlurObservable: Observable<HighlightLayer> = definedExternally
    open var onBeforeComposeObservable: Observable<HighlightLayer> = definedExternally
    open var onAfterComposeObservable: Observable<HighlightLayer> = definedExternally
    open var onSizeChangedObservable: Observable<HighlightLayer> = definedExternally
    open fun createTextureAndPostProcesses(): Unit = definedExternally
    open fun isReady(subMesh: Any, useInstances: Any, emissiveTexture: Any): Unit = definedExternally
    open fun render(): Unit = definedExternally
    open fun addExcludedMesh(mesh: Mesh): Unit = definedExternally
    open fun removeExcludedMesh(mesh: Mesh): Unit = definedExternally
    open fun addMesh(mesh: Mesh, color: Color3, glowEmissiveOnly: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun removeMesh(mesh: Mesh): Unit = definedExternally
    open fun shouldRender(): Boolean = definedExternally
    open fun setMainTextureSize(): Unit = definedExternally
    open fun defaultStencilReference(mesh: Any): Unit = definedExternally
    open fun disposeTextureAndPostProcesses(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    companion object {
        var neutralColor: Color4 = definedExternally
        var glowingMeshStencilReference: Number = definedExternally
        var normalMeshStencilReference: Number = definedExternally
    }
}
external open class Layer(name: String, imgUrl: String, scene: Scene, isBackground: Boolean? = definedExternally /* null */, color: Color4? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var texture: Texture = definedExternally
    open var isBackground: Boolean = definedExternally
    open var color: Color4 = definedExternally
    open var scale: Vector2 = definedExternally
    open var offset: Vector2 = definedExternally
    open var alphaBlendingMode: Number = definedExternally
    open var alphaTest: Boolean = definedExternally
    open var layerMask: Number = definedExternally
    open var _scene: Any = definedExternally
    open var _vertexBuffers: Any = definedExternally
    open var _indexBuffer: Any = definedExternally
    open var _effect: Any = definedExternally
    open var _alphaTestEffect: Any = definedExternally
    open var onDisposeObservable: Observable<Layer> = definedExternally
    open var _onDisposeObserver: Any = definedExternally
    open var onDispose: () -> Unit = definedExternally
    open var onBeforeRenderObservable: Observable<Layer> = definedExternally
    open var _onBeforeRenderObserver: Any = definedExternally
    open var onBeforeRender: () -> Unit = definedExternally
    open var onAfterRenderObservable: Observable<Layer> = definedExternally
    open var _onAfterRenderObserver: Any = definedExternally
    open var onAfterRender: () -> Unit = definedExternally
    open fun render(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class LensFlare(size: Number, position: Number, color: Any, imgUrl: String, system: LensFlareSystem) {
    open var size: Number = definedExternally
    open var position: Number = definedExternally
    open var color: Color3 = definedExternally
    open var texture: Texture = definedExternally
    open var alphaMode: Number = definedExternally
    open var _system: Any = definedExternally
    open var dispose: () -> Unit = definedExternally
}
external open class LensFlareSystem(name: String, emitter: Any, scene: Scene) {
    open var name: String = definedExternally
    open var lensFlares: Array<LensFlare> = definedExternally
    open var borderLimit: Number = definedExternally
    open var viewportBorder: Number = definedExternally
    open var meshesSelectionPredicate: (mesh: Mesh) -> Boolean = definedExternally
    open var layerMask: Number = definedExternally
    open var id: String = definedExternally
    open var _scene: Any = definedExternally
    open var _emitter: Any = definedExternally
    open var _vertexBuffers: Any = definedExternally
    open var _indexBuffer: Any = definedExternally
    open var _effect: Any = definedExternally
    open var _positionX: Any = definedExternally
    open var _positionY: Any = definedExternally
    open var _isEnabled: Any = definedExternally
    open var isEnabled: Boolean = definedExternally
    open fun getScene(): Scene = definedExternally
    open fun getEmitter(): Any = definedExternally
    open fun setEmitter(newEmitter: Any): Unit = definedExternally
    open fun getEmitterPosition(): Vector3 = definedExternally
    open fun computeEffectivePosition(globalViewport: Viewport): Boolean = definedExternally
    open fun _isVisible(): Boolean = definedExternally
    open fun render(): Boolean = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        fun Parse(parsedLensFlareSystem: Any, scene: Scene, rootUrl: String): LensFlareSystem = definedExternally
    }
}
external open class DirectionalLight(name: String, direction: Vector3, scene: Scene) : ShadowLight {
    open var _shadowFrustumSize: Any = definedExternally
    open var shadowFrustumSize: Number = definedExternally
    open var _shadowOrthoScale: Any = definedExternally
    open var shadowOrthoScale: Number = definedExternally
    open var autoUpdateExtends: Boolean = definedExternally
    open var _orthoLeft: Any = definedExternally
    open var _orthoRight: Any = definedExternally
    open var _orthoTop: Any = definedExternally
    open var _orthoBottom: Any = definedExternally
    override fun getClassName(): String = definedExternally
    override fun getTypeID(): Number = definedExternally
    override fun _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>): Unit = definedExternally
    open fun _setDefaultFixedFrustumShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix): Unit = definedExternally
    open fun _setDefaultAutoExtendShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>): Unit = definedExternally
    override fun _buildUniformLayout(): Unit = definedExternally
    override fun transferToEffect(effect: Effect, lightIndex: String): DirectionalLight = definedExternally
    override fun getDepthMinZ(activeCamera: Camera): Number = definedExternally
    override fun getDepthMaxZ(activeCamera: Camera): Number = definedExternally
}
external open class HemisphericLight(name: String, direction: Vector3, scene: Scene) : Light {
    open var groundColor: Color3 = definedExternally
    open var direction: Vector3 = definedExternally
    open var _worldMatrix: Any = definedExternally
    override fun _buildUniformLayout(): Unit = definedExternally
    override fun getClassName(): String = definedExternally
    open fun setDirectionToTarget(target: Vector3): Vector3 = definedExternally
    override fun getShadowGenerator(): ShadowGenerator = definedExternally
    override fun transferToEffect(effect: Effect, lightIndex: String): HemisphericLight = definedExternally
    override fun _getWorldMatrix(): Matrix = definedExternally
    override fun getTypeID(): Number = definedExternally
}
external open class Light(name: String, scene: Scene) : Node {
    open var diffuse: Color3 = definedExternally
    open var specular: Color3 = definedExternally
    open var intensity: Number = definedExternally
    open var range: Number = definedExternally
    open var _photometricScale: Any = definedExternally
    open var _intensityMode: Any = definedExternally
    open var intensityMode: Number = definedExternally
    open var _radius: Any = definedExternally
    open var radius: Number = definedExternally
    open var _renderPriority: Any = definedExternally
    open var renderPriority: Number = definedExternally
    open var shadowEnabled: Boolean = definedExternally
    open var _includedOnlyMeshes: Any = definedExternally
    open var includedOnlyMeshes: Array<AbstractMesh> = definedExternally
    open var _excludedMeshes: Any = definedExternally
    open var excludedMeshes: Array<AbstractMesh> = definedExternally
    open var _excludeWithLayerMask: Any = definedExternally
    open var excludeWithLayerMask: Number = definedExternally
    open var _includeOnlyWithLayerMask: Any = definedExternally
    open var includeOnlyWithLayerMask: Number = definedExternally
    open var _lightmapMode: Any = definedExternally
    open var lightmapMode: Number = definedExternally
    open var _parentedWorldMatrix: Any = definedExternally
    open var _shadowGenerator: IShadowGenerator = definedExternally
    open var _excludedMeshesIds: Array<String> = definedExternally
    open var _includedOnlyMeshesIds: Array<String> = definedExternally
    open var _uniformBuffer: UniformBuffer = definedExternally
    open fun _buildUniformLayout(): Unit = definedExternally
    override fun getClassName(): String = definedExternally
    open fun toString(fullDetails: Boolean? = definedExternally /* null */): String = definedExternally
    override fun setEnabled(value: Boolean): Unit = definedExternally
    open fun getShadowGenerator(): IShadowGenerator = definedExternally
    open fun getAbsolutePosition(): Vector3 = definedExternally
    open fun transferToEffect(effect: Effect, lightIndex: String): Unit = definedExternally
    open fun _getWorldMatrix(): Matrix = definedExternally
    open fun canAffectMesh(mesh: AbstractMesh): Boolean = definedExternally
    override fun getWorldMatrix(): Matrix = definedExternally
    override fun dispose(): Unit = definedExternally
    open fun getTypeID(): Number = definedExternally
    open fun getScaledIntensity(): Number = definedExternally
    open fun clone(name: String): Light = definedExternally
    open fun serialize(): Any = definedExternally
    open fun _hookArrayForExcluded(array: Any): Unit = definedExternally
    open fun _hookArrayForIncludedOnly(array: Any): Unit = definedExternally
    open fun _resyncMeshes(): Unit = definedExternally
    open fun _markMeshesAsLightDirty(): Unit = definedExternally
    open fun _computePhotometricScale(): Unit = definedExternally
    open fun _getPhotometricScale(): Unit = definedExternally
    open fun _reorderLightsInScene(): Unit = definedExternally
    companion object {
        var _LIGHTMAP_DEFAULT: Any = definedExternally
        var _LIGHTMAP_SPECULAR: Any = definedExternally
        var _LIGHTMAP_SHADOWSONLY: Any = definedExternally
        var LIGHTMAP_DEFAULT: Number = definedExternally
        var LIGHTMAP_SPECULAR: Number = definedExternally
        var LIGHTMAP_SHADOWSONLY: Number = definedExternally
        var _INTENSITYMODE_AUTOMATIC: Any = definedExternally
        var _INTENSITYMODE_LUMINOUSPOWER: Any = definedExternally
        var _INTENSITYMODE_LUMINOUSINTENSITY: Any = definedExternally
        var _INTENSITYMODE_ILLUMINANCE: Any = definedExternally
        var _INTENSITYMODE_LUMINANCE: Any = definedExternally
        var INTENSITYMODE_AUTOMATIC: Number = definedExternally
        var INTENSITYMODE_LUMINOUSPOWER: Number = definedExternally
        var INTENSITYMODE_LUMINOUSINTENSITY: Number = definedExternally
        var INTENSITYMODE_ILLUMINANCE: Number = definedExternally
        var INTENSITYMODE_LUMINANCE: Number = definedExternally
        var _LIGHTTYPEID_POINTLIGHT: Any = definedExternally
        var _LIGHTTYPEID_DIRECTIONALLIGHT: Any = definedExternally
        var _LIGHTTYPEID_SPOTLIGHT: Any = definedExternally
        var _LIGHTTYPEID_HEMISPHERICLIGHT: Any = definedExternally
        var LIGHTTYPEID_POINTLIGHT: Number = definedExternally
        var LIGHTTYPEID_DIRECTIONALLIGHT: Number = definedExternally
        var LIGHTTYPEID_SPOTLIGHT: Number = definedExternally
        var LIGHTTYPEID_HEMISPHERICLIGHT: Number = definedExternally
        fun compareLightsPriority(a: Light, b: Light): Number = definedExternally
        fun GetConstructorFromName(type: Number, name: String, scene: Scene): () -> Light = definedExternally
        fun Parse(parsedLight: Any, scene: Scene): Light = definedExternally
    }
}
external open class PointLight(name: String, position: Vector3, scene: Scene) : ShadowLight {
    open var _shadowAngle: Any = definedExternally
    open var shadowAngle: Number = definedExternally
    override var direction: Vector3 = definedExternally
    override fun getClassName(): String = definedExternally
    override fun getTypeID(): Number = definedExternally
    override fun needCube(): Boolean = definedExternally
    override fun getShadowDirection(faceIndex: Number?): Vector3 = definedExternally
    override fun _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>): Unit = definedExternally
    override fun _buildUniformLayout(): Unit = definedExternally
    override fun transferToEffect(effect: Effect, lightIndex: String): PointLight = definedExternally
}
external interface IShadowLight : Light {
    override var id: String
    var position: Vector3
    var direction: Vector3
    var transformedPosition: Vector3
    var transformedDirection: Vector3
    override var name: String
    var shadowMinZ: Number
    var shadowMaxZ: Number
    fun computeTransformedInformation(): Boolean
    override fun getScene(): Scene
    var customProjectionMatrixBuilder: (viewMatrix: Matrix, renderList: Array<AbstractMesh>, result: Matrix) -> Unit
    fun setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>): IShadowLight
    fun getDepthScale(): Number
    fun needCube(): Boolean
    fun needProjectionMatrixCompute(): Boolean
    fun forceProjectionMatrixCompute()
    fun getShadowDirection(faceIndex: Number? = definedExternally /* null */): Vector3
    fun getDepthMinZ(activeCamera: Camera): Number
    fun getDepthMaxZ(activeCamera: Camera): Number
}
external open class ShadowLight : Light, IShadowLight {
    override var id: String = definedExternally
    override var name: String = definedExternally
    override fun getScene(): Scene
    open fun _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>): Unit = definedExternally
    override var position: Vector3 = definedExternally
    open var _direction: Vector3 = definedExternally
    override var direction: Vector3 = definedExternally
    open var _shadowMinZ: Any = definedExternally
    override var shadowMinZ: Number = definedExternally
    open var _shadowMaxZ: Any = definedExternally
    override var shadowMaxZ: Number = definedExternally
    override var customProjectionMatrixBuilder: (viewMatrix: Matrix, renderList: Array<AbstractMesh>, result: Matrix) -> Unit = definedExternally
    override var transformedPosition: Vector3 = definedExternally
    override var transformedDirection: Vector3 = definedExternally
    open var _worldMatrix: Any = definedExternally
    open var _needProjectionMatrixCompute: Any = definedExternally
    override fun computeTransformedInformation(): Boolean = definedExternally
    override fun getDepthScale(): Number = definedExternally
    override fun getShadowDirection(faceIndex: Number?): Vector3 = definedExternally
    override fun getAbsolutePosition(): Vector3 = definedExternally
    open fun setDirectionToTarget(target: Vector3): Vector3 = definedExternally
    open fun getRotation(): Vector3 = definedExternally
    override fun needCube(): Boolean = definedExternally
    override fun needProjectionMatrixCompute(): Boolean = definedExternally
    override fun forceProjectionMatrixCompute(): Unit = definedExternally
    override fun _getWorldMatrix(): Matrix = definedExternally
    override fun getDepthMinZ(activeCamera: Camera): Number = definedExternally
    override fun getDepthMaxZ(activeCamera: Camera): Number = definedExternally
    override fun setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>): IShadowLight = definedExternally
}
external open class SpotLight(name: String, position: Vector3, direction: Vector3, angle: Number, exponent: Number, scene: Scene) : ShadowLight {
    open var _angle: Any = definedExternally
    open var angle: Number = definedExternally
    open var _shadowAngleScale: Any = definedExternally
    open var shadowAngleScale: Number = definedExternally
    open var exponent: Number = definedExternally
    override fun getClassName(): String = definedExternally
    override fun getTypeID(): Number = definedExternally
    override fun _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>): Unit = definedExternally
    override fun _buildUniformLayout(): Unit = definedExternally
    override fun transferToEffect(effect: Effect, lightIndex: String): SpotLight = definedExternally
}
external open class ColorCurves {
    open var _dirty: Any = definedExternally
    open var _tempColor: Any = definedExternally
    open var _globalCurve: Any = definedExternally
    open var _highlightsCurve: Any = definedExternally
    open var _midtonesCurve: Any = definedExternally
    open var _shadowsCurve: Any = definedExternally
    open var _positiveCurve: Any = definedExternally
    open var _negativeCurve: Any = definedExternally
    open var _globalHue: Any = definedExternally
    open var _globalDensity: Any = definedExternally
    open var _globalSaturation: Any = definedExternally
    open var _globalExposure: Any = definedExternally
    open var globalHue: Number = definedExternally
    open var globalDensity: Number = definedExternally
    open var globalSaturation: Number = definedExternally
    open var _highlightsHue: Any = definedExternally
    open var _highlightsDensity: Any = definedExternally
    open var _highlightsSaturation: Any = definedExternally
    open var _highlightsExposure: Any = definedExternally
    open var highlightsHue: Number = definedExternally
    open var highlightsDensity: Number = definedExternally
    open var highlightsSaturation: Number = definedExternally
    open var highlightsExposure: Number = definedExternally
    open var _midtonesHue: Any = definedExternally
    open var _midtonesDensity: Any = definedExternally
    open var _midtonesSaturation: Any = definedExternally
    open var _midtonesExposure: Any = definedExternally
    open var midtonesHue: Number = definedExternally
    open var midtonesDensity: Number = definedExternally
    open var midtonesSaturation: Number = definedExternally
    open var midtonesExposure: Number = definedExternally
    open var _shadowsHue: Any = definedExternally
    open var _shadowsDensity: Any = definedExternally
    open var _shadowsSaturation: Any = definedExternally
    open var _shadowsExposure: Any = definedExternally
    open var shadowsHue: Number = definedExternally
    open var shadowsDensity: Number = definedExternally
    open var shadowsSaturation: Number = definedExternally
    open var shadowsExposure: Number = definedExternally
    open fun getColorGradingDataToRef(hue: Any, density: Any, saturation: Any, exposure: Any, result: Any): Unit = definedExternally
    open fun clone(): ColorCurves = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        fun Bind(colorCurves: ColorCurves, effect: Effect, positiveUniform: String? = definedExternally /* null */, neutralUniform: String? = definedExternally /* null */, negativeUniform: String? = definedExternally /* null */): Unit = definedExternally
        fun PrepareUniforms(uniformsList: Array<String>): Unit = definedExternally
        fun applyColorGradingSliderNonlinear(value: Any): Unit = definedExternally
        fun fromHSBToRef(hue: Any, saturation: Any, brightness: Any, result: Any): Unit = definedExternally
        fun clamp(value: Any, min: Any, max: Any): Unit = definedExternally
        fun Parse(source: Any): ColorCurves = definedExternally
    }
}
external open class EffectFallbacks {
    open var _defines: Any = definedExternally
    open var _currentRank: Any = definedExternally
    open var _maxRank: Any = definedExternally
    open var _mesh: Any = definedExternally
    open var _meshRank: Any = definedExternally
    open fun addFallback(rank: Number, define: String): Unit = definedExternally
    open fun addCPUSkinningFallback(rank: Number, mesh: BABYLON.AbstractMesh): Unit = definedExternally
    open var isMoreFallbacks: Boolean = definedExternally
    open fun reduce(currentDefines: String): String = definedExternally
}
external open class EffectCreationOptions {
    open var attributes: Array<String> = definedExternally
    open var uniformsNames: Array<String> = definedExternally
    open var uniformBuffersNames: Array<String> = definedExternally
    open var samplers: Array<String> = definedExternally
    open var defines: Any = definedExternally
    open var fallbacks: EffectFallbacks = definedExternally
    open var onCompiled: (effect: Effect) -> Unit = definedExternally
    open var onError: (effect: Effect, errors: String) -> Unit = definedExternally
    open var indexParameters: Any = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
}
external open class Effect {
    constructor(baseName: Any, attributesNamesOrOptions: Array<String>, uniformsNamesOrEngine: Array<String>, samplers: Array<String>? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, defines: String? = definedExternally /* null */, fallbacks: EffectFallbacks? = definedExternally /* null */, onCompiled: ((effect: Effect) -> Unit)? = definedExternally /* null */, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */)
    constructor(baseName: Any, attributesNamesOrOptions: Array<String>, uniformsNamesOrEngine: Engine, samplers: Array<String>? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, defines: String? = definedExternally /* null */, fallbacks: EffectFallbacks? = definedExternally /* null */, onCompiled: ((effect: Effect) -> Unit)? = definedExternally /* null */, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */)
    constructor(baseName: Any, attributesNamesOrOptions: EffectCreationOptions, uniformsNamesOrEngine: Array<String>, samplers: Array<String>? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, defines: String? = definedExternally /* null */, fallbacks: EffectFallbacks? = definedExternally /* null */, onCompiled: ((effect: Effect) -> Unit)? = definedExternally /* null */, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */)
    constructor(baseName: Any, attributesNamesOrOptions: EffectCreationOptions, uniformsNamesOrEngine: Engine, samplers: Array<String>? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, defines: String? = definedExternally /* null */, fallbacks: EffectFallbacks? = definedExternally /* null */, onCompiled: ((effect: Effect) -> Unit)? = definedExternally /* null */, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */)
    open var name: Any = definedExternally
    open var defines: String = definedExternally
    open var onCompiled: (effect: Effect) -> Unit = definedExternally
    open var onError: (effect: Effect, errors: String) -> Unit = definedExternally
    open var onBind: (effect: Effect) -> Unit = definedExternally
    open var uniqueId: Number = definedExternally
    open var onCompileObservable: Observable<Effect> = definedExternally
    open var onErrorObservable: Observable<Effect> = definedExternally
    open var onBindObservable: Observable<Effect> = definedExternally
    open var _engine: Any = definedExternally
    open var _uniformBuffersNames: Any = definedExternally
    open var _uniformsNames: Any = definedExternally
    open var _samplers: Any = definedExternally
    open var _isReady: Any = definedExternally
    open var _compilationError: Any = definedExternally
    open var _attributesNames: Any = definedExternally
    open var _attributes: Any = definedExternally
    open var _uniforms: Any = definedExternally
    open var _key: String = definedExternally
    open var _indexParameters: Any = definedExternally
    open var _fallbacks: Any = definedExternally
    open var _program: Any = definedExternally
    open var _valueCache: Any = definedExternally
    open var key: String = definedExternally
    open fun isReady(): Boolean = definedExternally
    open fun getEngine(): Engine = definedExternally
    open fun getProgram(): WebGLProgram = definedExternally
    open fun getAttributesNames(): Array<String> = definedExternally
    open fun getAttributeLocation(index: Number): Number = definedExternally
    open fun getAttributeLocationByName(name: String): Number = definedExternally
    open fun getAttributesCount(): Number = definedExternally
    open fun getUniformIndex(uniformName: String): Number = definedExternally
    open fun getUniform(uniformName: String): WebGLUniformLocation = definedExternally
    open fun getSamplers(): Array<String> = definedExternally
    open fun getCompilationError(): String = definedExternally
    open fun getVertexShaderSource(): String = definedExternally
    open fun getFragmentShaderSource(): String = definedExternally
    open fun executeWhenCompiled(func: (effect: Effect) -> Unit): Unit = definedExternally
    open fun _loadVertexShader(vertex: Any, callback: (data: Any) -> Unit): Unit = definedExternally
    open fun _loadFragmentShader(fragment: Any, callback: (data: Any) -> Unit): Unit = definedExternally
    open fun _dumpShadersSource(vertexCode: Any, fragmentCode: Any, defines: Any): Unit = definedExternally
    open fun _processShaderConversion(sourceCode: Any, isFragment: Any, callback: Any): Unit = definedExternally
    open fun _processIncludes(sourceCode: Any, callback: Any): Unit = definedExternally
    open fun _processPrecision(source: Any): Unit = definedExternally
    open fun _prepareEffect(vertexSourceCode: Any, fragmentSourceCode: Any, attributesNames: Any, defines: Any, fallbacks: Any? = definedExternally /* null */): Unit = definedExternally
    open var isSupported: Boolean = definedExternally
    open fun _bindTexture(channel: String, texture: WebGLTexture): Unit = definedExternally
    open fun setTexture(channel: String, texture: BaseTexture): Unit = definedExternally
    open fun setTextureArray(channel: String, textures: Array<BaseTexture>): Unit = definedExternally
    open fun setTextureFromPostProcess(channel: String, postProcess: PostProcess): Unit = definedExternally
    open fun _cacheMatrix(uniformName: String, matrix: Matrix): Boolean = definedExternally
    open fun _cacheFloat2(uniformName: String, x: Number, y: Number): Boolean = definedExternally
    open fun _cacheFloat3(uniformName: String, x: Number, y: Number, z: Number): Boolean = definedExternally
    open fun _cacheFloat4(uniformName: String, x: Number, y: Number, z: Number, w: Number): Boolean = definedExternally
    open fun bindUniformBuffer(buffer: WebGLBuffer, name: String): Unit = definedExternally
    open fun bindUniformBlock(blockName: String, index: Number): Unit = definedExternally
    open fun setIntArray(uniformName: String, array: Int32Array): Effect = definedExternally
    open fun setIntArray2(uniformName: String, array: Int32Array): Effect = definedExternally
    open fun setIntArray3(uniformName: String, array: Int32Array): Effect = definedExternally
    open fun setIntArray4(uniformName: String, array: Int32Array): Effect = definedExternally
    open fun setFloatArray(uniformName: String, array: Float32Array): Effect = definedExternally
    open fun setFloatArray2(uniformName: String, array: Float32Array): Effect = definedExternally
    open fun setFloatArray3(uniformName: String, array: Float32Array): Effect = definedExternally
    open fun setFloatArray4(uniformName: String, array: Float32Array): Effect = definedExternally
    open fun setArray(uniformName: String, array: Array<Number>): Effect = definedExternally
    open fun setArray2(uniformName: String, array: Array<Number>): Effect = definedExternally
    open fun setArray3(uniformName: String, array: Array<Number>): Effect = definedExternally
    open fun setArray4(uniformName: String, array: Array<Number>): Effect = definedExternally
    open fun setMatrices(uniformName: String, matrices: Float32Array): Effect = definedExternally
    open fun setMatrix(uniformName: String, matrix: Matrix): Effect = definedExternally
    open fun setMatrix3x3(uniformName: String, matrix: Float32Array): Effect = definedExternally
    open fun setMatrix2x2(uniformName: String, matrix: Float32Array): Effect = definedExternally
    open fun setFloat(uniformName: String, value: Number): Effect = definedExternally
    open fun setBool(uniformName: String, bool: Boolean): Effect = definedExternally
    open fun setVector2(uniformName: String, vector2: Vector2): Effect = definedExternally
    open fun setFloat2(uniformName: String, x: Number, y: Number): Effect = definedExternally
    open fun setVector3(uniformName: String, vector3: Vector3): Effect = definedExternally
    open fun setFloat3(uniformName: String, x: Number, y: Number, z: Number): Effect = definedExternally
    open fun setVector4(uniformName: String, vector4: Vector4): Effect = definedExternally
    open fun setFloat4(uniformName: String, x: Number, y: Number, z: Number, w: Number): Effect = definedExternally
    open fun setColor3(uniformName: String, color3: Color3): Effect = definedExternally
    open fun setColor4(uniformName: String, color3: Color3, alpha: Number): Effect = definedExternally
    open fun _recombineShader(node: Any): Unit = definedExternally
    open fun _evaluateDefinesOnString(shaderString: Any): Unit = definedExternally
    companion object {
        var _uniqueIdSeed: Any = definedExternally
        var _baseCache: Any = definedExternally
        var ShadersStore: Any = definedExternally
        var IncludesShadersStore: Any = definedExternally
    }
}
external open class FresnelParameters {
    open var _isEnabled: Any = definedExternally
    open var isEnabled: Boolean = definedExternally
    open var leftColor: Color3 = definedExternally
    open var rightColor: Color3 = definedExternally
    open var bias: Number = definedExternally
    open var power: Number = definedExternally
    open fun clone(): FresnelParameters = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        fun Parse(parsedFresnelParameters: Any): FresnelParameters = definedExternally
    }
}
external interface IImageProcessingConfigurationDefines {
    var IMAGEPROCESSING: Boolean
    var VIGNETTE: Boolean
    var VIGNETTEBLENDMODEMULTIPLY: Boolean
    var VIGNETTEBLENDMODEOPAQUE: Boolean
    var TONEMAPPING: Boolean
    var CONTRAST: Boolean
    var EXPOSURE: Boolean
    var COLORCURVES: Boolean
    var COLORGRADING: Boolean
    var SAMPLER3DGREENDEPTH: Boolean
    var SAMPLER3DBGRMAP: Boolean
    var IMAGEPROCESSINGPOSTPROCESS: Boolean
}
external open class ImageProcessingConfiguration {
    open var colorCurves: ColorCurves = definedExternally
    open var _colorCurvesEnabled: Any = definedExternally
    open var colorCurvesEnabled: Boolean = definedExternally
    open var colorGradingTexture: BaseTexture = definedExternally
    open var _colorGradingEnabled: Any = definedExternally
    open var colorGradingEnabled: Boolean = definedExternally
    open var _colorGradingWithGreenDepth: Any = definedExternally
    open var colorGradingWithGreenDepth: Boolean = definedExternally
    open var _colorGradingBGR: Any = definedExternally
    open var colorGradingBGR: Boolean = definedExternally
    open var _exposure: Number = definedExternally
    open var exposure: Number = definedExternally
    open var _toneMappingEnabled: Any = definedExternally
    open var toneMappingEnabled: Boolean = definedExternally
    open var _contrast: Number = definedExternally
    open var contrast: Number = definedExternally
    open var vignetteStretch: Number = definedExternally
    open var vignetteCentreX: Number = definedExternally
    open var vignetteCentreY: Number = definedExternally
    open var vignetteWeight: Number = definedExternally
    open var vignetteColor: BABYLON.Color4 = definedExternally
    open var vignetteCameraFov: Number = definedExternally
    open var _vignetteBlendMode: Any = definedExternally
    open var vignetteBlendMode: Number = definedExternally
    open var _vignetteEnabled: Any = definedExternally
    open var vignetteEnabled: Boolean = definedExternally
    open var _applyByPostProcess: Any = definedExternally
    open var applyByPostProcess: Boolean = definedExternally
    open var onUpdateParameters: Observable<ImageProcessingConfiguration> = definedExternally
    open fun _updateParameters(): Unit = definedExternally
    open fun prepareDefines(defines: IImageProcessingConfigurationDefines): Unit = definedExternally
    open fun isReady(): Boolean = definedExternally
    open fun bind(effect: Effect, aspectRatio: Number? = definedExternally /* null */): Unit = definedExternally
    open fun clone(): ImageProcessingConfiguration = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        fun PrepareUniforms(uniforms: Array<String>, defines: IImageProcessingConfigurationDefines): Unit = definedExternally
        fun PrepareSamplers(samplersList: Array<String>, defines: IImageProcessingConfigurationDefines): Unit = definedExternally
        fun Parse(source: Any): ImageProcessingConfiguration = definedExternally
        var _VIGNETTEMODE_MULTIPLY: Any = definedExternally
        var _VIGNETTEMODE_OPAQUE: Any = definedExternally
        var VIGNETTEMODE_MULTIPLY: Number = definedExternally
        var VIGNETTEMODE_OPAQUE: Number = definedExternally
    }
}
external open class MaterialDefines {
    open var _keys: Any = definedExternally
    open var _isDirty: Any = definedExternally
    open var _renderId: Number = definedExternally
    open var _areLightsDirty: Boolean = definedExternally
    open var _areAttributesDirty: Boolean = definedExternally
    open var _areTexturesDirty: Boolean = definedExternally
    open var _areFresnelDirty: Boolean = definedExternally
    open var _areMiscDirty: Boolean = definedExternally
    open var _areImageProcessingDirty: Boolean = definedExternally
    open var _normals: Boolean = definedExternally
    open var _uvs: Boolean = definedExternally
    open var _needNormals: Boolean = definedExternally
    open var _needUVs: Boolean = definedExternally
    open var isDirty: Boolean = definedExternally
    open fun markAsProcessed(): Unit = definedExternally
    open fun markAsUnprocessed(): Unit = definedExternally
    open fun markAllAsDirty(): Unit = definedExternally
    open fun markAsImageProcessingDirty(): Unit = definedExternally
    open fun markAsLightDirty(): Unit = definedExternally
    open fun markAsAttributesDirty(): Unit = definedExternally
    open fun markAsTexturesDirty(): Unit = definedExternally
    open fun markAsFresnelDirty(): Unit = definedExternally
    open fun markAsMiscDirty(): Unit = definedExternally
    open fun rebuild(): Unit = definedExternally
    open fun isEqual(other: MaterialDefines): Boolean = definedExternally
    open fun cloneTo(other: MaterialDefines): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    override fun toString(): String = definedExternally
}
external interface `T$22` {
    var alphaTest: Boolean
}
external open class Material(name: String, scene: Scene, doNotAdd: Boolean? = definedExternally /* null */) {
    open var id: String = definedExternally
    open var name: String = definedExternally
    open var checkReadyOnEveryCall: Boolean = definedExternally
    open var checkReadyOnlyOnce: Boolean = definedExternally
    open var state: String = definedExternally
    open var alpha: Number = definedExternally
    open var _backFaceCulling: Boolean = definedExternally
    open var backFaceCulling: Boolean = definedExternally
    open var sideOrientation: Number = definedExternally
    open var onCompiled: (effect: Effect) -> Unit = definedExternally
    open var onError: (effect: Effect, errors: String) -> Unit = definedExternally
    open var getRenderTargetTextures: () -> SmartArray<RenderTargetTexture> = definedExternally
    open var doNotSerialize: Boolean = definedExternally
    open var storeEffectOnSubMeshes: Boolean = definedExternally
    open var onDisposeObservable: Observable<Material> = definedExternally
    open var _onDisposeObserver: Any = definedExternally
    open var onDispose: () -> Unit = definedExternally
    open var onBindObservable: Observable<AbstractMesh> = definedExternally
    open var _onBindObserver: Any = definedExternally
    open var onBind: (Mesh: AbstractMesh) -> Unit = definedExternally
    open var onUnBindObservable: Observable<Material> = definedExternally
    open var alphaMode: Number = definedExternally
    open var disableDepthWrite: Boolean = definedExternally
    open var _fogEnabled: Any = definedExternally
    open var fogEnabled: Boolean = definedExternally
    open var pointSize: Number = definedExternally
    open var zOffset: Number = definedExternally
    open var wireframe: Boolean = definedExternally
    open var pointsCloud: Boolean = definedExternally
    open var fillMode: Number = definedExternally
    open var _effect: Effect = definedExternally
    open var _wasPreviouslyReady: Boolean = definedExternally
    open var _useUBO: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _fillMode: Any = definedExternally
    open var _cachedDepthWriteState: Any = definedExternally
    open var _uniformBuffer: UniformBuffer = definedExternally
    open fun toString(fullDetails: Boolean? = definedExternally /* null */): String = definedExternally
    open fun getClassName(): String = definedExternally
    open var isFrozen: Boolean = definedExternally
    open fun freeze(): Unit = definedExternally
    open fun unfreeze(): Unit = definedExternally
    open fun isReady(mesh: AbstractMesh? = definedExternally /* null */, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun getEffect(): Effect = definedExternally
    open fun getScene(): Scene = definedExternally
    open fun needAlphaBlending(): Boolean = definedExternally
    open fun needAlphaTesting(): Boolean = definedExternally
    open fun getAlphaTestTexture(): BaseTexture = definedExternally
    open fun markDirty(): Unit = definedExternally
    open fun _preBind(effect: Effect? = definedExternally /* null */): Unit = definedExternally
    open fun bind(world: Matrix, mesh: Mesh? = definedExternally /* null */): Unit = definedExternally
    open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun bindOnlyWorldMatrix(world: Matrix): Unit = definedExternally
    open fun bindSceneUniformBuffer(effect: Effect, sceneUbo: UniformBuffer): Unit = definedExternally
    open fun bindView(effect: Effect): Unit = definedExternally
    open fun bindViewProjection(effect: Effect): Unit = definedExternally
    open fun _afterBind(mesh: Mesh): Unit = definedExternally
    open fun unbind(): Unit = definedExternally
    open fun getActiveTextures(): Array<BaseTexture> = definedExternally
    open fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    open fun clone(name: String): Material = definedExternally
    open fun getBindedMeshes(): Array<AbstractMesh> = definedExternally
    open fun forceCompilation(mesh: AbstractMesh, onCompiled: (material: Material) -> Unit, options: `T$22`? = definedExternally /* null */): Unit = definedExternally
    open fun markAsDirty(flag: Number): Unit = definedExternally
    open fun _markAllSubMeshesAsDirty(func: (defines: MaterialDefines) -> Unit): Unit = definedExternally
    open fun _markAllSubMeshesAsImageProcessingDirty(): Unit = definedExternally
    open fun _markAllSubMeshesAsTexturesDirty(): Unit = definedExternally
    open fun _markAllSubMeshesAsFresnelDirty(): Unit = definedExternally
    open fun _markAllSubMeshesAsLightsDirty(): Unit = definedExternally
    open fun _markAllSubMeshesAsAttributesDirty(): Unit = definedExternally
    open fun _markAllSubMeshesAsMiscDirty(): Unit = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */, forceDisposeTextures: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        var _TriangleFillMode: Any = definedExternally
        var _WireFrameFillMode: Any = definedExternally
        var _PointFillMode: Any = definedExternally
        var TriangleFillMode: Number = definedExternally
        var WireFrameFillMode: Number = definedExternally
        var PointFillMode: Number = definedExternally
        var _ClockWiseSideOrientation: Any = definedExternally
        var _CounterClockWiseSideOrientation: Any = definedExternally
        var ClockWiseSideOrientation: Number = definedExternally
        var CounterClockWiseSideOrientation: Number = definedExternally
        var _TextureDirtyFlag: Any = definedExternally
        var _LightDirtyFlag: Any = definedExternally
        var _FresnelDirtyFlag: Any = definedExternally
        var _AttributesDirtyFlag: Any = definedExternally
        var _MiscDirtyFlag: Any = definedExternally
        var TextureDirtyFlag: Number = definedExternally
        var LightDirtyFlag: Number = definedExternally
        var FresnelDirtyFlag: Number = definedExternally
        var AttributesDirtyFlag: Number = definedExternally
        var MiscDirtyFlag: Number = definedExternally
        fun ParseMultiMaterial(parsedMultiMaterial: Any, scene: Scene): MultiMaterial = definedExternally
        fun Parse(parsedMaterial: Any, scene: Scene, rootUrl: String): Any = definedExternally
    }
}
external open class MaterialHelper {
    companion object {
        fun PrepareDefinesForMergedUV(texture: BaseTexture, defines: MaterialDefines, key: String): Unit = definedExternally
        fun BindTextureMatrix(texture: BaseTexture, uniformBuffer: UniformBuffer, key: String): Unit = definedExternally
        fun PrepareDefinesForMisc(mesh: AbstractMesh, scene: Scene, useLogarithmicDepth: Boolean, pointsCloud: Any, fogEnabled: Boolean, defines: MaterialDefines): Unit = definedExternally
        fun PrepareDefinesForFrameBoundValues(scene: Scene, engine: Engine, defines: MaterialDefines, useInstances: Boolean, forceAlphaTest: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun PrepareDefinesForAttributes(mesh: AbstractMesh, defines: MaterialDefines, useVertexColor: Boolean, useBones: Boolean, useMorphTargets: Boolean? = definedExternally /* null */): Boolean = definedExternally
        fun PrepareDefinesForLights(scene: Scene, mesh: AbstractMesh, defines: MaterialDefines, specularSupported: Boolean, maxSimultaneousLights: Number? = definedExternally /* null */, disableLighting: Boolean? = definedExternally /* null */): Boolean = definedExternally
        fun PrepareUniformsAndSamplersList(uniformsListOrOptions: Array<String>, samplersList: Array<String>? = definedExternally /* null */, defines: MaterialDefines? = definedExternally /* null */, maxSimultaneousLights: Number? = definedExternally /* null */): Unit = definedExternally
        fun PrepareUniformsAndSamplersList(uniformsListOrOptions: EffectCreationOptions, samplersList: Array<String>? = definedExternally /* null */, defines: MaterialDefines? = definedExternally /* null */, maxSimultaneousLights: Number? = definedExternally /* null */): Unit = definedExternally
        fun HandleFallbacksForShadows(defines: MaterialDefines, fallbacks: EffectFallbacks, maxSimultaneousLights: Number? = definedExternally /* null */): Unit = definedExternally
        fun PrepareAttributesForMorphTargets(attribs: Array<String>, mesh: AbstractMesh, defines: MaterialDefines): Unit = definedExternally
        fun PrepareAttributesForBones(attribs: Array<String>, mesh: AbstractMesh, defines: MaterialDefines, fallbacks: EffectFallbacks): Unit = definedExternally
        fun PrepareAttributesForInstances(attribs: Array<String>, defines: MaterialDefines): Unit = definedExternally
        fun BindLightShadow(light: Light, scene: Scene, mesh: AbstractMesh, lightIndex: String, effect: Effect): Unit = definedExternally
        fun BindLightProperties(light: Light, effect: Effect, lightIndex: Number): Unit = definedExternally
        fun BindLights(scene: Scene, mesh: AbstractMesh, effect: Effect, defines: MaterialDefines, maxSimultaneousLights: Number? = definedExternally /* null */, usePhysicalLightFalloff: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun BindFogParameters(scene: Scene, mesh: AbstractMesh, effect: Effect): Unit = definedExternally
        fun BindBonesParameters(mesh: AbstractMesh, effect: Effect): Unit = definedExternally
        fun BindMorphTargetParameters(abstractMesh: AbstractMesh, effect: Effect): Unit = definedExternally
        fun BindLogDepth(defines: MaterialDefines, effect: Effect, scene: Scene): Unit = definedExternally
        fun BindClipPlane(effect: Effect, scene: Scene): Unit = definedExternally
    }
}
external open class MultiMaterial(name: String, scene: Scene) : Material {
    open var _subMaterials: Any = definedExternally
    open var subMaterials: Array<Material> = definedExternally
    open fun _hookArray(array: Any): Unit = definedExternally
    open fun getSubMaterial(index: Any): Material = definedExternally
    override fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override fun getClassName(): String = definedExternally
    open fun isReady(mesh: AbstractMesh? = definedExternally /* null */): Boolean = definedExternally
    open fun clone(name: String, cloneChildren: Boolean? = definedExternally /* null */): MultiMaterial = definedExternally
    override fun serialize(): Any = definedExternally
}
external open class PushMaterial(name: String, scene: Scene) : Material {
    open var _activeEffect: Effect = definedExternally
    override fun getEffect(): Effect = definedExternally
    override fun isReady(mesh: AbstractMesh?, useInstances: Boolean?): Boolean = definedExternally
    override fun bindOnlyWorldMatrix(world: Matrix): Unit = definedExternally
    override fun bind(world: Matrix, mesh: Mesh?): Unit = definedExternally
    open fun _afterBind(mesh: Mesh, effect: Effect? = definedExternally /* null */): Unit = definedExternally
    open fun _mustRebind(scene: Scene, effect: Effect, visibility: Number? = definedExternally /* null */): Boolean = definedExternally
}
external open class ShaderMaterial(name: String, scene: Scene, shaderPath: Any, options: Any) : Material {
    open var _shaderPath: Any = definedExternally
    open var _options: Any = definedExternally
    open var _textures: Any = definedExternally
    open var _textureArrays: Any = definedExternally
    open var _floats: Any = definedExternally
    open var _floatsArrays: Any = definedExternally
    open var _colors3: Any = definedExternally
    open var _colors4: Any = definedExternally
    open var _vectors2: Any = definedExternally
    open var _vectors3: Any = definedExternally
    open var _vectors4: Any = definedExternally
    open var _matrices: Any = definedExternally
    open var _matrices3x3: Any = definedExternally
    open var _matrices2x2: Any = definedExternally
    open var _vectors3Arrays: Any = definedExternally
    open var _cachedWorldViewMatrix: Any = definedExternally
    open var _renderId: Any = definedExternally
    override fun getClassName(): String = definedExternally
    override fun needAlphaBlending(): Boolean = definedExternally
    override fun needAlphaTesting(): Boolean = definedExternally
    open fun _checkUniform(uniformName: Any): Unit = definedExternally
    open fun setTexture(name: String, texture: Texture): ShaderMaterial = definedExternally
    open fun setTextureArray(name: String, textures: Array<Texture>): ShaderMaterial = definedExternally
    open fun setFloat(name: String, value: Number): ShaderMaterial = definedExternally
    open fun setFloats(name: String, value: Array<Number>): ShaderMaterial = definedExternally
    open fun setColor3(name: String, value: Color3): ShaderMaterial = definedExternally
    open fun setColor4(name: String, value: Color4): ShaderMaterial = definedExternally
    open fun setVector2(name: String, value: Vector2): ShaderMaterial = definedExternally
    open fun setVector3(name: String, value: Vector3): ShaderMaterial = definedExternally
    open fun setVector4(name: String, value: Vector4): ShaderMaterial = definedExternally
    open fun setMatrix(name: String, value: Matrix): ShaderMaterial = definedExternally
    open fun setMatrix3x3(name: String, value: Float32Array): ShaderMaterial = definedExternally
    open fun setMatrix2x2(name: String, value: Float32Array): ShaderMaterial = definedExternally
    open fun setArray3(name: String, value: Array<Number>): ShaderMaterial = definedExternally
    open fun _checkCache(scene: Any, mesh: Any? = definedExternally /* null */, useInstances: Any? = definedExternally /* null */): Unit = definedExternally
    override fun isReady(mesh: AbstractMesh?, useInstances: Boolean?): Boolean = definedExternally
    override fun bindOnlyWorldMatrix(world: Matrix): Unit = definedExternally
    override fun bind(world: Matrix, mesh: Mesh?): Unit = definedExternally
    override fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    override fun clone(name: String): ShaderMaterial = definedExternally
    override fun dispose(forceDisposeEffect: Boolean?, forceDisposeTextures: Boolean?): Unit = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): ShaderMaterial = definedExternally
    }
}
external open class StandardMaterialDefines : MaterialDefines, IImageProcessingConfigurationDefines {
    open var MAINUV1: Boolean = definedExternally
    open var MAINUV2: Boolean = definedExternally
    open var DIFFUSE: Boolean = definedExternally
    open var DIFFUSEDIRECTUV: Number = definedExternally
    open var AMBIENT: Boolean = definedExternally
    open var AMBIENTDIRECTUV: Number = definedExternally
    open var OPACITY: Boolean = definedExternally
    open var OPACITYDIRECTUV: Number = definedExternally
    open var OPACITYRGB: Boolean = definedExternally
    open var REFLECTION: Boolean = definedExternally
    open var EMISSIVE: Boolean = definedExternally
    open var EMISSIVEDIRECTUV: Number = definedExternally
    open var SPECULAR: Boolean = definedExternally
    open var SPECULARDIRECTUV: Number = definedExternally
    open var BUMP: Boolean = definedExternally
    open var BUMPDIRECTUV: Number = definedExternally
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
    open var LIGHTMAPDIRECTUV: Number = definedExternally
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
    open var INVERTNORMALMAPX: Boolean = definedExternally
    open var INVERTNORMALMAPY: Boolean = definedExternally
    open var TWOSIDEDLIGHTING: Boolean = definedExternally
    open var SHADOWFLOAT: Boolean = definedExternally
    open var MORPHTARGETS: Boolean = definedExternally
    open var MORPHTARGETS_NORMAL: Boolean = definedExternally
    open var MORPHTARGETS_TANGENT: Boolean = definedExternally
    open var NUM_MORPH_INFLUENCERS: Number = definedExternally
    open var USERIGHTHANDEDSYSTEM: Boolean = definedExternally
    override var IMAGEPROCESSING: Boolean = definedExternally
    override var VIGNETTE: Boolean = definedExternally
    override var VIGNETTEBLENDMODEMULTIPLY: Boolean = definedExternally
    override var VIGNETTEBLENDMODEOPAQUE: Boolean = definedExternally
    override var TONEMAPPING: Boolean = definedExternally
    override var CONTRAST: Boolean = definedExternally
    override var COLORCURVES: Boolean = definedExternally
    override var COLORGRADING: Boolean = definedExternally
    override var SAMPLER3DGREENDEPTH: Boolean = definedExternally
    override var SAMPLER3DBGRMAP: Boolean = definedExternally
    override var IMAGEPROCESSINGPOSTPROCESS: Boolean = definedExternally
    override var EXPOSURE: Boolean = definedExternally
    open fun setReflectionMode(modeToEnable: String): Unit = definedExternally
}
external open class StandardMaterial(name: String, scene: Scene) : PushMaterial {
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
    open fun _attachImageProcessingConfiguration(configuration: ImageProcessingConfiguration): Unit = definedExternally
    open var cameraColorCurvesEnabled: Boolean = definedExternally
    open var cameraColorGradingEnabled: Boolean = definedExternally
    open var cameraToneMappingEnabled: Boolean = definedExternally
    open var cameraExposure: Number = definedExternally
    open var cameraContrast: Number = definedExternally
    open var cameraColorGradingTexture: BaseTexture = definedExternally
    open var customShaderNameResolve: (shaderName: String, uniforms: Array<String>, uniformBuffers: Array<String>, samplers: Array<String>, defines: StandardMaterialDefines) -> String = definedExternally
    open var _renderTargets: SmartArray<RenderTargetTexture> = definedExternally
    open var _worldViewProjectionMatrix: Matrix = definedExternally
    open var _globalAmbientColor: Color3 = definedExternally
    open var _useLogarithmicDepth: Boolean = definedExternally
    override fun getClassName(): String = definedExternally
    open var useLogarithmicDepth: Boolean = definedExternally
    override fun needAlphaBlending(): Boolean = definedExternally
    override fun needAlphaTesting(): Boolean = definedExternally
    open fun _shouldUseAlphaFromDiffuseTexture(): Boolean = definedExternally
    override fun getAlphaTestTexture(): BaseTexture = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun buildUniformLayout(): Unit = definedExternally
    override fun unbind(): Unit = definedExternally
    override fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    override fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    override fun dispose(forceDisposeEffect: Boolean?, forceDisposeTextures: Boolean?): Unit = definedExternally
    override fun clone(name: String): StandardMaterial = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): StandardMaterial = definedExternally
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
external open class UniformBuffer(engine: Engine, data: Array<Number>? = definedExternally /* null */, dynamic: Boolean? = definedExternally /* null */) {
    open var _engine: Any = definedExternally
    open var _buffer: Any = definedExternally
    open var _data: Any = definedExternally
    open var _bufferData: Any = definedExternally
    open var _dynamic: Any = definedExternally
    open var _uniformName: Any = definedExternally
    open var _uniformLocations: Any = definedExternally
    open var _uniformSizes: Any = definedExternally
    open var _uniformLocationPointer: Any = definedExternally
    open var _needSync: Any = definedExternally
    open var _cache: Any = definedExternally
    open var _noUBO: Any = definedExternally
    open var _currentEffect: Any = definedExternally
    open var updateMatrix3x3: (name: String, matrix: Float32Array) -> Unit = definedExternally
    open var updateMatrix2x2: (name: String, matrix: Float32Array) -> Unit = definedExternally
    open var updateFloat: (name: String, x: Number) -> Unit = definedExternally
    open var updateFloat2: (name: String, x: Number, y: Number, suffix: String? /*= null*/) -> Unit = definedExternally
    open var updateFloat3: (name: String, x: Number, y: Number, z: Number, suffix: String? /*= null*/) -> Unit = definedExternally
    open var updateFloat4: (name: String, x: Number, y: Number, z: Number, w: Number, suffix: String? /*= null*/) -> Unit = definedExternally
    open var updateMatrix: (name: String, mat: Matrix) -> Unit = definedExternally
    open var updateVector3: (name: String, vector: Vector3) -> Unit = definedExternally
    open var updateVector4: (name: String, vector: Vector4) -> Unit = definedExternally
    open var updateColor3: (name: String, color: Color3, suffix: String? /*= null*/) -> Unit = definedExternally
    open var updateColor4: (name: String, color: Color3, alpha: Number, suffix: String? /*= null*/) -> Unit = definedExternally
    open var useUbo: Boolean = definedExternally
    open var isSync: Boolean = definedExternally
    open fun isDynamic(): Boolean = definedExternally
    open fun getData(): Float32Array = definedExternally
    open fun getBuffer(): WebGLBuffer = definedExternally
    open fun _fillAlignment(size: Any): Unit = definedExternally
    open fun addUniform(name: String, size: Number): Unit = definedExternally
    open fun addUniform(name: String, size: Array<Number>): Unit = definedExternally
    open fun addMatrix(name: String, mat: Matrix): Unit = definedExternally
    open fun addFloat2(name: String, x: Number, y: Number): Unit = definedExternally
    open fun addFloat3(name: String, x: Number, y: Number, z: Number): Unit = definedExternally
    open fun addColor3(name: String, color: Color3): Unit = definedExternally
    open fun addColor4(name: String, color: Color3, alpha: Number): Unit = definedExternally
    open fun addVector3(name: String, vector: Vector3): Unit = definedExternally
    open fun addMatrix3x3(name: String): Unit = definedExternally
    open fun addMatrix2x2(name: String): Unit = definedExternally
    open fun create(): Unit = definedExternally
    open fun update(): Unit = definedExternally
    open fun updateUniform(uniformName: String, data: Array<Number>, size: Number): Unit = definedExternally
    open fun updateUniform(uniformName: String, data: Float32Array, size: Number): Unit = definedExternally
    open fun _updateMatrix3x3ForUniform(name: Any, matrix: Any): Unit = definedExternally
    open fun _updateMatrix3x3ForEffect(name: Any, matrix: Any): Unit = definedExternally
    open fun _updateMatrix2x2ForEffect(name: Any, matrix: Any): Unit = definedExternally
    open fun _updateMatrix2x2ForUniform(name: Any, matrix: Any): Unit = definedExternally
    open fun _updateFloatForEffect(name: Any, x: Any): Unit = definedExternally
    open fun _updateFloatForUniform(name: Any, x: Any): Unit = definedExternally
    open fun _updateFloat2ForEffect(name: Any, x: Any, y: Any, suffix: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _updateFloat2ForUniform(name: Any, x: Any, y: Any, suffix: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _updateFloat3ForEffect(name: Any, x: Any, y: Any, z: Any, suffix: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _updateFloat3ForUniform(name: Any, x: Any, y: Any, z: Any, suffix: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _updateFloat4ForEffect(name: Any, x: Any, y: Any, z: Any, w: Any, suffix: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _updateFloat4ForUniform(name: Any, x: Any, y: Any, z: Any, w: Any, suffix: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _updateMatrixForEffect(name: Any, mat: Any): Unit = definedExternally
    open fun _updateMatrixForUniform(name: Any, mat: Any): Unit = definedExternally
    open fun _updateVector3ForEffect(name: Any, vector: Any): Unit = definedExternally
    open fun _updateVector3ForUniform(name: Any, vector: Any): Unit = definedExternally
    open fun _updateVector4ForEffect(name: Any, vector: Any): Unit = definedExternally
    open fun _updateVector4ForUniform(name: Any, vector: Any): Unit = definedExternally
    open fun _updateColor3ForEffect(name: Any, color: Any, suffix: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _updateColor3ForUniform(name: Any, color: Any, suffix: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _updateColor4ForEffect(name: Any, color: Any, alpha: Any, suffix: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _updateColor4ForUniform(name: Any, color: Any, alpha: Any, suffix: Any? = definedExternally /* null */): Unit = definedExternally
    open fun setTexture(name: String, texture: BaseTexture): Unit = definedExternally
    open fun updateUniformDirectly(uniformName: String, data: Array<Number>): Unit = definedExternally
    open fun updateUniformDirectly(uniformName: String, data: Float32Array): Unit = definedExternally
    open fun bindToEffect(effect: Effect, name: String): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    companion object {
        var _MAX_UNIFORM_SIZE: Any = definedExternally
        var _tempBuffer: Any = definedExternally
    }
}
external interface ILoadingScreen {
    var displayLoadingUI: () -> Unit
    var hideLoadingUI: () -> Unit
    var loadingUIBackgroundColor: String
    var loadingUIText: String
}
external open class DefaultLoadingScreen(_renderingCanvas: HTMLCanvasElement, _loadingText: String? = definedExternally /* null */, _loadingDivBackgroundColor: String? = definedExternally /* null */) : ILoadingScreen {
    open var _renderingCanvas: Any = definedExternally
    open var _loadingText: Any = definedExternally
    open var _loadingDivBackgroundColor: Any = definedExternally
    open var _loadingDiv: Any = definedExternally
    open var _loadingTextDiv: Any = definedExternally
    open fun displayLoadingUI(): Unit = definedExternally
    open fun hideLoadingUI(): Unit = definedExternally
    override var loadingUIText: String = definedExternally
    override var loadingUIBackgroundColor: String = definedExternally
    open var _resizeLoadingUI: Any = definedExternally
    override var displayLoadingUI: () -> Unit
    override var hideLoadingUI: () -> Unit
}
external interface `T$23` {
    var isBinary: Boolean
}
external interface ISceneLoaderPluginExtensions {
    @nativeGetter
    operator fun get(extension: String): `T$23`?
    @nativeSetter
    operator fun set(extension: String, value: `T$23`)
}
external interface ISceneLoaderPlugin {
    var extensions: dynamic /* String | ISceneLoaderPluginExtensions */
    var importMesh: (meshesNames: Any, scene: Scene, data: Any, rootUrl: String, meshes: Array<AbstractMesh>, particleSystems: Array<ParticleSystem>, skeletons: Array<Skeleton>) -> Boolean
    var load: (scene: Scene, data: String, rootUrl: String) -> Boolean
    var canDirectLoad: ((data: String) -> Boolean)? get() = definedExternally; set(value) = definedExternally
}
external interface ISceneLoaderPluginAsync {
    var extensions: dynamic /* String | ISceneLoaderPluginExtensions */
    var importMeshAsync: (meshesNames: Any, scene: Scene, data: Any, rootUrl: String, onsuccess: (meshes: Array<AbstractMesh>, particleSystems: Array<ParticleSystem>, skeletons: Array<Skeleton>) -> Unit, onerror: () -> Unit) -> Unit
    var loadAsync: (scene: Scene, data: String, rootUrl: String, onsuccess: () -> Unit, onerror: () -> Unit) -> Unit
    var canDirectLoad: ((data: String) -> Boolean)? get() = definedExternally; set(value) = definedExternally
}
external open class SceneLoader {
    companion object {
        var _ForceFullSceneLoadingForIncremental: Any = definedExternally
        var _ShowLoadingScreen: Any = definedExternally
        var NO_LOGGING: Number = definedExternally
        var MINIMAL_LOGGING: Number = definedExternally
        var SUMMARY_LOGGING: Number = definedExternally
        var DETAILED_LOGGING: Number = definedExternally
        var _loggingLevel: Any = definedExternally
        var ForceFullSceneLoadingForIncremental: Boolean = definedExternally
        var ShowLoadingScreen: Boolean = definedExternally
        var loggingLevel: Number = definedExternally
        var _registeredPlugins: Any = definedExternally
        fun _getDefaultPlugin(): Unit = definedExternally
        fun _getPluginForExtension(extension: Any): Unit = definedExternally
        fun _getPluginForDirectLoad(data: Any): Unit = definedExternally
        fun _getPluginForFilename(sceneFilename: Any): Unit = definedExternally
        fun _getDirectLoad(sceneFilename: Any): Unit = definedExternally
        fun GetPluginForExtension(extension: String): dynamic /* ISceneLoaderPlugin | ISceneLoaderPluginAsync */ = definedExternally
        fun RegisterPlugin(plugin: ISceneLoaderPlugin): Unit = definedExternally
        fun RegisterPlugin(plugin: ISceneLoaderPluginAsync): Unit = definedExternally
        fun ImportMesh(meshesNames: Any, rootUrl: String, sceneFilename: String, scene: Scene, onsuccess: ((meshes: Array<Mesh>, particleSystems: Array<ParticleSystem>, skeletons: Array<Skeleton>) -> Unit)? = definedExternally /* null */, progressCallBack: (() -> Unit)? = definedExternally /* null */, onerror: ((scene: Scene, message: String, exception: Any? /*= null*/) -> Unit)? = definedExternally /* null */): Unit = definedExternally
        fun Load(rootUrl: String, sceneFilename: Any, engine: Engine, onsuccess: ((scene: Scene) -> Unit)? = definedExternally /* null */, progressCallBack: Any? = definedExternally /* null */, onerror: ((scene: Scene) -> Unit)? = definedExternally /* null */): Unit = definedExternally
        fun Append(rootUrl: String, sceneFilename: Any, scene: Scene, onsuccess: ((scene: Scene) -> Unit)? = definedExternally /* null */, progressCallBack: Any? = definedExternally /* null */, onerror: ((scene: Scene) -> Unit)? = definedExternally /* null */): Unit = definedExternally
    }
}
external open class SIMDHelper {
    companion object {
        var _isEnabled: Any = definedExternally
        var IsEnabled: Boolean = definedExternally
        fun DisableSIMD(): Unit = definedExternally
        fun EnableSIMD(): Unit = definedExternally
    }
}
external var ToGammaSpace: Number = definedExternally
external var ToLinearSpace: Any = definedExternally
external var Epsilon: Any = definedExternally
external open class MathTools {
    companion object {
        fun WithinEpsilon(a: Number, b: Number, epsilon: Number? = definedExternally /* null */): Boolean = definedExternally
        fun ToHex(i: Number): String = definedExternally
        fun Sign(value: Number): Number = definedExternally
        fun Clamp(value: Number, min: Number? = definedExternally /* null */, max: Number? = definedExternally /* null */): Number = definedExternally
        fun Log2(value: Number): Number = definedExternally
    }
}
external open class Scalar {
    companion object {
        fun Lerp(start: Number, end: Number, amount: Number): Number = definedExternally
        fun Hermite(value1: Number, tangent1: Number, value2: Number, tangent2: Number, amount: Number): Number = definedExternally
    }
}
external open class Color3(r: Number? = definedExternally /* null */, g: Number? = definedExternally /* null */, b: Number? = definedExternally /* null */) {
    open var r: Number = definedExternally
    open var g: Number = definedExternally
    open var b: Number = definedExternally
    override fun toString(): String = definedExternally
    open fun getClassName(): String = definedExternally
    open fun getHashCode(): Number = definedExternally
    open fun toArray(array: Array<Number>, index: Number? = definedExternally /* null */): Color3 = definedExternally
    open fun toArray(array: Float32Array, index: Number? = definedExternally /* null */): Color3 = definedExternally
    open fun toColor4(alpha: Number? = definedExternally /* null */): Color4 = definedExternally
    open fun asArray(): Array<Number> = definedExternally
    open fun toLuminance(): Number = definedExternally
    open fun multiply(otherColor: Color3): Color3 = definedExternally
    open fun multiplyToRef(otherColor: Color3, result: Color3): Color3 = definedExternally
    open fun equals(otherColor: Color3): Boolean = definedExternally
    open fun equalsFloats(r: Number, g: Number, b: Number): Boolean = definedExternally
    open fun scale(scale: Number): Color3 = definedExternally
    open fun scaleToRef(scale: Number, result: Color3): Color3 = definedExternally
    open fun add(otherColor: Color3): Color3 = definedExternally
    open fun addToRef(otherColor: Color3, result: Color3): Color3 = definedExternally
    open fun subtract(otherColor: Color3): Color3 = definedExternally
    open fun subtractToRef(otherColor: Color3, result: Color3): Color3 = definedExternally
    open fun clone(): Color3 = definedExternally
    open fun copyFrom(source: Color3): Color3 = definedExternally
    open fun copyFromFloats(r: Number, g: Number, b: Number): Color3 = definedExternally
    open fun set(r: Number, g: Number, b: Number): Color3 = definedExternally
    open fun toHexString(): String = definedExternally
    open fun toLinearSpace(): Color3 = definedExternally
    open fun toLinearSpaceToRef(convertedColor: Color3): Color3 = definedExternally
    open fun toGammaSpace(): Color3 = definedExternally
    open fun toGammaSpaceToRef(convertedColor: Color3): Color3 = definedExternally
    companion object {
        fun FromHexString(hex: String): Color3 = definedExternally
        fun FromArray(array: ArrayLike<Number>, offset: Number? = definedExternally /* null */): Color3 = definedExternally
        fun FromInts(r: Number, g: Number, b: Number): Color3 = definedExternally
        fun Lerp(start: Color3, end: Color3, amount: Number): Color3 = definedExternally
        fun Red(): Color3 = definedExternally
        fun Green(): Color3 = definedExternally
        fun Blue(): Color3 = definedExternally
        fun Black(): Color3 = definedExternally
        fun White(): Color3 = definedExternally
        fun Purple(): Color3 = definedExternally
        fun Magenta(): Color3 = definedExternally
        fun Yellow(): Color3 = definedExternally
        fun Gray(): Color3 = definedExternally
        fun Random(): Color3 = definedExternally
    }
}
external open class Color4(r: Number, g: Number, b: Number, a: Number) {
    open var r: Number = definedExternally
    open var g: Number = definedExternally
    open var b: Number = definedExternally
    open var a: Number = definedExternally
    open fun addInPlace(right: Any): Color4 = definedExternally
    open fun asArray(): Array<Number> = definedExternally
    open fun toArray(array: Array<Number>, index: Number? = definedExternally /* null */): Color4 = definedExternally
    open fun add(right: Color4): Color4 = definedExternally
    open fun subtract(right: Color4): Color4 = definedExternally
    open fun subtractToRef(right: Color4, result: Color4): Color4 = definedExternally
    open fun scale(scale: Number): Color4 = definedExternally
    open fun scaleToRef(scale: Number, result: Color4): Color4 = definedExternally
    open fun multiply(color: Color4): Color4 = definedExternally
    open fun multiplyToRef(color: Color4, result: Color4): Color4 = definedExternally
    override fun toString(): String = definedExternally
    open fun getClassName(): String = definedExternally
    open fun getHashCode(): Number = definedExternally
    open fun clone(): Color4 = definedExternally
    open fun copyFrom(source: Color4): Color4 = definedExternally
    open fun copyFromFloats(r: Number, g: Number, b: Number, a: Number): Color4 = definedExternally
    open fun set(r: Number, g: Number, b: Number, a: Number): Color4 = definedExternally
    open fun toHexString(): String = definedExternally
    companion object {
        fun FromHexString(hex: String): Color4 = definedExternally
        fun Lerp(left: Color4, right: Color4, amount: Number): Color4 = definedExternally
        fun LerpToRef(left: Color4, right: Color4, amount: Number, result: Color4): Unit = definedExternally
        fun FromArray(array: ArrayLike<Number>, offset: Number? = definedExternally /* null */): Color4 = definedExternally
        fun FromInts(r: Number, g: Number, b: Number, a: Number): Color4 = definedExternally
        fun CheckColors4(colors: Array<Number>, count: Number): Array<Number> = definedExternally
    }
}
external open class Vector2(x: Number, y: Number) {
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    override fun toString(): String = definedExternally
    open fun getClassName(): String = definedExternally
    open fun getHashCode(): Number = definedExternally
    open fun toArray(array: Array<Number>, index: Number? = definedExternally /* null */): Vector2 = definedExternally
    open fun toArray(array: Float32Array, index: Number? = definedExternally /* null */): Vector2 = definedExternally
    open fun asArray(): Array<Number> = definedExternally
    open fun copyFrom(source: Vector2): Vector2 = definedExternally
    open fun copyFromFloats(x: Number, y: Number): Vector2 = definedExternally
    open fun set(x: Number, y: Number): Vector2 = definedExternally
    open fun add(otherVector: Vector2): Vector2 = definedExternally
    open fun addToRef(otherVector: Vector2, result: Vector2): Vector2 = definedExternally
    open fun addInPlace(otherVector: Vector2): Vector2 = definedExternally
    open fun addVector3(otherVector: Vector3): Vector2 = definedExternally
    open fun subtract(otherVector: Vector2): Vector2 = definedExternally
    open fun subtractToRef(otherVector: Vector2, result: Vector2): Vector2 = definedExternally
    open fun subtractInPlace(otherVector: Vector2): Vector2 = definedExternally
    open fun multiplyInPlace(otherVector: Vector2): Vector2 = definedExternally
    open fun multiply(otherVector: Vector2): Vector2 = definedExternally
    open fun multiplyToRef(otherVector: Vector2, result: Vector2): Vector2 = definedExternally
    open fun multiplyByFloats(x: Number, y: Number): Vector2 = definedExternally
    open fun divide(otherVector: Vector2): Vector2 = definedExternally
    open fun divideToRef(otherVector: Vector2, result: Vector2): Vector2 = definedExternally
    open fun negate(): Vector2 = definedExternally
    open fun scaleInPlace(scale: Number): Vector2 = definedExternally
    open fun scale(scale: Number): Vector2 = definedExternally
    open fun equals(otherVector: Vector2): Boolean = definedExternally
    open fun equalsWithEpsilon(otherVector: Vector2, epsilon: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun length(): Number = definedExternally
    open fun lengthSquared(): Number = definedExternally
    open fun normalize(): Vector2 = definedExternally
    open fun clone(): Vector2 = definedExternally
    companion object {
        fun Zero(): Vector2 = definedExternally
        fun One(): Vector2 = definedExternally
        fun FromArray(array: ArrayLike<Number>, offset: Number? = definedExternally /* null */): Vector2 = definedExternally
        fun FromArrayToRef(array: ArrayLike<Number>, offset: Number, result: Vector2): Unit = definedExternally
        fun CatmullRom(value1: Vector2, value2: Vector2, value3: Vector2, value4: Vector2, amount: Number): Vector2 = definedExternally
        fun Clamp(value: Vector2, min: Vector2, max: Vector2): Vector2 = definedExternally
        fun Hermite(value1: Vector2, tangent1: Vector2, value2: Vector2, tangent2: Vector2, amount: Number): Vector2 = definedExternally
        fun Lerp(start: Vector2, end: Vector2, amount: Number): Vector2 = definedExternally
        fun Dot(left: Vector2, right: Vector2): Number = definedExternally
        fun Normalize(vector: Vector2): Vector2 = definedExternally
        fun Minimize(left: Vector2, right: Vector2): Vector2 = definedExternally
        fun Maximize(left: Vector2, right: Vector2): Vector2 = definedExternally
        fun Transform(vector: Vector2, transformation: Matrix): Vector2 = definedExternally
        fun TransformToRef(vector: Vector2, transformation: Matrix, result: Vector2): Unit = definedExternally
        fun PointInTriangle(p: Vector2, p0: Vector2, p1: Vector2, p2: Vector2): Boolean = definedExternally
        fun Distance(value1: Vector2, value2: Vector2): Number = definedExternally
        fun DistanceSquared(value1: Vector2, value2: Vector2): Number = definedExternally
        fun Center(value1: Vector2, value2: Vector2): Vector2 = definedExternally
        fun DistanceOfPointFromSegment(p: Vector2, segA: Vector2, segB: Vector2): Number = definedExternally
    }
}
external open class Vector3(x: Number, y: Number, z: Number) {
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var z: Number = definedExternally
    override fun toString(): String = definedExternally
    open fun getClassName(): String = definedExternally
    open fun getHashCode(): Number = definedExternally
    open fun asArray(): Array<Number> = definedExternally
    open fun toArray(array: Array<Number>, index: Number? = definedExternally /* null */): Vector3 = definedExternally
    open fun toArray(array: Float32Array, index: Number? = definedExternally /* null */): Vector3 = definedExternally
    open fun toQuaternion(): Quaternion = definedExternally
    open fun addInPlace(otherVector: Vector3): Vector3 = definedExternally
    open fun add(otherVector: Vector3): Vector3 = definedExternally
    open fun addToRef(otherVector: Vector3, result: Vector3): Vector3 = definedExternally
    open fun subtractInPlace(otherVector: Vector3): Vector3 = definedExternally
    open fun subtract(otherVector: Vector3): Vector3 = definedExternally
    open fun subtractToRef(otherVector: Vector3, result: Vector3): Vector3 = definedExternally
    open fun subtractFromFloats(x: Number, y: Number, z: Number): Vector3 = definedExternally
    open fun subtractFromFloatsToRef(x: Number, y: Number, z: Number, result: Vector3): Vector3 = definedExternally
    open fun negate(): Vector3 = definedExternally
    open fun scaleInPlace(scale: Number): Vector3 = definedExternally
    open fun scale(scale: Number): Vector3 = definedExternally
    open fun scaleToRef(scale: Number, result: Vector3): Vector3 = definedExternally
    open fun equals(otherVector: Vector3): Boolean = definedExternally
    open fun equalsWithEpsilon(otherVector: Vector3, epsilon: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun equalsToFloats(x: Number, y: Number, z: Number): Boolean = definedExternally
    open fun multiplyInPlace(otherVector: Vector3): Vector3 = definedExternally
    open fun multiply(otherVector: Vector3): Vector3 = definedExternally
    open fun multiplyToRef(otherVector: Vector3, result: Vector3): Vector3 = definedExternally
    open fun multiplyByFloats(x: Number, y: Number, z: Number): Vector3 = definedExternally
    open fun divide(otherVector: Vector3): Vector3 = definedExternally
    open fun divideToRef(otherVector: Vector3, result: Vector3): Vector3 = definedExternally
    open fun MinimizeInPlace(other: Vector3): Vector3 = definedExternally
    open fun MaximizeInPlace(other: Vector3): Vector3 = definedExternally
    open fun length(): Number = definedExternally
    open fun lengthSquared(): Number = definedExternally
    open fun normalize(): Vector3 = definedExternally
    open fun clone(): Vector3 = definedExternally
    open fun copyFrom(source: Vector3): Vector3 = definedExternally
    open fun copyFromFloats(x: Number, y: Number, z: Number): Vector3 = definedExternally
    open fun set(x: Number, y: Number, z: Number): Vector3 = definedExternally
    companion object {
        fun GetClipFactor(vector0: Vector3, vector1: Vector3, axis: Vector3, size: Any): Number = definedExternally
        fun FromArray(array: ArrayLike<Number>, offset: Number? = definedExternally /* null */): Vector3 = definedExternally
        fun FromFloatArray(array: Float32Array, offset: Number? = definedExternally /* null */): Vector3 = definedExternally
        fun FromArrayToRef(array: ArrayLike<Number>, offset: Number, result: Vector3): Unit = definedExternally
        fun FromFloatArrayToRef(array: Float32Array, offset: Number, result: Vector3): Unit = definedExternally
        fun FromFloatsToRef(x: Number, y: Number, z: Number, result: Vector3): Unit = definedExternally
        fun Zero(): Vector3 = definedExternally
        fun One(): Vector3 = definedExternally
        fun Up(): Vector3 = definedExternally
        fun Forward(): Vector3 = definedExternally
        fun Right(): Vector3 = definedExternally
        fun Left(): Vector3 = definedExternally
        fun TransformCoordinates(vector: Vector3, transformation: Matrix): Vector3 = definedExternally
        fun TransformCoordinatesToRef(vector: Vector3, transformation: Matrix, result: Vector3): Unit = definedExternally
        fun TransformCoordinatesFromFloatsToRef(x: Number, y: Number, z: Number, transformation: Matrix, result: Vector3): Unit = definedExternally
        fun TransformNormal(vector: Vector3, transformation: Matrix): Vector3 = definedExternally
        fun TransformNormalToRef(vector: Vector3, transformation: Matrix, result: Vector3): Unit = definedExternally
        fun TransformNormalFromFloatsToRef(x: Number, y: Number, z: Number, transformation: Matrix, result: Vector3): Unit = definedExternally
        fun CatmullRom(value1: Vector3, value2: Vector3, value3: Vector3, value4: Vector3, amount: Number): Vector3 = definedExternally
        fun Clamp(value: Vector3, min: Vector3, max: Vector3): Vector3 = definedExternally
        fun Hermite(value1: Vector3, tangent1: Vector3, value2: Vector3, tangent2: Vector3, amount: Number): Vector3 = definedExternally
        fun Lerp(start: Vector3, end: Vector3, amount: Number): Vector3 = definedExternally
        fun LerpToRef(start: Vector3, end: Vector3, amount: Number, result: Vector3): Unit = definedExternally
        fun Dot(left: Vector3, right: Vector3): Number = definedExternally
        fun Cross(left: Vector3, right: Vector3): Vector3 = definedExternally
        fun CrossToRef(left: Vector3, right: Vector3, result: Vector3): Unit = definedExternally
        fun Normalize(vector: Vector3): Vector3 = definedExternally
        fun NormalizeToRef(vector: Vector3, result: Vector3): Unit = definedExternally
        var _viewportMatrixCache: Any = definedExternally
        var _matrixCache: Any = definedExternally
        fun Project(vector: Vector3, world: Matrix, transform: Matrix, viewport: Viewport): Vector3 = definedExternally
        fun UnprojectFromTransform(source: Vector3, viewportWidth: Number, viewportHeight: Number, world: Matrix, transform: Matrix): Vector3 = definedExternally
        fun Unproject(source: Vector3, viewportWidth: Number, viewportHeight: Number, world: Matrix, view: Matrix, projection: Matrix): Vector3 = definedExternally
        fun Minimize(left: Vector3, right: Vector3): Vector3 = definedExternally
        fun Maximize(left: Vector3, right: Vector3): Vector3 = definedExternally
        fun Distance(value1: Vector3, value2: Vector3): Number = definedExternally
        fun DistanceSquared(value1: Vector3, value2: Vector3): Number = definedExternally
        fun Center(value1: Vector3, value2: Vector3): Vector3 = definedExternally
        fun RotationFromAxis(axis1: Vector3, axis2: Vector3, axis3: Vector3): Vector3 = definedExternally
        fun RotationFromAxisToRef(axis1: Vector3, axis2: Vector3, axis3: Vector3, ref: Vector3): Unit = definedExternally
    }
}
external open class Vector4(x: Number, y: Number, z: Number, w: Number) {
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var z: Number = definedExternally
    open var w: Number = definedExternally
    override fun toString(): String = definedExternally
    open fun getClassName(): String = definedExternally
    open fun getHashCode(): Number = definedExternally
    open fun asArray(): Array<Number> = definedExternally
    open fun toArray(array: Array<Number>, index: Number? = definedExternally /* null */): Vector4 = definedExternally
    open fun toArray(array: Float32Array, index: Number? = definedExternally /* null */): Vector4 = definedExternally
    open fun addInPlace(otherVector: Vector4): Vector4 = definedExternally
    open fun add(otherVector: Vector4): Vector4 = definedExternally
    open fun addToRef(otherVector: Vector4, result: Vector4): Vector4 = definedExternally
    open fun subtractInPlace(otherVector: Vector4): Vector4 = definedExternally
    open fun subtract(otherVector: Vector4): Vector4 = definedExternally
    open fun subtractToRef(otherVector: Vector4, result: Vector4): Vector4 = definedExternally
    open fun subtractFromFloats(x: Number, y: Number, z: Number, w: Number): Vector4 = definedExternally
    open fun subtractFromFloatsToRef(x: Number, y: Number, z: Number, w: Number, result: Vector4): Vector4 = definedExternally
    open fun negate(): Vector4 = definedExternally
    open fun scaleInPlace(scale: Number): Vector4 = definedExternally
    open fun scale(scale: Number): Vector4 = definedExternally
    open fun scaleToRef(scale: Number, result: Vector4): Vector4 = definedExternally
    open fun equals(otherVector: Vector4): Boolean = definedExternally
    open fun equalsWithEpsilon(otherVector: Vector4, epsilon: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun equalsToFloats(x: Number, y: Number, z: Number, w: Number): Boolean = definedExternally
    open fun multiplyInPlace(otherVector: Vector4): Vector4 = definedExternally
    open fun multiply(otherVector: Vector4): Vector4 = definedExternally
    open fun multiplyToRef(otherVector: Vector4, result: Vector4): Vector4 = definedExternally
    open fun multiplyByFloats(x: Number, y: Number, z: Number, w: Number): Vector4 = definedExternally
    open fun divide(otherVector: Vector4): Vector4 = definedExternally
    open fun divideToRef(otherVector: Vector4, result: Vector4): Vector4 = definedExternally
    open fun MinimizeInPlace(other: Vector4): Vector4 = definedExternally
    open fun MaximizeInPlace(other: Vector4): Vector4 = definedExternally
    open fun length(): Number = definedExternally
    open fun lengthSquared(): Number = definedExternally
    open fun normalize(): Vector4 = definedExternally
    open fun toVector3(): Vector3 = definedExternally
    open fun clone(): Vector4 = definedExternally
    open fun copyFrom(source: Vector4): Vector4 = definedExternally
    open fun copyFromFloats(x: Number, y: Number, z: Number, w: Number): Vector4 = definedExternally
    open fun set(x: Number, y: Number, z: Number, w: Number): Vector4 = definedExternally
    companion object {
        fun FromArray(array: ArrayLike<Number>, offset: Number? = definedExternally /* null */): Vector4 = definedExternally
        fun FromArrayToRef(array: ArrayLike<Number>, offset: Number, result: Vector4): Unit = definedExternally
        fun FromFloatArrayToRef(array: Float32Array, offset: Number, result: Vector4): Unit = definedExternally
        fun FromFloatsToRef(x: Number, y: Number, z: Number, w: Number, result: Vector4): Unit = definedExternally
        fun Zero(): Vector4 = definedExternally
        fun One(): Vector4 = definedExternally
        fun Normalize(vector: Vector4): Vector4 = definedExternally
        fun NormalizeToRef(vector: Vector4, result: Vector4): Unit = definedExternally
        fun Minimize(left: Vector4, right: Vector4): Vector4 = definedExternally
        fun Maximize(left: Vector4, right: Vector4): Vector4 = definedExternally
        fun Distance(value1: Vector4, value2: Vector4): Number = definedExternally
        fun DistanceSquared(value1: Vector4, value2: Vector4): Number = definedExternally
        fun Center(value1: Vector4, value2: Vector4): Vector4 = definedExternally
        fun TransformNormal(vector: Vector4, transformation: Matrix): Vector4 = definedExternally
        fun TransformNormalToRef(vector: Vector4, transformation: Matrix, result: Vector4): Unit = definedExternally
        fun TransformNormalFromFloatsToRef(x: Number, y: Number, z: Number, w: Number, transformation: Matrix, result: Vector4): Unit = definedExternally
    }
}
external interface ISize {
    var width: Number
    var height: Number
}
external open class Size(width: Number, height: Number) : ISize {
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override fun toString(): String = definedExternally
    open fun getClassName(): String = definedExternally
    open fun getHashCode(): Number = definedExternally
    open fun copyFrom(src: Size): Unit = definedExternally
    open fun copyFromFloats(width: Number, height: Number): Size = definedExternally
    open fun set(width: Number, height: Number): Size = definedExternally
    open fun multiplyByFloats(w: Number, h: Number): Size = definedExternally
    open fun clone(): Size = definedExternally
    open fun equals(other: Size): Boolean = definedExternally
    open var surface: Number = definedExternally
    open fun add(otherSize: Size): Size = definedExternally
    open fun subtract(otherSize: Size): Size = definedExternally
    companion object {
        fun Zero(): Size = definedExternally
        fun Lerp(start: Size, end: Size, amount: Number): Size = definedExternally
    }
}
external open class Quaternion(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */, w: Number? = definedExternally /* null */) {
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var z: Number = definedExternally
    open var w: Number = definedExternally
    override fun toString(): String = definedExternally
    open fun getClassName(): String = definedExternally
    open fun getHashCode(): Number = definedExternally
    open fun asArray(): Array<Number> = definedExternally
    open fun equals(otherQuaternion: Quaternion): Boolean = definedExternally
    open fun clone(): Quaternion = definedExternally
    open fun copyFrom(other: Quaternion): Quaternion = definedExternally
    open fun copyFromFloats(x: Number, y: Number, z: Number, w: Number): Quaternion = definedExternally
    open fun set(x: Number, y: Number, z: Number, w: Number): Quaternion = definedExternally
    open fun add(other: Quaternion): Quaternion = definedExternally
    open fun subtract(other: Quaternion): Quaternion = definedExternally
    open fun scale(value: Number): Quaternion = definedExternally
    open fun multiply(q1: Quaternion): Quaternion = definedExternally
    open fun multiplyToRef(q1: Quaternion, result: Quaternion): Quaternion = definedExternally
    open fun multiplyInPlace(q1: Quaternion): Quaternion = definedExternally
    open fun conjugateToRef(ref: Quaternion): Quaternion = definedExternally
    open fun conjugateInPlace(): Quaternion = definedExternally
    open fun conjugate(): Quaternion = definedExternally
    open fun length(): Number = definedExternally
    open fun normalize(): Quaternion = definedExternally
    open fun toEulerAngles(order: String? = definedExternally /* null */): Vector3 = definedExternally
    open fun toEulerAnglesToRef(result: Vector3, order: String? = definedExternally /* null */): Quaternion = definedExternally
    open fun toRotationMatrix(result: Matrix): Quaternion = definedExternally
    open fun fromRotationMatrix(matrix: Matrix): Quaternion = definedExternally
    companion object {
        fun FromRotationMatrix(matrix: Matrix): Quaternion = definedExternally
        fun FromRotationMatrixToRef(matrix: Matrix, result: Quaternion): Unit = definedExternally
        fun Zero(): Quaternion = definedExternally
        fun Inverse(q: Quaternion): Quaternion = definedExternally
        fun Identity(): Quaternion = definedExternally
        fun IsIdentity(quaternion: Quaternion): Boolean = definedExternally
        fun RotationAxis(axis: Vector3, angle: Number): Quaternion = definedExternally
        fun RotationAxisToRef(axis: Vector3, angle: Number, result: Quaternion): Quaternion = definedExternally
        fun FromArray(array: ArrayLike<Number>, offset: Number? = definedExternally /* null */): Quaternion = definedExternally
        fun RotationYawPitchRoll(yaw: Number, pitch: Number, roll: Number): Quaternion = definedExternally
        fun RotationYawPitchRollToRef(yaw: Number, pitch: Number, roll: Number, result: Quaternion): Unit = definedExternally
        fun RotationAlphaBetaGamma(alpha: Number, beta: Number, gamma: Number): Quaternion = definedExternally
        fun RotationAlphaBetaGammaToRef(alpha: Number, beta: Number, gamma: Number, result: Quaternion): Unit = definedExternally
        fun RotationQuaternionFromAxis(axis1: Vector3, axis2: Vector3, axis3: Vector3, ref: Quaternion): Quaternion = definedExternally
        fun RotationQuaternionFromAxisToRef(axis1: Vector3, axis2: Vector3, axis3: Vector3, ref: Quaternion): Unit = definedExternally
        fun Slerp(left: Quaternion, right: Quaternion, amount: Number): Quaternion = definedExternally
        fun SlerpToRef(left: Quaternion, right: Quaternion, amount: Number, result: Quaternion): Unit = definedExternally
        fun Hermite(value1: Quaternion, tangent1: Quaternion, value2: Quaternion, tangent2: Quaternion, amount: Number): Quaternion = definedExternally
    }
}
external open class Matrix {
    open var _isIdentity: Any = definedExternally
    open var _isIdentityDirty: Any = definedExternally
    open var updateFlag: Number = definedExternally
    open var m: Float32Array = definedExternally
    open fun _markAsUpdated(): Unit = definedExternally
    open fun isIdentity(considerAsTextureMatrix: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun determinant(): Number = definedExternally
    open fun toArray(): Float32Array = definedExternally
    open fun asArray(): Float32Array = definedExternally
    open fun invert(): Matrix = definedExternally
    open fun reset(): Matrix = definedExternally
    open fun add(other: Matrix): Matrix = definedExternally
    open fun addToRef(other: Matrix, result: Matrix): Matrix = definedExternally
    open fun addToSelf(other: Matrix): Matrix = definedExternally
    open fun invertToRef(other: Matrix): Matrix = definedExternally
    open fun setTranslationFromFloats(x: Number, y: Number, z: Number): Matrix = definedExternally
    open fun setTranslation(vector3: Vector3): Matrix = definedExternally
    open fun getTranslation(): Vector3 = definedExternally
    open fun getTranslationToRef(result: Vector3): Matrix = definedExternally
    open fun removeRotationAndScaling(): Matrix = definedExternally
    open fun multiply(other: Matrix): Matrix = definedExternally
    open fun copyFrom(other: Matrix): Matrix = definedExternally
    open fun copyToArray(array: Float32Array, offset: Number? = definedExternally /* null */): Matrix = definedExternally
    open fun multiplyToRef(other: Matrix, result: Matrix): Matrix = definedExternally
    open fun multiplyToArray(other: Matrix, result: Float32Array, offset: Number): Matrix = definedExternally
    open fun equals(value: Matrix): Boolean = definedExternally
    open fun clone(): Matrix = definedExternally
    open fun getClassName(): String = definedExternally
    open fun getHashCode(): Number = definedExternally
    open fun decompose(scale: Vector3, rotation: Quaternion, translation: Vector3): Boolean = definedExternally
    open fun getRotationMatrix(): Matrix = definedExternally
    open fun getRotationMatrixToRef(result: Matrix): Matrix = definedExternally
    open fun getRow(index: Number): Vector4 = definedExternally
    open fun setRow(index: Number, row: Vector4): Matrix = definedExternally
    open fun setRowFromFloats(index: Number, x: Number, y: Number, z: Number, w: Number): Matrix = definedExternally
    companion object {
        var _tempQuaternion: Any = definedExternally
        var _xAxis: Any = definedExternally
        var _yAxis: Any = definedExternally
        var _zAxis: Any = definedExternally
        var _updateFlagSeed: Any = definedExternally
        fun FromArray(array: ArrayLike<Number>, offset: Number? = definedExternally /* null */): Matrix = definedExternally
        fun FromArrayToRef(array: ArrayLike<Number>, offset: Number, result: Matrix): Unit = definedExternally
        fun FromFloat32ArrayToRefScaled(array: Float32Array, offset: Number, scale: Number, result: Matrix): Unit = definedExternally
        fun FromValuesToRef(initialM11: Number, initialM12: Number, initialM13: Number, initialM14: Number, initialM21: Number, initialM22: Number, initialM23: Number, initialM24: Number, initialM31: Number, initialM32: Number, initialM33: Number, initialM34: Number, initialM41: Number, initialM42: Number, initialM43: Number, initialM44: Number, result: Matrix): Unit = definedExternally
        fun FromValues(initialM11: Number, initialM12: Number, initialM13: Number, initialM14: Number, initialM21: Number, initialM22: Number, initialM23: Number, initialM24: Number, initialM31: Number, initialM32: Number, initialM33: Number, initialM34: Number, initialM41: Number, initialM42: Number, initialM43: Number, initialM44: Number): Matrix = definedExternally
        fun Compose(scale: Vector3, rotation: Quaternion, translation: Vector3): Matrix = definedExternally
        fun ComposeToRef(scale: Vector3, rotation: Quaternion, translation: Vector3, result: Matrix): Unit = definedExternally
        fun Identity(): Matrix = definedExternally
        fun IdentityToRef(result: Matrix): Unit = definedExternally
        fun Zero(): Matrix = definedExternally
        fun RotationX(angle: Number): Matrix = definedExternally
        fun Invert(source: Matrix): Matrix = definedExternally
        fun RotationXToRef(angle: Number, result: Matrix): Unit = definedExternally
        fun RotationY(angle: Number): Matrix = definedExternally
        fun RotationYToRef(angle: Number, result: Matrix): Unit = definedExternally
        fun RotationZ(angle: Number): Matrix = definedExternally
        fun RotationZToRef(angle: Number, result: Matrix): Unit = definedExternally
        fun RotationAxis(axis: Vector3, angle: Number): Matrix = definedExternally
        fun RotationAxisToRef(axis: Vector3, angle: Number, result: Matrix): Unit = definedExternally
        fun RotationYawPitchRoll(yaw: Number, pitch: Number, roll: Number): Matrix = definedExternally
        fun RotationYawPitchRollToRef(yaw: Number, pitch: Number, roll: Number, result: Matrix): Unit = definedExternally
        fun Scaling(x: Number, y: Number, z: Number): Matrix = definedExternally
        fun ScalingToRef(x: Number, y: Number, z: Number, result: Matrix): Unit = definedExternally
        fun Translation(x: Number, y: Number, z: Number): Matrix = definedExternally
        fun TranslationToRef(x: Number, y: Number, z: Number, result: Matrix): Unit = definedExternally
        fun Lerp(startValue: Matrix, endValue: Matrix, gradient: Number): Matrix = definedExternally
        fun DecomposeLerp(startValue: Matrix, endValue: Matrix, gradient: Number): Matrix = definedExternally
        fun LookAtLH(eye: Vector3, target: Vector3, up: Vector3): Matrix = definedExternally
        fun LookAtLHToRef(eye: Vector3, target: Vector3, up: Vector3, result: Matrix): Unit = definedExternally
        fun LookAtRH(eye: Vector3, target: Vector3, up: Vector3): Matrix = definedExternally
        fun LookAtRHToRef(eye: Vector3, target: Vector3, up: Vector3, result: Matrix): Unit = definedExternally
        fun OrthoLH(width: Number, height: Number, znear: Number, zfar: Number): Matrix = definedExternally
        fun OrthoLHToRef(width: Number, height: Number, znear: Number, zfar: Number, result: Matrix): Unit = definedExternally
        fun OrthoOffCenterLH(left: Number, right: Number, bottom: Number, top: Number, znear: Number, zfar: Number): Matrix = definedExternally
        fun OrthoOffCenterLHToRef(left: Number, right: Number, bottom: Number, top: Number, znear: Number, zfar: Number, result: Matrix): Unit = definedExternally
        fun OrthoOffCenterRH(left: Number, right: Number, bottom: Number, top: Number, znear: Number, zfar: Number): Matrix = definedExternally
        fun OrthoOffCenterRHToRef(left: Number, right: Any, bottom: Number, top: Number, znear: Number, zfar: Number, result: Matrix): Unit = definedExternally
        fun PerspectiveLH(width: Number, height: Number, znear: Number, zfar: Number): Matrix = definedExternally
        fun PerspectiveFovLH(fov: Number, aspect: Number, znear: Number, zfar: Number): Matrix = definedExternally
        fun PerspectiveFovLHToRef(fov: Number, aspect: Number, znear: Number, zfar: Number, result: Matrix, isVerticalFovFixed: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun PerspectiveFovRH(fov: Number, aspect: Number, znear: Number, zfar: Number): Matrix = definedExternally
        fun PerspectiveFovRHToRef(fov: Number, aspect: Number, znear: Number, zfar: Number, result: Matrix, isVerticalFovFixed: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun PerspectiveFovWebVRToRef(fov: Any, znear: Number, zfar: Number, result: Matrix, rightHanded: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun GetFinalMatrix(viewport: Viewport, world: Matrix, view: Matrix, projection: Matrix, zmin: Number, zmax: Number): Matrix = definedExternally
        fun GetAsMatrix2x2(matrix: Matrix): Float32Array = definedExternally
        fun GetAsMatrix3x3(matrix: Matrix): Float32Array = definedExternally
        fun Transpose(matrix: Matrix): Matrix = definedExternally
        fun Reflection(plane: Plane): Matrix = definedExternally
        fun ReflectionToRef(plane: Plane, result: Matrix): Unit = definedExternally
        fun FromXYZAxesToRef(xaxis: Vector3, yaxis: Vector3, zaxis: Vector3, result: Matrix): Unit = definedExternally
        fun FromQuaternionToRef(quat: Quaternion, result: Matrix): Unit = definedExternally
    }
}
external open class Plane(a: Number, b: Number, c: Number, d: Number) {
    open var normal: Vector3 = definedExternally
    open var d: Number = definedExternally
    open fun asArray(): Array<Number> = definedExternally
    open fun clone(): Plane = definedExternally
    open fun getClassName(): String = definedExternally
    open fun getHashCode(): Number = definedExternally
    open fun normalize(): Plane = definedExternally
    open fun transform(transformation: Matrix): Plane = definedExternally
    open fun dotCoordinate(point: Any): Number = definedExternally
    open fun copyFromPoints(point1: Vector3, point2: Vector3, point3: Vector3): Plane = definedExternally
    open fun isFrontFacingTo(direction: Vector3, epsilon: Number): Boolean = definedExternally
    open fun signedDistanceTo(point: Vector3): Number = definedExternally
    companion object {
        fun FromArray(array: ArrayLike<Number>): Plane = definedExternally
        fun FromPoints(point1: Any, point2: Any, point3: Any): Plane = definedExternally
        fun FromPositionAndNormal(origin: Vector3, normal: Vector3): Plane = definedExternally
        fun SignedDistanceToPlaneFromPositionAndNormal(origin: Vector3, normal: Vector3, point: Vector3): Number = definedExternally
    }
}
external open class Viewport(x: Number, y: Number, width: Number, height: Number) {
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open fun toGlobal(renderWidthOrEngine: Number, renderHeight: Number): Viewport = definedExternally
    open fun toGlobal(renderWidthOrEngine: Engine, renderHeight: Number): Viewport = definedExternally
    open fun clone(): Viewport = definedExternally
}
external open class Frustum {
    companion object {
        fun GetPlanes(transform: Matrix): Array<Plane> = definedExternally
        fun GetPlanesToRef(transform: Matrix, frustumPlanes: Array<Plane>): Unit = definedExternally
    }
}
external enum class Space {
    LOCAL /* = 0 */,
    WORLD /* = 1 */,
    BONE /* = 2 */
}
external open class Axis {
    companion object {
        var X: Vector3 = definedExternally
        var Y: Vector3 = definedExternally
        var Z: Vector3 = definedExternally
    }
}
external open class BezierCurve {
    companion object {
        fun interpolate(t: Number, x1: Number, y1: Number, x2: Number, y2: Number): Number = definedExternally
    }
}
external enum class Orientation {
    CW /* = 0 */,
    CCW /* = 1 */
}
external open class Angle(radians: Number) {
    open var _radians: Any = definedExternally
    open var degrees: () -> Number = definedExternally
    open var radians: () -> Number = definedExternally
    companion object {
        fun BetweenTwoPoints(a: Vector2, b: Vector2): Angle = definedExternally
        fun FromRadians(radians: Number): Angle = definedExternally
        fun FromDegrees(degrees: Number): Angle = definedExternally
    }
}
external open class Arc2(startPoint: Vector2, midPoint: Vector2, endPoint: Vector2) {
    open var startPoint: Vector2 = definedExternally
    open var midPoint: Vector2 = definedExternally
    open var endPoint: Vector2 = definedExternally
    open var centerPoint: Vector2 = definedExternally
    open var radius: Number = definedExternally
    open var angle: Angle = definedExternally
    open var startAngle: Angle = definedExternally
    open var orientation: Orientation = definedExternally
}
external open class Path2(x: Number, y: Number) {
    open var _points: Any = definedExternally
    open var _length: Any = definedExternally
    open var closed: Boolean = definedExternally
    open fun addLineTo(x: Number, y: Number): Path2 = definedExternally
    open fun addArcTo(midX: Number, midY: Number, endX: Number, endY: Number, numberOfSegments: Number? = definedExternally /* null */): Path2 = definedExternally
    open fun close(): Path2 = definedExternally
    open fun length(): Number = definedExternally
    open fun getPoints(): Array<Vector2> = definedExternally
    open fun getPointAtLengthPosition(normalizedLengthPosition: Number): Vector2 = definedExternally
    companion object {
        fun StartingAt(x: Number, y: Number): Path2 = definedExternally
    }
}
external open class Path3D(path: Array<Vector3>, firstNormal: Vector3? = definedExternally /* null */, raw: Boolean? = definedExternally /* null */) {
    open var path: Array<Vector3> = definedExternally
    open var _curve: Any = definedExternally
    open var _distances: Any = definedExternally
    open var _tangents: Any = definedExternally
    open var _normals: Any = definedExternally
    open var _binormals: Any = definedExternally
    open var _raw: Any = definedExternally
    open fun getCurve(): Array<Vector3> = definedExternally
    open fun getTangents(): Array<Vector3> = definedExternally
    open fun getNormals(): Array<Vector3> = definedExternally
    open fun getBinormals(): Array<Vector3> = definedExternally
    open fun getDistances(): Array<Number> = definedExternally
    open fun update(path: Array<Vector3>, firstNormal: Vector3? = definedExternally /* null */): Path3D = definedExternally
    open fun _compute(firstNormal: Any): Unit = definedExternally
    open fun _getFirstNonNullVector(index: Any): Unit = definedExternally
    open fun _getLastNonNullVector(index: Any): Unit = definedExternally
    open fun _normalVector(v0: Any, vt: Any, va: Any): Unit = definedExternally
}
external open class Curve3(points: Array<Vector3>) {
    open var _points: Any = definedExternally
    open var _length: Any = definedExternally
    open fun getPoints(): Array<Vector3> = definedExternally
    open fun length(): Number = definedExternally
    open fun `continue`(curve: Curve3): Curve3 = definedExternally
    open fun _computeLength(path: Any): Unit = definedExternally
    companion object {
        fun CreateQuadraticBezier(v0: Vector3, v1: Vector3, v2: Vector3, nbPoints: Number): Curve3 = definedExternally
        fun CreateCubicBezier(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3, nbPoints: Number): Curve3 = definedExternally
        fun CreateHermiteSpline(p1: Vector3, t1: Vector3, p2: Vector3, t2: Vector3, nbPoints: Number): Curve3 = definedExternally
        fun CreateCatmullRomSpline(points: Array<Vector3>, nbPoints: Number): Curve3 = definedExternally
    }
}
external open class PositionNormalVertex(position: Vector3? = definedExternally /* null */, normal: Vector3? = definedExternally /* null */) {
    open var position: Vector3 = definedExternally
    open var normal: Vector3 = definedExternally
    open fun clone(): PositionNormalVertex = definedExternally
}
external open class PositionNormalTextureVertex(position: Vector3? = definedExternally /* null */, normal: Vector3? = definedExternally /* null */, uv: Vector2? = definedExternally /* null */) {
    open var position: Vector3 = definedExternally
    open var normal: Vector3 = definedExternally
    open var uv: Vector2 = definedExternally
    open fun clone(): PositionNormalTextureVertex = definedExternally
}
external open class Tmp {
    companion object {
        var Color3: Array<Color3> = definedExternally
        var Vector2: Array<Vector2> = definedExternally
        var Vector3: Array<Vector3> = definedExternally
        var Vector4: Array<Vector4> = definedExternally
        var Quaternion: Array<Quaternion> = definedExternally
        var Matrix: Array<Matrix> = definedExternally
    }
}
external open class SphericalPolynomial {
    open var x: Vector3 = definedExternally
    open var y: Vector3 = definedExternally
    open var z: Vector3 = definedExternally
    open var xx: Vector3 = definedExternally
    open var yy: Vector3 = definedExternally
    open var zz: Vector3 = definedExternally
    open var xy: Vector3 = definedExternally
    open var yz: Vector3 = definedExternally
    open var zx: Vector3 = definedExternally
    open fun addAmbient(color: Color3): Unit = definedExternally
    open fun scale(scale: Number): Unit = definedExternally
    companion object {
        fun getSphericalPolynomialFromHarmonics(harmonics: SphericalHarmonics): SphericalPolynomial = definedExternally
    }
}
external open class SphericalHarmonics {
    open var L00: Vector3 = definedExternally
    open var L1_1: Vector3 = definedExternally
    open var L10: Vector3 = definedExternally
    open var L11: Vector3 = definedExternally
    open var L2_2: Vector3 = definedExternally
    open var L2_1: Vector3 = definedExternally
    open var L20: Vector3 = definedExternally
    open var L21: Vector3 = definedExternally
    open var L22: Vector3 = definedExternally
    open fun addLight(direction: Vector3, color: Color3, deltaSolidAngle: Number): Unit = definedExternally
    open fun scale(scale: Number): Unit = definedExternally
    open fun convertIncidentRadianceToIrradiance(): Unit = definedExternally
    open fun convertIrradianceToLambertianRadiance(): Unit = definedExternally
    companion object {
        fun getsphericalHarmonicsFromPolynomial(polynomial: SphericalPolynomial): SphericalHarmonics = definedExternally
    }
}
external open class AbstractMesh(name: String, scene: Scene) : Node, IDisposable, ICullable, IGetSetVerticesData {
    override fun getVerticesData(kind: String, copyWhenShared: Boolean?, forceCopy: Boolean?): dynamic
    override fun getIndices(copyWhenShared: Boolean?): dynamic
    override fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean?)
    override fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean?)
    override fun setIndices(indices: Array<Number>)
    override fun setIndices(indices: Int32Array)
    override fun setIndices(indices: Uint32Array)
    override fun setIndices(indices: Uint16Array)

    open var _facetPositions: Any = definedExternally
    open var _facetNormals: Any = definedExternally
    open var _facetPartitioning: Any = definedExternally
    open var _facetNb: Any = definedExternally
    open var _partitioningSubdivisions: Any = definedExternally
    open var _partitioningBBoxRatio: Any = definedExternally
    open var _facetDataEnabled: Any = definedExternally
    open var _facetParameters: Any = definedExternally
    open var _bbSize: Any = definedExternally
    open var _subDiv: Any = definedExternally
    open var facetNb: Number = definedExternally
    open var partitioningSubdivisions: Number = definedExternally
    open var partitioningBBoxRatio: Number = definedExternally
    open var isFacetDataEnabled: Boolean = definedExternally
    open var onCollideObservable: Observable<AbstractMesh> = definedExternally
    open var _onCollideObserver: Any = definedExternally
    open var onCollide: () -> Unit = definedExternally
    open var onCollisionPositionChangeObservable: Observable<Vector3> = definedExternally
    open var _onCollisionPositionChangeObserver: Any = definedExternally
    open var onCollisionPositionChange: () -> Unit = definedExternally
    open var onAfterWorldMatrixUpdateObservable: Observable<AbstractMesh> = definedExternally
    open var definedFacingForward: Boolean = definedExternally
    open var position: Vector3 = definedExternally
    open var _rotation: Any = definedExternally
    open var _rotationQuaternion: Any = definedExternally
    open var _scaling: Any = definedExternally
    open var billboardMode: Number = definedExternally
    open var visibility: Number = definedExternally
    open var alphaIndex: Number = definedExternally
    open var infiniteDistance: Boolean = definedExternally
    open var isVisible: Boolean = definedExternally
    open var isPickable: Boolean = definedExternally
    open var showBoundingBox: Boolean = definedExternally
    open var showSubMeshesBoundingBox: Boolean = definedExternally
    open var isBlocker: Boolean = definedExternally
    open var renderingGroupId: Number = definedExternally
    open var _material: Any = definedExternally
    open var material: Material = definedExternally
    open var _receiveShadows: Any = definedExternally
    open var receiveShadows: Boolean = definedExternally
    open var renderOutline: Boolean = definedExternally
    open var outlineColor: Color3 = definedExternally
    open var outlineWidth: Number = definedExternally
    open var renderOverlay: Boolean = definedExternally
    open var overlayColor: Color3 = definedExternally
    open var overlayAlpha: Number = definedExternally
    open var _hasVertexAlpha: Any = definedExternally
    open var hasVertexAlpha: Boolean = definedExternally
    open var _useVertexColors: Any = definedExternally
    open var useVertexColors: Boolean = definedExternally
    open var _computeBonesUsingShaders: Any = definedExternally
    open var computeBonesUsingShaders: Boolean = definedExternally
    open var _numBoneInfluencers: Any = definedExternally
    open var numBoneInfluencers: Number = definedExternally
    open var _applyFog: Any = definedExternally
    open var applyFog: Boolean = definedExternally
    open var scalingDeterminant: Number = definedExternally
    open var useOctreeForRenderingSelection: Boolean = definedExternally
    open var useOctreeForPicking: Boolean = definedExternally
    open var useOctreeForCollisions: Boolean = definedExternally
    open var layerMask: Number = definedExternally
    open var alwaysSelectAsActiveMesh: Boolean = definedExternally
    open var actionManager: ActionManager = definedExternally
    open var physicsImpostor: BABYLON.PhysicsImpostor = definedExternally
    open var _checkCollisions: Any = definedExternally
    open var _collisionMask: Any = definedExternally
    open var _collisionGroup: Any = definedExternally
    open var ellipsoid: Vector3 = definedExternally
    open var ellipsoidOffset: Vector3 = definedExternally
    open var _collider: Any = definedExternally
    open var _oldPositionForCollisions: Any = definedExternally
    open var _diffPositionForCollisions: Any = definedExternally
    open var _newPositionForCollisions: Any = definedExternally
    open var collisionMask: Number = definedExternally
    open var collisionGroup: Number = definedExternally
    open var _meshToBoneReferal: Any = definedExternally
    open var edgesWidth: Number = definedExternally
    open var edgesColor: Color4 = definedExternally
    open var _edgesRenderer: EdgesRenderer = definedExternally
    open var _localWorld: Any = definedExternally
    open var _worldMatrix: Matrix = definedExternally
    open var _absolutePosition: Any = definedExternally
    open var _collisionsTransformMatrix: Any = definedExternally
    open var _collisionsScalingMatrix: Any = definedExternally
    open var _isDirty: Any = definedExternally
    open var _masterMesh: AbstractMesh = definedExternally
    open var _boundingInfo: BoundingInfo = definedExternally
    open var _pivotMatrix: Any = definedExternally
    open var _isDisposed: Boolean = definedExternally
    open var _renderId: Number = definedExternally
    open var subMeshes: Array<SubMesh> = definedExternally
    open var _submeshesOctree: Octree<SubMesh> = definedExternally
    open var _intersectionsInProgress: Array<AbstractMesh> = definedExternally
    open var _isWorldMatrixFrozen: Any = definedExternally
    open var _unIndexed: Boolean = definedExternally
    open var _poseMatrix: Matrix = definedExternally
    open var _lightSources: Array<Light> = definedExternally
    open var _positions: Array<Vector3> = definedExternally
    open var _waitingActions: Any = definedExternally
    open var _waitingFreezeWorldMatrix: Boolean = definedExternally
    open var _skeleton: Any = definedExternally
    open var _bonesTransformMatrices: Float32Array = definedExternally
    open var skeleton: Skeleton = definedExternally
    override fun getClassName(): String = definedExternally
    open fun toString(fullDetails: Boolean? = definedExternally /* null */): String = definedExternally
    open fun _resyncLightSources(): Unit = definedExternally
    open fun _resyncLighSource(light: Light): Unit = definedExternally
    open fun _removeLightSource(light: Light): Unit = definedExternally
    open fun _markSubMeshesAsDirty(func: Any): Unit = definedExternally
    open fun _markSubMeshesAsLightDirty(): Unit = definedExternally
    open fun _markSubMeshesAsAttributesDirty(): Unit = definedExternally
    open fun _markSubMeshesAsMiscDirty(): Unit = definedExternally
    open var rotation: Vector3 = definedExternally
    open var scaling: Vector3 = definedExternally
    open var rotationQuaternion: Quaternion = definedExternally
    open fun updatePoseMatrix(matrix: Matrix): AbstractMesh = definedExternally
    open fun getPoseMatrix(): Matrix = definedExternally
    open fun disableEdgesRendering(): AbstractMesh = definedExternally
    open fun enableEdgesRendering(epsilon: Number? = definedExternally /* null */, checkVerticesInsteadOfIndices: Boolean? = definedExternally /* null */): AbstractMesh = definedExternally
    open var isBlocked: Boolean = definedExternally
    open fun getLOD(camera: Camera): AbstractMesh = definedExternally
    open fun getTotalVertices(): Number = definedExternally
    open fun getIndices(): Array<Number> = definedExternally
    open fun getVerticesData(kind: String): dynamic /* Array<Number> | Float32Array */ = definedExternally
    open fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean? = definedExternally /* null */, stride: Number? = definedExternally /* null */): Mesh = definedExternally
    open fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean? = definedExternally /* null */, stride: Number? = definedExternally /* null */): Mesh = definedExternally
    override fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean?, makeItUnique: Boolean?): Mesh = definedExternally
    override fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean?, makeItUnique: Boolean?): Mesh = definedExternally
    open fun setIndices(indices: Array<Number>, totalVertices: Number? = definedExternally /* null */): Mesh = definedExternally
    override fun isVerticesDataPresent(kind: String): Boolean = definedExternally
    open fun getBoundingInfo(): BoundingInfo = definedExternally
    open fun setBoundingInfo(boundingInfo: BoundingInfo): AbstractMesh = definedExternally
    open var useBones: Boolean = definedExternally
    open fun _preActivate(): Unit = definedExternally
    open fun _preActivateForIntermediateRendering(renderId: Number): Unit = definedExternally
    open fun _activate(renderId: Number): Unit = definedExternally
    override fun getWorldMatrix(): Matrix = definedExternally
    open var worldMatrixFromCache: Matrix = definedExternally
    open var absolutePosition: Vector3 = definedExternally
    open fun freezeWorldMatrix(): AbstractMesh = definedExternally
    open fun unfreezeWorldMatrix(): AbstractMesh /* this */ = definedExternally
    open var isWorldMatrixFrozen: Boolean = definedExternally
    open fun rotate(axis: Vector3, amount: Number, space: Space? = definedExternally /* null */): AbstractMesh = definedExternally
    open fun rotateAround(point: Vector3, axis: Vector3, amount: Number): AbstractMesh = definedExternally
    open fun translate(axis: Vector3, distance: Number, space: Space? = definedExternally /* null */): AbstractMesh = definedExternally
    open fun addRotation(x: Number, y: Number, z: Number): AbstractMesh = definedExternally
    open fun getAbsolutePosition(): Vector3 = definedExternally
    open fun setAbsolutePosition(absolutePosition: Vector3): AbstractMesh = definedExternally
    open fun movePOV(amountRight: Number, amountUp: Number, amountForward: Number): AbstractMesh = definedExternally
    open fun calcMovePOV(amountRight: Number, amountUp: Number, amountForward: Number): Vector3 = definedExternally
    open fun rotatePOV(flipBack: Number, twirlClockwise: Number, tiltRight: Number): AbstractMesh = definedExternally
    open fun calcRotatePOV(flipBack: Number, twirlClockwise: Number, tiltRight: Number): Vector3 = definedExternally
    open fun setPivotMatrix(matrix: Matrix): AbstractMesh = definedExternally
    open fun getPivotMatrix(): Matrix = definedExternally
    override fun _isSynchronized(): Boolean = definedExternally
    override fun _initCache(): Unit = definedExternally
    open fun markAsDirty(property: String): AbstractMesh = definedExternally
    open fun _updateBoundingInfo(): AbstractMesh = definedExternally
    open fun _updateSubMeshesBoundingInfo(matrix: Matrix): AbstractMesh = definedExternally
    open fun computeWorldMatrix(force: Boolean? = definedExternally /* null */): Matrix = definedExternally
    open fun registerAfterWorldMatrixUpdate(func: (mesh: AbstractMesh) -> Unit): AbstractMesh = definedExternally
    open fun unregisterAfterWorldMatrixUpdate(func: (mesh: AbstractMesh) -> Unit): AbstractMesh = definedExternally
    open fun setPositionWithLocalVector(vector3: Vector3): AbstractMesh = definedExternally
    open fun getPositionExpressedInLocalSpace(): Vector3 = definedExternally
    open fun locallyTranslate(vector3: Vector3): AbstractMesh = definedExternally
    open fun lookAt(targetPoint: Vector3, yawCor: Number? = definedExternally /* null */, pitchCor: Number? = definedExternally /* null */, rollCor: Number? = definedExternally /* null */, space: Space? = definedExternally /* null */): AbstractMesh = definedExternally
    open fun attachToBone(bone: Bone, affectedMesh: AbstractMesh): AbstractMesh = definedExternally
    open fun detachFromBone(): AbstractMesh = definedExternally
    override fun isInFrustum(frustumPlanes: Array<Plane>): Boolean = definedExternally
    override fun isCompletelyInFrustum(frustumPlanes: Array<Plane>): Boolean = definedExternally
    open fun intersectsMesh(mesh: AbstractMesh, precise: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun intersectsMesh(mesh: SolidParticle, precise: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun intersectsPoint(point: Vector3): Boolean = definedExternally
    open fun getPhysicsImpostor(): PhysicsImpostor = definedExternally
    open fun getPositionInCameraSpace(camera: Camera? = definedExternally /* null */): Vector3 = definedExternally
    open fun getDistanceToCamera(camera: Camera? = definedExternally /* null */): Number = definedExternally
    open fun applyImpulse(force: Vector3, contactPoint: Vector3): AbstractMesh = definedExternally
    open fun setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: Any? = definedExternally /* null */): AbstractMesh = definedExternally
    open var checkCollisions: Boolean = definedExternally
    open fun moveWithCollisions(velocity: Vector3): AbstractMesh = definedExternally
    open var _onCollisionPositionChange: Any = definedExternally
    open fun createOrUpdateSubmeshesOctree(maxCapacity: Number? = definedExternally /* null */, maxDepth: Number? = definedExternally /* null */): Octree<SubMesh> = definedExternally
    open fun _collideForSubMesh(subMesh: SubMesh, transformMatrix: Matrix, collider: Collider): AbstractMesh = definedExternally
    open fun _processCollisionsForSubMeshes(collider: Collider, transformMatrix: Matrix): AbstractMesh = definedExternally
    open fun _checkCollision(collider: Collider): AbstractMesh = definedExternally
    open fun _generatePointsArray(): Boolean = definedExternally
    open fun intersects(ray: Ray, fastCheck: Boolean? = definedExternally /* null */): PickingInfo = definedExternally
    open fun clone(name: String, newParent: Node? = definedExternally /* null */, doNotCloneChildren: Boolean? = definedExternally /* null */): AbstractMesh = definedExternally
    open fun releaseSubMeshes(): AbstractMesh = definedExternally
    open fun dispose(doNotRecurse: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun getDirection(localAxis: Vector3): Vector3 = definedExternally
    open fun getDirectionToRef(localAxis: Vector3, result: Vector3): AbstractMesh = definedExternally
    open fun setPivotPoint(point: Vector3, space: Space? = definedExternally /* null */): AbstractMesh = definedExternally
    open fun getPivotPoint(): Vector3 = definedExternally
    open fun getPivotPointToRef(result: Vector3): AbstractMesh = definedExternally
    open fun getAbsolutePivotPoint(): Vector3 = definedExternally
    open fun setParent(mesh: AbstractMesh): AbstractMesh = definedExternally
    open fun addChild(mesh: AbstractMesh): AbstractMesh = definedExternally
    open fun removeChild(mesh: AbstractMesh): AbstractMesh = definedExternally
    open fun getAbsolutePivotPointToRef(result: Vector3): AbstractMesh = definedExternally
    open fun _initFacetData(): Unit = definedExternally
    open fun updateFacetData(): AbstractMesh = definedExternally
    open fun getFacetLocalNormals(): Array<Vector3> = definedExternally
    open fun getFacetLocalPositions(): Array<Vector3> = definedExternally
    open fun getFacetLocalPartitioning(): Array<Array<Number>> = definedExternally
    open fun getFacetPosition(i: Number): Vector3 = definedExternally
    open fun getFacetPositionToRef(i: Number, ref: Vector3): AbstractMesh = definedExternally
    open fun getFacetNormal(i: Number): Vector3 = definedExternally
    open fun getFacetNormalToRef(i: Number, ref: Vector3): AbstractMesh /* this */ = definedExternally
    open fun getFacetsAtLocalCoordinates(x: Number, y: Number, z: Number): Array<Number> = definedExternally
    open fun getClosestFacetAtCoordinates(x: Number, y: Number, z: Number, projected: Vector3? = definedExternally /* null */, checkFace: Boolean? = definedExternally /* null */, facing: Boolean? = definedExternally /* null */): Number = definedExternally
    open fun getClosestFacetAtLocalCoordinates(x: Number, y: Number, z: Number, projected: Vector3? = definedExternally /* null */, checkFace: Boolean? = definedExternally /* null */, facing: Boolean? = definedExternally /* null */): Number = definedExternally
    open fun getFacetDataParameters(): Any = definedExternally
    open fun disableFacetData(): AbstractMesh = definedExternally
    open fun createNormals(updatable: Boolean): Unit = definedExternally
    companion object {
        var _BILLBOARDMODE_NONE: Any = definedExternally
        var _BILLBOARDMODE_X: Any = definedExternally
        var _BILLBOARDMODE_Y: Any = definedExternally
        var _BILLBOARDMODE_Z: Any = definedExternally
        var _BILLBOARDMODE_ALL: Any = definedExternally
        var BILLBOARDMODE_NONE: Number = definedExternally
        var BILLBOARDMODE_X: Number = definedExternally
        var BILLBOARDMODE_Y: Number = definedExternally
        var BILLBOARDMODE_Z: Number = definedExternally
        var BILLBOARDMODE_ALL: Number = definedExternally
        var _rotationAxisCache: Any = definedExternally
        var _lookAtVectorCache: Any = definedExternally
    }
}
external open class Buffer {
    constructor(engine: Any, data: Array<Number>, updatable: Boolean, stride: Number, postponeInternalCreation: Boolean? = definedExternally /* null */, instanced: Boolean? = definedExternally /* null */)
    constructor(engine: Any, data: Float32Array, updatable: Boolean, stride: Number, postponeInternalCreation: Boolean? = definedExternally /* null */, instanced: Boolean? = definedExternally /* null */)
    open var _engine: Any = definedExternally
    open var _buffer: Any = definedExternally
    open var _data: Any = definedExternally
    open var _updatable: Any = definedExternally
    open var _strideSize: Any = definedExternally
    open var _instanced: Any = definedExternally
    open var _instanceDivisor: Any = definedExternally
    open fun createVertexBuffer(kind: String, offset: Number, size: Number, stride: Number? = definedExternally /* null */): VertexBuffer = definedExternally
    open fun isUpdatable(): Boolean = definedExternally
    open fun getData(): dynamic /* Array<Number> | Float32Array */ = definedExternally
    open fun getBuffer(): WebGLBuffer = definedExternally
    open fun getStrideSize(): Number = definedExternally
    open fun getIsInstanced(): Boolean = definedExternally
    open var instanceDivisor: Number = definedExternally
    open fun create(data: Array<Number>? = definedExternally /* null */): Unit = definedExternally
    open fun create(data: Float32Array? = definedExternally /* null */): Unit = definedExternally
    open fun update(data: Array<Number>): Unit = definedExternally
    open fun update(data: Float32Array): Unit = definedExternally
    open fun updateDirectly(data: Float32Array, offset: Number, vertexCount: Number? = definedExternally /* null */): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class CSG {
    open var polygons: Any = definedExternally
    open var matrix: Matrix = definedExternally
    open var position: Vector3 = definedExternally
    open var rotation: Vector3 = definedExternally
    open var rotationQuaternion: Quaternion = definedExternally
    open var scaling: Vector3 = definedExternally
    open fun clone(): CSG = definedExternally
    open fun toPolygons(): Unit = definedExternally
    open fun union(csg: CSG): CSG = definedExternally
    open fun unionInPlace(csg: CSG): Unit = definedExternally
    open fun subtract(csg: CSG): CSG = definedExternally
    open fun subtractInPlace(csg: CSG): Unit = definedExternally
    open fun intersect(csg: CSG): CSG = definedExternally
    open fun intersectInPlace(csg: CSG): Unit = definedExternally
    open fun inverse(): CSG = definedExternally
    open fun inverseInPlace(): Unit = definedExternally
    open fun copyTransformAttributes(csg: CSG): CSG = definedExternally
    open fun buildMeshGeometry(name: String, scene: Scene, keepSubMeshes: Boolean): Mesh = definedExternally
    open fun toMesh(name: String, material: Material, scene: Scene, keepSubMeshes: Boolean): Mesh = definedExternally
    companion object {
        fun FromMesh(mesh: Mesh): CSG = definedExternally
        fun FromPolygons(polygons: Any): Unit = definedExternally
    }
}
external interface `T$24` {
    var minimum: Vector3
    var maximum: Vector3
}
external interface `T$25` {
    @nativeGetter
    operator fun get(key: String): VertexBuffer?
    @nativeSetter
    operator fun set(key: String, value: VertexBuffer)
}
external open class Geometry(id: String, scene: Scene, vertexData: VertexData? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, mesh: Mesh? = definedExternally /* null */) : IGetSetVerticesData {
    open var id: String = definedExternally
    override fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean?)
    override fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean?)

    open var delayLoadState: Number = definedExternally
    open var delayLoadingFile: String = definedExternally
    open var onGeometryUpdated: (geometry: Geometry, kind: String? /*= null*/) -> Unit = definedExternally
    open var _scene: Any = definedExternally
    open var _engine: Any = definedExternally
    open var _meshes: Any = definedExternally
    open var _totalVertices: Any = definedExternally
    open var _indices: Any = definedExternally
    open var _vertexBuffers: Any = definedExternally
    open var _isDisposed: Any = definedExternally
    open var _extend: Any = definedExternally
    open var _boundingBias: Any = definedExternally
    open var _delayInfo: Any = definedExternally
    open var _indexBuffer: Any = definedExternally
    open var _boundingInfo: BoundingInfo = definedExternally
    open var _delayLoadingFunction: (any: Any, geometry: Geometry) -> Unit = definedExternally
    open var _softwareSkinningRenderId: Number = definedExternally
    open var _vertexArrayObjects: Any = definedExternally
    open var _positions: Array<Vector3> = definedExternally
    open var boundingBias: Vector2 = definedExternally
    open var extend: `T$24` = definedExternally
    open fun getScene(): Scene = definedExternally
    open fun getEngine(): Engine = definedExternally
    open fun isReady(): Boolean = definedExternally
    open var doNotSerialize: Boolean = definedExternally
    open fun setAllVerticesData(vertexData: VertexData, updatable: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean? = definedExternally /* null */, stride: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean? = definedExternally /* null */, stride: Number? = definedExternally /* null */): Unit = definedExternally
    open fun removeVerticesData(kind: String): Unit = definedExternally
    open fun setVerticesBuffer(buffer: VertexBuffer): Unit = definedExternally
    open fun updateVerticesDataDirectly(kind: String, data: Float32Array, offset: Number): Unit = definedExternally
    open fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun updateBoundingInfo(updateExtends: Any, data: Any): Unit = definedExternally
    open fun _bind(effect: Effect, indexToBind: WebGLBuffer? = definedExternally /* null */): Unit = definedExternally
    open fun getTotalVertices(): Number = definedExternally
    override fun getVerticesData(kind: String, copyWhenShared: Boolean?, forceCopy: Boolean?): dynamic /* Array<Number> | Float32Array */ = definedExternally
    open fun getVertexBuffer(kind: String): VertexBuffer = definedExternally
    open fun getVertexBuffers(): `T$25` = definedExternally
    override fun isVerticesDataPresent(kind: String): Boolean = definedExternally
    open fun getVerticesDataKinds(): Array<String> = definedExternally
    open fun setIndices(indices: Array<Number>, totalVertices: Number? = definedExternally /* null */): Unit = definedExternally
    open fun getTotalIndices(): Number = definedExternally
    override fun getIndices(copyWhenShared: Boolean?): Array<Number> = definedExternally
    open fun getIndexBuffer(): WebGLBuffer = definedExternally
    open fun _releaseVertexArrayObject(effect: Effect): Unit = definedExternally
    open fun releaseForMesh(mesh: Mesh, shouldDispose: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun applyToMesh(mesh: Mesh): Unit = definedExternally
    open fun updateExtend(data: Any? = definedExternally /* null */, stride: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _applyToMesh(mesh: Any): Unit = definedExternally
    open fun notifyUpdate(kind: Any? = definedExternally /* null */): Unit = definedExternally
    open fun load(scene: Scene, onLoaded: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
    open fun _queueLoad(scene: Any, onLoaded: Any? = definedExternally /* null */): Unit = definedExternally
    open fun toLeftHanded(): Unit = definedExternally
    open fun _resetPointsArrayCache(): Unit = definedExternally
    open fun _generatePointsArray(): Boolean = definedExternally
    open fun isDisposed(): Boolean = definedExternally
    open fun _disposeVertexArrayObjects(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun copy(id: String): Geometry = definedExternally
    open fun serialize(): Any = definedExternally
    open fun toNumberArray(origin: Any): Unit = definedExternally
    open fun serializeVerticeData(): Any = definedExternally

    override open fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean? /* null */, makeItUnique: Boolean? /* null */): Any = definedExternally
    override open fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean? /* null */, makeItUnique: Boolean? /* null */): Any = definedExternally
    override open fun setIndices(indices: Array<Number>): Any = definedExternally
    override open fun setIndices(indices: Int32Array): Any = definedExternally
    override open fun setIndices(indices: Uint32Array): Any = definedExternally
    override open fun setIndices(indices: Uint16Array): Any = definedExternally
    companion object {
        fun ExtractFromMesh(mesh: Mesh, id: String): Geometry = definedExternally
        fun RandomId(): String = definedExternally
        fun ImportGeometry(parsedGeometry: Any, mesh: Mesh): Unit = definedExternally
        fun Parse(parsedVertexData: Any, scene: Scene, rootUrl: String): Geometry = definedExternally
    }
}
external open class GroundMesh(name: String, scene: Scene) : Mesh {
    open var generateOctree: Boolean = definedExternally
    open var _worldInverse: Any = definedExternally
    open var _heightQuads: Any = definedExternally
    open var _subdivisionsX: Number = definedExternally
    open var _subdivisionsY: Number = definedExternally
    open var _width: Number = definedExternally
    open var _height: Number = definedExternally
    open var _minX: Number = definedExternally
    open var _maxX: Number = definedExternally
    open var _minZ: Number = definedExternally
    open var _maxZ: Number = definedExternally
    override fun getClassName(): String = definedExternally
    open var subdivisions: Number = definedExternally
    open var subdivisionsX: Number = definedExternally
    open var subdivisionsY: Number = definedExternally
    open fun optimize(chunksCount: Number, octreeBlocksSize: Number? = definedExternally /* null */): Unit = definedExternally
    open fun getHeightAtCoordinates(x: Number, z: Number): Number = definedExternally
    open fun getNormalAtCoordinates(x: Number, z: Number): Vector3 = definedExternally
    open fun getNormalAtCoordinatesToRef(x: Number, z: Number, ref: Vector3): GroundMesh = definedExternally
    open fun updateCoordinateHeights(): GroundMesh = definedExternally
    open fun _getFacetAt(x: Any, z: Any): Unit = definedExternally
    open fun _initHeightQuads(): Unit = definedExternally
    open fun _computeHeightQuads(): Unit = definedExternally
    override fun serialize(serializationObject: Any): Unit = definedExternally
    companion object {
        fun Parse(parsedMesh: Any, scene: Scene): GroundMesh = definedExternally
    }
}
external open class InstancedMesh(name: String, source: Mesh) : AbstractMesh {
    open var _sourceMesh: Any = definedExternally
    open var _currentLOD: Any = definedExternally
    override fun getClassName(): String = definedExternally
    override var receiveShadows: Boolean = definedExternally
    override var material: Material = definedExternally
    override var visibility: Number = definedExternally
    override var skeleton: Skeleton = definedExternally
    override var renderingGroupId: Number = definedExternally
    override fun getTotalVertices(): Number = definedExternally
    open var sourceMesh: Mesh = definedExternally
    open fun getVerticesData(kind: String, copyWhenShared: Boolean? = definedExternally /* null */): dynamic /* Array<Number> | Float32Array */ = definedExternally
    override fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean?, stride: Number?): Mesh = definedExternally
    override fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean?, stride: Number?): Mesh = definedExternally
    override fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean?, makeItUnique: Boolean?): Mesh = definedExternally
    override fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean?, makeItUnique: Boolean?): Mesh = definedExternally
    override fun setIndices(indices: Array<Number>, totalVertices: Number?): Mesh = definedExternally
    override fun isVerticesDataPresent(kind: String): Boolean = definedExternally
    override fun getIndices(): Array<Number> = definedExternally
    override var _positions: Array<Vector3> = definedExternally
    open fun refreshBoundingInfo(): InstancedMesh = definedExternally
    override fun _preActivate(): InstancedMesh = definedExternally
    override fun _activate(renderId: Number): InstancedMesh = definedExternally
    override fun getLOD(camera: Camera): AbstractMesh = definedExternally
    open fun _syncSubMeshes(): InstancedMesh = definedExternally
    override fun _generatePointsArray(): Boolean = definedExternally
    fun clone(name: String, newParent: Node, doNotCloneChildren: Boolean?): InstancedMesh = definedExternally
    override fun dispose(doNotRecurse: Boolean?): Unit = definedExternally
}
external open class LinesMesh(name: String, scene: Scene, parent: Node? = definedExternally /* null */, source: LinesMesh? = definedExternally /* null */, doNotCloneChildren: Boolean? = definedExternally /* null */, useVertexColor: Boolean? = definedExternally /* null */) : Mesh {
    open var useVertexColor: Boolean = definedExternally
    open var color: Color3 = definedExternally
    open var alpha: Number = definedExternally
    open var intersectionThreshold: Number = definedExternally
    open var _intersectionThreshold: Any = definedExternally
    open var _colorShader: Any = definedExternally
    override fun getClassName(): String = definedExternally
    override var material: Material = definedExternally
    override var checkCollisions: Boolean = definedExternally
    override fun createInstance(name: String): InstancedMesh = definedExternally
    override fun _bind(subMesh: SubMesh, effect: Effect, fillMode: Number): LinesMesh = definedExternally
    override fun _draw(subMesh: SubMesh, fillMode: Number, instancesCount: Number?): LinesMesh = definedExternally
    override fun dispose(doNotRecurse: Boolean?): Unit = definedExternally
    override fun clone(name: String, newParent: Node?, doNotCloneChildren: Boolean?): LinesMesh = definedExternally
}
external open class _InstancesBatch {
    open var mustReturn: Boolean = definedExternally
    open var visibleInstances: Array<Array<InstancedMesh>> = definedExternally
    open var renderSelf: Array<Boolean> = definedExternally
}
external interface `T$27` {
    var w: Number
    var h: Number
}
external interface `T$28` {
    @nativeInvoke
    operator fun invoke(i: Number, distance: Number): Number
}
external interface `T$29` {
    var type: Number? get() = definedExternally; set(value) = definedExternally
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var sizeX: Number? get() = definedExternally; set(value) = definedExternally
    var sizeY: Number? get() = definedExternally; set(value) = definedExternally
    var sizeZ: Number? get() = definedExternally; set(value) = definedExternally
    var custom: Any? get() = definedExternally; set(value) = definedExternally
    var faceUV: Array<Vector4>? get() = definedExternally; set(value) = definedExternally
    var faceColors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$30` {
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var flat: Boolean? get() = definedExternally; set(value) = definedExternally
    var subdivisions: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$31` {
    var min: Vector3
    var max: Vector3
}
external open class Mesh(name: String, scene: Scene, parent: Node? = definedExternally /* null */, source: Mesh? = definedExternally /* null */, doNotCloneChildren: Boolean? = definedExternally /* null */, clonePhysicsImpostor: Boolean? = definedExternally /* null */) : AbstractMesh, IGetSetVerticesData {
    open var onBeforeRenderObservable: Observable<Mesh> = definedExternally
    open var onAfterRenderObservable: Observable<Mesh> = definedExternally
    open var onBeforeDrawObservable: Observable<Mesh> = definedExternally
    open var _onBeforeDrawObserver: Any = definedExternally
    open var onBeforeDraw: () -> Unit = definedExternally
    open var delayLoadState: Number = definedExternally
    open var instances: Array<InstancedMesh> = definedExternally
    open var delayLoadingFile: String = definedExternally
    open var _binaryInfo: Any = definedExternally
    open var _LODLevels: Any = definedExternally
    open var onLODLevelSelection: (distance: Number, mesh: Mesh, selectedLevel: Mesh) -> Unit = definedExternally
    open var _morphTargetManager: Any = definedExternally
    open var morphTargetManager: MorphTargetManager = definedExternally
    open var _geometry: Geometry = definedExternally
    open var _delayInfo: Any = definedExternally
    open var _delayLoadingFunction: (any: Any, mesh: Mesh) -> Unit = definedExternally
    open var _visibleInstances: Any = definedExternally
    open var _renderIdForInstances: Any = definedExternally
    open var _batchCache: Any = definedExternally
    open var _instancesBufferSize: Any = definedExternally
    open var _instancesBuffer: Any = definedExternally
    open var _instancesData: Any = definedExternally
    open var _overridenInstanceCount: Any = definedExternally
    open var _shouldGenerateFlatShading: Boolean = definedExternally
    open var _preActivateId: Any = definedExternally
    open var _sideOrientation: Any = definedExternally
    open var _areNormalsFrozen: Any = definedExternally
    open var _sourcePositions: Any = definedExternally
    open var _sourceNormals: Any = definedExternally
    open var _source: Any = definedExternally
    open var source: BABYLON.Mesh = definedExternally
    override fun getClassName(): String = definedExternally
    override fun toString(fullDetails: Boolean?): String = definedExternally
    open var hasLODLevels: Boolean = definedExternally
    open fun _sortLODLevels(): Unit = definedExternally
    open fun addLODLevel(distance: Number, mesh: Mesh): Mesh = definedExternally
    open fun getLODLevelAtDistance(distance: Number): Mesh = definedExternally
    open fun removeLODLevel(mesh: Mesh): Mesh = definedExternally
    open fun getLOD(camera: Camera, boundingSphere: BoundingSphere? = definedExternally /* null */): AbstractMesh = definedExternally
    open var geometry: Geometry = definedExternally
    override fun getTotalVertices(): Number = definedExternally
    override fun getVerticesData(kind: String, copyWhenShared: Boolean?, forceCopy: Boolean?): dynamic /* Array<Number> | Float32Array */ = definedExternally
    open fun getVertexBuffer(kind: Any): VertexBuffer = definedExternally
    override fun isVerticesDataPresent(kind: String): Boolean = definedExternally
    open fun getVerticesDataKinds(): Array<String> = definedExternally
    open fun getTotalIndices(): Number = definedExternally
    override fun getIndices(copyWhenShared: Boolean?): Array<Number> = definedExternally
    override var isBlocked: Boolean = definedExternally
    override fun isReady(): Boolean = definedExternally
    open fun isDisposed(): Boolean = definedExternally
    open var sideOrientation: Number = definedExternally
    open var areNormalsFrozen: Boolean = definedExternally
    open fun freezeNormals(): Mesh = definedExternally
    open fun unfreezeNormals(): Mesh = definedExternally
    open var overridenInstanceCount: Number = definedExternally
    override fun _preActivate(): Mesh = definedExternally
    override fun _preActivateForIntermediateRendering(renderId: Number): Mesh = definedExternally
    open fun _registerInstanceForRenderId(instance: InstancedMesh, renderId: Number): Mesh = definedExternally
    open fun refreshBoundingInfo(): Mesh = definedExternally
    open fun _createGlobalSubMesh(): SubMesh = definedExternally
    open fun subdivide(count: Number): Unit = definedExternally
    override fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean?, stride: Number?): Mesh = definedExternally
    override fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean?, stride: Number?): Mesh = definedExternally
    open fun markVerticesDataAsUpdatable(kind: String, updatable: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setVerticesBuffer(buffer: VertexBuffer): Mesh = definedExternally
    override fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean?, makeItUnique: Boolean?): Mesh = definedExternally
    override fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean?, makeItUnique: Boolean?): Mesh = definedExternally
    open fun updateMeshPositions(positionFunction: Any, computeNormals: Boolean? = definedExternally /* null */): Mesh = definedExternally
    open fun makeGeometryUnique(): Mesh = definedExternally
    override fun setIndices(indices: Array<Number>, totalVertices: Number?): Mesh = definedExternally
    open fun toLeftHanded(): Mesh = definedExternally
    open fun _bind(subMesh: SubMesh, effect: Effect, fillMode: Number): Mesh = definedExternally
    open fun _draw(subMesh: SubMesh, fillMode: Number, instancesCount: Number? = definedExternally /* null */): Mesh = definedExternally
    open fun registerBeforeRender(func: (mesh: AbstractMesh) -> Unit): Mesh = definedExternally
    open fun unregisterBeforeRender(func: (mesh: AbstractMesh) -> Unit): Mesh = definedExternally
    open fun registerAfterRender(func: (mesh: AbstractMesh) -> Unit): Mesh = definedExternally
    open fun unregisterAfterRender(func: (mesh: AbstractMesh) -> Unit): Mesh = definedExternally
    open fun _getInstancesRenderList(subMeshId: Number): _InstancesBatch = definedExternally
    open fun _renderWithInstances(subMesh: SubMesh, fillMode: Number, batch: _InstancesBatch, effect: Effect, engine: Engine): Mesh = definedExternally
    open fun _processRendering(subMesh: SubMesh, effect: Effect, fillMode: Number, batch: _InstancesBatch, hardwareInstancedRendering: Boolean, onBeforeDraw: (isInstance: Boolean, world: Matrix, effectiveMaterial: Material? /*= null*/) -> Unit, effectiveMaterial: Material? = definedExternally /* null */): Mesh = definedExternally
    open fun render(subMesh: SubMesh, enableAlphaMode: Boolean): Mesh = definedExternally
    open fun _onBeforeDraw(isInstance: Any, world: Any, effectiveMaterial: Any): Unit = definedExternally
    open fun getEmittedParticleSystems(): Array<ParticleSystem> = definedExternally
    open fun getHierarchyEmittedParticleSystems(): Array<ParticleSystem> = definedExternally
    open fun _checkDelayState(): Mesh = definedExternally
    open fun _queueLoad(mesh: Any, scene: Any): Unit = definedExternally
    override fun isInFrustum(frustumPlanes: Array<Plane>): Boolean = definedExternally
    open fun setMaterialByID(id: String): Mesh = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    open fun bakeTransformIntoVertices(transform: Matrix): Mesh = definedExternally
    open fun bakeCurrentTransformIntoVertices(): Mesh = definedExternally
    override var _positions: Array<Vector3> = definedExternally
    open fun _resetPointsArrayCache(): Mesh = definedExternally
    override fun _generatePointsArray(): Boolean = definedExternally
    open fun clone(name: String, newParent: Node? = definedExternally /* null */, doNotCloneChildren: Boolean? = definedExternally /* null */, clonePhysicsImpostor: Boolean? = definedExternally /* null */): Mesh = definedExternally
    override fun dispose(doNotRecurse: Boolean?): Unit = definedExternally
    open fun applyDisplacementMap(url: String, minHeight: Number, maxHeight: Number, onSuccess: ((mesh: Mesh) -> Unit)? = definedExternally /* null */, uvOffset: Vector2? = definedExternally /* null */, uvScale: Vector2? = definedExternally /* null */): Mesh = definedExternally
    open fun applyDisplacementMapFromBuffer(buffer: Uint8Array, heightMapWidth: Number, heightMapHeight: Number, minHeight: Number, maxHeight: Number, uvOffset: Vector2? = definedExternally /* null */, uvScale: Vector2? = definedExternally /* null */): Mesh = definedExternally
    open fun convertToFlatShadedMesh(): Mesh = definedExternally
    open fun convertToUnIndexedMesh(): Mesh = definedExternally
    open fun flipFaces(flipNormals: Boolean? = definedExternally /* null */): Mesh = definedExternally
    open fun createInstance(name: String): InstancedMesh = definedExternally
    open fun synchronizeInstances(): Mesh = definedExternally
    open fun simplify(settings: Array<ISimplificationSettings>, parallelProcessing: Boolean? = definedExternally /* null */, simplificationType: SimplificationType? = definedExternally /* null */, successCallback: ((mesh: Mesh? /*= null*/, submeshIndex: Number? /*= null*/) -> Unit)? = definedExternally /* null */): Mesh = definedExternally
    open fun optimizeIndices(successCallback: ((mesh: Mesh? /*= null*/) -> Unit)? = definedExternally /* null */): Mesh = definedExternally
    open fun serialize(serializationObject: Any): Unit = definedExternally
    open fun _syncGeometryWithMorphTargetManager(): Unit = definedExternally
    open fun setPositionsForCPUSkinning(): Float32Array = definedExternally
    open fun setNormalsForCPUSkinning(): Float32Array = definedExternally
    open fun applySkeleton(skeleton: Skeleton): Mesh = definedExternally
    companion object {
        var _FRONTSIDE: Number = definedExternally
        var _BACKSIDE: Number = definedExternally
        var _DOUBLESIDE: Number = definedExternally
        var _DEFAULTSIDE: Number = definedExternally
        var _NO_CAP: Number = definedExternally
        var _CAP_START: Number = definedExternally
        var _CAP_END: Number = definedExternally
        var _CAP_ALL: Number = definedExternally
        var FRONTSIDE: Number = definedExternally
        var BACKSIDE: Number = definedExternally
        var DOUBLESIDE: Number = definedExternally
        var DEFAULTSIDE: Number = definedExternally
        var NO_CAP: Number = definedExternally
        var CAP_START: Number = definedExternally
        var CAP_END: Number = definedExternally
        var CAP_ALL: Number = definedExternally
        fun Parse(parsedMesh: Any, scene: Scene, rootUrl: String): Mesh = definedExternally
        fun CreateRibbon(name: String, pathArray: Array<Array<Vector3>>, closeArray: Boolean, closePath: Boolean, offset: Number, scene: Scene? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */, instance: Mesh? = definedExternally /* null */): Mesh = definedExternally
        fun CreateDisc(name: String, radius: Number, tessellation: Number, scene: Scene? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */): Mesh = definedExternally
        fun CreateBox(name: String, size: Number, scene: Scene? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */): Mesh = definedExternally
        fun CreateSphere(name: String, segments: Number, diameter: Number, scene: Scene? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */): Mesh = definedExternally
        fun CreateCylinder(name: String, height: Number, diameterTop: Number, diameterBottom: Number, tessellation: Number, subdivisions: Any, scene: Scene? = definedExternally /* null */, updatable: Any? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */): Mesh = definedExternally
        fun CreateTorus(name: String, diameter: Number, thickness: Number, tessellation: Number, scene: Scene? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */): Mesh = definedExternally
        fun CreateTorusKnot(name: String, radius: Number, tube: Number, radialSegments: Number, tubularSegments: Number, p: Number, q: Number, scene: Scene? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */): Mesh = definedExternally
        fun CreateLines(name: String, points: Array<Vector3>, scene: Scene? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, instance: LinesMesh? = definedExternally /* null */): LinesMesh = definedExternally
        fun CreateDashedLines(name: String, points: Array<Vector3>, dashSize: Number, gapSize: Number, dashNb: Number, scene: Scene? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, instance: LinesMesh? = definedExternally /* null */): LinesMesh = definedExternally
        fun CreatePolygon(name: String, shape: Array<Vector3>, scene: Scene, holes: Array<Array<Vector3>>? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */): Mesh = definedExternally
        fun ExtrudePolygon(name: String, shape: Array<Vector3>, depth: Number, scene: Scene, holes: Array<Array<Vector3>>? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */): Mesh = definedExternally
        fun ExtrudeShape(name: String, shape: Array<Vector3>, path: Array<Vector3>, scale: Number, rotation: Number, cap: Number, scene: Scene? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */, instance: Mesh? = definedExternally /* null */): Mesh = definedExternally
        fun ExtrudeShapeCustom(name: String, shape: Array<Vector3>, path: Array<Vector3>, scaleFunction: Function<*>, rotationFunction: Function<*>, ribbonCloseArray: Boolean, ribbonClosePath: Boolean, cap: Number, scene: Scene, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */, instance: Mesh? = definedExternally /* null */): Mesh = definedExternally
        fun CreateLathe(name: String, shape: Array<Vector3>, radius: Number, tessellation: Number, scene: Scene, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */): Mesh = definedExternally
        fun CreatePlane(name: String, size: Number, scene: Scene, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */): Mesh = definedExternally
        fun CreateGround(name: String, width: Number, height: Number, subdivisions: Number, scene: Scene? = definedExternally /* null */, updatable: Boolean? = definedExternally /* null */): Mesh = definedExternally
        fun CreateTiledGround(name: String, xmin: Number, zmin: Number, xmax: Number, zmax: Number, subdivisions: `T$27`, precision: `T$27`, scene: Scene, updatable: Boolean? = definedExternally /* null */): Mesh = definedExternally
        fun CreateGroundFromHeightMap(name: String, url: String, width: Number, height: Number, subdivisions: Number, minHeight: Number, maxHeight: Number, scene: Scene, updatable: Boolean? = definedExternally /* null */, onReady: ((mesh: GroundMesh) -> Unit)? = definedExternally /* null */): GroundMesh = definedExternally
        fun CreateTube(name: String, path: Array<Vector3>, radius: Number, tessellation: Number, radiusFunction: `T$28`, cap: Number, scene: Scene, updatable: Boolean? = definedExternally /* null */, sideOrientation: Number? = definedExternally /* null */, instance: Mesh? = definedExternally /* null */): Mesh = definedExternally
        fun CreatePolyhedron(name: String, options: `T$29`, scene: Scene): Mesh = definedExternally
        fun CreateIcoSphere(name: String, options: `T$30`, scene: Scene): Mesh = definedExternally
        fun CreateDecal(name: String, sourceMesh: AbstractMesh, position: Vector3, normal: Vector3, size: Vector3, angle: Number): Mesh = definedExternally
        fun MinMax(meshes: Array<AbstractMesh>): `T$31` = definedExternally
        fun Center(meshesOrMinMaxVector: Any): Vector3 = definedExternally
        fun MergeMeshes(meshes: Array<Mesh>, disposeSource: Boolean? = definedExternally /* null */, allow32BitsIndices: Boolean? = definedExternally /* null */, meshSubclass: Mesh? = definedExternally /* null */, subdivideWithSubMeshes: Boolean? = definedExternally /* null */): Mesh = definedExternally
    }
}
external interface IGetSetVerticesData {
    fun isVerticesDataPresent(kind: String): Boolean
    fun getVerticesData(kind: String, copyWhenShared: Boolean? = definedExternally /* null */, forceCopy: Boolean? = definedExternally /* null */): dynamic /* Array<Number> | Float32Array */
    fun getIndices(copyWhenShared: Boolean? = definedExternally /* null */): dynamic /* Array<Number> | Int32Array | Uint32Array | Uint16Array */
    fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean? = definedExternally /* null */)
    fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean? = definedExternally /* null */)
    fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean? = definedExternally /* null */, makeItUnique: Boolean? = definedExternally /* null */)
    fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean? = definedExternally /* null */, makeItUnique: Boolean? = definedExternally /* null */)
    fun setIndices(indices: Array<Number>)
    fun setIndices(indices: Int32Array)
    fun setIndices(indices: Uint32Array)
    fun setIndices(indices: Uint16Array)
}
external interface `T$32` {
    var pathArray: Array<Array<Vector3>>
    var closeArray: Boolean? get() = definedExternally; set(value) = definedExternally
    var closePath: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var invertUV: Boolean? get() = definedExternally; set(value) = definedExternally
    var uvs: Array<Vector2>? get() = definedExternally; set(value) = definedExternally
    var colors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$33` {
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var depth: Number? get() = definedExternally; set(value) = definedExternally
    var faceUV: Array<Vector4>? get() = definedExternally; set(value) = definedExternally
    var faceColors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$34` {
    var segments: Number? get() = definedExternally; set(value) = definedExternally
    var diameter: Number? get() = definedExternally; set(value) = definedExternally
    var diameterX: Number? get() = definedExternally; set(value) = definedExternally
    var diameterY: Number? get() = definedExternally; set(value) = definedExternally
    var diameterZ: Number? get() = definedExternally; set(value) = definedExternally
    var arc: Number? get() = definedExternally; set(value) = definedExternally
    var slice: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$35` {
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var diameterTop: Number? get() = definedExternally; set(value) = definedExternally
    var diameterBottom: Number? get() = definedExternally; set(value) = definedExternally
    var diameter: Number? get() = definedExternally; set(value) = definedExternally
    var tessellation: Number? get() = definedExternally; set(value) = definedExternally
    var subdivisions: Number? get() = definedExternally; set(value) = definedExternally
    var arc: Number? get() = definedExternally; set(value) = definedExternally
    var faceColors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
    var faceUV: Array<Vector4>? get() = definedExternally; set(value) = definedExternally
    var hasRings: Boolean? get() = definedExternally; set(value) = definedExternally
    var enclose: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$36` {
    var diameter: Number? get() = definedExternally; set(value) = definedExternally
    var thickness: Number? get() = definedExternally; set(value) = definedExternally
    var tessellation: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$37` {
    var lines: Array<Array<Vector3>>
}
external interface `T$38` {
    var points: Array<Vector3>
    var dashSize: Number? get() = definedExternally; set(value) = definedExternally
    var gapSize: Number? get() = definedExternally; set(value) = definedExternally
    var dashNb: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$39` {
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var subdivisions: Number? get() = definedExternally; set(value) = definedExternally
    var subdivisionsX: Number? get() = definedExternally; set(value) = definedExternally
    var subdivisionsY: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$40` {
    var w: Number
    var h: Number
}
external interface `T$41` {
    var xmin: Number
    var zmin: Number
    var xmax: Number
    var zmax: Number
    var subdivisions: `T$40`? get() = definedExternally; set(value) = definedExternally
    var precision: `T$40`? get() = definedExternally; set(value) = definedExternally
}
external interface `T$42` {
    var width: Number
    var height: Number
    var subdivisions: Number
    var minHeight: Number
    var maxHeight: Number
    var colorFilter: Color3
    var buffer: Uint8Array
    var bufferWidth: Number
    var bufferHeight: Number
}
external interface `T$43` {
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$44` {
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var tessellation: Number? get() = definedExternally; set(value) = definedExternally
    var arc: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$45` {
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var radiusX: Number? get() = definedExternally; set(value) = definedExternally
    var radiusY: Number? get() = definedExternally; set(value) = definedExternally
    var radiusZ: Number? get() = definedExternally; set(value) = definedExternally
    var flat: Boolean? get() = definedExternally; set(value) = definedExternally
    var subdivisions: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$46` {
    var type: Number? get() = definedExternally; set(value) = definedExternally
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var sizeX: Number? get() = definedExternally; set(value) = definedExternally
    var sizeY: Number? get() = definedExternally; set(value) = definedExternally
    var sizeZ: Number? get() = definedExternally; set(value) = definedExternally
    var custom: Any? get() = definedExternally; set(value) = definedExternally
    var faceUV: Array<Vector4>? get() = definedExternally; set(value) = definedExternally
    var faceColors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
    var flat: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$47` {
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var tube: Number? get() = definedExternally; set(value) = definedExternally
    var radialSegments: Number? get() = definedExternally; set(value) = definedExternally
    var tubularSegments: Number? get() = definedExternally; set(value) = definedExternally
    var p: Number? get() = definedExternally; set(value) = definedExternally
    var q: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$48` {
    var facetNormals: Any? get() = definedExternally; set(value) = definedExternally
    var facetPositions: Any? get() = definedExternally; set(value) = definedExternally
    var facetPartitioning: Any? get() = definedExternally; set(value) = definedExternally
    var ratio: Number? get() = definedExternally; set(value) = definedExternally
    var bInfo: Any? get() = definedExternally; set(value) = definedExternally
    var bbSize: Vector3? get() = definedExternally; set(value) = definedExternally
    var subDiv: Any? get() = definedExternally; set(value) = definedExternally
    var useRightHandedSystem: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class VertexData {
    open var positions: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var normals: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var tangents: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var uvs: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var uvs2: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var uvs3: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var uvs4: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var uvs5: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var uvs6: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var colors: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var matricesIndices: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var matricesWeights: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var matricesIndicesExtra: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var matricesWeightsExtra: dynamic /* Array<Number> | Float32Array */ = definedExternally
    open var indices: dynamic /* Array<Number> | Int32Array | Uint32Array | Uint16Array */ = definedExternally
    open fun set(data: Array<Number>, kind: String): Unit = definedExternally
    open fun set(data: Float32Array, kind: String): Unit = definedExternally
    open fun applyToMesh(mesh: Mesh, updatable: Boolean? = definedExternally /* null */): VertexData = definedExternally
    open fun applyToGeometry(geometry: Geometry, updatable: Boolean? = definedExternally /* null */): VertexData = definedExternally
    open fun updateMesh(mesh: Mesh, updateExtends: Boolean? = definedExternally /* null */, makeItUnique: Boolean? = definedExternally /* null */): VertexData = definedExternally
    open fun updateGeometry(geometry: Geometry, updateExtends: Boolean? = definedExternally /* null */, makeItUnique: Boolean? = definedExternally /* null */): VertexData = definedExternally
    open fun _applyTo(meshOrGeometry: Any, updatable: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _update(meshOrGeometry: Any, updateExtends: Any? = definedExternally /* null */, makeItUnique: Any? = definedExternally /* null */): Unit = definedExternally
    open fun transform(matrix: Matrix): VertexData = definedExternally
    open fun merge(other: VertexData): VertexData = definedExternally
    open fun _mergeElement(source: Any, other: Any): Unit = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        fun ExtractFromMesh(mesh: Mesh, copyWhenShared: Boolean? = definedExternally /* null */, forceCopy: Boolean? = definedExternally /* null */): VertexData = definedExternally
        fun ExtractFromGeometry(geometry: Geometry, copyWhenShared: Boolean? = definedExternally /* null */, forceCopy: Boolean? = definedExternally /* null */): VertexData = definedExternally
        fun _ExtractFrom(meshOrGeometry: Any, copyWhenShared: Any? = definedExternally /* null */, forceCopy: Any? = definedExternally /* null */): Unit = definedExternally
        fun CreateRibbon(options: `T$32`): VertexData = definedExternally
        fun CreateBox(options: `T$33`): VertexData = definedExternally
        fun CreateSphere(options: `T$34`): VertexData = definedExternally
        fun CreateCylinder(options: `T$35`): VertexData = definedExternally
        fun CreateTorus(options: `T$36`): VertexData = definedExternally
        fun CreateLineSystem(options: `T$37`): VertexData = definedExternally
        fun CreateDashedLines(options: `T$38`): VertexData = definedExternally
        fun CreateGround(options: `T$39`): VertexData = definedExternally
        fun CreateTiledGround(options: `T$41`): VertexData = definedExternally
        fun CreateGroundFromHeightMap(options: `T$42`): VertexData = definedExternally
        fun CreatePlane(options: `T$43`): VertexData = definedExternally
        fun CreateDisc(options: `T$44`): VertexData = definedExternally
        fun CreatePolygon(polygon: Mesh, sideOrientation: Number, fUV: Any? = definedExternally /* null */, fColors: Any? = definedExternally /* null */, frontUVs: Vector4? = definedExternally /* null */, backUVs: Vector4? = definedExternally /* null */): VertexData = definedExternally
        fun CreateIcoSphere(options: `T$45`): VertexData = definedExternally
        fun CreatePolyhedron(options: `T$46`): VertexData = definedExternally
        fun CreateTorusKnot(options: `T$47`): VertexData = definedExternally
        fun ComputeNormals(positions: Any, indices: Any, normals: Any, options: `T$48`? = definedExternally /* null */): Unit = definedExternally
        fun _ComputeSides(sideOrientation: Any, positions: Any, indices: Any, normals: Any, uvs: Any, frontUVs: Any? = definedExternally /* null */, backUVs: Any? = definedExternally /* null */): Unit = definedExternally
        fun ImportVertexData(parsedVertexData: Any, geometry: Geometry): Unit = definedExternally
    }
}
external interface `T$49` {
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var depth: Number? get() = definedExternally; set(value) = definedExternally
    var faceUV: Array<Vector4>? get() = definedExternally; set(value) = definedExternally
    var faceColors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$50` {
    var segments: Number? get() = definedExternally; set(value) = definedExternally
    var diameter: Number? get() = definedExternally; set(value) = definedExternally
    var diameterX: Number? get() = definedExternally; set(value) = definedExternally
    var diameterY: Number? get() = definedExternally; set(value) = definedExternally
    var diameterZ: Number? get() = definedExternally; set(value) = definedExternally
    var arc: Number? get() = definedExternally; set(value) = definedExternally
    var slice: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$51` {
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var tessellation: Number? get() = definedExternally; set(value) = definedExternally
    var arc: Number? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$52` {
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var radiusX: Number? get() = definedExternally; set(value) = definedExternally
    var radiusY: Number? get() = definedExternally; set(value) = definedExternally
    var radiusZ: Number? get() = definedExternally; set(value) = definedExternally
    var flat: Boolean? get() = definedExternally; set(value) = definedExternally
    var subdivisions: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$53` {
    var pathArray: Array<Array<Vector3>>
    var closeArray: Boolean? get() = definedExternally; set(value) = definedExternally
    var closePath: Boolean? get() = definedExternally; set(value) = definedExternally
    var offset: Number? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var instance: Mesh? get() = definedExternally; set(value) = definedExternally
    var invertUV: Boolean? get() = definedExternally; set(value) = definedExternally
    var uvs: Array<Vector2>? get() = definedExternally; set(value) = definedExternally
    var colors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$54` {
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var diameterTop: Number? get() = definedExternally; set(value) = definedExternally
    var diameterBottom: Number? get() = definedExternally; set(value) = definedExternally
    var diameter: Number? get() = definedExternally; set(value) = definedExternally
    var tessellation: Number? get() = definedExternally; set(value) = definedExternally
    var subdivisions: Number? get() = definedExternally; set(value) = definedExternally
    var arc: Number? get() = definedExternally; set(value) = definedExternally
    var faceColors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
    var faceUV: Array<Vector4>? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var hasRings: Boolean? get() = definedExternally; set(value) = definedExternally
    var enclose: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$55` {
    var diameter: Number? get() = definedExternally; set(value) = definedExternally
    var thickness: Number? get() = definedExternally; set(value) = definedExternally
    var tessellation: Number? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$56` {
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var tube: Number? get() = definedExternally; set(value) = definedExternally
    var radialSegments: Number? get() = definedExternally; set(value) = definedExternally
    var tubularSegments: Number? get() = definedExternally; set(value) = definedExternally
    var p: Number? get() = definedExternally; set(value) = definedExternally
    var q: Number? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$57` {
    var lines: Array<Array<Vector3>>
    var updatable: Boolean
    var instance: LinesMesh? get() = definedExternally; set(value) = definedExternally
}
external interface `T$58` {
    var points: Array<Vector3>
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var instance: LinesMesh? get() = definedExternally; set(value) = definedExternally
}
external interface `T$59` {
    var points: Array<Vector3>
    var dashSize: Number? get() = definedExternally; set(value) = definedExternally
    var gapSize: Number? get() = definedExternally; set(value) = definedExternally
    var dashNb: Number? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var instance: LinesMesh? get() = definedExternally; set(value) = definedExternally
}
external interface `T$60` {
    var shape: Array<Vector3>
    var path: Array<Vector3>
    var scale: Number? get() = definedExternally; set(value) = definedExternally
    var rotation: Number? get() = definedExternally; set(value) = definedExternally
    var cap: Number? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var instance: Mesh? get() = definedExternally; set(value) = definedExternally
    var invertUV: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$61` {
    var shape: Array<Vector3>
    var path: Array<Vector3>
    var scaleFunction: Any? get() = definedExternally; set(value) = definedExternally
    var rotationFunction: Any? get() = definedExternally; set(value) = definedExternally
    var ribbonCloseArray: Boolean? get() = definedExternally; set(value) = definedExternally
    var ribbonClosePath: Boolean? get() = definedExternally; set(value) = definedExternally
    var cap: Number? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var instance: Mesh? get() = definedExternally; set(value) = definedExternally
    var invertUV: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$62` {
    var shape: Array<Vector3>
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var tessellation: Number? get() = definedExternally; set(value) = definedExternally
    var arc: Number? get() = definedExternally; set(value) = definedExternally
    var closed: Boolean? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var cap: Number? get() = definedExternally; set(value) = definedExternally
    var invertUV: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$63` {
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sourcePlane: Plane? get() = definedExternally; set(value) = definedExternally
}
external interface `T$64` {
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var subdivisions: Number? get() = definedExternally; set(value) = definedExternally
    var subdivisionsX: Number? get() = definedExternally; set(value) = definedExternally
    var subdivisionsY: Number? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$65` {
    var w: Number
    var h: Number
}
external interface `T$66` {
    var xmin: Number
    var zmin: Number
    var xmax: Number
    var zmax: Number
    var subdivisions: `T$65`? get() = definedExternally; set(value) = definedExternally
    var precision: `T$65`? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$67` {
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var subdivisions: Number? get() = definedExternally; set(value) = definedExternally
    var minHeight: Number? get() = definedExternally; set(value) = definedExternally
    var maxHeight: Number? get() = definedExternally; set(value) = definedExternally
    var colorFilter: Color3? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var onReady: ((mesh: GroundMesh) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
external interface `T$68` {
    var shape: Array<Vector3>
    var holes: Array<Array<Vector3>>? get() = definedExternally; set(value) = definedExternally
    var depth: Number? get() = definedExternally; set(value) = definedExternally
    var faceUV: Array<Vector4>? get() = definedExternally; set(value) = definedExternally
    var faceColors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$69` {
    var shape: Array<Vector3>
    var holes: Array<Array<Vector3>>? get() = definedExternally; set(value) = definedExternally
    var depth: Number? get() = definedExternally; set(value) = definedExternally
    var faceUV: Array<Vector4>? get() = definedExternally; set(value) = definedExternally
    var faceColors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$70` {
    @nativeInvoke
    operator fun invoke(i: Number, distance: Number): Number
}
external interface `T$71` {
    var path: Array<Vector3>
    var radius: Number? get() = definedExternally; set(value) = definedExternally
    var tessellation: Number? get() = definedExternally; set(value) = definedExternally
    var radiusFunction: `T$70`? get() = definedExternally; set(value) = definedExternally
    var cap: Number? get() = definedExternally; set(value) = definedExternally
    var arc: Number? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var instance: Mesh? get() = definedExternally; set(value) = definedExternally
    var invertUV: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$72` {
    var type: Number? get() = definedExternally; set(value) = definedExternally
    var size: Number? get() = definedExternally; set(value) = definedExternally
    var sizeX: Number? get() = definedExternally; set(value) = definedExternally
    var sizeY: Number? get() = definedExternally; set(value) = definedExternally
    var sizeZ: Number? get() = definedExternally; set(value) = definedExternally
    var custom: Any? get() = definedExternally; set(value) = definedExternally
    var faceUV: Array<Vector4>? get() = definedExternally; set(value) = definedExternally
    var faceColors: Array<Color4>? get() = definedExternally; set(value) = definedExternally
    var flat: Boolean? get() = definedExternally; set(value) = definedExternally
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var sideOrientation: Number? get() = definedExternally; set(value) = definedExternally
    var frontUVs: Vector4? get() = definedExternally; set(value) = definedExternally
    var backUVs: Vector4? get() = definedExternally; set(value) = definedExternally
}
external interface `T$73` {
    var position: Vector3? get() = definedExternally; set(value) = definedExternally
    var normal: Vector3? get() = definedExternally; set(value) = definedExternally
    var size: Vector3? get() = definedExternally; set(value) = definedExternally
    var angle: Number? get() = definedExternally; set(value) = definedExternally
}
external open class MeshBuilder {
    companion object {
        fun updateSideOrientation(orientation: Any, scene: Any): Unit = definedExternally
        fun CreateBox(name: String, options: `T$49`, scene: Scene): Mesh = definedExternally
        fun CreateSphere(name: String, options: `T$50`, scene: Any): Mesh = definedExternally
        fun CreateDisc(name: String, options: `T$51`, scene: Scene): Mesh = definedExternally
        fun CreateIcoSphere(name: String, options: `T$52`, scene: Scene): Mesh = definedExternally
        fun CreateRibbon(name: String, options: `T$53`, scene: Scene? = definedExternally /* null */): Mesh = definedExternally
        fun CreateCylinder(name: String, options: `T$54`, scene: Any): Mesh = definedExternally
        fun CreateTorus(name: String, options: `T$55`, scene: Any): Mesh = definedExternally
        fun CreateTorusKnot(name: String, options: `T$56`, scene: Any): Mesh = definedExternally
        fun CreateLineSystem(name: String, options: `T$57`, scene: Scene): LinesMesh = definedExternally
        fun CreateLines(name: String, options: `T$58`, scene: Scene): LinesMesh = definedExternally
        fun CreateDashedLines(name: String, options: `T$59`, scene: Scene): LinesMesh = definedExternally
        fun ExtrudeShape(name: String, options: `T$60`, scene: Scene): Mesh = definedExternally
        fun ExtrudeShapeCustom(name: String, options: `T$61`, scene: Scene): Mesh = definedExternally
        fun CreateLathe(name: String, options: `T$62`, scene: Scene): Mesh = definedExternally
        fun CreatePlane(name: String, options: `T$63`, scene: Scene): Mesh = definedExternally
        fun CreateGround(name: String, options: `T$64`, scene: Any): Mesh = definedExternally
        fun CreateTiledGround(name: String, options: `T$66`, scene: Scene): Mesh = definedExternally
        fun CreateGroundFromHeightMap(name: String, url: String, options: `T$67`, scene: Scene): GroundMesh = definedExternally
        fun CreatePolygon(name: String, options: `T$68`, scene: Scene): Mesh = definedExternally
        fun ExtrudePolygon(name: String, options: `T$69`, scene: Scene): Mesh = definedExternally
        fun CreateTube(name: String, options: `T$71`, scene: Scene): Mesh = definedExternally
        fun CreatePolyhedron(name: String, options: `T$72`, scene: Scene): Mesh = definedExternally
        fun CreateDecal(name: String, sourceMesh: AbstractMesh, options: `T$73`): Mesh = definedExternally
        fun _ExtrudeShapeGeneric(name: Any, shape: Any, curve: Any, scale: Any, rotation: Any, scaleFunction: Any, rotateFunction: Any, rbCA: Any, rbCP: Any, cap: Any, custom: Any, scene: Any, updtbl: Any, side: Any, instance: Any, invertUV: Any, frontUVs: Any, backUVs: Any): Unit = definedExternally
    }
}
external interface ISimplifier {
    fun simplify(settings: ISimplificationSettings, successCallback: (simplifiedMeshes: Mesh) -> Unit, errorCallback: (() -> Unit)? = definedExternally /* null */)
}
external interface ISimplificationSettings {
    var quality: Number
    var distance: Number
    var optimizeMesh: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class SimplificationSettings(quality: Number, distance: Number, optimizeMesh: Boolean? = definedExternally /* null */) : ISimplificationSettings {
    override var quality: Number = definedExternally
    override var distance: Number = definedExternally
    override var optimizeMesh: Boolean? = definedExternally
}
external interface ISimplificationTask {
    var settings: Array<ISimplificationSettings>
    var simplificationType: SimplificationType
    var mesh: Mesh
    var successCallback: (() -> Unit)? get() = definedExternally; set(value) = definedExternally
    var parallelProcessing: Boolean
}
external open class SimplificationQueue {
    open var _simplificationArray: Any = definedExternally
    open var running: Any = definedExternally
    open fun addTask(task: ISimplificationTask): Unit = definedExternally
    open fun executeNext(): Unit = definedExternally
    open fun runSimplification(task: ISimplificationTask): Unit = definedExternally
    open fun getSimplifier(task: Any): Unit = definedExternally
}
external enum class SimplificationType {
    QUADRATIC /* = 0 */
}
external open class DecimationTriangle(vertices: Array<DecimationVertex>) {
    open var vertices: Array<DecimationVertex> = definedExternally
    open var normal: Vector3 = definedExternally
    open var error: Array<Number> = definedExternally
    open var deleted: Boolean = definedExternally
    open var isDirty: Boolean = definedExternally
    open var borderFactor: Number = definedExternally
    open var deletePending: Boolean = definedExternally
    open var originalOffset: Number = definedExternally
}
external open class DecimationVertex(position: Vector3, id: Any) {
    open var position: Vector3 = definedExternally
    open var id: Any = definedExternally
    open var q: QuadraticMatrix = definedExternally
    open var isBorder: Boolean = definedExternally
    open var triangleStart: Number = definedExternally
    open var triangleCount: Number = definedExternally
    open var originalOffsets: Array<Number> = definedExternally
    open fun updatePosition(newPosition: Vector3): Unit = definedExternally
}
external open class QuadraticMatrix(data: Array<Number>? = definedExternally /* null */) {
    open var data: Array<Number> = definedExternally
    open fun det(a11: Any, a12: Any, a13: Any, a21: Any, a22: Any, a23: Any, a31: Any, a32: Any, a33: Any): Number = definedExternally
    open fun addInPlace(matrix: QuadraticMatrix): Unit = definedExternally
    open fun addArrayInPlace(data: Array<Number>): Unit = definedExternally
    open fun add(matrix: QuadraticMatrix): QuadraticMatrix = definedExternally
    companion object {
        fun FromData(a: Number, b: Number, c: Number, d: Number): QuadraticMatrix = definedExternally
        fun DataFromNumbers(a: Number, b: Number, c: Number, d: Number): Array<Number> = definedExternally
    }
}
external open class Reference(vertexId: Number, triangleId: Number) {
    open var vertexId: Number = definedExternally
    open var triangleId: Number = definedExternally
}
external open class QuadraticErrorSimplification(_mesh: Mesh) : ISimplifier {
    open var _mesh: Any = definedExternally
    override fun simplify(settings: ISimplificationSettings, successCallback: (simplifiedMeshes: Mesh) -> Unit, errorCallback: (() -> Unit)?)

    open var triangles: Any = definedExternally
    open var vertices: Any = definedExternally
    open var references: Any = definedExternally
    open var initialized: Any = definedExternally
    open var _reconstructedMesh: Any = definedExternally
    open var syncIterations: Number = definedExternally
    open var aggressiveness: Number = definedExternally
    open var decimationIterations: Number = definedExternally
    open var boundingBoxEpsilon: Number = definedExternally
    open fun simplify(settings: ISimplificationSettings, successCallback: (simplifiedMesh: Mesh) -> Unit): Unit = definedExternally
    open fun isTriangleOnBoundingBox(triangle: Any): Unit = definedExternally
    open fun runDecimation(settings: Any, submeshIndex: Any, successCallback: Any): Unit = definedExternally
    open fun initWithMesh(submeshIndex: Any, callback: Any, optimizeMesh: Any? = definedExternally /* null */): Unit = definedExternally
    open fun init(callback: Any): Unit = definedExternally
    open fun reconstructMesh(submeshIndex: Any): Unit = definedExternally
    open fun initDecimatedMesh(): Unit = definedExternally
    open fun isFlipped(vertex1: Any, vertex2: Any, point: Any, deletedArray: Any, borderFactor: Any, delTr: Any): Unit = definedExternally
    open fun updateTriangles(origVertex: Any, vertex: Any, deletedArray: Any, deletedTriangles: Any): Unit = definedExternally
    open fun identifyBorder(): Unit = definedExternally
    open fun updateMesh(identifyBorders: Any? = definedExternally /* null */): Unit = definedExternally
    open fun vertexError(q: Any, point: Any): Unit = definedExternally
    open fun calculateError(vertex1: Any, vertex2: Any, pointResult: Any? = definedExternally /* null */, normalResult: Any? = definedExternally /* null */, uvResult: Any? = definedExternally /* null */, colorResult: Any? = definedExternally /* null */): Unit = definedExternally
}
external open class Polygon {
    companion object {
        fun Rectangle(xmin: Number, ymin: Number, xmax: Number, ymax: Number): Array<Vector2> = definedExternally
        fun Circle(radius: Number, cx: Number? = definedExternally /* null */, cy: Number? = definedExternally /* null */, numberOfSides: Number? = definedExternally /* null */): Array<Vector2> = definedExternally
        fun Parse(input: String): Array<Vector2> = definedExternally
        fun StartingAt(x: Number, y: Number): Path2 = definedExternally
    }
}
external open class PolygonMeshBuilder {
    constructor(name: String, contours: Path2, scene: Scene)
    constructor(name: String, contours: Array<Vector2>, scene: Scene)
    open var _points: Any = definedExternally
    open var _outlinepoints: Any = definedExternally
    open var _holes: Any = definedExternally
    open var _name: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _epoints: Any = definedExternally
    open var _eholes: Any = definedExternally
    open fun _addToepoint(points: Any): Unit = definedExternally
    open fun addHole(hole: Array<Vector2>): PolygonMeshBuilder = definedExternally
    open fun build(updatable: Boolean? = definedExternally /* null */, depth: Number? = definedExternally /* null */): Mesh = definedExternally
    open fun addSide(positions: Any, normals: Any, uvs: Any, indices: Any, bounds: Any, points: Any, depth: Any, flip: Any): Unit = definedExternally
}
external open class BaseSubMesh {
    open var _materialDefines: MaterialDefines = definedExternally
    open var _materialEffect: Effect = definedExternally
    open var effect: Effect = definedExternally
    open fun setEffect(effect: Effect, defines: MaterialDefines? = definedExternally /* null */): Unit = definedExternally
}
external open class SubMesh(materialIndex: Number, verticesStart: Number, verticesCount: Number, indexStart: Any, indexCount: Number, mesh: AbstractMesh, renderingMesh: Mesh? = definedExternally /* null */, createBoundingBox: Boolean? = definedExternally /* null */) : BaseSubMesh, ICullable {
    open var materialIndex: Number = definedExternally
    open var verticesStart: Number = definedExternally
    open var verticesCount: Number = definedExternally
    open var indexStart: Any = definedExternally
    open var indexCount: Number = definedExternally
    open var linesIndexCount: Number = definedExternally
    open var _mesh: Any = definedExternally
    open var _renderingMesh: Any = definedExternally
    open var _boundingInfo: Any = definedExternally
    open var _linesIndexBuffer: Any = definedExternally
    open var _lastColliderWorldVertices: Array<Vector3> = definedExternally
    open var _trianglePlanes: Array<Plane> = definedExternally
    open var _lastColliderTransformMatrix: Matrix = definedExternally
    open var _renderId: Number = definedExternally
    open var _alphaIndex: Number = definedExternally
    open var _distanceToCamera: Number = definedExternally
    open var _id: Number = definedExternally
    open var _currentMaterial: Any = definedExternally
    open var IsGlobal: Boolean = definedExternally
    open fun getBoundingInfo(): BoundingInfo = definedExternally
    open fun setBoundingInfo(boundingInfo: BoundingInfo): SubMesh = definedExternally
    open fun getMesh(): AbstractMesh = definedExternally
    open fun getRenderingMesh(): Mesh = definedExternally
    open fun getMaterial(): Material = definedExternally
    open fun refreshBoundingInfo(): SubMesh = definedExternally
    open fun _checkCollision(collider: Collider): Boolean = definedExternally
    open fun updateBoundingInfo(world: Matrix): SubMesh = definedExternally
    override fun isInFrustum(frustumPlanes: Array<Plane>): Boolean = definedExternally
    override fun isCompletelyInFrustum(frustumPlanes: Array<Plane>): Boolean = definedExternally
    open fun render(enableAlphaMode: Boolean): SubMesh = definedExternally
    open fun getLinesIndexBuffer(indices: Array<Number>, engine: Engine): WebGLBuffer = definedExternally
    open fun canIntersects(ray: Ray): Boolean = definedExternally
    open fun intersects(ray: Ray, positions: Array<Vector3>, indices: Array<Number>, fastCheck: Boolean? = definedExternally /* null */): IntersectionInfo = definedExternally
    open fun clone(newMesh: AbstractMesh, newRenderingMesh: Mesh? = definedExternally /* null */): SubMesh = definedExternally
    open fun dispose(): Unit = definedExternally
    companion object {
        fun CreateFromIndices(materialIndex: Number, startIndex: Number, indexCount: Number, mesh: AbstractMesh, renderingMesh: Mesh? = definedExternally /* null */): SubMesh = definedExternally
    }
}
external open class VertexBuffer {
    constructor(engine: Any, data: Array<Number>, kind: String, updatable: Boolean, postponeInternalCreation: Boolean? = definedExternally /* null */, stride: Number? = definedExternally /* null */, instanced: Boolean? = definedExternally /* null */, offset: Number? = definedExternally /* null */, size: Number? = definedExternally /* null */)
    constructor(engine: Any, data: Float32Array, kind: String, updatable: Boolean, postponeInternalCreation: Boolean? = definedExternally /* null */, stride: Number? = definedExternally /* null */, instanced: Boolean? = definedExternally /* null */, offset: Number? = definedExternally /* null */, size: Number? = definedExternally /* null */)
    constructor(engine: Any, data: Buffer, kind: String, updatable: Boolean, postponeInternalCreation: Boolean? = definedExternally /* null */, stride: Number? = definedExternally /* null */, instanced: Boolean? = definedExternally /* null */, offset: Number? = definedExternally /* null */, size: Number? = definedExternally /* null */)
    open var _buffer: Any = definedExternally
    open var _kind: Any = definedExternally
    open var _offset: Any = definedExternally
    open var _size: Any = definedExternally
    open var _stride: Any = definedExternally
    open var _ownsBuffer: Any = definedExternally
    open fun getKind(): String = definedExternally
    open fun isUpdatable(): Boolean = definedExternally
    open fun getData(): dynamic /* Array<Number> | Float32Array */ = definedExternally
    open fun getBuffer(): WebGLBuffer = definedExternally
    open fun getStrideSize(): Number = definedExternally
    open fun getOffset(): Number = definedExternally
    open fun getSize(): Number = definedExternally
    open fun getIsInstanced(): Boolean = definedExternally
    open fun getInstanceDivisor(): Number = definedExternally
    open fun create(data: Array<Number>? = definedExternally /* null */): Unit = definedExternally
    open fun create(data: Float32Array? = definedExternally /* null */): Unit = definedExternally
    open fun update(data: Array<Number>): Unit = definedExternally
    open fun update(data: Float32Array): Unit = definedExternally
    open fun updateDirectly(data: Float32Array, offset: Number): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    companion object {
        var _PositionKind: Any = definedExternally
        var _NormalKind: Any = definedExternally
        var _TangentKind: Any = definedExternally
        var _UVKind: Any = definedExternally
        var _UV2Kind: Any = definedExternally
        var _UV3Kind: Any = definedExternally
        var _UV4Kind: Any = definedExternally
        var _UV5Kind: Any = definedExternally
        var _UV6Kind: Any = definedExternally
        var _ColorKind: Any = definedExternally
        var _MatricesIndicesKind: Any = definedExternally
        var _MatricesWeightsKind: Any = definedExternally
        var _MatricesIndicesExtraKind: Any = definedExternally
        var _MatricesWeightsExtraKind: Any = definedExternally
        var PositionKind: String = definedExternally
        var NormalKind: String = definedExternally
        var TangentKind: String = definedExternally
        var UVKind: String = definedExternally
        var UV2Kind: String = definedExternally
        var UV3Kind: String = definedExternally
        var UV4Kind: String = definedExternally
        var UV5Kind: String = definedExternally
        var UV6Kind: String = definedExternally
        var ColorKind: String = definedExternally
        var MatricesIndicesKind: String = definedExternally
        var MatricesWeightsKind: String = definedExternally
        var MatricesIndicesExtraKind: String = definedExternally
        var MatricesWeightsExtraKind: String = definedExternally
    }
}
external open class MorphTarget(name: String, influence: Number? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var animations: Array<Animation> = definedExternally
    open var _positions: Any = definedExternally
    open var _normals: Any = definedExternally
    open var _tangents: Any = definedExternally
    open var _influence: Any = definedExternally
    open var onInfluenceChanged: Observable<Boolean> = definedExternally
    open var influence: Number = definedExternally
    open var hasNormals: Boolean = definedExternally
    open var hasTangents: Boolean = definedExternally
    open fun setPositions(data: Float32Array): Unit = definedExternally
    open fun setPositions(data: Array<Number>): Unit = definedExternally
    open fun getPositions(): Float32Array = definedExternally
    open fun setNormals(data: Float32Array): Unit = definedExternally
    open fun setNormals(data: Array<Number>): Unit = definedExternally
    open fun getNormals(): Float32Array = definedExternally
    open fun setTangents(data: Float32Array): Unit = definedExternally
    open fun setTangents(data: Array<Number>): Unit = definedExternally
    open fun getTangents(): Float32Array = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        fun Parse(serializationObject: Any): MorphTarget = definedExternally
        fun FromMesh(mesh: AbstractMesh, name: String? = definedExternally /* null */, influence: Number? = definedExternally /* null */): MorphTarget = definedExternally
    }
}
external open class MorphTargetManager(scene: Scene? = definedExternally /* null */) {
    open var _targets: Any = definedExternally
    open var _targetObservable: Any = definedExternally
    open var _activeTargets: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _influences: Any = definedExternally
    open var _supportsNormals: Any = definedExternally
    open var _supportsTangents: Any = definedExternally
    open var _vertexCount: Any = definedExternally
    open var _uniqueId: Any = definedExternally
    open var uniqueId: Number = definedExternally
    open var vertexCount: Number = definedExternally
    open var supportsNormals: Boolean = definedExternally
    open var supportsTangents: Boolean = definedExternally
    open var numTargets: Number = definedExternally
    open var numInfluencers: Number = definedExternally
    open var influences: Float32Array = definedExternally
    open fun getActiveTarget(index: Number): MorphTarget = definedExternally
    open fun getTarget(index: Number): MorphTarget = definedExternally
    open fun addTarget(target: MorphTarget): Unit = definedExternally
    open fun removeTarget(target: MorphTarget): Unit = definedExternally
    open fun serialize(): Any = definedExternally
    open fun _onInfluenceChanged(needUpdate: Any): Unit = definedExternally
    open fun _syncActiveTargets(needUpdate: Any): Unit = definedExternally
    companion object {
        fun Parse(serializationObject: Any, scene: Scene): MorphTargetManager = definedExternally
    }
}
external open class Particle {
    open var position: Vector3 = definedExternally
    open var direction: Vector3 = definedExternally
    open var color: Color4 = definedExternally
    open var colorStep: Color4 = definedExternally
    open var lifeTime: Number = definedExternally
    open var age: Number = definedExternally
    open var size: Number = definedExternally
    open var angle: Number = definedExternally
    open var angularSpeed: Number = definedExternally
    open fun copyTo(other: Particle): Unit = definedExternally
}
external open class ParticleSystem(name: String, capacity: Number, scene: Scene, customEffect: Effect? = definedExternally /* null */) : IDisposable, IAnimatable {
    open var name: String = definedExternally
    override var animations: Array<Animation> = definedExternally
    open var id: String = definedExternally
    open var renderingGroupId: Number = definedExternally
    open var emitter: Any = definedExternally
    open var emitRate: Number = definedExternally
    open var manualEmitCount: Number = definedExternally
    open var updateSpeed: Number = definedExternally
    open var targetStopDuration: Number = definedExternally
    open var disposeOnStop: Boolean = definedExternally
    open var minEmitPower: Number = definedExternally
    open var maxEmitPower: Number = definedExternally
    open var minLifeTime: Number = definedExternally
    open var maxLifeTime: Number = definedExternally
    open var minSize: Number = definedExternally
    open var maxSize: Number = definedExternally
    open var minAngularSpeed: Number = definedExternally
    open var maxAngularSpeed: Number = definedExternally
    open var particleTexture: Texture = definedExternally
    open var layerMask: Number = definedExternally
    open var customShader: Any = definedExternally
    open var preventAutoStart: Boolean = definedExternally
    open var onDisposeObservable: Observable<ParticleSystem> = definedExternally
    open var _onDisposeObserver: Any = definedExternally
    open var onDispose: () -> Unit = definedExternally
    open var updateFunction: (particles: Array<Particle>) -> Unit = definedExternally
    open var blendMode: Number = definedExternally
    open var forceDepthWrite: Boolean = definedExternally
    open var gravity: Vector3 = definedExternally
    open var direction1: Vector3 = definedExternally
    open var direction2: Vector3 = definedExternally
    open var minEmitBox: Vector3 = definedExternally
    open var maxEmitBox: Vector3 = definedExternally
    open var color1: Color4 = definedExternally
    open var color2: Color4 = definedExternally
    open var colorDead: Color4 = definedExternally
    open var textureMask: Color4 = definedExternally
    open var startDirectionFunction: (emitPower: Number, worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle) -> Unit = definedExternally
    open var startPositionFunction: (worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle) -> Unit = definedExternally
    open var particles: Any = definedExternally
    open var _capacity: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _stockParticles: Any = definedExternally
    open var _newPartsExcess: Any = definedExternally
    open var _vertexData: Any = definedExternally
    open var _vertexBuffer: Any = definedExternally
    open var _vertexBuffers: Any = definedExternally
    open var _indexBuffer: Any = definedExternally
    open var _effect: Any = definedExternally
    open var _customEffect: Any = definedExternally
    open var _cachedDefines: Any = definedExternally
    open var _scaledColorStep: Any = definedExternally
    open var _colorDiff: Any = definedExternally
    open var _scaledDirection: Any = definedExternally
    open var _scaledGravity: Any = definedExternally
    open var _currentRenderId: Any = definedExternally
    open var _alive: Any = definedExternally
    open var _started: Any = definedExternally
    open var _stopped: Any = definedExternally
    open var _actualFrame: Any = definedExternally
    open var _scaledUpdateSpeed: Any = definedExternally
    open fun recycleParticle(particle: Particle): Unit = definedExternally
    open fun getCapacity(): Number = definedExternally
    open fun isAlive(): Boolean = definedExternally
    open fun isStarted(): Boolean = definedExternally
    open fun start(): Unit = definedExternally
    open fun stop(): Unit = definedExternally
    open fun _appendParticleVertex(index: Number, particle: Particle, offsetX: Number, offsetY: Number): Unit = definedExternally
    open fun _update(newParticles: Any): Unit = definedExternally
    open fun _getEffect(): Unit = definedExternally
    open fun animate(): Unit = definedExternally
    open fun render(): Number = definedExternally
    override fun dispose(): Unit = definedExternally
    open fun clone(name: String, newEmitter: Any): ParticleSystem = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        var BLENDMODE_ONEONE: Number = definedExternally
        var BLENDMODE_STANDARD: Number = definedExternally
        fun Parse(parsedParticleSystem: Any, scene: Scene, rootUrl: String): ParticleSystem = definedExternally
    }
}
external open class SolidParticle(particleIndex: Number, positionIndex: Number, model: ModelShape, shapeId: Number, idxInShape: Number, sps: SolidParticleSystem, modelBoundingInfo: BoundingInfo? = definedExternally /* null */) {
    open var idx: Number = definedExternally
    open var color: Color4 = definedExternally
    open var position: Vector3 = definedExternally
    open var rotation: Vector3 = definedExternally
    open var rotationQuaternion: Quaternion = definedExternally
    open var scaling: Vector3 = definedExternally
    open var uvs: Vector4 = definedExternally
    open var velocity: Vector3 = definedExternally
    open var alive: Boolean = definedExternally
    open var isVisible: Boolean = definedExternally
    open var _pos: Number = definedExternally
    open var _model: ModelShape = definedExternally
    open var shapeId: Number = definedExternally
    open var idxInShape: Number = definedExternally
    open var _modelBoundingInfo: BoundingInfo = definedExternally
    open var _boundingInfo: BoundingInfo = definedExternally
    open var _sps: SolidParticleSystem = definedExternally
    open var scale: Vector3 = definedExternally
    open var quaternion: Quaternion = definedExternally
    open fun intersectsMesh(target: Mesh): Boolean = definedExternally
    open fun intersectsMesh(target: SolidParticle): Boolean = definedExternally
}
external open class ModelShape(id: Number, shape: Array<Vector3>, shapeUV: Array<Number>, posFunction: (particle: SolidParticle, i: Number, s: Number) -> Unit, vtxFunction: (particle: SolidParticle, vertex: Vector3, i: Number) -> Unit) {
    open var shapeID: Number = definedExternally
    open var _shape: Array<Vector3> = definedExternally
    open var _shapeUV: Array<Number> = definedExternally
    open var _positionFunction: (particle: SolidParticle, i: Number, s: Number) -> Unit = definedExternally
    open var _vertexFunction: (particle: SolidParticle, vertex: Vector3, i: Number) -> Unit = definedExternally
}
external interface `T$74` {
    var idx: Number
    var faceId: Number
}
external interface `T$75` {
    var updatable: Boolean? get() = definedExternally; set(value) = definedExternally
    var isPickable: Boolean? get() = definedExternally; set(value) = definedExternally
    var particleIntersection: Boolean? get() = definedExternally; set(value) = definedExternally
    var boundingSphereOnly: Boolean? get() = definedExternally; set(value) = definedExternally
    var bSphereRadiusFactor: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$76` {
    var facetNb: Number? get() = definedExternally; set(value) = definedExternally
    var number: Number? get() = definedExternally; set(value) = definedExternally
    var delta: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$77` {
    var positionFunction: Any? get() = definedExternally; set(value) = definedExternally
    var vertexFunction: Any? get() = definedExternally; set(value) = definedExternally
}
external open class SolidParticleSystem(name: String, scene: Scene, options: `T$75`? = definedExternally /* null */) : IDisposable {
    open var particles: Array<SolidParticle> = definedExternally
    open var nbParticles: Number = definedExternally
    open var billboard: Boolean = definedExternally
    open var recomputeNormals: Boolean = definedExternally
    open var counter: Number = definedExternally
    open var name: String = definedExternally
    open var mesh: Mesh = definedExternally
    open var vars: Any = definedExternally
    open var pickedParticles: Array<`T$74`> = definedExternally
    open var _scene: Any = definedExternally
    open var _positions: Any = definedExternally
    open var _indices: Any = definedExternally
    open var _normals: Any = definedExternally
    open var _colors: Any = definedExternally
    open var _uvs: Any = definedExternally
    open var _positions32: Any = definedExternally
    open var _normals32: Any = definedExternally
    open var _fixedNormal32: Any = definedExternally
    open var _colors32: Any = definedExternally
    open var _uvs32: Any = definedExternally
    open var _index: Any = definedExternally
    open var _updatable: Any = definedExternally
    open var _pickable: Any = definedExternally
    open var _isVisibilityBoxLocked: Any = definedExternally
    open var _alwaysVisible: Any = definedExternally
    open var _shapeCounter: Any = definedExternally
    open var _copy: Any = definedExternally
    open var _shape: Any = definedExternally
    open var _shapeUV: Any = definedExternally
    open var _color: Any = definedExternally
    open var _computeParticleColor: Any = definedExternally
    open var _computeParticleTexture: Any = definedExternally
    open var _computeParticleRotation: Any = definedExternally
    open var _computeParticleVertex: Any = definedExternally
    open var _computeBoundingBox: Any = definedExternally
    open var _cam_axisZ: Any = definedExternally
    open var _cam_axisY: Any = definedExternally
    open var _cam_axisX: Any = definedExternally
    open var _axisX: Any = definedExternally
    open var _axisY: Any = definedExternally
    open var _axisZ: Any = definedExternally
    open var _camera: Any = definedExternally
    open var _particle: Any = definedExternally
    open var _camDir: Any = definedExternally
    open var _rotMatrix: Any = definedExternally
    open var _invertMatrix: Any = definedExternally
    open var _rotated: Any = definedExternally
    open var _quaternion: Any = definedExternally
    open var _vertex: Any = definedExternally
    open var _normal: Any = definedExternally
    open var _yaw: Any = definedExternally
    open var _pitch: Any = definedExternally
    open var _roll: Any = definedExternally
    open var _halfroll: Any = definedExternally
    open var _halfpitch: Any = definedExternally
    open var _halfyaw: Any = definedExternally
    open var _sinRoll: Any = definedExternally
    open var _cosRoll: Any = definedExternally
    open var _sinPitch: Any = definedExternally
    open var _cosPitch: Any = definedExternally
    open var _sinYaw: Any = definedExternally
    open var _cosYaw: Any = definedExternally
    open var _w: Any = definedExternally
    open var _mustUnrotateFixedNormals: Any = definedExternally
    open var _minimum: Any = definedExternally
    open var _maximum: Any = definedExternally
    open var _scale: Any = definedExternally
    open var _translation: Any = definedExternally
    open var _minBbox: Any = definedExternally
    open var _maxBbox: Any = definedExternally
    open var _particlesIntersect: Any = definedExternally
    open var _bSphereOnly: Boolean = definedExternally
    open var _bSphereRadiusFactor: Number = definedExternally
    open fun buildMesh(): Mesh = definedExternally
    open fun digest(mesh: Mesh, options: `T$76`? = definedExternally /* null */): SolidParticleSystem = definedExternally
    open fun _unrotateFixedNormals(): Unit = definedExternally
    open fun _resetCopy(): Unit = definedExternally
    open fun _meshBuilder(p: Any, shape: Any, positions: Any, meshInd: Any, indices: Any, meshUV: Any, uvs: Any, meshCol: Any, colors: Any, meshNor: Any, normals: Any, idx: Any, idxInShape: Any, options: Any): Unit = definedExternally
    open fun _posToShape(positions: Any): Unit = definedExternally
    open fun _uvsToShapeUV(uvs: Any): Unit = definedExternally
    open fun _addParticle(idx: Any, idxpos: Any, model: Any, shapeId: Any, idxInShape: Any, bInfo: Any? = definedExternally /* null */): Unit = definedExternally
    open fun addShape(mesh: Mesh, nb: Number, options: `T$77`? = definedExternally /* null */): Number = definedExternally
    open fun _rebuildParticle(particle: Any): Unit = definedExternally
    open fun rebuildMesh(): SolidParticleSystem = definedExternally
    open fun setParticles(start: Number? = definedExternally /* null */, end: Number? = definedExternally /* null */, update: Boolean? = definedExternally /* null */): SolidParticleSystem = definedExternally
    open fun _quaternionRotationYPR(): Unit = definedExternally
    open fun _quaternionToRotationMatrix(): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
    open fun refreshVisibleSize(): SolidParticleSystem = definedExternally
    open fun setVisibilityBox(size: Number): Unit = definedExternally
    open var isAlwaysVisible: Boolean = definedExternally
    open var isVisibilityBoxLocked: Boolean = definedExternally
    open var computeParticleRotation: Boolean = definedExternally
    open var computeParticleColor: Boolean = definedExternally
    open var computeParticleTexture: Boolean = definedExternally
    open var computeParticleVertex: Boolean = definedExternally
    open var computeBoundingBox: Boolean = definedExternally
    open fun initParticles(): Unit = definedExternally
    open fun recycleParticle(particle: SolidParticle): SolidParticle = definedExternally
    open fun updateParticle(particle: SolidParticle): SolidParticle = definedExternally
    open fun updateParticleVertex(particle: SolidParticle, vertex: Vector3, pt: Number): Vector3 = definedExternally
    open fun beforeUpdateParticles(start: Number? = definedExternally /* null */, stop: Number? = definedExternally /* null */, update: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun afterUpdateParticles(start: Number? = definedExternally /* null */, stop: Number? = definedExternally /* null */, update: Boolean? = definedExternally /* null */): Unit = definedExternally
}
external interface PhysicsImpostorJoint {
    var mainImpostor: PhysicsImpostor
    var connectedImpostor: PhysicsImpostor
    var joint: PhysicsJoint
}
external open class PhysicsEngine(gravity: Vector3? = definedExternally /* null */, _physicsPlugin: IPhysicsEnginePlugin? = definedExternally /* null */) {
    open var _physicsPlugin: Any = definedExternally
    open var gravity: Vector3 = definedExternally
    open fun setGravity(gravity: Vector3): Unit = definedExternally
    open fun setTimeStep(newTimeStep: Number? = definedExternally /* null */): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun getPhysicsPluginName(): String = definedExternally
    open var _impostors: Any = definedExternally
    open var _joints: Any = definedExternally
    open fun addImpostor(impostor: PhysicsImpostor): Unit = definedExternally
    open fun removeImpostor(impostor: PhysicsImpostor): Unit = definedExternally
    open fun addJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = definedExternally
    open fun removeJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = definedExternally
    open fun _step(delta: Number): Unit = definedExternally
    open fun getPhysicsPlugin(): IPhysicsEnginePlugin = definedExternally
    open fun getImpostorForPhysicsObject(`object`: IPhysicsEnabledObject): PhysicsImpostor = definedExternally
    open fun getImpostorWithPhysicsBody(body: Any): PhysicsImpostor = definedExternally
    companion object {
        var Epsilon: Number = definedExternally
    }
}
external interface IPhysicsEnginePlugin {
    var world: Any
    var name: String
    fun setGravity(gravity: Vector3): Any
    fun setTimeStep(timeStep: Number): Any
    fun executeStep(delta: Number, impostors: Array<PhysicsImpostor>)
    fun applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Any
    fun applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Any
    fun generatePhysicsBody(impostor: PhysicsImpostor): Any
    fun removePhysicsBody(impostor: PhysicsImpostor): Any
    fun generateJoint(joint: PhysicsImpostorJoint): Any
    fun removeJoint(joint: PhysicsImpostorJoint): Any
    fun isSupported(): Boolean
    fun setTransformationFromPhysicsBody(impostor: PhysicsImpostor): Any
    fun setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion): Any
    fun setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3): Any
    fun setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3): Any
    fun getLinearVelocity(impostor: PhysicsImpostor): Vector3
    fun getAngularVelocity(impostor: PhysicsImpostor): Vector3
    fun setBodyMass(impostor: PhysicsImpostor, mass: Number): Any
    fun getBodyMass(impostor: PhysicsImpostor): Any
    fun getBodyFriction(impostor: PhysicsImpostor): Any
    fun setBodyFriction(impostor: PhysicsImpostor, friction: Number): Any
    fun getBodyRestitution(impostor: PhysicsImpostor): Any
    fun setBodyRestitution(impostor: PhysicsImpostor, restitution: Number): Any
    fun sleepBody(impostor: PhysicsImpostor): Any
    fun wakeUpBody(impostor: PhysicsImpostor): Any
    fun updateDistanceJoint(joint: PhysicsJoint, maxDistance: Number, minDistance: Number? = definedExternally /* null */): Any
    fun setMotor(joint: IMotorEnabledJoint, speed: Number, maxForce: Number? = definedExternally /* null */, motorIndex: Number? = definedExternally /* null */): Any
    fun setLimit(joint: IMotorEnabledJoint, upperLimit: Number, lowerLimit: Number? = definedExternally /* null */, motorIndex: Number? = definedExternally /* null */): Any
    fun getRadius(impostor: PhysicsImpostor): Number
    fun getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3): Any
    fun syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor): Any
    fun dispose(): Any
}
external interface PhysicsImpostorParameters {
    var mass: Number
    var friction: Number? get() = definedExternally; set(value) = definedExternally
    var restitution: Number? get() = definedExternally; set(value) = definedExternally
    var nativeOptions: Any? get() = definedExternally; set(value) = definedExternally
}
external interface IPhysicsEnabledObject {
    var position: Vector3
    var rotationQuaternion: Quaternion
    var scaling: Vector3
    var rotation: Vector3? get() = definedExternally; set(value) = definedExternally
    var parent: Any? get() = definedExternally; set(value) = definedExternally
    val getBoundingInfo: (() -> BoundingInfo)? get() = definedExternally
    val computeWorldMatrix: ((force: Boolean) -> Unit)? get() = definedExternally
    val getWorldMatrix: (() -> Matrix)? get() = definedExternally
    val getChildMeshes: (() -> Array<AbstractMesh>)? get() = definedExternally
    val getVerticesData: ((kind: String) -> dynamic /* Array<Number> | Float32Array */)? get() = definedExternally
    val getIndices: (() -> Array<Number>)? get() = definedExternally
    val getScene: (() -> Scene)? get() = definedExternally
}
external interface `T$78` {
    var body: Any
}
external open class PhysicsImpostor(`object`: IPhysicsEnabledObject, type: Number, _options: PhysicsImpostorParameters? = definedExternally /* null */, _scene: Scene? = definedExternally /* null */) {
    open var `object`: IPhysicsEnabledObject = definedExternally
    open var type: Number = definedExternally
    open var _options: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _physicsEngine: Any = definedExternally
    open var _physicsBody: Any = definedExternally
    open var _bodyUpdateRequired: Any = definedExternally
    open var _onBeforePhysicsStepCallbacks: Any = definedExternally
    open var _onAfterPhysicsStepCallbacks: Any = definedExternally
    open var _onPhysicsCollideCallbacks: Any = definedExternally
    open var _deltaPosition: Any = definedExternally
    open var _deltaRotation: Any = definedExternally
    open var _deltaRotationConjugated: Any = definedExternally
    open var _parent: Any = definedExternally
    open var _isDisposed: Any = definedExternally
    open var isDisposed: Boolean = definedExternally
    open var mass: Number = definedExternally
    open var friction: Number = definedExternally
    open var restitution: Number = definedExternally
    open var uniqueId: Number = definedExternally
    open var _joints: Any = definedExternally
    open fun _init(): Unit = definedExternally
    open fun _getPhysicsParent(): Unit = definedExternally
    open fun isBodyInitRequired(): Boolean = definedExternally
    open fun setScalingUpdated(updated: Boolean): Unit = definedExternally
    open fun forceUpdate(): Unit = definedExternally
    open var physicsBody: Any = definedExternally
    open var parent: PhysicsImpostor = definedExternally
    open fun resetUpdateFlags(): Unit = definedExternally
    open fun getObjectExtendSize(): Vector3 = definedExternally
    open fun getObjectCenter(): Vector3 = definedExternally
    open fun getParam(paramName: String): Any = definedExternally
    open fun setParam(paramName: String, value: Number): Unit = definedExternally
    open fun setMass(mass: Number): Unit = definedExternally
    open fun getLinearVelocity(): Vector3 = definedExternally
    open fun setLinearVelocity(velocity: Vector3): Unit = definedExternally
    open fun getAngularVelocity(): Vector3 = definedExternally
    open fun setAngularVelocity(velocity: Vector3): Unit = definedExternally
    open fun executeNativeFunction(func: (world: Any, physicsBody: Any) -> Unit): Unit = definedExternally
    open fun registerBeforePhysicsStep(func: (impostor: PhysicsImpostor) -> Unit): Unit = definedExternally
    open fun unregisterBeforePhysicsStep(func: (impostor: PhysicsImpostor) -> Unit): Unit = definedExternally
    open fun registerAfterPhysicsStep(func: (impostor: PhysicsImpostor) -> Unit): Unit = definedExternally
    open fun unregisterAfterPhysicsStep(func: (impostor: PhysicsImpostor) -> Unit): Unit = definedExternally
    open fun registerOnPhysicsCollide(collideAgainst: PhysicsImpostor, func: (collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor) -> Unit): Unit = definedExternally
    open fun registerOnPhysicsCollide(collideAgainst: Array<PhysicsImpostor>, func: (collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor) -> Unit): Unit = definedExternally
    open fun unregisterOnPhysicsCollide(collideAgainst: PhysicsImpostor, func: (collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor) -> Unit): Unit = definedExternally
    open fun unregisterOnPhysicsCollide(collideAgainst: PhysicsImpostor, func: (collider: PhysicsImpostor, collidedAgainst: Array<PhysicsImpostor>) -> Unit): Unit = definedExternally
    open fun unregisterOnPhysicsCollide(collideAgainst: Array<PhysicsImpostor>, func: (collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor) -> Unit): Unit = definedExternally
    open fun unregisterOnPhysicsCollide(collideAgainst: Array<PhysicsImpostor>, func: (collider: PhysicsImpostor, collidedAgainst: Array<PhysicsImpostor>) -> Unit): Unit = definedExternally
    open var _tmpPositionWithDelta: Any = definedExternally
    open var _tmpRotationWithDelta: Any = definedExternally
    open var beforeStep: () -> Unit = definedExternally
    open var afterStep: () -> Unit = definedExternally
    open var onCollideEvent: (collider: BABYLON.PhysicsImpostor, collidedWith: BABYLON.PhysicsImpostor) -> Unit = definedExternally
    open var onCollide: (e: Any) -> Unit = definedExternally
    open fun applyForce(force: Vector3, contactPoint: Vector3): Unit = definedExternally
    open fun applyImpulse(force: Vector3, contactPoint: Vector3): Unit = definedExternally
    open fun createJoint(otherImpostor: PhysicsImpostor, jointType: Number, jointData: PhysicsJointData): Unit = definedExternally
    open fun addJoint(otherImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = definedExternally
    open fun sleep(): Unit = definedExternally
    open fun wakeUp(): Unit = definedExternally
    open fun clone(newObject: IPhysicsEnabledObject): PhysicsImpostor = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun setDeltaPosition(position: Vector3): Unit = definedExternally
    open fun setDeltaRotation(rotation: Quaternion): Unit = definedExternally
    open fun getBoxSizeToRef(result: Vector3): Unit = definedExternally
    open fun getRadius(): Number = definedExternally
    open fun syncBoneWithImpostor(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: Number? = definedExternally /* null */, adjustRotation: Quaternion? = definedExternally /* null */): Unit = definedExternally
    open fun syncImpostorWithBone(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: Number? = definedExternally /* null */, adjustRotation: Quaternion? = definedExternally /* null */, boneAxis: Vector3? = definedExternally /* null */): Unit = definedExternally
    companion object {
        var DEFAULT_OBJECT_SIZE: Vector3 = definedExternally
        var IDENTITY_QUATERNION: Quaternion = definedExternally
        var _tmpVecs: Any = definedExternally
        var _tmpQuat: Any = definedExternally
        var NoImpostor: Number = definedExternally
        var SphereImpostor: Number = definedExternally
        var BoxImpostor: Number = definedExternally
        var PlaneImpostor: Number = definedExternally
        var MeshImpostor: Number = definedExternally
        var CylinderImpostor: Number = definedExternally
        var ParticleImpostor: Number = definedExternally
        var HeightmapImpostor: Number = definedExternally
    }
}
external interface PhysicsJointData {
    var mainPivot: Vector3? get() = definedExternally; set(value) = definedExternally
    var connectedPivot: Vector3? get() = definedExternally; set(value) = definedExternally
    var mainAxis: Vector3? get() = definedExternally; set(value) = definedExternally
    var connectedAxis: Vector3? get() = definedExternally; set(value) = definedExternally
    var collision: Boolean? get() = definedExternally; set(value) = definedExternally
    var nativeParams: Any? get() = definedExternally; set(value) = definedExternally
}
external open class PhysicsJoint(type: Number, jointData: PhysicsJointData) {
    open var type: Number = definedExternally
    open var jointData: PhysicsJointData = definedExternally
    open var _physicsJoint: Any = definedExternally
    open var _physicsPlugin: IPhysicsEnginePlugin = definedExternally
    open var physicsJoint: Any = definedExternally
    open var physicsPlugin: IPhysicsEnginePlugin = definedExternally
    open fun executeNativeFunction(func: (world: Any, physicsJoint: Any) -> Unit): Unit = definedExternally
    companion object {
        var DistanceJoint: Number = definedExternally
        var HingeJoint: Number = definedExternally
        var BallAndSocketJoint: Number = definedExternally
        var WheelJoint: Number = definedExternally
        var SliderJoint: Number = definedExternally
        var PrismaticJoint: Number = definedExternally
        var UniversalJoint: Number = definedExternally
        var Hinge2Joint: Number = definedExternally
        var PointToPointJoint: Number = definedExternally
        var SpringJoint: Number = definedExternally
        var LockJoint: Number = definedExternally
    }
}
external open class DistanceJoint(jointData: DistanceJointData) : PhysicsJoint {
    open fun updateDistance(maxDistance: Number, minDistance: Number? = definedExternally /* null */): Unit = definedExternally
}
external open class MotorEnabledJoint(type: Number, jointData: PhysicsJointData) : PhysicsJoint, IMotorEnabledJoint {
    override fun setMotor(force: Number?, maxForce: Number?, motorIndex: Number?)
    override fun setLimit(upperLimit: Number, lowerLimit: Number?, motorIndex: Number?)
    open fun setMotor(force: Number? = definedExternally /* null */, maxForce: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setLimit(upperLimit: Number, lowerLimit: Number? = definedExternally /* null */): Unit = definedExternally
}
external open class HingeJoint(jointData: PhysicsJointData) : MotorEnabledJoint {
    override fun setMotor(force: Number?, maxForce: Number?): Unit = definedExternally
    override fun setLimit(upperLimit: Number, lowerLimit: Number?): Unit = definedExternally
}
external open class Hinge2Joint(jointData: PhysicsJointData) : MotorEnabledJoint {
    override fun setMotor(force: Number?, maxForce: Number?, motorIndex: Number?): Unit = definedExternally
    override fun setLimit(upperLimit: Number, lowerLimit: Number?, motorIndex: Number?): Unit = definedExternally
}
external interface IMotorEnabledJoint {
    var physicsJoint: Any
    fun setMotor(force: Number? = definedExternally /* null */, maxForce: Number? = definedExternally /* null */, motorIndex: Number? = definedExternally /* null */): Any
    fun setLimit(upperLimit: Number, lowerLimit: Number? = definedExternally /* null */, motorIndex: Number? = definedExternally /* null */): Any
}
external interface DistanceJointData : PhysicsJointData {
    var maxDistance: Number
}
external interface SpringJointData : PhysicsJointData {
    var length: Number
    var stiffness: Number
    var damping: Number
}
external open class AnaglyphPostProcess : PostProcess {
    constructor(name: String, options: Number, rigCameras: Array<Camera>, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    constructor(name: String, options: PostProcessOptions, rigCameras: Array<Camera>, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    open var _passedProcess: Any = definedExternally
}
external open class BlackAndWhitePostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    constructor(name: String, options: PostProcessOptions, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    open var degree: Number = definedExternally
}
external open class BlurPostProcess : PostProcess {
    constructor(name: String, direction: Vector2, kernel: Number, options: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, textureType: Number? = definedExternally /* null */)
    constructor(name: String, direction: Vector2, kernel: Number, options: PostProcessOptions, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, textureType: Number? = definedExternally /* null */)
    open var direction: Vector2 = definedExternally
    open var _kernel: Number = definedExternally
    open var _idealKernel: Number = definedExternally
    open var _packedFloat: Boolean = definedExternally
    open var kernel: Number = definedExternally
    open var packedFloat: Boolean = definedExternally
    open fun _updateParameters(): Unit = definedExternally
    open fun _nearestBestKernel(idealKernel: Number): Number = definedExternally
    open fun _gaussianWeight(x: Number): Number = definedExternally
    open fun _glslFloat(x: Number, decimalFigures: Number? = definedExternally /* null */): String = definedExternally
}
external open class ColorCorrectionPostProcess : PostProcess {
    constructor(name: String, colorTableUrl: String, options: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    constructor(name: String, colorTableUrl: String, options: PostProcessOptions, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    open var _colorTableTexture: Any = definedExternally
}
external open class ConvolutionPostProcess : PostProcess {
    constructor(name: String, kernel: Array<Number>, options: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    constructor(name: String, kernel: Array<Number>, options: PostProcessOptions, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    open var kernel: Array<Number> = definedExternally
    companion object {
        var EdgeDetect0Kernel: Array<Number> = definedExternally
        var EdgeDetect1Kernel: Array<Number> = definedExternally
        var EdgeDetect2Kernel: Array<Number> = definedExternally
        var SharpenKernel: Array<Number> = definedExternally
        var EmbossKernel: Array<Number> = definedExternally
        var GaussianKernel: Array<Number> = definedExternally
    }
}
external open class DisplayPassPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    constructor(name: String, options: PostProcessOptions, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
}
external open class FilterPostProcess : PostProcess {
    constructor(name: String, kernelMatrix: Matrix, options: Number, camera: Camera? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    constructor(name: String, kernelMatrix: Matrix, options: PostProcessOptions, camera: Camera? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    open var kernelMatrix: Matrix = definedExternally
}
external open class FxaaPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, textureType: Number? = definedExternally /* null */)
    constructor(name: String, options: PostProcessOptions, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, textureType: Number? = definedExternally /* null */)
    open var texelWidth: Number = definedExternally
    open var texelHeight: Number = definedExternally
}
external open class HighlightsPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, textureType: Number? = definedExternally /* null */)
    constructor(name: String, options: PostProcessOptions, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, textureType: Number? = definedExternally /* null */)
}
external open class ImageProcessingPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, textureType: Number? = definedExternally /* null */)
    constructor(name: String, options: PostProcessOptions, camera: Camera? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, textureType: Number? = definedExternally /* null */)
    open var _imageProcessingConfiguration: ImageProcessingConfiguration = definedExternally
    open var imageProcessingConfiguration: ImageProcessingConfiguration = definedExternally
    open var _imageProcessingObserver: Any = definedExternally
    open fun _attachImageProcessingConfiguration(configuration: ImageProcessingConfiguration): Unit = definedExternally
    open var colorCurves: ColorCurves = definedExternally
    open var colorCurvesEnabled: Boolean = definedExternally
    open var colorGradingTexture: BaseTexture = definedExternally
    open var colorGradingEnabled: Boolean = definedExternally
    open var exposure: Number = definedExternally
    open var toneMappingEnabled: Boolean = definedExternally
    open var contrast: Number = definedExternally
    open var vignetteStretch: Number = definedExternally
    open var vignetteCentreX: Number = definedExternally
    open var vignetteCentreY: Number = definedExternally
    open var vignetteWeight: Number = definedExternally
    open var vignetteColor: Color4 = definedExternally
    open var vignetteCameraFov: Number = definedExternally
    open var vignetteBlendMode: Number = definedExternally
    open var vignetteEnabled: Boolean = definedExternally
    open var _fromLinearSpace: Any = definedExternally
    open var fromLinearSpace: Boolean = definedExternally
    open var _defines: Any = definedExternally
    open fun _updateParameters(): Unit = definedExternally
    override fun dispose(camera: Camera?): Unit = definedExternally
}
external open class PassPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, textureType: Number? = definedExternally /* null */)
    constructor(name: String, options: PostProcessOptions, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, textureType: Number? = definedExternally /* null */)
}
external interface PostProcessOptions {
    var width: Number
    var height: Number
}
external open class PostProcess {
    constructor(name: String, fragmentUrl: String, parameters: Array<String>, samplers: Array<String>, options: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, defines: String? = definedExternally /* null */, textureType: Number? = definedExternally /* null */, vertexUrl: String? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */, blockCompilation: Boolean? = definedExternally /* null */)
    constructor(name: String, fragmentUrl: String, parameters: Array<String>, samplers: Array<String>, options: PostProcessOptions, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, defines: String? = definedExternally /* null */, textureType: Number? = definedExternally /* null */, vertexUrl: String? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */, blockCompilation: Boolean? = definedExternally /* null */)
    open var name: String = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var renderTargetSamplingMode: Number = definedExternally
    open var clearColor: Color4 = definedExternally
    open var autoClear: Boolean = definedExternally
    open var alphaMode: Number = definedExternally
    open var alphaConstants: Color4 = definedExternally
    open var enablePixelPerfectMode: Boolean = definedExternally
    open var scaleMode: Number = definedExternally
    open var alwaysForcePOT: Boolean = definedExternally
    open var samples: Number = definedExternally
    open var _camera: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _engine: Any = definedExternally
    open var _options: Any = definedExternally
    open var _reusable: Any = definedExternally
    open var _textureType: Any = definedExternally
    open var _textures: SmartArray<WebGLTexture> = definedExternally
    open var _currentRenderTextureInd: Number = definedExternally
    open var _effect: Any = definedExternally
    open var _samplers: Any = definedExternally
    open var _fragmentUrl: Any = definedExternally
    open var _vertexUrl: Any = definedExternally
    open var _parameters: Any = definedExternally
    open var _scaleRatio: Any = definedExternally
    open var _indexParameters: Any = definedExternally
    open var _shareOutputWithPostProcess: Any = definedExternally
    open var _texelSize: Any = definedExternally
    open var _forcedOutputTexture: Any = definedExternally
    open var onActivateObservable: Observable<Camera> = definedExternally
    open var _onActivateObserver: Any = definedExternally
    open var onActivate: (camera: Camera) -> Unit = definedExternally
    open var onSizeChangedObservable: Observable<PostProcess> = definedExternally
    open var _onSizeChangedObserver: Any = definedExternally
    open var onSizeChanged: (postProcess: PostProcess) -> Unit = definedExternally
    open var onApplyObservable: Observable<Effect> = definedExternally
    open var _onApplyObserver: Any = definedExternally
    open var onApply: (effect: Effect) -> Unit = definedExternally
    open var onBeforeRenderObservable: Observable<Effect> = definedExternally
    open var _onBeforeRenderObserver: Any = definedExternally
    open var onBeforeRender: (effect: Effect) -> Unit = definedExternally
    open var onAfterRenderObservable: Observable<Effect> = definedExternally
    open var _onAfterRenderObserver: Any = definedExternally
    open var onAfterRender: (efect: Effect) -> Unit = definedExternally
    open var outputTexture: WebGLTexture = definedExternally
    open fun getCamera(): Camera = definedExternally
    open var texelSize: Vector2 = definedExternally
    open fun getEngine(): Engine = definedExternally
    open fun getEffect(): Effect = definedExternally
    open fun shareOutputWith(postProcess: PostProcess): PostProcess = definedExternally
    open fun updateEffect(defines: String? = definedExternally /* null */, uniforms: Array<String>? = definedExternally /* null */, samplers: Array<String>? = definedExternally /* null */, indexParameters: Any? = definedExternally /* null */, onCompiled: ((effect: Effect) -> Unit)? = definedExternally /* null */, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally /* null */): Unit = definedExternally
    open fun isReusable(): Boolean = definedExternally
    open fun markTextureDirty(): Unit = definedExternally
    open fun activate(camera: Camera, sourceTexture: WebGLTexture? = definedExternally /* null */, forceDepthStencil: Boolean? = definedExternally /* null */): Unit = definedExternally
    open var isSupported: Boolean = definedExternally
    open var aspectRatio: Number = definedExternally
    open fun apply(): Effect = definedExternally
    open fun _disposeTextures(): Unit = definedExternally
    open fun dispose(camera: Camera? = definedExternally /* null */): Unit = definedExternally
}
external open class PostProcessManager(scene: Scene) {
    open var _scene: Any = definedExternally
    open var _indexBuffer: Any = definedExternally
    open var _vertexBuffers: Any = definedExternally
    open fun _prepareBuffers(): Unit = definedExternally
    open fun _prepareFrame(sourceTexture: WebGLTexture? = definedExternally /* null */, postProcesses: Array<PostProcess>? = definedExternally /* null */): Boolean = definedExternally
    open fun directRender(postProcesses: Array<PostProcess>, targetTexture: WebGLTexture? = definedExternally /* null */): Unit = definedExternally
    open fun _finalizeFrame(doNotPresent: Boolean? = definedExternally /* null */, targetTexture: WebGLTexture? = definedExternally /* null */, faceIndex: Number? = definedExternally /* null */, postProcesses: Array<PostProcess>? = definedExternally /* null */): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class RefractionPostProcess : PostProcess {
    constructor(name: String, refractionTextureUrl: String, color: Color3, depth: Number, colorLevel: Number, options: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    constructor(name: String, refractionTextureUrl: String, color: Color3, depth: Number, colorLevel: Number, options: PostProcessOptions, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */)
    open var color: Color3 = definedExternally
    open var depth: Number = definedExternally
    open var colorLevel: Number = definedExternally
    open var _refRexture: Any = definedExternally
    fun dispose(camera: Camera): Unit = definedExternally
}
external open class StereoscopicInterlacePostProcess(name: String, rigCameras: Array<Camera>, isStereoscopicHoriz: Boolean, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */) : PostProcess {
    open var _stepSize: Any = definedExternally
    open var _passedProcess: Any = definedExternally
}
external enum class TonemappingOperator {
    Hable /* = 0 */,
    Reinhard /* = 1 */,
    HejiDawson /* = 2 */,
    Photographic /* = 3 */
}
external open class TonemapPostProcess(name: String, _operator: TonemappingOperator, exposureAdjustment: Number, camera: Camera, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, textureFormat: Number? = definedExternally /* null */) : PostProcess {
    open var _operator: Any = definedExternally
    open var exposureAdjustment: Number = definedExternally
}
external interface `T$80` {
    var position: Vector3
}
external open class VolumetricLightScatteringPostProcess(name: String, ratio: Any, camera: Camera, mesh: Mesh? = definedExternally /* null */, samples: Number? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, engine: Engine? = definedExternally /* null */, reusable: Boolean? = definedExternally /* null */, scene: Scene? = definedExternally /* null */) : PostProcess {
    open var _volumetricLightScatteringPass: Any = definedExternally
    open var _volumetricLightScatteringRTT: Any = definedExternally
    open var _viewPort: Any = definedExternally
    open var _screenCoordinates: Any = definedExternally
    open var _cachedDefines: Any = definedExternally
    open var attachedNode: `T$80` = definedExternally
    open var customMeshPosition: Vector3 = definedExternally
    open var useCustomMeshPosition: Boolean = definedExternally
    open var invert: Boolean = definedExternally
    open var mesh: Mesh = definedExternally
    open var useDiffuseColor: Boolean = definedExternally
    open var excludedMeshes: Array<AbstractMesh> = definedExternally
    open var exposure: Number = definedExternally
    open var decay: Number = definedExternally
    open var weight: Number = definedExternally
    open var density: Number = definedExternally
    open fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = definedExternally
    open fun setCustomMeshPosition(position: Vector3): Unit = definedExternally
    open fun getCustomMeshPosition(): Vector3 = definedExternally
    fun dispose(camera: Camera): Unit = definedExternally
    open fun getPass(): RenderTargetTexture = definedExternally
    open fun _meshExcluded(mesh: Any): Unit = definedExternally
    open fun _createPass(scene: Any, ratio: Any): Unit = definedExternally
    open fun _updateMeshScreenCoordinates(scene: Any): Unit = definedExternally
    companion object {
        fun CreateDefaultMesh(name: String, scene: Scene): Mesh = definedExternally
    }
}
external open class VRDistortionCorrectionPostProcess(name: String, camera: Camera, isRightEye: Boolean, vrMetrics: VRCameraMetrics) : PostProcess {
    override var aspectRatio: Number = definedExternally
    open var _isRightEye: Any = definedExternally
    open var _distortionFactors: Any = definedExternally
    open var _postProcessScaleFactor: Any = definedExternally
    open var _lensCenterOffset: Any = definedExternally
    open var _scaleIn: Any = definedExternally
    open var _scaleFactor: Any = definedExternally
    open var _lensCenter: Any = definedExternally
}
external open class ReflectionProbe(name: String, size: Number, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var _scene: Any = definedExternally
    open var _renderTargetTexture: Any = definedExternally
    open var _projectionMatrix: Any = definedExternally
    open var _viewMatrix: Any = definedExternally
    open var _target: Any = definedExternally
    open var _add: Any = definedExternally
    open var _attachedMesh: Any = definedExternally
    open var invertYAxis: Boolean = definedExternally
    open var position: Vector3 = definedExternally
    open var samples: Number = definedExternally
    open var refreshRate: Number = definedExternally
    open fun getScene(): Scene = definedExternally
    open var cubeTexture: RenderTargetTexture = definedExternally
    open var renderList: Array<AbstractMesh> = definedExternally
    open fun attachToMesh(mesh: AbstractMesh): Unit = definedExternally
    open fun setRenderingAutoClearDepthStencil(renderingGroupId: Number, autoClearDepthStencil: Boolean): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class BoundingBoxRenderer(scene: Scene) {
    open var frontColor: Color3 = definedExternally
    open var backColor: Color3 = definedExternally
    open var showBackLines: Boolean = definedExternally
    open var renderList: SmartArray<BoundingBox> = definedExternally
    open var _scene: Any = definedExternally
    open var _colorShader: Any = definedExternally
    open var _vertexBuffers: Any = definedExternally
    open var _indexBuffer: Any = definedExternally
    open fun _prepareRessources(): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    open fun render(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class DepthRenderer(scene: Scene, type: Number? = definedExternally /* null */) {
    open var _scene: Any = definedExternally
    open var _depthMap: Any = definedExternally
    open var _effect: Any = definedExternally
    open var _viewMatrix: Any = definedExternally
    open var _projectionMatrix: Any = definedExternally
    open var _transformMatrix: Any = definedExternally
    open var _worldViewProjection: Any = definedExternally
    open var _cachedDefines: Any = definedExternally
    open fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = definedExternally
    open fun getDepthMap(): RenderTargetTexture = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class EdgesRenderer(source: AbstractMesh, epsilon: Number? = definedExternally /* null */, checkVerticesInsteadOfIndices: Boolean? = definedExternally /* null */) {
    open var edgesWidthScalerForOrthographic: Number = definedExternally
    open var edgesWidthScalerForPerspective: Number = definedExternally
    open var _source: Any = definedExternally
    open var _linesPositions: Any = definedExternally
    open var _linesNormals: Any = definedExternally
    open var _linesIndices: Any = definedExternally
    open var _epsilon: Any = definedExternally
    open var _indicesCount: Any = definedExternally
    open var _lineShader: Any = definedExternally
    open var _ib: Any = definedExternally
    open var _buffers: Any = definedExternally
    open var _checkVerticesInsteadOfIndices: Any = definedExternally
    open fun _prepareRessources(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun _processEdgeForAdjacencies(pa: Any, pb: Any, p0: Any, p1: Any, p2: Any): Unit = definedExternally
    open fun _processEdgeForAdjacenciesWithVertices(pa: Any, pb: Any, p0: Any, p1: Any, p2: Any): Unit = definedExternally
    open fun _checkEdge(faceIndex: Any, edge: Any, faceNormals: Any, p0: Any, p1: Any): Unit = definedExternally
    open fun _generateEdgesLines(): Unit = definedExternally
    open fun render(): Unit = definedExternally
}
external open class GeometryBufferRenderer(scene: Scene, ratio: Number? = definedExternally /* null */) {
    open var _scene: Any = definedExternally
    open var _multiRenderTarget: Any = definedExternally
    open var _effect: Any = definedExternally
    open var _ratio: Any = definedExternally
    open var _viewMatrix: Any = definedExternally
    open var _projectionMatrix: Any = definedExternally
    open var _transformMatrix: Any = definedExternally
    open var _worldViewProjection: Any = definedExternally
    open var _cachedDefines: Any = definedExternally
    open var _enablePosition: Any = definedExternally
    open var renderList: Array<Mesh> = definedExternally
    open var isSupported: Boolean = definedExternally
    open var enablePosition: Boolean = definedExternally
    open fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = definedExternally
    open fun getGBuffer(): MultiRenderTarget = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun _createRenderTargets(): Unit = definedExternally
}
external open class OutlineRenderer(scene: Scene) {
    open var _scene: Any = definedExternally
    open var _effect: Any = definedExternally
    open var _cachedDefines: Any = definedExternally
    open var zOffset: Number = definedExternally
    open fun render(subMesh: SubMesh, batch: _InstancesBatch, useOverlay: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = definedExternally
}
external open class RenderingGroup(index: Number, scene: Scene, opaqueSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */, alphaTestSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */, transparentSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */) {
    open var index: Number = definedExternally
    open var _scene: Any = definedExternally
    open var _opaqueSubMeshes: Any = definedExternally
    open var _transparentSubMeshes: Any = definedExternally
    open var _alphaTestSubMeshes: Any = definedExternally
    open var _particleSystems: Any = definedExternally
    open var _spriteManagers: Any = definedExternally
    open var _activeVertices: Any = definedExternally
    open var _opaqueSortCompareFn: Any = definedExternally
    open var _alphaTestSortCompareFn: Any = definedExternally
    open var _transparentSortCompareFn: Any = definedExternally
    open var _renderOpaque: Any = definedExternally
    open var _renderAlphaTest: Any = definedExternally
    open var _renderTransparent: Any = definedExternally
    open var _edgesRenderers: Any = definedExternally
    open var onBeforeTransparentRendering: () -> Unit = definedExternally
    open var opaqueSortCompareFn: (a: SubMesh, b: SubMesh) -> Number = definedExternally
    open var alphaTestSortCompareFn: (a: SubMesh, b: SubMesh) -> Number = definedExternally
    open var transparentSortCompareFn: (a: SubMesh, b: SubMesh) -> Number = definedExternally
    open fun render(customRenderFunction: (opaqueSubMeshes: SmartArray<SubMesh>, transparentSubMeshes: SmartArray<SubMesh>, alphaTestSubMeshes: SmartArray<SubMesh>) -> Unit, renderSprites: Boolean, renderParticles: Boolean, activeMeshes: Array<AbstractMesh>): Unit = definedExternally
    open fun renderOpaqueSorted(subMeshes: Any): Unit = definedExternally
    open fun renderAlphaTestSorted(subMeshes: Any): Unit = definedExternally
    open fun renderTransparentSorted(subMeshes: Any): Unit = definedExternally
    open fun prepare(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun dispatch(subMesh: SubMesh): Unit = definedExternally
    open fun dispatchSprites(spriteManager: SpriteManager): Unit = definedExternally
    open fun dispatchParticles(particleSystem: ParticleSystem): Unit = definedExternally
    open fun _renderParticles(activeMeshes: Any): Unit = definedExternally
    open fun _renderSprites(): Unit = definedExternally
    companion object {
        fun renderSorted(subMeshes: Any, sortCompareFn: Any, cameraPosition: Any, transparent: Any): Unit = definedExternally
        fun renderUnsorted(subMeshes: Any): Unit = definedExternally
        fun defaultTransparentSortCompare(a: SubMesh, b: SubMesh): Number = definedExternally
        fun backToFrontSortCompare(a: SubMesh, b: SubMesh): Number = definedExternally
        fun frontToBackSortCompare(a: SubMesh, b: SubMesh): Number = definedExternally
    }
}
external open class RenderingManager(scene: Scene) {
    open var _scene: Any = definedExternally
    open var _renderingGroups: Any = definedExternally
    open var _depthStencilBufferAlreadyCleaned: Any = definedExternally
    open var _currentIndex: Any = definedExternally
    open var _autoClearDepthStencil: Any = definedExternally
    open var _customOpaqueSortCompareFn: Any = definedExternally
    open var _customAlphaTestSortCompareFn: Any = definedExternally
    open var _customTransparentSortCompareFn: Any = definedExternally
    open var _renderinGroupInfo: Any = definedExternally
    open fun _clearDepthStencilBuffer(depth: Any? = definedExternally /* null */, stencil: Any? = definedExternally /* null */): Unit = definedExternally
    open fun render(customRenderFunction: (opaqueSubMeshes: SmartArray<SubMesh>, transparentSubMeshes: SmartArray<SubMesh>, alphaTestSubMeshes: SmartArray<SubMesh>) -> Unit, activeMeshes: Array<AbstractMesh>, renderParticles: Boolean, renderSprites: Boolean): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun _prepareRenderingGroup(renderingGroupId: Any): Unit = definedExternally
    open fun dispatchSprites(spriteManager: SpriteManager): Unit = definedExternally
    open fun dispatchParticles(particleSystem: ParticleSystem): Unit = definedExternally
    open fun dispatch(subMesh: SubMesh): Unit = definedExternally
    open fun setRenderingOrder(renderingGroupId: Number, opaqueSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */, alphaTestSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */, transparentSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */): Unit = definedExternally
    open fun setRenderingAutoClearDepthStencil(renderingGroupId: Number, autoClearDepthStencil: Boolean, depth: Boolean? = definedExternally /* null */, stencil: Boolean? = definedExternally /* null */): Unit = definedExternally
    companion object {
        var MAX_RENDERINGGROUPS: Number = definedExternally
        var MIN_RENDERINGGROUPS: Number = definedExternally
        var AUTOCLEAR: Boolean = definedExternally
    }
}
external open class Sprite(name: String, manager: SpriteManager) {
    open var name: String = definedExternally
    open var position: Vector3 = definedExternally
    open var color: Color4 = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var angle: Number = definedExternally
    open var cellIndex: Number = definedExternally
    open var invertU: Number = definedExternally
    open var invertV: Number = definedExternally
    open var disposeWhenFinishedAnimating: Boolean = definedExternally
    open var animations: Array<Animation> = definedExternally
    open var isPickable: Boolean = definedExternally
    open var actionManager: ActionManager = definedExternally
    open var _animationStarted: Any = definedExternally
    open var _loopAnimation: Any = definedExternally
    open var _fromIndex: Any = definedExternally
    open var _toIndex: Any = definedExternally
    open var _delay: Any = definedExternally
    open var _direction: Any = definedExternally
    open var _frameCount: Any = definedExternally
    open var _manager: Any = definedExternally
    open var _time: Any = definedExternally
    open var _onAnimationEnd: Any = definedExternally
    open var size: Number = definedExternally
    open fun playAnimation(from: Number, to: Number, loop: Boolean, delay: Number, onAnimationEnd: () -> Unit): Unit = definedExternally
    open fun stopAnimation(): Unit = definedExternally
    open fun _animate(deltaTime: Number): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class SpriteManager(name: String, imgUrl: String, capacity: Number, cellSize: Any, scene: Scene, epsilon: Number? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var sprites: Array<Sprite> = definedExternally
    open var renderingGroupId: Number = definedExternally
    open var layerMask: Number = definedExternally
    open var fogEnabled: Boolean = definedExternally
    open var isPickable: Boolean = definedExternally
    open var cellWidth: Number = definedExternally
    open var cellHeight: Number = definedExternally
    open var onDisposeObservable: Observable<SpriteManager> = definedExternally
    open var _onDisposeObserver: Any = definedExternally
    open var onDispose: () -> Unit = definedExternally
    open var _capacity: Any = definedExternally
    open var _spriteTexture: Any = definedExternally
    open var _epsilon: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _vertexData: Any = definedExternally
    open var _buffer: Any = definedExternally
    open var _vertexBuffers: Any = definedExternally
    open var _indexBuffer: Any = definedExternally
    open var _effectBase: Any = definedExternally
    open var _effectFog: Any = definedExternally
    open var texture: Texture = definedExternally
    open fun _appendSpriteVertex(index: Any, sprite: Any, offsetX: Any, offsetY: Any, rowSize: Any): Unit = definedExternally
    open fun intersects(ray: Ray, camera: Camera, predicate: ((sprite: Sprite) -> Boolean)? = definedExternally /* null */, fastCheck: Boolean? = definedExternally /* null */): PickingInfo = definedExternally
    open fun render(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
external interface IAssetTask {
    var onSuccess: (task: IAssetTask) -> Unit
    var onError: (task: IAssetTask) -> Unit
    var isCompleted: Boolean
    fun run(scene: Scene, onSuccess: () -> Unit, onError: () -> Unit): Any
}
external open class MeshAssetTask(name: String, meshesNames: Any, rootUrl: String, sceneFilename: String) : IAssetTask {
    open var name: String = definedExternally
    open var meshesNames: Any = definedExternally
    open var rootUrl: String = definedExternally
    open var sceneFilename: String = definedExternally
    open var loadedMeshes: Array<AbstractMesh> = definedExternally
    open var loadedParticleSystems: Array<ParticleSystem> = definedExternally
    open var loadedSkeletons: Array<Skeleton> = definedExternally
    override var onSuccess: (task: IAssetTask) -> Unit = definedExternally
    override var onError: (task: IAssetTask) -> Unit = definedExternally
    override var isCompleted: Boolean = definedExternally
    override fun run(scene: Scene, onSuccess: () -> Unit, onError: () -> Unit): Unit = definedExternally
}
external open class TextFileAssetTask(name: String, url: String) : IAssetTask {
    open var name: String = definedExternally
    open var url: String = definedExternally
    override var onSuccess: (task: IAssetTask) -> Unit = definedExternally
    override var onError: (task: IAssetTask) -> Unit = definedExternally
    override var isCompleted: Boolean = definedExternally
    open var text: String = definedExternally
    override fun run(scene: Scene, onSuccess: () -> Unit, onError: () -> Unit): Unit = definedExternally
}
external open class BinaryFileAssetTask(name: String, url: String) : IAssetTask {
    open var name: String = definedExternally
    open var url: String = definedExternally
    override var onSuccess: (task: IAssetTask) -> Unit = definedExternally
    override var onError: (task: IAssetTask) -> Unit = definedExternally
    override var isCompleted: Boolean = definedExternally
    open var data: ArrayBuffer = definedExternally
    override fun run(scene: Scene, onSuccess: () -> Unit, onError: () -> Unit): Unit = definedExternally
}
external open class ImageAssetTask(name: String, url: String) : IAssetTask {
    open var name: String = definedExternally
    open var url: String = definedExternally
    override var onSuccess: (task: IAssetTask) -> Unit = definedExternally
    override var onError: (task: IAssetTask) -> Unit = definedExternally
    override var isCompleted: Boolean = definedExternally
    open var image: HTMLImageElement = definedExternally
    override fun run(scene: Scene, onSuccess: () -> Unit, onError: () -> Unit): Unit = definedExternally
}
external interface ITextureAssetTask : IAssetTask {
    override var onSuccess: (task: IAssetTask) -> Unit
    override var onError: (task: IAssetTask) -> Unit
    var texture: Texture
}
external open class TextureAssetTask(name: String, url: String, noMipmap: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */) : ITextureAssetTask {
    open var name: String = definedExternally
    open var url: String = definedExternally
    open var noMipmap: Boolean = definedExternally
    open var invertY: Boolean = definedExternally
    open var samplingMode: Number = definedExternally
    override var onSuccess: (task: IAssetTask) -> Unit = definedExternally
    override var onError: (task: IAssetTask) -> Unit = definedExternally
    override var isCompleted: Boolean = definedExternally
    override var texture: Texture = definedExternally
    override fun run(scene: Scene, onSuccess: () -> Unit, onError: () -> Unit): Unit = definedExternally
}
external open class CubeTextureAssetTask(name: String, url: String, extensions: Array<String>? = definedExternally /* null */, noMipmap: Boolean? = definedExternally /* null */, files: Array<String>? = definedExternally /* null */) : IAssetTask {
    open var name: String = definedExternally
    open var url: String = definedExternally
    open var extensions: Array<String> = definedExternally
    open var noMipmap: Boolean = definedExternally
    open var files: Array<String> = definedExternally
    override var onSuccess: (task: IAssetTask) -> Unit = definedExternally
    override var onError: (task: IAssetTask) -> Unit = definedExternally
    override var isCompleted: Boolean = definedExternally
    open var texture: CubeTexture = definedExternally
    override fun run(scene: Scene, onSuccess: () -> Unit, onError: () -> Unit): Unit = definedExternally
}
external open class HDRCubeTextureAssetTask(name: String, url: String, size: Number? = definedExternally /* null */, noMipmap: Boolean? = definedExternally /* null */, generateHarmonics: Boolean? = definedExternally /* null */, useInGammaSpace: Boolean? = definedExternally /* null */, usePMREMGenerator: Boolean? = definedExternally /* null */) : IAssetTask {
    open var name: String = definedExternally
    open var url: String = definedExternally
    open var size: Number = definedExternally
    open var noMipmap: Boolean = definedExternally
    open var generateHarmonics: Boolean = definedExternally
    open var useInGammaSpace: Boolean = definedExternally
    open var usePMREMGenerator: Boolean = definedExternally
    override var onSuccess: (task: IAssetTask) -> Unit = definedExternally
    override var onError: (task: IAssetTask) -> Unit = definedExternally
    override var isCompleted: Boolean = definedExternally
    open var texture: HDRCubeTexture = definedExternally
    override fun run(scene: Scene, onSuccess: () -> Unit, onError: () -> Unit): Unit = definedExternally
}
external open class AssetsManager(scene: Scene) {
    open var _scene: Any = definedExternally
    open var tasks: Array<IAssetTask> = definedExternally
    open var waitingTasksCount: Number = definedExternally
    open var onFinish: (tasks: Array<IAssetTask>) -> Unit = definedExternally
    open var onTaskSuccess: (task: IAssetTask) -> Unit = definedExternally
    open var onTaskError: (task: IAssetTask) -> Unit = definedExternally
    open var useDefaultLoadingScreen: Boolean = definedExternally
    open fun addMeshTask(taskName: String, meshesNames: Any, rootUrl: String, sceneFilename: String): IAssetTask = definedExternally
    open fun addTextFileTask(taskName: String, url: String): IAssetTask = definedExternally
    open fun addBinaryFileTask(taskName: String, url: String): IAssetTask = definedExternally
    open fun addImageTask(taskName: String, url: String): IAssetTask = definedExternally
    open fun addTextureTask(taskName: String, url: String, noMipmap: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */): ITextureAssetTask = definedExternally
    open fun addCubeTextureTask(name: String, url: String, extensions: Array<String>? = definedExternally /* null */, noMipmap: Boolean? = definedExternally /* null */, files: Array<String>? = definedExternally /* null */): IAssetTask = definedExternally
    open fun addHDRCubeTextureTask(name: String, url: String, size: Number? = definedExternally /* null */, noMipmap: Boolean? = definedExternally /* null */, generateHarmonics: Boolean? = definedExternally /* null */, useInGammaSpace: Boolean? = definedExternally /* null */, usePMREMGenerator: Boolean? = definedExternally /* null */): IAssetTask = definedExternally
    open fun _decreaseWaitingTasksCount(): Unit = definedExternally
    open fun _runTask(task: Any): Unit = definedExternally
    open fun reset(): AssetsManager = definedExternally
    open fun load(): AssetsManager = definedExternally
}
external open class Database(urlToScene: String, callbackManifestChecked: (checked: Boolean) -> Any) {
    open var callbackManifestChecked: Any = definedExternally
    open var currentSceneUrl: Any = definedExternally
    open var db: Any = definedExternally
    open var enableSceneOffline: Any = definedExternally
    open var enableTexturesOffline: Any = definedExternally
    open var manifestVersionFound: Any = definedExternally
    open var mustUpdateRessources: Any = definedExternally
    open var hasReachedQuota: Any = definedExternally
    open var isSupported: Any = definedExternally
    open var idbFactory: Any = definedExternally
    open fun checkManifestFile(): Unit = definedExternally
    open fun openAsync(successCallback: Any, errorCallback: Any): Unit = definedExternally
    open fun loadImageFromDB(url: String, image: HTMLImageElement): Unit = definedExternally
    open fun _loadImageFromDBAsync(url: Any, image: Any, notInDBCallback: Any): Unit = definedExternally
    open fun _saveImageIntoDBAsync(url: Any, image: Any): Unit = definedExternally
    open fun _checkVersionFromDB(url: Any, versionLoaded: Any): Unit = definedExternally
    open fun _loadVersionFromDBAsync(url: Any, callback: Any, updateInDBCallback: Any): Unit = definedExternally
    open fun _saveVersionIntoDBAsync(url: Any, callback: Any): Unit = definedExternally
    open fun loadFileFromDB(url: Any, sceneLoaded: Any, progressCallBack: Any, errorCallback: Any, useArrayBuffer: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _loadFileFromDBAsync(url: Any, callback: Any, notInDBCallback: Any, useArrayBuffer: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _saveFileIntoDBAsync(url: Any, callback: Any, progressCallback: Any, useArrayBuffer: Any? = definedExternally /* null */): Unit = definedExternally
    companion object {
        var IsUASupportingBlobStorage: Boolean = definedExternally
        var IDBStorageEnabled: Boolean = definedExternally
        var parseURL: (url: String) -> String = definedExternally
        var ReturnFullUrlLocation: (url: String) -> String = definedExternally
    }
}
external fun expandToProperty(callback: String, targetKey: String? = definedExternally /* null */): (target: Any, propertyKey: String) -> Unit = definedExternally
external fun serialize(sourceName: String? = definedExternally /* null */): (target: Any, propertyKey: Any) -> Unit = definedExternally
external fun serializeAsTexture(sourceName: String? = definedExternally /* null */): (target: Any, propertyKey: Any) -> Unit = definedExternally
external fun serializeAsColor3(sourceName: String? = definedExternally /* null */): (target: Any, propertyKey: Any) -> Unit = definedExternally
external fun serializeAsFresnelParameters(sourceName: String? = definedExternally /* null */): (target: Any, propertyKey: Any) -> Unit = definedExternally
external fun serializeAsVector2(sourceName: String? = definedExternally /* null */): (target: Any, propertyKey: Any) -> Unit = definedExternally
external fun serializeAsVector3(sourceName: String? = definedExternally /* null */): (target: Any, propertyKey: Any) -> Unit = definedExternally
external fun serializeAsMeshReference(sourceName: String? = definedExternally /* null */): (target: Any, propertyKey: Any) -> Unit = definedExternally
external fun serializeAsColorCurves(sourceName: String? = definedExternally /* null */): (target: Any, propertyKey: Any) -> Unit = definedExternally
external fun serializeAsColor4(sourceName: String? = definedExternally /* null */): (target: Any, propertyKey: Any) -> Unit = definedExternally
external fun serializeAsImageProcessingConfiguration(sourceName: String? = definedExternally /* null */): (target: Any, propertyKey: Any) -> Unit = definedExternally
external open class SerializationHelper {
    companion object {
        fun <T> Serialize(entity: T, serializationObject: Any? = definedExternally /* null */): Any = definedExternally
        fun <T> Parse(creationFunction: () -> T, source: Any, scene: Scene, rootUrl: String? = definedExternally /* null */): T = definedExternally
        fun <T> Clone(creationFunction: () -> T, source: T): T = definedExternally
    }
}
external open class DynamicFloatArrayElementInfo {
    open var offset: Number = definedExternally
}
external open class DynamicFloatArray(stride: Number, initialElementCount: Number) {
    open fun allocElement(): DynamicFloatArrayElementInfo = definedExternally
    open fun freeElement(elInfo: DynamicFloatArrayElementInfo): Unit = definedExternally
    open fun pack(): Float32Array = definedExternally
    open fun _moveElement(element: Any, destOffset: Any): Unit = definedExternally
    open fun _growBuffer(): Unit = definedExternally
    open var buffer: Float32Array = definedExternally
    open var totalElementCount: Number = definedExternally
    open var freeElementCount: Number = definedExternally
    open var usedElementCount: Number = definedExternally
    open var stride: Number = definedExternally
    open var compareValueOffset: Number = definedExternally
    open var sortingAscending: Boolean = definedExternally
    open fun sort(): Boolean = definedExternally
    open var _allEntries: Any = definedExternally
    open var _freeEntries: Any = definedExternally
    open var _stride: Any = definedExternally
    open var _lastUsed: Any = definedExternally
    open var _firstFree: Any = definedExternally
    open var _sortTable: Any = definedExternally
    open var _sortedTable: Any = definedExternally
}
external enum class PoseEnabledControllerType {
    VIVE /* = 0 */,
    OCULUS /* = 1 */,
    GENERIC /* = 2 */
}
external interface MutableGamepadButton {
    var value: Number
    var touched: Boolean
    var pressed: Boolean
}
external open class PoseEnabledControllerHelper {
    companion object {
        fun InitiateController(vrGamepad: Any): dynamic /* OculusTouchController | ViveController */ = definedExternally
    }
}
external open class PoseEnabledController(vrGamepad: Any) : Gamepad, PoseControlled {
    open var vrGamepad: Any = definedExternally
    override var devicePosition: Vector3? = definedExternally
    override var deviceRotationQuaternion: Quaternion = definedExternally
    override var deviceScaleFactor: Number = definedExternally
    override var position: Vector3 = definedExternally
    override var rotationQuaternion: Quaternion = definedExternally
    open var controllerType: PoseEnabledControllerType = definedExternally
    open var _calculatedPosition: Any = definedExternally
    open var _calculatedRotation: Any = definedExternally
    override var rawPose: DevicePose = definedExternally
    open var _mesh: AbstractMesh = definedExternally
    open var _poseControlledCamera: Any = definedExternally
    open var _leftHandSystemQuaternion: Any = definedExternally
    override fun update(): Unit = definedExternally
    override fun updateFromDevice(poseData: DevicePose): Unit = definedExternally
    open fun attachToMesh(mesh: AbstractMesh): Unit = definedExternally
    open fun attachToPoseControlledCamera(camera: TargetCamera): Unit = definedExternally
    open fun detachMesh(): Unit = definedExternally
    open var mesh: AbstractMesh = definedExternally
    open fun getForwardRay(length: Number? = definedExternally /* null */): Ray = definedExternally
}
external interface GamepadButtonChanges {
    var changed: Boolean
    var pressChanged: Boolean
    var touchChanged: Boolean
    var valueChanged: Boolean
}
external open class WebVRController(vrGamepad: Any) : PoseEnabledController {
    open var onTriggerStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    open var onMainButtonStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    open var onSecondaryButtonStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    open var onPadStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    open var onPadValuesChangedObservable: Observable<StickValues> = definedExternally
    open var _buttons: Array<MutableGamepadButton> = definedExternally
    open var _onButtonStateChange: Any = definedExternally
    open fun onButtonStateChange(callback: (controlledIndex: Number, buttonIndex: Number, state: ExtendedGamepadButton) -> Unit): Unit = definedExternally
    open var pad: StickValues = definedExternally
    open var hand: String = definedExternally
    override fun update(): Unit = definedExternally
    open fun handleButtonChange(buttonIdx: Number, value: ExtendedGamepadButton, changes: GamepadButtonChanges): Any = definedExternally
    open fun initControllerMesh(scene: Scene, meshLoaded: ((mesh: AbstractMesh) -> Unit)? = definedExternally /* null */): Any = definedExternally
    open fun _setButtonValue(newState: Any, currentState: Any, buttonIndex: Any): Unit = definedExternally
    open var _changes: Any = definedExternally
    open fun _checkChanges(newState: Any, currentState: Any): Unit = definedExternally
}
external open class OculusTouchController(vrGamepad: Any) : WebVRController {
    open var _defaultModel: Any = definedExternally
    open var onSecondaryTriggerStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    open var onThumbRestChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    override fun initControllerMesh(scene: Scene, meshLoaded: ((mesh: AbstractMesh) -> Unit)?): Unit = definedExternally
    open var onAButtonStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    open var onBButtonStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    open var onXButtonStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    open var onYButtonStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    override fun handleButtonChange(buttonIdx: Number, state: ExtendedGamepadButton, changes: GamepadButtonChanges): Unit = definedExternally
}
external open class ViveController(vrGamepad: Any) : WebVRController {
    open var _defaultModel: Any = definedExternally
    override fun initControllerMesh(scene: Scene, meshLoaded: ((mesh: AbstractMesh) -> Unit)?): Unit = definedExternally
    open var onLeftButtonStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    open var onRightButtonStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    open var onMenuButtonStateChangedObservable: Observable<ExtendedGamepadButton> = definedExternally
    override fun handleButtonChange(buttonIdx: Number, state: ExtendedGamepadButton, changes: GamepadButtonChanges): Unit = definedExternally
}
external open class FilesInput(p_engine: Engine, p_scene: Scene, p_canvas: HTMLCanvasElement, p_sceneLoadedCallback: Any, p_progressCallback: Any, p_additionnalRenderLoopLogicCallback: Any, p_textureLoadingCallback: Any, p_startingProcessingFilesCallback: Any) {
    open var _engine: Any = definedExternally
    open var _currentScene: Any = definedExternally
    open var _canvas: Any = definedExternally
    open var _sceneLoadedCallback: Any = definedExternally
    open var _progressCallback: Any = definedExternally
    open var _additionnalRenderLoopLogicCallback: Any = definedExternally
    open var _textureLoadingCallback: Any = definedExternally
    open var _startingProcessingFilesCallback: Any = definedExternally
    open var _elementToMonitor: Any = definedExternally
    open var _sceneFileToLoad: Any = definedExternally
    open var _filesToLoad: Any = definedExternally
    open fun monitorElementForDragNDrop(p_elementToMonitor: HTMLElement): Unit = definedExternally
    open fun renderFunction(): Unit = definedExternally
    open fun drag(e: Any): Unit = definedExternally
    open fun drop(eventDrop: Any): Unit = definedExternally
    open fun loadFiles(event: Any): Unit = definedExternally
    open fun reload(): Unit = definedExternally
    companion object {
        var FilesToLoad: Array<File> = definedExternally
    }
}
external open class Gamepads<T : Gamepad>(ongamedpadconnected: (gamepad: T) -> Unit, ongamedpaddisconnected: ((gamepad: T) -> Unit)? = definedExternally /* null */) {
    open var babylonGamepads: Any = definedExternally
    open var oneGamepadConnected: Any = definedExternally
    open var isMonitoring: Any = definedExternally
    open var gamepadEventSupported: Any = definedExternally
    open var gamepadSupport: Any = definedExternally
    open var _callbackGamepadConnected: Any = definedExternally
    open var _callbackGamepadDisconnected: Any = definedExternally
    open var _onGamepadConnectedEvent: Any = definedExternally
    open var _onGamepadDisonnectedEvent: Any = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun _onGamepadConnected(gamepad: Any): Unit = definedExternally
    open fun _addNewGamepad(gamepad: Any): Unit = definedExternally
    open fun _onGamepadDisconnected(gamepad: Any): Unit = definedExternally
    open fun _startMonitoringGamepads(): Unit = definedExternally
    open fun _stopMonitoringGamepads(): Unit = definedExternally
    open fun _checkGamepadsStatus(): Unit = definedExternally
    open fun _updateGamepadObjects(): Unit = definedExternally
}
external open class StickValues(x: Any, y: Any) {
    open var x: Any = definedExternally
    open var y: Any = definedExternally
}
external open class Gamepad(id: String, index: Number, browserGamepad: Any, leftStickX: Number? = definedExternally /* null */, leftStickY: Number? = definedExternally /* null */, rightStickX: Number? = definedExternally /* null */, rightStickY: Number? = definedExternally /* null */) {
    open var id: String = definedExternally
    open var index: Number = definedExternally
    open var browserGamepad: Any = definedExternally
    open var type: Number = definedExternally
    open var _leftStick: Any = definedExternally
    open var _rightStick: Any = definedExternally
    open var _leftStickAxisX: Any = definedExternally
    open var _leftStickAxisY: Any = definedExternally
    open var _rightStickAxisX: Any = definedExternally
    open var _rightStickAxisY: Any = definedExternally
    open var _onleftstickchanged: Any = definedExternally
    open var _onrightstickchanged: Any = definedExternally
    open fun onleftstickchanged(callback: (values: StickValues) -> Unit): Unit = definedExternally
    open fun onrightstickchanged(callback: (values: StickValues) -> Unit): Unit = definedExternally
    open var leftStick: StickValues = definedExternally
    open var rightStick: StickValues = definedExternally
    open fun update(): Unit = definedExternally
    companion object {
        var GAMEPAD: Number = definedExternally
        var GENERIC: Number = definedExternally
        var XBOX: Number = definedExternally
        var POSE_ENABLED: Number = definedExternally
    }
}
external open class GenericPad(id: String, index: Number, browserGamepad: Any) : Gamepad {
    open var _buttons: Any = definedExternally
    open var _onbuttondown: Any = definedExternally
    open var _onbuttonup: Any = definedExternally
    open fun onbuttondown(callback: (buttonPressed: Number) -> Unit): Unit = definedExternally
    open fun onbuttonup(callback: (buttonReleased: Number) -> Unit): Unit = definedExternally
    open fun _setButtonValue(newValue: Any, currentValue: Any, buttonIndex: Any): Unit = definedExternally
    override fun update(): Unit = definedExternally
}
external enum class Xbox360Button {
    A /* = 0 */,
    B /* = 1 */,
    X /* = 2 */,
    Y /* = 3 */,
    Start /* = 4 */,
    Back /* = 5 */,
    LB /* = 6 */,
    RB /* = 7 */,
    LeftStick /* = 8 */,
    RightStick /* = 9 */
}
external enum class Xbox360Dpad {
    Up /* = 0 */,
    Down /* = 1 */,
    Left /* = 2 */,
    Right /* = 3 */
}
external open class Xbox360Pad(id: String, index: Number, gamepad: Any, xboxOne: Boolean? = definedExternally /* null */) : Gamepad {
    open var _leftTrigger: Any = definedExternally
    open var _rightTrigger: Any = definedExternally
    open var _onlefttriggerchanged: Any = definedExternally
    open var _onrighttriggerchanged: Any = definedExternally
    open var _onbuttondown: Any = definedExternally
    open var _onbuttonup: Any = definedExternally
    open var _ondpaddown: Any = definedExternally
    open var _ondpadup: Any = definedExternally
    open var _buttonA: Any = definedExternally
    open var _buttonB: Any = definedExternally
    open var _buttonX: Any = definedExternally
    open var _buttonY: Any = definedExternally
    open var _buttonBack: Any = definedExternally
    open var _buttonStart: Any = definedExternally
    open var _buttonLB: Any = definedExternally
    open var _buttonRB: Any = definedExternally
    open var _buttonLeftStick: Any = definedExternally
    open var _buttonRightStick: Any = definedExternally
    open var _dPadUp: Any = definedExternally
    open var _dPadDown: Any = definedExternally
    open var _dPadLeft: Any = definedExternally
    open var _dPadRight: Any = definedExternally
    open var _isXboxOnePad: Any = definedExternally
    open fun onlefttriggerchanged(callback: (value: Number) -> Unit): Unit = definedExternally
    open fun onrighttriggerchanged(callback: (value: Number) -> Unit): Unit = definedExternally
    open var leftTrigger: Number = definedExternally
    open var rightTrigger: Number = definedExternally
    open fun onbuttondown(callback: (buttonPressed: Xbox360Button) -> Unit): Unit = definedExternally
    open fun onbuttonup(callback: (buttonReleased: Xbox360Button) -> Unit): Unit = definedExternally
    open fun ondpaddown(callback: (dPadPressed: Xbox360Dpad) -> Unit): Unit = definedExternally
    open fun ondpadup(callback: (dPadReleased: Xbox360Dpad) -> Unit): Unit = definedExternally
    open fun _setButtonValue(newValue: Any, currentValue: Any, buttonType: Any): Unit = definedExternally
    open fun _setDPadValue(newValue: Any, currentValue: Any, buttonType: Any): Unit = definedExternally
    open var buttonA: Number = definedExternally
    open var buttonB: Number = definedExternally
    open var buttonX: Number = definedExternally
    open var buttonY: Number = definedExternally
    open var buttonStart: Number = definedExternally
    open var buttonBack: Number = definedExternally
    open var buttonLB: Number = definedExternally
    open var buttonRB: Number = definedExternally
    open var buttonLeftStick: Number = definedExternally
    open var buttonRightStick: Number = definedExternally
    open var dPadUp: Number = definedExternally
    open var dPadDown: Number = definedExternally
    open var dPadLeft: Number = definedExternally
    open var dPadRight: Number = definedExternally
    override fun update(): Unit = definedExternally
}
external open class EventState(mask: Number, skipNextObservers: Boolean? = definedExternally /* null */) {
    open fun initalize(mask: Number, skipNextObservers: Boolean? = definedExternally /* null */): EventState = definedExternally
    open var skipNextObservers: Boolean = definedExternally
    open var mask: Number = definedExternally
}
external open class Observer<T>(callback: (eventData: T, eventState: EventState) -> Unit, mask: Number) {
    open var callback: (eventData: T, eventState: EventState) -> Unit = definedExternally
    open var mask: Number = definedExternally
}
external open class Observable<T> {
    open var _observers: Array<Observer<T>> = definedExternally
    open var _eventState: Any = definedExternally
    open fun add(callback: (eventData: T, eventState: EventState) -> Unit, mask: Number? = definedExternally /* null */, insertFirst: Boolean? = definedExternally /* null */): Observer<T> = definedExternally
    open fun remove(observer: Observer<T>): Boolean = definedExternally
    open fun removeCallback(callback: (eventData: T, eventState: EventState) -> Unit): Boolean = definedExternally
    open fun notifyObservers(eventData: T, mask: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun hasObservers(): Boolean = definedExternally
    open fun clear(): Unit = definedExternally
    open fun clone(): Observable<T> = definedExternally
    open fun hasSpecificMask(mask: Number? = definedExternally /* null */): Boolean = definedExternally
}
external open class PackedRect(root: RectPackingMap, parent: PackedRect, pos: Vector2, size: Size) {
    open var pos: Vector2 = definedExternally
    open var contentSize: Size = definedExternally
    open fun getInnerPosToRef(res: Vector2): Unit = definedExternally
    open fun getInnerSizeToRef(res: Size): Unit = definedExternally
    open var UVs: Array<Vector2> = definedExternally
    open fun getUVsForCustomSize(customSize: Size): Array<Vector2> = definedExternally
    open fun freeContent(): Unit = definedExternally
    open var isUsed: Boolean = definedExternally
    open fun findAndSplitNode(contentSize: Size): PackedRect = definedExternally
    open fun findNode(size: Any): Unit = definedExternally
    open fun splitNode(contentSize: Any): Unit = definedExternally
    open fun attemptDefrag(): Unit = definedExternally
    open fun clearNode(): Unit = definedExternally
    open var isRecursiveFree: Any = definedExternally
    open fun evalFreeSize(size: Number): Number = definedExternally
    open var _root: RectPackingMap = definedExternally
    open var _parent: PackedRect = definedExternally
    open var _contentSize: Any = definedExternally
    open var _initialSize: Any = definedExternally
    open var _leftNode: Any = definedExternally
    open var _rightNode: Any = definedExternally
    open var _bottomNode: Any = definedExternally
    open var _pos: Any = definedExternally
    open var _size: Size = definedExternally
    companion object {
        var TpsSize: Any = definedExternally
    }
}
external open class RectPackingMap(size: Size, margin: Number? = definedExternally /* null */) : PackedRect {
    open fun addRect(size: Size): PackedRect = definedExternally
    open var freeSpace: Number = definedExternally
    open var _margin: Number = definedExternally
}
external open class SceneOptimization(priority: Number? = definedExternally /* null */) {
    open var priority: Number = definedExternally
    open var apply: (scene: Scene) -> Boolean = definedExternally
}
external open class TextureOptimization(priority: Number? = definedExternally /* null */, maximumSize: Number? = definedExternally /* null */) : SceneOptimization {
    override var priority: Number = definedExternally
    open var maximumSize: Number = definedExternally
    override var apply: (scene: Scene) -> Boolean = definedExternally
}
external open class HardwareScalingOptimization(priority: Number? = definedExternally /* null */, maximumScale: Number? = definedExternally /* null */) : SceneOptimization {
    override var priority: Number = definedExternally
    open var maximumScale: Number = definedExternally
    open var _currentScale: Any = definedExternally
    override var apply: (scene: Scene) -> Boolean = definedExternally
}
external open class ShadowsOptimization : SceneOptimization {
    override var apply: (scene: Scene) -> Boolean = definedExternally
}
external open class PostProcessesOptimization : SceneOptimization {
    override var apply: (scene: Scene) -> Boolean = definedExternally
}
external open class LensFlaresOptimization : SceneOptimization {
    override var apply: (scene: Scene) -> Boolean = definedExternally
}
external open class ParticlesOptimization : SceneOptimization {
    override var apply: (scene: Scene) -> Boolean = definedExternally
}
external open class RenderTargetsOptimization : SceneOptimization {
    override var apply: (scene: Scene) -> Boolean = definedExternally
}
external open class MergeMeshesOptimization : SceneOptimization {
    open var _canBeMerged: Any = definedExternally
    override var apply: (scene: Scene) -> Boolean = definedExternally
    companion object {
        var _UpdateSelectionTree: Boolean = definedExternally
        var UpdateSelectionTree: Boolean = definedExternally
    }
}
external open class SceneOptimizerOptions(targetFrameRate: Number? = definedExternally /* null */, trackerDuration: Number? = definedExternally /* null */) {
    open var targetFrameRate: Number = definedExternally
    open var trackerDuration: Number = definedExternally
    open var optimizations: Array<SceneOptimization> = definedExternally
    companion object {
        fun LowDegradationAllowed(targetFrameRate: Number? = definedExternally /* null */): SceneOptimizerOptions = definedExternally
        fun ModerateDegradationAllowed(targetFrameRate: Number? = definedExternally /* null */): SceneOptimizerOptions = definedExternally
        fun HighDegradationAllowed(targetFrameRate: Number? = definedExternally /* null */): SceneOptimizerOptions = definedExternally
    }
}
external open class SceneOptimizer {
    companion object {
        fun _CheckCurrentState(scene: Scene, options: SceneOptimizerOptions, currentPriorityLevel: Number, onSuccess: (() -> Unit)? = definedExternally /* null */, onFailure: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
        fun OptimizeAsync(scene: Scene, options: SceneOptimizerOptions? = definedExternally /* null */, onSuccess: (() -> Unit)? = definedExternally /* null */, onFailure: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
    }
}
external open class SceneSerializer {
    companion object {
        fun ClearCache(): Unit = definedExternally
        fun Serialize(scene: Scene): Any = definedExternally
        fun SerializeMesh(toSerialize: Any, withParents: Boolean? = definedExternally /* null */, withChildren: Boolean? = definedExternally /* null */): Any = definedExternally
    }
}
external open class SmartArray<T>(capacity: Number) {
    open var data: Array<T> = definedExternally
    open var length: Number = definedExternally
    open var _id: Any = definedExternally
    open var _duplicateId: Any = definedExternally
    open fun push(value: Any): Unit = definedExternally
    open fun forEach(func: (content: T) -> Unit): Unit = definedExternally
    open fun pushNoDuplicate(value: Any): Boolean = definedExternally
    open fun sort(compareFn: Any): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun concat(array: Any): Unit = definedExternally
    open fun concatWithNoDuplicate(array: Any): Unit = definedExternally
    open fun indexOf(value: T): Number = definedExternally
    open fun contains(value: T): Boolean = definedExternally
    companion object {
        var _GlobalId: Any = definedExternally
    }
}
external open class StringDictionary<T> {
    open fun copyFrom(source: StringDictionary<T>): Unit = definedExternally
    open fun get(key: String): T = definedExternally
    open fun getOrAddWithFactory(key: String, factory: (key: String) -> T): T = definedExternally
    open fun getOrAdd(key: String, `val`: T): T = definedExternally
    open fun contains(key: Any): Boolean = definedExternally
    open fun add(key: String, value: T): Boolean = definedExternally
    open fun set(key: String, value: T): Boolean = definedExternally
    open fun getAndRemove(key: String): T = definedExternally
    open fun remove(key: String): Boolean = definedExternally
    open fun clear(): Unit = definedExternally
    open var count: Number = definedExternally
    open fun forEach(callback: (key: String, value: T) -> Unit): Unit = definedExternally
    open fun <TRes> first(callback: (key: String, value: T) -> TRes): TRes = definedExternally
    open var _count: Any = definedExternally
    open var _data: Any = definedExternally
}
external open class Tags {
    companion object {
        fun EnableFor(obj: Any): Unit = definedExternally
        fun DisableFor(obj: Any): Unit = definedExternally
        fun HasTags(obj: Any): Boolean = definedExternally
        fun GetTags(obj: Any, asString: Boolean? = definedExternally /* null */): Any = definedExternally
        fun AddTagsTo(obj: Any, tagsString: String): Unit = definedExternally
        fun _AddTagTo(obj: Any, tag: String): Unit = definedExternally
        fun RemoveTagsFrom(obj: Any, tagsString: String): Unit = definedExternally
        fun _RemoveTagFrom(obj: Any, tag: String): Unit = definedExternally
        fun MatchesQuery(obj: Any, tagsQuery: String): Boolean = definedExternally
    }
}
external open class TextureTools {
    companion object {
        fun CreateResizedCopy(texture: BABYLON.Texture, width: Number, height: Number, useBilinearMode: Boolean? = definedExternally /* null */): BABYLON.Texture = definedExternally
        fun GetEnvironmentBRDFTexture(scene: Scene): BaseTexture = definedExternally
        var _environmentBRDFBase64Texture: Any = definedExternally
    }
}
external interface IAnimatable {
    var animations: Array<Animation>
}
external interface `T$82` {
    var minimum: Vector3
    var maximum: Vector3
}
external interface `T$83` {
    var minimum: Vector3
    var maximum: Vector3
}
external interface `T$84` {
    var minimum: Vector2
    var maximum: Vector2
}
external interface `T$85` {
    var name: String
    var handler: EventListener
}
external interface `T$86` {
    var name: String
    var handler: EventListener
}
external open class Tools {
    companion object {
        var BaseUrl: String = definedExternally
        var CorsBehavior: Any = definedExternally
        var UseFallbackTexture: Boolean = definedExternally
        var fallbackTexture: Any = definedExternally
        fun Mix(a: Number, b: Number, alpha: Number): Number = definedExternally
        fun Instantiate(className: String): Any = definedExternally
        fun SetImmediate(action: () -> Unit): Unit = definedExternally
        fun IsExponentOfTwo(value: Number): Boolean = definedExternally
        fun CeilingPOT(x: Number): Number = definedExternally
        fun FloorPOT(x: Number): Number = definedExternally
        fun NearestPOT(x: Number): Number = definedExternally
        fun GetExponentOfTwo(value: Number, max: Number, mode: Number? = definedExternally /* null */): Number = definedExternally
        fun GetFilename(path: String): String = definedExternally
        fun GetDOMTextContent(element: HTMLElement): String = definedExternally
        fun ToDegrees(angle: Number): Number = definedExternally
        fun ToRadians(angle: Number): Number = definedExternally
        fun EncodeArrayBufferTobase64(buffer: ArrayBuffer): String = definedExternally
        fun ExtractMinAndMaxIndexed(positions: Array<Number>, indices: Array<Number>, indexStart: Number, indexCount: Number, bias: Vector2? = definedExternally /* null */): `T$82` = definedExternally
        fun ExtractMinAndMaxIndexed(positions: Float32Array, indices: Array<Number>, indexStart: Number, indexCount: Number, bias: Vector2? = definedExternally /* null */): `T$82` = definedExternally
        fun ExtractMinAndMax(positions: Array<Number>, start: Number, count: Number, bias: Vector2? = definedExternally /* null */, stride: Number? = definedExternally /* null */): `T$83` = definedExternally
        fun ExtractMinAndMax(positions: Float32Array, start: Number, count: Number, bias: Vector2? = definedExternally /* null */, stride: Number? = definedExternally /* null */): `T$83` = definedExternally
        fun Vector2ArrayFeeder(array: Array<Vector2>): (i: Number) -> Vector2 = definedExternally
        fun Vector2ArrayFeeder(array: Float32Array): (i: Number) -> Vector2 = definedExternally
        fun ExtractMinAndMaxVector2(feeder: (index: Number) -> Vector2, bias: Vector2? = definedExternally /* null */): `T$84` = definedExternally
        fun MakeArray(obj: Any, allowsNullUndefined: Boolean? = definedExternally /* null */): Array<Any> = definedExternally
        fun GetPointerPrefix(): String = definedExternally
        fun QueueNewFrame(func: Any, requester: Any? = definedExternally /* null */): Unit = definedExternally
        fun RequestFullscreen(element: Any): Unit = definedExternally
        fun ExitFullscreen(): Unit = definedExternally
        fun SetCorsBehavior(url: String, img: HTMLImageElement): Unit = definedExternally
        fun CleanUrl(url: String): String = definedExternally
        fun LoadImage(url: Any, onload: Any, onerror: Any, database: Any): HTMLImageElement = definedExternally
        fun LoadFile(url: String, callback: (data: Any) -> Unit, progressCallBack: ((data: Any) -> Unit)? = definedExternally /* null */, database: Any? = definedExternally /* null */, useArrayBuffer: Boolean? = definedExternally /* null */, onError: ((request: XMLHttpRequest) -> Unit)? = definedExternally /* null */): Unit = definedExternally
        fun LoadScript(scriptUrl: String, onSuccess: () -> Unit, onError: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
        fun ReadFileAsDataURL(fileToLoad: Any, callback: Any, progressCallback: Any): Unit = definedExternally
        fun ReadFile(fileToLoad: Any, callback: Any, progressCallBack: Any, useArrayBuffer: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun FileAsURL(content: String): String = definedExternally
        fun Format(value: Number, decimals: Number? = definedExternally /* null */): String = definedExternally
        fun CheckExtends(v: Vector3, min: Vector3, max: Vector3): Unit = definedExternally
        fun DeepCopy(source: Any, destination: Any, doNotCopyList: Array<String>? = definedExternally /* null */, mustCopyList: Array<String>? = definedExternally /* null */): Unit = definedExternally
        fun IsEmpty(obj: Any): Boolean = definedExternally
        fun RegisterTopRootEvents(events: Array<`T$85`>): Unit = definedExternally
        fun UnregisterTopRootEvents(events: Array<`T$86`>): Unit = definedExternally
        fun DumpFramebuffer(width: Number, height: Number, engine: Engine, successCallback: ((data: String) -> Unit)? = definedExternally /* null */, mimeType: String? = definedExternally /* null */): Unit = definedExternally
        fun EncodeScreenshotCanvasData(successCallback: ((data: String) -> Unit)? = definedExternally /* null */, mimeType: String? = definedExternally /* null */): Unit = definedExternally
        fun CreateScreenshot(engine: Engine, camera: Camera, size: Any, successCallback: ((data: String) -> Unit)? = definedExternally /* null */, mimeType: String? = definedExternally /* null */): Unit = definedExternally
        fun CreateScreenshotUsingRenderTarget(engine: Engine, camera: Camera, size: Any, successCallback: ((data: String) -> Unit)? = definedExternally /* null */, mimeType: String? = definedExternally /* null */, samples: Number? = definedExternally /* null */): Unit = definedExternally
        fun ValidateXHRData(xhr: XMLHttpRequest, dataType: Number? = definedExternally /* null */): Boolean = definedExternally
        fun RandomId(): String = definedExternally
        var _NoneLogLevel: Any = definedExternally
        var _MessageLogLevel: Any = definedExternally
        var _WarningLogLevel: Any = definedExternally
        var _ErrorLogLevel: Any = definedExternally
        var _LogCache: Any = definedExternally
        var errorsCount: Number = definedExternally
        var OnNewCacheEntry: (entry: String) -> Unit = definedExternally
        var NoneLogLevel: Number = definedExternally
        var MessageLogLevel: Number = definedExternally
        var WarningLogLevel: Number = definedExternally
        var ErrorLogLevel: Number = definedExternally
        var AllLogLevel: Number = definedExternally
        fun _AddLogEntry(entry: Any): Unit = definedExternally
        fun _FormatMessage(message: Any): Unit = definedExternally
        fun _LogDisabled(message: Any): Unit = definedExternally
        fun _LogEnabled(message: Any): Unit = definedExternally
        fun _WarnDisabled(message: Any): Unit = definedExternally
        fun _WarnEnabled(message: Any): Unit = definedExternally
        fun _ErrorDisabled(message: Any): Unit = definedExternally
        fun _ErrorEnabled(message: Any): Unit = definedExternally
        var Log: (message: String) -> Unit = definedExternally
        var Warn: (message: String) -> Unit = definedExternally
        var Error: (message: String) -> Unit = definedExternally
        var LogCache: String = definedExternally
        fun ClearLogCache(): Unit = definedExternally
        var LogLevels: Number = definedExternally
        var _PerformanceNoneLogLevel: Any = definedExternally
        var _PerformanceUserMarkLogLevel: Any = definedExternally
        var _PerformanceConsoleLogLevel: Any = definedExternally
        var _performance: Any = definedExternally
        var PerformanceNoneLogLevel: Number = definedExternally
        var PerformanceUserMarkLogLevel: Number = definedExternally
        var PerformanceConsoleLogLevel: Number = definedExternally
        var PerformanceLogLevel: Number = definedExternally
        fun _StartPerformanceCounterDisabled(counterName: String, condition: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun _EndPerformanceCounterDisabled(counterName: String, condition: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun _StartUserMark(counterName: String, condition: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun _EndUserMark(counterName: String, condition: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun _StartPerformanceConsole(counterName: String, condition: Boolean? = definedExternally /* null */): Unit = definedExternally
        fun _EndPerformanceConsole(counterName: String, condition: Boolean? = definedExternally /* null */): Unit = definedExternally
        var StartPerformanceCounter: (counterName: String, condition: Boolean? /*= null*/) -> Unit = definedExternally
        var EndPerformanceCounter: (counterName: String, condition: Boolean? /*= null*/) -> Unit = definedExternally
        var Now: Number = definedExternally
        fun getClassName(`object`: Any, isType: Boolean? = definedExternally /* null */): String = definedExternally
        fun <T> first(array: Array<T>, predicate: (item: T) -> Boolean): T = definedExternally
        fun getFullClassName(`object`: Any, isType: Boolean? = definedExternally /* null */): String = definedExternally
        fun arrayOrStringFeeder(array: Any): (i: Number) -> Number = definedExternally
        fun hashCodeFromStream(feeder: (index: Number) -> Number): Number = definedExternally
    }
}
external open class PerfCounter {
    open var min: Number = definedExternally
    open var max: Number = definedExternally
    open var average: Number = definedExternally
    open var lastSecAverage: Number = definedExternally
    open var current: Number = definedExternally
    open var total: Number = definedExternally
    open fun fetchNewFrame(): Unit = definedExternally
    open fun addCount(newCount: Number, fetchResult: Boolean): Unit = definedExternally
    open fun beginMonitoring(): Unit = definedExternally
    open fun endMonitoring(newFrame: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _fetchResult(): Unit = definedExternally
    open var _startMonitoringTime: Any = definedExternally
    open var _min: Any = definedExternally
    open var _max: Any = definedExternally
    open var _average: Any = definedExternally
    open var _current: Any = definedExternally
    open var _totalValueCount: Any = definedExternally
    open var _totalAccumulated: Any = definedExternally
    open var _lastSecAverage: Any = definedExternally
    open var _lastSecAccumulated: Any = definedExternally
    open var _lastSecTime: Any = definedExternally
    open var _lastSecValueCount: Any = definedExternally
    companion object {
        var Enabled: Boolean = definedExternally
    }
}
external fun className(name: String, module: String? = definedExternally /* null */): (target: Any) -> Unit = definedExternally
external open class AsyncLoop(iterations: Number, _fn: (asyncLoop: AsyncLoop) -> Unit, _successCallback: () -> Unit, offset: Number? = definedExternally /* null */) {
    open var iterations: Number = definedExternally
    open var _fn: Any = definedExternally
    open var _successCallback: Any = definedExternally
    open var index: Number = definedExternally
    open var _done: Any = definedExternally
    open fun executeNext(): Unit = definedExternally
    open fun breakLoop(): Unit = definedExternally
    companion object {
        fun Run(iterations: Number, _fn: (asyncLoop: AsyncLoop) -> Unit, _successCallback: () -> Unit, offset: Number? = definedExternally /* null */): AsyncLoop = definedExternally
        fun SyncAsyncForLoop(iterations: Number, syncedIterations: Number, fn: (iteration: Number) -> Unit, callback: () -> Unit, breakFunction: (() -> Boolean)? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): Unit = definedExternally
    }
}
external enum class JoystickAxis {
    X /* = 0 */,
    Y /* = 1 */,
    Z /* = 2 */
}
external open class VirtualJoystick(leftJoystick: Boolean? = definedExternally /* null */) {
    open var reverseLeftRight: Boolean = definedExternally
    open var reverseUpDown: Boolean = definedExternally
    open var deltaPosition: Vector3 = definedExternally
    open var pressed: Boolean = definedExternally
    open var _action: Any = definedExternally
    open var _axisTargetedByLeftAndRight: Any = definedExternally
    open var _axisTargetedByUpAndDown: Any = definedExternally
    open var _joystickSensibility: Any = definedExternally
    open var _inversedSensibility: Any = definedExternally
    open var _rotationSpeed: Any = definedExternally
    open var _inverseRotationSpeed: Any = definedExternally
    open var _rotateOnAxisRelativeToMesh: Any = definedExternally
    open var _joystickPointerID: Any = definedExternally
    open var _joystickColor: Any = definedExternally
    open var _joystickPointerPos: Any = definedExternally
    open var _joystickPreviousPointerPos: Any = definedExternally
    open var _joystickPointerStartPos: Any = definedExternally
    open var _deltaJoystickVector: Any = definedExternally
    open var _leftJoystick: Any = definedExternally
    open var _joystickIndex: Any = definedExternally
    open var _touches: Any = definedExternally
    open var _onPointerDownHandlerRef: Any = definedExternally
    open var _onPointerMoveHandlerRef: Any = definedExternally
    open var _onPointerUpHandlerRef: Any = definedExternally
    open var _onPointerOutHandlerRef: Any = definedExternally
    open var _onResize: Any = definedExternally
    open fun setJoystickSensibility(newJoystickSensibility: Number): Unit = definedExternally
    open fun _onPointerDown(e: Any): Unit = definedExternally
    open fun _onPointerMove(e: Any): Unit = definedExternally
    open fun _onPointerUp(e: Any): Unit = definedExternally
    open fun setJoystickColor(newColor: String): Unit = definedExternally
    open fun setActionOnTouch(action: () -> Any): Unit = definedExternally
    open fun setAxisForLeftRight(axis: JoystickAxis): Unit = definedExternally
    open fun setAxisForUpDown(axis: JoystickAxis): Unit = definedExternally
    open fun _clearCanvas(): Unit = definedExternally
    open fun _drawVirtualJoystick(): Unit = definedExternally
    open fun releaseCanvas(): Unit = definedExternally
    companion object {
        var _globalJoystickIndex: Any = definedExternally
        var vjCanvas: Any = definedExternally
        var vjCanvasContext: Any = definedExternally
        var vjCanvasWidth: Any = definedExternally
        var vjCanvasHeight: Any = definedExternally
        var halfWidth: Any = definedExternally
        var halfHeight: Any = definedExternally
    }
}
external open class ArcRotateCameraGamepadInput : ICameraInput<ArcRotateCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    override var camera: ArcRotateCamera = definedExternally
    open var gamepad: Gamepad = definedExternally
    open var _gamepads: Any = definedExternally
    open var gamepadRotationSensibility: Number = definedExternally
    open var gamepadMoveSensibility: Number = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    open fun checkInputs(): Unit = definedExternally
    open fun _onNewGameConnected(gamepad: Any): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class ArcRotateCameraKeyboardMoveInput : ICameraInput<ArcRotateCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    override var camera: ArcRotateCamera = definedExternally
    open var _keys: Any = definedExternally
    open var _onKeyDown: Any = definedExternally
    open var _onKeyUp: Any = definedExternally
    open var _onLostFocus: Any = definedExternally
    open var keysUp: Array<Number> = definedExternally
    open var keysDown: Array<Number> = definedExternally
    open var keysLeft: Array<Number> = definedExternally
    open var keysRight: Array<Number> = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    open fun checkInputs(): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class ArcRotateCameraMouseWheelInput : ICameraInput<ArcRotateCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    override var camera: ArcRotateCamera = definedExternally
    open var _wheel: Any = definedExternally
    open var _observer: Any = definedExternally
    open var wheelPrecision: Number = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class ArcRotateCameraPointersInput : ICameraInput<ArcRotateCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    override var camera: ArcRotateCamera = definedExternally
    open var buttons: Array<Number> = definedExternally
    open var angularSensibilityX: Number = definedExternally
    open var angularSensibilityY: Number = definedExternally
    open var pinchPrecision: Number = definedExternally
    open var panningSensibility: Number = definedExternally
    open var _isPanClick: Any = definedExternally
    open var pinchInwards: Boolean = definedExternally
    open var _pointerInput: Any = definedExternally
    open var _observer: Any = definedExternally
    open var _onMouseMove: Any = definedExternally
    open var _onGestureStart: Any = definedExternally
    open var _onGesture: Any = definedExternally
    open var _MSGestureHandler: Any = definedExternally
    open var _onLostFocus: Any = definedExternally
    open var _onContextMenu: Any = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class ArcRotateCameraVRDeviceOrientationInput : ICameraInput<ArcRotateCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    override var camera: ArcRotateCamera = definedExternally
    open var alphaCorrection: Number = definedExternally
    open var betaCorrection: Number = definedExternally
    open var gammaCorrection: Number = definedExternally
    open var _alpha: Any = definedExternally
    open var _beta: Any = definedExternally
    open var _gamma: Any = definedExternally
    open var _dirty: Any = definedExternally
    open var _offsetOrientation: Any = definedExternally
    open var _deviceOrientationHandler: Any = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _onOrientationEvent(evt: DeviceOrientationEventInit): Unit = definedExternally
    open fun checkInputs(): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class FreeCameraDeviceOrientationInput : ICameraInput<FreeCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    open var _camera: Any = definedExternally
    open var _screenOrientationAngle: Any = definedExternally
    open var _constantTranform: Any = definedExternally
    open var _screenQuaternion: Any = definedExternally
    open var _alpha: Any = definedExternally
    open var _beta: Any = definedExternally
    open var _gamma: Any = definedExternally
    override var camera: FreeCamera = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open var _orientationChanged: Any = definedExternally
    open var _deviceOrientation: Any = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    open fun checkInputs(): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class FreeCameraGamepadInput : ICameraInput<FreeCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    override var camera: FreeCamera = definedExternally
    open var gamepad: Gamepad = definedExternally
    open var _gamepads: Any = definedExternally
    open var gamepadAngularSensibility: Number = definedExternally
    open var gamepadMoveSensibility: Number = definedExternally
    open var _cameraTransform: Any = definedExternally
    open var _deltaTransform: Any = definedExternally
    open var _vector3: Any = definedExternally
    open var _vector2: Any = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    open fun checkInputs(): Unit = definedExternally
    open fun _onNewGameConnected(gamepad: Any): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class FreeCameraKeyboardMoveInput : ICameraInput<FreeCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    override var camera: FreeCamera = definedExternally
    open var _keys: Any = definedExternally
    open var _onKeyDown: Any = definedExternally
    open var _onKeyUp: Any = definedExternally
    open var keysUp: Array<Number> = definedExternally
    open var keysDown: Array<Number> = definedExternally
    open var keysLeft: Array<Number> = definedExternally
    open var keysRight: Array<Number> = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    open fun checkInputs(): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    open fun _onLostFocus(e: FocusEvent): Unit = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class FreeCameraMouseInput(touchEnabled: Boolean? = definedExternally /* null */) : ICameraInput<FreeCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    open var touchEnabled: Boolean = definedExternally
    override var camera: FreeCamera = definedExternally
    open var buttons: Array<Number> = definedExternally
    open var angularSensibility: Number = definedExternally
    open var _pointerInput: Any = definedExternally
    open var _onMouseMove: Any = definedExternally
    open var _observer: Any = definedExternally
    open var previousPosition: Any = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class FreeCameraTouchInput : ICameraInput<FreeCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    override var camera: FreeCamera = definedExternally
    open var _offsetX: Any = definedExternally
    open var _offsetY: Any = definedExternally
    open var _pointerCount: Any = definedExternally
    open var _pointerPressed: Any = definedExternally
    open var _pointerInput: Any = definedExternally
    open var _observer: Any = definedExternally
    open var _onLostFocus: Any = definedExternally
    open var touchAngularSensibility: Number = definedExternally
    open var touchMoveSensibility: Number = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    open fun checkInputs(): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class FreeCameraVirtualJoystickInput : ICameraInput<FreeCamera> {
    override var attachControl: (element: HTMLElement, noPreventDefault: Boolean?) -> Unit
    override var detachControl: (element: HTMLElement) -> Unit
    override var camera: FreeCamera = definedExternally
    open var _leftjoystick: Any = definedExternally
    open var _rightjoystick: Any = definedExternally
    open fun getLeftJoystick(): VirtualJoystick = definedExternally
    open fun getRightJoystick(): VirtualJoystick = definedExternally
    open fun checkInputs(): Unit = definedExternally
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun detachControl(element: HTMLElement): Unit = definedExternally
    override fun getTypeName(): String = definedExternally
    override fun getSimpleName(): String = definedExternally
}
external open class VRCameraMetrics {
    open var hResolution: Number = definedExternally
    open var vResolution: Number = definedExternally
    open var hScreenSize: Number = definedExternally
    open var vScreenSize: Number = definedExternally
    open var vScreenCenter: Number = definedExternally
    open var eyeToScreenDistance: Number = definedExternally
    open var lensSeparationDistance: Number = definedExternally
    open var interpupillaryDistance: Number = definedExternally
    open var distortionK: Array<Number> = definedExternally
    open var chromaAbCorrection: Array<Number> = definedExternally
    open var postProcessScaleFactor: Number = definedExternally
    open var lensCenterOffset: Number = definedExternally
    open var compensateDistortion: Boolean = definedExternally
    open var aspectRatio: Number = definedExternally
    open var aspectRatioFov: Number = definedExternally
    open var leftHMatrix: Matrix = definedExternally
    open var rightHMatrix: Matrix = definedExternally
    open var leftPreViewMatrix: Matrix = definedExternally
    open var rightPreViewMatrix: Matrix = definedExternally
    companion object {
        fun GetDefault(): VRCameraMetrics = definedExternally
    }
}
external open class VRDeviceOrientationFreeCamera(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean? = definedExternally /* null */, vrCameraMetrics: VRCameraMetrics? = definedExternally /* null */) : DeviceOrientationCamera {
    override fun getClassName(): String = definedExternally
}
external open class VRDeviceOrientationGamepadCamera(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean? = definedExternally /* null */, vrCameraMetrics: VRCameraMetrics? = definedExternally /* null */) : VRDeviceOrientationFreeCamera {
    override fun getClassName(): String = definedExternally
}
external open class VRDeviceOrientationArcRotateCamera(name: String, alpha: Number, beta: Number, radius: Number, target: Vector3, scene: Scene, compensateDistortion: Boolean? = definedExternally /* null */, vrCameraMetrics: VRCameraMetrics? = definedExternally /* null */) : ArcRotateCamera {
    override fun getClassName(): String = definedExternally
}
external interface DevicePose {
    var position: Float32Array? get() = definedExternally; set(value) = definedExternally
    var linearVelocity: Float32Array? get() = definedExternally; set(value) = definedExternally
    var linearAcceleration: Float32Array? get() = definedExternally; set(value) = definedExternally
    var orientation: Float32Array? get() = definedExternally; set(value) = definedExternally
    var angularVelocity: Float32Array? get() = definedExternally; set(value) = definedExternally
    var angularAcceleration: Float32Array? get() = definedExternally; set(value) = definedExternally
}
external interface PoseControlled {
    var position: Vector3
    var rotationQuaternion: Quaternion
    var devicePosition: Vector3? get() = definedExternally; set(value) = definedExternally
    var deviceRotationQuaternion: Quaternion
    var rawPose: DevicePose
    var deviceScaleFactor: Number
    fun updateFromDevice(poseData: DevicePose): Any
}
external interface WebVROptions {
    var trackPosition: Boolean? get() = definedExternally; set(value) = definedExternally
    var positionScale: Number? get() = definedExternally; set(value) = definedExternally
    var displayName: String? get() = definedExternally; set(value) = definedExternally
    var controllerMeshes: Boolean? get() = definedExternally; set(value) = definedExternally
    var defaultLightningOnControllers: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class WebVRFreeCamera(name: String, position: Vector3, scene: Scene, webVROptions: WebVROptions? = definedExternally /* null */) : FreeCamera, PoseControlled {
    open var webVROptions: Any = definedExternally
    open var _vrDevice: Any = definedExternally
    override var rawPose: DevicePose = definedExternally
    open var _vrEnabled: Any = definedExternally
    open var _specsVersion: Any = definedExternally
    open var _attached: Any = definedExternally
    open var _oldSize: Any = definedExternally
    open var _oldHardwareScaleFactor: Any = definedExternally
    open var _frameData: Any = definedExternally
    open var _quaternionCache: Any = definedExternally
    open var _positionOffset: Any = definedExternally
    open var _descendants: Array<Node> = definedExternally
    override var devicePosition: Vector3? = definedExternally
    override var deviceRotationQuaternion: Quaternion = definedExternally
    override var deviceScaleFactor: Number = definedExternally
    open var controllers: Array<WebVRController> = definedExternally
    open var nonVRControllers: Array<Gamepad> = definedExternally
    open var _onControllersAttached: Any = definedExternally
    open var _onNonVRControllerAttached: Any = definedExternally
    open var rigParenting: Boolean = definedExternally
    open var _lightOnControllers: Any = definedExternally
    open var onControllersAttached: (controllers: Array<WebVRController>) -> Unit = definedExternally
    open var onNonVRControllerAttached: (controller: Gamepad) -> Unit = definedExternally
    open fun getControllerByName(name: String): WebVRController = definedExternally
    open var _leftController: Any = definedExternally
    open var leftController: WebVRController = definedExternally
    open var _rightController: Any = definedExternally
    open var rightController: WebVRController = definedExternally
    open fun getForwardRay(length: Number? = definedExternally /* null */): Ray = definedExternally
    override fun _checkInputs(): Unit = definedExternally
    override fun updateFromDevice(poseData: DevicePose): Unit = definedExternally
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean?): Unit = definedExternally
    override fun detachControl(element: HTMLElement): Unit = definedExternally
    override fun getClassName(): String = definedExternally
    open fun resetToCurrentRotation(): Unit = definedExternally
    override fun _updateRigCameras(): Unit = definedExternally
    override fun _getWebVRViewMatrix(): Matrix = definedExternally
    override fun _getWebVRProjectionMatrix(): Matrix = definedExternally
    open fun initControllers(): Unit = definedExternally
}
external interface IOctreeContainer<T> {
    var blocks: Array<OctreeBlock<T>>
}
external open class Octree<T>(creationFunc: (entry: T, block: OctreeBlock<T>) -> Unit, maxBlockCapacity: Number? = definedExternally /* null */, maxDepth: Number? = definedExternally /* null */) {
    open var maxDepth: Number = definedExternally
    open var blocks: Array<OctreeBlock<T>> = definedExternally
    open var dynamicContent: Array<T> = definedExternally
    open var _maxBlockCapacity: Any = definedExternally
    open var _selectionContent: Any = definedExternally
    open var _creationFunc: Any = definedExternally
    open fun update(worldMin: Vector3, worldMax: Vector3, entries: Array<T>): Unit = definedExternally
    open fun addMesh(entry: T): Unit = definedExternally
    open fun select(frustumPlanes: Array<Plane>, allowDuplicate: Boolean? = definedExternally /* null */): SmartArray<T> = definedExternally
    open fun intersects(sphereCenter: Vector3, sphereRadius: Number, allowDuplicate: Boolean? = definedExternally /* null */): SmartArray<T> = definedExternally
    open fun intersectsRay(ray: Ray): SmartArray<T> = definedExternally
    companion object {
        fun <T> _CreateBlocks(worldMin: Vector3, worldMax: Vector3, entries: Array<T>, maxBlockCapacity: Number, currentDepth: Number, maxDepth: Number, target: IOctreeContainer<T>, creationFunc: (entry: T, block: OctreeBlock<T>) -> Unit): Unit = definedExternally
        var CreationFuncForMeshes: (entry: AbstractMesh, block: OctreeBlock<AbstractMesh>) -> Unit = definedExternally
        var CreationFuncForSubMeshes: (entry: SubMesh, block: OctreeBlock<SubMesh>) -> Unit = definedExternally
    }
}
external open class OctreeBlock<T>(minPoint: Vector3, maxPoint: Vector3, capacity: Number, depth: Number, maxDepth: Number, creationFunc: (entry: T, block: OctreeBlock<T>) -> Unit) {
    open var entries: Array<T> = definedExternally
    open var blocks: Array<OctreeBlock<T>> = definedExternally
    open var _depth: Any = definedExternally
    open var _maxDepth: Any = definedExternally
    open var _capacity: Any = definedExternally
    open var _minPoint: Any = definedExternally
    open var _maxPoint: Any = definedExternally
    open var _boundingVectors: Any = definedExternally
    open var _creationFunc: Any = definedExternally
    open var capacity: Number = definedExternally
    open var minPoint: Vector3 = definedExternally
    open var maxPoint: Vector3 = definedExternally
    open fun addEntry(entry: T): Unit = definedExternally
    open fun addEntries(entries: Array<T>): Unit = definedExternally
    open fun select(frustumPlanes: Array<Plane>, selection: SmartArray<T>, allowDuplicate: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun intersects(sphereCenter: Vector3, sphereRadius: Number, selection: SmartArray<T>, allowDuplicate: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun intersectsRay(ray: Ray, selection: SmartArray<T>): Unit = definedExternally
    open fun createInnerBlocks(): Unit = definedExternally
}
external interface IShadowGenerator {
    fun getShadowMap(): RenderTargetTexture
    fun getShadowMapForRendering(): RenderTargetTexture
    fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean
    fun prepareDefines(defines: MaterialDefines, lightIndex: Number)
    fun bindShadowLight(lightIndex: String, effect: Effect)
    fun getTransformMatrix(): Matrix
    fun recreateShadowMap()
    fun serialize(): Any
    fun dispose()
}
external open class ShadowGenerator(mapSize: Number, light: IShadowLight, useFullFloatFirst: Boolean? = definedExternally /* null */) : IShadowGenerator {
    open var _bias: Any = definedExternally
    open var bias: Number = definedExternally
    open var _blurBoxOffset: Any = definedExternally
    open var blurBoxOffset: Number = definedExternally
    open var _blurScale: Any = definedExternally
    open var blurScale: Number = definedExternally
    open var _blurKernel: Any = definedExternally
    open var blurKernel: Number = definedExternally
    open var _useKernelBlur: Any = definedExternally
    open var useKernelBlur: Boolean = definedExternally
    open var _depthScale: Any = definedExternally
    open var depthScale: Number = definedExternally
    open var _filter: Any = definedExternally
    open var filter: Number = definedExternally
    open var usePoissonSampling: Boolean = definedExternally
    open var useVarianceShadowMap: Boolean = definedExternally
    open var useBlurVarianceShadowMap: Boolean = definedExternally
    open var useExponentialShadowMap: Boolean = definedExternally
    open var useBlurExponentialShadowMap: Boolean = definedExternally
    open var useCloseExponentialShadowMap: Boolean = definedExternally
    open var useBlurCloseExponentialShadowMap: Boolean = definedExternally
    open var _darkness: Any = definedExternally
    open fun getDarkness(): Number = definedExternally
    open fun setDarkness(darkness: Number): ShadowGenerator = definedExternally
    open var _transparencyShadow: Any = definedExternally
    open fun setTransparencyShadow(hasShadow: Boolean): ShadowGenerator = definedExternally
    open var _shadowMap: Any = definedExternally
    open var _shadowMap2: Any = definedExternally
    override fun getShadowMap(): RenderTargetTexture = definedExternally
    override fun getShadowMapForRendering(): RenderTargetTexture = definedExternally
    open var _light: Any = definedExternally
    open fun getLight(): IShadowLight = definedExternally
    open var forceBackFacesOnly: Boolean = definedExternally
    open var _scene: Any = definedExternally
    open var _lightDirection: Any = definedExternally
    open var _effect: Any = definedExternally
    open var _viewMatrix: Any = definedExternally
    open var _projectionMatrix: Any = definedExternally
    open var _transformMatrix: Any = definedExternally
    open var _worldViewProjection: Any = definedExternally
    open var _cachedPosition: Any = definedExternally
    open var _cachedDirection: Any = definedExternally
    open var _cachedDefines: Any = definedExternally
    open var _currentRenderID: Any = definedExternally
    open var _downSamplePostprocess: Any = definedExternally
    open var _boxBlurPostprocess: Any = definedExternally
    open var _kernelBlurXPostprocess: Any = definedExternally
    open var _kernelBlurYPostprocess: Any = definedExternally
    open var _blurPostProcesses: Any = definedExternally
    open var _mapSize: Any = definedExternally
    open var _currentFaceIndex: Any = definedExternally
    open var _currentFaceIndexCache: Any = definedExternally
    open var _textureType: Any = definedExternally
    open var _isCube: Any = definedExternally
    open var _defaultTextureMatrix: Any = definedExternally
    open fun _initializeGenerator(): Unit = definedExternally
    open fun _initializeShadowMap(): Unit = definedExternally
    open fun _initializeBlurRTTAndPostProcesses(): Unit = definedExternally
    open fun _renderForShadowMap(opaqueSubMeshes: Any, alphaTestSubMeshes: Any, transparentSubMeshes: Any): Unit = definedExternally
    open fun _renderSubMeshForShadowMap(subMesh: Any): Unit = definedExternally
    open fun _applyFilterValues(): Unit = definedExternally
    override fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = definedExternally
    override fun prepareDefines(defines: MaterialDefines, lightIndex: Number): Unit = definedExternally
    override fun bindShadowLight(lightIndex: String, effect: Effect): Unit = definedExternally
    override fun getTransformMatrix(): Matrix = definedExternally
    override fun recreateShadowMap(): Unit = definedExternally
    open fun _disposeBlurPostProcesses(): Unit = definedExternally
    open fun _disposeRTTandPostProcesses(): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        var _FILTER_NONE: Any = definedExternally
        var _FILTER_EXPONENTIALSHADOWMAP: Any = definedExternally
        var _FILTER_POISSONSAMPLING: Any = definedExternally
        var _FILTER_BLUREXPONENTIALSHADOWMAP: Any = definedExternally
        var _FILTER_CLOSEEXPONENTIALSHADOWMAP: Any = definedExternally
        var _FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: Any = definedExternally
        var FILTER_NONE: Number = definedExternally
        var FILTER_POISSONSAMPLING: Number = definedExternally
        var FILTER_EXPONENTIALSHADOWMAP: Number = definedExternally
        var FILTER_BLUREXPONENTIALSHADOWMAP: Number = definedExternally
        var FILTER_CLOSEEXPONENTIALSHADOWMAP: Number = definedExternally
        var FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: Number = definedExternally
        fun Parse(parsedShadowGenerator: Any, scene: Scene): ShadowGenerator = definedExternally
    }
}
external open class PBRBaseMaterial(name: String, scene: Scene) : PushMaterial {
    open var _directIntensity: Number = definedExternally
    open var _emissiveIntensity: Number = definedExternally
    open var _environmentIntensity: Number = definedExternally
    open var _specularIntensity: Number = definedExternally
    open var _lightingInfos: Any = definedExternally
    open var _disableBumpMap: Boolean = definedExternally
    open var _albedoTexture: BaseTexture = definedExternally
    open var _ambientTexture: BaseTexture = definedExternally
    open var _ambientTextureStrength: Number = definedExternally
    open var _opacityTexture: BaseTexture = definedExternally
    open var _reflectionTexture: BaseTexture = definedExternally
    open var _refractionTexture: BaseTexture = definedExternally
    open var _emissiveTexture: BaseTexture = definedExternally
    open var _reflectivityTexture: BaseTexture = definedExternally
    open var _metallicTexture: BaseTexture = definedExternally
    open var _metallic: Number = definedExternally
    open var _roughness: Number = definedExternally
    open var _microSurfaceTexture: BaseTexture = definedExternally
    open var _bumpTexture: BaseTexture = definedExternally
    open var _lightmapTexture: BaseTexture = definedExternally
    open var _ambientColor: Color3 = definedExternally
    open var _albedoColor: Color3 = definedExternally
    open var _reflectivityColor: Color3 = definedExternally
    open var _reflectionColor: Color3 = definedExternally
    open var _emissiveColor: Color3 = definedExternally
    open var _microSurface: Number = definedExternally
    open var _indexOfRefraction: Number = definedExternally
    open var _invertRefractionY: Boolean = definedExternally
    open var _linkRefractionWithTransparency: Boolean = definedExternally
    open var _useLightmapAsShadowmap: Boolean = definedExternally
    open var _useAlphaFromAlbedoTexture: Boolean = definedExternally
    open var _useSpecularOverAlpha: Boolean = definedExternally
    open var _useMicroSurfaceFromReflectivityMapAlpha: Boolean = definedExternally
    open var _useRoughnessFromMetallicTextureAlpha: Boolean = definedExternally
    open var _useRoughnessFromMetallicTextureGreen: Boolean = definedExternally
    open var _useMetallnessFromMetallicTextureBlue: Boolean = definedExternally
    open var _useAmbientOcclusionFromMetallicTextureRed: Boolean = definedExternally
    open var _useAmbientInGrayScale: Boolean = definedExternally
    open var _useAutoMicroSurfaceFromReflectivityMap: Boolean = definedExternally
    open var _usePhysicalLightFalloff: Boolean = definedExternally
    open var _useRadianceOverAlpha: Boolean = definedExternally
    open var _useParallax: Boolean = definedExternally
    open var _useParallaxOcclusion: Boolean = definedExternally
    open var _parallaxScaleBias: Number = definedExternally
    open var _disableLighting: Boolean = definedExternally
    open var _maxSimultaneousLights: Number = definedExternally
    open var _invertNormalMapX: Boolean = definedExternally
    open var _invertNormalMapY: Boolean = definedExternally
    open var _twoSidedLighting: Boolean = definedExternally
    open var _alphaCutOff: Number = definedExternally
    open var _forceAlphaTest: Boolean = definedExternally
    open var _premultiplyAlpha: Boolean = definedExternally
    open var _useAlphaFresnel: Boolean = definedExternally
    open var _environmentBRDFTexture: BaseTexture = definedExternally
    open var _imageProcessingConfiguration: ImageProcessingConfiguration = definedExternally
    open var _imageProcessingObserver: Any = definedExternally
    open fun _attachImageProcessingConfiguration(configuration: ImageProcessingConfiguration): Unit = definedExternally
    open var _renderTargets: Any = definedExternally
    open var _worldViewProjectionMatrix: Any = definedExternally
    open var _globalAmbientColor: Any = definedExternally
    open var _tempColor: Any = definedExternally
    open var _renderId: Any = definedExternally
    open var _useLogarithmicDepth: Any = definedExternally
    override fun getClassName(): String = definedExternally
    open var useLogarithmicDepth: Boolean = definedExternally
    override fun needAlphaBlending(): Boolean = definedExternally
    override fun needAlphaTesting(): Boolean = definedExternally
    open fun _shouldUseAlphaFromAlbedoTexture(): Boolean = definedExternally
    override fun getAlphaTestTexture(): BaseTexture = definedExternally
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun buildUniformLayout(): Unit = definedExternally
    override fun unbind(): Unit = definedExternally
    override fun bindOnlyWorldMatrix(world: Matrix): Unit = definedExternally
    override fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = definedExternally
    open fun getAnimatables(): Array<IAnimatable> = definedExternally
    open fun _getReflectionTexture(): Unit = definedExternally
    open fun _getRefractionTexture(): Unit = definedExternally
    override fun dispose(forceDisposeEffect: Boolean?, forceDisposeTextures: Boolean?): Unit = definedExternally
    companion object {
        var _scaledReflectivity: Any = definedExternally
    }
}
external open class PBRMaterial(name: String, scene: Scene) : PBRBaseMaterial {
    open var directIntensity: Number = definedExternally
    open var emissiveIntensity: Number = definedExternally
    open var environmentIntensity: Number = definedExternally
    open var specularIntensity: Number = definedExternally
    open var disableBumpMap: Boolean = definedExternally
    open var albedoTexture: BaseTexture = definedExternally
    open var ambientTexture: BaseTexture = definedExternally
    open var ambientTextureStrength: Number = definedExternally
    open var opacityTexture: BaseTexture = definedExternally
    open var reflectionTexture: BaseTexture = definedExternally
    open var emissiveTexture: BaseTexture = definedExternally
    open var reflectivityTexture: BaseTexture = definedExternally
    open var metallicTexture: BaseTexture = definedExternally
    open var metallic: Number = definedExternally
    open var roughness: Number = definedExternally
    open var microSurfaceTexture: BaseTexture = definedExternally
    open var bumpTexture: BaseTexture = definedExternally
    open var lightmapTexture: BaseTexture = definedExternally
    open var refractionTexture: BaseTexture = definedExternally
    open var ambientColor: Color3 = definedExternally
    open var albedoColor: Color3 = definedExternally
    open var reflectivityColor: Color3 = definedExternally
    open var reflectionColor: Color3 = definedExternally
    open var emissiveColor: Color3 = definedExternally
    open var microSurface: Number = definedExternally
    open var indexOfRefraction: Number = definedExternally
    open var invertRefractionY: Boolean = definedExternally
    open var linkRefractionWithTransparency: Boolean = definedExternally
    open var useLightmapAsShadowmap: Boolean = definedExternally
    open var useAlphaFromAlbedoTexture: Boolean = definedExternally
    open var useSpecularOverAlpha: Boolean = definedExternally
    open var useMicroSurfaceFromReflectivityMapAlpha: Boolean = definedExternally
    open var useRoughnessFromMetallicTextureAlpha: Boolean = definedExternally
    open var useRoughnessFromMetallicTextureGreen: Boolean = definedExternally
    open var useMetallnessFromMetallicTextureBlue: Boolean = definedExternally
    open var useAmbientOcclusionFromMetallicTextureRed: Boolean = definedExternally
    open var useAmbientInGrayScale: Boolean = definedExternally
    open var useAutoMicroSurfaceFromReflectivityMap: Boolean = definedExternally
    open var usePhysicalLightFalloff: Boolean = definedExternally
    open var useRadianceOverAlpha: Boolean = definedExternally
    open var useParallax: Boolean = definedExternally
    open var useParallaxOcclusion: Boolean = definedExternally
    open var parallaxScaleBias: Number = definedExternally
    open var disableLighting: Boolean = definedExternally
    open var maxSimultaneousLights: Number = definedExternally
    open var invertNormalMapX: Boolean = definedExternally
    open var invertNormalMapY: Boolean = definedExternally
    open var twoSidedLighting: Boolean = definedExternally
    open var premultiplyAlpha: Boolean = definedExternally
    open var useAlphaFresnel: Boolean = definedExternally
    open var environmentBRDFTexture: BaseTexture = definedExternally
    open var imageProcessingConfiguration: ImageProcessingConfiguration = definedExternally
    open var cameraColorCurvesEnabled: Boolean = definedExternally
    open var cameraColorGradingEnabled: Boolean = definedExternally
    open var cameraToneMappingEnabled: Boolean = definedExternally
    open var cameraExposure: Number = definedExternally
    open var cameraContrast: Number = definedExternally
    open var cameraColorGradingTexture: BaseTexture = definedExternally
    open var cameraColorCurves: ColorCurves = definedExternally
    override fun getClassName(): String = definedExternally
    override fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    override fun clone(name: String): PBRMaterial = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        var _PBRMATERIAL_OPAQUE: Any = definedExternally
        var PBRMATERIAL_OPAQUE: Number = definedExternally
        var _PBRMATERIAL_ALPHATEST: Any = definedExternally
        var PBRMATERIAL_ALPHATEST: Number = definedExternally
        var _PBRMATERIAL_ALPHABLEND: Any = definedExternally
        var PBRMATERIAL_ALPHABLEND: Number = definedExternally
        var _PBRMATERIAL_ALPHATESTANDBLEND: Any = definedExternally
        var PBRMATERIAL_ALPHATESTANDBLEND: Number = definedExternally
        fun Parse(source: Any, scene: Scene, rootUrl: String): PBRMaterial = definedExternally
    }
}
external open class PBRMetallicRoughnessMaterial(name: String, scene: Scene) : BABYLON.Internals.PBRBaseSimpleMaterial {
    open var baseColor: Color3 = definedExternally
    open var baseTexture: BaseTexture = definedExternally
    open var metallic: Number = definedExternally
    open var roughness: Number = definedExternally
    open var metallicRoughnessTexture: BaseTexture = definedExternally
    override fun getClassName(): String = definedExternally
    override fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    override fun clone(name: String): PBRMetallicRoughnessMaterial = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): PBRMetallicRoughnessMaterial = definedExternally
    }
}
external open class PBRSpecularGlossinessMaterial(name: String, scene: Scene) : BABYLON.Internals.PBRBaseSimpleMaterial {
    open var diffuseColor: Color3 = definedExternally
    open var diffuseTexture: BaseTexture = definedExternally
    open var specularColor: Color3 = definedExternally
    open var glossiness: Number = definedExternally
    open var specularGlossinessTexture: BaseTexture = definedExternally
    override fun getClassName(): String = definedExternally
    override fun getActiveTextures(): Array<BaseTexture> = definedExternally
    override fun hasTexture(texture: BaseTexture): Boolean = definedExternally
    override fun clone(name: String): PBRSpecularGlossinessMaterial = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): PBRSpecularGlossinessMaterial = definedExternally
    }
}
external open class BaseTexture(scene: Scene) {
    open var name: String = definedExternally
    open var _hasAlpha: Any = definedExternally
    open var hasAlpha: Boolean = definedExternally
    open var getAlphaFromRGB: Boolean = definedExternally
    open var level: Number = definedExternally
    open var coordinatesIndex: Number = definedExternally
    open var _coordinatesMode: Any = definedExternally
    open var coordinatesMode: Number = definedExternally
    open var wrapU: Number = definedExternally
    open var wrapV: Number = definedExternally
    open var anisotropicFilteringLevel: Number = definedExternally
    open var isCube: Boolean = definedExternally
    open var gammaSpace: Boolean = definedExternally
    open var invertZ: Boolean = definedExternally
    open var lodLevelInAlpha: Boolean = definedExternally
    open var lodGenerationOffset: Number = definedExternally
    open var lodGenerationScale: Number = definedExternally
    open var isRenderTarget: Boolean = definedExternally
    open var uid: String = definedExternally
    override fun toString(): String = definedExternally
    open var animations: Array<Animation> = definedExternally
    open var onDisposeObservable: Observable<BaseTexture> = definedExternally
    open var _onDisposeObserver: Any = definedExternally
    open var onDispose: () -> Unit = definedExternally
    open var delayLoadState: Number = definedExternally
    open var _cachedAnisotropicFilteringLevel: Number = definedExternally
    open var _scene: Any = definedExternally
    open var _texture: WebGLTexture = definedExternally
    open var _uid: Any = definedExternally
    open var isBlocking: Boolean = definedExternally
    open fun getScene(): Scene = definedExternally
    open fun getTextureMatrix(): Matrix = definedExternally
    open fun getReflectionTextureMatrix(): Matrix = definedExternally
    open fun getInternalTexture(): WebGLTexture = definedExternally
    open fun isReadyOrNotBlocking(): Boolean = definedExternally
    open fun isReady(): Boolean = definedExternally
    open fun getSize(): ISize = definedExternally
    open fun getBaseSize(): ISize = definedExternally
    open fun scale(ratio: Number): Unit = definedExternally
    open var canRescale: Boolean = definedExternally
    open fun _removeFromCache(url: String, noMipmap: Boolean): Unit = definedExternally
    open fun _getFromCache(url: String, noMipmap: Boolean, sampling: Number? = definedExternally /* null */): WebGLTexture = definedExternally
    open fun delayLoad(): Unit = definedExternally
    open fun clone(): BaseTexture = definedExternally
    open var textureType: Number = definedExternally
    open var textureFormat: Number = definedExternally
    open fun readPixels(faceIndex: Number? = definedExternally /* null */): ArrayBufferView = definedExternally
    open fun releaseInternalTexture(): Unit = definedExternally
    open var sphericalPolynomial: SphericalPolynomial = definedExternally
    open var _lodTextureHigh: BaseTexture = definedExternally
    open var _lodTextureMid: BaseTexture = definedExternally
    open var _lodTextureLow: BaseTexture = definedExternally
    open fun dispose(): Unit = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        var DEFAULT_ANISOTROPIC_FILTERING_LEVEL: Number = definedExternally
        fun WhenAllReady(textures: Array<BaseTexture>, onLoad: () -> Unit): Unit = definedExternally
    }
}
external open class ColorGradingTexture(url: String, scene: Scene) : BaseTexture {
    open var _size: Any = definedExternally
    open var _textureMatrix: Any = definedExternally
    open var url: String = definedExternally
    override fun getTextureMatrix(): Matrix = definedExternally
    open fun load3dlTexture(): Unit = definedExternally
    open fun loadTexture(): Unit = definedExternally
    override fun clone(): ColorGradingTexture = definedExternally
    override fun delayLoad(): Unit = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        var _noneEmptyLineRegex: Any = definedExternally
        fun Parse(parsedTexture: Any, scene: Scene, rootUrl: String): ColorGradingTexture = definedExternally
    }
}
external open class CubeTexture(rootUrl: String, scene: Scene, extensions: Array<String>? = definedExternally /* null */, noMipmap: Boolean? = definedExternally /* null */, files: Array<String>? = definedExternally /* null */, onLoad: (() -> Unit)? = definedExternally /* null */, onError: (() -> Unit)? = definedExternally /* null */, format: Number? = definedExternally /* null */, prefiltered: Boolean? = definedExternally /* null */) : BaseTexture {
    open var url: String = definedExternally
    override var coordinatesMode: Number = definedExternally
    open var _noMipmap: Any = definedExternally
    open var _files: Any = definedExternally
    open var _extensions: Any = definedExternally
    open var _textureMatrix: Any = definedExternally
    open var _format: Any = definedExternally
    open var _prefiltered: Any = definedExternally
    override fun delayLoad(): Unit = definedExternally
    override fun getReflectionTextureMatrix(): Matrix = definedExternally
    open fun setReflectionTextureMatrix(value: Matrix): Unit = definedExternally
    override fun clone(): CubeTexture = definedExternally
    companion object {
        fun CreateFromImages(files: Array<String>, scene: Scene, noMipmap: Boolean? = definedExternally /* null */): CubeTexture = definedExternally
        fun CreateFromPrefilteredData(url: String, scene: Scene): CubeTexture = definedExternally
        fun Parse(parsedTexture: Any, scene: Scene, rootUrl: String): CubeTexture = definedExternally
    }
}
external open class DynamicTexture(name: String, options: Any, scene: Scene, generateMipMaps: Boolean, samplingMode: Number? = definedExternally /* null */, format: Number? = definedExternally /* null */) : Texture {
    open var _generateMipMaps: Any = definedExternally
    open var _canvas: Any = definedExternally
    open var _context: Any = definedExternally
    override var canRescale: Boolean = definedExternally
    open fun _recreate(textureSize: Any): Unit = definedExternally
    override fun scale(ratio: Number): Unit = definedExternally
    open fun scaleTo(width: Number, height: Number): Unit = definedExternally
    open fun getContext(): CanvasRenderingContext2D = definedExternally
    open fun clear(): Unit = definedExternally
    open fun update(invertY: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun drawText(text: String, x: Number, y: Number, font: String, color: String, clearColor: String, invertY: Boolean? = definedExternally /* null */, update: Boolean? = definedExternally /* null */): Unit = definedExternally
    override fun clone(): DynamicTexture = definedExternally
}
external open class HDRCubeTexture(url: String, scene: Scene, size: Number? = definedExternally /* null */, noMipmap: Boolean? = definedExternally /* null */, generateHarmonics: Boolean? = definedExternally /* null */, useInGammaSpace: Boolean? = definedExternally /* null */, usePMREMGenerator: Boolean? = definedExternally /* null */, onLoad: (() -> Unit)? = definedExternally /* null */, onError: (() -> Unit)? = definedExternally /* null */) : BaseTexture {
    open var _useInGammaSpace: Any = definedExternally
    open var _generateHarmonics: Any = definedExternally
    open var _noMipmap: Any = definedExternally
    open var _extensions: Any = definedExternally
    open var _textureMatrix: Any = definedExternally
    open var _size: Any = definedExternally
    open var _usePMREMGenerator: Any = definedExternally
    open var _isBABYLONPreprocessed: Any = definedExternally
    open var _onLoad: Any = definedExternally
    open var _onError: Any = definedExternally
    open var url: String = definedExternally
    override var coordinatesMode: Number = definedExternally
    open var isPMREM: Boolean = definedExternally
    open var _isBlocking: Boolean = definedExternally
    override var isBlocking: Boolean = definedExternally
    open fun loadBabylonTexture(): Unit = definedExternally
    open fun loadHDRTexture(): Unit = definedExternally
    open fun loadTexture(): Unit = definedExternally
    override fun clone(): HDRCubeTexture = definedExternally
    override fun delayLoad(): Unit = definedExternally
    override fun getReflectionTextureMatrix(): Matrix = definedExternally
    open fun setReflectionTextureMatrix(value: Matrix): Unit = definedExternally
    override fun serialize(): Any = definedExternally
    companion object {
        var _facesMapping: Any = definedExternally
        fun Parse(parsedTexture: Any, scene: Scene, rootUrl: String): HDRCubeTexture = definedExternally
        fun generateBabylonHDROnDisk(url: String, size: Number, onError: () -> Unit? = definedExternally /* null */): Unit = definedExternally
        fun generateBabylonHDR(url: String, size: Number, callback: (ArrayBuffer: ArrayBuffer) -> Unit, onError: () -> Unit? = definedExternally /* null */): Unit = definedExternally
    }
}
external open class MapTexture(name: String, scene: Scene, size: ISize, samplingMode: Number? = definedExternally /* null */, useMipMap: Boolean? = definedExternally /* null */, margin: Number? = definedExternally /* null */) : Texture {
    open var _rectPackingMap: Any = definedExternally
    open var _size: Any = definedExternally
    open var _replacedViewport: Any = definedExternally
    open fun allocateRect(size: Size): PackedRect = definedExternally
    open fun freeRect(rectInfo: PackedRect): Unit = definedExternally
    open var freeSpace: Number = definedExternally
    open fun bindTextureForRect(rect: PackedRect, clear: Boolean): Unit = definedExternally
    open fun bindTextureForPosSize(pos: Vector2, size: Size, clear: Boolean): Unit = definedExternally
    open fun unbindTexture(dumpForDebug: Boolean? = definedExternally /* null */): Unit = definedExternally
    override var canRescale: Boolean = definedExternally
    override fun clone(): MapTexture = definedExternally
}
external open class MirrorTexture(name: String, size: Any, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */, type: Number? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, generateDepthBuffer: Boolean? = definedExternally /* null */) : RenderTargetTexture {
    open var mirrorPlane: Plane = definedExternally
    open var _transformMatrix: Any = definedExternally
    open var _mirrorMatrix: Any = definedExternally
    open var _savedViewMatrix: Any = definedExternally
    open var _blurX: Any = definedExternally
    open var _blurY: Any = definedExternally
    open var _blurKernelX: Any = definedExternally
    open var _blurKernelY: Any = definedExternally
    open var _blurRatio: Any = definedExternally
    open var blurRatio: Number = definedExternally
    open var blurKernel: Number = definedExternally
    open var blurKernelX: Number = definedExternally
    open var blurKernelY: Number = definedExternally
    open fun _preparePostProcesses(): Unit = definedExternally
    override fun clone(): MirrorTexture = definedExternally
    override fun serialize(): Any = definedExternally
}
external interface IMultiRenderTargetOptions {
    var generateMipMaps: Boolean
    var types: Array<Number>
    var samplingModes: Array<Number>
    var generateDepthBuffer: Boolean
    var generateStencilBuffer: Boolean
    var generateDepthTexture: Boolean
    var textureCount: Number
}
external open class MultiRenderTarget(name: String, size: Any, count: Number, scene: Scene, options: Any? = definedExternally /* null */) : RenderTargetTexture {
    open var _webGLTextures: Any = definedExternally
    open var _textures: Any = definedExternally
    open var _count: Any = definedExternally
    open var isSupported: Boolean = definedExternally
    open var _multiRenderTargetOptions: Any = definedExternally
    open var textures: Array<Texture> = definedExternally
    open var depthTexture: Texture = definedExternally
    open fun _createInternalTextures(): Unit = definedExternally
    override var samples: Number = definedExternally
    override fun resize(size: Any): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
    open fun releaseInternalTextures(): Unit = definedExternally
}
external open class RawTexture(data: ArrayBufferView, width: Number, height: Number, format: Number, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */) : Texture {
    open var format: Number = definedExternally
    open fun update(data: ArrayBufferView): Unit = definedExternally
    companion object {
        fun CreateLuminanceTexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */): RawTexture = definedExternally
        fun CreateLuminanceAlphaTexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */): RawTexture = definedExternally
        fun CreateAlphaTexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */): RawTexture = definedExternally
        fun CreateRGBTexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */): RawTexture = definedExternally
        fun CreateRGBATexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */): RawTexture = definedExternally
    }
}
external open class RefractionTexture(name: String, size: Number, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */) : RenderTargetTexture {
    open var refractionPlane: Plane = definedExternally
    open var depth: Number = definedExternally
    override fun clone(): RefractionTexture = definedExternally
    override fun serialize(): Any = definedExternally
}
external interface IRenderTargetOptions {
    var generateMipMaps: Boolean
    var type: Number
    var samplingMode: Number
    var generateDepthBuffer: Boolean
    var generateStencilBuffer: Boolean
}
external open class RenderTargetTexture(name: String, size: Any, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */, doNotChangeAspectRatio: Boolean? = definedExternally /* null */, type: Number? = definedExternally /* null */, isCube: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, generateDepthBuffer: Boolean? = definedExternally /* null */, generateStencilBuffer: Boolean? = definedExternally /* null */, isMulti: Boolean? = definedExternally /* null */) : Texture {
    override var isCube: Boolean = definedExternally
    open var renderListPredicate: (AbstractMesh: AbstractMesh) -> Boolean = definedExternally
    open var renderList: Array<AbstractMesh> = definedExternally
    open var renderParticles: Boolean = definedExternally
    open var renderSprites: Boolean = definedExternally
    override var coordinatesMode: Number = definedExternally
    open var activeCamera: Camera = definedExternally
    open var customRenderFunction: (opaqueSubMeshes: SmartArray<SubMesh>, transparentSubMeshes: SmartArray<SubMesh>, alphaTestSubMeshes: SmartArray<SubMesh>, beforeTransparents: (() -> Unit)? /*= null*/) -> Unit = definedExternally
    open var useCameraPostProcesses: Boolean = definedExternally
    open var _postProcessManager: Any = definedExternally
    open var _postProcesses: Any = definedExternally
    open var onAfterUnbindObservable: Observable<RenderTargetTexture> = definedExternally
    open var _onAfterUnbindObserver: Any = definedExternally
    open var onAfterUnbind: () -> Unit = definedExternally
    open var onBeforeRenderObservable: Observable<Number> = definedExternally
    open var _onBeforeRenderObserver: Any = definedExternally
    open var onBeforeRender: (faceIndex: Number) -> Unit = definedExternally
    open var onAfterRenderObservable: Observable<Number> = definedExternally
    open var _onAfterRenderObserver: Any = definedExternally
    open var onAfterRender: (faceIndex: Number) -> Unit = definedExternally
    open var onClearObservable: Observable<Engine> = definedExternally
    open var _onClearObserver: Any = definedExternally
    open var onClear: (Engine: Engine) -> Unit = definedExternally
    open var _size: Number = definedExternally
    open var _generateMipMaps: Boolean = definedExternally
    open var _renderingManager: RenderingManager = definedExternally
    open var _waitingRenderList: Array<String> = definedExternally
    open var _doNotChangeAspectRatio: Boolean = definedExternally
    open var _currentRefreshId: Number = definedExternally
    open var _refreshRate: Number = definedExternally
    open var _textureMatrix: Matrix = definedExternally
    open var _samples: Number = definedExternally
    open var _renderTargetOptions: IRenderTargetOptions = definedExternally
    open var renderTargetOptions: IRenderTargetOptions = definedExternally
    open var samples: Number = definedExternally
    open fun resetRefreshCounter(): Unit = definedExternally
    open var refreshRate: Number = definedExternally
    open fun addPostProcess(postProcess: PostProcess): Unit = definedExternally
    open fun clearPostProcesses(dispose: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun removePostProcess(postProcess: PostProcess): Unit = definedExternally
    open fun _shouldRender(): Boolean = definedExternally
    override fun isReady(): Boolean = definedExternally
    open fun getRenderSize(): Number = definedExternally
    override var canRescale: Boolean = definedExternally
    override fun scale(ratio: Number): Unit = definedExternally
    override fun getReflectionTextureMatrix(): Matrix = definedExternally
    open fun resize(size: Any): Unit = definedExternally
    open fun render(useCameraPostProcess: Boolean? = definedExternally /* null */, dumpForDebug: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun renderToTarget(faceIndex: Any, currentRenderList: Any, currentRenderListLength: Any, useCameraPostProcess: Any, dumpForDebug: Any): Unit = definedExternally
    open fun setRenderingOrder(renderingGroupId: Number, opaqueSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */, alphaTestSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */, transparentSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally /* null */): Unit = definedExternally
    open fun setRenderingAutoClearDepthStencil(renderingGroupId: Number, autoClearDepthStencil: Boolean): Unit = definedExternally
    override fun clone(): RenderTargetTexture = definedExternally
    override fun serialize(): Any = definedExternally
    open fun disposeFramebufferObjects(): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
    companion object {
        var _REFRESHRATE_RENDER_ONCE: Number = definedExternally
        var _REFRESHRATE_RENDER_ONEVERYFRAME: Number = definedExternally
        var _REFRESHRATE_RENDER_ONEVERYTWOFRAMES: Number = definedExternally
        var REFRESHRATE_RENDER_ONCE: Number = definedExternally
        var REFRESHRATE_RENDER_ONEVERYFRAME: Number = definedExternally
        var REFRESHRATE_RENDER_ONEVERYTWOFRAMES: Number = definedExternally
    }
}
external open class Texture(url: String, scene: Scene, noMipmap: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, onLoad: (() -> Unit)? = definedExternally /* null */, onError: (() -> Unit)? = definedExternally /* null */, buffer: Any? = definedExternally /* null */, deleteBuffer: Boolean? = definedExternally /* null */, format: Number? = definedExternally /* null */) : BaseTexture {
    open var url: String = definedExternally
    open var uOffset: Number = definedExternally
    open var vOffset: Number = definedExternally
    open var uScale: Number = definedExternally
    open var vScale: Number = definedExternally
    open var uAng: Number = definedExternally
    open var vAng: Number = definedExternally
    open var wAng: Number = definedExternally
    open var noMipmap: Boolean = definedExternally
    open var _noMipmap: Any = definedExternally
    open var _invertY: Boolean = definedExternally
    open var _rowGenerationMatrix: Any = definedExternally
    open var _cachedTextureMatrix: Any = definedExternally
    open var _projectionModeMatrix: Any = definedExternally
    open var _t0: Any = definedExternally
    open var _t1: Any = definedExternally
    open var _t2: Any = definedExternally
    open var _cachedUOffset: Any = definedExternally
    open var _cachedVOffset: Any = definedExternally
    open var _cachedUScale: Any = definedExternally
    open var _cachedVScale: Any = definedExternally
    open var _cachedUAng: Any = definedExternally
    open var _cachedVAng: Any = definedExternally
    open var _cachedWAng: Any = definedExternally
    open var _cachedCoordinatesMode: Any = definedExternally
    open var _samplingMode: Number = definedExternally
    open var _buffer: Any = definedExternally
    open var _deleteBuffer: Any = definedExternally
    open var _format: Number = definedExternally
    open var _delayedOnLoad: Any = definedExternally
    open var _delayedOnError: Any = definedExternally
    open var _onLoadObservable: Any = definedExternally
    open var _isBlocking: Boolean = definedExternally
    override var isBlocking: Boolean = definedExternally
    open fun updateURL(url: String): Unit = definedExternally
    override fun delayLoad(): Unit = definedExternally
    open fun updateSamplingMode(samplingMode: Number): Unit = definedExternally
    open fun _prepareRowForTextureGeneration(x: Any, y: Any, z: Any, t: Any): Unit = definedExternally
    override fun getTextureMatrix(): Matrix = definedExternally
    override fun getReflectionTextureMatrix(): Matrix = definedExternally
    override fun clone(): Texture = definedExternally
    open var onLoadObservable: Observable<Texture> = definedExternally
    companion object {
        var NEAREST_SAMPLINGMODE: Number = definedExternally
        var BILINEAR_SAMPLINGMODE: Number = definedExternally
        var TRILINEAR_SAMPLINGMODE: Number = definedExternally
        var EXPLICIT_MODE: Number = definedExternally
        var SPHERICAL_MODE: Number = definedExternally
        var PLANAR_MODE: Number = definedExternally
        var CUBIC_MODE: Number = definedExternally
        var PROJECTION_MODE: Number = definedExternally
        var SKYBOX_MODE: Number = definedExternally
        var INVCUBIC_MODE: Number = definedExternally
        var EQUIRECTANGULAR_MODE: Number = definedExternally
        var FIXED_EQUIRECTANGULAR_MODE: Number = definedExternally
        var FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Number = definedExternally
        var CLAMP_ADDRESSMODE: Number = definedExternally
        var WRAP_ADDRESSMODE: Number = definedExternally
        var MIRROR_ADDRESSMODE: Number = definedExternally
        fun CreateFromBase64String(data: String, name: String, scene: Scene, noMipmap: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, onLoad: (() -> Unit)? = definedExternally /* null */, onError: (() -> Unit)? = definedExternally /* null */, format: Number? = definedExternally /* null */): Texture = definedExternally
        fun Parse(parsedTexture: Any, scene: Scene, rootUrl: String): BaseTexture = definedExternally
        fun LoadFromDataString(name: String, buffer: Any, scene: Scene, deleteBuffer: Boolean? = definedExternally /* null */, noMipmap: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */, onLoad: (() -> Unit)? = definedExternally /* null */, onError: (() -> Unit)? = definedExternally /* null */, format: Number? = definedExternally /* null */): Texture = definedExternally
    }
}
external interface `T$87` {
    var minWidth: Number
    var maxWidth: Number
    var minHeight: Number
    var maxHeight: Number
    var deviceId: String
}
external open class VideoTexture : Texture {
    constructor(name: String, urlsOrVideo: Array<String>, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */)
    constructor(name: String, urlsOrVideo: HTMLVideoElement, scene: Scene, generateMipMaps: Boolean? = definedExternally /* null */, invertY: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */)
    open var video: HTMLVideoElement = definedExternally
    open var _autoLaunch: Any = definedExternally
    open var _lastUpdate: Any = definedExternally
    open var _generateMipMaps: Any = definedExternally
    open var _setTextureReady: Any = definedExternally
    open fun __setTextureReady(): Unit = definedExternally
    open fun _createTexture(): Unit = definedExternally
    open fun update(): Boolean = definedExternally
    override fun dispose(): Unit = definedExternally
    companion object {
        fun CreateFromWebCam(scene: Scene, onReady: (videoTexture: VideoTexture) -> Unit, constraints: `T$87`): Unit = definedExternally
    }
}
external open class CannonJSPlugin(_useDeltaForWorldStep: Boolean? = definedExternally /* null */, iterations: Number? = definedExternally /* null */) : IPhysicsEnginePlugin {
    open var _useDeltaForWorldStep: Any = definedExternally
    override fun setMotor(joint: IMotorEnabledJoint, speed: Number, maxForce: Number?, motorIndex: Number?): Any
    override fun setLimit(joint: IMotorEnabledJoint, upperLimit: Number, lowerLimit: Number?, motorIndex: Number?): Any

    override var world: Any = definedExternally
    override var name: String = definedExternally
    open var _physicsMaterials: Any = definedExternally
    open var _fixedTimeStep: Any = definedExternally
    open var _currentCollisionGroup: Any = definedExternally
    override fun setGravity(gravity: Vector3): Unit = definedExternally
    override fun setTimeStep(timeStep: Number): Unit = definedExternally
    override fun executeStep(delta: Number, impostors: Array<PhysicsImpostor>): Unit = definedExternally
    override fun applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Unit = definedExternally
    override fun applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Unit = definedExternally
    override fun generatePhysicsBody(impostor: PhysicsImpostor): Unit = definedExternally
    open fun _processChildMeshes(mainImpostor: Any): Unit = definedExternally
    override fun removePhysicsBody(impostor: PhysicsImpostor): Unit = definedExternally
    override fun generateJoint(impostorJoint: PhysicsImpostorJoint): Unit = definedExternally
    override fun removeJoint(impostorJoint: PhysicsImpostorJoint): Unit = definedExternally
    open fun _addMaterial(name: Any, friction: Any, restitution: Any): Unit = definedExternally
    open fun _checkWithEpsilon(value: Any): Unit = definedExternally
    open fun _createShape(impostor: Any): Unit = definedExternally
    open fun _createHeightmap(`object`: Any, pointDepth: Any? = definedExternally /* null */): Unit = definedExternally
    open var _minus90X: Any = definedExternally
    open var _plus90X: Any = definedExternally
    open var _tmpPosition: Any = definedExternally
    open var _tmpQuaternion: Any = definedExternally
    open var _tmpDeltaPosition: Any = definedExternally
    open var _tmpDeltaRotation: Any = definedExternally
    open var _tmpUnityRotation: Any = definedExternally
    open fun _updatePhysicsBodyTransformation(impostor: Any): Unit = definedExternally
    override fun setTransformationFromPhysicsBody(impostor: PhysicsImpostor): Unit = definedExternally
    override fun setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion): Unit = definedExternally
    override fun isSupported(): Boolean = definedExternally
    override fun setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = definedExternally
    override fun setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = definedExternally
    override fun getLinearVelocity(impostor: PhysicsImpostor): Vector3 = definedExternally
    override fun getAngularVelocity(impostor: PhysicsImpostor): Vector3 = definedExternally
    override fun setBodyMass(impostor: PhysicsImpostor, mass: Number): Unit = definedExternally
    override fun getBodyMass(impostor: PhysicsImpostor): Number = definedExternally
    override fun getBodyFriction(impostor: PhysicsImpostor): Number = definedExternally
    override fun setBodyFriction(impostor: PhysicsImpostor, friction: Number): Unit = definedExternally
    override fun getBodyRestitution(impostor: PhysicsImpostor): Number = definedExternally
    override fun setBodyRestitution(impostor: PhysicsImpostor, restitution: Number): Unit = definedExternally
    override fun sleepBody(impostor: PhysicsImpostor): Unit = definedExternally
    override fun wakeUpBody(impostor: PhysicsImpostor): Unit = definedExternally
    override fun updateDistanceJoint(joint: PhysicsJoint, maxDistance: Number, minDistance: Number?): Unit = definedExternally
    open fun enableMotor(joint: Any, motorIndex: Any? = definedExternally /* null */): Unit = definedExternally
    open fun disableMotor(joint: Any, motorIndex: Any? = definedExternally /* null */): Unit = definedExternally
    open fun setLimit(joint: IMotorEnabledJoint, upperLimit: Number, lowerLimit: Number? = definedExternally /* null */): Unit = definedExternally
    override fun syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor): Unit = definedExternally
    override fun getRadius(impostor: PhysicsImpostor): Number = definedExternally
    override fun getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
}
external open class OimoJSPlugin(iterations: Number? = definedExternally /* null */) : IPhysicsEnginePlugin {
    override var world: Any = definedExternally
    override var name: String = definedExternally
    override fun setGravity(gravity: Vector3): Unit = definedExternally
    override fun setTimeStep(timeStep: Number): Unit = definedExternally
    open var _tmpImpostorsArray: Any = definedExternally
    override fun executeStep(delta: Number, impostors: Array<PhysicsImpostor>): Unit = definedExternally
    override fun applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Unit = definedExternally
    override fun applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Unit = definedExternally
    override fun generatePhysicsBody(impostor: PhysicsImpostor): Unit = definedExternally
    open var _tmpPositionVector: Any = definedExternally
    override fun removePhysicsBody(impostor: PhysicsImpostor): Unit = definedExternally
    override fun generateJoint(impostorJoint: PhysicsImpostorJoint): Unit = definedExternally
    override fun removeJoint(impostorJoint: PhysicsImpostorJoint): Unit = definedExternally
    override fun isSupported(): Boolean = definedExternally
    override fun setTransformationFromPhysicsBody(impostor: PhysicsImpostor): Unit = definedExternally
    override fun setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion): Unit = definedExternally
    open fun _getLastShape(body: Any): Unit = definedExternally
    override fun setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = definedExternally
    override fun setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = definedExternally
    override fun getLinearVelocity(impostor: PhysicsImpostor): Vector3 = definedExternally
    override fun getAngularVelocity(impostor: PhysicsImpostor): Vector3 = definedExternally
    override fun setBodyMass(impostor: PhysicsImpostor, mass: Number): Unit = definedExternally
    override fun getBodyMass(impostor: PhysicsImpostor): Number = definedExternally
    override fun getBodyFriction(impostor: PhysicsImpostor): Number = definedExternally
    override fun setBodyFriction(impostor: PhysicsImpostor, friction: Number): Unit = definedExternally
    override fun getBodyRestitution(impostor: PhysicsImpostor): Number = definedExternally
    override fun setBodyRestitution(impostor: PhysicsImpostor, restitution: Number): Unit = definedExternally
    override fun sleepBody(impostor: PhysicsImpostor): Unit = definedExternally
    override fun wakeUpBody(impostor: PhysicsImpostor): Unit = definedExternally
    override fun updateDistanceJoint(joint: PhysicsJoint, maxDistance: Number, minDistance: Number?): Unit = definedExternally
    override fun setMotor(joint: IMotorEnabledJoint, speed: Number, maxForce: Number?, motorIndex: Number?): Unit = definedExternally
    override fun setLimit(joint: IMotorEnabledJoint, upperLimit: Number, lowerLimit: Number?, motorIndex: Number?): Unit = definedExternally
    override fun syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor): Unit = definedExternally
    override fun getRadius(impostor: PhysicsImpostor): Number = definedExternally
    override fun getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
}
external open class PostProcessRenderEffect(engine: Engine, name: String, getPostProcess: () -> PostProcess, singleInstance: Boolean? = definedExternally /* null */) {
    open var _engine: Any = definedExternally
    open var _postProcesses: Any = definedExternally
    open var _getPostProcess: Any = definedExternally
    open var _singleInstance: Any = definedExternally
    open var _cameras: Any = definedExternally
    open var _indicesForCamera: Any = definedExternally
    open var _renderPasses: Any = definedExternally
    open var _renderEffectAsPasses: Any = definedExternally
    open var _name: String = definedExternally
    open var applyParameters: (postProcess: PostProcess) -> Unit = definedExternally
    open var isSupported: Boolean = definedExternally
    open fun _update(): Unit = definedExternally
    open fun addPass(renderPass: PostProcessRenderPass): Unit = definedExternally
    open fun removePass(renderPass: PostProcessRenderPass): Unit = definedExternally
    open fun addRenderEffectAsPass(renderEffect: PostProcessRenderEffect): Unit = definedExternally
    open fun getPass(passName: String): Unit = definedExternally
    open fun emptyPasses(): Unit = definedExternally
    open fun _attachCameras(cameras: Camera): Any = definedExternally
    open fun _attachCameras(cameras: Array<Camera>): Any = definedExternally
    open fun _detachCameras(cameras: Camera): Any = definedExternally
    open fun _detachCameras(cameras: Array<Camera>): Any = definedExternally
    open fun _enable(cameras: Camera): Any = definedExternally
    open fun _enable(cameras: Array<Camera>): Any = definedExternally
    open fun _disable(cameras: Camera): Any = definedExternally
    open fun _disable(cameras: Array<Camera>): Any = definedExternally
    open fun getPostProcess(camera: Camera? = definedExternally /* null */): PostProcess = definedExternally
    open fun _linkParameters(): Unit = definedExternally
    open fun _linkTextures(effect: Any): Unit = definedExternally
}
external open class PostProcessRenderPass(scene: Scene, name: String, size: Number, renderList: Array<Mesh>, beforeRender: () -> Unit, afterRender: () -> Unit) {
    open var _enabled: Any = definedExternally
    open var _renderList: Any = definedExternally
    open var _renderTexture: Any = definedExternally
    open var _scene: Any = definedExternally
    open var _refCount: Any = definedExternally
    open var _name: String = definedExternally
    open fun _incRefCount(): Number = definedExternally
    open fun _decRefCount(): Number = definedExternally
    open fun _update(): Unit = definedExternally
    open fun setRenderList(renderList: Array<Mesh>): Unit = definedExternally
    open fun getRenderTexture(): RenderTargetTexture = definedExternally
}
external open class PostProcessRenderPipeline(engine: Engine, name: String) {
    open var _engine: Any = definedExternally
    open var _renderEffects: Any = definedExternally
    open var _renderEffectsForIsolatedPass: Any = definedExternally
    open var _cameras: Array<Camera> = definedExternally
    open var _name: String = definedExternally
    open var isSupported: Boolean = definedExternally
    open fun addEffect(renderEffect: PostProcessRenderEffect): Unit = definedExternally
    open fun _enableEffect(renderEffectName: String, cameras: Camera): Any = definedExternally
    open fun _enableEffect(renderEffectName: String, cameras: Array<Camera>): Any = definedExternally
    open fun _disableEffect(renderEffectName: String, cameras: Camera): Any = definedExternally
    open fun _disableEffect(renderEffectName: String, cameras: Array<Camera>): Any = definedExternally
    open fun _attachCameras(cameras: Camera, unique: Boolean): Any = definedExternally
    open fun _attachCameras(cameras: Array<Camera>, unique: Boolean): Any = definedExternally
    open fun _detachCameras(cameras: Camera): Any = definedExternally
    open fun _detachCameras(cameras: Array<Camera>): Any = definedExternally
    open fun _enableDisplayOnlyPass(passName: Any, cameras: Camera): Any = definedExternally
    open fun _enableDisplayOnlyPass(passName: Any, cameras: Array<Camera>): Any = definedExternally
    open fun _disableDisplayOnlyPass(cameras: Camera): Any = definedExternally
    open fun _disableDisplayOnlyPass(cameras: Array<Camera>): Any = definedExternally
    open fun _update(): Unit = definedExternally
    open fun _reset(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
    companion object {
        var PASS_EFFECT_NAME: Any = definedExternally
        var PASS_SAMPLER_NAME: Any = definedExternally
    }
}
external open class PostProcessRenderPipelineManager {
    open var _renderPipelines: Any = definedExternally
    open fun addPipeline(renderPipeline: PostProcessRenderPipeline): Unit = definedExternally
    open fun attachCamerasToRenderPipeline(renderPipelineName: String, cameras: Camera, unique: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun attachCamerasToRenderPipeline(renderPipelineName: String, cameras: Array<Camera>, unique: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: Camera): Any = definedExternally
    open fun detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: Array<Camera>): Any = definedExternally
    open fun enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Camera): Any = definedExternally
    open fun enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Array<Camera>): Any = definedExternally
    open fun disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Camera): Any = definedExternally
    open fun disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Array<Camera>): Any = definedExternally
    open fun enableDisplayOnlyPassInPipeline(renderPipelineName: String, passName: String, cameras: Camera): Any = definedExternally
    open fun enableDisplayOnlyPassInPipeline(renderPipelineName: String, passName: String, cameras: Array<Camera>): Any = definedExternally
    open fun disableDisplayOnlyPassInPipeline(renderPipelineName: String, cameras: Camera): Any = definedExternally
    open fun disableDisplayOnlyPassInPipeline(renderPipelineName: String, cameras: Array<Camera>): Any = definedExternally
    open fun update(): Unit = definedExternally
}
external open class CustomProceduralTexture(name: String, texturePath: Any, size: Number, scene: Scene, fallbackTexture: Texture? = definedExternally /* null */, generateMipMaps: Boolean? = definedExternally /* null */) : ProceduralTexture {
    open var _animate: Any = definedExternally
    open var _time: Any = definedExternally
    open var _config: Any = definedExternally
    open var _texturePath: Any = definedExternally
    open fun loadJson(jsonUrl: Any): Unit = definedExternally
    override fun isReady(): Boolean = definedExternally
    override fun render(useCameraPostProcess: Boolean?): Unit = definedExternally
    open fun updateTextures(): Unit = definedExternally
    open fun updateShaderUniforms(): Unit = definedExternally
    open var animate: Boolean = definedExternally
}
external open class ProceduralTexture(name: String, size: Any, fragment: Any, scene: Scene, fallbackTexture: Texture? = definedExternally /* null */, generateMipMaps: Boolean? = definedExternally /* null */, isCube: Boolean? = definedExternally /* null */) : Texture {
    override var isCube: Boolean = definedExternally
    open var _size: Any = definedExternally
    open var _generateMipMaps: Boolean = definedExternally
    open var isEnabled: Boolean = definedExternally
    open var _doNotChangeAspectRatio: Any = definedExternally
    open var _currentRefreshId: Any = definedExternally
    open var _refreshRate: Any = definedExternally
    open var onGenerated: () -> Unit = definedExternally
    open var _vertexBuffers: Any = definedExternally
    open var _indexBuffer: Any = definedExternally
    open var _effect: Any = definedExternally
    open var _uniforms: Any = definedExternally
    open var _samplers: Any = definedExternally
    open var _fragment: Any = definedExternally
    open var _textures: Array<Texture> = definedExternally
    open var _floats: Any = definedExternally
    open var _floatsArrays: Any = definedExternally
    open var _colors3: Any = definedExternally
    open var _colors4: Any = definedExternally
    open var _vectors2: Any = definedExternally
    open var _vectors3: Any = definedExternally
    open var _matrices: Any = definedExternally
    open var _fallbackTexture: Any = definedExternally
    open var _fallbackTextureUsed: Any = definedExternally
    open fun reset(): Unit = definedExternally
    override fun isReady(): Boolean = definedExternally
    open fun resetRefreshCounter(): Unit = definedExternally
    open fun setFragment(fragment: Any): Unit = definedExternally
    open var refreshRate: Number = definedExternally
    open fun _shouldRender(): Boolean = definedExternally
    open fun getRenderSize(): Number = definedExternally
    open fun resize(size: Any, generateMipMaps: Any): Unit = definedExternally
    open fun _checkUniform(uniformName: Any): Unit = definedExternally
    open fun setTexture(name: String, texture: Texture): ProceduralTexture = definedExternally
    open fun setFloat(name: String, value: Number): ProceduralTexture = definedExternally
    open fun setFloats(name: String, value: Array<Number>): ProceduralTexture = definedExternally
    open fun setColor3(name: String, value: Color3): ProceduralTexture = definedExternally
    open fun setColor4(name: String, value: Color4): ProceduralTexture = definedExternally
    open fun setVector2(name: String, value: Vector2): ProceduralTexture = definedExternally
    open fun setVector3(name: String, value: Vector3): ProceduralTexture = definedExternally
    open fun setMatrix(name: String, value: Matrix): ProceduralTexture = definedExternally
    open fun render(useCameraPostProcess: Boolean? = definedExternally /* null */): Unit = definedExternally
    override fun clone(): ProceduralTexture = definedExternally
    override fun dispose(): Unit = definedExternally
}
external open class DefaultRenderingPipeline(name: String, hdr: Boolean, scene: Scene, cameras: Array<Camera>? = definedExternally /* null */) : PostProcessRenderPipeline, IDisposable, IAnimatable {
    open var _scene: Any = definedExternally
    open var PassPostProcessId: String = definedExternally
    open var HighLightsPostProcessId: String = definedExternally
    open var BlurXPostProcessId: String = definedExternally
    open var BlurYPostProcessId: String = definedExternally
    open var CopyBackPostProcessId: String = definedExternally
    open var ImageProcessingPostProcessId: String = definedExternally
    open var FxaaPostProcessId: String = definedExternally
    open var FinalMergePostProcessId: String = definedExternally
    open var pass: BABYLON.PassPostProcess = definedExternally
    open var highlights: BABYLON.HighlightsPostProcess = definedExternally
    open var blurX: BABYLON.BlurPostProcess = definedExternally
    open var blurY: BABYLON.BlurPostProcess = definedExternally
    open var copyBack: BABYLON.PassPostProcess = definedExternally
    open var fxaa: FxaaPostProcess = definedExternally
    open var imageProcessing: ImageProcessingPostProcess = definedExternally
    open var finalMerge: BABYLON.PassPostProcess = definedExternally
    override var animations: Array<Animation> = definedExternally
    open var _bloomEnabled: Any = definedExternally
    open var _fxaaEnabled: Any = definedExternally
    open var _imageProcessingEnabled: Any = definedExternally
    open var _defaultPipelineTextureType: Any = definedExternally
    open var _bloomScale: Any = definedExternally
    open var bloomKernel: Number = definedExternally
    open var _bloomWeight: Any = definedExternally
    open var _hdr: Any = definedExternally
    open var bloomWeight: Number = definedExternally
    open var bloomScale: Number = definedExternally
    open var bloomEnabled: Boolean = definedExternally
    open var fxaaEnabled: Boolean = definedExternally
    open var imageProcessingEnabled: Boolean = definedExternally
    open fun _buildPipeline(): Unit = definedExternally
    open fun _disposePostProcesses(): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): DefaultRenderingPipeline = definedExternally
    }
}
external open class LensRenderingPipeline(name: String, parameters: Any, scene: Scene, ratio: Number? = definedExternally /* null */, cameras: Array<Camera>? = definedExternally /* null */) : PostProcessRenderPipeline {
    open var LensChromaticAberrationEffect: String = definedExternally
    open var HighlightsEnhancingEffect: String = definedExternally
    open var LensDepthOfFieldEffect: String = definedExternally
    open var _scene: Any = definedExternally
    open var _depthTexture: Any = definedExternally
    open var _grainTexture: Any = definedExternally
    open var _chromaticAberrationPostProcess: Any = definedExternally
    open var _highlightsPostProcess: Any = definedExternally
    open var _depthOfFieldPostProcess: Any = definedExternally
    open var _edgeBlur: Any = definedExternally
    open var _grainAmount: Any = definedExternally
    open var _chromaticAberration: Any = definedExternally
    open var _distortion: Any = definedExternally
    open var _highlightsGain: Any = definedExternally
    open var _highlightsThreshold: Any = definedExternally
    open var _dofDistance: Any = definedExternally
    open var _dofAperture: Any = definedExternally
    open var _dofDarken: Any = definedExternally
    open var _dofPentagon: Any = definedExternally
    open var _blurNoise: Any = definedExternally
    open fun setEdgeBlur(amount: Number): Unit = definedExternally
    open fun disableEdgeBlur(): Unit = definedExternally
    open fun setGrainAmount(amount: Number): Unit = definedExternally
    open fun disableGrain(): Unit = definedExternally
    open fun setChromaticAberration(amount: Number): Unit = definedExternally
    open fun disableChromaticAberration(): Unit = definedExternally
    open fun setEdgeDistortion(amount: Number): Unit = definedExternally
    open fun disableEdgeDistortion(): Unit = definedExternally
    open fun setFocusDistance(amount: Number): Unit = definedExternally
    open fun disableDepthOfField(): Unit = definedExternally
    open fun setAperture(amount: Number): Unit = definedExternally
    open fun setDarkenOutOfFocus(amount: Number): Unit = definedExternally
    open fun enablePentagonBokeh(): Unit = definedExternally
    open fun disablePentagonBokeh(): Unit = definedExternally
    open fun enableNoiseBlur(): Unit = definedExternally
    open fun disableNoiseBlur(): Unit = definedExternally
    open fun setHighlightsGain(amount: Number): Unit = definedExternally
    open fun setHighlightsThreshold(amount: Number): Unit = definedExternally
    open fun disableHighlights(): Unit = definedExternally
    open fun dispose(disableDepthRender: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _createChromaticAberrationPostProcess(ratio: Any): Unit = definedExternally
    open fun _createHighlightsPostProcess(ratio: Any): Unit = definedExternally
    open fun _createDepthOfFieldPostProcess(ratio: Any): Unit = definedExternally
    open fun _createGrainTexture(): Unit = definedExternally
}
external open class SSAO2RenderingPipeline(name: String, scene: Scene, ratio: Any, cameras: Array<Camera>? = definedExternally /* null */) : PostProcessRenderPipeline {
    open var SSAOOriginalSceneColorEffect: String = definedExternally
    open var SSAORenderEffect: String = definedExternally
    open var SSAOBlurHRenderEffect: String = definedExternally
    open var SSAOBlurVRenderEffect: String = definedExternally
    open var SSAOCombineRenderEffect: String = definedExternally
    open var totalStrength: Number = definedExternally
    open var maxZ: Number = definedExternally
    open var minZAspect: Number = definedExternally
    open var _samples: Any = definedExternally
    open var _sampleSphere: Any = definedExternally
    open var _samplerOffsets: Any = definedExternally
    open var samples: Number = definedExternally
    open var _expensiveBlur: Any = definedExternally
    open var expensiveBlur: Boolean = definedExternally
    open var radius: Number = definedExternally
    open var base: Number = definedExternally
    open var _scene: Any = definedExternally
    open var _depthTexture: Any = definedExternally
    open var _normalTexture: Any = definedExternally
    open var _randomTexture: Any = definedExternally
    open var _originalColorPostProcess: Any = definedExternally
    open var _ssaoPostProcess: Any = definedExternally
    open var _blurHPostProcess: Any = definedExternally
    open var _blurVPostProcess: Any = definedExternally
    open var _ssaoCombinePostProcess: Any = definedExternally
    open var _firstUpdate: Any = definedExternally
    open var _ratio: Any = definedExternally
    open fun dispose(disableGeometryBufferRenderer: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _createBlurPostProcess(ssaoRatio: Any, blurRatio: Any): Unit = definedExternally
    open fun _generateHemisphere(): Unit = definedExternally
    open fun _createSSAOPostProcess(ratio: Any): Unit = definedExternally
    open fun _createSSAOCombinePostProcess(ratio: Any): Unit = definedExternally
    open fun _createRandomTexture(): Unit = definedExternally
    companion object {
        var IsSupported: Boolean = definedExternally
    }
}
external open class SSAORenderingPipeline(name: String, scene: Scene, ratio: Any, cameras: Array<Camera>? = definedExternally /* null */) : PostProcessRenderPipeline {
    open var SSAOOriginalSceneColorEffect: String = definedExternally
    open var SSAORenderEffect: String = definedExternally
    open var SSAOBlurHRenderEffect: String = definedExternally
    open var SSAOBlurVRenderEffect: String = definedExternally
    open var SSAOCombineRenderEffect: String = definedExternally
    open var totalStrength: Number = definedExternally
    open var radius: Number = definedExternally
    open var area: Number = definedExternally
    open var fallOff: Number = definedExternally
    open var base: Number = definedExternally
    open var _scene: Any = definedExternally
    open var _depthTexture: Any = definedExternally
    open var _randomTexture: Any = definedExternally
    open var _originalColorPostProcess: Any = definedExternally
    open var _ssaoPostProcess: Any = definedExternally
    open var _blurHPostProcess: Any = definedExternally
    open var _blurVPostProcess: Any = definedExternally
    open var _ssaoCombinePostProcess: Any = definedExternally
    open var _firstUpdate: Any = definedExternally
    open var _ratio: Any = definedExternally
    open fun dispose(disableDepthRender: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _createBlurPostProcess(ratio: Any): Unit = definedExternally
    open fun _createSSAOPostProcess(ratio: Any): Unit = definedExternally
    open fun _createSSAOCombinePostProcess(ratio: Any): Unit = definedExternally
    open fun _createRandomTexture(): Unit = definedExternally
}
external open class StandardRenderingPipeline(name: String, scene: Scene, ratio: Number, originalPostProcess: PostProcess? = definedExternally /* null */, cameras: Array<Camera>? = definedExternally /* null */) : PostProcessRenderPipeline, IDisposable, IAnimatable {
    open var originalPostProcess: PostProcess = definedExternally
    open var downSampleX4PostProcess: PostProcess = definedExternally
    open var brightPassPostProcess: PostProcess = definedExternally
    open var blurHPostProcesses: Array<PostProcess> = definedExternally
    open var blurVPostProcesses: Array<PostProcess> = definedExternally
    open var textureAdderPostProcess: PostProcess = definedExternally
    open var volumetricLightPostProcess: PostProcess = definedExternally
    open var volumetricLightSmoothXPostProcess: BlurPostProcess = definedExternally
    open var volumetricLightSmoothYPostProcess: BlurPostProcess = definedExternally
    open var volumetricLightMergePostProces: PostProcess = definedExternally
    open var volumetricLightFinalPostProcess: PostProcess = definedExternally
    open var luminancePostProcess: PostProcess = definedExternally
    open var luminanceDownSamplePostProcesses: Array<PostProcess> = definedExternally
    open var hdrPostProcess: PostProcess = definedExternally
    open var textureAdderFinalPostProcess: PostProcess = definedExternally
    open var lensFlareFinalPostProcess: PostProcess = definedExternally
    open var hdrFinalPostProcess: PostProcess = definedExternally
    open var lensFlarePostProcess: PostProcess = definedExternally
    open var lensFlareComposePostProcess: PostProcess = definedExternally
    open var motionBlurPostProcess: PostProcess = definedExternally
    open var depthOfFieldPostProcess: PostProcess = definedExternally
    open var brightThreshold: Number = definedExternally
    open var blurWidth: Number = definedExternally
    open var horizontalBlur: Boolean = definedExternally
    open var exposure: Number = definedExternally
    open var lensTexture: Texture = definedExternally
    open var volumetricLightCoefficient: Number = definedExternally
    open var volumetricLightPower: Number = definedExternally
    open var volumetricLightBlurScale: Number = definedExternally
    open var sourceLight: dynamic /* SpotLight | DirectionalLight */ = definedExternally
    open var hdrMinimumLuminance: Number = definedExternally
    open var hdrDecreaseRate: Number = definedExternally
    open var hdrIncreaseRate: Number = definedExternally
    open var lensColorTexture: Texture = definedExternally
    open var lensFlareStrength: Number = definedExternally
    open var lensFlareGhostDispersal: Number = definedExternally
    open var lensFlareHaloWidth: Number = definedExternally
    open var lensFlareDistortionStrength: Number = definedExternally
    open var lensStarTexture: Texture = definedExternally
    open var lensFlareDirtTexture: Texture = definedExternally
    open var depthOfFieldDistance: Number = definedExternally
    open var depthOfFieldBlurWidth: Number = definedExternally
    open var motionStrength: Number = definedExternally
    override var animations: Array<Animation> = definedExternally
    open var _scene: Any = definedExternally
    open var _currentDepthOfFieldSource: Any = definedExternally
    open var _basePostProcess: Any = definedExternally
    open var _hdrCurrentLuminance: Any = definedExternally
    open var _floatTextureType: Any = definedExternally
    open var _ratio: Any = definedExternally
    open var _bloomEnabled: Any = definedExternally
    open var _depthOfFieldEnabled: Any = definedExternally
    open var _vlsEnabled: Any = definedExternally
    open var _lensFlareEnabled: Any = definedExternally
    open var _hdrEnabled: Any = definedExternally
    open var _motionBlurEnabled: Any = definedExternally
    open var _motionBlurSamples: Any = definedExternally
    open var _volumetricLightStepsCount: Any = definedExternally
    open var BloomEnabled: Boolean = definedExternally
    open var DepthOfFieldEnabled: Boolean = definedExternally
    open var LensFlareEnabled: Boolean = definedExternally
    open var HDREnabled: Boolean = definedExternally
    open var VLSEnabled: Boolean = definedExternally
    open var MotionBlurEnabled: Boolean = definedExternally
    open var volumetricLightStepsCount: Number = definedExternally
    open var motionBlurSamples: Number = definedExternally
    open fun _buildPipeline(): Unit = definedExternally
    open fun _createDownSampleX4PostProcess(scene: Any, ratio: Any): Unit = definedExternally
    open fun _createBrightPassPostProcess(scene: Any, ratio: Any): Unit = definedExternally
    open fun _createBlurPostProcesses(scene: Any, ratio: Any, indice: Any, blurWidthKey: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _createTextureAdderPostProcess(scene: Any, ratio: Any): Unit = definedExternally
    open fun _createVolumetricLightPostProcess(scene: Any, ratio: Any): Unit = definedExternally
    open fun _createLuminancePostProcesses(scene: Any, textureType: Any): Unit = definedExternally
    open fun _createHdrPostProcess(scene: Any, ratio: Any): Unit = definedExternally
    open fun _createLensFlarePostProcess(scene: Any, ratio: Any): Unit = definedExternally
    open fun _createDepthOfFieldPostProcess(scene: Any, ratio: Any): Unit = definedExternally
    open fun _createMotionBlurPostProcess(scene: Any, ratio: Any): Unit = definedExternally
    open fun _getDepthTexture(): Unit = definedExternally
    open fun _disposePostProcesses(): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
    open fun serialize(): Any = definedExternally
    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): StandardRenderingPipeline = definedExternally
        var LuminanceSteps: Number = definedExternally
    }
}
