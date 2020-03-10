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
import com.splitit.sdk.model.BuRef;
import com.splitit.sdk.model.CardData;
import com.splitit.sdk.model.ConsumerData;
import com.splitit.sdk.model.FraudCheck;
import com.splitit.sdk.model.Installment;
import com.splitit.sdk.model.InstallmentPlan;
import com.splitit.sdk.model.MerchantRef;
import com.splitit.sdk.model.Money;
import com.splitit.sdk.model.ReAuthorization;
import com.splitit.sdk.model.ReferenceEntityBase;
import com.splitit.sdk.model.TestModes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * ExtendedInstallmentPlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-10T18:07:01.900Z")
public class ExtendedInstallmentPlan   {
  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  @SerializedName("InstallmentPlanStatus")
  private ReferenceEntityBase installmentPlanStatus = null;

  @SerializedName("Amount")
  private Money amount = null;

  @SerializedName("OutstandingAmount")
  private Money outstandingAmount = null;

  @SerializedName("NumberOfInstallments")
  private Integer numberOfInstallments = null;

  @SerializedName("NumberOfProcessedInstallments")
  private Integer numberOfProcessedInstallments = null;

  @SerializedName("OriginalAmount")
  private Money originalAmount = null;

  @SerializedName("RefundAmount")
  private Money refundAmount = null;

  @SerializedName("Consumer")
  private ConsumerData consumer = null;

  @SerializedName("ActiveCard")
  private CardData activeCard = null;

  @SerializedName("FraudCheck")
  private FraudCheck fraudCheck = null;

  @SerializedName("Merchant")
  private MerchantRef merchant = null;

  @SerializedName("RefOrderNumber")
  private String refOrderNumber = null;

  @SerializedName("PurchaseMethod")
  private ReferenceEntityBase purchaseMethod = null;

  @SerializedName("Strategy")
  private ReferenceEntityBase strategy = null;

  @SerializedName("DelayResolution")
  private ReferenceEntityBase delayResolution = null;

  @SerializedName("ExtendedParams")
  private Map<String, String> extendedParams = null;

  @SerializedName("IsFullCaptured")
  private Boolean isFullCaptured = null;

  @SerializedName("IsChargedBack")
  private Boolean isChargedBack = null;

  @SerializedName("ArePaymentsOnHold")
  private Boolean arePaymentsOnHold = null;

  @SerializedName("ScpFundingPercent")
  private BigDecimal scpFundingPercent = null;

  @SerializedName("TestMode")
  private TestModes testMode = null;

  @SerializedName("CreationDateTime")
  private OffsetDateTime creationDateTime = null;

  @SerializedName("Installments")
  private List<Installment> installments = null;

  @SerializedName("SecureAuthorizations")
  private List<ReAuthorization> secureAuthorizations = null;

  @SerializedName("BusinessUnit")
  private BuRef businessUnit = null;

  @SerializedName("ShopperPaymentRequestTime")
  private OffsetDateTime shopperPaymentRequestTime = null;

  public ExtendedInstallmentPlan installmentPlanNumber(String installmentPlanNumber) {
    this.installmentPlanNumber = installmentPlanNumber;
    return this;
  }

   /**
   * Get installmentPlanNumber
   * @return installmentPlanNumber
  **/
  @ApiModelProperty(value = "")
  public String getInstallmentPlanNumber() {
    return installmentPlanNumber;
  }

  public void setInstallmentPlanNumber(String installmentPlanNumber) {
    this.installmentPlanNumber = installmentPlanNumber;
  }

  public ExtendedInstallmentPlan installmentPlanStatus(ReferenceEntityBase installmentPlanStatus) {
    this.installmentPlanStatus = installmentPlanStatus;
    return this;
  }

   /**
   * Get installmentPlanStatus
   * @return installmentPlanStatus
  **/
  @ApiModelProperty(value = "")
  public ReferenceEntityBase getInstallmentPlanStatus() {
    return installmentPlanStatus;
  }

