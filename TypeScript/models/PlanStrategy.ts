/* tslint:disable */
/* eslint-disable */
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

/**
 * 
 * @export
 * @enum {string}
 */
export enum PlanStrategy {
    SecuredPlan = 'SecuredPlan',
    NonSecuredPlan = 'NonSecuredPlan',
    SecuredPlanCaptureExistingSecurityAuth = 'SecuredPlanCaptureExistingSecurityAuth',
    SecuredPlan3 = 'SecuredPlan3',
    SinglePayment = 'SinglePayment',
    ExternalInstallmentProvider = 'ExternalInstallmentProvider',
    SecuredPlan4 = 'SecuredPlan4'
}

export function PlanStrategyFromJSON(json: any): PlanStrategy {
    return PlanStrategyFromJSONTyped(json, false);
}

export function PlanStrategyFromJSONTyped(json: any, ignoreDiscriminator: boolean): PlanStrategy {
    return json as PlanStrategy;
}

export function PlanStrategyToJSON(value?: PlanStrategy | null): any {
    return value as any;
}

