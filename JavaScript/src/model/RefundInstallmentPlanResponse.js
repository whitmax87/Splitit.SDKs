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
import InstallmentPlan from './InstallmentPlan';
import InstallmentPlanResponse from './InstallmentPlanResponse';
import Money from './Money';
import RefundInstallmentPlanResponseAllOf from './RefundInstallmentPlanResponseAllOf';
import ResponseHeader from './ResponseHeader';

/**
 * The RefundInstallmentPlanResponse model module.
 * @module model/RefundInstallmentPlanResponse
 * @version 1.3.10
 */
class RefundInstallmentPlanResponse {
    /**
     * Constructs a new <code>RefundInstallmentPlanResponse</code>.
     * @alias module:model/RefundInstallmentPlanResponse
     * @implements module:model/InstallmentPlanResponse
     * @implements module:model/RefundInstallmentPlanResponseAllOf
     */
    constructor() { 
        InstallmentPlanResponse.initialize(this);RefundInstallmentPlanResponseAllOf.initialize(this);
        RefundInstallmentPlanResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RefundInstallmentPlanResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RefundInstallmentPlanResponse} obj Optional instance to populate.
     * @return {module:model/RefundInstallmentPlanResponse} The populated <code>RefundInstallmentPlanResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RefundInstallmentPlanResponse();
            InstallmentPlanResponse.constructFromObject(data, obj);
            RefundInstallmentPlanResponseAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('ResponseHeader')) {
                obj['ResponseHeader'] = ResponseHeader.constructFromObject(data['ResponseHeader']);
            }
            if (data.hasOwnProperty('InstallmentPlan')) {
                obj['InstallmentPlan'] = InstallmentPlan.constructFromObject(data['InstallmentPlan']);
            }
            if (data.hasOwnProperty('CurrentRefundAmount')) {
                obj['CurrentRefundAmount'] = Money.constructFromObject(data['CurrentRefundAmount']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ResponseHeader} ResponseHeader
 */
RefundInstallmentPlanResponse.prototype['ResponseHeader'] = undefined;

/**
 * @member {module:model/InstallmentPlan} InstallmentPlan
 */
RefundInstallmentPlanResponse.prototype['InstallmentPlan'] = undefined;

/**
 * @member {module:model/Money} CurrentRefundAmount
 */
RefundInstallmentPlanResponse.prototype['CurrentRefundAmount'] = undefined;


// Implement InstallmentPlanResponse interface:
/**
 * @member {module:model/ResponseHeader} ResponseHeader
 */
InstallmentPlanResponse.prototype['ResponseHeader'] = undefined;
/**
 * @member {module:model/InstallmentPlan} InstallmentPlan
 */
InstallmentPlanResponse.prototype['InstallmentPlan'] = undefined;
// Implement RefundInstallmentPlanResponseAllOf interface:
/**
 * @member {module:model/Money} CurrentRefundAmount
 */
RefundInstallmentPlanResponseAllOf.prototype['CurrentRefundAmount'] = undefined;




export default RefundInstallmentPlanResponse;

