/* 
 * splitit-web-api-public
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
    /// ResponseHeader
    /// </summary>
    [DataContract]
    public partial class ResponseHeader :  IEquatable<ResponseHeader>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResponseHeader" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ResponseHeader() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ResponseHeader" /> class.
        /// </summary>
        /// <param name="succeeded">succeeded (required).</param>
        /// <param name="errors">errors.</param>
        public ResponseHeader(bool? succeeded = default(bool?), List<Error> errors = default(List<Error>))
        {
            // to ensure "succeeded" is required (not null)
            if (succeeded == null)
            {
                throw new InvalidDataException("succeeded is a required property for ResponseHeader and cannot be null");
            }
            else
            {
                this.Succeeded = succeeded;
            }
            this.Errors = errors;
        }
        
        /// <summary>
        /// Gets or Sets Succeeded
        /// </summary>
        [DataMember(Name="Succeeded", EmitDefaultValue=false)]
        public bool? Succeeded { get; set; }

        /// <summary>
        /// Gets or Sets Errors
        /// </summary>
        [DataMember(Name="Errors", EmitDefaultValue=false)]
        public List<Error> Errors { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ResponseHeader {\n");
            sb.Append("  Succeeded: ").Append(Succeeded).Append("\n");
            sb.Append("  Errors: ").Append(Errors).Append("\n");
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
            return this.Equals(input as ResponseHeader);
        }

        /// <summary>
        /// Returns true if ResponseHeader instances are equal
        /// </summary>
        /// <param name="input">Instance of ResponseHeader to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResponseHeader input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Succeeded == input.Succeeded ||
                    (this.Succeeded != null &&
                    this.Succeeded.Equals(input.Succeeded))
                ) && 
                (
                    this.Errors == input.Errors ||
                    this.Errors != null &&
                    this.Errors.SequenceEqual(input.Errors)
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
                if (this.Succeeded != null)
                    hashCode = hashCode * 59 + this.Succeeded.GetHashCode();
                if (this.Errors != null)
                    hashCode = hashCode * 59 + this.Errors.GetHashCode();
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
