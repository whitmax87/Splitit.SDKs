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
import com.splitit.sdk.model.AddressData;
import com.splitit.sdk.model.CartData;
import com.splitit.sdk.model.ConsumerData;
import com.splitit.sdk.model.Error;
import com.splitit.sdk.model.MerchantRef;
import com.splitit.sdk.model.PaymentWizardDataResponse;
import com.splitit.sdk.model.PlanData;
import com.splitit.sdk.model.ResponseHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetInitiatedInstallmentPlanResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-05T08:02:38.616Z")
public class GetInitiatedInstallmentPlanResponse  {
  @SerializedName("ResponseHeader")
  private ResponseHeader responseHeader = null;

  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  @SerializedName("PlanData")
  private PlanData planData = null;

  @SerializedName("CartData")
  private CartData cartData = null;

  @SerializedName("ConsumerData")
  private ConsumerData consumerData = null;

  @SerializedName("MerchantData")
  private MerchantRef merchantData = null;

  @SerializedName("BillingAddress")
  private AddressData billingAddress = null;

  @SerializedName("PaymentWizardDataResponse")
  private PaymentWizardDataResponse paymentWizardDataResponse = null;

  @SerializedName("ErrorIndicator")
  private Error errorIndicator = null;

  public GetInitiatedInstallmentPlanResponse responseHeader(ResponseHeader responseHeader) {
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

  public GetInitiatedInstallmentPlanResponse installmentPlanNumber(String installmentPlanNumber) {
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

  public GetInitiatedInstallmentPlanResponse planData(PlanData planData) {
    this.planData = planData;
    return this;
  }

   /**
   * Get planData
   * @return planData
  **/
  @ApiModelProperty(value = "")
  public PlanData getPlanData() {
    return planData;
  }

  public void setPlanData(PlanData planData) {
    this.planData = planData;
  }

  public GetInitiatedInstallmentPlanResponse cartData(CartData cartData) {
    this.cartData = cartData;
    return this;
  }

   /**
   * Get cartData
   * @return cartData
  **/
  @ApiModelProperty(value = "")
  public CartData getCartData() {
    return cartData;
  }

  public void setCartData(CartData cartData) {
    this.cartData = cartData;
  }

  public GetInitiatedInstallmentPlanResponse consumerData(ConsumerData consumerData) {
    this.consumerData = consumerData;
    return this;
  }

   /**
   * Get consumerData
   * @return consumerData
  **/
  @ApiModelProperty(value = "")
  public ConsumerData getConsumerData() {
    return consumerData;
  }

  public void setConsumerData(ConsumerData consumerData) {
    this.consumerData = consumerData;
  }

  public GetInitiatedInstallmentPlanResponse merchantData(MerchantRef merchantData) {
    this.merchantData = merchantData;
    return this;
  }

   /**
   * Get merchantData
   * @return merchantData
  **/
  @ApiModelProperty(value = "")
  public MerchantRef getMerchantData() {
    return merchantData;
  }

  public void setMerchantData(MerchantRef merchantData) {
    this.merchantData = merchantData;
  }

  public GetInitiatedInstallmentPlanResponse billingAddress(AddressData billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public AddressData getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AddressData billingAddress) {
    this.billingAddress = billingAddress;
  }

  public GetInitiatedInstallmentPlanResponse paymentWizardDataResponse(PaymentWizardDataResponse paymentWizardDataResponse) {
    this.paymentWizardDataResponse = paymentWizardDataResponse;
    return this;
  }

   /**
   * Get paymentWizardDataResponse
   * @return paymentWizardDataResponse
  **/
  @ApiModelProperty(value = "")
  public PaymentWizardDataResponse getPaymentWizardDataResponse() {
    return paymentWizardDataResponse;
  }

  public void setPaymentWizardDataResponse(PaymentWizardDataResponse paymentWizardDataResponse) {
    this.paymentWizardDataResponse = paymentWizardDataResponse;
  }

  public GetInitiatedInstallmentPlanResponse errorIndicator(Error errorIndicator) {
    this.errorIndicator = errorIndicator;
    return this;
  }

   /**
   * Get errorIndicator
   * @return errorIndicator
  **/
  @ApiModelProperty(value = "")
  public Error getErrorIndicator() {
    return errorIndicator;
  }

  public void setErrorIndicator(Error errorIndicator) {
    this.errorIndicator = errorIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInitiatedInstallmentPlanResponse getInitiatedInstallmentPlanResponse = (GetInitiatedInstallmentPlanResponse) o;
    return Objects.equals(this.responseHeader, getInitiatedInstallmentPlanResponse.responseHeader) &&
        Objects.equals(this.installmentPlanNumber, getInitiatedInstallmentPlanResponse.installmentPlanNumber) &&
        Objects.equals(this.planData, getInitiatedInstallmentPlanResponse.planData) &&
        Objects.equals(this.cartData, getInitiatedInstallmentPlanResponse.cartData) &&
        Objects.equals(this.consumerData, getInitiatedInstallmentPlanResponse.consumerData) &&
        Objects.equals(this.merchantData, getInitiatedInstallmentPlanResponse.merchantData) &&
        Objects.equals(this.billingAddress, getInitiatedInstallmentPlanResponse.billingAddress) &&
        Objects.equals(this.paymentWizardDataResponse, getInitiatedInstallmentPlanResponse.paymentWizardDataResponse) &&
        Objects.equals(this.errorIndicator, getInitiatedInstallmentPlanResponse.errorIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, installmentPlanNumber, planData, cartData, consumerData, merchantData, billingAddress, paymentWizardDataResponse, errorIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInitiatedInstallmentPlanResponse {\n");
    
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    planData: ").append(toIndentedString(planData)).append("\n");
    sb.append("    cartData: ").append(toIndentedString(cartData)).append("\n");
    sb.append("    consumerData: ").append(toIndentedString(consumerData)).append("\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    paymentWizardDataResponse: ").append(toIndentedString(paymentWizardDataResponse)).append("\n");
    sb.append("    errorIndicator: ").append(toIndentedString(errorIndicator)).append("\n");
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

