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
function InstallmentPlanFromJSON(json) {
    return InstallmentPlanFromJSONTyped(json, false);
}
exports.InstallmentPlanFromJSON = InstallmentPlanFromJSON;
function InstallmentPlanFromJSONTyped(json, ignoreDiscriminator) {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        'installmentPlanNumber': !runtime_1.exists(json, 'InstallmentPlanNumber') ? undefined : json['InstallmentPlanNumber'],
        'installmentPlanStatus': !runtime_1.exists(json, 'InstallmentPlanStatus') ? undefined : _1.ReferenceEntityBaseFromJSON(json['InstallmentPlanStatus']),
        'amount': !runtime_1.exists(json, 'Amount') ? undefined : _1.MoneyFromJSON(json['Amount']),
        'outstandingAmount': !runtime_1.exists(json, 'OutstandingAmount') ? undefined : _1.MoneyFromJSON(json['OutstandingAmount']),
        'numberOfInstallments': json['NumberOfInstallments'],
        'numberOfProcessedInstallments': json['NumberOfProcessedInstallments'],
        'originalAmount': !runtime_1.exists(json, 'OriginalAmount') ? undefined : _1.MoneyFromJSON(json['OriginalAmount']),
        'refundAmount': !runtime_1.exists(json, 'RefundAmount') ? undefined : _1.MoneyFromJSON(json['RefundAmount']),
        'consumer': !runtime_1.exists(json, 'Consumer') ? undefined : _1.ConsumerDataFromJSON(json['Consumer']),
        'activeCard': !runtime_1.exists(json, 'ActiveCard') ? undefined : _1.CardDataFromJSON(json['ActiveCard']),
        'fraudCheck': !runtime_1.exists(json, 'FraudCheck') ? undefined : _1.FraudCheckFromJSON(json['FraudCheck']),
        'merchant': !runtime_1.exists(json, 'Merchant') ? undefined : _1.MerchantRefFromJSON(json['Merchant']),
        'refOrderNumber': !runtime_1.exists(json, 'RefOrderNumber') ? undefined : json['RefOrderNumber'],
        'purchaseMethod': !runtime_1.exists(json, 'PurchaseMethod') ? undefined : _1.ReferenceEntityBaseFromJSON(json['PurchaseMethod']),
        'strategy': !runtime_1.exists(json, 'Strategy') ? undefined : _1.ReferenceEntityBaseFromJSON(json['Strategy']),
        'delayResolution': !runtime_1.exists(json, 'DelayResolution') ? undefined : _1.ReferenceEntityBaseFromJSON(json['DelayResolution']),
        'extendedParams': !runtime_1.exists(json, 'ExtendedParams') ? undefined : json['ExtendedParams'],
        'isFullCaptured': json['IsFullCaptured'],
        'isChargedBack': json['IsChargedBack'],
        'arePaymentsOnHold': json['ArePaymentsOnHold'],
        'scpFundingPercent': json['ScpFundingPercent'],
        'fundingStatus': _1.MoneyFlowsFromJSON(json['FundingStatus']),
        'testMode': _1.TestModesFromJSON(json['TestMode']),
        'creationDateTime': (new Date(json['CreationDateTime'])),
        'lifeTimeUrlExpirationTime': (new Date(json['LifeTimeUrlExpirationTime'])),
        'installments': !runtime_1.exists(json, 'Installments') ? undefined : (json['Installments'].map(_1.Installment2FromJSON)),
        'secureAuthorizations': !runtime_1.exists(json, 'SecureAuthorizations') ? undefined : (json['SecureAuthorizations'].map(_1.ReAuthorizationFromJSON)),
        'logoUrl': !runtime_1.exists(json, 'LogoUrl') ? undefined : json['LogoUrl'],
        'isInAutoRetry': json['IsInAutoRetry'],
    };
}
exports.InstallmentPlanFromJSONTyped = InstallmentPlanFromJSONTyped;
function InstallmentPlanToJSON(value) {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        'InstallmentPlanNumber': value.installmentPlanNumber,
        'InstallmentPlanStatus': _1.ReferenceEntityBaseToJSON(value.installmentPlanStatus),
        'Amount': _1.MoneyToJSON(value.amount),
        'OutstandingAmount': _1.MoneyToJSON(value.outstandingAmount),
        'NumberOfInstallments': value.numberOfInstallments,
        'NumberOfProcessedInstallments': value.numberOfProcessedInstallments,
        'OriginalAmount': _1.MoneyToJSON(value.originalAmount),
        'RefundAmount': _1.MoneyToJSON(value.refundAmount),
        'Consumer': _1.ConsumerDataToJSON(value.consumer),
        'ActiveCard': _1.CardDataToJSON(value.activeCard),
        'FraudCheck': _1.FraudCheckToJSON(value.fraudCheck),
        'Merchant': _1.MerchantRefToJSON(value.merchant),
        'RefOrderNumber': value.refOrderNumber,
        'PurchaseMethod': _1.ReferenceEntityBaseToJSON(value.purchaseMethod),
        'Strategy': _1.ReferenceEntityBaseToJSON(value.strategy),
        'DelayResolution': _1.ReferenceEntityBaseToJSON(value.delayResolution),
        'ExtendedParams': value.extendedParams,
        'IsFullCaptured': value.isFullCaptured,
        'IsChargedBack': value.isChargedBack,
        'ArePaymentsOnHold': value.arePaymentsOnHold,
        'ScpFundingPercent': value.scpFundingPercent,
        'FundingStatus': _1.MoneyFlowsToJSON(value.fundingStatus),
        'TestMode': _1.TestModesToJSON(value.testMode),
        'CreationDateTime': (value.creationDateTime.toISOString()),
        'LifeTimeUrlExpirationTime': (value.lifeTimeUrlExpirationTime.toISOString()),
        'Installments': value.installments === undefined ? undefined : (value.installments.map(_1.Installment2ToJSON)),
        'SecureAuthorizations': value.secureAuthorizations === undefined ? undefined : (value.secureAuthorizations.map(_1.ReAuthorizationToJSON)),
        'LogoUrl': value.logoUrl,
        'IsInAutoRetry': value.isInAutoRetry,
    };
}
exports.InstallmentPlanToJSON = InstallmentPlanToJSON;
