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
import { CreateInstallmentsPlanResponseAllOf } from './createInstallmentsPlanResponseAllOf';
import { InstallmentPlan } from './installmentPlan';
import { InstallmentPlanResponse } from './installmentPlanResponse';
import { ResponseHeader } from './responseHeader';

export class UpdateInstallmentsPlanResponse {
    'responseHeader'?: ResponseHeader;
    'installmentPlan'?: InstallmentPlan;
    'approvalUrl'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "responseHeader",
            "baseName": "ResponseHeader",
            "type": "ResponseHeader"
        },
        {
            "name": "installmentPlan",
            "baseName": "InstallmentPlan",
            "type": "InstallmentPlan"
        },
        {
            "name": "approvalUrl",
            "baseName": "ApprovalUrl",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return UpdateInstallmentsPlanResponse.attributeTypeMap;
    }
}

