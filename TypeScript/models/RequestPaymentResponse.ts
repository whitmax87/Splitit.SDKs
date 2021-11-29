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
    ResponseHeader,
    ResponseHeaderFromJSON,
    ResponseHeaderFromJSONTyped,
    ResponseHeaderToJSON,
} from './';

/**
 * 
 * @export
 * @interface RequestPaymentResponse
 */
export interface RequestPaymentResponse {
    /**
     * 
     * @type {ResponseHeader}
     * @memberof RequestPaymentResponse
     */
    responseHeader?: ResponseHeader;
}

export function RequestPaymentResponseFromJSON(json: any): RequestPaymentResponse {
    return RequestPaymentResponseFromJSONTyped(json, false);
}

export function RequestPaymentResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): RequestPaymentResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'responseHeader': !exists(json, 'ResponseHeader') ? undefined : ResponseHeaderFromJSON(json['ResponseHeader']),
    };
}

export function RequestPaymentResponseToJSON(value?: RequestPaymentResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'ResponseHeader': ResponseHeaderToJSON(value.responseHeader),
    };
}

