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
    MoneyWithCurrencyCode,
    MoneyWithCurrencyCodeFromJSON,
    MoneyWithCurrencyCodeFromJSONTyped,
    MoneyWithCurrencyCodeToJSON,
} from './';

/**
 * 
 * @export
 * @interface ExternalAuth
 */
export interface ExternalAuth {
    /**
     * 
     * @type {string}
     * @memberof ExternalAuth
     */
    uniqueGatewayAuthID?: string;
    /**
     * 
     * @type {Date}
     * @memberof ExternalAuth
     */
    date: Date;
    /**
     * 
     * @type {MoneyWithCurrencyCode}
     * @memberof ExternalAuth
     */
    amount?: MoneyWithCurrencyCode;
    /**
     * 
     * @type {string}
     * @memberof ExternalAuth
     */
    transactionFullLog?: string;
}

export function ExternalAuthFromJSON(json: any): ExternalAuth {
    return ExternalAuthFromJSONTyped(json, false);
}

export function ExternalAuthFromJSONTyped(json: any, ignoreDiscriminator: boolean): ExternalAuth {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'uniqueGatewayAuthID': !exists(json, 'UniqueGatewayAuthID') ? undefined : json['UniqueGatewayAuthID'],
        'date': (new Date(json['Date'])),
        'amount': !exists(json, 'Amount') ? undefined : MoneyWithCurrencyCodeFromJSON(json['Amount']),
        'transactionFullLog': !exists(json, 'TransactionFullLog') ? undefined : json['TransactionFullLog'],
    };
}

export function ExternalAuthToJSON(value?: ExternalAuth | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'UniqueGatewayAuthID': value.uniqueGatewayAuthID,
        'Date': (value.date.toISOString()),
        'Amount': MoneyWithCurrencyCodeToJSON(value.amount),
        'TransactionFullLog': value.transactionFullLog,
    };
}


