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

/**
 * 
 * @export
 * @enum {string}
 */
export enum InstallmentPlanActivityStatus {
    None = 'None',
    All = 'All',
    Processed = 'Processed',
    Planned = 'Planned'
}

export function InstallmentPlanActivityStatusFromJSON(json: any): InstallmentPlanActivityStatus {
    return InstallmentPlanActivityStatusFromJSONTyped(json, false);
}

export function InstallmentPlanActivityStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): InstallmentPlanActivityStatus {
    return json as InstallmentPlanActivityStatus;
}

export function InstallmentPlanActivityStatusToJSON(value?: InstallmentPlanActivityStatus | null): any {
    return value as any;
}

