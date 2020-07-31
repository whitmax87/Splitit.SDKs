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
    ResponseHeader,
    ResponseHeaderFromJSON,
    ResponseHeaderFromJSONTyped,
    ResponseHeaderToJSON,
} from './';

/**
 * 
 * @export
 * @interface GetFraudStatusDisplayResponse
 */
export interface GetFraudStatusDisplayResponse {
    /**
     * 
     * @type {ResponseHeader}
     * @memberof GetFraudStatusDisplayResponse
     */
    responseHeader?: ResponseHeader;
    /**
     * 
     * @type {string}
     * @memberof GetFraudStatusDisplayResponse
     */
    provider?: string;
    /**
     * 
     * @type {string}
     * @memberof GetFraudStatusDisplayResponse
     */
    fullLog?: string;
    /**
     * 
     * @type {string}
     * @memberof GetFraudStatusDisplayResponse
     */
    providerResultDescription?: string;
    /**
     * 
     * @type {number}
     * @memberof GetFraudStatusDisplayResponse
     */
    installmentPlanId: number;
    /**
     * 
     * @type {string}
     * @memberof GetFraudStatusDisplayResponse
     */
    providerResultCode?: string;
}

export function GetFraudStatusDisplayResponseFromJSON(json: any): GetFraudStatusDisplayResponse {
    return GetFraudStatusDisplayResponseFromJSONTyped(json, false);
}

export function GetFraudStatusDisplayResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetFraudStatusDisplayResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'responseHeader': !exists(json, 'ResponseHeader') ? undefined : ResponseHeaderFromJSON(json['ResponseHeader']),
        'provider': !exists(json, 'Provider') ? undefined : json['Provider'],
        'fullLog': !exists(json, 'FullLog') ? undefined : json['FullLog'],
        'providerResultDescription': !exists(json, 'ProviderResultDescription') ? undefined : json['ProviderResultDescription'],
        'installmentPlanId': json['InstallmentPlanId'],
        'providerResultCode': !exists(json, 'ProviderResultCode') ? undefined : json['ProviderResultCode'],
    };
}

export function GetFraudStatusDisplayResponseToJSON(value?: GetFraudStatusDisplayResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'ResponseHeader': ResponseHeaderToJSON(value.responseHeader),
        'Provider': value.provider,
        'FullLog': value.fullLog,
        'ProviderResultDescription': value.providerResultDescription,
        'InstallmentPlanId': value.installmentPlanId,
        'ProviderResultCode': value.providerResultCode,
    };
}

