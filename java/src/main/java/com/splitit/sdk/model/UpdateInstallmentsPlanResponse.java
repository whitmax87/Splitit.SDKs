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
import com.splitit.sdk.model.InstallmentPlan;
import com.splitit.sdk.model.InstallmentPlanResponse;
import com.splitit.sdk.model.ResponseHeader;
import com.splitit.sdk.model.TransactionResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateInstallmentsPlanResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-29T14:12:31.625Z")
public class UpdateInstallmentsPlanResponse   {
  @SerializedName("ResponseHeader")
  private ResponseHeader responseHeader = null;

  @SerializedName("InstallmentPlan")
  private InstallmentPlan installmentPlan = null;

  @SerializedName("GatewayTransactionResults")
  private List<TransactionResult> gatewayTransactionResults = null;

  @SerializedName("ApprovalUrl")
  private String approvalUrl = null;

  public UpdateInstallmentsPlanResponse responseHeader(ResponseHeader responseHeader) {
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

  public UpdateInstallmentsPlanResponse installmentPlan(InstallmentPlan installmentPlan) {
    this.installmentPlan = installmentPlan;
    return this;
  }

   /**
   * Get installmentPlan
   * @return installmentPlan
  **/
  @ApiModelProperty(value = "")
  public InstallmentPlan getInstallmentPlan() {
    return installmentPlan;
  }

  public void setInstallmentPlan(InstallmentPlan installmentPlan) {
    this.installmentPlan = installmentPlan;
  }

  public UpdateInstallmentsPlanResponse gatewayTransactionResults(List<TransactionResult> gatewayTransactionResults) {
    this.gatewayTransactionResults = gatewayTransactionResults;
    return this;
  }

  public UpdateInstallmentsPlanResponse addGatewayTransactionResultsItem(TransactionResult gatewayTransactionResultsItem) {
    if (this.gatewayTransactionResults == null) {
      this.gatewayTransactionResults = new ArrayList<TransactionResult>();
    }
    this.gatewayTransactionResults.add(gatewayTransactionResultsItem);
    return this;
  }

   /**
   * Get gatewayTransactionResults
   * @return gatewayTransactionResults
  **/
  @ApiModelProperty(value = "")
  public List<TransactionResult> getGatewayTransactionResults() {
    return gatewayTransactionResults;
  }

  public void setGatewayTransactionResults(List<TransactionResult> gatewayTransactionResults) {
    this.gatewayTransactionResults = gatewayTransactionResults;
  }

  public UpdateInstallmentsPlanResponse approvalUrl(String approvalUrl) {
    this.approvalUrl = approvalUrl;
    return this;
  }

   /**
   * Get approvalUrl
   * @return approvalUrl
  **/
  @ApiModelProperty(value = "")
  public String getApprovalUrl() {
    return approvalUrl;
  }

  public void setApprovalUrl(String approvalUrl) {
    this.approvalUrl = approvalUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInstallmentsPlanResponse updateInstallmentsPlanResponse = (UpdateInstallmentsPlanResponse) o;
    return Objects.equals(this.responseHeader, updateInstallmentsPlanResponse.responseHeader) &&
        Objects.equals(this.installmentPlan, updateInstallmentsPlanResponse.installmentPlan) &&
        Objects.equals(this.gatewayTransactionResults, updateInstallmentsPlanResponse.gatewayTransactionResults) &&
        Objects.equals(this.approvalUrl, updateInstallmentsPlanResponse.approvalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, installmentPlan, gatewayTransactionResults, approvalUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInstallmentsPlanResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    installmentPlan: ").append(toIndentedString(installmentPlan)).append("\n");
    sb.append("    gatewayTransactionResults: ").append(toIndentedString(gatewayTransactionResults)).append("\n");
    sb.append("    approvalUrl: ").append(toIndentedString(approvalUrl)).append("\n");
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

