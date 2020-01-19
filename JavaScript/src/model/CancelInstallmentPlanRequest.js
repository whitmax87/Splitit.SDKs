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
import InstallmentPlanCancelationReason from './InstallmentPlanCancelationReason';
import RefundUnderCancelation from './RefundUnderCancelation';

/**
 * The CancelInstallmentPlanRequest model module.
 * @module model/CancelInstallmentPlanRequest
 * @version 1.3.10
 */
class CancelInstallmentPlanRequest {
    /**
     * Constructs a new <code>CancelInstallmentPlanRequest</code>.
     * @alias module:model/CancelInstallmentPlanRequest
     * @param refundUnderCancelation {module:model/RefundUnderCancelation} 
     * @param cancelationReason {module:model/InstallmentPlanCancelationReason} 
     * @param isExecutedUnattended {Boolean} 
     */
    constructor(refundUnderCancelation, cancelationReason, isExecutedUnattended) { 
        
        CancelInstallmentPlanRequest.initialize(this, refundUnderCancelation, cancelationReason, isExecutedUnattended);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, refundUnderCancelation, cancelationReason, isExecutedUnattended) { 
        obj['RefundUnderCancelation'] = refundUnderCancelation;
        obj['CancelationReason'] = cancelationReason;
        obj['IsExecutedUnattended'] = isExecutedUnattended;
    }

    /**
     * Constructs a <code>CancelInstallmentPlanRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CancelInstallmentPlanRequest} obj Optional instance to populate.
     * @return {module:model/CancelInstallmentPlanRequest} The populated <code>CancelInstallmentPlanRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CancelInstallmentPlanRequest();

            if (data.hasOwnProperty('InstallmentPlanNumber')) {
                obj['InstallmentPlanNumber'] = ApiClient.convertToType(data['InstallmentPlanNumber'], 'String');
            }
            if (data.hasOwnProperty('RefundUnderCancelation')) {
                obj['RefundUnderCancelation'] = RefundUnderCancelation.constructFromObject(data['RefundUnderCancelation']);
            }
            if (data.hasOwnProperty('CancelationReason')) {
                obj['CancelationReason'] = InstallmentPlanCancelationReason.constructFromObject(data['CancelationReason']);
            }
            if (data.hasOwnProperty('IsExecutedUnattended')) {
                obj['IsExecutedUnattended'] = ApiClient.convertToType(data['IsExecutedUnattended'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {String} InstallmentPlanNumber
 */
CancelInstallmentPlanRequest.prototype['InstallmentPlanNumber'] = undefined;

/**
 * @member {module:model/RefundUnderCancelation} RefundUnderCancelation
 */
CancelInstallmentPlanRequest.prototype['RefundUnderCancelation'] = undefined;

/**
 * @member {module:model/InstallmentPlanCancelationReason} CancelationReason
 */
CancelInstallmentPlanRequest.prototype['CancelationReason'] = undefined;

/**
 * @member {Boolean} IsExecutedUnattended
 */
CancelInstallmentPlanRequest.prototype['IsExecutedUnattended'] = undefined;






export default CancelInstallmentPlanRequest;

