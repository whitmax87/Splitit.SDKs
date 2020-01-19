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
import InstallmentPlanQueryCriteria from './InstallmentPlanQueryCriteria';
import PagingRequestHeader from './PagingRequestHeader';
import RelationsLoad from './RelationsLoad';

/**
 * The GetInstallmentsPlanSearchCriteriaRequest model module.
 * @module model/GetInstallmentsPlanSearchCriteriaRequest
 * @version 1.3.10
 */
class GetInstallmentsPlanSearchCriteriaRequest {
    /**
     * Constructs a new <code>GetInstallmentsPlanSearchCriteriaRequest</code>.
     * @alias module:model/GetInstallmentsPlanSearchCriteriaRequest
     */
    constructor() { 
        
        GetInstallmentsPlanSearchCriteriaRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetInstallmentsPlanSearchCriteriaRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetInstallmentsPlanSearchCriteriaRequest} obj Optional instance to populate.
     * @return {module:model/GetInstallmentsPlanSearchCriteriaRequest} The populated <code>GetInstallmentsPlanSearchCriteriaRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetInstallmentsPlanSearchCriteriaRequest();

            if (data.hasOwnProperty('QueryCriteria')) {
                obj['QueryCriteria'] = InstallmentPlanQueryCriteria.constructFromObject(data['QueryCriteria']);
            }
            if (data.hasOwnProperty('LoadRelated')) {
                obj['LoadRelated'] = RelationsLoad.constructFromObject(data['LoadRelated']);
            }
            if (data.hasOwnProperty('PagingRequest')) {
                obj['PagingRequest'] = PagingRequestHeader.constructFromObject(data['PagingRequest']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InstallmentPlanQueryCriteria} QueryCriteria
 */
GetInstallmentsPlanSearchCriteriaRequest.prototype['QueryCriteria'] = undefined;

/**
 * @member {module:model/RelationsLoad} LoadRelated
 */
GetInstallmentsPlanSearchCriteriaRequest.prototype['LoadRelated'] = undefined;

/**
 * @member {module:model/PagingRequestHeader} PagingRequest
 */
GetInstallmentsPlanSearchCriteriaRequest.prototype['PagingRequest'] = undefined;






export default GetInstallmentsPlanSearchCriteriaRequest;

