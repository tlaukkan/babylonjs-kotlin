@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("org.w3c.webaudio")
package org.w3c.webaudio

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

external interface AudioContext {
    var destination: AudioDestinationNode
    var sampleRate: Number
    var currentTime: Number
    var listener: AudioListener
    var activeSourceCount: Number
    fun createBuffer(numberOfChannels: Number, length: Number, sampleRate: Number): AudioBuffer
    fun createBuffer(buffer: ArrayBuffer, mixToMono: Boolean): AudioBuffer
    fun decodeAudioData(audioData: ArrayBuffer, successCallback: Any, errorCallback: Any? = definedExternally /* null */)
    fun createBufferSource(): AudioBufferSourceNode
    fun createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode
    fun createMediaStreamSource(mediaStream: Any): MediaStreamAudioSourceNode
    fun createScriptProcessor(bufferSize: Number, numberOfInputChannels: Number? = definedExternally /* null */, numberOfOutputChannels: Number? = definedExternally /* null */): ScriptProcessorNode
    fun createAnalyser(): AnalyserNode
    fun createGain(): GainNode
    fun createDelay(maxDelayTime: Number? = definedExternally /* null */): DelayNode
    fun createBiquadFilter(): BiquadFilterNode
    fun createWaveShaper(): WaveShaperNode
    fun createPanner(): PannerNode
    fun createConvolver(): ConvolverNode
    fun createChannelSplitter(numberOfOutputs: Number? = definedExternally /* null */): ChannelSplitterNode
    fun createChannelMerger(numberOfInputs: Number? = definedExternally /* null */): ChannelMergerNode
    fun createDynamicsCompressor(): DynamicsCompressorNode
    fun createOscillator(): OscillatorNode
    fun createWaveTable(real: Any, imag: Any): WaveTable
}
external var webkitAudioContext: Any = definedExternally
external interface OfflineRenderSuccessCallback {
    @nativeInvoke
    operator fun invoke(renderedData: AudioBuffer)
}
external interface OfflineAudioContext : AudioContext {
    fun startRendering()
    var oncomplete: OfflineRenderSuccessCallback
}
external var webkitOfflineAudioContext: Any = definedExternally
external interface AudioNode {
    fun connect(destination: AudioNode, output: Number? = definedExternally /* null */, input: Number? = definedExternally /* null */)
    fun connect(destination: AudioParam, output: Number? = definedExternally /* null */)
    fun disconnect(output: Number? = definedExternally /* null */)
    var context: AudioContext
    var numberOfInputs: Number
    var numberOfOutputs: Number
}
external interface AudioSourceNode : AudioNode
external interface AudioDestinationNode : AudioNode {
    var maxNumberOfChannels: Number
    var numberOfChannels: Number
}
external interface AudioParam {
    var value: Number
    var minValue: Number
    var maxValue: Number
    var defaultValue: Number
    fun setValueAtTime(value: Number, startTime: Number)
    fun linearRampToValueAtTime(value: Number, time: Number)
    fun exponentialRampToValueAtTime(value: Number, endTime: Number)
    fun setTargetValueAtTime(target: Number, startTime: Number, timeConstant: Number)
    fun setValueCurveAtTime(values: Float32Array, time: Number, duration: Number)
    fun cancelScheduledValues(startTime: Number)
}
external interface GainNode : AudioNode {
    var gain: AudioParam
}
external interface DelayNode : AudioNode {
    var delayTime: AudioParam
}
external interface AudioBuffer {
    var sampleRate: Number
    var length: Number
    var duration: Number
    var numberOfChannels: Number
    fun getChannelData(channel: Number): Float32Array
}
external interface AudioBufferSourceNode : AudioSourceNode {
    var playbackState: Number
    var buffer: AudioBuffer
    var playbackRate: AudioParam
    var loop: Boolean
    var loopStart: Number
    var loopEnd: Number
    var onended: EventListener
    fun start(`when`: Number, offset: Number? = definedExternally /* null */, duration: Number? = definedExternally /* null */)
    fun stop(`when`: Number)
}
external interface MediaElementAudioSourceNode : AudioSourceNode
external interface ScriptProcessorNode : AudioNode {
    var onaudioprocess: EventListener
    var bufferSize: Number
}
external interface AudioProcessingEvent : Event {
    var node: ScriptProcessorNode
    var playbackTime: Number
    var inputBuffer: AudioBuffer
    var outputBuffer: AudioBuffer
}
external enum class PanningModelType {
    equalpower,
    HRTF,
    soundfield
}
external enum class DistanceModelType {
    linear,
    inverse,
    exponential
}
external interface PannerNode : AudioNode {
    var panningModel: PanningModelType
    fun setPosition(x: Number, y: Number, z: Number)
    fun setOrientation(x: Number, y: Number, z: Number)
    fun setVelocity(x: Number, y: Number, z: Number)
    var distanceModel: DistanceModelType
    var refDistance: Number
    var maxDistance: Number
    var rolloffFactor: Number
    var coneInnerAngle: Number
    var coneOuterAngle: Number
    var coneOuterGain: Number
}
external interface AudioListener {
    var dopplerFactor: Number
    var speedOfSound: Number
    fun setPosition(x: Number, y: Number, z: Number)
    fun setOrientation(x: Number, y: Number, z: Number, xUp: Number, yUp: Number, zUp: Number)
    fun setVelocity(x: Number, y: Number, z: Number)
}
external interface ConvolverNode : AudioNode {
    var buffer: AudioBuffer
    var normalize: Boolean
}
external interface AnalyserNode : AudioNode {
    fun getFloatFrequencyData(array: Any)
    fun getByteFrequencyData(array: Any)
    fun getByteTimeDomainData(array: Any)
    var fftSize: Number
    var frequencyBinCount: Number
    var minDecibels: Number
    var maxDecibels: Number
    var smoothingTimeConstant: Number
}
external interface ChannelSplitterNode : AudioNode
external interface ChannelMergerNode : AudioNode
external interface DynamicsCompressorNode : AudioNode {
    var threshold: AudioParam
    var knee: AudioParam
    var ratio: AudioParam
    var reduction: AudioParam
    var attack: AudioParam
    var release: AudioParam
}
external enum class BiquadFilterType {
    lowpass,
    highpass,
    bandpass,
    lowshelf,
    highshelf,
    peaking,
    notch,
    allpass
}
external interface BiquadFilterNode : AudioNode {
    var type: BiquadFilterType
    var frequency: AudioParam
    var Q: AudioParam
    var gain: AudioParam
    fun getFrequencyResponse(frequencyHz: Any, magResponse: Any, phaseResponse: Any)
}
external interface WaveShaperNode : AudioNode {
    var curve: Float32Array
}
external enum class OscillatorType {
    sine,
    square,
    sawtooth,
    triangle,
    custom
}
external interface OscillatorNode : AudioSourceNode {
    var type: OscillatorType
    var playbackState: Number
    var frequency: AudioParam
    var detune: AudioParam
    fun start(`when`: Number)
    fun stop(`when`: Number)
    fun setWaveTable(waveTable: WaveTable)
}
external interface WaveTable
external interface MediaStreamAudioSourceNode : AudioSourceNode
