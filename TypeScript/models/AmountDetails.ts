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
    AmountDetails2,
    AmountDetails2FromJSON,
    AmountDetails2FromJSONTyped,
    AmountDetails2ToJSON,
} from './';

/**
 * 
 * @export
 * @interface AmountDetails
 */
export interface AmountDetails extends AmountDetails2 {
}

export function AmountDetailsFromJSON(json: any): AmountDetails {
    return AmountDetailsFromJSONTyped(json, false);
}

export function AmountDetailsFromJSONTyped(json: any, ignoreDiscriminator: boolean): AmountDetails {
    return json;
}

export function AmountDetailsToJSON(value?: AmountDetails | null): any {
    return value;
}

