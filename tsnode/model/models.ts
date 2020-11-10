export const BASE_PATH = "https://webapi.production.splitit.com".replace(/\/+$/, "");
export const BASE_PATH_SANDBOX = "https://webapi.sandbox.splitit.com".replace(/\/+$/, "");

export * from './addressData';
export * from './addressData2';
export * from './amountDetails';
export * from './amountDetails2';
export * from './approveInstallmentPlanRequest';
export * from './authenticationType';
export * from './cancelInstallmentPlanRequest';
export * from './cardBrand';
export * from './cardData';
export * from './cardResult';
export * from './cardType';
export * from './cartData';
export * from './chargebackRequest';
export * from './consumerData';
export * from './createInstallmentPlanLegacyResponse';
export * from './createInstallmentPlanRequest';
export * from './createInstallmentsPlanResponse';
export * from './createInstallmentsPlanResponseAllOf';
export * from './currency';
export * from './currencyAllOf';
export * from './delayResolution';
export * from './eventsEndpoints';
export * from './extendedCurrency';
export * from './extendedCurrencyAllOf';
export * from './externalAuth';
export * from './fraudCheck';
export * from './fraudCheckResult';
export * from './get3DSecureParametersRequest';
export * from './get3DSecureParametersResponse';
export * from './getFraudStatusDisplayRequest';
export * from './getFraudStatusDisplayResponse';
export * from './getInitiatedInstallmentPlanRequest';
export * from './getInitiatedInstallmentPlanResponse';
export * from './getInstallmentSchedulesRequest';
export * from './getInstallmentsPlanExtendedResponse';
export * from './getInstallmentsPlanResponse';
export * from './getInstallmentsPlanSearchCriteriaRequest';
export * from './getInstallmentsScheduleResponse';
export * from './getResourcesRequest';
export * from './getResourcesRequestContext';
export * from './getResourcesResponse';
export * from './initiateInstallmentPlanRequest';
export * from './initiateInstallmentsPlanResponse';
export * from './initiateInstallmentsPlanResponseAllOf';
export * from './installment';
export * from './installment2';
export * from './installmentPlan';
export * from './installmentPlanActivityStatus';
export * from './installmentPlanCancelationReason';
export * from './installmentPlanDateInfo';
export * from './installmentPlanInitiatedStatuses';
export * from './installmentPlanQueryCriteria';
export * from './installmentPlanResponse';
export * from './installmentPlanStatus';
export * from './installmentsPlanDateType';
export * from './itemData';
export * from './learnMoreDetailsRequest';
export * from './learnMoreDetailsResponse';
export * from './merchantRef';
export * from './merchantRefAllOf';
export * from './modelError';
export * from './money';
export * from './moneyWithCurrencyCode';
export * from './pagingRequestHeader';
export * from './pagingResponseHeader';
export * from './paymentFormMessage';
export * from './paymentFormMessageType';
export * from './paymentToken';
export * from './paymentWizardData';
export * from './paymentWizardDataResponse';
export * from './paymentWizardDataResponseAllOf';
export * from './planApprovalEvidence';
export * from './planData';
export * from './planStrategy';
export * from './purchaseMethod';
export * from './reAuthorization';
export * from './redirectUrls';
export * from './referenceEntityBase';
export * from './refundInstallmentPlanResponse';
export * from './refundInstallmentPlanResponseAllOf';
export * from './refundPlanRequest';
export * from './refundStrategy';
export * from './refundUnderCancelation';
export * from './relationsLoad';
export * from './requestHeader';
export * from './responseHeader';
export * from './schedule';
export * from './scheduleElements';
export * from './startInstallmentsRequest';
export * from './systemTextCategory';
export * from './termsAndConditions';
export * from './termsAndConditionsGetRequest';
export * from './termsAndConditionsGetResponse';
export * from './testModes';
export * from './touchPoint';
export * from './transactionInfo';
export * from './transactionResult';
export * from './transactionStatus';
export * from './transactionType';
export * from './updateInstallmentPlanRequest';
export * from './updateInstallmentPlanRequestAllOf';
export * from './updateInstallmentsPlanResponse';
export * from './user';
export * from './verifyPaymentRequest';
export * from './verifyPaymentResponse';

import localVarRequest = require('request');

