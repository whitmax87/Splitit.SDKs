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
    TermsAndConditions2,
    TermsAndConditions2FromJSON,
    TermsAndConditions2FromJSONTyped,
    TermsAndConditions2ToJSON,
} from './';

/**
 * 
 * @export
 * @interface TermsAndConditions
 */
export interface TermsAndConditions extends TermsAndConditions2 {
}

export function TermsAndConditionsFromJSON(json: any): TermsAndConditions {
    return TermsAndConditionsFromJSONTyped(json, false);
}

export function TermsAndConditionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): TermsAndConditions {
    return json;
}

export function TermsAndConditionsToJSON(value?: TermsAndConditions | null): any {
    return value;
}