  public void setInstallmentPlanStatus(ReferenceEntityBase installmentPlanStatus) {
    this.installmentPlanStatus = installmentPlanStatus;
  }

  public ExtendedInstallmentPlan amount(Money amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public ExtendedInstallmentPlan outstandingAmount(Money outstandingAmount) {
    this.outstandingAmount = outstandingAmount;
    return this;
  }

   /**
   * Get outstandingAmount
   * @return outstandingAmount
  **/
  @ApiModelProperty(value = "")
  public Money getOutstandingAmount() {
    return outstandingAmount;
  }

  public void setOutstandingAmount(Money outstandingAmount) {
    this.outstandingAmount = outstandingAmount;
  }

  public ExtendedInstallmentPlan numberOfInstallments(Integer numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
    return this;
  }

   /**
   * Get numberOfInstallments
   * @return numberOfInstallments
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getNumberOfInstallments() {
    return numberOfInstallments;
  }

  public void setNumberOfInstallments(Integer numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }

  public ExtendedInstallmentPlan numberOfProcessedInstallments(Integer numberOfProcessedInstallments) {
    this.numberOfProcessedInstallments = numberOfProcessedInstallments;
    return this;
  }

   /**
   * Get numberOfProcessedInstallments
   * @return numberOfProcessedInstallments
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getNumberOfProcessedInstallments() {
    return numberOfProcessedInstallments;
  }

  public void setNumberOfProcessedInstallments(Integer numberOfProcessedInstallments) {
    this.numberOfProcessedInstallments = numberOfProcessedInstallments;
  }

  public ExtendedInstallmentPlan originalAmount(Money originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * Get originalAmount
   * @return originalAmount
  **/
  @ApiModelProperty(value = "")
  public Money getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(Money originalAmount) {
    this.originalAmount = originalAmount;
  }

  public ExtendedInstallmentPlan refundAmount(Money refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * Get refundAmount
   * @return refundAmount
  **/
  @ApiModelProperty(value = "")
  public Money getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Money refundAmount) {
    this.refundAmount = refundAmount;
  }

  public ExtendedInstallmentPlan consumer(ConsumerData consumer) {
    this.consumer = consumer;
    return this;
  }

   /**
   * Get consumer
   * @return consumer
  **/
  @ApiModelProperty(value = "")
  public ConsumerData getConsumer() {
    return consumer;
  }

  public void setConsumer(ConsumerData consumer) {
    this.consumer = consumer;
  }

  public ExtendedInstallmentPlan activeCard(CardData activeCard) {
    this.activeCard = activeCard;
    return this;
  }

   /**
   * Get activeCard
   * @return activeCard
  **/
  @ApiModelProperty(value = "")
  public CardData getActiveCard() {
    return activeCard;
  }

  public void setActiveCard(CardData activeCard) {
    this.activeCard = activeCard;
  }

  public ExtendedInstallmentPlan fraudCheck(FraudCheck fraudCheck) {
    this.fraudCheck = fraudCheck;
    return this;
  }

   /**
   * Get fraudCheck
   * @return fraudCheck
  **/
  @ApiModelProperty(value = "")
  public FraudCheck getFraudCheck() {
    return fraudCheck;
  }

  public void setFraudCheck(FraudCheck fraudCheck) {
    this.fraudCheck = fraudCheck;
  }

  public ExtendedInstallmentPlan merchant(MerchantRef merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @ApiModelProperty(value = "")
  public MerchantRef getMerchant() {
    return merchant;
  }

  public void setMerchant(MerchantRef merchant) {
    this.merchant = merchant;
  }

  public ExtendedInstallmentPlan refOrderNumber(String refOrderNumber) {
    this.refOrderNumber = refOrderNumber;
    return this;
  }

   /**
   * Get refOrderNumber
   * @return refOrderNumber
  **/
  @ApiModelProperty(value = "")
  public String getRefOrderNumber() {
    return refOrderNumber;
  }

  public void setRefOrderNumber(String refOrderNumber) {
    this.refOrderNumber = refOrderNumber;
  }

  public ExtendedInstallmentPlan purchaseMethod(ReferenceEntityBase purchaseMethod) {
    this.purchaseMethod = purchaseMethod;
    return this;
  }

   /**
   * Get purchaseMethod
   * @return purchaseMethod
  **/
  @ApiModelProperty(value = "")
  public ReferenceEntityBase getPurchaseMethod() {
    return purchaseMethod;
  }

  public void setPurchaseMethod(ReferenceEntityBase purchaseMethod) {
    this.purchaseMethod = purchaseMethod;
  }

  public ExtendedInstallmentPlan strategy(ReferenceEntityBase strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @ApiModelProperty(value = "")
  public ReferenceEntityBase getStrategy() {
    return strategy;
  }

  public void setStrategy(ReferenceEntityBase strategy) {
    this.strategy = strategy;
  }

  public ExtendedInstallmentPlan delayResolution(ReferenceEntityBase delayResolution) {
    this.delayResolution = delayResolution;
    return this;
  }

   /**
   * Get delayResolution
   * @return delayResolution
  **/
  @ApiModelProperty(value = "")
  public ReferenceEntityBase getDelayResolution() {
    return delayResolution;
  }

  public void setDelayResolution(ReferenceEntityBase delayResolution) {
    this.delayResolution = delayResolution;
  }

  public ExtendedInstallmentPlan extendedParams(Map<String, String> extendedParams) {
    this.extendedParams = extendedParams;
    return this;
  }

  public ExtendedInstallmentPlan putExtendedParamsItem(String key, String extendedParamsItem) {
    if (this.extendedParams == null) {
      this.extendedParams = new HashMap<String, String>();
    }
    this.extendedParams.put(key, extendedParamsItem);
    return this;
  }

   /**
   * Get extendedParams
   * @return extendedParams
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getExtendedParams() {
    return extendedParams;
  }

  public void setExtendedParams(Map<String, String> extendedParams) {
    this.extendedParams = extendedParams;
  }

  public ExtendedInstallmentPlan isFullCaptured(Boolean isFullCaptured) {
    this.isFullCaptured = isFullCaptured;
    return this;
  }

   /**
   * Get isFullCaptured
   * @return isFullCaptured
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsFullCaptured() {
    return isFullCaptured;
  }

  public void setIsFullCaptured(Boolean isFullCaptured) {
    this.isFullCaptured = isFullCaptured;
  }

  public ExtendedInstallmentPlan isChargedBack(Boolean isChargedBack) {
    this.isChargedBack = isChargedBack;
    return this;
  }

   /**
   * Get isChargedBack
   * @return isChargedBack
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsChargedBack() {
    return isChargedBack;
  }

  public void setIsChargedBack(Boolean isChargedBack) {
    this.isChargedBack = isChargedBack;
  }

  public ExtendedInstallmentPlan arePaymentsOnHold(Boolean arePaymentsOnHold) {
    this.arePaymentsOnHold = arePaymentsOnHold;
    return this;
  }

   /**
   * Get arePaymentsOnHold
   * @return arePaymentsOnHold
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isArePaymentsOnHold() {
    return arePaymentsOnHold;
  }

  public void setArePaymentsOnHold(Boolean arePaymentsOnHold) {
    this.arePaymentsOnHold = arePaymentsOnHold;
  }

  public ExtendedInstallmentPlan scpFundingPercent(BigDecimal scpFundingPercent) {
    this.scpFundingPercent = scpFundingPercent;
    return this;
  }

   /**
   * Get scpFundingPercent
   * @return scpFundingPercent
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getScpFundingPercent() {
    return scpFundingPercent;
  }

  public void setScpFundingPercent(BigDecimal scpFundingPercent) {
    this.scpFundingPercent = scpFundingPercent;
  }

  public ExtendedInstallmentPlan testMode(TestModes testMode) {
    this.testMode = testMode;
    return this;
  }

   /**
   * Get testMode
   * @return testMode
  **/
  @ApiModelProperty(required = true, value = "")
  public TestModes getTestMode() {
    return testMode;
  }

  public void setTestMode(TestModes testMode) {
    this.testMode = testMode;
  }

  public ExtendedInstallmentPlan creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Get creationDateTime
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public ExtendedInstallmentPlan installments(List<Installment> installments) {
    this.installments = installments;
    return this;
  }

  public ExtendedInstallmentPlan addInstallmentsItem(Installment installmentsItem) {
    if (this.installments == null) {
      this.installments = new ArrayList<Installment>();
    }
    this.installments.add(installmentsItem);
    return this;
  }

   /**
   * Get installments
   * @return installments
  **/
  @ApiModelProperty(value = "")
  public List<Installment> getInstallments() {
    return installments;
  }

  public void setInstallments(List<Installment> installments) {
    this.installments = installments;
  }

  public ExtendedInstallmentPlan secureAuthorizations(List<ReAuthorization> secureAuthorizations) {
    this.secureAuthorizations = secureAuthorizations;
    return this;
  }

  public ExtendedInstallmentPlan addSecureAuthorizationsItem(ReAuthorization secureAuthorizationsItem) {
    if (this.secureAuthorizations == null) {
      this.secureAuthorizations = new ArrayList<ReAuthorization>();
    }
    this.secureAuthorizations.add(secureAuthorizationsItem);
    return this;
  }

   /**
   * Get secureAuthorizations
   * @return secureAuthorizations
  **/
  @ApiModelProperty(value = "")
  public List<ReAuthorization> getSecureAuthorizations() {
    return secureAuthorizations;
  }

  public void setSecureAuthorizations(List<ReAuthorization> secureAuthorizations) {
    this.secureAuthorizations = secureAuthorizations;
  }

  public ExtendedInstallmentPlan businessUnit(BuRef businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }

   /**
   * Get businessUnit
   * @return businessUnit
  **/
  @ApiModelProperty(value = "")
  public BuRef getBusinessUnit() {
    return businessUnit;
  }

  public void setBusinessUnit(BuRef businessUnit) {
    this.businessUnit = businessUnit;
  }

  public ExtendedInstallmentPlan shopperPaymentRequestTime(OffsetDateTime shopperPaymentRequestTime) {
    this.shopperPaymentRequestTime = shopperPaymentRequestTime;
    return this;
  }

   /**
   * Get shopperPaymentRequestTime
   * @return shopperPaymentRequestTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getShopperPaymentRequestTime() {
    return shopperPaymentRequestTime;
  }

  public void setShopperPaymentRequestTime(OffsetDateTime shopperPaymentRequestTime) {
    this.shopperPaymentRequestTime = shopperPaymentRequestTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedInstallmentPlan extendedInstallmentPlan = (ExtendedInstallmentPlan) o;
    return Objects.equals(this.installmentPlanNumber, extendedInstallmentPlan.installmentPlanNumber) &&
        Objects.equals(this.installmentPlanStatus, extendedInstallmentPlan.installmentPlanStatus) &&
        Objects.equals(this.amount, extendedInstallmentPlan.amount) &&
        Objects.equals(this.outstandingAmount, extendedInstallmentPlan.outstandingAmount) &&
        Objects.equals(this.numberOfInstallments, extendedInstallmentPlan.numberOfInstallments) &&
        Objects.equals(this.numberOfProcessedInstallments, extendedInstallmentPlan.numberOfProcessedInstallments) &&
        Objects.equals(this.originalAmount, extendedInstallmentPlan.originalAmount) &&
        Objects.equals(this.refundAmount, extendedInstallmentPlan.refundAmount) &&
        Objects.equals(this.consumer, extendedInstallmentPlan.consumer) &&
        Objects.equals(this.activeCard, extendedInstallmentPlan.activeCard) &&
        Objects.equals(this.fraudCheck, extendedInstallmentPlan.fraudCheck) &&
        Objects.equals(this.merchant, extendedInstallmentPlan.merchant) &&
        Objects.equals(this.refOrderNumber, extendedInstallmentPlan.refOrderNumber) &&
        Objects.equals(this.purchaseMethod, extendedInstallmentPlan.purchaseMethod) &&
        Objects.equals(this.strategy, extendedInstallmentPlan.strategy) &&
        Objects.equals(this.delayResolution, extendedInstallmentPlan.delayResolution) &&
        Objects.equals(this.extendedParams, extendedInstallmentPlan.extendedParams) &&
        Objects.equals(this.isFullCaptured, extendedInstallmentPlan.isFullCaptured) &&
        Objects.equals(this.isChargedBack, extendedInstallmentPlan.isChargedBack) &&
        Objects.equals(this.arePaymentsOnHold, extendedInstallmentPlan.arePaymentsOnHold) &&
        Objects.equals(this.scpFundingPercent, extendedInstallmentPlan.scpFundingPercent) &&
        Objects.equals(this.testMode, extendedInstallmentPlan.testMode) &&
        Objects.equals(this.creationDateTime, extendedInstallmentPlan.creationDateTime) &&
        Objects.equals(this.installments, extendedInstallmentPlan.installments) &&
        Objects.equals(this.secureAuthorizations, extendedInstallmentPlan.secureAuthorizations) &&
        Objects.equals(this.businessUnit, extendedInstallmentPlan.businessUnit) &&
        Objects.equals(this.shopperPaymentRequestTime, extendedInstallmentPlan.shopperPaymentRequestTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPlanNumber, installmentPlanStatus, amount, outstandingAmount, numberOfInstallments, numberOfProcessedInstallments, originalAmount, refundAmount, consumer, activeCard, fraudCheck, merchant, refOrderNumber, purchaseMethod, strategy, delayResolution, extendedParams, isFullCaptured, isChargedBack, arePaymentsOnHold, scpFundingPercent, testMode, creationDateTime, installments, secureAuthorizations, businessUnit, shopperPaymentRequestTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedInstallmentPlan {\n");
    
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    installmentPlanStatus: ").append(toIndentedString(installmentPlanStatus)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    outstandingAmount: ").append(toIndentedString(outstandingAmount)).append("\n");
    sb.append("    numberOfInstallments: ").append(toIndentedString(numberOfInstallments)).append("\n");
    sb.append("    numberOfProcessedInstallments: ").append(toIndentedString(numberOfProcessedInstallments)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    consumer: ").append(toIndentedString(consumer)).append("\n");
    sb.append("    activeCard: ").append(toIndentedString(activeCard)).append("\n");
    sb.append("    fraudCheck: ").append(toIndentedString(fraudCheck)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    purchaseMethod: ").append(toIndentedString(purchaseMethod)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    delayResolution: ").append(toIndentedString(delayResolution)).append("\n");
    sb.append("    extendedParams: ").append(toIndentedString(extendedParams)).append("\n");
    sb.append("    isFullCaptured: ").append(toIndentedString(isFullCaptured)).append("\n");
    sb.append("    isChargedBack: ").append(toIndentedString(isChargedBack)).append("\n");
    sb.append("    arePaymentsOnHold: ").append(toIndentedString(arePaymentsOnHold)).append("\n");
    sb.append("    scpFundingPercent: ").append(toIndentedString(scpFundingPercent)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    secureAuthorizations: ").append(toIndentedString(secureAuthorizations)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    shopperPaymentRequestTime: ").append(toIndentedString(shopperPaymentRequestTime)).append("\n");
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
