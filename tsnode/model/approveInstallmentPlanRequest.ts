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

import { RequestFile } from '../api';

export class ApproveInstallmentPlanRequest {
    'installmentPlanNumber'?: string;
    'customerSignaturePngAsBase64'?: string;
    'areTermsAndConditionsApproved': boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "installmentPlanNumber",
            "baseName": "InstallmentPlanNumber",
            "type": "string"
        },
        {
            "name": "customerSignaturePngAsBase64",
            "baseName": "CustomerSignaturePngAsBase64",
            "type": "string"
        },
        {
            "name": "areTermsAndConditionsApproved",
            "baseName": "AreTermsAndConditionsApproved",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ApproveInstallmentPlanRequest.attributeTypeMap;
    }
}

