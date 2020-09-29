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
var _1 = require("./");
function CancelInstallmentPlanRequestFromJSON(json) {
    return CancelInstallmentPlanRequestFromJSONTyped(json, false);
}
exports.CancelInstallmentPlanRequestFromJSON = CancelInstallmentPlanRequestFromJSON;
function CancelInstallmentPlanRequestFromJSONTyped(json, ignoreDiscriminator) {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        'installmentPlanNumber': !runtime_1.exists(json, 'InstallmentPlanNumber') ? undefined : json['InstallmentPlanNumber'],
        'refundUnderCancelation': _1.RefundUnderCancelationFromJSON(json['RefundUnderCancelation']),
        'cancelationReason': !runtime_1.exists(json, 'CancelationReason') ? undefined : _1.InstallmentPlanCancelationReasonFromJSON(json['CancelationReason']),
        'isExecutedUnattended': json['IsExecutedUnattended'],
        'partialResponseMapping': json['PartialResponseMapping'],
    };
}
exports.CancelInstallmentPlanRequestFromJSONTyped = CancelInstallmentPlanRequestFromJSONTyped;
function CancelInstallmentPlanRequestToJSON(value) {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        'InstallmentPlanNumber': value.installmentPlanNumber,
        'RefundUnderCancelation': _1.RefundUnderCancelationToJSON(value.refundUnderCancelation),
        'CancelationReason': _1.InstallmentPlanCancelationReasonToJSON(value.cancelationReason),
        'IsExecutedUnattended': value.isExecutedUnattended,
        'PartialResponseMapping': value.partialResponseMapping,
    };
}
exports.CancelInstallmentPlanRequestToJSON = CancelInstallmentPlanRequestToJSON;