import { AddressData } from './addressData';
import { AddressData2 } from './addressData2';
import { AmountDetails } from './amountDetails';
import { AmountDetails2 } from './amountDetails2';
import { ApproveInstallmentPlanRequest } from './approveInstallmentPlanRequest';
import { AuthenticationType } from './authenticationType';
import { CancelInstallmentPlanRequest } from './cancelInstallmentPlanRequest';
import { CardBrand } from './cardBrand';
import { CardData } from './cardData';
import { CardResult } from './cardResult';
import { CardType } from './cardType';
import { CartData } from './cartData';
import { ChargebackRequest } from './chargebackRequest';
import { ConsumerData } from './consumerData';
import { CreateInstallmentPlanLegacyResponse } from './createInstallmentPlanLegacyResponse';
import { CreateInstallmentPlanRequest } from './createInstallmentPlanRequest';
import { CreateInstallmentsPlanResponse } from './createInstallmentsPlanResponse';
import { CreateInstallmentsPlanResponseAllOf } from './createInstallmentsPlanResponseAllOf';
import { Currency } from './currency';
import { CurrencyAllOf } from './currencyAllOf';
import { DelayResolution } from './delayResolution';
import { EventsEndpoints } from './eventsEndpoints';
import { ExtendedCurrency } from './extendedCurrency';
import { ExtendedCurrencyAllOf } from './extendedCurrencyAllOf';
import { ExternalAuth } from './externalAuth';
import { FraudCheck } from './fraudCheck';
import { FraudCheckResult } from './fraudCheckResult';
import { Get3DSecureParametersRequest } from './get3DSecureParametersRequest';
import { Get3DSecureParametersResponse } from './get3DSecureParametersResponse';
import { GetFraudStatusDisplayRequest } from './getFraudStatusDisplayRequest';
import { GetFraudStatusDisplayResponse } from './getFraudStatusDisplayResponse';
import { GetInitiatedInstallmentPlanRequest } from './getInitiatedInstallmentPlanRequest';
import { GetInitiatedInstallmentPlanResponse } from './getInitiatedInstallmentPlanResponse';
import { GetInstallmentSchedulesRequest } from './getInstallmentSchedulesRequest';
import { GetInstallmentsPlanExtendedResponse } from './getInstallmentsPlanExtendedResponse';
import { GetInstallmentsPlanResponse } from './getInstallmentsPlanResponse';
import { GetInstallmentsPlanSearchCriteriaRequest } from './getInstallmentsPlanSearchCriteriaRequest';
import { GetInstallmentsScheduleResponse } from './getInstallmentsScheduleResponse';
import { GetResourcesRequest } from './getResourcesRequest';
import { GetResourcesRequestContext } from './getResourcesRequestContext';
import { GetResourcesResponse } from './getResourcesResponse';
import { InitiateInstallmentPlanRequest } from './initiateInstallmentPlanRequest';
import { InitiateInstallmentsPlanResponse } from './initiateInstallmentsPlanResponse';
import { InitiateInstallmentsPlanResponseAllOf } from './initiateInstallmentsPlanResponseAllOf';
import { Installment } from './installment';
import { Installment2 } from './installment2';
import { InstallmentPlan } from './installmentPlan';
import { InstallmentPlanActivityStatus } from './installmentPlanActivityStatus';
import { InstallmentPlanCancelationReason } from './installmentPlanCancelationReason';
import { InstallmentPlanDateInfo } from './installmentPlanDateInfo';
import { InstallmentPlanInitiatedStatuses } from './installmentPlanInitiatedStatuses';
import { InstallmentPlanQueryCriteria } from './installmentPlanQueryCriteria';
import { InstallmentPlanResponse } from './installmentPlanResponse';
import { InstallmentPlanStatus } from './installmentPlanStatus';
import { InstallmentsPlanDateType } from './installmentsPlanDateType';
import { ItemData } from './itemData';
import { LearnMoreDetailsRequest } from './learnMoreDetailsRequest';
import { LearnMoreDetailsResponse } from './learnMoreDetailsResponse';
import { MerchantRef } from './merchantRef';
import { MerchantRefAllOf } from './merchantRefAllOf';
import { ModelError } from './modelError';
import { Money } from './money';
import { MoneyWithCurrencyCode } from './moneyWithCurrencyCode';
import { PagingRequestHeader } from './pagingRequestHeader';
import { PagingResponseHeader } from './pagingResponseHeader';
import { PaymentFormMessage } from './paymentFormMessage';
import { PaymentFormMessageType } from './paymentFormMessageType';
import { PaymentToken } from './paymentToken';
import { PaymentWizardData } from './paymentWizardData';
import { PaymentWizardDataResponse } from './paymentWizardDataResponse';
import { PaymentWizardDataResponseAllOf } from './paymentWizardDataResponseAllOf';
import { PlanApprovalEvidence } from './planApprovalEvidence';
import { PlanData } from './planData';
import { PlanStrategy } from './planStrategy';
import { PurchaseMethod } from './purchaseMethod';
import { ReAuthorization } from './reAuthorization';
import { RedirectUrls } from './redirectUrls';
import { ReferenceEntityBase } from './referenceEntityBase';
import { RefundInstallmentPlanResponse } from './refundInstallmentPlanResponse';
import { RefundInstallmentPlanResponseAllOf } from './refundInstallmentPlanResponseAllOf';
import { RefundPlanRequest } from './refundPlanRequest';
import { RefundStrategy } from './refundStrategy';
import { RefundUnderCancelation } from './refundUnderCancelation';
import { RelationsLoad } from './relationsLoad';
import { RequestHeader } from './requestHeader';
import { ResponseHeader } from './responseHeader';
import { Schedule } from './schedule';
import { ScheduleElements } from './scheduleElements';
import { StartInstallmentsRequest } from './startInstallmentsRequest';
import { SystemTextCategory } from './systemTextCategory';
import { TermsAndConditions } from './termsAndConditions';
import { TermsAndConditionsGetRequest } from './termsAndConditionsGetRequest';
import { TermsAndConditionsGetResponse } from './termsAndConditionsGetResponse';
import { TestModes } from './testModes';
import { TouchPoint } from './touchPoint';
import { TransactionInfo } from './transactionInfo';
import { TransactionResult } from './transactionResult';
import { TransactionStatus } from './transactionStatus';
import { TransactionType } from './transactionType';
import { UpdateInstallmentPlanRequest } from './updateInstallmentPlanRequest';
import { UpdateInstallmentPlanRequestAllOf } from './updateInstallmentPlanRequestAllOf';
import { UpdateInstallmentsPlanResponse } from './updateInstallmentsPlanResponse';
import { User } from './user';
import { VerifyPaymentRequest } from './verifyPaymentRequest';
import { VerifyPaymentResponse } from './verifyPaymentResponse';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "AuthenticationType": AuthenticationType,
        "CardBrand": CardBrand,
        "CardType": CardType,
        "DelayResolution": DelayResolution,
        "FraudCheckResult": FraudCheckResult,
        "InstallmentPlanActivityStatus": InstallmentPlanActivityStatus,
        "InstallmentPlanCancelationReason": InstallmentPlanCancelationReason,
        "InstallmentPlanStatus": InstallmentPlanStatus,
        "InstallmentsPlanDateType": InstallmentsPlanDateType,
        "PaymentFormMessageType": PaymentFormMessageType,
        "PlanStrategy": PlanStrategy,
        "PurchaseMethod": PurchaseMethod,
        "RefundStrategy": RefundStrategy,
        "RefundUnderCancelation": RefundUnderCancelation,
        "SystemTextCategory": SystemTextCategory,
        "TestModes": TestModes,
        "TransactionStatus": TransactionStatus,
        "TransactionType": TransactionType,
}

