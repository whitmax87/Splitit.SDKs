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
    InstallmentPlanQueryCriteria,
    InstallmentPlanQueryCriteriaFromJSON,
    InstallmentPlanQueryCriteriaFromJSONTyped,
    InstallmentPlanQueryCriteriaToJSON,
    PagingRequestHeader,
    PagingRequestHeaderFromJSON,
    PagingRequestHeaderFromJSONTyped,
    PagingRequestHeaderToJSON,
    RelationsLoad,
    RelationsLoadFromJSON,
    RelationsLoadFromJSONTyped,
    RelationsLoadToJSON,
} from './';

/**
 * 
 * @export
 * @interface GetInstallmentsPlanSearchCriteriaRequest
 */
export interface GetInstallmentsPlanSearchCriteriaRequest {
    /**
     * 
     * @type {InstallmentPlanQueryCriteria}
     * @memberof GetInstallmentsPlanSearchCriteriaRequest
     */
    queryCriteria?: InstallmentPlanQueryCriteria;
    /**
     * 
     * @type {RelationsLoad}
     * @memberof GetInstallmentsPlanSearchCriteriaRequest
     */
    loadRelated?: RelationsLoad;
    /**
     * 
     * @type {PagingRequestHeader}
     * @memberof GetInstallmentsPlanSearchCriteriaRequest
     */
    pagingRequest?: PagingRequestHeader;
}

export function GetInstallmentsPlanSearchCriteriaRequestFromJSON(json: any): GetInstallmentsPlanSearchCriteriaRequest {
    return GetInstallmentsPlanSearchCriteriaRequestFromJSONTyped(json, false);
}

export function GetInstallmentsPlanSearchCriteriaRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetInstallmentsPlanSearchCriteriaRequest {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'queryCriteria': !exists(json, 'QueryCriteria') ? undefined : InstallmentPlanQueryCriteriaFromJSON(json['QueryCriteria']),
        'loadRelated': !exists(json, 'LoadRelated') ? undefined : RelationsLoadFromJSON(json['LoadRelated']),
        'pagingRequest': !exists(json, 'PagingRequest') ? undefined : PagingRequestHeaderFromJSON(json['PagingRequest']),
    };
}

export function GetInstallmentsPlanSearchCriteriaRequestToJSON(value?: GetInstallmentsPlanSearchCriteriaRequest | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'QueryCriteria': InstallmentPlanQueryCriteriaToJSON(value.queryCriteria),
        'LoadRelated': RelationsLoadToJSON(value.loadRelated),
        'PagingRequest': PagingRequestHeaderToJSON(value.pagingRequest),
    };
}


