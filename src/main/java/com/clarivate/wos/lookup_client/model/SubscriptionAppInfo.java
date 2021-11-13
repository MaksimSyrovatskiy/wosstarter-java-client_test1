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
 * SubscriptionAppInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-13T01:26:33.372+01:00[Europe/Paris]")
public class SubscriptionAppInfo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CHANGED_DATE = "changedDate";
  @SerializedName(SERIALIZED_NAME_CHANGED_DATE)
  private String changedDate;

  public static final String SERIALIZED_NAME_REQUESTER_EMAILS = "requesterEmails";
  @SerializedName(SERIALIZED_NAME_REQUESTER_EMAILS)
  private List<String> requesterEmails = null;


  public SubscriptionAppInfo id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SubscriptionAppInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SubscriptionAppInfo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SubscriptionAppInfo changedDate(String changedDate) {
    
    this.changedDate = changedDate;
    return this;
  }

   /**
   * Get changedDate
   * @return changedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChangedDate() {
    return changedDate;
  }


  public void setChangedDate(String changedDate) {
    this.changedDate = changedDate;
  }


  public SubscriptionAppInfo requesterEmails(List<String> requesterEmails) {
    
    this.requesterEmails = requesterEmails;
    return this;
  }

  public SubscriptionAppInfo addRequesterEmailsItem(String requesterEmailsItem) {
    if (this.requesterEmails == null) {
      this.requesterEmails = new ArrayList<String>();
    }
    this.requesterEmails.add(requesterEmailsItem);
    return this;
  }

   /**
   * Get requesterEmails
   * @return requesterEmails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRequesterEmails() {
    return requesterEmails;
  }


  public void setRequesterEmails(List<String> requesterEmails) {
    this.requesterEmails = requesterEmails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAppInfo subscriptionAppInfo = (SubscriptionAppInfo) o;
    return Objects.equals(this.id, subscriptionAppInfo.id) &&
        Objects.equals(this.name, subscriptionAppInfo.name) &&
        Objects.equals(this.description, subscriptionAppInfo.description) &&
        Objects.equals(this.changedDate, subscriptionAppInfo.changedDate) &&
        Objects.equals(this.requesterEmails, subscriptionAppInfo.requesterEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, changedDate, requesterEmails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAppInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    changedDate: ").append(toIndentedString(changedDate)).append("\n");
    sb.append("    requesterEmails: ").append(toIndentedString(requesterEmails)).append("\n");
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

