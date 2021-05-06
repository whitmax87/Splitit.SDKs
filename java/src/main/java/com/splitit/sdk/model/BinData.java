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
import com.splitit.sdk.model.CardBrand;
import com.splitit.sdk.model.CardType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BinData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-06T09:33:27.783Z")
public class BinData  {
  @SerializedName("BinNumber")
  private String binNumber = null;

  @SerializedName("CardBrand")
  private CardBrand cardBrand = null;

  @SerializedName("IssuingCountryIsoNumber")
  private String issuingCountryIsoNumber = null;

  @SerializedName("CardType")
  private CardType cardType = null;

  @SerializedName("IsPrepaid")
  private Boolean isPrepaid = null;

  @SerializedName("CardClass")
  private String cardClass = null;

  @SerializedName("ProductId")
  private String productId = null;

  @SerializedName("IssuerBankName")
  private String issuerBankName = null;

  public BinData binNumber(String binNumber) {
    this.binNumber = binNumber;
    return this;
  }

   /**
   * Get binNumber
   * @return binNumber
  **/
  @ApiModelProperty(value = "")
  public String getBinNumber() {
    return binNumber;
  }

  public void setBinNumber(String binNumber) {
    this.binNumber = binNumber;
  }

  public BinData cardBrand(CardBrand cardBrand) {
    this.cardBrand = cardBrand;
    return this;
  }

   /**
   * Get cardBrand
   * @return cardBrand
  **/
  @ApiModelProperty(required = true, value = "")
  public CardBrand getCardBrand() {
    return cardBrand;
  }

  public void setCardBrand(CardBrand cardBrand) {
    this.cardBrand = cardBrand;
  }

  public BinData issuingCountryIsoNumber(String issuingCountryIsoNumber) {
    this.issuingCountryIsoNumber = issuingCountryIsoNumber;
    return this;
  }

   /**
   * Get issuingCountryIsoNumber
   * @return issuingCountryIsoNumber
  **/
  @ApiModelProperty(value = "")
  public String getIssuingCountryIsoNumber() {
    return issuingCountryIsoNumber;
  }

  public void setIssuingCountryIsoNumber(String issuingCountryIsoNumber) {
    this.issuingCountryIsoNumber = issuingCountryIsoNumber;
  }

  public BinData cardType(CardType cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(required = true, value = "")
  public CardType getCardType() {
    return cardType;
  }

  public void setCardType(CardType cardType) {
    this.cardType = cardType;
  }

  public BinData isPrepaid(Boolean isPrepaid) {
    this.isPrepaid = isPrepaid;
    return this;
  }

   /**
   * Get isPrepaid
   * @return isPrepaid
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsPrepaid() {
    return isPrepaid;
  }

  public void setIsPrepaid(Boolean isPrepaid) {
    this.isPrepaid = isPrepaid;
  }

  public BinData cardClass(String cardClass) {
    this.cardClass = cardClass;
    return this;
  }

   /**
   * Get cardClass
   * @return cardClass
  **/
  @ApiModelProperty(value = "")
  public String getCardClass() {
    return cardClass;
  }

  public void setCardClass(String cardClass) {
    this.cardClass = cardClass;
  }

  public BinData productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public BinData issuerBankName(String issuerBankName) {
    this.issuerBankName = issuerBankName;
    return this;
  }

   /**
   * Get issuerBankName
   * @return issuerBankName
  **/
  @ApiModelProperty(value = "")
  public String getIssuerBankName() {
    return issuerBankName;
  }

  public void setIssuerBankName(String issuerBankName) {
    this.issuerBankName = issuerBankName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinData binData = (BinData) o;
    return Objects.equals(this.binNumber, binData.binNumber) &&
        Objects.equals(this.cardBrand, binData.cardBrand) &&
        Objects.equals(this.issuingCountryIsoNumber, binData.issuingCountryIsoNumber) &&
        Objects.equals(this.cardType, binData.cardType) &&
        Objects.equals(this.isPrepaid, binData.isPrepaid) &&
        Objects.equals(this.cardClass, binData.cardClass) &&
        Objects.equals(this.productId, binData.productId) &&
        Objects.equals(this.issuerBankName, binData.issuerBankName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binNumber, cardBrand, issuingCountryIsoNumber, cardType, isPrepaid, cardClass, productId, issuerBankName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinData {\n");
    
    
    sb.append("    binNumber: ").append(toIndentedString(binNumber)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    issuingCountryIsoNumber: ").append(toIndentedString(issuingCountryIsoNumber)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    isPrepaid: ").append(toIndentedString(isPrepaid)).append("\n");
    sb.append("    cardClass: ").append(toIndentedString(cardClass)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    issuerBankName: ").append(toIndentedString(issuerBankName)).append("\n");
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

