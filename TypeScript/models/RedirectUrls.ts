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
/**
 * 
 * @export
 * @interface RedirectUrls
 */
export interface RedirectUrls {
    /**
     * 
     * @type {string}
     * @memberof RedirectUrls
     */
    succeeded?: string;
    /**
     * 
     * @type {string}
     * @memberof RedirectUrls
     */
    canceled?: string;
    /**
     * 
     * @type {string}
     * @memberof RedirectUrls
     */
    failed?: string;
}

export function RedirectUrlsFromJSON(json: any): RedirectUrls {
    return RedirectUrlsFromJSONTyped(json, false);
}

export function RedirectUrlsFromJSONTyped(json: any, ignoreDiscriminator: boolean): RedirectUrls {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'succeeded': !exists(json, 'Succeeded') ? undefined : json['Succeeded'],
        'canceled': !exists(json, 'Canceled') ? undefined : json['Canceled'],
        'failed': !exists(json, 'Failed') ? undefined : json['Failed'],
    };
}

export function RedirectUrlsToJSON(value?: RedirectUrls | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'Succeeded': value.succeeded,
        'Canceled': value.canceled,
        'Failed': value.failed,
    };
}


