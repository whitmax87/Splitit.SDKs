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
    /// RedirectUrls
    /// </summary>
    [DataContract]
    public partial class RedirectUrls :  IEquatable<RedirectUrls>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RedirectUrls" /> class.
        /// </summary>
        /// <param name="succeeded">succeeded.</param>
        /// <param name="canceled">canceled.</param>
        /// <param name="failed">failed.</param>
        public RedirectUrls(string succeeded = default(string), string canceled = default(string), string failed = default(string))
        {
            this.Succeeded = succeeded;
            this.Canceled = canceled;
            this.Failed = failed;
        }

        
        /// <summary>
        /// Gets or Sets Succeeded
        /// </summary>
        [DataMember(Name="Succeeded", EmitDefaultValue=false)]
        public string Succeeded { get; set; }

        /// <summary>
        /// Gets or Sets Canceled
        /// </summary>
        [DataMember(Name="Canceled", EmitDefaultValue=false)]
        public string Canceled { get; set; }

        /// <summary>
        /// Gets or Sets Failed
        /// </summary>
        [DataMember(Name="Failed", EmitDefaultValue=false)]
        public string Failed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RedirectUrls {\n");
            sb.Append("  Succeeded: ").Append(Succeeded).Append("\n");
            sb.Append("  Canceled: ").Append(Canceled).Append("\n");
            sb.Append("  Failed: ").Append(Failed).Append("\n");
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
            return this.Equals(input as RedirectUrls);
        }

        /// <summary>
        /// Returns true if RedirectUrls instances are equal
        /// </summary>
        /// <param name="input">Instance of RedirectUrls to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RedirectUrls input)
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
                    this.Canceled == input.Canceled ||
                    (this.Canceled != null &&
                    this.Canceled.Equals(input.Canceled))
                ) && 
                (
                    this.Failed == input.Failed ||
                    (this.Failed != null &&
                    this.Failed.Equals(input.Failed))
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
                if (this.Canceled != null)
                    hashCode = hashCode * 59 + this.Canceled.GetHashCode();
                if (this.Failed != null)
                    hashCode = hashCode * 59 + this.Failed.GetHashCode();
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
