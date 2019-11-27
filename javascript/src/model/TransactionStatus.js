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
* Enum class TransactionStatus.
* @enum {}
* @readonly
*/
export default class TransactionStatus {
    
        /**
         * value: "Pending"
         * @const
         */
        "Pending" = "Pending";

    
        /**
         * value: "FinishedSuccessfully"
         * @const
         */
        "FinishedSuccessfully" = "FinishedSuccessfully";

    
        /**
         * value: "Failed"
         * @const
         */
        "Failed" = "Failed";

    
        /**
         * value: "AllStatuses"
         * @const
         */
        "AllStatuses" = "AllStatuses";

    

    /**
    * Returns a <code>TransactionStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TransactionStatus} The enum <code>TransactionStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

