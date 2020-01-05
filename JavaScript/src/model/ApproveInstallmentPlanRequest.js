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
 * The ApproveInstallmentPlanRequest model module.
 * @module model/ApproveInstallmentPlanRequest
 * @version 1.1.0
 */
class ApproveInstallmentPlanRequest {
    /**
     * Constructs a new <code>ApproveInstallmentPlanRequest</code>.
     * @alias module:model/ApproveInstallmentPlanRequest
     * @param areTermsAndConditionsApproved {Boolean} 
     */
    constructor(areTermsAndConditionsApproved) { 
        
        ApproveInstallmentPlanRequest.initialize(this, areTermsAndConditionsApproved);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, areTermsAndConditionsApproved) { 
        obj['AreTermsAndConditionsApproved'] = areTermsAndConditionsApproved;
    }

    /**
     * Constructs a <code>ApproveInstallmentPlanRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ApproveInstallmentPlanRequest} obj Optional instance to populate.
     * @return {module:model/ApproveInstallmentPlanRequest} The populated <code>ApproveInstallmentPlanRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApproveInstallmentPlanRequest();

            if (data.hasOwnProperty('InstallmentPlanNumber')) {
                obj['InstallmentPlanNumber'] = ApiClient.convertToType(data['InstallmentPlanNumber'], 'String');
            }
            if (data.hasOwnProperty('CustomerSignaturePngAsBase64')) {
                obj['CustomerSignaturePngAsBase64'] = ApiClient.convertToType(data['CustomerSignaturePngAsBase64'], 'String');
            }
            if (data.hasOwnProperty('AreTermsAndConditionsApproved')) {
                obj['AreTermsAndConditionsApproved'] = ApiClient.convertToType(data['AreTermsAndConditionsApproved'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {String} InstallmentPlanNumber
 */
ApproveInstallmentPlanRequest.prototype['InstallmentPlanNumber'] = undefined;

/**
 * @member {String} CustomerSignaturePngAsBase64
 */
ApproveInstallmentPlanRequest.prototype['CustomerSignaturePngAsBase64'] = undefined;

/**
 * @member {Boolean} AreTermsAndConditionsApproved
 */
ApproveInstallmentPlanRequest.prototype['AreTermsAndConditionsApproved'] = undefined;






export default ApproveInstallmentPlanRequest;

