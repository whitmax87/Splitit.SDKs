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
import com.splitit.sdk.model.InstallmentPlanQueryCriteria;
import com.splitit.sdk.model.PagingRequestHeader;
import com.splitit.sdk.model.RelationsLoad;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetInstallmentsPlanSearchCriteriaRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-10T18:07:01.900Z")
public class GetInstallmentsPlanSearchCriteriaRequest   extends RequestWithHeader  {
  @SerializedName("QueryCriteria")
  private InstallmentPlanQueryCriteria queryCriteria = null;

  @SerializedName("LoadRelated")
  private RelationsLoad loadRelated = null;

  @SerializedName("PagingRequest")
  private PagingRequestHeader pagingRequest = null;

  public GetInstallmentsPlanSearchCriteriaRequest queryCriteria(InstallmentPlanQueryCriteria queryCriteria) {
    this.queryCriteria = queryCriteria;
    return this;
  }

   /**
   * Get queryCriteria
   * @return queryCriteria
  **/
  @ApiModelProperty(value = "")
  public InstallmentPlanQueryCriteria getQueryCriteria() {
    return queryCriteria;
  }

  public void setQueryCriteria(InstallmentPlanQueryCriteria queryCriteria) {
    this.queryCriteria = queryCriteria;
  }

  public GetInstallmentsPlanSearchCriteriaRequest loadRelated(RelationsLoad loadRelated) {
    this.loadRelated = loadRelated;
    return this;
  }

   /**
   * Get loadRelated
   * @return loadRelated
  **/
  @ApiModelProperty(value = "")
  public RelationsLoad getLoadRelated() {
    return loadRelated;
  }

  public void setLoadRelated(RelationsLoad loadRelated) {
    this.loadRelated = loadRelated;
  }

  public GetInstallmentsPlanSearchCriteriaRequest pagingRequest(PagingRequestHeader pagingRequest) {
    this.pagingRequest = pagingRequest;
    return this;
  }

   /**
   * Get pagingRequest
   * @return pagingRequest
  **/
  @ApiModelProperty(value = "")
  public PagingRequestHeader getPagingRequest() {
    return pagingRequest;
  }

  public void setPagingRequest(PagingRequestHeader pagingRequest) {
    this.pagingRequest = pagingRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInstallmentsPlanSearchCriteriaRequest getInstallmentsPlanSearchCriteriaRequest = (GetInstallmentsPlanSearchCriteriaRequest) o;
    return Objects.equals(this.queryCriteria, getInstallmentsPlanSearchCriteriaRequest.queryCriteria) &&
        Objects.equals(this.loadRelated, getInstallmentsPlanSearchCriteriaRequest.loadRelated) &&
        Objects.equals(this.pagingRequest, getInstallmentsPlanSearchCriteriaRequest.pagingRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryCriteria, loadRelated, pagingRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstallmentsPlanSearchCriteriaRequest {\n");
    
    sb.append("    queryCriteria: ").append(toIndentedString(queryCriteria)).append("\n");
    sb.append("    loadRelated: ").append(toIndentedString(loadRelated)).append("\n");
    sb.append("    pagingRequest: ").append(toIndentedString(pagingRequest)).append("\n");
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

