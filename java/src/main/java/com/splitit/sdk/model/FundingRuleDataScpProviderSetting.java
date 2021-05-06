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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * FundingRuleDataScpProviderSetting
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-06T09:33:27.783Z")
public class FundingRuleDataScpProviderSetting  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("ScpProviderId")
  private Long scpProviderId = null;

  @SerializedName("FundingRuleDataId")
  private Long fundingRuleDataId = null;

  @SerializedName("CreditLine")
  private BigDecimal creditLine = null;

  @SerializedName("EffectiveScpRevenueSharePercent")
  private BigDecimal effectiveScpRevenueSharePercent = null;

  @SerializedName("EffectiveScpVariableCostApr")
  private BigDecimal effectiveScpVariableCostApr = null;

  @SerializedName("IsSecondary")
  private Boolean isSecondary = null;

  @SerializedName("RotationWeight")
  private Double rotationWeight = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  public FundingRuleDataScpProviderSetting id(Long id) {
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

  public FundingRuleDataScpProviderSetting scpProviderId(Long scpProviderId) {
    this.scpProviderId = scpProviderId;
    return this;
  }

   /**
   * Get scpProviderId
   * @return scpProviderId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getScpProviderId() {
    return scpProviderId;
  }

  public void setScpProviderId(Long scpProviderId) {
    this.scpProviderId = scpProviderId;
  }

  public FundingRuleDataScpProviderSetting fundingRuleDataId(Long fundingRuleDataId) {
    this.fundingRuleDataId = fundingRuleDataId;
    return this;
  }

   /**
   * Get fundingRuleDataId
   * @return fundingRuleDataId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getFundingRuleDataId() {
    return fundingRuleDataId;
  }

  public void setFundingRuleDataId(Long fundingRuleDataId) {
    this.fundingRuleDataId = fundingRuleDataId;
  }

  public FundingRuleDataScpProviderSetting creditLine(BigDecimal creditLine) {
    this.creditLine = creditLine;
    return this;
  }

   /**
   * Get creditLine
   * @return creditLine
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(BigDecimal creditLine) {
    this.creditLine = creditLine;
  }

  public FundingRuleDataScpProviderSetting effectiveScpRevenueSharePercent(BigDecimal effectiveScpRevenueSharePercent) {
    this.effectiveScpRevenueSharePercent = effectiveScpRevenueSharePercent;
    return this;
  }

   /**
   * Get effectiveScpRevenueSharePercent
   * @return effectiveScpRevenueSharePercent
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getEffectiveScpRevenueSharePercent() {
    return effectiveScpRevenueSharePercent;
  }

  public void setEffectiveScpRevenueSharePercent(BigDecimal effectiveScpRevenueSharePercent) {
    this.effectiveScpRevenueSharePercent = effectiveScpRevenueSharePercent;
  }

  public FundingRuleDataScpProviderSetting effectiveScpVariableCostApr(BigDecimal effectiveScpVariableCostApr) {
    this.effectiveScpVariableCostApr = effectiveScpVariableCostApr;
    return this;
  }

   /**
   * Get effectiveScpVariableCostApr
   * @return effectiveScpVariableCostApr
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getEffectiveScpVariableCostApr() {
    return effectiveScpVariableCostApr;
  }

  public void setEffectiveScpVariableCostApr(BigDecimal effectiveScpVariableCostApr) {
    this.effectiveScpVariableCostApr = effectiveScpVariableCostApr;
  }

  public FundingRuleDataScpProviderSetting isSecondary(Boolean isSecondary) {
    this.isSecondary = isSecondary;
    return this;
  }

   /**
   * Get isSecondary
   * @return isSecondary
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsSecondary() {
    return isSecondary;
  }

  public void setIsSecondary(Boolean isSecondary) {
    this.isSecondary = isSecondary;
  }

  public FundingRuleDataScpProviderSetting rotationWeight(Double rotationWeight) {
    this.rotationWeight = rotationWeight;
    return this;
  }

   /**
   * Get rotationWeight
   * @return rotationWeight
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getRotationWeight() {
    return rotationWeight;
  }

  public void setRotationWeight(Double rotationWeight) {
    this.rotationWeight = rotationWeight;
  }

  public FundingRuleDataScpProviderSetting isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingRuleDataScpProviderSetting fundingRuleDataScpProviderSetting = (FundingRuleDataScpProviderSetting) o;
    return Objects.equals(this.id, fundingRuleDataScpProviderSetting.id) &&
        Objects.equals(this.scpProviderId, fundingRuleDataScpProviderSetting.scpProviderId) &&
        Objects.equals(this.fundingRuleDataId, fundingRuleDataScpProviderSetting.fundingRuleDataId) &&
        Objects.equals(this.creditLine, fundingRuleDataScpProviderSetting.creditLine) &&
        Objects.equals(this.effectiveScpRevenueSharePercent, fundingRuleDataScpProviderSetting.effectiveScpRevenueSharePercent) &&
        Objects.equals(this.effectiveScpVariableCostApr, fundingRuleDataScpProviderSetting.effectiveScpVariableCostApr) &&
        Objects.equals(this.isSecondary, fundingRuleDataScpProviderSetting.isSecondary) &&
        Objects.equals(this.rotationWeight, fundingRuleDataScpProviderSetting.rotationWeight) &&
        Objects.equals(this.isEnabled, fundingRuleDataScpProviderSetting.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scpProviderId, fundingRuleDataId, creditLine, effectiveScpRevenueSharePercent, effectiveScpVariableCostApr, isSecondary, rotationWeight, isEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingRuleDataScpProviderSetting {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scpProviderId: ").append(toIndentedString(scpProviderId)).append("\n");
    sb.append("    fundingRuleDataId: ").append(toIndentedString(fundingRuleDataId)).append("\n");
    sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
    sb.append("    effectiveScpRevenueSharePercent: ").append(toIndentedString(effectiveScpRevenueSharePercent)).append("\n");
    sb.append("    effectiveScpVariableCostApr: ").append(toIndentedString(effectiveScpVariableCostApr)).append("\n");
    sb.append("    isSecondary: ").append(toIndentedString(isSecondary)).append("\n");
    sb.append("    rotationWeight: ").append(toIndentedString(rotationWeight)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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

