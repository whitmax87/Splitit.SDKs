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
 */
import * as runtime from '../runtime';
import { FlexFieldsDataResponse } from '../models';
export interface TouchPointsFlexFieldsDataRequest {
    apiKey?: string | null;
    requestedNumberOfInstallments?: string | null;
}
/**
 * no description
 */
export declare class TouchPointsApi extends runtime.BaseAPI {
    /**
     */
    touchPointsFlexFieldsDataRaw(requestParameters: TouchPointsFlexFieldsDataRequest): Promise<runtime.ApiResponse<FlexFieldsDataResponse>>;
    /**
     */
    touchPointsFlexFieldsData(requestParameters: TouchPointsFlexFieldsDataRequest): Promise<FlexFieldsDataResponse>;
}