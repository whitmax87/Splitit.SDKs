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

import { exists, mapValues } from '../runtime';
import {
    ReferenceEntityBase,
    ReferenceEntityBaseFromJSON,
    ReferenceEntityBaseFromJSONTyped,
    ReferenceEntityBaseToJSON,
} from './';

/**
 * 
 * @export
 * @interface FraudCheck
 */
export interface FraudCheck {
    /**
     * 
     * @type {ReferenceEntityBase}
     * @memberof FraudCheck
     */
    fraudCheckResult?: ReferenceEntityBase;
    /**
     * 
     * @type {string}
     * @memberof FraudCheck
     */
    providerResultCode?: string;
    /**
     * 
     * @type {string}
     * @memberof FraudCheck
     */
    providerResultDesc?: string;
    /**
     * 
     * @type {string}
     * @memberof FraudCheck
     */
    providerReferenceId?: string;
}

export function FraudCheckFromJSON(json: any): FraudCheck {
    return FraudCheckFromJSONTyped(json, false);
}

export function FraudCheckFromJSONTyped(json: any, ignoreDiscriminator: boolean): FraudCheck {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'fraudCheckResult': !exists(json, 'FraudCheckResult') ? undefined : ReferenceEntityBaseFromJSON(json['FraudCheckResult']),
        'providerResultCode': !exists(json, 'ProviderResultCode') ? undefined : json['ProviderResultCode'],
        'providerResultDesc': !exists(json, 'ProviderResultDesc') ? undefined : json['ProviderResultDesc'],
        'providerReferenceId': !exists(json, 'ProviderReferenceId') ? undefined : json['ProviderReferenceId'],
    };
}

export function FraudCheckToJSON(value?: FraudCheck | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'FraudCheckResult': ReferenceEntityBaseToJSON(value.fraudCheckResult),
        'ProviderResultCode': value.providerResultCode,
        'ProviderResultDesc': value.providerResultDesc,
        'ProviderReferenceId': value.providerReferenceId,
    };
}


