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
 * The TouchPoint model module.
 * @module model/TouchPoint
 * @version 1.0.0
 */
class TouchPoint {
    /**
     * Constructs a new <code>TouchPoint</code>.
     * @alias module:model/TouchPoint
     */
    constructor() { 
        
        TouchPoint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TouchPoint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TouchPoint} obj Optional instance to populate.
     * @return {module:model/TouchPoint} The populated <code>TouchPoint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TouchPoint();

            if (data.hasOwnProperty('Code')) {
                obj['Code'] = ApiClient.convertToType(data['Code'], 'String');
            }
            if (data.hasOwnProperty('Version')) {
                obj['Version'] = ApiClient.convertToType(data['Version'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Code
 */
TouchPoint.prototype['Code'] = undefined;

/**
 * @member {String} Version
 */
TouchPoint.prototype['Version'] = undefined;






export default TouchPoint;

