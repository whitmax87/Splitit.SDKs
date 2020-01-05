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
    /// CreateInstallmentPlanRequest
    /// </summary>
    [DataContract]
    public partial class CreateInstallmentPlanRequest :  IEquatable<CreateInstallmentPlanRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateInstallmentPlanRequest" /> class.
        /// </summary>
        /// <param name="installmentPlanNumber">installmentPlanNumber.</param>
        /// <param name="planData">planData.</param>
        /// <param name="cartData">cartData.</param>
        /// <param name="consumerData">consumerData.</param>
        /// <param name="billingAddress">billingAddress.</param>
        /// <param name="creditCardDetails">creditCardDetails.</param>
        /// <param name="paymentToken">paymentToken.</param>
        /// <param name="planApprovalEvidence">planApprovalEvidence.</param>
        /// <param name="redirectUrls">redirectUrls.</param>
        /// <param name="eventsEndpoints">eventsEndpoints.</param>
        /// <param name="externalAuth">externalAuth.</param>
        public CreateInstallmentPlanRequest(string installmentPlanNumber = default(string), PlanData planData = default(PlanData), CartData cartData = default(CartData), ConsumerData consumerData = default(ConsumerData), AddressData billingAddress = default(AddressData), CardData creditCardDetails = default(CardData), PaymentToken paymentToken = default(PaymentToken), PlanApprovalEvidence planApprovalEvidence = default(PlanApprovalEvidence), RedirectUrls redirectUrls = default(RedirectUrls), EventsEndpoints eventsEndpoints = default(EventsEndpoints), ExternalAuth externalAuth = default(ExternalAuth))
        {
            this.InstallmentPlanNumber = installmentPlanNumber;
            this.PlanData = planData;
            this.CartData = cartData;
            this.ConsumerData = consumerData;
            this.BillingAddress = billingAddress;
            this.CreditCardDetails = creditCardDetails;
            this.PaymentToken = paymentToken;
            this.PlanApprovalEvidence = planApprovalEvidence;
            this.RedirectUrls = redirectUrls;
            this.EventsEndpoints = eventsEndpoints;
            this.ExternalAuth = externalAuth;
        }

        [DataMember(Name="RequestHeader", EmitDefaultValue=false)]
        internal RequestHeader RequestHeader { get; set; }
        
        /// <summary>
        /// Gets or Sets InstallmentPlanNumber
        /// </summary>
        [DataMember(Name="InstallmentPlanNumber", EmitDefaultValue=false)]
        public string InstallmentPlanNumber { get; set; }

        /// <summary>
        /// Gets or Sets PlanData
        /// </summary>
        [DataMember(Name="PlanData", EmitDefaultValue=false)]
        public PlanData PlanData { get; set; }

        /// <summary>
        /// Gets or Sets CartData
        /// </summary>
        [DataMember(Name="CartData", EmitDefaultValue=false)]
        public CartData CartData { get; set; }

        /// <summary>
        /// Gets or Sets ConsumerData
        /// </summary>
        [DataMember(Name="ConsumerData", EmitDefaultValue=false)]
        public ConsumerData ConsumerData { get; set; }

        /// <summary>
        /// Gets or Sets BillingAddress
        /// </summary>
        [DataMember(Name="BillingAddress", EmitDefaultValue=false)]
        public AddressData BillingAddress { get; set; }

        /// <summary>
        /// Gets or Sets CreditCardDetails
        /// </summary>
        [DataMember(Name="CreditCardDetails", EmitDefaultValue=false)]
        public CardData CreditCardDetails { get; set; }

        /// <summary>
        /// Gets or Sets PaymentToken
        /// </summary>
        [DataMember(Name="PaymentToken", EmitDefaultValue=false)]
        public PaymentToken PaymentToken { get; set; }

        /// <summary>
        /// Gets or Sets PlanApprovalEvidence
        /// </summary>
        [DataMember(Name="PlanApprovalEvidence", EmitDefaultValue=false)]
        public PlanApprovalEvidence PlanApprovalEvidence { get; set; }

        /// <summary>
        /// Gets or Sets RedirectUrls
        /// </summary>
        [DataMember(Name="RedirectUrls", EmitDefaultValue=false)]
        public RedirectUrls RedirectUrls { get; set; }

        /// <summary>
        /// Gets or Sets EventsEndpoints
        /// </summary>
        [DataMember(Name="EventsEndpoints", EmitDefaultValue=false)]
        public EventsEndpoints EventsEndpoints { get; set; }

        /// <summary>
        /// Gets or Sets ExternalAuth
        /// </summary>
        [DataMember(Name="ExternalAuth", EmitDefaultValue=false)]
        public ExternalAuth ExternalAuth { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateInstallmentPlanRequest {\n");
            sb.Append("  InstallmentPlanNumber: ").Append(InstallmentPlanNumber).Append("\n");
            sb.Append("  PlanData: ").Append(PlanData).Append("\n");
            sb.Append("  CartData: ").Append(CartData).Append("\n");
            sb.Append("  ConsumerData: ").Append(ConsumerData).Append("\n");
            sb.Append("  BillingAddress: ").Append(BillingAddress).Append("\n");
            sb.Append("  CreditCardDetails: ").Append(CreditCardDetails).Append("\n");
            sb.Append("  PaymentToken: ").Append(PaymentToken).Append("\n");
            sb.Append("  PlanApprovalEvidence: ").Append(PlanApprovalEvidence).Append("\n");
            sb.Append("  RedirectUrls: ").Append(RedirectUrls).Append("\n");
            sb.Append("  EventsEndpoints: ").Append(EventsEndpoints).Append("\n");
            sb.Append("  ExternalAuth: ").Append(ExternalAuth).Append("\n");
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
            return this.Equals(input as CreateInstallmentPlanRequest);
        }

        /// <summary>
        /// Returns true if CreateInstallmentPlanRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateInstallmentPlanRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateInstallmentPlanRequest input)
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
                    this.PlanData == input.PlanData ||
                    (this.PlanData != null &&
                    this.PlanData.Equals(input.PlanData))
                ) && 
                (
                    this.CartData == input.CartData ||
                    (this.CartData != null &&
                    this.CartData.Equals(input.CartData))
                ) && 
                (
                    this.ConsumerData == input.ConsumerData ||
                    (this.ConsumerData != null &&
                    this.ConsumerData.Equals(input.ConsumerData))
                ) && 
                (
                    this.BillingAddress == input.BillingAddress ||
                    (this.BillingAddress != null &&
                    this.BillingAddress.Equals(input.BillingAddress))
                ) && 
                (
                    this.CreditCardDetails == input.CreditCardDetails ||
                    (this.CreditCardDetails != null &&
                    this.CreditCardDetails.Equals(input.CreditCardDetails))
                ) && 
                (
                    this.PaymentToken == input.PaymentToken ||
                    (this.PaymentToken != null &&
                    this.PaymentToken.Equals(input.PaymentToken))
                ) && 
                (
                    this.PlanApprovalEvidence == input.PlanApprovalEvidence ||
                    (this.PlanApprovalEvidence != null &&
                    this.PlanApprovalEvidence.Equals(input.PlanApprovalEvidence))
                ) && 
                (
                    this.RedirectUrls == input.RedirectUrls ||
                    (this.RedirectUrls != null &&
                    this.RedirectUrls.Equals(input.RedirectUrls))
                ) && 
                (
                    this.EventsEndpoints == input.EventsEndpoints ||
                    (this.EventsEndpoints != null &&
                    this.EventsEndpoints.Equals(input.EventsEndpoints))
                ) && 
                (
                    this.ExternalAuth == input.ExternalAuth ||
                    (this.ExternalAuth != null &&
                    this.ExternalAuth.Equals(input.ExternalAuth))
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
                if (this.PlanData != null)
                    hashCode = hashCode * 59 + this.PlanData.GetHashCode();
                if (this.CartData != null)
                    hashCode = hashCode * 59 + this.CartData.GetHashCode();
                if (this.ConsumerData != null)
                    hashCode = hashCode * 59 + this.ConsumerData.GetHashCode();
                if (this.BillingAddress != null)
                    hashCode = hashCode * 59 + this.BillingAddress.GetHashCode();
                if (this.CreditCardDetails != null)
                    hashCode = hashCode * 59 + this.CreditCardDetails.GetHashCode();
                if (this.PaymentToken != null)
                    hashCode = hashCode * 59 + this.PaymentToken.GetHashCode();
                if (this.PlanApprovalEvidence != null)
                    hashCode = hashCode * 59 + this.PlanApprovalEvidence.GetHashCode();
                if (this.RedirectUrls != null)
                    hashCode = hashCode * 59 + this.RedirectUrls.GetHashCode();
                if (this.EventsEndpoints != null)
                    hashCode = hashCode * 59 + this.EventsEndpoints.GetHashCode();
                if (this.ExternalAuth != null)
                    hashCode = hashCode * 59 + this.ExternalAuth.GetHashCode();
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
