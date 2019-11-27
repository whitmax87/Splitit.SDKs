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
import Error from './Error';

/**
 * The ResponseHeader model module.
 * @module model/ResponseHeader
 * @version 1.0.0
 */
class ResponseHeader {
    /**
     * Constructs a new <code>ResponseHeader</code>.
     * @alias module:model/ResponseHeader
     * @param succeeded {Boolean} 
     */
    constructor(succeeded) { 
        
        ResponseHeader.initialize(this, succeeded);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, succeeded) { 
        obj['Succeeded'] = succeeded;
    }

    /**
     * Constructs a <code>ResponseHeader</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ResponseHeader} obj Optional instance to populate.
     * @return {module:model/ResponseHeader} The populated <code>ResponseHeader</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResponseHeader();

            if (data.hasOwnProperty('Succeeded')) {
                obj['Succeeded'] = ApiClient.convertToType(data['Succeeded'], 'Boolean');
            }
            if (data.hasOwnProperty('Errors')) {
                obj['Errors'] = ApiClient.convertToType(data['Errors'], [Error]);
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} Succeeded
 */
ResponseHeader.prototype['Succeeded'] = undefined;

/**
 * @member {Array.<module:model/Error>} Errors
 */
ResponseHeader.prototype['Errors'] = undefined;






export default ResponseHeader;

