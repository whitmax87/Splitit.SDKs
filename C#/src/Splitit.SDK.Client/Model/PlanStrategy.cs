/* 
 * splitit-web-api-public-sdk
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = Splitit.SDK.Client.Client.SwaggerDateConverter;

namespace Splitit.SDK.Client.Model
{
    /// <summary>
    /// Defines PlanStrategy
    /// </summary>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum PlanStrategy
    {
        
        /// <summary>
        /// Enum SecuredPlan for value: SecuredPlan
        /// </summary>
        [EnumMember(Value = "SecuredPlan")]
        SecuredPlan = 1,
        
        /// <summary>
        /// Enum NonSecuredPlan for value: NonSecuredPlan
        /// </summary>
        [EnumMember(Value = "NonSecuredPlan")]
        NonSecuredPlan = 2,
        
        /// <summary>
        /// Enum SecuredPlanCaptureExistingSecurityAuth for value: SecuredPlanCaptureExistingSecurityAuth
        /// </summary>
        [EnumMember(Value = "SecuredPlanCaptureExistingSecurityAuth")]
        SecuredPlanCaptureExistingSecurityAuth = 3,
        
        /// <summary>
        /// Enum SecuredPlan3 for value: SecuredPlan3
        /// </summary>
        [EnumMember(Value = "SecuredPlan3")]
        SecuredPlan3 = 4,
        
        /// <summary>
        /// Enum SinglePayment for value: SinglePayment
        /// </summary>
        [EnumMember(Value = "SinglePayment")]
        SinglePayment = 5
    }

}
