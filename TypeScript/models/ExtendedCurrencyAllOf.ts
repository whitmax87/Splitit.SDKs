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
/**
 * 
 * @export
 * @interface ExtendedCurrencyAllOf
 */
export interface ExtendedCurrencyAllOf {
    /**
     * 
     * @type {number}
     * @memberof ExtendedCurrencyAllOf
     */
    decimalPlaces: number;
}

export function ExtendedCurrencyAllOfFromJSON(json: any): ExtendedCurrencyAllOf {
    return ExtendedCurrencyAllOfFromJSONTyped(json, false);
}

export function ExtendedCurrencyAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): ExtendedCurrencyAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'decimalPlaces': json['DecimalPlaces'],
    };
}

export function ExtendedCurrencyAllOfToJSON(value?: ExtendedCurrencyAllOf | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'DecimalPlaces': value.decimalPlaces,
    };
}


