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
import { ResponseHeader } from './';
/**
 *
 * @export
 * @interface Get3DSecureParametersResponse
 */
export interface Get3DSecureParametersResponse {
    /**
     *
     * @type {ResponseHeader}
     * @memberof Get3DSecureParametersResponse
     */
    responseHeader?: ResponseHeader;
    /**
     *
     * @type {string}
     * @memberof Get3DSecureParametersResponse
     */
    issuerRedirectUrl?: string;
    /**
     *
     * @type {string}
     * @memberof Get3DSecureParametersResponse
     */
    paReq?: string;
    /**
     *
     * @type {string}
     * @memberof Get3DSecureParametersResponse
     */
    md?: string;
    /**
     *
     * @type {string}
     * @memberof Get3DSecureParametersResponse
     */
    termUrl?: string;
}
export declare function Get3DSecureParametersResponseFromJSON(json: any): Get3DSecureParametersResponse;
export declare function Get3DSecureParametersResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): Get3DSecureParametersResponse;
export declare function Get3DSecureParametersResponseToJSON(value?: Get3DSecureParametersResponse | null): any;