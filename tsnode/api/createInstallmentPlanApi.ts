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

import localVarRequest = require('request');
import http = require('http');

/* tslint:disable:no-unused-locals */
import { CreateInstallmentPlanLegacyResponse } from '../model/createInstallmentPlanLegacyResponse';

import { ObjectSerializer, Interceptor } from '../model/models';

import { HttpError, RequestFile } from './apis';
import { Configuration } from '../runtime';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================


export class CreateInstallmentPlanApi {
    protected _config: Configuration;
    protected _culture?: string;
    protected _defaultHeaders : any = {};

    protected interceptors: Interceptor[] = [];

    constructor(config: Configuration) {
        this._config = config;
        this._defaultHeaders = {
            "Splitit-SDK": "NodeJS-1.4.3"
        };
    }

    get defaultHeaders() {
        return this._defaultHeaders;
    }

    get basePath() {
        return this._config.basePath;
    }

    public setCulture(culture){
        this._culture = culture;
    }

    public addInterceptor(interceptor: Interceptor) {
        this.interceptors.push(interceptor);
    }

    /**
     * 
     * @param amountBeforeFees 
     * @param apiKey 
     * @param avsAddress 
     * @param avsZip 
     * @param cardCvv 
     * @param cardExpMonth 
     * @param cardExpYear 
     * @param cardHolder 
     * @param cardNumber 
     * @param cardTypeId 
     * @param consumerFullName 
     * @param countryId 
     * @param email 
     * @param installmentNumber 
     * @param paramX 
     * @param sessionId 
     */
    public async createInstallmentPlanGet (amountBeforeFees?: number, apiKey?: string, avsAddress?: string, avsZip?: string, cardCvv?: string, cardExpMonth?: string, cardExpYear?: string, cardHolder?: string, cardNumber?: string, cardTypeId?: number, consumerFullName?: string, countryId?: number, email?: string, installmentNumber?: number, paramX?: string, sessionId?: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: CreateInstallmentPlanLegacyResponse;  }> {
        const localVarPath = this.basePath + '/api/CreateInstallmentPlan';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['text/plain', 'application/json', 'text/json'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        if (amountBeforeFees !== undefined) {
            localVarQueryParameters['AmountBeforeFees'] = ObjectSerializer.serialize(amountBeforeFees, "number");
        }

        if (apiKey !== undefined) {
            localVarQueryParameters['ApiKey'] = ObjectSerializer.serialize(apiKey, "string");
        }

        if (avsAddress !== undefined) {
            localVarQueryParameters['AvsAddress'] = ObjectSerializer.serialize(avsAddress, "string");
        }

        if (avsZip !== undefined) {
            localVarQueryParameters['AvsZip'] = ObjectSerializer.serialize(avsZip, "string");
        }

        if (cardCvv !== undefined) {
            localVarQueryParameters['CardCvv'] = ObjectSerializer.serialize(cardCvv, "string");
        }

        if (cardExpMonth !== undefined) {
            localVarQueryParameters['CardExpMonth'] = ObjectSerializer.serialize(cardExpMonth, "string");
        }

        if (cardExpYear !== undefined) {
            localVarQueryParameters['CardExpYear'] = ObjectSerializer.serialize(cardExpYear, "string");
        }

        if (cardHolder !== undefined) {
            localVarQueryParameters['CardHolder'] = ObjectSerializer.serialize(cardHolder, "string");
        }

        if (cardNumber !== undefined) {
            localVarQueryParameters['CardNumber'] = ObjectSerializer.serialize(cardNumber, "string");
        }

        if (cardTypeId !== undefined) {
            localVarQueryParameters['CardTypeId'] = ObjectSerializer.serialize(cardTypeId, "number");
        }

        if (consumerFullName !== undefined) {
            localVarQueryParameters['ConsumerFullName'] = ObjectSerializer.serialize(consumerFullName, "string");
        }

        if (countryId !== undefined) {
            localVarQueryParameters['CountryId'] = ObjectSerializer.serialize(countryId, "number");
        }

        if (email !== undefined) {
            localVarQueryParameters['Email'] = ObjectSerializer.serialize(email, "string");
        }

        if (installmentNumber !== undefined) {
            localVarQueryParameters['InstallmentNumber'] = ObjectSerializer.serialize(installmentNumber, "number");
        }

        if (paramX !== undefined) {
            localVarQueryParameters['ParamX'] = ObjectSerializer.serialize(paramX, "string");
        }

        if (sessionId !== undefined) {
            localVarQueryParameters['SessionId'] = ObjectSerializer.serialize(sessionId, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: false,
            json: true,
        };

        if (this._config.touchPoint || this._config.sessionId){
            localVarRequestOptions.body.requestHeader = {};
            if (this._config.touchPoint){
                localVarRequestOptions.body.requestHeader.touchPoint = this._config.touchPoint;
            }

            if (this._config.sessionId){
                localVarRequestOptions.body.requestHeader.sessionId = this._config.sessionId;
                localVarRequestOptions.body.requestHeader.apiKey = this._config.apiKey;
            }

            if (this._culture){
                localVarRequestOptions.body.requestHeader.cultureName = this._culture;
            }
        }

        let interceptorPromise = Promise.resolve();
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.IncomingMessage; body: CreateInstallmentPlanLegacyResponse;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        body = ObjectSerializer.deserialize(body, "CreateInstallmentPlanLegacyResponse");

                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            if (body && body.responseHeader && !body.responseHeader.succeeded){
                                reject(body.responseHeader);
                            } else {
                                resolve({ response: response, body: body });
                            }                            
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
}
