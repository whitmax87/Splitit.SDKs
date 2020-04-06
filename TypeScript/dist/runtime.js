"use strict";
/* tslint:disable */
/* eslint-disable */
/**
 * splitit-web-api-public-sdk
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : new P(function (resolve) { resolve(result.value); }).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.BASE_PATH = "https://webapi.production.splitit.com".replace(/\/+$/, "");
exports.BASE_PATH_SANDBOX = "https://webapi.sandbox.splitit.com".replace(/\/+$/, "");
var isBlob = function (value) { return typeof Blob !== 'undefined' && value instanceof Blob; };
/**
 * This is the base class for all generated API classes.
 */
var BaseAPI = /** @class */ (function () {
    function BaseAPI(configuration) {
        var _this = this;
        if (configuration === void 0) { configuration = new Configuration(); }
        this.configuration = configuration;
        this.fetchApi = function (url, init) { return __awaiter(_this, void 0, void 0, function () {
            var fetchParams, _i, _a, middleware, response, _b, _c, middleware;
            return __generator(this, function (_d) {
                switch (_d.label) {
                    case 0:
                        fetchParams = { url: url, init: init };
                        _i = 0, _a = this.middleware;
                        _d.label = 1;
                    case 1:
                        if (!(_i < _a.length)) return [3 /*break*/, 4];
                        middleware = _a[_i];
                        if (!middleware.pre) return [3 /*break*/, 3];
                        return [4 /*yield*/, middleware.pre(__assign({ fetch: this.fetchApi }, fetchParams))];
                    case 2:
                        fetchParams = (_d.sent()) || fetchParams;
                        _d.label = 3;
                    case 3:
                        _i++;
                        return [3 /*break*/, 1];
                    case 4: return [4 /*yield*/, this.configuration.fetchApi(fetchParams.url, fetchParams.init)];
                    case 5:
                        response = _d.sent();
                        _b = 0, _c = this.middleware;
                        _d.label = 6;
                    case 6:
                        if (!(_b < _c.length)) return [3 /*break*/, 9];
                        middleware = _c[_b];
                        if (!middleware.post) return [3 /*break*/, 8];
                        return [4 /*yield*/, middleware.post({
                                fetch: this.fetchApi,
                                url: url,
                                init: init,
                                response: response.clone(),
                            })];
                    case 7:
                        response = (_d.sent()) || response;
                        _d.label = 8;
                    case 8:
                        _b++;
                        return [3 /*break*/, 6];
                    case 9: return [2 /*return*/, response];
                }
            });
        }); };
        this.middleware = configuration.middleware;
        this._configuration = configuration;
    }
    BaseAPI.prototype.setCulture = function (culture) {
        this._culture = culture;
    };
    BaseAPI.prototype.withMiddleware = function () {
        var _a;
        var middlewares = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            middlewares[_i] = arguments[_i];
        }
        var next = this.clone();
        next.middleware = (_a = next.middleware).concat.apply(_a, middlewares);
        return next;
    };
    BaseAPI.prototype.withPreMiddleware = function () {
        var preMiddlewares = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            preMiddlewares[_i] = arguments[_i];
        }
        var middlewares = preMiddlewares.map(function (pre) { return ({ pre: pre }); });
        return this.withMiddleware.apply(this, middlewares);
    };
    BaseAPI.prototype.withPostMiddleware = function () {
        var postMiddlewares = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            postMiddlewares[_i] = arguments[_i];
        }
        var middlewares = postMiddlewares.map(function (post) { return ({ post: post }); });
        return this.withMiddleware.apply(this, middlewares);
    };
    BaseAPI.prototype.request = function (context) {
        return __awaiter(this, void 0, void 0, function () {
            var _a, url, init, response;
            return __generator(this, function (_b) {
                switch (_b.label) {
                    case 0:
                        _a = this.createFetchParams(context), url = _a.url, init = _a.init;
                        return [4 /*yield*/, this.fetchApi(url, init)];
                    case 1:
                        response = _b.sent();
                        if (response.status >= 200 && response.status < 300) {
                            return [2 /*return*/, response];
                        }
                        throw response;
                }
            });
        });
    };
    BaseAPI.prototype.createFetchParams = function (context) {
        var url = this.configuration.basePath + context.path;
        if (context.query !== undefined && Object.keys(context.query).length !== 0) {
            // only add the querystring to the URL if there are query parameters.
            // this is done to avoid urls ending with a "?" character which buggy webservers
            // do not handle correctly sometimes.
            url += '?' + this.configuration.queryParamsStringify(context.query);
        }
        if (this._configuration && this._configuration.accessToken) {
            context.body.RequestHeader = {
                SessionId: this._configuration.accessToken
            };
            if (this._configuration.apiKey) {
                context.body.RequestHeader.ApiKey = this._configuration.apiKey;
            }
            if (this._configuration.touchPoint) {
                context.body.RequestHeader.TouchPoint = this._configuration.touchPoint;
            }
            if (this._culture) {
                context.body.RequestHeader.CultureName = this._culture;
            }
        }
        var body = (context.body instanceof FormData || context.body instanceof URLSearchParams || isBlob(context.body))
            ? context.body
            : JSON.stringify(context.body);
        var headers = Object.assign({}, this.configuration.headers, context.headers, { "Splitit-SDK": "TypeScript-1.4.2" });
        var init = {
            method: context.method,
            headers: headers,
            body: body,
            credentials: this.configuration.credentials
        };
        return { url: url, init: init };
    };
    /**
     * Create a shallow clone of `this` by constructing a new instance
     * and then shallow cloning data members.
     */
    BaseAPI.prototype.clone = function () {
        var constructor = this.constructor;
        var next = new constructor(this.configuration);
        next.middleware = this.middleware.slice();
        return next;
    };
    return BaseAPI;
}());
exports.BaseAPI = BaseAPI;
;
var RequiredError = /** @class */ (function (_super) {
    __extends(RequiredError, _super);
    function RequiredError(field, msg) {
        var _this = _super.call(this, msg) || this;
        _this.field = field;
        _this.name = "RequiredError";
        return _this;
    }
    return RequiredError;
}(Error));
exports.RequiredError = RequiredError;
exports.COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};
var Configuration = /** @class */ (function () {
    function Configuration(configuration) {
        if (configuration === void 0) { configuration = {}; }
        this.configuration = configuration;
        if (Configuration._isSandbox) {
            configuration.basePath = exports.BASE_PATH_SANDBOX;
        }
        configuration.touchPoint = Configuration._touchPoint;
    }
    Configuration.setSandbox = function () {
        Configuration._isSandbox = true;
    };
    Configuration.setTouchPoint = function (touchPoint) {
        Configuration._touchPoint = touchPoint;
    };
    Configuration.serverSide = function (apiKey, sessionId) {
        throw "Unsupported method. For server side code, please use our NodeJS package. For list of available languages supported, visit https://github.com/Splitit/Splitit.SDKs";
    };
    Configuration.clientSide = function (publicToken) {
        return new Configuration({
            accessToken: publicToken
        });
    };
    Object.defineProperty(Configuration.prototype, "basePath", {
        get: function () {
            return this.configuration.basePath || exports.BASE_PATH;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Configuration.prototype, "fetchApi", {
        get: function () {
            return this.configuration.fetchApi || window.fetch.bind(window);
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Configuration.prototype, "middleware", {
        get: function () {
            return this.configuration.middleware || [];
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Configuration.prototype, "queryParamsStringify", {
        get: function () {
            return this.configuration.queryParamsStringify || querystring;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Configuration.prototype, "username", {
        get: function () {
            return this.configuration.username;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Configuration.prototype, "password", {
        get: function () {
            return this.configuration.password;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Configuration.prototype, "apiKey", {
        get: function () {
            var apiKey = this.configuration.apiKey;
            if (apiKey) {
                return apiKey;
            }
            return undefined;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Configuration.prototype, "touchPoint", {
        get: function () {
            var touchPoint = this.configuration.touchPoint;
            if (touchPoint) {
                return touchPoint;
            }
            return undefined;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Configuration.prototype, "accessToken", {
        get: function () {
            var accessToken = this.configuration.accessToken;
            if (accessToken) {
                return accessToken;
            }
            return undefined;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Configuration.prototype, "headers", {
        get: function () {
            return this.configuration.headers;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Configuration.prototype, "credentials", {
        get: function () {
            return this.configuration.credentials;
        },
        enumerable: true,
        configurable: true
    });
    return Configuration;
}());
exports.Configuration = Configuration;
function exists(json, key) {
    var value = json[key];
    return value !== null && value !== undefined;
}
exports.exists = exists;
function querystring(params, prefix) {
    if (prefix === void 0) { prefix = ''; }
    return Object.keys(params)
        .map(function (key) {
        var fullKey = prefix + (prefix.length ? "[" + key + "]" : key);
        var value = params[key];
        if (value instanceof Array) {
            var multiValue = value.map(function (singleValue) { return encodeURIComponent(String(singleValue)); })
                .join("&" + encodeURIComponent(fullKey) + "=");
            return encodeURIComponent(fullKey) + "=" + multiValue;
        }
        if (value instanceof Object) {
            return querystring(value, fullKey);
        }
        return encodeURIComponent(fullKey) + "=" + encodeURIComponent(String(value));
    })
        .filter(function (part) { return part.length > 0; })
        .join('&');
}
exports.querystring = querystring;
function mapValues(data, fn) {
    return Object.keys(data).reduce(function (acc, key) {
        var _a;
        return (__assign({}, acc, (_a = {}, _a[key] = fn(data[key]), _a)));
    }, {});
}
exports.mapValues = mapValues;
function canConsumeForm(consumes) {
    for (var _i = 0, consumes_1 = consumes; _i < consumes_1.length; _i++) {
        var consume = consumes_1[_i];
        if ('multipart/form-data' === consume.contentType) {
            return true;
        }
    }
    return false;
}
exports.canConsumeForm = canConsumeForm;
var JSONApiResponse = /** @class */ (function () {
    function JSONApiResponse(raw, transformer) {
        if (transformer === void 0) { transformer = function (jsonValue) { return jsonValue; }; }
        this.raw = raw;
        this.transformer = transformer;
    }
    JSONApiResponse.prototype.value = function () {
        return __awaiter(this, void 0, void 0, function () {
            var result, _a;
            return __generator(this, function (_b) {
                switch (_b.label) {
                    case 0:
                        _a = this.transformer;
                        return [4 /*yield*/, this.raw.json()];
                    case 1:
                        result = _a.apply(this, [_b.sent()]);
                        if (result.responseHeader && !result.responseHeader.succeeded) {
                            throw result.responseHeader.errors;
                        }
                        return [2 /*return*/, result];
                }
            });
        });
    };
    return JSONApiResponse;
}());
exports.JSONApiResponse = JSONApiResponse;
var VoidApiResponse = /** @class */ (function () {
    function VoidApiResponse(raw) {
        this.raw = raw;
    }
    VoidApiResponse.prototype.value = function () {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                return [2 /*return*/, undefined];
            });
        });
    };
    return VoidApiResponse;
}());
exports.VoidApiResponse = VoidApiResponse;
var BlobApiResponse = /** @class */ (function () {
    function BlobApiResponse(raw) {
        this.raw = raw;
    }
    BlobApiResponse.prototype.value = function () {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0: return [4 /*yield*/, this.raw.blob()];
                    case 1: return [2 /*return*/, _a.sent()];
                }
            });
        });
    };
    ;
    return BlobApiResponse;
}());
exports.BlobApiResponse = BlobApiResponse;
var TextApiResponse = /** @class */ (function () {
    function TextApiResponse(raw) {
        this.raw = raw;
    }
    TextApiResponse.prototype.value = function () {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0: return [4 /*yield*/, this.raw.text()];
                    case 1: return [2 /*return*/, _a.sent()];
                }
            });
        });
    };
    ;
    return TextApiResponse;
}());
exports.TextApiResponse = TextApiResponse;
