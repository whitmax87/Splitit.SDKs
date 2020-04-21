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
import com.splitit.sdk.model.DelayResolution;
import com.splitit.sdk.model.FraudCheckResult;
import com.splitit.sdk.model.InstallmentPlanDateInfo;
import com.splitit.sdk.model.InstallmentPlanInitiatedStatuses;
import com.splitit.sdk.model.InstallmentPlanStatus;
import com.splitit.sdk.model.TestModes;
import com.splitit.sdk.model.TransactionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * InstallmentPlanQueryCriteria
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-21T07:57:36.416Z")
public class InstallmentPlanQueryCriteria   {
  @SerializedName("MerchantId")
  private Long merchantId = null;

  @SerializedName("CurrencyId")
  private Long currencyId = null;

  @SerializedName("InstallmentPlanId")
  private Long installmentPlanId = null;

  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  @SerializedName("RefOrderNumber")
  private String refOrderNumber = null;

  @SerializedName("InstallmentPlanAmount")
  private BigDecimal installmentPlanAmount = null;

  @SerializedName("CardNumber")
  private String cardNumber = null;

  @SerializedName("ConsumerName")
  private String consumerName = null;

  @SerializedName("ConsumerEmail")
  private String consumerEmail = null;

  @SerializedName("CardHolder")
  private String cardHolder = null;

  @SerializedName("PisMemberId")
  private Long pisMemberId = null;

  @SerializedName("AnyFilter")
  private String anyFilter = null;

  @SerializedName("Eula")
  private Boolean eula = null;

  @SerializedName("ShowChargebackPlans")
  private Boolean showChargebackPlans = null;

  @SerializedName("InitiatedStatuses")
  private InstallmentPlanInitiatedStatuses initiatedStatuses = null;

  @SerializedName("FraudCheckResult")
  private FraudCheckResult fraudCheckResult = null;

  @SerializedName("InstallmentsPlanStatuses")
  private List<InstallmentPlanStatus> installmentsPlanStatuses = null;

  @SerializedName("TestModes")
  private List<TestModes> testModes = null;

  @SerializedName("DelayResolutions")
  private List<DelayResolution> delayResolutions = null;

  @SerializedName("TransactionInformation")
  private TransactionInfo transactionInformation = null;

  @SerializedName("DateInfo")
  private InstallmentPlanDateInfo dateInfo = null;

