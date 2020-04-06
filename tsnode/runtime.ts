import {TouchPoint} from './model/touchPoint';
import {BASE_PATH, BASE_PATH_SANDBOX} from './model/models';

export interface ConfigurationParameters {
    basePath: string;
    touchPoint?: TouchPoint;
    apiKey?: string;
    sessionId?: string;
}

export class Configuration {
    private static defaults: ConfigurationParameters;

    private _basePath: string;
    private _touchPoint?: TouchPoint;
    private _apiKey?: string;
    private _sessionId?: string;

    constructor(parameters?: ConfigurationParameters) {
        this._basePath = Configuration.defaults.basePath;
        this._touchPoint = Configuration.defaults.touchPoint;
        this._apiKey = Configuration.defaults.apiKey;
        this._sessionId = Configuration.defaults.sessionId;

        if (parameters){
            if (parameters.apiKey){
                this._apiKey = parameters.apiKey;
            }
            if (parameters.basePath){
                this._basePath = parameters.basePath;
            }
            if (parameters.touchPoint){
                this._touchPoint = parameters.touchPoint;
            }
            if (parameters.sessionId){
                this._sessionId = parameters.sessionId;
            }
        }
    }

    static ensureDefaults(){
        if (!Configuration.defaults){
            Configuration.defaults = {
                basePath: BASE_PATH
            };
        }
    }

    static setSandbox(): void {
        Configuration.defaults.basePath = BASE_PATH_SANDBOX;
    }

    static setTouchPoint(touchPoint: TouchPoint): void {
        Configuration.defaults.touchPoint = touchPoint;
    }

    static default() : Configuration {
        return new Configuration();
    }

    static authenticate(apiKey: string, sessionId: string) {
        Configuration.defaults.apiKey = apiKey;
        Configuration.defaults.sessionId = sessionId;
    }

    get basePath(): string {
        return this._basePath;
    }

    get apiKey(): string | undefined {
        const apiKey = this._apiKey;
        if (apiKey) {
            return apiKey;
        }
        return undefined;
    }

    get touchPoint(): TouchPoint | undefined {
        const touchPoint = this._touchPoint;
        if (touchPoint) {
            return touchPoint;
        }
        return undefined;
    }

    get sessionId(): string | undefined {
        const sessionId = this._sessionId;
        if (sessionId) {
            return sessionId;
        }
        return undefined;
    }
}

Configuration.ensureDefaults();