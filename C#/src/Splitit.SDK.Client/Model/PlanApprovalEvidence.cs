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
    /// PlanApprovalEvidence
    /// </summary>
    [DataContract]
    public partial class PlanApprovalEvidence :  IEquatable<PlanApprovalEvidence>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlanApprovalEvidence" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PlanApprovalEvidence() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PlanApprovalEvidence" /> class.
        /// </summary>
        /// <param name="customerSignaturePngAsBase64">customerSignaturePngAsBase64.</param>
        /// <param name="areTermsAndConditionsApproved">areTermsAndConditionsApproved (required).</param>
        /// <param name="shopperApprovalDateTime">shopperApprovalDateTime.</param>
        public PlanApprovalEvidence(string customerSignaturePngAsBase64 = default(string), bool? areTermsAndConditionsApproved = default(bool?), DateTime? shopperApprovalDateTime = default(DateTime?))
        {
            // to ensure "areTermsAndConditionsApproved" is required (not null)
            if (areTermsAndConditionsApproved == null)
            {
                throw new InvalidDataException("areTermsAndConditionsApproved is a required property for PlanApprovalEvidence and cannot be null");
            }
            else
            {
                this.AreTermsAndConditionsApproved = areTermsAndConditionsApproved;
            }
            this.CustomerSignaturePngAsBase64 = customerSignaturePngAsBase64;
            this.ShopperApprovalDateTime = shopperApprovalDateTime;
        }

        
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
        /// Gets or Sets ShopperApprovalDateTime
        /// </summary>
        [DataMember(Name="ShopperApprovalDateTime", EmitDefaultValue=false)]
        public DateTime? ShopperApprovalDateTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PlanApprovalEvidence {\n");
            sb.Append("  CustomerSignaturePngAsBase64: ").Append(CustomerSignaturePngAsBase64).Append("\n");
            sb.Append("  AreTermsAndConditionsApproved: ").Append(AreTermsAndConditionsApproved).Append("\n");
            sb.Append("  ShopperApprovalDateTime: ").Append(ShopperApprovalDateTime).Append("\n");
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
            return this.Equals(input as PlanApprovalEvidence);
        }

        /// <summary>
        /// Returns true if PlanApprovalEvidence instances are equal
        /// </summary>
        /// <param name="input">Instance of PlanApprovalEvidence to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlanApprovalEvidence input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CustomerSignaturePngAsBase64 == input.CustomerSignaturePngAsBase64 ||
                    (this.CustomerSignaturePngAsBase64 != null &&
                    this.CustomerSignaturePngAsBase64.Equals(input.CustomerSignaturePngAsBase64))
                ) && 
                (
                    this.AreTermsAndConditionsApproved == input.AreTermsAndConditionsApproved ||
                    (this.AreTermsAndConditionsApproved != null &&
                    this.AreTermsAndConditionsApproved.Equals(input.AreTermsAndConditionsApproved))
                ) && 
                (
                    this.ShopperApprovalDateTime == input.ShopperApprovalDateTime ||
                    (this.ShopperApprovalDateTime != null &&
                    this.ShopperApprovalDateTime.Equals(input.ShopperApprovalDateTime))
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
                if (this.CustomerSignaturePngAsBase64 != null)
                    hashCode = hashCode * 59 + this.CustomerSignaturePngAsBase64.GetHashCode();
                if (this.AreTermsAndConditionsApproved != null)
                    hashCode = hashCode * 59 + this.AreTermsAndConditionsApproved.GetHashCode();
                if (this.ShopperApprovalDateTime != null)
                    hashCode = hashCode * 59 + this.ShopperApprovalDateTime.GetHashCode();
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
