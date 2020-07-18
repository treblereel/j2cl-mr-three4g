/**
 * @externs
 */

/**
 * @const
 */
var THREE = {};

/**
 * @constructor
 */
THREE.AudioLoader

/**
 * @constructor
 */
THREE.EventDispatcher = function() {};

/**
 * @constructor
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Float32BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Float64BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Int8BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Int16BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Int32BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @param {THREE.LoadingManager=} manager
 */
THREE.Loader = function(manager) {};

/**
 * @constructor
 * @param {Function=} onLoad
 * @param {Function=} onProgress
 * @param {Function=} onError
 */
THREE.LoadingManager = function(onLoad, onProgress, onError) {};

/**
 * @constructor
 * @extends {THREE.EventDispatcher}
 * @param {Object=} parameters
 */
THREE.Material = function(parameters) {};

/**
 * @constructor
 * @extends {THREE.EventDispatcher}
 */
THREE.Object3D = function() {};

/**
 * @constructor
 * @extends {THREE.Object3D}
 * @param {THREE.SpriteMaterial=} material
 */
THREE.Sprite = function(material) {};

/**
 * @constructor
 * @extends {THREE.Material}
 * @param {Object=} parameters
 */
THREE.SpriteMaterial = function(parameters) {};

/**
 * @constructor
 * @extends {THREE.EventDispatcher}
 * @param {!HTMLImageElement=} image
 * @param {number=} mapping
 * @param {number=} wrapS
 * @param {number=} wrapT
 * @param {number=} magFilter
 * @param {number=} minFilter
 * @param {number=} format
 * @param {number=} type
 * @param {number=} anisotropy
 */
THREE.Texture = function(image, mapping, wrapS, wrapT, magFilter, minFilter, format, type, anisotropy) {};

/**
 * @constructor
 * @extends {THREE.Loader}
 */
THREE.TextureLoader = function() {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {THREE.Vector3} a
 * @param {THREE.Vector3} b
 * @param {THREE.Vector3} c
 */
THREE.Triangle = function(a, b, c) {};

/**
 * @param {THREE.Vector3} target
 */
THREE.Triangle.getNormal = function(target) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Uint8BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Uint8ClampedBufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Uint16BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Uint32BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @param {number=} x
 * @param {number=} y
 */
THREE.Vector2 = function(x, y) {};

/**
 * @constructor
 * @param {number=} x
 * @param {number=} y
 * @param {number=} z
 */
THREE.Vector3 = function(x, y, z) {};

/**
 * @constructor
 * @param {number=} x
 * @param {number=} y
 * @param {number=} z
 * @param {number=} w
 */
THREE.Vector4 = function(x, y, z, w) {};

/**
 * @constructor
 * @extends {THREE.Texture}
 * @param {!HTMLVideoElement=} video
 * @param {number=} mapping
 * @param {number=} wrapS
 * @param {number=} wrapT
 * @param {number=} magFilter
 * @param {number=} minFilter
 * @param {number=} format
 * @param {number=} type
 * @param {number=} anisotropy
 */
THREE.VideoTexture = function(video, mapping, wrapS, wrapT, magFilter, minFilter, format, type, anisotropy) {};