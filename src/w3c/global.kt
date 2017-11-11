import BABYLON.Gamepad
import org.w3c.dom.Navigator
import org.w3c.webvr.VRDisplay

external val navigator: Navigator = definedExternally

//@Suppress("NOTHING_TO_INLINE")
//inline fun Navigator.getVRDisplays(): Promise<Array<VRDisplay>> = asDynamic().getVRDisplays()

@Suppress("NOTHING_TO_INLINE")
inline var Navigator.getVRDisplays: () -> Promise<Array<VRDisplay>>
    get() = asDynamic().getVRDisplays
    set(noinline value) {
        asDynamic().getVRDisplays = value
    }

@Suppress("NOTHING_TO_INLINE")
inline fun Navigator.getGamepads(): Array<Gamepad> = asDynamic().getGamepads()

@Suppress("NOTHING_TO_INLINE")
inline var Navigator.activeVRDisplays: Array<VRDisplay>
    get() = asDynamic().activeVRDisplays
    set(value) {
        asDynamic().activeVRDisplays = value
    }

interface Promise<T> {
    fun then(onFulfilled: ((value: T) -> dynamic /* IThenable<T> | T */)? = null, onTejected: ((error: Any) -> dynamic /* IThenable<T> | T */)? = null): Promise<T>
    fun catch(onTejected: ((error: Any) -> dynamic /* IThenable<T> | T */)? = null): Promise<T>
    fun done(onFulfilled: ((value: T) -> dynamic /* IThenable<T> | T */)? = null, onTejected: ((error: Any) -> dynamic /* IThenable<T> | T */)? = null): Promise<T>
    fun nodeify(callback: Function<T>): Promise<T>
}