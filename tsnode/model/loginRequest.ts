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

import { RequestFile } from '../api';
import { TouchPoint } from './touchPoint';

export class LoginRequest {
    'userName'?: string;
    'password'?: string;
    'touchPoint'?: TouchPoint;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "userName",
            "baseName": "UserName",
            "type": "string"
        },
        {
            "name": "password",
            "baseName": "Password",
            "type": "string"
        },
        {
            "name": "touchPoint",
            "baseName": "TouchPoint",
            "type": "TouchPoint"
        }    ];

    static getAttributeTypeMap() {
        return LoginRequest.attributeTypeMap;
    }
}
