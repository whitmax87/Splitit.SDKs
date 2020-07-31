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
function GetFraudStatusDisplayRequestFromJSON(json) {
    return GetFraudStatusDisplayRequestFromJSONTyped(json, false);
}
exports.GetFraudStatusDisplayRequestFromJSON = GetFraudStatusDisplayRequestFromJSON;
function GetFraudStatusDisplayRequestFromJSONTyped(json, ignoreDiscriminator) {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        'providerReferenceId': !runtime_1.exists(json, 'ProviderReferenceId') ? undefined : json['ProviderReferenceId'],
        'merchantId': !runtime_1.exists(json, 'MerchantId') ? undefined : json['MerchantId'],
        'installmentPlanNumber': !runtime_1.exists(json, 'InstallmentPlanNumber') ? undefined : json['InstallmentPlanNumber'],
    };
}
exports.GetFraudStatusDisplayRequestFromJSONTyped = GetFraudStatusDisplayRequestFromJSONTyped;
function GetFraudStatusDisplayRequestToJSON(value) {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        'ProviderReferenceId': value.providerReferenceId,
        'MerchantId': value.merchantId,
        'InstallmentPlanNumber': value.installmentPlanNumber,
    };
}
exports.GetFraudStatusDisplayRequestToJSON = GetFraudStatusDisplayRequestToJSON;