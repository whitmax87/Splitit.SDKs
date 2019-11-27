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
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PaymentWizardData model module.
 * @module model/PaymentWizardData
 * @version 1.0.0
 */
class PaymentWizardData {
    /**
     * Constructs a new <code>PaymentWizardData</code>.
     * @alias module:model/PaymentWizardData
     * @param isOpenedInIframe {Boolean} 
     */
    constructor(isOpenedInIframe) { 
        
        PaymentWizardData.initialize(this, isOpenedInIframe);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, isOpenedInIframe) { 
        obj['IsOpenedInIframe'] = isOpenedInIframe;
    }

    /**
     * Constructs a <code>PaymentWizardData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PaymentWizardData} obj Optional instance to populate.
     * @return {module:model/PaymentWizardData} The populated <code>PaymentWizardData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PaymentWizardData();

            if (data.hasOwnProperty('RequestedNumberOfInstallments')) {
                obj['RequestedNumberOfInstallments'] = ApiClient.convertToType(data['RequestedNumberOfInstallments'], 'String');
            }
            if (data.hasOwnProperty('SuccessExitURL')) {
                obj['SuccessExitURL'] = ApiClient.convertToType(data['SuccessExitURL'], 'String');
            }
            if (data.hasOwnProperty('ErrorExitURL')) {
                obj['ErrorExitURL'] = ApiClient.convertToType(data['ErrorExitURL'], 'String');
            }
            if (data.hasOwnProperty('CancelExitURL')) {
                obj['CancelExitURL'] = ApiClient.convertToType(data['CancelExitURL'], 'String');
            }
            if (data.hasOwnProperty('SuccessAsyncUrl')) {
                obj['SuccessAsyncUrl'] = ApiClient.convertToType(data['SuccessAsyncUrl'], 'String');
            }
            if (data.hasOwnProperty('ViewName')) {
                obj['ViewName'] = ApiClient.convertToType(data['ViewName'], 'String');
            }
            if (data.hasOwnProperty('IsOpenedInIframe')) {
                obj['IsOpenedInIframe'] = ApiClient.convertToType(data['IsOpenedInIframe'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {String} RequestedNumberOfInstallments
 */
PaymentWizardData.prototype['RequestedNumberOfInstallments'] = undefined;

/**
 * @member {String} SuccessExitURL
 */
PaymentWizardData.prototype['SuccessExitURL'] = undefined;

/**
 * @member {String} ErrorExitURL
 */
PaymentWizardData.prototype['ErrorExitURL'] = undefined;

/**
 * @member {String} CancelExitURL
 */
PaymentWizardData.prototype['CancelExitURL'] = undefined;

/**
 * @member {String} SuccessAsyncUrl
 */
PaymentWizardData.prototype['SuccessAsyncUrl'] = undefined;

/**
 * @member {String} ViewName
 */
PaymentWizardData.prototype['ViewName'] = undefined;

/**
 * @member {Boolean} IsOpenedInIframe
 */
PaymentWizardData.prototype['IsOpenedInIframe'] = undefined;






export default PaymentWizardData;

