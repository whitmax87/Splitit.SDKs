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
 * @interface TerminalRef
 */
export interface TerminalRef extends ReferenceEntityBase {
}

export function TerminalRefFromJSON(json: any): TerminalRef {
    return TerminalRefFromJSONTyped(json, false);
}

export function TerminalRefFromJSONTyped(json: any, ignoreDiscriminator: boolean): TerminalRef {
    return json;
}

export function TerminalRefToJSON(value?: TerminalRef | null): any {
    return value;
}


