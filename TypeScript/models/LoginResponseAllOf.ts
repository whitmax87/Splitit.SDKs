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

import { exists, mapValues } from '../runtime';
import {
    ResponseStatus,
    ResponseStatusFromJSON,
    ResponseStatusFromJSONTyped,
    ResponseStatusToJSON,
} from './';

/**
 * 
 * @export
 * @interface LoginResponseAllOf
 */
export interface LoginResponseAllOf {
    /**
     * 
     * @type {number}
     * @memberof LoginResponseAllOf
     */
    result: number;
    /**
     * 
     * @type {ResponseStatus}
     * @memberof LoginResponseAllOf
     */
    responseStatus?: ResponseStatus;
}

export function LoginResponseAllOfFromJSON(json: any): LoginResponseAllOf {
    return LoginResponseAllOfFromJSONTyped(json, false);
}

export function LoginResponseAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): LoginResponseAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'result': json['Result'],
        'responseStatus': !exists(json, 'ResponseStatus') ? undefined : ResponseStatusFromJSON(json['ResponseStatus']),
    };
}

export function LoginResponseAllOfToJSON(value?: LoginResponseAllOf | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'Result': value.result,
        'ResponseStatus': ResponseStatusToJSON(value.responseStatus),
    };
}


