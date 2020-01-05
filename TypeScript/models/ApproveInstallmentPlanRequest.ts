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
 * @interface ApproveInstallmentPlanRequest
 */
export interface ApproveInstallmentPlanRequest {
    /**
     * 
     * @type {string}
     * @memberof ApproveInstallmentPlanRequest
     */
    installmentPlanNumber?: string;
    /**
     * 
     * @type {string}
     * @memberof ApproveInstallmentPlanRequest
     */
    customerSignaturePngAsBase64?: string;
    /**
     * 
     * @type {boolean}
     * @memberof ApproveInstallmentPlanRequest
     */
    areTermsAndConditionsApproved: boolean;
}

export function ApproveInstallmentPlanRequestFromJSON(json: any): ApproveInstallmentPlanRequest {
    return ApproveInstallmentPlanRequestFromJSONTyped(json, false);
}

export function ApproveInstallmentPlanRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ApproveInstallmentPlanRequest {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'installmentPlanNumber': !exists(json, 'InstallmentPlanNumber') ? undefined : json['InstallmentPlanNumber'],
        'customerSignaturePngAsBase64': !exists(json, 'CustomerSignaturePngAsBase64') ? undefined : json['CustomerSignaturePngAsBase64'],
        'areTermsAndConditionsApproved': json['AreTermsAndConditionsApproved'],
    };
}

export function ApproveInstallmentPlanRequestToJSON(value?: ApproveInstallmentPlanRequest | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'InstallmentPlanNumber': value.installmentPlanNumber,
        'CustomerSignaturePngAsBase64': value.customerSignaturePngAsBase64,
        'AreTermsAndConditionsApproved': value.areTermsAndConditionsApproved,
    };
}


