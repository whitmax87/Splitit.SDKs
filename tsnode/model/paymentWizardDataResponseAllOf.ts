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
import { Currency } from './currency';

export class PaymentWizardDataResponseAllOf {
    'showAddressElements'?: string;
    'currencyDisplay'?: Currency;
    'forceDisplayImportantNotes': boolean;
    'showShopperDetailsExpendedOnStart': boolean;
    'showPaymentScheduleRequiredCredit': boolean;
    'isShopperEmailMandatory': boolean;
    'isShopperPhoneMandatory': boolean;
    'numberOfInstallmentsSelectionsOption'?: string;
    'addressIsReadonly': boolean;
    'logoURL'?: string;
    'privacyPolicyUrl'?: string;
    'termsAndConditionsUrl'?: string;
    'learnMoreUrl'?: string;
    'paymentFormMessages'?: Array<string>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "showAddressElements",
            "baseName": "ShowAddressElements",
            "type": "string"
        },
        {
            "name": "currencyDisplay",
            "baseName": "CurrencyDisplay",
            "type": "Currency"
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
            "name": "paymentFormMessages",
            "baseName": "PaymentFormMessages",
            "type": "Array<string>"
        }    ];

    static getAttributeTypeMap() {
        return PaymentWizardDataResponseAllOf.attributeTypeMap;
    }
}
