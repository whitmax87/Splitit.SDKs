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
 *
 */

import ApiClient from '../ApiClient';

/**
 * The VerifyPaymentRequest model module.
 * @module model/VerifyPaymentRequest
 * @version 1.3.10
 */
class VerifyPaymentRequest {
    /**
     * Constructs a new <code>VerifyPaymentRequest</code>.
     * @alias module:model/VerifyPaymentRequest
     */
    constructor() { 
        
        VerifyPaymentRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VerifyPaymentRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VerifyPaymentRequest} obj Optional instance to populate.
     * @return {module:model/VerifyPaymentRequest} The populated <code>VerifyPaymentRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VerifyPaymentRequest();

            if (data.hasOwnProperty('InstallmentPlanNumber')) {
                obj['InstallmentPlanNumber'] = ApiClient.convertToType(data['InstallmentPlanNumber'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} InstallmentPlanNumber
 */
VerifyPaymentRequest.prototype['InstallmentPlanNumber'] = undefined;






export default VerifyPaymentRequest;

