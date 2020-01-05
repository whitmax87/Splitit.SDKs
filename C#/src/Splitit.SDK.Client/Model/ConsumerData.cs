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
    /// ConsumerData
    /// </summary>
    [DataContract]
    public partial class ConsumerData :  IEquatable<ConsumerData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConsumerData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ConsumerData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ConsumerData" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="userName">userName.</param>
        /// <param name="fullName">fullName.</param>
        /// <param name="email">email.</param>
        /// <param name="phoneNumber">phoneNumber.</param>
        /// <param name="cultureName">cultureName.</param>
        /// <param name="roleName">roleName.</param>
        /// <param name="isLocked">isLocked (required).</param>
        /// <param name="isDataRestricted">isDataRestricted (required).</param>
        public ConsumerData(string id = default(string), string userName = default(string), string fullName = default(string), string email = default(string), string phoneNumber = default(string), string cultureName = default(string), string roleName = default(string), bool? isLocked = default(bool?), bool? isDataRestricted = default(bool?))
        {
            // to ensure "isLocked" is required (not null)
            if (isLocked == null)
            {
                throw new InvalidDataException("isLocked is a required property for ConsumerData and cannot be null");
            }
            else
            {
                this.IsLocked = isLocked;
            }
            // to ensure "isDataRestricted" is required (not null)
            if (isDataRestricted == null)
            {
                throw new InvalidDataException("isDataRestricted is a required property for ConsumerData and cannot be null");
            }
            else
            {
                this.IsDataRestricted = isDataRestricted;
            }
            this.Id = id;
            this.UserName = userName;
            this.FullName = fullName;
            this.Email = email;
            this.PhoneNumber = phoneNumber;
            this.CultureName = cultureName;
            this.RoleName = roleName;
        }

        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets UserName
        /// </summary>
        [DataMember(Name="UserName", EmitDefaultValue=false)]
        public string UserName { get; set; }

        /// <summary>
        /// Gets or Sets FullName
        /// </summary>
        [DataMember(Name="FullName", EmitDefaultValue=false)]
        public string FullName { get; set; }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name="Email", EmitDefaultValue=false)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets PhoneNumber
        /// </summary>
        [DataMember(Name="PhoneNumber", EmitDefaultValue=false)]
        public string PhoneNumber { get; set; }

        /// <summary>
        /// Gets or Sets CultureName
        /// </summary>
        [DataMember(Name="CultureName", EmitDefaultValue=false)]
        public string CultureName { get; set; }

        /// <summary>
        /// Gets or Sets RoleName
        /// </summary>
        [DataMember(Name="RoleName", EmitDefaultValue=false)]
        public string RoleName { get; set; }

        /// <summary>
        /// Gets or Sets IsLocked
        /// </summary>
        [DataMember(Name="IsLocked", EmitDefaultValue=false)]
        public bool? IsLocked { get; set; }

        /// <summary>
        /// Gets or Sets IsDataRestricted
        /// </summary>
        [DataMember(Name="IsDataRestricted", EmitDefaultValue=false)]
        public bool? IsDataRestricted { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConsumerData {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  UserName: ").Append(UserName).Append("\n");
            sb.Append("  FullName: ").Append(FullName).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append("\n");
            sb.Append("  CultureName: ").Append(CultureName).Append("\n");
            sb.Append("  RoleName: ").Append(RoleName).Append("\n");
            sb.Append("  IsLocked: ").Append(IsLocked).Append("\n");
            sb.Append("  IsDataRestricted: ").Append(IsDataRestricted).Append("\n");
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
            return this.Equals(input as ConsumerData);
        }

        /// <summary>
        /// Returns true if ConsumerData instances are equal
        /// </summary>
        /// <param name="input">Instance of ConsumerData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConsumerData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.UserName == input.UserName ||
                    (this.UserName != null &&
                    this.UserName.Equals(input.UserName))
                ) && 
                (
                    this.FullName == input.FullName ||
                    (this.FullName != null &&
                    this.FullName.Equals(input.FullName))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.PhoneNumber == input.PhoneNumber ||
                    (this.PhoneNumber != null &&
                    this.PhoneNumber.Equals(input.PhoneNumber))
                ) && 
                (
                    this.CultureName == input.CultureName ||
                    (this.CultureName != null &&
                    this.CultureName.Equals(input.CultureName))
                ) && 
                (
                    this.RoleName == input.RoleName ||
                    (this.RoleName != null &&
                    this.RoleName.Equals(input.RoleName))
                ) && 
                (
                    this.IsLocked == input.IsLocked ||
                    (this.IsLocked != null &&
                    this.IsLocked.Equals(input.IsLocked))
                ) && 
                (
                    this.IsDataRestricted == input.IsDataRestricted ||
                    (this.IsDataRestricted != null &&
                    this.IsDataRestricted.Equals(input.IsDataRestricted))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.UserName != null)
                    hashCode = hashCode * 59 + this.UserName.GetHashCode();
                if (this.FullName != null)
                    hashCode = hashCode * 59 + this.FullName.GetHashCode();
                if (this.Email != null)
                    hashCode = hashCode * 59 + this.Email.GetHashCode();
                if (this.PhoneNumber != null)
                    hashCode = hashCode * 59 + this.PhoneNumber.GetHashCode();
                if (this.CultureName != null)
                    hashCode = hashCode * 59 + this.CultureName.GetHashCode();
                if (this.RoleName != null)
                    hashCode = hashCode * 59 + this.RoleName.GetHashCode();
                if (this.IsLocked != null)
                    hashCode = hashCode * 59 + this.IsLocked.GetHashCode();
                if (this.IsDataRestricted != null)
                    hashCode = hashCode * 59 + this.IsDataRestricted.GetHashCode();
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
