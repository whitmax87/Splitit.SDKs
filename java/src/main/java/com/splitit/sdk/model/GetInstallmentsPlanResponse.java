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
import com.splitit.sdk.model.PagingResponseHeader;
import com.splitit.sdk.model.ResponseHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetInstallmentsPlanResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T07:38:48.509Z")
public class GetInstallmentsPlanResponse  {
  @SerializedName("PlansList")
  private List<InstallmentPlan> plansList = null;

  @SerializedName("ResponseHeader")
  private ResponseHeader responseHeader = null;

  @SerializedName("PagingResponseHeader")
  private PagingResponseHeader pagingResponseHeader = null;

  public GetInstallmentsPlanResponse plansList(List<InstallmentPlan> plansList) {
    this.plansList = plansList;
    return this;
  }

  public GetInstallmentsPlanResponse addPlansListItem(InstallmentPlan plansListItem) {
    if (this.plansList == null) {
      this.plansList = new ArrayList<InstallmentPlan>();
    }
    this.plansList.add(plansListItem);
    return this;
  }

   /**
   * Get plansList
   * @return plansList
  **/
  @ApiModelProperty(value = "")
  public List<InstallmentPlan> getPlansList() {
    return plansList;
  }

  public void setPlansList(List<InstallmentPlan> plansList) {
    this.plansList = plansList;
  }

  public GetInstallmentsPlanResponse responseHeader(ResponseHeader responseHeader) {
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

  public GetInstallmentsPlanResponse pagingResponseHeader(PagingResponseHeader pagingResponseHeader) {
    this.pagingResponseHeader = pagingResponseHeader;
    return this;
  }

   /**
   * Get pagingResponseHeader
   * @return pagingResponseHeader
  **/
  @ApiModelProperty(value = "")
  public PagingResponseHeader getPagingResponseHeader() {
    return pagingResponseHeader;
  }

  public void setPagingResponseHeader(PagingResponseHeader pagingResponseHeader) {
    this.pagingResponseHeader = pagingResponseHeader;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInstallmentsPlanResponse getInstallmentsPlanResponse = (GetInstallmentsPlanResponse) o;
    return Objects.equals(this.plansList, getInstallmentsPlanResponse.plansList) &&
        Objects.equals(this.responseHeader, getInstallmentsPlanResponse.responseHeader) &&
        Objects.equals(this.pagingResponseHeader, getInstallmentsPlanResponse.pagingResponseHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plansList, responseHeader, pagingResponseHeader);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstallmentsPlanResponse {\n");
    
    
    sb.append("    plansList: ").append(toIndentedString(plansList)).append("\n");
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    pagingResponseHeader: ").append(toIndentedString(pagingResponseHeader)).append("\n");
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