let typeMap: {[index: string]: any} = {
    "AddressData": AddressData,
    "AddressData2": AddressData2,
    "AmountDetails": AmountDetails,
    "AmountDetails2": AmountDetails2,
    "ApproveInstallmentPlanRequest": ApproveInstallmentPlanRequest,
    "CancelInstallmentPlanRequest": CancelInstallmentPlanRequest,
    "CardData": CardData,
    "CardResult": CardResult,
    "CartData": CartData,
    "ChargebackRequest": ChargebackRequest,
    "ConsumerData": ConsumerData,
    "CreateInstallmentPlanLegacyResponse": CreateInstallmentPlanLegacyResponse,
    "CreateInstallmentPlanRequest": CreateInstallmentPlanRequest,
    "CreateInstallmentsPlanResponse": CreateInstallmentsPlanResponse,
    "CreateInstallmentsPlanResponseAllOf": CreateInstallmentsPlanResponseAllOf,
    "Currency": Currency,
    "CurrencyAllOf": CurrencyAllOf,
    "EventsEndpoints": EventsEndpoints,
    "ExtendedCurrency": ExtendedCurrency,
    "ExtendedCurrencyAllOf": ExtendedCurrencyAllOf,
    "ExternalAuth": ExternalAuth,
    "FraudCheck": FraudCheck,
    "Get3DSecureParametersRequest": Get3DSecureParametersRequest,
    "Get3DSecureParametersResponse": Get3DSecureParametersResponse,
    "GetFraudStatusDisplayRequest": GetFraudStatusDisplayRequest,
    "GetFraudStatusDisplayResponse": GetFraudStatusDisplayResponse,
    "GetInitiatedInstallmentPlanRequest": GetInitiatedInstallmentPlanRequest,
    "GetInitiatedInstallmentPlanResponse": GetInitiatedInstallmentPlanResponse,
    "GetInstallmentSchedulesRequest": GetInstallmentSchedulesRequest,
    "GetInstallmentsPlanExtendedResponse": GetInstallmentsPlanExtendedResponse,
    "GetInstallmentsPlanResponse": GetInstallmentsPlanResponse,
    "GetInstallmentsPlanSearchCriteriaRequest": GetInstallmentsPlanSearchCriteriaRequest,
    "GetInstallmentsScheduleResponse": GetInstallmentsScheduleResponse,
    "GetResourcesRequest": GetResourcesRequest,
    "GetResourcesRequestContext": GetResourcesRequestContext,
    "GetResourcesResponse": GetResourcesResponse,
    "InitiateInstallmentPlanRequest": InitiateInstallmentPlanRequest,
    "InitiateInstallmentsPlanResponse": InitiateInstallmentsPlanResponse,
    "InitiateInstallmentsPlanResponseAllOf": InitiateInstallmentsPlanResponseAllOf,
    "Installment": Installment,
    "Installment2": Installment2,
    "InstallmentPlan": InstallmentPlan,
    "InstallmentPlanDateInfo": InstallmentPlanDateInfo,
    "InstallmentPlanInitiatedStatuses": InstallmentPlanInitiatedStatuses,
    "InstallmentPlanQueryCriteria": InstallmentPlanQueryCriteria,
    "InstallmentPlanResponse": InstallmentPlanResponse,
    "ItemData": ItemData,
    "LearnMoreDetailsRequest": LearnMoreDetailsRequest,
    "LearnMoreDetailsResponse": LearnMoreDetailsResponse,
    "MerchantRef": MerchantRef,
    "MerchantRefAllOf": MerchantRefAllOf,
    "ModelError": ModelError,
    "Money": Money,
    "MoneyWithCurrencyCode": MoneyWithCurrencyCode,
    "PagingRequestHeader": PagingRequestHeader,
    "PagingResponseHeader": PagingResponseHeader,
    "PaymentFormMessage": PaymentFormMessage,
    "PaymentToken": PaymentToken,
    "PaymentWizardData": PaymentWizardData,
    "PaymentWizardDataResponse": PaymentWizardDataResponse,
    "PaymentWizardDataResponseAllOf": PaymentWizardDataResponseAllOf,
    "PlanApprovalEvidence": PlanApprovalEvidence,
    "PlanData": PlanData,
    "ReAuthorization": ReAuthorization,
    "RedirectUrls": RedirectUrls,
    "ReferenceEntityBase": ReferenceEntityBase,
    "RefundInstallmentPlanResponse": RefundInstallmentPlanResponse,
    "RefundInstallmentPlanResponseAllOf": RefundInstallmentPlanResponseAllOf,
    "RefundPlanRequest": RefundPlanRequest,
    "RelationsLoad": RelationsLoad,
    "RequestHeader": RequestHeader,
    "ResponseHeader": ResponseHeader,
    "Schedule": Schedule,
    "ScheduleElements": ScheduleElements,
    "StartInstallmentsRequest": StartInstallmentsRequest,
    "TermsAndConditions": TermsAndConditions,
    "TermsAndConditionsGetRequest": TermsAndConditionsGetRequest,
    "TermsAndConditionsGetResponse": TermsAndConditionsGetResponse,
    "TouchPoint": TouchPoint,
    "TransactionInfo": TransactionInfo,
    "TransactionResult": TransactionResult,
    "UpdateInstallmentPlanRequest": UpdateInstallmentPlanRequest,
    "UpdateInstallmentPlanRequestAllOf": UpdateInstallmentPlanRequestAllOf,
    "UpdateInstallmentsPlanResponse": UpdateInstallmentsPlanResponse,
    "User": User,
    "VerifyPaymentRequest": VerifyPaymentRequest,
    "VerifyPaymentResponse": VerifyPaymentResponse,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.serialize(date, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.deserialize(date, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
