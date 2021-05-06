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
import com.splitit.sdk.model.Currencies;
import com.splitit.sdk.model.EntityBase;
import com.splitit.sdk.model.ParameterGroups;
import com.splitit.sdk.model.ScpProvidersCurrencies;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ScpProviders
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-06T09:33:27.783Z")
public class ScpProviders  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ImplementationCode")
  private String implementationCode = null;

  @SerializedName("TotalFunds")
  private BigDecimal totalFunds = null;

  @SerializedName("MaxNonSecurePlansPercent")
  private BigDecimal maxNonSecurePlansPercent = null;

  @SerializedName("ScpVariableCostAnnualPercent")
  private BigDecimal scpVariableCostAnnualPercent = null;

  @SerializedName("ScpFixedCost")
  private BigDecimal scpFixedCost = null;

  @SerializedName("ScpRevenueSharePercent")
  private BigDecimal scpRevenueSharePercent = null;

  @SerializedName("TotalFundsCurrencyId")
  private Long totalFundsCurrencyId = null;

  @SerializedName("EmailsList")
  private String emailsList = null;

  @SerializedName("IsOperatedBySplitit")
  private Boolean isOperatedBySplitit = null;

  @SerializedName("IsFundingBySplitit")
  private Boolean isFundingBySplitit = null;

  @SerializedName("DeductRevenueShareAutomaticallyFromLastInstallment")
  private Boolean deductRevenueShareAutomaticallyFromLastInstallment = null;

  @SerializedName("FundFirstInstallment")
  private Boolean fundFirstInstallment = null;

  @SerializedName("TotalFundsCurrency")
  private Currencies totalFundsCurrency = null;

  @SerializedName("ParameterGroup")
  private ParameterGroups parameterGroup = null;

  @SerializedName("ScpProvidersCurrencies")
  private List<ScpProvidersCurrencies> scpProvidersCurrencies = null;

  public ScpProviders id(Long id) {
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

  public ScpProviders name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScpProviders implementationCode(String implementationCode) {
    this.implementationCode = implementationCode;
    return this;
  }

   /**
   * Get implementationCode
   * @return implementationCode
  **/
  @ApiModelProperty(value = "")
  public String getImplementationCode() {
    return implementationCode;
  }

  public void setImplementationCode(String implementationCode) {
    this.implementationCode = implementationCode;
  }

  public ScpProviders totalFunds(BigDecimal totalFunds) {
    this.totalFunds = totalFunds;
    return this;
  }

   /**
   * Get totalFunds
   * @return totalFunds
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTotalFunds() {
    return totalFunds;
  }

  public void setTotalFunds(BigDecimal totalFunds) {
    this.totalFunds = totalFunds;
  }

  public ScpProviders maxNonSecurePlansPercent(BigDecimal maxNonSecurePlansPercent) {
    this.maxNonSecurePlansPercent = maxNonSecurePlansPercent;
    return this;
  }

   /**
   * Get maxNonSecurePlansPercent
   * @return maxNonSecurePlansPercent
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getMaxNonSecurePlansPercent() {
    return maxNonSecurePlansPercent;
  }

  public void setMaxNonSecurePlansPercent(BigDecimal maxNonSecurePlansPercent) {
    this.maxNonSecurePlansPercent = maxNonSecurePlansPercent;
  }

  public ScpProviders scpVariableCostAnnualPercent(BigDecimal scpVariableCostAnnualPercent) {
    this.scpVariableCostAnnualPercent = scpVariableCostAnnualPercent;
    return this;
  }

   /**
   * Get scpVariableCostAnnualPercent
   * @return scpVariableCostAnnualPercent
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getScpVariableCostAnnualPercent() {
    return scpVariableCostAnnualPercent;
  }

  public void setScpVariableCostAnnualPercent(BigDecimal scpVariableCostAnnualPercent) {
    this.scpVariableCostAnnualPercent = scpVariableCostAnnualPercent;
  }

  public ScpProviders scpFixedCost(BigDecimal scpFixedCost) {
    this.scpFixedCost = scpFixedCost;
    return this;
  }

   /**
   * Get scpFixedCost
   * @return scpFixedCost
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getScpFixedCost() {
    return scpFixedCost;
  }

  public void setScpFixedCost(BigDecimal scpFixedCost) {
    this.scpFixedCost = scpFixedCost;
  }

  public ScpProviders scpRevenueSharePercent(BigDecimal scpRevenueSharePercent) {
    this.scpRevenueSharePercent = scpRevenueSharePercent;
    return this;
  }

   /**
   * Get scpRevenueSharePercent
   * @return scpRevenueSharePercent
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getScpRevenueSharePercent() {
    return scpRevenueSharePercent;
  }

  public void setScpRevenueSharePercent(BigDecimal scpRevenueSharePercent) {
    this.scpRevenueSharePercent = scpRevenueSharePercent;
  }

  public ScpProviders totalFundsCurrencyId(Long totalFundsCurrencyId) {
    this.totalFundsCurrencyId = totalFundsCurrencyId;
    return this;
  }

   /**
   * Get totalFundsCurrencyId
   * @return totalFundsCurrencyId
  **/
  @ApiModelProperty(value = "")
  public Long getTotalFundsCurrencyId() {
    return totalFundsCurrencyId;
  }

  public void setTotalFundsCurrencyId(Long totalFundsCurrencyId) {
    this.totalFundsCurrencyId = totalFundsCurrencyId;
  }

  public ScpProviders emailsList(String emailsList) {
    this.emailsList = emailsList;
    return this;
  }

   /**
   * Get emailsList
   * @return emailsList
  **/
  @ApiModelProperty(value = "")
  public String getEmailsList() {
    return emailsList;
  }

  public void setEmailsList(String emailsList) {
    this.emailsList = emailsList;
  }

  public ScpProviders isOperatedBySplitit(Boolean isOperatedBySplitit) {
    this.isOperatedBySplitit = isOperatedBySplitit;
    return this;
  }

   /**
   * Get isOperatedBySplitit
   * @return isOperatedBySplitit
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsOperatedBySplitit() {
    return isOperatedBySplitit;
  }

  public void setIsOperatedBySplitit(Boolean isOperatedBySplitit) {
    this.isOperatedBySplitit = isOperatedBySplitit;
  }

  public ScpProviders isFundingBySplitit(Boolean isFundingBySplitit) {
    this.isFundingBySplitit = isFundingBySplitit;
    return this;
  }

   /**
   * Get isFundingBySplitit
   * @return isFundingBySplitit
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsFundingBySplitit() {
    return isFundingBySplitit;
  }

  public void setIsFundingBySplitit(Boolean isFundingBySplitit) {
    this.isFundingBySplitit = isFundingBySplitit;
  }

  public ScpProviders deductRevenueShareAutomaticallyFromLastInstallment(Boolean deductRevenueShareAutomaticallyFromLastInstallment) {
    this.deductRevenueShareAutomaticallyFromLastInstallment = deductRevenueShareAutomaticallyFromLastInstallment;
    return this;
  }

   /**
   * Get deductRevenueShareAutomaticallyFromLastInstallment
   * @return deductRevenueShareAutomaticallyFromLastInstallment
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isDeductRevenueShareAutomaticallyFromLastInstallment() {
    return deductRevenueShareAutomaticallyFromLastInstallment;
  }

  public void setDeductRevenueShareAutomaticallyFromLastInstallment(Boolean deductRevenueShareAutomaticallyFromLastInstallment) {
    this.deductRevenueShareAutomaticallyFromLastInstallment = deductRevenueShareAutomaticallyFromLastInstallment;
  }

  public ScpProviders fundFirstInstallment(Boolean fundFirstInstallment) {
    this.fundFirstInstallment = fundFirstInstallment;
    return this;
  }

   /**
   * Get fundFirstInstallment
   * @return fundFirstInstallment
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isFundFirstInstallment() {
    return fundFirstInstallment;
  }

  public void setFundFirstInstallment(Boolean fundFirstInstallment) {
    this.fundFirstInstallment = fundFirstInstallment;
  }

  public ScpProviders totalFundsCurrency(Currencies totalFundsCurrency) {
    this.totalFundsCurrency = totalFundsCurrency;
    return this;
  }

   /**
   * Get totalFundsCurrency
   * @return totalFundsCurrency
  **/
  @ApiModelProperty(value = "")
  public Currencies getTotalFundsCurrency() {
    return totalFundsCurrency;
  }

  public void setTotalFundsCurrency(Currencies totalFundsCurrency) {
    this.totalFundsCurrency = totalFundsCurrency;
  }

  public ScpProviders parameterGroup(ParameterGroups parameterGroup) {
    this.parameterGroup = parameterGroup;
    return this;
  }

   /**
   * Get parameterGroup
   * @return parameterGroup
  **/
  @ApiModelProperty(value = "")
  public ParameterGroups getParameterGroup() {
    return parameterGroup;
  }

  public void setParameterGroup(ParameterGroups parameterGroup) {
    this.parameterGroup = parameterGroup;
  }

  public ScpProviders scpProvidersCurrencies(List<ScpProvidersCurrencies> scpProvidersCurrencies) {
    this.scpProvidersCurrencies = scpProvidersCurrencies;
    return this;
  }

  public ScpProviders addScpProvidersCurrenciesItem(ScpProvidersCurrencies scpProvidersCurrenciesItem) {
    if (this.scpProvidersCurrencies == null) {
      this.scpProvidersCurrencies = new ArrayList<ScpProvidersCurrencies>();
    }
    this.scpProvidersCurrencies.add(scpProvidersCurrenciesItem);
    return this;
  }

   /**
   * Get scpProvidersCurrencies
   * @return scpProvidersCurrencies
  **/
  @ApiModelProperty(value = "")
  public List<ScpProvidersCurrencies> getScpProvidersCurrencies() {
    return scpProvidersCurrencies;
  }

  public void setScpProvidersCurrencies(List<ScpProvidersCurrencies> scpProvidersCurrencies) {
    this.scpProvidersCurrencies = scpProvidersCurrencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScpProviders scpProviders = (ScpProviders) o;
    return Objects.equals(this.id, scpProviders.id) &&
        Objects.equals(this.name, scpProviders.name) &&
        Objects.equals(this.implementationCode, scpProviders.implementationCode) &&
        Objects.equals(this.totalFunds, scpProviders.totalFunds) &&
        Objects.equals(this.maxNonSecurePlansPercent, scpProviders.maxNonSecurePlansPercent) &&
        Objects.equals(this.scpVariableCostAnnualPercent, scpProviders.scpVariableCostAnnualPercent) &&
        Objects.equals(this.scpFixedCost, scpProviders.scpFixedCost) &&
        Objects.equals(this.scpRevenueSharePercent, scpProviders.scpRevenueSharePercent) &&
        Objects.equals(this.totalFundsCurrencyId, scpProviders.totalFundsCurrencyId) &&
        Objects.equals(this.emailsList, scpProviders.emailsList) &&
        Objects.equals(this.isOperatedBySplitit, scpProviders.isOperatedBySplitit) &&
        Objects.equals(this.isFundingBySplitit, scpProviders.isFundingBySplitit) &&
        Objects.equals(this.deductRevenueShareAutomaticallyFromLastInstallment, scpProviders.deductRevenueShareAutomaticallyFromLastInstallment) &&
        Objects.equals(this.fundFirstInstallment, scpProviders.fundFirstInstallment) &&
        Objects.equals(this.totalFundsCurrency, scpProviders.totalFundsCurrency) &&
        Objects.equals(this.parameterGroup, scpProviders.parameterGroup) &&
        Objects.equals(this.scpProvidersCurrencies, scpProviders.scpProvidersCurrencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, implementationCode, totalFunds, maxNonSecurePlansPercent, scpVariableCostAnnualPercent, scpFixedCost, scpRevenueSharePercent, totalFundsCurrencyId, emailsList, isOperatedBySplitit, isFundingBySplitit, deductRevenueShareAutomaticallyFromLastInstallment, fundFirstInstallment, totalFundsCurrency, parameterGroup, scpProvidersCurrencies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScpProviders {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    implementationCode: ").append(toIndentedString(implementationCode)).append("\n");
    sb.append("    totalFunds: ").append(toIndentedString(totalFunds)).append("\n");
    sb.append("    maxNonSecurePlansPercent: ").append(toIndentedString(maxNonSecurePlansPercent)).append("\n");
    sb.append("    scpVariableCostAnnualPercent: ").append(toIndentedString(scpVariableCostAnnualPercent)).append("\n");
    sb.append("    scpFixedCost: ").append(toIndentedString(scpFixedCost)).append("\n");
    sb.append("    scpRevenueSharePercent: ").append(toIndentedString(scpRevenueSharePercent)).append("\n");
    sb.append("    totalFundsCurrencyId: ").append(toIndentedString(totalFundsCurrencyId)).append("\n");
    sb.append("    emailsList: ").append(toIndentedString(emailsList)).append("\n");
    sb.append("    isOperatedBySplitit: ").append(toIndentedString(isOperatedBySplitit)).append("\n");
    sb.append("    isFundingBySplitit: ").append(toIndentedString(isFundingBySplitit)).append("\n");
    sb.append("    deductRevenueShareAutomaticallyFromLastInstallment: ").append(toIndentedString(deductRevenueShareAutomaticallyFromLastInstallment)).append("\n");
    sb.append("    fundFirstInstallment: ").append(toIndentedString(fundFirstInstallment)).append("\n");
    sb.append("    totalFundsCurrency: ").append(toIndentedString(totalFundsCurrency)).append("\n");
    sb.append("    parameterGroup: ").append(toIndentedString(parameterGroup)).append("\n");
    sb.append("    scpProvidersCurrencies: ").append(toIndentedString(scpProvidersCurrencies)).append("\n");
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

