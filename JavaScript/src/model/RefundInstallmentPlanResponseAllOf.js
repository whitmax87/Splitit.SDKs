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
import Money from './Money';

/**
 * The RefundInstallmentPlanResponseAllOf model module.
 * @module model/RefundInstallmentPlanResponseAllOf
 * @version 1.1.0
 */
class RefundInstallmentPlanResponseAllOf {
    /**
     * Constructs a new <code>RefundInstallmentPlanResponseAllOf</code>.
     * @alias module:model/RefundInstallmentPlanResponseAllOf
     */
    constructor() { 
        
        RefundInstallmentPlanResponseAllOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RefundInstallmentPlanResponseAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RefundInstallmentPlanResponseAllOf} obj Optional instance to populate.
     * @return {module:model/RefundInstallmentPlanResponseAllOf} The populated <code>RefundInstallmentPlanResponseAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RefundInstallmentPlanResponseAllOf();

            if (data.hasOwnProperty('CurrentRefundAmount')) {
                obj['CurrentRefundAmount'] = Money.constructFromObject(data['CurrentRefundAmount']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Money} CurrentRefundAmount
 */
RefundInstallmentPlanResponseAllOf.prototype['CurrentRefundAmount'] = undefined;






export default RefundInstallmentPlanResponseAllOf;

