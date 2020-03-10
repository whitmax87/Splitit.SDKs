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
 * @interface GetInitiatedInstallmentPlanRequest
 */
export interface GetInitiatedInstallmentPlanRequest {
    /**
     * 
     * @type {string}
     * @memberof GetInitiatedInstallmentPlanRequest
     */
    installmentPlanNumber?: string;
}

export function GetInitiatedInstallmentPlanRequestFromJSON(json: any): GetInitiatedInstallmentPlanRequest {
    return GetInitiatedInstallmentPlanRequestFromJSONTyped(json, false);
}

export function GetInitiatedInstallmentPlanRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetInitiatedInstallmentPlanRequest {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'installmentPlanNumber': !exists(json, 'InstallmentPlanNumber') ? undefined : json['InstallmentPlanNumber'],
    };
}

export function GetInitiatedInstallmentPlanRequestToJSON(value?: GetInitiatedInstallmentPlanRequest | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'InstallmentPlanNumber': value.installmentPlanNumber,
    };
}


