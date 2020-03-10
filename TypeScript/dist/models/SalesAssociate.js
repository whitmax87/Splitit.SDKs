"use strict";
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
Object.defineProperty(exports, "__esModule", { value: true });
var runtime_1 = require("../runtime");
function SalesAssociateFromJSON(json) {
    return SalesAssociateFromJSONTyped(json, false);
}
exports.SalesAssociateFromJSON = SalesAssociateFromJSON;
function SalesAssociateFromJSONTyped(json, ignoreDiscriminator) {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        'id': !runtime_1.exists(json, 'Id') ? undefined : json['Id'],
        'firstName': !runtime_1.exists(json, 'FirstName') ? undefined : json['FirstName'],
        'lastName': !runtime_1.exists(json, 'LastName') ? undefined : json['LastName'],
    };
}
exports.SalesAssociateFromJSONTyped = SalesAssociateFromJSONTyped;
function SalesAssociateToJSON(value) {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        'Id': value.id,
        'FirstName': value.firstName,
        'LastName': value.lastName,
    };
}
exports.SalesAssociateToJSON = SalesAssociateToJSON;
