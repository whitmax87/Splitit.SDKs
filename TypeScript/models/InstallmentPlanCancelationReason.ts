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
export enum InstallmentPlanCancelationReason {
    Other = 'Other',
    ChargeBackRequest = 'ChargeBackRequest'
}

export function InstallmentPlanCancelationReasonFromJSON(json: any): InstallmentPlanCancelationReason {
    return InstallmentPlanCancelationReasonFromJSONTyped(json, false);
}

export function InstallmentPlanCancelationReasonFromJSONTyped(json: any, ignoreDiscriminator: boolean): InstallmentPlanCancelationReason {
    return json as InstallmentPlanCancelationReason;
}

export function InstallmentPlanCancelationReasonToJSON(value?: InstallmentPlanCancelationReason | null): any {
    return value as any;
}
