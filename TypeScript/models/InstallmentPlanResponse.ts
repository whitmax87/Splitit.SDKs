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
    InstallmentPlan,
    InstallmentPlanFromJSON,
    InstallmentPlanFromJSONTyped,
    InstallmentPlanToJSON,
    ResponseHeader,
    ResponseHeaderFromJSON,
    ResponseHeaderFromJSONTyped,
    ResponseHeaderToJSON,
} from './';

/**
 * 
 * @export
 * @interface InstallmentPlanResponse
 */
export interface InstallmentPlanResponse {
    /**
     * 
     * @type {ResponseHeader}
     * @memberof InstallmentPlanResponse
     */
    responseHeader?: ResponseHeader;
    /**
     * 
     * @type {InstallmentPlan}
     * @memberof InstallmentPlanResponse
     */
    installmentPlan?: InstallmentPlan;
}

export function InstallmentPlanResponseFromJSON(json: any): InstallmentPlanResponse {
    return InstallmentPlanResponseFromJSONTyped(json, false);
}

export function InstallmentPlanResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): InstallmentPlanResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'responseHeader': !exists(json, 'ResponseHeader') ? undefined : ResponseHeaderFromJSON(json['ResponseHeader']),
        'installmentPlan': !exists(json, 'InstallmentPlan') ? undefined : InstallmentPlanFromJSON(json['InstallmentPlan']),
    };
}

export function InstallmentPlanResponseToJSON(value?: InstallmentPlanResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'ResponseHeader': ResponseHeaderToJSON(value.responseHeader),
        'InstallmentPlan': InstallmentPlanToJSON(value.installmentPlan),
    };
}


