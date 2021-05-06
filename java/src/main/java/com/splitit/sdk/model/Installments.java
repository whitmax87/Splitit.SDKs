/*
 * splitit-web-api-public-sdk
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.splitit.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.splitit.sdk.model.CardStateLogs;
import com.splitit.sdk.model.EntityBase;
import com.splitit.sdk.model.FeesDocuments;
import com.splitit.sdk.model.FundingCollectDocumentDetails;
import com.splitit.sdk.model.InstallmentPaymentGatewayTransactionLogs;
import com.splitit.sdk.model.InstallmentPlans;
import com.splitit.sdk.model.InstallmentStatus;
import com.splitit.sdk.model.MerchantAccountType;
import com.splitit.sdk.model.Processors;
import com.splitit.sdk.model.TransferDocumentDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Installments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-06T09:33:27.783Z")
public class Installments  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("InstallmentPlanId")
  private Long installmentPlanId = null;

  @SerializedName("InstallmentNumber")
  private Long installmentNumber = null;

  @SerializedName("ProcessorId")
  private Long processorId = null;

  @SerializedName("OriginUtcOffset")
  private Double originUtcOffset = null;

  @SerializedName("CreatedDateUtc")
  private OffsetDateTime createdDateUtc = null;

  @SerializedName("Amount")
  private BigDecimal amount = null;

  @SerializedName("ProcessDateTime")
  private OffsetDateTime processDateTime = null;

  @SerializedName("ProcessDateTimeUtc")
  private OffsetDateTime processDateTimeUtc = null;

  @SerializedName("IsRefund")
  private Boolean isRefund = null;

  @SerializedName("CardStateId")
  private Long cardStateId = null;

  @SerializedName("OriginalAmount")
  private BigDecimal originalAmount = null;

  @SerializedName("RefundAmount")
  private BigDecimal refundAmount = null;

  @SerializedName("IsFullCapture")
  private Boolean isFullCapture = null;

  @SerializedName("AuthorizedAmount")
  private BigDecimal authorizedAmount = null;

  @SerializedName("IsPreAuthorized")
  private Boolean isPreAuthorized = null;

  @SerializedName("AmountForFunding")
  private BigDecimal amountForFunding = null;

  @SerializedName("CardState")
  private CardStateLogs cardState = null;

  @SerializedName("InstallmentPlan")
  private InstallmentPlans installmentPlan = null;

  @SerializedName("Processor")
  private Processors processor = null;

  @SerializedName("FeesDocuments")
  private List<FeesDocuments> feesDocuments = null;

  @SerializedName("FundingCollectDocumentDetails")
  private List<FundingCollectDocumentDetails> fundingCollectDocumentDetails = null;

  @SerializedName("InstallmentPaymentGatewayTransactionLogs")
  private List<InstallmentPaymentGatewayTransactionLogs> installmentPaymentGatewayTransactionLogs = null;

  @SerializedName("TransferDocumentDetails")
  private List<TransferDocumentDetails> transferDocumentDetails = null;

  @SerializedName("MerchantAccountType")
  private MerchantAccountType merchantAccountType = null;

  @SerializedName("Status")
  private InstallmentStatus status = null;

  public Installments id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Installments installmentPlanId(Long installmentPlanId) {
    this.installmentPlanId = installmentPlanId;
    return this;
  }

   /**
   * Get installmentPlanId
   * @return installmentPlanId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getInstallmentPlanId() {
    return installmentPlanId;
  }

  public void setInstallmentPlanId(Long installmentPlanId) {
    this.installmentPlanId = installmentPlanId;
  }

  public Installments installmentNumber(Long installmentNumber) {
    this.installmentNumber = installmentNumber;
    return this;
  }

   /**
   * Get installmentNumber
   * @return installmentNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getInstallmentNumber() {
    return installmentNumber;
  }

  public void setInstallmentNumber(Long installmentNumber) {
    this.installmentNumber = installmentNumber;
  }

  public Installments processorId(Long processorId) {
    this.processorId = processorId;
    return this;
  }

   /**
   * Get processorId
   * @return processorId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getProcessorId() {
    return processorId;
  }

  public void setProcessorId(Long processorId) {
    this.processorId = processorId;
  }

  public Installments originUtcOffset(Double originUtcOffset) {
    this.originUtcOffset = originUtcOffset;
    return this;
  }

   /**
   * Get originUtcOffset
   * @return originUtcOffset
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getOriginUtcOffset() {
    return originUtcOffset;
  }

  public void setOriginUtcOffset(Double originUtcOffset) {
    this.originUtcOffset = originUtcOffset;
  }

  public Installments createdDateUtc(OffsetDateTime createdDateUtc) {
    this.createdDateUtc = createdDateUtc;
    return this;
  }

   /**
   * Get createdDateUtc
   * @return createdDateUtc
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getCreatedDateUtc() {
    return createdDateUtc;
  }

  public void setCreatedDateUtc(OffsetDateTime createdDateUtc) {
    this.createdDateUtc = createdDateUtc;
  }

  public Installments amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Installments processDateTime(OffsetDateTime processDateTime) {
    this.processDateTime = processDateTime;
    return this;
  }

   /**
   * Get processDateTime
   * @return processDateTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProcessDateTime() {
    return processDateTime;
  }

  public void setProcessDateTime(OffsetDateTime processDateTime) {
    this.processDateTime = processDateTime;
  }

  public Installments processDateTimeUtc(OffsetDateTime processDateTimeUtc) {
    this.processDateTimeUtc = processDateTimeUtc;
    return this;
  }

   /**
   * Get processDateTimeUtc
   * @return processDateTimeUtc
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProcessDateTimeUtc() {
    return processDateTimeUtc;
  }

  public void setProcessDateTimeUtc(OffsetDateTime processDateTimeUtc) {
    this.processDateTimeUtc = processDateTimeUtc;
  }

  public Installments isRefund(Boolean isRefund) {
    this.isRefund = isRefund;
    return this;
  }

   /**
   * Get isRefund
   * @return isRefund
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsRefund() {
    return isRefund;
  }

  public void setIsRefund(Boolean isRefund) {
    this.isRefund = isRefund;
  }

  public Installments cardStateId(Long cardStateId) {
    this.cardStateId = cardStateId;
    return this;
  }

   /**
   * Get cardStateId
   * @return cardStateId
  **/
  @ApiModelProperty(value = "")
  public Long getCardStateId() {
    return cardStateId;
  }

  public void setCardStateId(Long cardStateId) {
    this.cardStateId = cardStateId;
  }

  public Installments originalAmount(BigDecimal originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * Get originalAmount
   * @return originalAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(BigDecimal originalAmount) {
    this.originalAmount = originalAmount;
  }

  public Installments refundAmount(BigDecimal refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * Get refundAmount
   * @return refundAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(BigDecimal refundAmount) {
    this.refundAmount = refundAmount;
  }

  public Installments isFullCapture(Boolean isFullCapture) {
    this.isFullCapture = isFullCapture;
    return this;
  }

   /**
   * Get isFullCapture
   * @return isFullCapture
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsFullCapture() {
    return isFullCapture;
  }

  public void setIsFullCapture(Boolean isFullCapture) {
    this.isFullCapture = isFullCapture;
  }

  public Installments authorizedAmount(BigDecimal authorizedAmount) {
    this.authorizedAmount = authorizedAmount;
    return this;
  }

   /**
   * Get authorizedAmount
   * @return authorizedAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAuthorizedAmount() {
    return authorizedAmount;
  }

  public void setAuthorizedAmount(BigDecimal authorizedAmount) {
    this.authorizedAmount = authorizedAmount;
  }

  public Installments isPreAuthorized(Boolean isPreAuthorized) {
    this.isPreAuthorized = isPreAuthorized;
    return this;
  }

   /**
   * Get isPreAuthorized
   * @return isPreAuthorized
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsPreAuthorized() {
    return isPreAuthorized;
  }

  public void setIsPreAuthorized(Boolean isPreAuthorized) {
    this.isPreAuthorized = isPreAuthorized;
  }

  public Installments amountForFunding(BigDecimal amountForFunding) {
    this.amountForFunding = amountForFunding;
    return this;
  }

   /**
   * Get amountForFunding
   * @return amountForFunding
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmountForFunding() {
    return amountForFunding;
  }

  public void setAmountForFunding(BigDecimal amountForFunding) {
    this.amountForFunding = amountForFunding;
  }

  public Installments cardState(CardStateLogs cardState) {
    this.cardState = cardState;
    return this;
  }

   /**
   * Get cardState
   * @return cardState
  **/
  @ApiModelProperty(value = "")
  public CardStateLogs getCardState() {
    return cardState;
  }

  public void setCardState(CardStateLogs cardState) {
    this.cardState = cardState;
  }

  public Installments installmentPlan(InstallmentPlans installmentPlan) {
    this.installmentPlan = installmentPlan;
    return this;
  }

   /**
   * Get installmentPlan
   * @return installmentPlan
  **/
  @ApiModelProperty(value = "")
  public InstallmentPlans getInstallmentPlan() {
    return installmentPlan;
  }

  public void setInstallmentPlan(InstallmentPlans installmentPlan) {
    this.installmentPlan = installmentPlan;
  }

  public Installments processor(Processors processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public Processors getProcessor() {
    return processor;
  }

  public void setProcessor(Processors processor) {
    this.processor = processor;
  }

  public Installments feesDocuments(List<FeesDocuments> feesDocuments) {
    this.feesDocuments = feesDocuments;
    return this;
  }

  public Installments addFeesDocumentsItem(FeesDocuments feesDocumentsItem) {
    if (this.feesDocuments == null) {
      this.feesDocuments = new ArrayList<FeesDocuments>();
    }
    this.feesDocuments.add(feesDocumentsItem);
    return this;
  }

   /**
   * Get feesDocuments
   * @return feesDocuments
  **/
  @ApiModelProperty(value = "")
  public List<FeesDocuments> getFeesDocuments() {
    return feesDocuments;
  }

  public void setFeesDocuments(List<FeesDocuments> feesDocuments) {
    this.feesDocuments = feesDocuments;
  }

  public Installments fundingCollectDocumentDetails(List<FundingCollectDocumentDetails> fundingCollectDocumentDetails) {
    this.fundingCollectDocumentDetails = fundingCollectDocumentDetails;
    return this;
  }

  public Installments addFundingCollectDocumentDetailsItem(FundingCollectDocumentDetails fundingCollectDocumentDetailsItem) {
    if (this.fundingCollectDocumentDetails == null) {
      this.fundingCollectDocumentDetails = new ArrayList<FundingCollectDocumentDetails>();
    }
    this.fundingCollectDocumentDetails.add(fundingCollectDocumentDetailsItem);
    return this;
  }

   /**
   * Get fundingCollectDocumentDetails
   * @return fundingCollectDocumentDetails
  **/
  @ApiModelProperty(value = "")
  public List<FundingCollectDocumentDetails> getFundingCollectDocumentDetails() {
    return fundingCollectDocumentDetails;
  }

  public void setFundingCollectDocumentDetails(List<FundingCollectDocumentDetails> fundingCollectDocumentDetails) {
    this.fundingCollectDocumentDetails = fundingCollectDocumentDetails;
  }

  public Installments installmentPaymentGatewayTransactionLogs(List<InstallmentPaymentGatewayTransactionLogs> installmentPaymentGatewayTransactionLogs) {
    this.installmentPaymentGatewayTransactionLogs = installmentPaymentGatewayTransactionLogs;
    return this;
  }

  public Installments addInstallmentPaymentGatewayTransactionLogsItem(InstallmentPaymentGatewayTransactionLogs installmentPaymentGatewayTransactionLogsItem) {
    if (this.installmentPaymentGatewayTransactionLogs == null) {
      this.installmentPaymentGatewayTransactionLogs = new ArrayList<InstallmentPaymentGatewayTransactionLogs>();
    }
    this.installmentPaymentGatewayTransactionLogs.add(installmentPaymentGatewayTransactionLogsItem);
    return this;
  }

   /**
   * Get installmentPaymentGatewayTransactionLogs
   * @return installmentPaymentGatewayTransactionLogs
  **/
  @ApiModelProperty(value = "")
  public List<InstallmentPaymentGatewayTransactionLogs> getInstallmentPaymentGatewayTransactionLogs() {
    return installmentPaymentGatewayTransactionLogs;
  }

  public void setInstallmentPaymentGatewayTransactionLogs(List<InstallmentPaymentGatewayTransactionLogs> installmentPaymentGatewayTransactionLogs) {
    this.installmentPaymentGatewayTransactionLogs = installmentPaymentGatewayTransactionLogs;
  }

  public Installments transferDocumentDetails(List<TransferDocumentDetails> transferDocumentDetails) {
    this.transferDocumentDetails = transferDocumentDetails;
    return this;
  }

  public Installments addTransferDocumentDetailsItem(TransferDocumentDetails transferDocumentDetailsItem) {
    if (this.transferDocumentDetails == null) {
      this.transferDocumentDetails = new ArrayList<TransferDocumentDetails>();
    }
    this.transferDocumentDetails.add(transferDocumentDetailsItem);
    return this;
  }

   /**
   * Get transferDocumentDetails
   * @return transferDocumentDetails
  **/
  @ApiModelProperty(value = "")
  public List<TransferDocumentDetails> getTransferDocumentDetails() {
    return transferDocumentDetails;
  }

  public void setTransferDocumentDetails(List<TransferDocumentDetails> transferDocumentDetails) {
    this.transferDocumentDetails = transferDocumentDetails;
  }

  public Installments merchantAccountType(MerchantAccountType merchantAccountType) {
    this.merchantAccountType = merchantAccountType;
    return this;
  }

   /**
   * Get merchantAccountType
   * @return merchantAccountType
  **/
  @ApiModelProperty(required = true, value = "")
  public MerchantAccountType getMerchantAccountType() {
    return merchantAccountType;
  }

  public void setMerchantAccountType(MerchantAccountType merchantAccountType) {
    this.merchantAccountType = merchantAccountType;
  }

  public Installments status(InstallmentStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public InstallmentStatus getStatus() {
    return status;
  }

  public void setStatus(InstallmentStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installments installments = (Installments) o;
    return Objects.equals(this.id, installments.id) &&
        Objects.equals(this.installmentPlanId, installments.installmentPlanId) &&
        Objects.equals(this.installmentNumber, installments.installmentNumber) &&
        Objects.equals(this.processorId, installments.processorId) &&
        Objects.equals(this.originUtcOffset, installments.originUtcOffset) &&
        Objects.equals(this.createdDateUtc, installments.createdDateUtc) &&
        Objects.equals(this.amount, installments.amount) &&
        Objects.equals(this.processDateTime, installments.processDateTime) &&
        Objects.equals(this.processDateTimeUtc, installments.processDateTimeUtc) &&
        Objects.equals(this.isRefund, installments.isRefund) &&
        Objects.equals(this.cardStateId, installments.cardStateId) &&
        Objects.equals(this.originalAmount, installments.originalAmount) &&
        Objects.equals(this.refundAmount, installments.refundAmount) &&
        Objects.equals(this.isFullCapture, installments.isFullCapture) &&
        Objects.equals(this.authorizedAmount, installments.authorizedAmount) &&
        Objects.equals(this.isPreAuthorized, installments.isPreAuthorized) &&
        Objects.equals(this.amountForFunding, installments.amountForFunding) &&
        Objects.equals(this.cardState, installments.cardState) &&
        Objects.equals(this.installmentPlan, installments.installmentPlan) &&
        Objects.equals(this.processor, installments.processor) &&
        Objects.equals(this.feesDocuments, installments.feesDocuments) &&
        Objects.equals(this.fundingCollectDocumentDetails, installments.fundingCollectDocumentDetails) &&
        Objects.equals(this.installmentPaymentGatewayTransactionLogs, installments.installmentPaymentGatewayTransactionLogs) &&
        Objects.equals(this.transferDocumentDetails, installments.transferDocumentDetails) &&
        Objects.equals(this.merchantAccountType, installments.merchantAccountType) &&
        Objects.equals(this.status, installments.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, installmentPlanId, installmentNumber, processorId, originUtcOffset, createdDateUtc, amount, processDateTime, processDateTimeUtc, isRefund, cardStateId, originalAmount, refundAmount, isFullCapture, authorizedAmount, isPreAuthorized, amountForFunding, cardState, installmentPlan, processor, feesDocuments, fundingCollectDocumentDetails, installmentPaymentGatewayTransactionLogs, transferDocumentDetails, merchantAccountType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installments {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installmentPlanId: ").append(toIndentedString(installmentPlanId)).append("\n");
    sb.append("    installmentNumber: ").append(toIndentedString(installmentNumber)).append("\n");
    sb.append("    processorId: ").append(toIndentedString(processorId)).append("\n");
    sb.append("    originUtcOffset: ").append(toIndentedString(originUtcOffset)).append("\n");
    sb.append("    createdDateUtc: ").append(toIndentedString(createdDateUtc)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    processDateTime: ").append(toIndentedString(processDateTime)).append("\n");
    sb.append("    processDateTimeUtc: ").append(toIndentedString(processDateTimeUtc)).append("\n");
    sb.append("    isRefund: ").append(toIndentedString(isRefund)).append("\n");
    sb.append("    cardStateId: ").append(toIndentedString(cardStateId)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    isFullCapture: ").append(toIndentedString(isFullCapture)).append("\n");
    sb.append("    authorizedAmount: ").append(toIndentedString(authorizedAmount)).append("\n");
    sb.append("    isPreAuthorized: ").append(toIndentedString(isPreAuthorized)).append("\n");
    sb.append("    amountForFunding: ").append(toIndentedString(amountForFunding)).append("\n");
    sb.append("    cardState: ").append(toIndentedString(cardState)).append("\n");
    sb.append("    installmentPlan: ").append(toIndentedString(installmentPlan)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    feesDocuments: ").append(toIndentedString(feesDocuments)).append("\n");
    sb.append("    fundingCollectDocumentDetails: ").append(toIndentedString(fundingCollectDocumentDetails)).append("\n");
    sb.append("    installmentPaymentGatewayTransactionLogs: ").append(toIndentedString(installmentPaymentGatewayTransactionLogs)).append("\n");
    sb.append("    transferDocumentDetails: ").append(toIndentedString(transferDocumentDetails)).append("\n");
    sb.append("    merchantAccountType: ").append(toIndentedString(merchantAccountType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

