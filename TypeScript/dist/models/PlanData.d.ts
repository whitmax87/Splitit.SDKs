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
import { MoneyWithCurrencyCode, PlanStrategy, PurchaseMethod, TestModes } from './';
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
    extendedParams?: {
        [key: string]: string;
    };
    /**
     *
     * @type {Date}
     * @memberof PlanData
     */
    firstChargeDate?: Date;
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
export declare function PlanDataFromJSON(json: any): PlanData;
export declare function PlanDataFromJSONTyped(json: any, ignoreDiscriminator: boolean): PlanData;
export declare function PlanDataToJSON(value?: PlanData | null): any;