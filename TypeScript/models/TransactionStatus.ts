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

/**
 * 
 * @export
 * @enum {string}
 */
export enum TransactionStatus {
    Pending = 'Pending',
    FinishedSuccessfully = 'FinishedSuccessfully',
    Failed = 'Failed',
    AllStatuses = 'AllStatuses'
}

export function TransactionStatusFromJSON(json: any): TransactionStatus {
    return TransactionStatusFromJSONTyped(json, false);
}

export function TransactionStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): TransactionStatus {
    return json as TransactionStatus;
}

export function TransactionStatusToJSON(value?: TransactionStatus | null): any {
    return value as any;
}

