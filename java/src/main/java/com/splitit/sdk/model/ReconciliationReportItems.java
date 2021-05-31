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
import com.splitit.sdk.model.OperationType;
import com.splitit.sdk.model.ProcessorType;
import com.splitit.sdk.model.ReconciliationReports;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ReconciliationReportItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class ReconciliationReportItems  {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("GatewayAmount")
  private BigDecimal gatewayAmount = null;

  @SerializedName("GatewayCount")
  private Integer gatewayCount = null;

  @SerializedName("Pisamount")
  private BigDecimal pisamount = null;

  @SerializedName("Piscount")
  private Integer piscount = null;

  @SerializedName("IsIdentical")
  private Boolean isIdentical = null;

  @SerializedName("ReconciliationReportId")
  private Long reconciliationReportId = null;

  @SerializedName("ReconciliationReport")
  private ReconciliationReports reconciliationReport = null;

  @SerializedName("TransactionType")
  private OperationType transactionType = null;

  @SerializedName("GatewayType")
  private ProcessorType gatewayType = null;

  public ReconciliationReportItems id(Long id) {
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

  public ReconciliationReportItems gatewayAmount(BigDecimal gatewayAmount) {
    this.gatewayAmount = gatewayAmount;
    return this;
  }

   /**
   * Get gatewayAmount
   * @return gatewayAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getGatewayAmount() {
    return gatewayAmount;
  }

  public void setGatewayAmount(BigDecimal gatewayAmount) {
    this.gatewayAmount = gatewayAmount;
  }

  public ReconciliationReportItems gatewayCount(Integer gatewayCount) {
    this.gatewayCount = gatewayCount;
    return this;
  }

   /**
   * Get gatewayCount
   * @return gatewayCount
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getGatewayCount() {
    return gatewayCount;
  }

  public void setGatewayCount(Integer gatewayCount) {
    this.gatewayCount = gatewayCount;
  }

  public ReconciliationReportItems pisamount(BigDecimal pisamount) {
    this.pisamount = pisamount;
    return this;
  }

   /**
   * Get pisamount
   * @return pisamount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPisamount() {
    return pisamount;
  }

  public void setPisamount(BigDecimal pisamount) {
    this.pisamount = pisamount;
  }

  public ReconciliationReportItems piscount(Integer piscount) {
    this.piscount = piscount;
    return this;
  }

   /**
   * Get piscount
   * @return piscount
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPiscount() {
    return piscount;
  }

  public void setPiscount(Integer piscount) {
    this.piscount = piscount;
  }

  public ReconciliationReportItems isIdentical(Boolean isIdentical) {
    this.isIdentical = isIdentical;
    return this;
  }

   /**
   * Get isIdentical
   * @return isIdentical
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsIdentical() {
    return isIdentical;
  }

  public void setIsIdentical(Boolean isIdentical) {
    this.isIdentical = isIdentical;
  }

  public ReconciliationReportItems reconciliationReportId(Long reconciliationReportId) {
    this.reconciliationReportId = reconciliationReportId;
    return this;
  }

   /**
   * Get reconciliationReportId
   * @return reconciliationReportId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getReconciliationReportId() {
    return reconciliationReportId;
  }

  public void setReconciliationReportId(Long reconciliationReportId) {
    this.reconciliationReportId = reconciliationReportId;
  }

  public ReconciliationReportItems reconciliationReport(ReconciliationReports reconciliationReport) {
    this.reconciliationReport = reconciliationReport;
    return this;
  }

   /**
   * Get reconciliationReport
   * @return reconciliationReport
  **/
  @ApiModelProperty(value = "")
  public ReconciliationReports getReconciliationReport() {
    return reconciliationReport;
  }

  public void setReconciliationReport(ReconciliationReports reconciliationReport) {
    this.reconciliationReport = reconciliationReport;
  }

  public ReconciliationReportItems transactionType(OperationType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "")
  public OperationType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(OperationType transactionType) {
    this.transactionType = transactionType;
  }

  public ReconciliationReportItems gatewayType(ProcessorType gatewayType) {
    this.gatewayType = gatewayType;
    return this;
  }

   /**
   * Get gatewayType
   * @return gatewayType
  **/
  @ApiModelProperty(required = true, value = "")
  public ProcessorType getGatewayType() {
    return gatewayType;
  }

  public void setGatewayType(ProcessorType gatewayType) {
    this.gatewayType = gatewayType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReconciliationReportItems reconciliationReportItems = (ReconciliationReportItems) o;
    return Objects.equals(this.id, reconciliationReportItems.id) &&
        Objects.equals(this.gatewayAmount, reconciliationReportItems.gatewayAmount) &&
        Objects.equals(this.gatewayCount, reconciliationReportItems.gatewayCount) &&
        Objects.equals(this.pisamount, reconciliationReportItems.pisamount) &&
        Objects.equals(this.piscount, reconciliationReportItems.piscount) &&
        Objects.equals(this.isIdentical, reconciliationReportItems.isIdentical) &&
        Objects.equals(this.reconciliationReportId, reconciliationReportItems.reconciliationReportId) &&
        Objects.equals(this.reconciliationReport, reconciliationReportItems.reconciliationReport) &&
        Objects.equals(this.transactionType, reconciliationReportItems.transactionType) &&
        Objects.equals(this.gatewayType, reconciliationReportItems.gatewayType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gatewayAmount, gatewayCount, pisamount, piscount, isIdentical, reconciliationReportId, reconciliationReport, transactionType, gatewayType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReconciliationReportItems {\n");
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gatewayAmount: ").append(toIndentedString(gatewayAmount)).append("\n");
    sb.append("    gatewayCount: ").append(toIndentedString(gatewayCount)).append("\n");
    sb.append("    pisamount: ").append(toIndentedString(pisamount)).append("\n");
    sb.append("    piscount: ").append(toIndentedString(piscount)).append("\n");
    sb.append("    isIdentical: ").append(toIndentedString(isIdentical)).append("\n");
    sb.append("    reconciliationReportId: ").append(toIndentedString(reconciliationReportId)).append("\n");
    sb.append("    reconciliationReport: ").append(toIndentedString(reconciliationReport)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    gatewayType: ").append(toIndentedString(gatewayType)).append("\n");
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

