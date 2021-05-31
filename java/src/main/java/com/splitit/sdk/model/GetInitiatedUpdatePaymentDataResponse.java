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
import com.splitit.sdk.model.CardData;
import com.splitit.sdk.model.Error;
import com.splitit.sdk.model.MerchantRef;
import com.splitit.sdk.model.MoneyWithCurrencyCode;
import com.splitit.sdk.model.RedirectUrls;
import com.splitit.sdk.model.ResponseHeader;
import com.splitit.sdk.model.TermsAndConditions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetInitiatedUpdatePaymentDataResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class GetInitiatedUpdatePaymentDataResponse  {
  @SerializedName("ResponseHeader")
  private ResponseHeader responseHeader = null;

  @SerializedName("CardData")
  private CardData cardData = null;

  @SerializedName("Merchant")
  private MerchantRef merchant = null;

  @SerializedName("RedirectUrls")
  private RedirectUrls redirectUrls = null;

  @SerializedName("OutstandingAmount")
  private MoneyWithCurrencyCode outstandingAmount = null;

  @SerializedName("TermsAndConditions")
  private TermsAndConditions termsAndConditions = null;

  @SerializedName("ProcessorName")
  private String processorName = null;

  @SerializedName("Is3DSRequired")
  private Boolean is3DSRequired = null;

  @SerializedName("LastError")
  private Error lastError = null;

  @SerializedName("Logo")
  private String logo = null;

  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  public GetInitiatedUpdatePaymentDataResponse responseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

   /**
   * Get responseHeader
   * @return responseHeader
  **/
  @ApiModelProperty(value = "")
  public ResponseHeader getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
  }

  public GetInitiatedUpdatePaymentDataResponse cardData(CardData cardData) {
    this.cardData = cardData;
    return this;
  }

   /**
   * Get cardData
   * @return cardData
  **/
  @ApiModelProperty(value = "")
  public CardData getCardData() {
    return cardData;
  }

  public void setCardData(CardData cardData) {
    this.cardData = cardData;
  }

  public GetInitiatedUpdatePaymentDataResponse merchant(MerchantRef merchant) {
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

  public GetInitiatedUpdatePaymentDataResponse redirectUrls(RedirectUrls redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

   /**
   * Get redirectUrls
   * @return redirectUrls
  **/
  @ApiModelProperty(value = "")
  public RedirectUrls getRedirectUrls() {
    return redirectUrls;
  }

  public void setRedirectUrls(RedirectUrls redirectUrls) {
    this.redirectUrls = redirectUrls;
  }

  public GetInitiatedUpdatePaymentDataResponse outstandingAmount(MoneyWithCurrencyCode outstandingAmount) {
    this.outstandingAmount = outstandingAmount;
    return this;
  }

   /**
   * Get outstandingAmount
   * @return outstandingAmount
  **/
  @ApiModelProperty(value = "")
  public MoneyWithCurrencyCode getOutstandingAmount() {
    return outstandingAmount;
  }

  public void setOutstandingAmount(MoneyWithCurrencyCode outstandingAmount) {
    this.outstandingAmount = outstandingAmount;
  }

  public GetInitiatedUpdatePaymentDataResponse termsAndConditions(TermsAndConditions termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

   /**
   * Get termsAndConditions
   * @return termsAndConditions
  **/
  @ApiModelProperty(value = "")
  public TermsAndConditions getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(TermsAndConditions termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  public GetInitiatedUpdatePaymentDataResponse processorName(String processorName) {
    this.processorName = processorName;
    return this;
  }

   /**
   * Get processorName
   * @return processorName
  **/
  @ApiModelProperty(value = "")
  public String getProcessorName() {
    return processorName;
  }

  public void setProcessorName(String processorName) {
    this.processorName = processorName;
  }

  public GetInitiatedUpdatePaymentDataResponse is3DSRequired(Boolean is3DSRequired) {
    this.is3DSRequired = is3DSRequired;
    return this;
  }

   /**
   * Get is3DSRequired
   * @return is3DSRequired
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIs3DSRequired() {
    return is3DSRequired;
  }

  public void setIs3DSRequired(Boolean is3DSRequired) {
    this.is3DSRequired = is3DSRequired;
  }

  public GetInitiatedUpdatePaymentDataResponse lastError(Error lastError) {
    this.lastError = lastError;
    return this;
  }

   /**
   * Get lastError
   * @return lastError
  **/
  @ApiModelProperty(value = "")
  public Error getLastError() {
    return lastError;
  }

  public void setLastError(Error lastError) {
    this.lastError = lastError;
  }

  public GetInitiatedUpdatePaymentDataResponse logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @ApiModelProperty(value = "")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public GetInitiatedUpdatePaymentDataResponse installmentPlanNumber(String installmentPlanNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInitiatedUpdatePaymentDataResponse getInitiatedUpdatePaymentDataResponse = (GetInitiatedUpdatePaymentDataResponse) o;
    return Objects.equals(this.responseHeader, getInitiatedUpdatePaymentDataResponse.responseHeader) &&
        Objects.equals(this.cardData, getInitiatedUpdatePaymentDataResponse.cardData) &&
        Objects.equals(this.merchant, getInitiatedUpdatePaymentDataResponse.merchant) &&
        Objects.equals(this.redirectUrls, getInitiatedUpdatePaymentDataResponse.redirectUrls) &&
        Objects.equals(this.outstandingAmount, getInitiatedUpdatePaymentDataResponse.outstandingAmount) &&
        Objects.equals(this.termsAndConditions, getInitiatedUpdatePaymentDataResponse.termsAndConditions) &&
        Objects.equals(this.processorName, getInitiatedUpdatePaymentDataResponse.processorName) &&
        Objects.equals(this.is3DSRequired, getInitiatedUpdatePaymentDataResponse.is3DSRequired) &&
        Objects.equals(this.lastError, getInitiatedUpdatePaymentDataResponse.lastError) &&
        Objects.equals(this.logo, getInitiatedUpdatePaymentDataResponse.logo) &&
        Objects.equals(this.installmentPlanNumber, getInitiatedUpdatePaymentDataResponse.installmentPlanNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, cardData, merchant, redirectUrls, outstandingAmount, termsAndConditions, processorName, is3DSRequired, lastError, logo, installmentPlanNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInitiatedUpdatePaymentDataResponse {\n");
    
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    cardData: ").append(toIndentedString(cardData)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    redirectUrls: ").append(toIndentedString(redirectUrls)).append("\n");
    sb.append("    outstandingAmount: ").append(toIndentedString(outstandingAmount)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    processorName: ").append(toIndentedString(processorName)).append("\n");
    sb.append("    is3DSRequired: ").append(toIndentedString(is3DSRequired)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
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

