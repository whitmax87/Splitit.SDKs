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
    AddressData2,
    AddressData2FromJSON,
    AddressData2FromJSONTyped,
    AddressData2ToJSON,
} from './';

/**
 * 
 * @export
 * @interface AddressData
 */
export interface AddressData extends AddressData2 {
}

export function AddressDataFromJSON(json: any): AddressData {
    return AddressDataFromJSONTyped(json, false);
}

export function AddressDataFromJSONTyped(json: any, ignoreDiscriminator: boolean): AddressData {
    return json;
}

export function AddressDataToJSON(value?: AddressData | null): any {
    return value;
}