  public InstallmentPlanQueryCriteria merchantId(Long merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(Long merchantId) {
    this.merchantId = merchantId;
  }

  public InstallmentPlanQueryCriteria currencyId(Long currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * Get currencyId
   * @return currencyId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(Long currencyId) {
    this.currencyId = currencyId;
  }

  public InstallmentPlanQueryCriteria installmentPlanId(Long installmentPlanId) {
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

  public InstallmentPlanQueryCriteria installmentPlanNumber(String installmentPlanNumber) {
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

  public InstallmentPlanQueryCriteria refOrderNumber(String refOrderNumber) {
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

  public InstallmentPlanQueryCriteria installmentPlanAmount(BigDecimal installmentPlanAmount) {
    this.installmentPlanAmount = installmentPlanAmount;
    return this;
  }

   /**
   * Get installmentPlanAmount
   * @return installmentPlanAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getInstallmentPlanAmount() {
    return installmentPlanAmount;
  }

  public void setInstallmentPlanAmount(BigDecimal installmentPlanAmount) {
    this.installmentPlanAmount = installmentPlanAmount;
  }

  public InstallmentPlanQueryCriteria cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public InstallmentPlanQueryCriteria consumerName(String consumerName) {
    this.consumerName = consumerName;
    return this;
  }

   /**
   * Get consumerName
   * @return consumerName
  **/
  @ApiModelProperty(value = "")
  public String getConsumerName() {
    return consumerName;
  }

  public void setConsumerName(String consumerName) {
    this.consumerName = consumerName;
  }

  public InstallmentPlanQueryCriteria consumerEmail(String consumerEmail) {
    this.consumerEmail = consumerEmail;
    return this;
  }

   /**
   * Get consumerEmail
   * @return consumerEmail
  **/
  @ApiModelProperty(value = "")
  public String getConsumerEmail() {
    return consumerEmail;
  }

  public void setConsumerEmail(String consumerEmail) {
    this.consumerEmail = consumerEmail;
  }

  public InstallmentPlanQueryCriteria cardHolder(String cardHolder) {
    this.cardHolder = cardHolder;
    return this;
  }

   /**
   * Get cardHolder
   * @return cardHolder
  **/
  @ApiModelProperty(value = "")
  public String getCardHolder() {
    return cardHolder;
  }

  public void setCardHolder(String cardHolder) {
    this.cardHolder = cardHolder;
  }

  public InstallmentPlanQueryCriteria pisMemberId(Long pisMemberId) {
    this.pisMemberId = pisMemberId;
    return this;
  }

   /**
   * Get pisMemberId
   * @return pisMemberId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getPisMemberId() {
    return pisMemberId;
  }

  public void setPisMemberId(Long pisMemberId) {
    this.pisMemberId = pisMemberId;
  }

  public InstallmentPlanQueryCriteria anyFilter(String anyFilter) {
    this.anyFilter = anyFilter;
    return this;
  }

   /**
   * Get anyFilter
   * @return anyFilter
  **/
  @ApiModelProperty(value = "")
  public String getAnyFilter() {
    return anyFilter;
  }

  public void setAnyFilter(String anyFilter) {
    this.anyFilter = anyFilter;
  }

  public InstallmentPlanQueryCriteria eula(Boolean eula) {
    this.eula = eula;
    return this;
  }

   /**
   * Get eula
   * @return eula
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isEula() {
    return eula;
  }

  public void setEula(Boolean eula) {
    this.eula = eula;
  }

  public InstallmentPlanQueryCriteria showChargebackPlans(Boolean showChargebackPlans) {
    this.showChargebackPlans = showChargebackPlans;
    return this;
  }

   /**
   * Get showChargebackPlans
   * @return showChargebackPlans
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isShowChargebackPlans() {
    return showChargebackPlans;
  }

  public void setShowChargebackPlans(Boolean showChargebackPlans) {
    this.showChargebackPlans = showChargebackPlans;
  }

  public InstallmentPlanQueryCriteria initiatedStatuses(InstallmentPlanInitiatedStatuses initiatedStatuses) {
    this.initiatedStatuses = initiatedStatuses;
    return this;
  }

   /**
   * Get initiatedStatuses
   * @return initiatedStatuses
  **/
  @ApiModelProperty(value = "")
  public InstallmentPlanInitiatedStatuses getInitiatedStatuses() {
    return initiatedStatuses;
  }

  public void setInitiatedStatuses(InstallmentPlanInitiatedStatuses initiatedStatuses) {
    this.initiatedStatuses = initiatedStatuses;
  }

  public InstallmentPlanQueryCriteria fraudCheckResult(FraudCheckResult fraudCheckResult) {
    this.fraudCheckResult = fraudCheckResult;
    return this;
  }

   /**
   * Get fraudCheckResult
   * @return fraudCheckResult
  **/
  @ApiModelProperty(value = "")
  public FraudCheckResult getFraudCheckResult() {
    return fraudCheckResult;
  }

  public void setFraudCheckResult(FraudCheckResult fraudCheckResult) {
    this.fraudCheckResult = fraudCheckResult;
  }

  public InstallmentPlanQueryCriteria installmentsPlanStatuses(List<InstallmentPlanStatus> installmentsPlanStatuses) {
    this.installmentsPlanStatuses = installmentsPlanStatuses;
    return this;
  }

  public InstallmentPlanQueryCriteria addInstallmentsPlanStatusesItem(InstallmentPlanStatus installmentsPlanStatusesItem) {
    if (this.installmentsPlanStatuses == null) {
      this.installmentsPlanStatuses = new ArrayList<InstallmentPlanStatus>();
    }
    this.installmentsPlanStatuses.add(installmentsPlanStatusesItem);
    return this;
  }

   /**
   * Get installmentsPlanStatuses
   * @return installmentsPlanStatuses
  **/
  @ApiModelProperty(value = "")
  public List<InstallmentPlanStatus> getInstallmentsPlanStatuses() {
    return installmentsPlanStatuses;
  }

  public void setInstallmentsPlanStatuses(List<InstallmentPlanStatus> installmentsPlanStatuses) {
    this.installmentsPlanStatuses = installmentsPlanStatuses;
  }

  public InstallmentPlanQueryCriteria testModes(List<TestModes> testModes) {
    this.testModes = testModes;
    return this;
  }

  public InstallmentPlanQueryCriteria addTestModesItem(TestModes testModesItem) {
    if (this.testModes == null) {
      this.testModes = new ArrayList<TestModes>();
    }
    this.testModes.add(testModesItem);
    return this;
  }

   /**
   * Get testModes
   * @return testModes
  **/
  @ApiModelProperty(value = "")
  public List<TestModes> getTestModes() {
    return testModes;
  }

  public void setTestModes(List<TestModes> testModes) {
    this.testModes = testModes;
  }

  public InstallmentPlanQueryCriteria delayResolutions(List<DelayResolution> delayResolutions) {
    this.delayResolutions = delayResolutions;
    return this;
  }

  public InstallmentPlanQueryCriteria addDelayResolutionsItem(DelayResolution delayResolutionsItem) {
    if (this.delayResolutions == null) {
      this.delayResolutions = new ArrayList<DelayResolution>();
    }
    this.delayResolutions.add(delayResolutionsItem);
    return this;
  }

   /**
   * Get delayResolutions
   * @return delayResolutions
  **/
  @ApiModelProperty(value = "")
  public List<DelayResolution> getDelayResolutions() {
    return delayResolutions;
  }

  public void setDelayResolutions(List<DelayResolution> delayResolutions) {
    this.delayResolutions = delayResolutions;
  }

  public InstallmentPlanQueryCriteria transactionInformation(TransactionInfo transactionInformation) {
    this.transactionInformation = transactionInformation;
    return this;
  }

   /**
   * Get transactionInformation
   * @return transactionInformation
  **/
  @ApiModelProperty(value = "")
  public TransactionInfo getTransactionInformation() {
    return transactionInformation;
  }

  public void setTransactionInformation(TransactionInfo transactionInformation) {
    this.transactionInformation = transactionInformation;
  }

  public InstallmentPlanQueryCriteria dateInfo(InstallmentPlanDateInfo dateInfo) {
    this.dateInfo = dateInfo;
    return this;
  }

   /**
   * Get dateInfo
   * @return dateInfo
  **/
  @ApiModelProperty(value = "")
  public InstallmentPlanDateInfo getDateInfo() {
    return dateInfo;
  }

  public void setDateInfo(InstallmentPlanDateInfo dateInfo) {
    this.dateInfo = dateInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanQueryCriteria installmentPlanQueryCriteria = (InstallmentPlanQueryCriteria) o;
    return Objects.equals(this.merchantId, installmentPlanQueryCriteria.merchantId) &&
        Objects.equals(this.currencyId, installmentPlanQueryCriteria.currencyId) &&
        Objects.equals(this.installmentPlanId, installmentPlanQueryCriteria.installmentPlanId) &&
        Objects.equals(this.installmentPlanNumber, installmentPlanQueryCriteria.installmentPlanNumber) &&
        Objects.equals(this.refOrderNumber, installmentPlanQueryCriteria.refOrderNumber) &&
        Objects.equals(this.installmentPlanAmount, installmentPlanQueryCriteria.installmentPlanAmount) &&
        Objects.equals(this.cardNumber, installmentPlanQueryCriteria.cardNumber) &&
        Objects.equals(this.consumerName, installmentPlanQueryCriteria.consumerName) &&
        Objects.equals(this.consumerEmail, installmentPlanQueryCriteria.consumerEmail) &&
        Objects.equals(this.cardHolder, installmentPlanQueryCriteria.cardHolder) &&
        Objects.equals(this.pisMemberId, installmentPlanQueryCriteria.pisMemberId) &&
        Objects.equals(this.anyFilter, installmentPlanQueryCriteria.anyFilter) &&
        Objects.equals(this.eula, installmentPlanQueryCriteria.eula) &&
        Objects.equals(this.showChargebackPlans, installmentPlanQueryCriteria.showChargebackPlans) &&
        Objects.equals(this.initiatedStatuses, installmentPlanQueryCriteria.initiatedStatuses) &&
        Objects.equals(this.fraudCheckResult, installmentPlanQueryCriteria.fraudCheckResult) &&
        Objects.equals(this.installmentsPlanStatuses, installmentPlanQueryCriteria.installmentsPlanStatuses) &&
        Objects.equals(this.testModes, installmentPlanQueryCriteria.testModes) &&
        Objects.equals(this.delayResolutions, installmentPlanQueryCriteria.delayResolutions) &&
        Objects.equals(this.transactionInformation, installmentPlanQueryCriteria.transactionInformation) &&
        Objects.equals(this.dateInfo, installmentPlanQueryCriteria.dateInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, currencyId, installmentPlanId, installmentPlanNumber, refOrderNumber, installmentPlanAmount, cardNumber, consumerName, consumerEmail, cardHolder, pisMemberId, anyFilter, eula, showChargebackPlans, initiatedStatuses, fraudCheckResult, installmentsPlanStatuses, testModes, delayResolutions, transactionInformation, dateInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanQueryCriteria {\n");
    
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    installmentPlanId: ").append(toIndentedString(installmentPlanId)).append("\n");
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    installmentPlanAmount: ").append(toIndentedString(installmentPlanAmount)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    consumerName: ").append(toIndentedString(consumerName)).append("\n");
    sb.append("    consumerEmail: ").append(toIndentedString(consumerEmail)).append("\n");
    sb.append("    cardHolder: ").append(toIndentedString(cardHolder)).append("\n");
    sb.append("    pisMemberId: ").append(toIndentedString(pisMemberId)).append("\n");
    sb.append("    anyFilter: ").append(toIndentedString(anyFilter)).append("\n");
    sb.append("    eula: ").append(toIndentedString(eula)).append("\n");
    sb.append("    showChargebackPlans: ").append(toIndentedString(showChargebackPlans)).append("\n");
    sb.append("    initiatedStatuses: ").append(toIndentedString(initiatedStatuses)).append("\n");
    sb.append("    fraudCheckResult: ").append(toIndentedString(fraudCheckResult)).append("\n");
    sb.append("    installmentsPlanStatuses: ").append(toIndentedString(installmentsPlanStatuses)).append("\n");
    sb.append("    testModes: ").append(toIndentedString(testModes)).append("\n");
    sb.append("    delayResolutions: ").append(toIndentedString(delayResolutions)).append("\n");
    sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
    sb.append("    dateInfo: ").append(toIndentedString(dateInfo)).append("\n");
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

