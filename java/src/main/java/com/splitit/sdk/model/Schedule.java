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
import com.splitit.sdk.model.ScheduleElements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Schedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-31T11:14:42.224Z")
public class Schedule  {
  @SerializedName("NumberOfInstallments")
  private Integer numberOfInstallments = null;

  @SerializedName("Deposit")
  private Boolean deposit = null;

  @SerializedName("Elements")
  private List<ScheduleElements> elements = null;

  public Schedule numberOfInstallments(Integer numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
    return this;
  }

   /**
   * Get numberOfInstallments
   * @return numberOfInstallments
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getNumberOfInstallments() {
    return numberOfInstallments;
  }

  public void setNumberOfInstallments(Integer numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }

  public Schedule deposit(Boolean deposit) {
    this.deposit = deposit;
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isDeposit() {
    return deposit;
  }

  public void setDeposit(Boolean deposit) {
    this.deposit = deposit;
  }

  public Schedule elements(List<ScheduleElements> elements) {
    this.elements = elements;
    return this;
  }

  public Schedule addElementsItem(ScheduleElements elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<ScheduleElements>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Get elements
   * @return elements
  **/
  @ApiModelProperty(value = "")
  public List<ScheduleElements> getElements() {
    return elements;
  }

  public void setElements(List<ScheduleElements> elements) {
    this.elements = elements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.numberOfInstallments, schedule.numberOfInstallments) &&
        Objects.equals(this.deposit, schedule.deposit) &&
        Objects.equals(this.elements, schedule.elements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfInstallments, deposit, elements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    
    sb.append("    numberOfInstallments: ").append(toIndentedString(numberOfInstallments)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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

