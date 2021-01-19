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
import { CardBrand, CardType, ExtendedCurrency, PaymentFormMessage, TermsAndConditions } from './';
/**
 *
 * @export
 * @interface PaymentWizardDataResponse
 */
export interface PaymentWizardDataResponse {
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    requestedNumberOfInstallments?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    successExitURL?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    errorExitURL?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    cancelExitURL?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    successAsyncUrl?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    viewName?: string;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    isOpenedInIframe: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    is3dSecureInPopup?: boolean;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    paymentFormMessage?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    showAddressElements?: string;
    /**
     *
     * @type {ExtendedCurrency}
     * @memberof PaymentWizardDataResponse
     */
    currencyDisplay?: ExtendedCurrency;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    forceDisplayImportantNotes: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    showShopperDetailsExpendedOnStart: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    showPaymentScheduleRequiredCredit: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    isShopperEmailMandatory: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    isShopperPhoneMandatory: boolean;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    numberOfInstallmentsSelectionsOption?: string;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    is3ds2Supported: boolean;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    processorName?: string;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    addressIsReadonly: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    phoneIsReadOnly: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    emailIsReadOnly: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    showLearnMore: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    showMobilePhone: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponse
     */
    showCloseDialogBeforeAbandon: boolean;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    logoURL?: string;
    /**
     *
     * @type {number}
     * @memberof PaymentWizardDataResponse
     */
    defaultNumOfInstallments: number;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    privacyPolicyUrl?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    termsAndConditionsUrl?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    learnMoreUrl?: string;
    /**
     *
     * @type {Array<CardType>}
     * @memberof PaymentWizardDataResponse
     */
    potentialCardTypes?: Array<CardType>;
    /**
     *
     * @type {Array<CardBrand>}
     * @memberof PaymentWizardDataResponse
     */
    potentialCardBrands?: Array<CardBrand>;
    /**
     *
     * @type {Array<PaymentFormMessage>}
     * @memberof PaymentWizardDataResponse
     */
    paymentFormMessages?: Array<PaymentFormMessage>;
    /**
     *
     * @type {{ [key: string]: string; }}
     * @memberof PaymentWizardDataResponse
     */
    displayProperties?: {
        [key: string]: string;
    };
    /**
     *
     * @type {TermsAndConditions}
     * @memberof PaymentWizardDataResponse
     */
    termsAndConditions?: TermsAndConditions;
}
export declare function PaymentWizardDataResponseFromJSON(json: any): PaymentWizardDataResponse;
export declare function PaymentWizardDataResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): PaymentWizardDataResponse;
export declare function PaymentWizardDataResponseToJSON(value?: PaymentWizardDataResponse | null): any;
