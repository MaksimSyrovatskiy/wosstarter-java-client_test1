/*
 * Web of Science Lookup API
 * Web of Science Lookup is a backend API that maps Web of Science API Subscription (Developer Portal), Clarivate SFDC data, and Caesar Data. The API is used to synchronize data and retrieve customer subscriptions. 
 *
 * The version of the OpenAPI document: 0.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.clarivate.wos.lookup_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.clarivate.wos.lookup_client.model.Subscription;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OpportunityAPIItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-13T01:26:33.372+01:00[Europe/Paris]")
public class OpportunityAPIItem {
  public static final String SERIALIZED_NAME_SFDC_PRODUCT_CODE = "sfdcProductCode";
  @SerializedName(SERIALIZED_NAME_SFDC_PRODUCT_CODE)
  private String sfdcProductCode;

  public static final String SERIALIZED_NAME_SFDC_PRODUCT_NAME = "sfdcProductName";
  @SerializedName(SERIALIZED_NAME_SFDC_PRODUCT_NAME)
  private String sfdcProductName;

  public static final String SERIALIZED_NAME_PRIMARY_QUOTE = "primaryQuote";
  @SerializedName(SERIALIZED_NAME_PRIMARY_QUOTE)
  private String primaryQuote;

  public static final String SERIALIZED_NAME_QUOTE_LINES = "quoteLines";
  @SerializedName(SERIALIZED_NAME_QUOTE_LINES)
  private List<String> quoteLines = null;

  public static final String SERIALIZED_NAME_DEV_PORTAL_SUBSCRIPTION_ITEM = "devPortalSubscriptionItem";
  @SerializedName(SERIALIZED_NAME_DEV_PORTAL_SUBSCRIPTION_ITEM)
  private List<Subscription> devPortalSubscriptionItem = null;


  public OpportunityAPIItem sfdcProductCode(String sfdcProductCode) {
    
    this.sfdcProductCode = sfdcProductCode;
    return this;
  }

   /**
   * Get sfdcProductCode
   * @return sfdcProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45021425", value = "")

  public String getSfdcProductCode() {
    return sfdcProductCode;
  }


  public void setSfdcProductCode(String sfdcProductCode) {
    this.sfdcProductCode = sfdcProductCode;
  }


  public OpportunityAPIItem sfdcProductName(String sfdcProductName) {
    
    this.sfdcProductName = sfdcProductName;
    return this;
  }

   /**
   * Get sfdcProductName
   * @return sfdcProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Journals API - Data Integration", value = "")

  public String getSfdcProductName() {
    return sfdcProductName;
  }


  public void setSfdcProductName(String sfdcProductName) {
    this.sfdcProductName = sfdcProductName;
  }


  public OpportunityAPIItem primaryQuote(String primaryQuote) {
    
    this.primaryQuote = primaryQuote;
    return this;
  }

   /**
   * Get primaryQuote
   * @return primaryQuote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryQuote() {
    return primaryQuote;
  }


  public void setPrimaryQuote(String primaryQuote) {
    this.primaryQuote = primaryQuote;
  }


  public OpportunityAPIItem quoteLines(List<String> quoteLines) {
    
    this.quoteLines = quoteLines;
    return this;
  }

  public OpportunityAPIItem addQuoteLinesItem(String quoteLinesItem) {
    if (this.quoteLines == null) {
      this.quoteLines = new ArrayList<String>();
    }
    this.quoteLines.add(quoteLinesItem);
    return this;
  }

   /**
   * Get quoteLines
   * @return quoteLines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getQuoteLines() {
    return quoteLines;
  }


  public void setQuoteLines(List<String> quoteLines) {
    this.quoteLines = quoteLines;
  }


  public OpportunityAPIItem devPortalSubscriptionItem(List<Subscription> devPortalSubscriptionItem) {
    
    this.devPortalSubscriptionItem = devPortalSubscriptionItem;
    return this;
  }

  public OpportunityAPIItem addDevPortalSubscriptionItemItem(Subscription devPortalSubscriptionItemItem) {
    if (this.devPortalSubscriptionItem == null) {
      this.devPortalSubscriptionItem = new ArrayList<Subscription>();
    }
    this.devPortalSubscriptionItem.add(devPortalSubscriptionItemItem);
    return this;
  }

   /**
   * Get devPortalSubscriptionItem
   * @return devPortalSubscriptionItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Subscription> getDevPortalSubscriptionItem() {
    return devPortalSubscriptionItem;
  }


  public void setDevPortalSubscriptionItem(List<Subscription> devPortalSubscriptionItem) {
    this.devPortalSubscriptionItem = devPortalSubscriptionItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpportunityAPIItem opportunityAPIItem = (OpportunityAPIItem) o;
    return Objects.equals(this.sfdcProductCode, opportunityAPIItem.sfdcProductCode) &&
        Objects.equals(this.sfdcProductName, opportunityAPIItem.sfdcProductName) &&
        Objects.equals(this.primaryQuote, opportunityAPIItem.primaryQuote) &&
        Objects.equals(this.quoteLines, opportunityAPIItem.quoteLines) &&
        Objects.equals(this.devPortalSubscriptionItem, opportunityAPIItem.devPortalSubscriptionItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sfdcProductCode, sfdcProductName, primaryQuote, quoteLines, devPortalSubscriptionItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpportunityAPIItem {\n");
    sb.append("    sfdcProductCode: ").append(toIndentedString(sfdcProductCode)).append("\n");
    sb.append("    sfdcProductName: ").append(toIndentedString(sfdcProductName)).append("\n");
    sb.append("    primaryQuote: ").append(toIndentedString(primaryQuote)).append("\n");
    sb.append("    quoteLines: ").append(toIndentedString(quoteLines)).append("\n");
    sb.append("    devPortalSubscriptionItem: ").append(toIndentedString(devPortalSubscriptionItem)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

