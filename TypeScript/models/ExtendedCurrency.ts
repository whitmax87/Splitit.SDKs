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
    Currency,
    CurrencyFromJSON,
    CurrencyFromJSONTyped,
    CurrencyToJSON,
    ExtendedCurrencyAllOf,
    ExtendedCurrencyAllOfFromJSON,
    ExtendedCurrencyAllOfFromJSONTyped,
    ExtendedCurrencyAllOfToJSON,
} from './';

/**
 * 
 * @export
 * @interface ExtendedCurrency
 */
export interface ExtendedCurrency {
    /**
     * 
     * @type {number}
     * @memberof ExtendedCurrency
     */
    id: number;
    /**
     * 
     * @type {string}
     * @memberof ExtendedCurrency
     */
    code?: string;
    /**
     * 
     * @type {string}
     * @memberof ExtendedCurrency
     */
    description?: string;
    /**
     * 
     * @type {string}
     * @memberof ExtendedCurrency
     */
    symbol?: string;
    /**
     * 
     * @type {number}
     * @memberof ExtendedCurrency
     */
    decimalPlaces: number;
}

export function ExtendedCurrencyFromJSON(json: any): ExtendedCurrency {
    return ExtendedCurrencyFromJSONTyped(json, false);
}

export function ExtendedCurrencyFromJSONTyped(json: any, ignoreDiscriminator: boolean): ExtendedCurrency {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['Id'],
        'code': !exists(json, 'Code') ? undefined : json['Code'],
        'description': !exists(json, 'Description') ? undefined : json['Description'],
        'symbol': !exists(json, 'Symbol') ? undefined : json['Symbol'],
        'decimalPlaces': json['DecimalPlaces'],
    };
}

export function ExtendedCurrencyToJSON(value?: ExtendedCurrency | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'Id': value.id,
        'Code': value.code,
        'Description': value.description,
        'Symbol': value.symbol,
        'DecimalPlaces': value.decimalPlaces,
    };
}


