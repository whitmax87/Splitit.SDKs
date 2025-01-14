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
import com.splitit.sdk.model.AmountDetails;
import com.splitit.sdk.model.ItemData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CartData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-02T10:18:45.756Z")
public class CartData  {
  @SerializedName("Items")
  private List<ItemData> items = null;

  @SerializedName("AmountDetails")
  private AmountDetails amountDetails = null;

  public CartData items(List<ItemData> items) {
    this.items = items;
    return this;
  }

  public CartData addItemsItem(ItemData itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemData>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<ItemData> getItems() {
    return items;
  }

  public void setItems(List<ItemData> items) {
    this.items = items;
  }

  public CartData amountDetails(AmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public AmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(AmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartData cartData = (CartData) o;
    return Objects.equals(this.items, cartData.items) &&
        Objects.equals(this.amountDetails, cartData.amountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, amountDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartData {\n");
    
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
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

