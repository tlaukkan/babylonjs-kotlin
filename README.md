# BabylonJS Kotlin Bindings

This project is work in progress to create Kotlin bindings for BabylonJS.

Basic startup tutorial is tested to work.

## Usage in projects

Copy the babylon and w3c folders under src director to your projects KotlinJS src directory.
Copy babylon.js to your directory containing javascript libraries.

## Testing

Open 'kotlin-test.html' in browser and compare with 'javascript-test.html'.

## Procedure used to generate bindings.

npm install -g ts2kt
ts2kt babylon.d.ts

- Fixed ts2kt errors:
    - ts2kt: "TypeQuery" kind unsupported yet here! (babylon.d.ts:170:30 to 170:46)
        - replaced 'typeof enableOfflineSupport' with boolean
    - ts2kt: "SymbolKeyword" kind unsupported yet here! (babylon.d.ts:14068:81 to 14068:88)
        - replaced 'string | symbol' with any
        - ts2kt: "SymbolKeyword" kind unsupported yet here! (babylon.d.ts:14069:90 to 14069:97)
        - ts2kt: "SymbolKeyword" kind unsupported yet here! (babylon.d.ts:14070:89 to 14070:96)
        - ts2kt: "SymbolKeyword" kind unsupported yet here! (babylon.d.ts:14071:100 to 14071:107)
        - ts2kt: "SymbolKeyword" kind unsupported yet here! (babylon.d.ts:14072:90 to 14072:97)
        - ts2kt: "SymbolKeyword" kind unsupported yet here! (babylon.d.ts:14073:90 to 14073:97)
        - ts2kt: "SymbolKeyword" kind unsupported yet here! (babylon.d.ts:14074:96 to 14074:103)
        - ts2kt: "SymbolKeyword" kind unsupported yet here! (babylon.d.ts:14075:94 to 14075:101)
        - ts2kt: "SymbolKeyword" kind unsupported yet here! (babylon.d.ts:14076:89 to 14076:96)
        - ts2kt: "SymbolKeyword" kind unsupported yet here! (babylon.d.ts:14077:111 to 14077:118)
    - ts2kt: Merging Variable and ??? unsupported yet, a: var Window.VRFrameData: Any get() = definedExternally; set(value) = definedExternally
    , b: var VRFrameData: Any = definedExternally
        - removed property Window.VRFrameData
    - ts2kt: Merging Variable and ??? unsupported yet, a: var WebGLTexture.references: Number get() = definedExternally; set(value) = definedExternally
    , b: var WebGLBuffer.references: Number get() = definedExternally; set(value) = definedExternally
        - removed property WebGLBuffer.references

- Fixed generated kt files
    - Fixed imports
    - Replaced 'IndicesArray with number[]'
    - Fixed numerous inconsistencies in inheritance
    - Added dom interfaces missing from current kotlin js library.