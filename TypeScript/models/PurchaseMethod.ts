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

/**
 * 
 * @export
 * @enum {string}
 */
export enum PurchaseMethod {
    InStore = 'InStore',
    PhoneOrder = 'PhoneOrder',
    ECommerce = 'ECommerce'
}

export function PurchaseMethodFromJSON(json: any): PurchaseMethod {
    return PurchaseMethodFromJSONTyped(json, false);
}

export function PurchaseMethodFromJSONTyped(json: any, ignoreDiscriminator: boolean): PurchaseMethod {
    return json as PurchaseMethod;
}

export function PurchaseMethodToJSON(value?: PurchaseMethod | null): any {
    return value as any;
}

