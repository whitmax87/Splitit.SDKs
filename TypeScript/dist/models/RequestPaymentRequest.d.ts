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
 * @interface RequestPaymentRequest
 */
export interface RequestPaymentRequest {
    /**
     *
     * @type {string}
     * @memberof RequestPaymentRequest
     */
    installmentPlanNumber?: string;
    /**
     *
     * @type {string}
     * @memberof RequestPaymentRequest
     */
    paymentApprovalPhone?: string;
    /**
     *
     * @type {string}
     * @memberof RequestPaymentRequest
     */
    paymentApprovalEmail?: string;
}
export declare function RequestPaymentRequestFromJSON(json: any): RequestPaymentRequest;
export declare function RequestPaymentRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): RequestPaymentRequest;
export declare function RequestPaymentRequestToJSON(value?: RequestPaymentRequest | null): any;