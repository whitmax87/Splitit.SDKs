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
export declare enum ContactPersonType {
    Business = "Business",
    Technical = "Technical",
    Financial = "Financial"
}
export declare function ContactPersonTypeFromJSON(json: any): ContactPersonType;
export declare function ContactPersonTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): ContactPersonType;
export declare function ContactPersonTypeToJSON(value?: ContactPersonType | null): any;