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
import com.splitit.sdk.model.AddressData2;
import com.splitit.sdk.model.Cards;
import com.splitit.sdk.model.Countries;
import com.splitit.sdk.model.CountrySubdivisions;
import com.splitit.sdk.model.EntityBase;
import com.splitit.sdk.model.Installments;
import com.splitit.sdk.model.ReAuthorizations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CardStateLogs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-06T09:33:27.783Z")
public class CardStateLogs  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("CardId")
  private Long cardId = null;

  @SerializedName("ExpirationMonth")
  private Integer expirationMonth = null;

  @SerializedName("ExpirationYear")
  private Integer expirationYear = null;

  @SerializedName("CardHolderName")
  private String cardHolderName = null;

  @SerializedName("AddressDataAddressLine")
  private String addressDataAddressLine = null;

  @SerializedName("AddressDataZip")
  private String addressDataZip = null;

  @SerializedName("Version")
  private Integer version = null;

  @SerializedName("IsVerified")
  private Boolean isVerified = null;

  @SerializedName("ChangeSource")
  private String changeSource = null;

  @SerializedName("AddressDataAddressLine2")
  private String addressDataAddressLine2 = null;

  @SerializedName("AddressDataCity")
  private String addressDataCity = null;

  @SerializedName("AddressDataCountryId")
  private Long addressDataCountryId = null;

  @SerializedName("AddressDataStateId")
  private Long addressDataStateId = null;

  @SerializedName("AddressDataLegacyFullAddressLine")
  private String addressDataLegacyFullAddressLine = null;

  @SerializedName("Card")
  private Cards card = null;

  @SerializedName("Country")
  private Countries country = null;

  @SerializedName("State")
  private CountrySubdivisions state = null;

  @SerializedName("Installments")
  private List<Installments> installments = null;

  @SerializedName("ReAuthorizations")
  private List<ReAuthorizations> reAuthorizations = null;

  @SerializedName("AddressData")
  private AddressData2 addressData = null;

  public CardStateLogs id(Long id) {
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

  public CardStateLogs cardId(Long cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Get cardId
   * @return cardId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCardId() {
    return cardId;
  }

  public void setCardId(Long cardId) {
    this.cardId = cardId;
  }

  public CardStateLogs expirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Get expirationMonth
   * @return expirationMonth
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public CardStateLogs expirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Get expirationYear
   * @return expirationYear
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
  }

  public CardStateLogs cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Get cardHolderName
   * @return cardHolderName
  **/
  @ApiModelProperty(value = "")
  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public CardStateLogs addressDataAddressLine(String addressDataAddressLine) {
    this.addressDataAddressLine = addressDataAddressLine;
    return this;
  }

   /**
   * Get addressDataAddressLine
   * @return addressDataAddressLine
  **/
  @ApiModelProperty(value = "")
  public String getAddressDataAddressLine() {
    return addressDataAddressLine;
  }

  public void setAddressDataAddressLine(String addressDataAddressLine) {
    this.addressDataAddressLine = addressDataAddressLine;
  }

  public CardStateLogs addressDataZip(String addressDataZip) {
    this.addressDataZip = addressDataZip;
    return this;
  }

   /**
   * Get addressDataZip
   * @return addressDataZip
  **/
  @ApiModelProperty(value = "")
  public String getAddressDataZip() {
    return addressDataZip;
  }

  public void setAddressDataZip(String addressDataZip) {
    this.addressDataZip = addressDataZip;
  }

  public CardStateLogs version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public CardStateLogs isVerified(Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Get isVerified
   * @return isVerified
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsVerified() {
    return isVerified;
  }

  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }

  public CardStateLogs changeSource(String changeSource) {
    this.changeSource = changeSource;
    return this;
  }

   /**
   * Get changeSource
   * @return changeSource
  **/
  @ApiModelProperty(value = "")
  public String getChangeSource() {
    return changeSource;
  }

  public void setChangeSource(String changeSource) {
    this.changeSource = changeSource;
  }

  public CardStateLogs addressDataAddressLine2(String addressDataAddressLine2) {
    this.addressDataAddressLine2 = addressDataAddressLine2;
    return this;
  }

   /**
   * Get addressDataAddressLine2
   * @return addressDataAddressLine2
  **/
  @ApiModelProperty(value = "")
  public String getAddressDataAddressLine2() {
    return addressDataAddressLine2;
  }

  public void setAddressDataAddressLine2(String addressDataAddressLine2) {
    this.addressDataAddressLine2 = addressDataAddressLine2;
  }

  public CardStateLogs addressDataCity(String addressDataCity) {
    this.addressDataCity = addressDataCity;
    return this;
  }

   /**
   * Get addressDataCity
   * @return addressDataCity
  **/
  @ApiModelProperty(value = "")
  public String getAddressDataCity() {
    return addressDataCity;
  }

  public void setAddressDataCity(String addressDataCity) {
    this.addressDataCity = addressDataCity;
  }

  public CardStateLogs addressDataCountryId(Long addressDataCountryId) {
    this.addressDataCountryId = addressDataCountryId;
    return this;
  }

   /**
   * Get addressDataCountryId
   * @return addressDataCountryId
  **/
  @ApiModelProperty(value = "")
  public Long getAddressDataCountryId() {
    return addressDataCountryId;
  }

  public void setAddressDataCountryId(Long addressDataCountryId) {
    this.addressDataCountryId = addressDataCountryId;
  }

  public CardStateLogs addressDataStateId(Long addressDataStateId) {
    this.addressDataStateId = addressDataStateId;
    return this;
  }

   /**
   * Get addressDataStateId
   * @return addressDataStateId
  **/
  @ApiModelProperty(value = "")
  public Long getAddressDataStateId() {
    return addressDataStateId;
  }

  public void setAddressDataStateId(Long addressDataStateId) {
    this.addressDataStateId = addressDataStateId;
  }

  public CardStateLogs addressDataLegacyFullAddressLine(String addressDataLegacyFullAddressLine) {
    this.addressDataLegacyFullAddressLine = addressDataLegacyFullAddressLine;
    return this;
  }

   /**
   * Get addressDataLegacyFullAddressLine
   * @return addressDataLegacyFullAddressLine
  **/
  @ApiModelProperty(value = "")
  public String getAddressDataLegacyFullAddressLine() {
    return addressDataLegacyFullAddressLine;
  }

  public void setAddressDataLegacyFullAddressLine(String addressDataLegacyFullAddressLine) {
    this.addressDataLegacyFullAddressLine = addressDataLegacyFullAddressLine;
  }

  public CardStateLogs card(Cards card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Cards getCard() {
    return card;
  }

  public void setCard(Cards card) {
    this.card = card;
  }

  public CardStateLogs country(Countries country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public Countries getCountry() {
    return country;
  }

  public void setCountry(Countries country) {
    this.country = country;
  }

  public CardStateLogs state(CountrySubdivisions state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CountrySubdivisions getState() {
    return state;
  }

  public void setState(CountrySubdivisions state) {
    this.state = state;
  }

  public CardStateLogs installments(List<Installments> installments) {
    this.installments = installments;
    return this;
  }

  public CardStateLogs addInstallmentsItem(Installments installmentsItem) {
    if (this.installments == null) {
      this.installments = new ArrayList<Installments>();
    }
    this.installments.add(installmentsItem);
    return this;
  }

   /**
   * Get installments
   * @return installments
  **/
  @ApiModelProperty(value = "")
  public List<Installments> getInstallments() {
    return installments;
  }

  public void setInstallments(List<Installments> installments) {
    this.installments = installments;
  }

  public CardStateLogs reAuthorizations(List<ReAuthorizations> reAuthorizations) {
    this.reAuthorizations = reAuthorizations;
    return this;
  }

  public CardStateLogs addReAuthorizationsItem(ReAuthorizations reAuthorizationsItem) {
    if (this.reAuthorizations == null) {
      this.reAuthorizations = new ArrayList<ReAuthorizations>();
    }
    this.reAuthorizations.add(reAuthorizationsItem);
    return this;
  }

   /**
   * Get reAuthorizations
   * @return reAuthorizations
  **/
  @ApiModelProperty(value = "")
  public List<ReAuthorizations> getReAuthorizations() {
    return reAuthorizations;
  }

  public void setReAuthorizations(List<ReAuthorizations> reAuthorizations) {
    this.reAuthorizations = reAuthorizations;
  }

  public CardStateLogs addressData(AddressData2 addressData) {
    this.addressData = addressData;
    return this;
  }

   /**
   * Get addressData
   * @return addressData
  **/
  @ApiModelProperty(value = "")
  public AddressData2 getAddressData() {
    return addressData;
  }

  public void setAddressData(AddressData2 addressData) {
    this.addressData = addressData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardStateLogs cardStateLogs = (CardStateLogs) o;
    return Objects.equals(this.id, cardStateLogs.id) &&
        Objects.equals(this.cardId, cardStateLogs.cardId) &&
        Objects.equals(this.expirationMonth, cardStateLogs.expirationMonth) &&
        Objects.equals(this.expirationYear, cardStateLogs.expirationYear) &&
        Objects.equals(this.cardHolderName, cardStateLogs.cardHolderName) &&
        Objects.equals(this.addressDataAddressLine, cardStateLogs.addressDataAddressLine) &&
        Objects.equals(this.addressDataZip, cardStateLogs.addressDataZip) &&
        Objects.equals(this.version, cardStateLogs.version) &&
        Objects.equals(this.isVerified, cardStateLogs.isVerified) &&
        Objects.equals(this.changeSource, cardStateLogs.changeSource) &&
        Objects.equals(this.addressDataAddressLine2, cardStateLogs.addressDataAddressLine2) &&
        Objects.equals(this.addressDataCity, cardStateLogs.addressDataCity) &&
        Objects.equals(this.addressDataCountryId, cardStateLogs.addressDataCountryId) &&
        Objects.equals(this.addressDataStateId, cardStateLogs.addressDataStateId) &&
        Objects.equals(this.addressDataLegacyFullAddressLine, cardStateLogs.addressDataLegacyFullAddressLine) &&
        Objects.equals(this.card, cardStateLogs.card) &&
        Objects.equals(this.country, cardStateLogs.country) &&
        Objects.equals(this.state, cardStateLogs.state) &&
        Objects.equals(this.installments, cardStateLogs.installments) &&
        Objects.equals(this.reAuthorizations, cardStateLogs.reAuthorizations) &&
        Objects.equals(this.addressData, cardStateLogs.addressData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardId, expirationMonth, expirationYear, cardHolderName, addressDataAddressLine, addressDataZip, version, isVerified, changeSource, addressDataAddressLine2, addressDataCity, addressDataCountryId, addressDataStateId, addressDataLegacyFullAddressLine, card, country, state, installments, reAuthorizations, addressData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardStateLogs {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    addressDataAddressLine: ").append(toIndentedString(addressDataAddressLine)).append("\n");
    sb.append("    addressDataZip: ").append(toIndentedString(addressDataZip)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    changeSource: ").append(toIndentedString(changeSource)).append("\n");
    sb.append("    addressDataAddressLine2: ").append(toIndentedString(addressDataAddressLine2)).append("\n");
    sb.append("    addressDataCity: ").append(toIndentedString(addressDataCity)).append("\n");
    sb.append("    addressDataCountryId: ").append(toIndentedString(addressDataCountryId)).append("\n");
    sb.append("    addressDataStateId: ").append(toIndentedString(addressDataStateId)).append("\n");
    sb.append("    addressDataLegacyFullAddressLine: ").append(toIndentedString(addressDataLegacyFullAddressLine)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    reAuthorizations: ").append(toIndentedString(reAuthorizations)).append("\n");
    sb.append("    addressData: ").append(toIndentedString(addressData)).append("\n");
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

