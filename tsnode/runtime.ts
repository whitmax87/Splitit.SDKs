import {TouchPoint} from './model/touchPoint';
import {BASE_PATH, BASE_PATH_SANDBOX} from './model/models';

export interface ConfigurationParameters {
    basePath: string;
    touchPoint?: TouchPoint;
    apiKey?: string;
}

export class Configuration {
    public static sandbox: Configuration;
    public static default: Configuration;

    private _basePath: string;
    private _touchPoint?: TouchPoint;
    private _apiKey?: string;

    constructor(parameters?: ConfigurationParameters) {
        this._basePath = BASE_PATH;

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
        }
    }

    static ensureDefaults(){
        if (!Configuration.sandbox){
            Configuration.sandbox = new Configuration({ basePath: BASE_PATH_SANDBOX });
        }

        if (!Configuration.default){
            Configuration.default = new Configuration({ basePath: BASE_PATH });
        }
    }

    public setTouchPoint(touchPoint: TouchPoint): void {
        this._touchPoint = touchPoint;
    }

    public addApiKey(apiKey: string) {
        this._apiKey = apiKey;
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
}

Configuration.ensureDefaults();