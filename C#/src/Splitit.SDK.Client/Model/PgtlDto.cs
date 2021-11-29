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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = Splitit.SDK.Client.Client.SwaggerDateConverter;

namespace Splitit.SDK.Client.Model
{
    /// <summary>
    /// PgtlDto
    /// </summary>
    [DataContract]
    public partial class PgtlDto :  IEquatable<PgtlDto>
    {
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public OperationType Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PgtlDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PgtlDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PgtlDto" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="result">result (required).</param>
        /// <param name="traceId">traceId.</param>
        /// <param name="createdDate">createdDate.</param>
        /// <param name="isChargeback">isChargeback (required).</param>
        /// <param name="transactionId">transactionId.</param>
        /// <param name="installmentPlanId">installmentPlanId.</param>
        /// <param name="completeResponseXml">completeResponseXml.</param>
        /// <param name="terminalGatewayDataId">terminalGatewayDataId (required).</param>
        /// <param name="avsMessageMessageCode">avsMessageMessageCode.</param>
        /// <param name="avsMessageMessageText">avsMessageMessageText.</param>
        /// <param name="cvvMessageMessageCode">cvvMessageMessageCode.</param>
        /// <param name="cvvMessageMessageText">cvvMessageMessageText.</param>
        /// <param name="requestedCurrencyCode">requestedCurrencyCode.</param>
        /// <param name="processedAmountAmount">processedAmountAmount (required).</param>
        /// <param name="requestedAmountAmount">requestedAmountAmount (required).</param>
        /// <param name="resultMessageMessageCode">resultMessageMessageCode.</param>
        /// <param name="resultMessageMessageText">resultMessageMessageText.</param>
        /// <param name="type">type (required).</param>
        /// <param name="referencePaymentGatewayTransactionLogId">referencePaymentGatewayTransactionLogId.</param>
        public PgtlDto(long? id = default(long?), bool? result = default(bool?), string traceId = default(string), string createdDate = default(string), bool? isChargeback = default(bool?), string transactionId = default(string), long? installmentPlanId = default(long?), string completeResponseXml = default(string), long? terminalGatewayDataId = default(long?), string avsMessageMessageCode = default(string), string avsMessageMessageText = default(string), string cvvMessageMessageCode = default(string), string cvvMessageMessageText = default(string), string requestedCurrencyCode = default(string), decimal? processedAmountAmount = default(decimal?), decimal? requestedAmountAmount = default(decimal?), string resultMessageMessageCode = default(string), string resultMessageMessageText = default(string), OperationType type = default(OperationType), long? referencePaymentGatewayTransactionLogId = default(long?))
        {
            this.Id = id;
            this.Result = result;
            this.IsChargeback = isChargeback;
            this.TerminalGatewayDataId = terminalGatewayDataId;
            this.ProcessedAmountAmount = processedAmountAmount;
            this.RequestedAmountAmount = requestedAmountAmount;
            this.Type = type;
            this.TraceId = traceId;
            this.CreatedDate = createdDate;
            this.TransactionId = transactionId;
            this.InstallmentPlanId = installmentPlanId;
            this.CompleteResponseXml = completeResponseXml;
            this.AvsMessageMessageCode = avsMessageMessageCode;
            this.AvsMessageMessageText = avsMessageMessageText;
            this.CvvMessageMessageCode = cvvMessageMessageCode;
            this.CvvMessageMessageText = cvvMessageMessageText;
            this.RequestedCurrencyCode = requestedCurrencyCode;
            this.ResultMessageMessageCode = resultMessageMessageCode;
            this.ResultMessageMessageText = resultMessageMessageText;
            this.ReferencePaymentGatewayTransactionLogId = referencePaymentGatewayTransactionLogId;
        }

        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public long? Id { get; set; }

        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [DataMember(Name="Result", EmitDefaultValue=false)]
        public bool? Result { get; set; }

        /// <summary>
        /// Gets or Sets TraceId
        /// </summary>
        [DataMember(Name="TraceId", EmitDefaultValue=false)]
        public string TraceId { get; set; }

