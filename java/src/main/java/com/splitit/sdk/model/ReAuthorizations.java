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
import com.splitit.sdk.model.InstallmentPlans;
import com.splitit.sdk.model.InstallmentStatus;
import com.splitit.sdk.model.Processors;
import com.splitit.sdk.model.ReAuthorizationPaymentGatewayTransactionLogs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * ReAuthorizations
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class ReAuthorizations  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("InstallmentPlanId")
  private Long installmentPlanId = null;

  @SerializedName("ProcessorId")
  private Long processorId = null;

  @SerializedName("Amount")
  private BigDecimal amount = null;

  @SerializedName("ProcessDateTime")
  private OffsetDateTime processDateTime = null;

  @SerializedName("IsTest")
  private Boolean isTest = null;

  @SerializedName("CardStateId")
  private Long cardStateId = null;

  @SerializedName("CardState")
  private CardStateLogs cardState = null;

  @SerializedName("InstallmentPlan")
  private InstallmentPlans installmentPlan = null;

  @SerializedName("Processor")
  private Processors processor = null;

  @SerializedName("ReAuthorizationPaymentGatewayTransactionLogs")
  private List<ReAuthorizationPaymentGatewayTransactionLogs> reAuthorizationPaymentGatewayTransactionLogs = null;

  @SerializedName("Status")
  private InstallmentStatus status = null;

  public ReAuthorizations id(Long id) {
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

  public ReAuthorizations installmentPlanId(Long installmentPlanId) {
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

  public ReAuthorizations processorId(Long processorId) {
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

  public ReAuthorizations amount(BigDecimal amount) {
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

  public ReAuthorizations processDateTime(OffsetDateTime processDateTime) {
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

  public ReAuthorizations isTest(Boolean isTest) {
    this.isTest = isTest;
    return this;
  }

   /**
   * Get isTest
   * @return isTest
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsTest() {
    return isTest;
  }

  public void setIsTest(Boolean isTest) {
    this.isTest = isTest;
  }

  public ReAuthorizations cardStateId(Long cardStateId) {
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

  public ReAuthorizations cardState(CardStateLogs cardState) {
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

  public ReAuthorizations installmentPlan(InstallmentPlans installmentPlan) {
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

  public ReAuthorizations processor(Processors processor) {
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

  public ReAuthorizations reAuthorizationPaymentGatewayTransactionLogs(List<ReAuthorizationPaymentGatewayTransactionLogs> reAuthorizationPaymentGatewayTransactionLogs) {
    this.reAuthorizationPaymentGatewayTransactionLogs = reAuthorizationPaymentGatewayTransactionLogs;
    return this;
  }

  public ReAuthorizations addReAuthorizationPaymentGatewayTransactionLogsItem(ReAuthorizationPaymentGatewayTransactionLogs reAuthorizationPaymentGatewayTransactionLogsItem) {
    if (this.reAuthorizationPaymentGatewayTransactionLogs == null) {
      this.reAuthorizationPaymentGatewayTransactionLogs = new ArrayList<ReAuthorizationPaymentGatewayTransactionLogs>();
    }
    this.reAuthorizationPaymentGatewayTransactionLogs.add(reAuthorizationPaymentGatewayTransactionLogsItem);
    return this;
  }

   /**
   * Get reAuthorizationPaymentGatewayTransactionLogs
   * @return reAuthorizationPaymentGatewayTransactionLogs
  **/
  @ApiModelProperty(value = "")
  public List<ReAuthorizationPaymentGatewayTransactionLogs> getReAuthorizationPaymentGatewayTransactionLogs() {
    return reAuthorizationPaymentGatewayTransactionLogs;
  }

  public void setReAuthorizationPaymentGatewayTransactionLogs(List<ReAuthorizationPaymentGatewayTransactionLogs> reAuthorizationPaymentGatewayTransactionLogs) {
    this.reAuthorizationPaymentGatewayTransactionLogs = reAuthorizationPaymentGatewayTransactionLogs;
  }

  public ReAuthorizations status(InstallmentStatus status) {
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
    ReAuthorizations reAuthorizations = (ReAuthorizations) o;
    return Objects.equals(this.id, reAuthorizations.id) &&
        Objects.equals(this.installmentPlanId, reAuthorizations.installmentPlanId) &&
        Objects.equals(this.processorId, reAuthorizations.processorId) &&
        Objects.equals(this.amount, reAuthorizations.amount) &&
        Objects.equals(this.processDateTime, reAuthorizations.processDateTime) &&
        Objects.equals(this.isTest, reAuthorizations.isTest) &&
        Objects.equals(this.cardStateId, reAuthorizations.cardStateId) &&
        Objects.equals(this.cardState, reAuthorizations.cardState) &&
        Objects.equals(this.installmentPlan, reAuthorizations.installmentPlan) &&
        Objects.equals(this.processor, reAuthorizations.processor) &&
        Objects.equals(this.reAuthorizationPaymentGatewayTransactionLogs, reAuthorizations.reAuthorizationPaymentGatewayTransactionLogs) &&
        Objects.equals(this.status, reAuthorizations.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, installmentPlanId, processorId, amount, processDateTime, isTest, cardStateId, cardState, installmentPlan, processor, reAuthorizationPaymentGatewayTransactionLogs, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReAuthorizations {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installmentPlanId: ").append(toIndentedString(installmentPlanId)).append("\n");
    sb.append("    processorId: ").append(toIndentedString(processorId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    processDateTime: ").append(toIndentedString(processDateTime)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
    sb.append("    cardStateId: ").append(toIndentedString(cardStateId)).append("\n");
    sb.append("    cardState: ").append(toIndentedString(cardState)).append("\n");
    sb.append("    installmentPlan: ").append(toIndentedString(installmentPlan)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    reAuthorizationPaymentGatewayTransactionLogs: ").append(toIndentedString(reAuthorizationPaymentGatewayTransactionLogs)).append("\n");
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

