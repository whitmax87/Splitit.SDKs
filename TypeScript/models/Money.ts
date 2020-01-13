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
} from './';

/**
 * 
 * @export
 * @interface Money
 */
export interface Money {
    /**
     * 
     * @type {number}
     * @memberof Money
     */
    value: number;
    /**
     * 
     * @type {Currency}
     * @memberof Money
     */
    currency?: Currency;
}

export function MoneyFromJSON(json: any): Money {
    return MoneyFromJSONTyped(json, false);
}

export function MoneyFromJSONTyped(json: any, ignoreDiscriminator: boolean): Money {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'value': json['Value'],
        'currency': !exists(json, 'Currency') ? undefined : CurrencyFromJSON(json['Currency']),
    };
}

export function MoneyToJSON(value?: Money | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'Value': value.value,
        'Currency': CurrencyToJSON(value.currency),
    };
}