        /// <summary>
        /// Gets or Sets CreatedDate
        /// </summary>
        [DataMember(Name="CreatedDate", EmitDefaultValue=false)]
        public string CreatedDate { get; set; }

        /// <summary>
        /// Gets or Sets IsChargeback
        /// </summary>
        [DataMember(Name="IsChargeback", EmitDefaultValue=false)]
        public bool? IsChargeback { get; set; }

        /// <summary>
        /// Gets or Sets TransactionId
        /// </summary>
        [DataMember(Name="TransactionId", EmitDefaultValue=false)]
        public string TransactionId { get; set; }

        /// <summary>
        /// Gets or Sets InstallmentPlanId
        /// </summary>
        [DataMember(Name="InstallmentPlanId", EmitDefaultValue=false)]
        public long? InstallmentPlanId { get; set; }

        /// <summary>
        /// Gets or Sets CompleteResponseXml
        /// </summary>
        [DataMember(Name="CompleteResponseXml", EmitDefaultValue=false)]
        public string CompleteResponseXml { get; set; }

        /// <summary>
        /// Gets or Sets TerminalGatewayDataId
        /// </summary>
        [DataMember(Name="TerminalGatewayDataId", EmitDefaultValue=false)]
        public long? TerminalGatewayDataId { get; set; }

        /// <summary>
        /// Gets or Sets AvsMessageMessageCode
        /// </summary>
        [DataMember(Name="AvsMessageMessageCode", EmitDefaultValue=false)]
        public string AvsMessageMessageCode { get; set; }

        /// <summary>
        /// Gets or Sets AvsMessageMessageText
        /// </summary>
        [DataMember(Name="AvsMessageMessageText", EmitDefaultValue=false)]
        public string AvsMessageMessageText { get; set; }

        /// <summary>
        /// Gets or Sets CvvMessageMessageCode
        /// </summary>
        [DataMember(Name="CvvMessageMessageCode", EmitDefaultValue=false)]
        public string CvvMessageMessageCode { get; set; }

        /// <summary>
        /// Gets or Sets CvvMessageMessageText
        /// </summary>
        [DataMember(Name="CvvMessageMessageText", EmitDefaultValue=false)]
        public string CvvMessageMessageText { get; set; }

        /// <summary>
        /// Gets or Sets RequestedCurrencyCode
        /// </summary>
        [DataMember(Name="RequestedCurrencyCode", EmitDefaultValue=false)]
        public string RequestedCurrencyCode { get; set; }

        /// <summary>
        /// Gets or Sets ProcessedAmountAmount
        /// </summary>
        [DataMember(Name="ProcessedAmountAmount", EmitDefaultValue=false)]
        public decimal? ProcessedAmountAmount { get; set; }

        /// <summary>
        /// Gets or Sets RequestedAmountAmount
        /// </summary>
        [DataMember(Name="RequestedAmountAmount", EmitDefaultValue=false)]
        public decimal? RequestedAmountAmount { get; set; }

        /// <summary>
        /// Gets or Sets ResultMessageMessageCode
        /// </summary>
        [DataMember(Name="ResultMessageMessageCode", EmitDefaultValue=false)]
        public string ResultMessageMessageCode { get; set; }

        /// <summary>
        /// Gets or Sets ResultMessageMessageText
        /// </summary>
        [DataMember(Name="ResultMessageMessageText", EmitDefaultValue=false)]
        public string ResultMessageMessageText { get; set; }


