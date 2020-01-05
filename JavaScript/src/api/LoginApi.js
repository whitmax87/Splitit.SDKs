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


import ApiClient from "../ApiClient";
import LoginRequest from '../model/LoginRequest';
import LoginResponse from '../model/LoginResponse';

/**
* Login service.
* @module api/LoginApi
* @version 1.1.0
*/
export default class LoginApi {

    /**
    * Constructs a new LoginApi. 
    * @alias module:api/LoginApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance();
    }


    /**
     * Callback function to receive the result of the loginGet operation.
     * @callback module:api/LoginApi~loginGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LoginResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {String} opts.userName 
     * @param {String} opts.password 
     * @param {module:api/LoginApi~loginGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LoginResponse}
     */
    loginGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserName': opts['userName'],
        'Password': opts['password']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = LoginResponse;
      return this.apiClient.callApi(
        '/api/Login', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the loginPost operation.
     * @callback module:api/LoginApi~loginPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LoginResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/LoginRequest} request 
     * @param {module:api/LoginApi~loginPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LoginResponse}
     */
    loginPost(request, callback) {
      let postBody = request;
      // verify the required parameter 'request' is set
      if (request === undefined || request === null) {
        throw new Error("Missing the required parameter 'request' when calling loginPost");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json-patch+json', 'application/json', 'application/_*+json'];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = LoginResponse;
      return this.apiClient.callApi(
        '/api/Login', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
