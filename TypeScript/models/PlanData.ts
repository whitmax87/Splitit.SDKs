/* tslint:disable */
/* eslint-disable */
/**
 * splitit-web-api-public
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
    PlanStrategy,
    PlanStrategyFromJSON,
    PlanStrategyFromJSONTyped,
    PlanStrategyToJSON,
    PurchaseMethod,
    PurchaseMethodFromJSON,
    PurchaseMethodFromJSONTyped,
    PurchaseMethodToJSON,
    TerminalRef,
    TerminalRefFromJSON,
    TerminalRefFromJSONTyped,
    TerminalRefToJSON,
    TestModes,
    TestModesFromJSON,
    TestModesFromJSONTyped,
    TestModesToJSON,
} from './';

/**
 * 
 * @export
 * @interface PlanData
 */
export interface PlanData {
    /**
     * 
     * @type {number}
     * @memberof PlanData
     */
    numberOfInstallments?: number;
    /**
     * 
     * @type {MoneyWithCurrencyCode}
     * @memberof PlanData
     */
    amount?: MoneyWithCurrencyCode;
    /**
     * 
     * @type {MoneyWithCurrencyCode}
     * @memberof PlanData
     */
    firstInstallmentAmount?: MoneyWithCurrencyCode;
    /**
     * 
     * @type {string}
     * @memberof PlanData
     */
    refOrderNumber?: string;
    /**
     * 
     * @type {TestModes}
     * @memberof PlanData
     */
    testMode?: TestModes;
    /**
     * 
     * @type {PurchaseMethod}
     * @memberof PlanData
     */
    purchaseMethod?: PurchaseMethod;
    /**
     * 
     * @type {PlanStrategy}
     * @memberof PlanData
     */
    strategy?: PlanStrategy;
    /**
     * 
     * @type {{ [key: string]: string; }}
     * @memberof PlanData
     */
    extendedParams?: { [key: string]: string; };
    /**
     * 
     * @type {Date}
     * @memberof PlanData
     */
    firstChargeDate?: Date;
    /**
     * 
     * @type {TerminalRef}
     * @memberof PlanData
     */
    terminal?: TerminalRef;
    /**
     * 
     * @type {boolean}
     * @memberof PlanData
     */
    autoCapture?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof PlanData
     */
    isFunded?: boolean;
    /**
     * 
     * @type {object}
     * @memberof PlanData
     */
    attempt3DSecure?: object;
}

export function PlanDataFromJSON(json: any): PlanData {
    return PlanDataFromJSONTyped(json, false);
}

export function PlanDataFromJSONTyped(json: any, ignoreDiscriminator: boolean): PlanData {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'numberOfInstallments': !exists(json, 'NumberOfInstallments') ? undefined : json['NumberOfInstallments'],
        'amount': !exists(json, 'Amount') ? undefined : MoneyWithCurrencyCodeFromJSON(json['Amount']),
        'firstInstallmentAmount': !exists(json, 'FirstInstallmentAmount') ? undefined : MoneyWithCurrencyCodeFromJSON(json['FirstInstallmentAmount']),
        'refOrderNumber': !exists(json, 'RefOrderNumber') ? undefined : json['RefOrderNumber'],
        'testMode': !exists(json, 'TestMode') ? undefined : TestModesFromJSON(json['TestMode']),
        'purchaseMethod': !exists(json, 'PurchaseMethod') ? undefined : PurchaseMethodFromJSON(json['PurchaseMethod']),
        'strategy': !exists(json, 'Strategy') ? undefined : PlanStrategyFromJSON(json['Strategy']),
        'extendedParams': !exists(json, 'ExtendedParams') ? undefined : json['ExtendedParams'],
        'firstChargeDate': !exists(json, 'FirstChargeDate') ? undefined : (new Date(json['FirstChargeDate'])),
        'terminal': !exists(json, 'Terminal') ? undefined : TerminalRefFromJSON(json['Terminal']),
        'autoCapture': !exists(json, 'AutoCapture') ? undefined : json['AutoCapture'],
        'isFunded': !exists(json, 'IsFunded') ? undefined : json['IsFunded'],
        'attempt3DSecure': !exists(json, 'Attempt3DSecure') ? undefined : json['Attempt3DSecure'],
    };
}

export function PlanDataToJSON(value?: PlanData | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'NumberOfInstallments': value.numberOfInstallments,
        'Amount': MoneyWithCurrencyCodeToJSON(value.amount),
        'FirstInstallmentAmount': MoneyWithCurrencyCodeToJSON(value.firstInstallmentAmount),
        'RefOrderNumber': value.refOrderNumber,
        'TestMode': TestModesToJSON(value.testMode),
        'PurchaseMethod': PurchaseMethodToJSON(value.purchaseMethod),
        'Strategy': PlanStrategyToJSON(value.strategy),
        'ExtendedParams': value.extendedParams,
        'FirstChargeDate': value.firstChargeDate === undefined ? undefined : (value.firstChargeDate.toISOString()),
        'Terminal': TerminalRefToJSON(value.terminal),
        'AutoCapture': value.autoCapture,
        'IsFunded': value.isFunded,
        'Attempt3DSecure': value.attempt3DSecure,
    };
}


