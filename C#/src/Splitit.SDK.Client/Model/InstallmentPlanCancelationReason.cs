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
    /// Defines InstallmentPlanCancelationReason
    /// </summary>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum InstallmentPlanCancelationReason
    {
        
        /// <summary>
        /// Enum Other for value: Other
        /// </summary>
        [EnumMember(Value = "Other")]
        Other = 1,
        
        /// <summary>
        /// Enum ChargeBackRequest for value: ChargeBackRequest
        /// </summary>
        [EnumMember(Value = "ChargeBackRequest")]
        ChargeBackRequest = 2
    }

}
