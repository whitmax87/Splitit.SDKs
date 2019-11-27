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
 * The InstallmentPlanInitiatedStatuses model module.
 * @module model/InstallmentPlanInitiatedStatuses
 * @version 1.0.0
 */
class InstallmentPlanInitiatedStatuses {
    /**
     * Constructs a new <code>InstallmentPlanInitiatedStatuses</code>.
     * @alias module:model/InstallmentPlanInitiatedStatuses
     * @param showInitiatedPlansPaymentRequestSent {Boolean} 
     */
    constructor(showInitiatedPlansPaymentRequestSent) { 
        
        InstallmentPlanInitiatedStatuses.initialize(this, showInitiatedPlansPaymentRequestSent);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, showInitiatedPlansPaymentRequestSent) { 
        obj['ShowInitiatedPlansPaymentRequestSent'] = showInitiatedPlansPaymentRequestSent;
    }

    /**
     * Constructs a <code>InstallmentPlanInitiatedStatuses</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InstallmentPlanInitiatedStatuses} obj Optional instance to populate.
     * @return {module:model/InstallmentPlanInitiatedStatuses} The populated <code>InstallmentPlanInitiatedStatuses</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InstallmentPlanInitiatedStatuses();

            if (data.hasOwnProperty('ShowInitiatedPlansPaymentRequestSent')) {
                obj['ShowInitiatedPlansPaymentRequestSent'] = ApiClient.convertToType(data['ShowInitiatedPlansPaymentRequestSent'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} ShowInitiatedPlansPaymentRequestSent
 */
InstallmentPlanInitiatedStatuses.prototype['ShowInitiatedPlansPaymentRequestSent'] = undefined;






export default InstallmentPlanInitiatedStatuses;

