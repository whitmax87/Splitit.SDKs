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
import { ResponseStatus } from './';
/**
 *
 * @export
 * @interface LoginResponseAllOf
 */
export interface LoginResponseAllOf {
    /**
     *
     * @type {number}
     * @memberof LoginResponseAllOf
     */
    result: number;
    /**
     *
     * @type {ResponseStatus}
     * @memberof LoginResponseAllOf
     */
    responseStatus?: ResponseStatus;
}
export declare function LoginResponseAllOfFromJSON(json: any): LoginResponseAllOf;
export declare function LoginResponseAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): LoginResponseAllOf;
export declare function LoginResponseAllOfToJSON(value?: LoginResponseAllOf | null): any;