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
 * The Get3DSecureParametersRequest model module.
 * @module model/Get3DSecureParametersRequest
 * @version 1.3.10
 */
class Get3DSecureParametersRequest {
    /**
     * Constructs a new <code>Get3DSecureParametersRequest</code>.
     * @alias module:model/Get3DSecureParametersRequest
     */
    constructor() { 
        
        Get3DSecureParametersRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Get3DSecureParametersRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Get3DSecureParametersRequest} obj Optional instance to populate.
     * @return {module:model/Get3DSecureParametersRequest} The populated <code>Get3DSecureParametersRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Get3DSecureParametersRequest();

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
Get3DSecureParametersRequest.prototype['InstallmentPlanNumber'] = undefined;






export default Get3DSecureParametersRequest;

