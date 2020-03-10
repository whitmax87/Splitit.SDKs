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
import { Currency } from './';
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
     * @type {Currency}
     * @memberof PaymentWizardDataResponse
     */
    currencyDisplay?: Currency;
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
    addressIsReadonly: boolean;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponse
     */
    logoURL?: string;
    /**
     *
     * @type {Array<string>}
     * @memberof PaymentWizardDataResponse
     */
    paymentFormMessages?: Array<string>;
}
export declare function PaymentWizardDataResponseFromJSON(json: any): PaymentWizardDataResponse;
export declare function PaymentWizardDataResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): PaymentWizardDataResponse;
export declare function PaymentWizardDataResponseToJSON(value?: PaymentWizardDataResponse | null): any;