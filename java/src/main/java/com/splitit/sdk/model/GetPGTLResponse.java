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
import com.splitit.sdk.model.PgtlDto;
import com.splitit.sdk.model.ResponseHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GetPGTLResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-02T10:18:45.756Z")
public class GetPGTLResponse  {
  @SerializedName("ResponseHeader")
  private ResponseHeader responseHeader = null;

  @SerializedName("paymentGatewaytransactionResponses")
  private Map<String, List<PgtlDto>> paymentGatewaytransactionResponses = null;

  public GetPGTLResponse responseHeader(ResponseHeader responseHeader) {
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

  public GetPGTLResponse paymentGatewaytransactionResponses(Map<String, List<PgtlDto>> paymentGatewaytransactionResponses) {
    this.paymentGatewaytransactionResponses = paymentGatewaytransactionResponses;
    return this;
  }

  public GetPGTLResponse putPaymentGatewaytransactionResponsesItem(String key, List<PgtlDto> paymentGatewaytransactionResponsesItem) {
    if (this.paymentGatewaytransactionResponses == null) {
      this.paymentGatewaytransactionResponses = new HashMap<String, List<PgtlDto>>();
    }
    this.paymentGatewaytransactionResponses.put(key, paymentGatewaytransactionResponsesItem);
    return this;
  }

   /**
   * Get paymentGatewaytransactionResponses
   * @return paymentGatewaytransactionResponses
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<PgtlDto>> getPaymentGatewaytransactionResponses() {
    return paymentGatewaytransactionResponses;
  }

  public void setPaymentGatewaytransactionResponses(Map<String, List<PgtlDto>> paymentGatewaytransactionResponses) {
    this.paymentGatewaytransactionResponses = paymentGatewaytransactionResponses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPGTLResponse getPGTLResponse = (GetPGTLResponse) o;
    return Objects.equals(this.responseHeader, getPGTLResponse.responseHeader) &&
        Objects.equals(this.paymentGatewaytransactionResponses, getPGTLResponse.paymentGatewaytransactionResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, paymentGatewaytransactionResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPGTLResponse {\n");
    
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    paymentGatewaytransactionResponses: ").append(toIndentedString(paymentGatewaytransactionResponses)).append("\n");
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

