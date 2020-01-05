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
export enum InstallmentsPlanDateType {
    None = 'None',
    LastChargeDate = 'LastChargeDate',
    ReserveReturnDate = 'ReserveReturnDate',
    CreatedDate = 'CreatedDate',
    FinancedDate = 'FinancedDate',
    ShippingDate = 'ShippingDate',
    ProcessingDate = 'ProcessingDate'
}

export function InstallmentsPlanDateTypeFromJSON(json: any): InstallmentsPlanDateType {
    return InstallmentsPlanDateTypeFromJSONTyped(json, false);
}

export function InstallmentsPlanDateTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): InstallmentsPlanDateType {
    return json as InstallmentsPlanDateType;
}

export function InstallmentsPlanDateTypeToJSON(value?: InstallmentsPlanDateType | null): any {
    return value as any;
}

