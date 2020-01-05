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
import {
    CreateInstallmentsPlanResponseAllOf,
    CreateInstallmentsPlanResponseAllOfFromJSON,
    CreateInstallmentsPlanResponseAllOfFromJSONTyped,
    CreateInstallmentsPlanResponseAllOfToJSON,
    InstallmentPlan,
    InstallmentPlanFromJSON,
    InstallmentPlanFromJSONTyped,
    InstallmentPlanToJSON,
    InstallmentPlanResponse,
    InstallmentPlanResponseFromJSON,
    InstallmentPlanResponseFromJSONTyped,
    InstallmentPlanResponseToJSON,
    ResponseHeader,
    ResponseHeaderFromJSON,
    ResponseHeaderFromJSONTyped,
    ResponseHeaderToJSON,
} from './';

/**
 * 
 * @export
 * @interface CreateInstallmentsPlanResponse
 */
export interface CreateInstallmentsPlanResponse {
    /**
     * 
     * @type {ResponseHeader}
     * @memberof CreateInstallmentsPlanResponse
     */
    responseHeader?: ResponseHeader;
    /**
     * 
     * @type {InstallmentPlan}
     * @memberof CreateInstallmentsPlanResponse
     */
    installmentPlan?: InstallmentPlan;
    /**
     * 
     * @type {string}
     * @memberof CreateInstallmentsPlanResponse
     */
    approvalUrl?: string;
}

export function CreateInstallmentsPlanResponseFromJSON(json: any): CreateInstallmentsPlanResponse {
    return CreateInstallmentsPlanResponseFromJSONTyped(json, false);
}

export function CreateInstallmentsPlanResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateInstallmentsPlanResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'responseHeader': !exists(json, 'ResponseHeader') ? undefined : ResponseHeaderFromJSON(json['ResponseHeader']),
        'installmentPlan': !exists(json, 'InstallmentPlan') ? undefined : InstallmentPlanFromJSON(json['InstallmentPlan']),
        'approvalUrl': !exists(json, 'ApprovalUrl') ? undefined : json['ApprovalUrl'],
    };
}

export function CreateInstallmentsPlanResponseToJSON(value?: CreateInstallmentsPlanResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'ResponseHeader': ResponseHeaderToJSON(value.responseHeader),
        'InstallmentPlan': InstallmentPlanToJSON(value.installmentPlan),
        'ApprovalUrl': value.approvalUrl,
    };
}


