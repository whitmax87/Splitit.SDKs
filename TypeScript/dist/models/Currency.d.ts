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
 * @interface Currency
 */
export interface Currency {
    /**
     *
     * @type {number}
     * @memberof Currency
     */
    id: number;
    /**
     *
     * @type {string}
     * @memberof Currency
     */
    code?: string;
    /**
     *
     * @type {string}
     * @memberof Currency
     */
    description?: string;
    /**
     *
     * @type {string}
     * @memberof Currency
     */
    symbol?: string;
}
export declare function CurrencyFromJSON(json: any): Currency;
export declare function CurrencyFromJSONTyped(json: any, ignoreDiscriminator: boolean): Currency;
export declare function CurrencyToJSON(value?: Currency | null): any;
