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

import { RequestFile } from '../api';
import { CardBrand } from './cardBrand';
import { CardType } from './cardType';
import { ExtendedCurrency } from './extendedCurrency';
import { PaymentFormMessage } from './paymentFormMessage';
import { PaymentWizardData } from './paymentWizardData';
import { PaymentWizardDataResponseAllOf } from './paymentWizardDataResponseAllOf';
import { TermsAndConditions } from './termsAndConditions';

export class PaymentWizardDataResponse {
    'requestedNumberOfInstallments'?: string;
    'successExitURL'?: string;
    'errorExitURL'?: string;
    'cancelExitURL'?: string;
    'successAsyncUrl'?: string;
    'viewName'?: string;
    'isOpenedInIframe': boolean;
    'paymentFormMessage'?: string;
    'showAddressElements'?: string;
    'currencyDisplay'?: ExtendedCurrency;
    'forceDisplayImportantNotes': boolean;
    'showShopperDetailsExpendedOnStart': boolean;
    'showPaymentScheduleRequiredCredit': boolean;
    'isShopperEmailMandatory': boolean;
    'isShopperPhoneMandatory': boolean;
    'numberOfInstallmentsSelectionsOption'?: string;
    'addressIsReadonly': boolean;
    'phoneIsReadOnly': boolean;
    'emailIsReadOnly': boolean;
    'showLearnMore': boolean;
    'showMobilePhone': boolean;
    'logoURL'?: string;
    'privacyPolicyUrl'?: string;
    'termsAndConditionsUrl'?: string;
    'learnMoreUrl'?: string;
    'potentialCardTypes'?: Array<CardType>;
    'potentialCardBrands'?: Array<CardBrand>;
    'paymentFormMessages'?: Array<PaymentFormMessage>;
    'displayProperties'?: { [key: string]: string; };
    'termsAndConditions'?: TermsAndConditions;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "requestedNumberOfInstallments",
            "baseName": "RequestedNumberOfInstallments",
            "type": "string"
        },
        {
            "name": "successExitURL",
            "baseName": "SuccessExitURL",
            "type": "string"
        },
        {
            "name": "errorExitURL",
            "baseName": "ErrorExitURL",
            "type": "string"
        },
        {
            "name": "cancelExitURL",
            "baseName": "CancelExitURL",
            "type": "string"
        },
        {
            "name": "successAsyncUrl",
            "baseName": "SuccessAsyncUrl",
            "type": "string"
        },
        {
            "name": "viewName",
            "baseName": "ViewName",
            "type": "string"
        },
        {
            "name": "isOpenedInIframe",
            "baseName": "IsOpenedInIframe",
            "type": "boolean"
        },
        {
            "name": "paymentFormMessage",
            "baseName": "PaymentFormMessage",
            "type": "string"
        },
        {
            "name": "showAddressElements",
            "baseName": "ShowAddressElements",
            "type": "string"
        },
        {
            "name": "currencyDisplay",
            "baseName": "CurrencyDisplay",
            "type": "ExtendedCurrency"
        },
        {
            "name": "forceDisplayImportantNotes",
            "baseName": "ForceDisplayImportantNotes",
            "type": "boolean"
        },
        {
            "name": "showShopperDetailsExpendedOnStart",
            "baseName": "ShowShopperDetailsExpendedOnStart",
            "type": "boolean"
        },
        {
            "name": "showPaymentScheduleRequiredCredit",
            "baseName": "ShowPaymentScheduleRequiredCredit",
            "type": "boolean"
        },
        {
            "name": "isShopperEmailMandatory",
            "baseName": "IsShopperEmailMandatory",
            "type": "boolean"
        },
        {
            "name": "isShopperPhoneMandatory",
            "baseName": "IsShopperPhoneMandatory",
            "type": "boolean"
        },
        {
            "name": "numberOfInstallmentsSelectionsOption",
            "baseName": "NumberOfInstallmentsSelectionsOption",
            "type": "string"
        },
        {
            "name": "addressIsReadonly",
            "baseName": "AddressIsReadonly",
            "type": "boolean"
        },
        {
            "name": "phoneIsReadOnly",
            "baseName": "PhoneIsReadOnly",
            "type": "boolean"
        },
        {
            "name": "emailIsReadOnly",
            "baseName": "EmailIsReadOnly",
            "type": "boolean"
        },
        {
            "name": "showLearnMore",
            "baseName": "ShowLearnMore",
            "type": "boolean"
        },
        {
            "name": "showMobilePhone",
            "baseName": "ShowMobilePhone",
            "type": "boolean"
        },
        {
            "name": "logoURL",
            "baseName": "LogoURL",
            "type": "string"
        },
        {
            "name": "privacyPolicyUrl",
            "baseName": "PrivacyPolicyUrl",
            "type": "string"
        },
        {
            "name": "termsAndConditionsUrl",
            "baseName": "TermsAndConditionsUrl",
            "type": "string"
        },
        {
            "name": "learnMoreUrl",
            "baseName": "LearnMoreUrl",
            "type": "string"
        },
        {
            "name": "potentialCardTypes",
            "baseName": "PotentialCardTypes",
            "type": "Array<CardType>"
        },
        {
            "name": "potentialCardBrands",
            "baseName": "PotentialCardBrands",
            "type": "Array<CardBrand>"
        },
        {
            "name": "paymentFormMessages",
            "baseName": "PaymentFormMessages",
            "type": "Array<PaymentFormMessage>"
        },
        {
            "name": "displayProperties",
            "baseName": "DisplayProperties",
            "type": "{ [key: string]: string; }"
        },
        {
            "name": "termsAndConditions",
            "baseName": "TermsAndConditions",
            "type": "TermsAndConditions"
        }    ];

    static getAttributeTypeMap() {
        return PaymentWizardDataResponse.attributeTypeMap;
    }
}

