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
    InstallmentPlanActivityStatus,
    InstallmentPlanActivityStatusFromJSON,
    InstallmentPlanActivityStatusFromJSONTyped,
    InstallmentPlanActivityStatusToJSON,
} from './';

/**
 * 
 * @export
 * @interface RelationsLoad
 */
export interface RelationsLoad {
    /**
     * 
     * @type {InstallmentPlanActivityStatus}
     * @memberof RelationsLoad
     */
    installments: InstallmentPlanActivityStatus;
    /**
     * 
     * @type {InstallmentPlanActivityStatus}
     * @memberof RelationsLoad
     */
    secureAuthorizations: InstallmentPlanActivityStatus;
}

export function RelationsLoadFromJSON(json: any): RelationsLoad {
    return RelationsLoadFromJSONTyped(json, false);
}

export function RelationsLoadFromJSONTyped(json: any, ignoreDiscriminator: boolean): RelationsLoad {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'installments': InstallmentPlanActivityStatusFromJSON(json['Installments']),
        'secureAuthorizations': InstallmentPlanActivityStatusFromJSON(json['SecureAuthorizations']),
    };
}

export function RelationsLoadToJSON(value?: RelationsLoad | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'Installments': InstallmentPlanActivityStatusToJSON(value.installments),
        'SecureAuthorizations': InstallmentPlanActivityStatusToJSON(value.secureAuthorizations),
    };
}

