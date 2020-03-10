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
import com.splitit.sdk.model.MoneyWithCurrencyCode;
import com.splitit.sdk.model.PlanStrategy;
import com.splitit.sdk.model.PurchaseMethod;
import com.splitit.sdk.model.TestModes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * PlanData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-10T18:07:01.900Z")
public class PlanData   {
  @SerializedName("NumberOfInstallments")
  private Integer numberOfInstallments = null;

  @SerializedName("Amount")
  private MoneyWithCurrencyCode amount = null;

  @SerializedName("FirstInstallmentAmount")
  private MoneyWithCurrencyCode firstInstallmentAmount = null;

  @SerializedName("RefOrderNumber")
  private String refOrderNumber = null;

  @SerializedName("TestMode")
  private TestModes testMode = null;

  @SerializedName("PurchaseMethod")
  private PurchaseMethod purchaseMethod = null;

  @SerializedName("Strategy")
  private PlanStrategy strategy = null;

  @SerializedName("ExtendedParams")
  private Map<String, String> extendedParams = null;

  @SerializedName("FirstChargeDate")
  private OffsetDateTime firstChargeDate = null;

  @SerializedName("AutoCapture")
  private Boolean autoCapture = null;

  @SerializedName("IsFunded")
  private Boolean isFunded = null;

  @SerializedName("Attempt3DSecure")
  private Object attempt3DSecure = null;

  public PlanData numberOfInstallments(Integer numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
    return this;
  }

   /**
   * Get numberOfInstallments
   * @return numberOfInstallments
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfInstallments() {
    return numberOfInstallments;
  }

  public void setNumberOfInstallments(Integer numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }

  public PlanData amount(MoneyWithCurrencyCode amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public MoneyWithCurrencyCode getAmount() {
    return amount;
  }

  public void setAmount(MoneyWithCurrencyCode amount) {
    this.amount = amount;
  }

  public PlanData firstInstallmentAmount(MoneyWithCurrencyCode firstInstallmentAmount) {
    this.firstInstallmentAmount = firstInstallmentAmount;
    return this;
  }

   /**
   * Get firstInstallmentAmount
   * @return firstInstallmentAmount
  **/
  @ApiModelProperty(value = "")
  public MoneyWithCurrencyCode getFirstInstallmentAmount() {
    return firstInstallmentAmount;
  }

  public void setFirstInstallmentAmount(MoneyWithCurrencyCode firstInstallmentAmount) {
    this.firstInstallmentAmount = firstInstallmentAmount;
  }

  public PlanData refOrderNumber(String refOrderNumber) {
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

  public PlanData testMode(TestModes testMode) {
    this.testMode = testMode;
    return this;
  }

   /**
   * Get testMode
   * @return testMode
  **/
  @ApiModelProperty(value = "")
  public TestModes getTestMode() {
    return testMode;
  }

  public void setTestMode(TestModes testMode) {
    this.testMode = testMode;
  }

  public PlanData purchaseMethod(PurchaseMethod purchaseMethod) {
    this.purchaseMethod = purchaseMethod;
    return this;
  }

   /**
   * Get purchaseMethod
   * @return purchaseMethod
  **/
  @ApiModelProperty(value = "")
  public PurchaseMethod getPurchaseMethod() {
    return purchaseMethod;
  }

  public void setPurchaseMethod(PurchaseMethod purchaseMethod) {
    this.purchaseMethod = purchaseMethod;
  }

  public PlanData strategy(PlanStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @ApiModelProperty(value = "")
  public PlanStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(PlanStrategy strategy) {
    this.strategy = strategy;
  }

  public PlanData extendedParams(Map<String, String> extendedParams) {
    this.extendedParams = extendedParams;
    return this;
  }

  public PlanData putExtendedParamsItem(String key, String extendedParamsItem) {
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

  public PlanData firstChargeDate(OffsetDateTime firstChargeDate) {
    this.firstChargeDate = firstChargeDate;
    return this;
  }

   /**
   * Get firstChargeDate
   * @return firstChargeDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFirstChargeDate() {
    return firstChargeDate;
  }

  public void setFirstChargeDate(OffsetDateTime firstChargeDate) {
    this.firstChargeDate = firstChargeDate;
  }

  public PlanData autoCapture(Boolean autoCapture) {
    this.autoCapture = autoCapture;
    return this;
  }

   /**
   * Get autoCapture
   * @return autoCapture
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoCapture() {
    return autoCapture;
  }

  public void setAutoCapture(Boolean autoCapture) {
    this.autoCapture = autoCapture;
  }

  public PlanData isFunded(Boolean isFunded) {
    this.isFunded = isFunded;
    return this;
  }

   /**
   * Get isFunded
   * @return isFunded
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFunded() {
    return isFunded;
  }

  public void setIsFunded(Boolean isFunded) {
    this.isFunded = isFunded;
  }

  public PlanData attempt3DSecure(Object attempt3DSecure) {
    this.attempt3DSecure = attempt3DSecure;
    return this;
  }

   /**
   * Get attempt3DSecure
   * @return attempt3DSecure
  **/
  @ApiModelProperty(value = "")
  public Object getAttempt3DSecure() {
    return attempt3DSecure;
  }

  public void setAttempt3DSecure(Object attempt3DSecure) {
    this.attempt3DSecure = attempt3DSecure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanData planData = (PlanData) o;
    return Objects.equals(this.numberOfInstallments, planData.numberOfInstallments) &&
        Objects.equals(this.amount, planData.amount) &&
        Objects.equals(this.firstInstallmentAmount, planData.firstInstallmentAmount) &&
        Objects.equals(this.refOrderNumber, planData.refOrderNumber) &&
        Objects.equals(this.testMode, planData.testMode) &&
        Objects.equals(this.purchaseMethod, planData.purchaseMethod) &&
        Objects.equals(this.strategy, planData.strategy) &&
        Objects.equals(this.extendedParams, planData.extendedParams) &&
        Objects.equals(this.firstChargeDate, planData.firstChargeDate) &&
        Objects.equals(this.autoCapture, planData.autoCapture) &&
        Objects.equals(this.isFunded, planData.isFunded) &&
        Objects.equals(this.attempt3DSecure, planData.attempt3DSecure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfInstallments, amount, firstInstallmentAmount, refOrderNumber, testMode, purchaseMethod, strategy, extendedParams, firstChargeDate, autoCapture, isFunded, attempt3DSecure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanData {\n");
    
    sb.append("    numberOfInstallments: ").append(toIndentedString(numberOfInstallments)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    firstInstallmentAmount: ").append(toIndentedString(firstInstallmentAmount)).append("\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("    purchaseMethod: ").append(toIndentedString(purchaseMethod)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    extendedParams: ").append(toIndentedString(extendedParams)).append("\n");
    sb.append("    firstChargeDate: ").append(toIndentedString(firstChargeDate)).append("\n");
    sb.append("    autoCapture: ").append(toIndentedString(autoCapture)).append("\n");
    sb.append("    isFunded: ").append(toIndentedString(isFunded)).append("\n");
    sb.append("    attempt3DSecure: ").append(toIndentedString(attempt3DSecure)).append("\n");
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
