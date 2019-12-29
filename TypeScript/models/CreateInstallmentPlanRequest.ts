/* tslint:disable */
/* eslint-disable */
/**
 * splitit-web-api-public
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    AddressData,
    AddressDataFromJSON,
    AddressDataFromJSONTyped,
    AddressDataToJSON,
    CardData,
    CardDataFromJSON,
    CardDataFromJSONTyped,
    CardDataToJSON,
    CartData,
    CartDataFromJSON,
    CartDataFromJSONTyped,
    CartDataToJSON,
    ConsumerData,
    ConsumerDataFromJSON,
    ConsumerDataFromJSONTyped,
    ConsumerDataToJSON,
    EventsEndpoints,
    EventsEndpointsFromJSON,
    EventsEndpointsFromJSONTyped,
    EventsEndpointsToJSON,
    ExternalAuth,
    ExternalAuthFromJSON,
    ExternalAuthFromJSONTyped,
    ExternalAuthToJSON,
    PaymentToken,
    PaymentTokenFromJSON,
    PaymentTokenFromJSONTyped,
    PaymentTokenToJSON,
    PlanApprovalEvidence,
    PlanApprovalEvidenceFromJSON,
    PlanApprovalEvidenceFromJSONTyped,
    PlanApprovalEvidenceToJSON,
    PlanData,
    PlanDataFromJSON,
    PlanDataFromJSONTyped,
    PlanDataToJSON,
    RedirectUrls,
    RedirectUrlsFromJSON,
    RedirectUrlsFromJSONTyped,
    RedirectUrlsToJSON,
    RequestHeader,
    RequestHeaderFromJSON,
    RequestHeaderFromJSONTyped,
    RequestHeaderToJSON,
} from './';

/**
 * 
 * @export
 * @interface CreateInstallmentPlanRequest
 */
export interface CreateInstallmentPlanRequest {
    /**
     * 
     * @type {RequestHeader}
     * @memberof CreateInstallmentPlanRequest
     */
    requestHeader?: RequestHeader;
    /**
     * 
     * @type {string}
     * @memberof CreateInstallmentPlanRequest
     */
    installmentPlanNumber?: string;
    /**
     * 
     * @type {PlanData}
     * @memberof CreateInstallmentPlanRequest
     */
    planData?: PlanData;
    /**
     * 
     * @type {CartData}
     * @memberof CreateInstallmentPlanRequest
     */
    cartData?: CartData;
    /**
     * 
     * @type {ConsumerData}
     * @memberof CreateInstallmentPlanRequest
     */
    consumerData?: ConsumerData;
    /**
     * 
     * @type {AddressData}
     * @memberof CreateInstallmentPlanRequest
     */
    billingAddress?: AddressData;
    /**
     * 
     * @type {CardData}
     * @memberof CreateInstallmentPlanRequest
     */
    creditCardDetails?: CardData;
    /**
     * 
     * @type {PaymentToken}
     * @memberof CreateInstallmentPlanRequest
     */
    paymentToken?: PaymentToken;
    /**
     * 
     * @type {PlanApprovalEvidence}
     * @memberof CreateInstallmentPlanRequest
     */
    planApprovalEvidence?: PlanApprovalEvidence;
    /**
     * 
     * @type {RedirectUrls}
     * @memberof CreateInstallmentPlanRequest
     */
    redirectUrls?: RedirectUrls;
    /**
     * 
     * @type {EventsEndpoints}
     * @memberof CreateInstallmentPlanRequest
     */
    eventsEndpoints?: EventsEndpoints;
    /**
     * 
     * @type {ExternalAuth}
     * @memberof CreateInstallmentPlanRequest
     */
    externalAuth?: ExternalAuth;
}

export function CreateInstallmentPlanRequestFromJSON(json: any): CreateInstallmentPlanRequest {
    return CreateInstallmentPlanRequestFromJSONTyped(json, false);
}

export function CreateInstallmentPlanRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateInstallmentPlanRequest {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'requestHeader': !exists(json, 'RequestHeader') ? undefined : RequestHeaderFromJSON(json['RequestHeader']),
        'installmentPlanNumber': !exists(json, 'InstallmentPlanNumber') ? undefined : json['InstallmentPlanNumber'],
        'planData': !exists(json, 'PlanData') ? undefined : PlanDataFromJSON(json['PlanData']),
        'cartData': !exists(json, 'CartData') ? undefined : CartDataFromJSON(json['CartData']),
        'consumerData': !exists(json, 'ConsumerData') ? undefined : ConsumerDataFromJSON(json['ConsumerData']),
        'billingAddress': !exists(json, 'BillingAddress') ? undefined : AddressDataFromJSON(json['BillingAddress']),
        'creditCardDetails': !exists(json, 'CreditCardDetails') ? undefined : CardDataFromJSON(json['CreditCardDetails']),
        'paymentToken': !exists(json, 'PaymentToken') ? undefined : PaymentTokenFromJSON(json['PaymentToken']),
        'planApprovalEvidence': !exists(json, 'PlanApprovalEvidence') ? undefined : PlanApprovalEvidenceFromJSON(json['PlanApprovalEvidence']),
        'redirectUrls': !exists(json, 'RedirectUrls') ? undefined : RedirectUrlsFromJSON(json['RedirectUrls']),
        'eventsEndpoints': !exists(json, 'EventsEndpoints') ? undefined : EventsEndpointsFromJSON(json['EventsEndpoints']),
        'externalAuth': !exists(json, 'ExternalAuth') ? undefined : ExternalAuthFromJSON(json['ExternalAuth']),
    };
}

export function CreateInstallmentPlanRequestToJSON(value?: CreateInstallmentPlanRequest | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'RequestHeader': RequestHeaderToJSON(value.requestHeader),
        'InstallmentPlanNumber': value.installmentPlanNumber,
        'PlanData': PlanDataToJSON(value.planData),
        'CartData': CartDataToJSON(value.cartData),
        'ConsumerData': ConsumerDataToJSON(value.consumerData),
        'BillingAddress': AddressDataToJSON(value.billingAddress),
        'CreditCardDetails': CardDataToJSON(value.creditCardDetails),
        'PaymentToken': PaymentTokenToJSON(value.paymentToken),
        'PlanApprovalEvidence': PlanApprovalEvidenceToJSON(value.planApprovalEvidence),
        'RedirectUrls': RedirectUrlsToJSON(value.redirectUrls),
        'EventsEndpoints': EventsEndpointsToJSON(value.eventsEndpoints),
        'ExternalAuth': ExternalAuthToJSON(value.externalAuth),
    };
}


