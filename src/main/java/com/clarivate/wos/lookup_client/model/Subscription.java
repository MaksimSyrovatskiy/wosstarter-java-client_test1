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
import com.clarivate.wos.lookup_client.model.SubscriptionAppInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Subscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-13T01:26:33.372+01:00[Europe/Paris]")
public class Subscription {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_APP_INFO = "appInfo";
  @SerializedName(SERIALIZED_NAME_APP_INFO)
  private SubscriptionAppInfo appInfo;

  public static final String SERIALIZED_NAME_API_PRODUCT_NAME = "apiProductName";
  @SerializedName(SERIALIZED_NAME_API_PRODUCT_NAME)
  private String apiProductName;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private String plan;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;


  public Subscription subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public Subscription appInfo(SubscriptionAppInfo appInfo) {
    
    this.appInfo = appInfo;
    return this;
  }

   /**
   * Get appInfo
   * @return appInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionAppInfo getAppInfo() {
    return appInfo;
  }


  public void setAppInfo(SubscriptionAppInfo appInfo) {
    this.appInfo = appInfo;
  }


  public Subscription apiProductName(String apiProductName) {
    
    this.apiProductName = apiProductName;
    return this;
  }

   /**
   * Get apiProductName
   * @return apiProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiProductName() {
    return apiProductName;
  }


  public void setApiProductName(String apiProductName) {
    this.apiProductName = apiProductName;
  }


  public Subscription plan(String plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlan() {
    return plan;
  }


  public void setPlan(String plan) {
    this.plan = plan;
  }


  public Subscription approved(Boolean approved) {
    
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.subscriptionId, subscription.subscriptionId) &&
        Objects.equals(this.appInfo, subscription.appInfo) &&
        Objects.equals(this.apiProductName, subscription.apiProductName) &&
        Objects.equals(this.plan, subscription.plan) &&
        Objects.equals(this.approved, subscription.approved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, appInfo, apiProductName, plan, approved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    appInfo: ").append(toIndentedString(appInfo)).append("\n");
    sb.append("    apiProductName: ").append(toIndentedString(apiProductName)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
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