        /// <summary>
        /// Gets or Sets ReferencePaymentGatewayTransactionLogId
        /// </summary>
        [DataMember(Name="ReferencePaymentGatewayTransactionLogId", EmitDefaultValue=false)]
        public long? ReferencePaymentGatewayTransactionLogId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PgtlDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
            sb.Append("  TraceId: ").Append(TraceId).Append("\n");
            sb.Append("  CreatedDate: ").Append(CreatedDate).Append("\n");
            sb.Append("  IsChargeback: ").Append(IsChargeback).Append("\n");
            sb.Append("  TransactionId: ").Append(TransactionId).Append("\n");
            sb.Append("  InstallmentPlanId: ").Append(InstallmentPlanId).Append("\n");
            sb.Append("  CompleteResponseXml: ").Append(CompleteResponseXml).Append("\n");
            sb.Append("  TerminalGatewayDataId: ").Append(TerminalGatewayDataId).Append("\n");
            sb.Append("  AvsMessageMessageCode: ").Append(AvsMessageMessageCode).Append("\n");
            sb.Append("  AvsMessageMessageText: ").Append(AvsMessageMessageText).Append("\n");
            sb.Append("  CvvMessageMessageCode: ").Append(CvvMessageMessageCode).Append("\n");
            sb.Append("  CvvMessageMessageText: ").Append(CvvMessageMessageText).Append("\n");
            sb.Append("  RequestedCurrencyCode: ").Append(RequestedCurrencyCode).Append("\n");
            sb.Append("  ProcessedAmountAmount: ").Append(ProcessedAmountAmount).Append("\n");
            sb.Append("  RequestedAmountAmount: ").Append(RequestedAmountAmount).Append("\n");
            sb.Append("  ResultMessageMessageCode: ").Append(ResultMessageMessageCode).Append("\n");
            sb.Append("  ResultMessageMessageText: ").Append(ResultMessageMessageText).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  ReferencePaymentGatewayTransactionLogId: ").Append(ReferencePaymentGatewayTransactionLogId).Append("\n");
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
            return this.Equals(input as PgtlDto);
        }

