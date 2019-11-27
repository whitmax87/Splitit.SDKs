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
import InstallmentPlan from './InstallmentPlan';
import PagingResponseHeader from './PagingResponseHeader';
import ResponseHeader from './ResponseHeader';

/**
 * The GetInstallmentsPlanResponse model module.
 * @module model/GetInstallmentsPlanResponse
 * @version 1.0.0
 */
class GetInstallmentsPlanResponse {
    /**
     * Constructs a new <code>GetInstallmentsPlanResponse</code>.
     * @alias module:model/GetInstallmentsPlanResponse
     */
    constructor() { 
        
        GetInstallmentsPlanResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetInstallmentsPlanResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetInstallmentsPlanResponse} obj Optional instance to populate.
     * @return {module:model/GetInstallmentsPlanResponse} The populated <code>GetInstallmentsPlanResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetInstallmentsPlanResponse();

            if (data.hasOwnProperty('PlansList')) {
                obj['PlansList'] = ApiClient.convertToType(data['PlansList'], [InstallmentPlan]);
            }
            if (data.hasOwnProperty('ResponseHeader')) {
                obj['ResponseHeader'] = ResponseHeader.constructFromObject(data['ResponseHeader']);
            }
            if (data.hasOwnProperty('PagingResponseHeader')) {
                obj['PagingResponseHeader'] = PagingResponseHeader.constructFromObject(data['PagingResponseHeader']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/InstallmentPlan>} PlansList
 */
GetInstallmentsPlanResponse.prototype['PlansList'] = undefined;

/**
 * @member {module:model/ResponseHeader} ResponseHeader
 */
GetInstallmentsPlanResponse.prototype['ResponseHeader'] = undefined;

/**
 * @member {module:model/PagingResponseHeader} PagingResponseHeader
 */
GetInstallmentsPlanResponse.prototype['PagingResponseHeader'] = undefined;






export default GetInstallmentsPlanResponse;

