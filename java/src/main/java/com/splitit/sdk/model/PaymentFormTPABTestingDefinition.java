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
import com.splitit.sdk.model.EntityBase;
import com.splitit.sdk.model.VersionedTouchPoints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentFormTPABTestingDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class PaymentFormTPABTestingDefinition  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("IsActive")
  private Boolean isActive = null;

  @SerializedName("AbTestName")
  private String abTestName = null;

  @SerializedName("PFVersionAId")
  private Long pfVersionAId = null;

  @SerializedName("PFVersionBId")
  private Long pfVersionBId = null;

  @SerializedName("AbTestDescription")
  private String abTestDescription = null;

  @SerializedName("PFVersionAPercentage")
  private Integer pfVersionAPercentage = null;

  @SerializedName("PFVersionBPercentage")
  private Integer pfVersionBPercentage = null;

  @SerializedName("PFVersionA")
  private VersionedTouchPoints pfVersionA = null;

  @SerializedName("PFVersionB")
  private VersionedTouchPoints pfVersionB = null;

  public PaymentFormTPABTestingDefinition id(Long id) {
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

  public PaymentFormTPABTestingDefinition isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public PaymentFormTPABTestingDefinition abTestName(String abTestName) {
    this.abTestName = abTestName;
    return this;
  }

   /**
   * Get abTestName
   * @return abTestName
  **/
  @ApiModelProperty(value = "")
  public String getAbTestName() {
    return abTestName;
  }

  public void setAbTestName(String abTestName) {
    this.abTestName = abTestName;
  }

  public PaymentFormTPABTestingDefinition pfVersionAId(Long pfVersionAId) {
    this.pfVersionAId = pfVersionAId;
    return this;
  }

   /**
   * Get pfVersionAId
   * @return pfVersionAId
  **/
  @ApiModelProperty(value = "")
  public Long getPfVersionAId() {
    return pfVersionAId;
  }

  public void setPfVersionAId(Long pfVersionAId) {
    this.pfVersionAId = pfVersionAId;
  }

  public PaymentFormTPABTestingDefinition pfVersionBId(Long pfVersionBId) {
    this.pfVersionBId = pfVersionBId;
    return this;
  }

   /**
   * Get pfVersionBId
   * @return pfVersionBId
  **/
  @ApiModelProperty(value = "")
  public Long getPfVersionBId() {
    return pfVersionBId;
  }

  public void setPfVersionBId(Long pfVersionBId) {
    this.pfVersionBId = pfVersionBId;
  }

  public PaymentFormTPABTestingDefinition abTestDescription(String abTestDescription) {
    this.abTestDescription = abTestDescription;
    return this;
  }

   /**
   * Get abTestDescription
   * @return abTestDescription
  **/
  @ApiModelProperty(value = "")
  public String getAbTestDescription() {
    return abTestDescription;
  }

  public void setAbTestDescription(String abTestDescription) {
    this.abTestDescription = abTestDescription;
  }

  public PaymentFormTPABTestingDefinition pfVersionAPercentage(Integer pfVersionAPercentage) {
    this.pfVersionAPercentage = pfVersionAPercentage;
    return this;
  }

   /**
   * Get pfVersionAPercentage
   * @return pfVersionAPercentage
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPfVersionAPercentage() {
    return pfVersionAPercentage;
  }

  public void setPfVersionAPercentage(Integer pfVersionAPercentage) {
    this.pfVersionAPercentage = pfVersionAPercentage;
  }

  public PaymentFormTPABTestingDefinition pfVersionBPercentage(Integer pfVersionBPercentage) {
    this.pfVersionBPercentage = pfVersionBPercentage;
    return this;
  }

   /**
   * Get pfVersionBPercentage
   * @return pfVersionBPercentage
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPfVersionBPercentage() {
    return pfVersionBPercentage;
  }

  public void setPfVersionBPercentage(Integer pfVersionBPercentage) {
    this.pfVersionBPercentage = pfVersionBPercentage;
  }

  public PaymentFormTPABTestingDefinition pfVersionA(VersionedTouchPoints pfVersionA) {
    this.pfVersionA = pfVersionA;
    return this;
  }

   /**
   * Get pfVersionA
   * @return pfVersionA
  **/
  @ApiModelProperty(value = "")
  public VersionedTouchPoints getPfVersionA() {
    return pfVersionA;
  }

  public void setPfVersionA(VersionedTouchPoints pfVersionA) {
    this.pfVersionA = pfVersionA;
  }

  public PaymentFormTPABTestingDefinition pfVersionB(VersionedTouchPoints pfVersionB) {
    this.pfVersionB = pfVersionB;
    return this;
  }

   /**
   * Get pfVersionB
   * @return pfVersionB
  **/
  @ApiModelProperty(value = "")
  public VersionedTouchPoints getPfVersionB() {
    return pfVersionB;
  }

  public void setPfVersionB(VersionedTouchPoints pfVersionB) {
    this.pfVersionB = pfVersionB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentFormTPABTestingDefinition paymentFormTPABTestingDefinition = (PaymentFormTPABTestingDefinition) o;
    return Objects.equals(this.id, paymentFormTPABTestingDefinition.id) &&
        Objects.equals(this.isActive, paymentFormTPABTestingDefinition.isActive) &&
        Objects.equals(this.abTestName, paymentFormTPABTestingDefinition.abTestName) &&
        Objects.equals(this.pfVersionAId, paymentFormTPABTestingDefinition.pfVersionAId) &&
        Objects.equals(this.pfVersionBId, paymentFormTPABTestingDefinition.pfVersionBId) &&
        Objects.equals(this.abTestDescription, paymentFormTPABTestingDefinition.abTestDescription) &&
        Objects.equals(this.pfVersionAPercentage, paymentFormTPABTestingDefinition.pfVersionAPercentage) &&
        Objects.equals(this.pfVersionBPercentage, paymentFormTPABTestingDefinition.pfVersionBPercentage) &&
        Objects.equals(this.pfVersionA, paymentFormTPABTestingDefinition.pfVersionA) &&
        Objects.equals(this.pfVersionB, paymentFormTPABTestingDefinition.pfVersionB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isActive, abTestName, pfVersionAId, pfVersionBId, abTestDescription, pfVersionAPercentage, pfVersionBPercentage, pfVersionA, pfVersionB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentFormTPABTestingDefinition {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    abTestName: ").append(toIndentedString(abTestName)).append("\n");
    sb.append("    pfVersionAId: ").append(toIndentedString(pfVersionAId)).append("\n");
    sb.append("    pfVersionBId: ").append(toIndentedString(pfVersionBId)).append("\n");
    sb.append("    abTestDescription: ").append(toIndentedString(abTestDescription)).append("\n");
    sb.append("    pfVersionAPercentage: ").append(toIndentedString(pfVersionAPercentage)).append("\n");
    sb.append("    pfVersionBPercentage: ").append(toIndentedString(pfVersionBPercentage)).append("\n");
    sb.append("    pfVersionA: ").append(toIndentedString(pfVersionA)).append("\n");
    sb.append("    pfVersionB: ").append(toIndentedString(pfVersionB)).append("\n");
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