        /// <summary>
        /// Returns true if PgtlDto instances are equal
        /// </summary>
        /// <param name="input">Instance of PgtlDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PgtlDto input)
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
                    this.Result == input.Result ||
                    (this.Result != null &&
                    this.Result.Equals(input.Result))
                ) && 
                (
                    this.TraceId == input.TraceId ||
                    (this.TraceId != null &&
                    this.TraceId.Equals(input.TraceId))
                ) && 
                (
                    this.CreatedDate == input.CreatedDate ||
                    (this.CreatedDate != null &&
                    this.CreatedDate.Equals(input.CreatedDate))
                ) && 
                (
                    this.IsChargeback == input.IsChargeback ||
                    (this.IsChargeback != null &&
                    this.IsChargeback.Equals(input.IsChargeback))
                ) && 
                (
                    this.TransactionId == input.TransactionId ||
                    (this.TransactionId != null &&
                    this.TransactionId.Equals(input.TransactionId))
                ) && 
                (
                    this.InstallmentPlanId == input.InstallmentPlanId ||
                    (this.InstallmentPlanId != null &&
                    this.InstallmentPlanId.Equals(input.InstallmentPlanId))
                ) && 
                (
                    this.CompleteResponseXml == input.CompleteResponseXml ||
                    (this.CompleteResponseXml != null &&
                    this.CompleteResponseXml.Equals(input.CompleteResponseXml))
                ) && 
                (
                    this.TerminalGatewayDataId == input.TerminalGatewayDataId ||
                    (this.TerminalGatewayDataId != null &&
                    this.TerminalGatewayDataId.Equals(input.TerminalGatewayDataId))
                ) && 
                (
                    this.AvsMessageMessageCode == input.AvsMessageMessageCode ||
                    (this.AvsMessageMessageCode != null &&
                    this.AvsMessageMessageCode.Equals(input.AvsMessageMessageCode))
                ) && 
                (
                    this.AvsMessageMessageText == input.AvsMessageMessageText ||
                    (this.AvsMessageMessageText != null &&
                    this.AvsMessageMessageText.Equals(input.AvsMessageMessageText))
                ) && 
                (
                    this.CvvMessageMessageCode == input.CvvMessageMessageCode ||
                    (this.CvvMessageMessageCode != null &&
                    this.CvvMessageMessageCode.Equals(input.CvvMessageMessageCode))
                ) && 
                (
                    this.CvvMessageMessageText == input.CvvMessageMessageText ||
                    (this.CvvMessageMessageText != null &&
                    this.CvvMessageMessageText.Equals(input.CvvMessageMessageText))
                ) && 
                (
                    this.RequestedCurrencyCode == input.RequestedCurrencyCode ||
                    (this.RequestedCurrencyCode != null &&
                    this.RequestedCurrencyCode.Equals(input.RequestedCurrencyCode))
                ) && 
                (
                    this.ProcessedAmountAmount == input.ProcessedAmountAmount ||
                    (this.ProcessedAmountAmount != null &&
                    this.ProcessedAmountAmount.Equals(input.ProcessedAmountAmount))
                ) && 
                (
                    this.RequestedAmountAmount == input.RequestedAmountAmount ||
                    (this.RequestedAmountAmount != null &&
                    this.RequestedAmountAmount.Equals(input.RequestedAmountAmount))
                ) && 
                (
                    this.ResultMessageMessageCode == input.ResultMessageMessageCode ||
                    (this.ResultMessageMessageCode != null &&
                    this.ResultMessageMessageCode.Equals(input.ResultMessageMessageCode))
                ) && 
                (
                    this.ResultMessageMessageText == input.ResultMessageMessageText ||
                    (this.ResultMessageMessageText != null &&
                    this.ResultMessageMessageText.Equals(input.ResultMessageMessageText))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.ReferencePaymentGatewayTransactionLogId == input.ReferencePaymentGatewayTransactionLogId ||
                    (this.ReferencePaymentGatewayTransactionLogId != null &&
                    this.ReferencePaymentGatewayTransactionLogId.Equals(input.ReferencePaymentGatewayTransactionLogId))
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
                if (this.Result != null)
                    hashCode = hashCode * 59 + this.Result.GetHashCode();
                if (this.TraceId != null)
                    hashCode = hashCode * 59 + this.TraceId.GetHashCode();
                if (this.CreatedDate != null)
                    hashCode = hashCode * 59 + this.CreatedDate.GetHashCode();
                if (this.IsChargeback != null)
                    hashCode = hashCode * 59 + this.IsChargeback.GetHashCode();
                if (this.TransactionId != null)
                    hashCode = hashCode * 59 + this.TransactionId.GetHashCode();
                if (this.InstallmentPlanId != null)
                    hashCode = hashCode * 59 + this.InstallmentPlanId.GetHashCode();
                if (this.CompleteResponseXml != null)
                    hashCode = hashCode * 59 + this.CompleteResponseXml.GetHashCode();
                if (this.TerminalGatewayDataId != null)
                    hashCode = hashCode * 59 + this.TerminalGatewayDataId.GetHashCode();
                if (this.AvsMessageMessageCode != null)
                    hashCode = hashCode * 59 + this.AvsMessageMessageCode.GetHashCode();
                if (this.AvsMessageMessageText != null)
                    hashCode = hashCode * 59 + this.AvsMessageMessageText.GetHashCode();
                if (this.CvvMessageMessageCode != null)
                    hashCode = hashCode * 59 + this.CvvMessageMessageCode.GetHashCode();
                if (this.CvvMessageMessageText != null)
                    hashCode = hashCode * 59 + this.CvvMessageMessageText.GetHashCode();
                if (this.RequestedCurrencyCode != null)
                    hashCode = hashCode * 59 + this.RequestedCurrencyCode.GetHashCode();
                if (this.ProcessedAmountAmount != null)
                    hashCode = hashCode * 59 + this.ProcessedAmountAmount.GetHashCode();
                if (this.RequestedAmountAmount != null)
                    hashCode = hashCode * 59 + this.RequestedAmountAmount.GetHashCode();
                if (this.ResultMessageMessageCode != null)
                    hashCode = hashCode * 59 + this.ResultMessageMessageCode.GetHashCode();
                if (this.ResultMessageMessageText != null)
                    hashCode = hashCode * 59 + this.ResultMessageMessageText.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.ReferencePaymentGatewayTransactionLogId != null)
                    hashCode = hashCode * 59 + this.ReferencePaymentGatewayTransactionLogId.GetHashCode();
                return hashCode;
            }
        }
    }

}