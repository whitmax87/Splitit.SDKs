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
    /// ApproveInstallmentPlanRequest
    /// </summary>
    [DataContract]
    public partial class ApproveInstallmentPlanRequest :  IEquatable<ApproveInstallmentPlanRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApproveInstallmentPlanRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ApproveInstallmentPlanRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ApproveInstallmentPlanRequest" /> class.
        /// </summary>
        /// <param name="installmentPlanNumber">installmentPlanNumber.</param>
        /// <param name="customerSignaturePngAsBase64">customerSignaturePngAsBase64.</param>
        /// <param name="areTermsAndConditionsApproved">areTermsAndConditionsApproved (required).</param>
        public ApproveInstallmentPlanRequest(string installmentPlanNumber = default(string), string customerSignaturePngAsBase64 = default(string), bool? areTermsAndConditionsApproved = default(bool?))
        {
            // to ensure "areTermsAndConditionsApproved" is required (not null)
            if (areTermsAndConditionsApproved == null)
            {
                throw new InvalidDataException("areTermsAndConditionsApproved is a required property for ApproveInstallmentPlanRequest and cannot be null");
            }
            else
            {
                this.AreTermsAndConditionsApproved = areTermsAndConditionsApproved;
            }
            this.InstallmentPlanNumber = installmentPlanNumber;
            this.CustomerSignaturePngAsBase64 = customerSignaturePngAsBase64;
        }

        [DataMember(Name="RequestHeader", EmitDefaultValue=false)]
        internal RequestHeader RequestHeader { get; set; }
        
        /// <summary>
        /// Gets or Sets InstallmentPlanNumber
        /// </summary>
        [DataMember(Name="InstallmentPlanNumber", EmitDefaultValue=false)]
        public string InstallmentPlanNumber { get; set; }

        /// <summary>
        /// Gets or Sets CustomerSignaturePngAsBase64
        /// </summary>
        [DataMember(Name="CustomerSignaturePngAsBase64", EmitDefaultValue=false)]
        public string CustomerSignaturePngAsBase64 { get; set; }

        /// <summary>
        /// Gets or Sets AreTermsAndConditionsApproved
        /// </summary>
        [DataMember(Name="AreTermsAndConditionsApproved", EmitDefaultValue=false)]
        public bool? AreTermsAndConditionsApproved { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApproveInstallmentPlanRequest {\n");
            sb.Append("  InstallmentPlanNumber: ").Append(InstallmentPlanNumber).Append("\n");
            sb.Append("  CustomerSignaturePngAsBase64: ").Append(CustomerSignaturePngAsBase64).Append("\n");
            sb.Append("  AreTermsAndConditionsApproved: ").Append(AreTermsAndConditionsApproved).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ApproveInstallmentPlanRequest);
        }

        /// <summary>
        /// Returns true if ApproveInstallmentPlanRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of ApproveInstallmentPlanRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApproveInstallmentPlanRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.InstallmentPlanNumber == input.InstallmentPlanNumber ||
                    (this.InstallmentPlanNumber != null &&
                    this.InstallmentPlanNumber.Equals(input.InstallmentPlanNumber))
                ) && 
                (
                    this.CustomerSignaturePngAsBase64 == input.CustomerSignaturePngAsBase64 ||
                    (this.CustomerSignaturePngAsBase64 != null &&
                    this.CustomerSignaturePngAsBase64.Equals(input.CustomerSignaturePngAsBase64))
                ) && 
                (
                    this.AreTermsAndConditionsApproved == input.AreTermsAndConditionsApproved ||
                    (this.AreTermsAndConditionsApproved != null &&
                    this.AreTermsAndConditionsApproved.Equals(input.AreTermsAndConditionsApproved))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.InstallmentPlanNumber != null)
                    hashCode = hashCode * 59 + this.InstallmentPlanNumber.GetHashCode();
                if (this.CustomerSignaturePngAsBase64 != null)
                    hashCode = hashCode * 59 + this.CustomerSignaturePngAsBase64.GetHashCode();
                if (this.AreTermsAndConditionsApproved != null)
                    hashCode = hashCode * 59 + this.AreTermsAndConditionsApproved.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
