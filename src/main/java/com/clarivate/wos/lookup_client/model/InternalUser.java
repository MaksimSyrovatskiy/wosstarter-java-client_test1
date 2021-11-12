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
import com.clarivate.wos.lookup_client.model.SFDCAccountReference;
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
 * InternalUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T17:30:38.696406200+01:00[Europe/Paris]")
public class InternalUser {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SFDC_ACCOUNTS = "sfdcAccounts";
  @SerializedName(SERIALIZED_NAME_SFDC_ACCOUNTS)
  private List<SFDCAccountReference> sfdcAccounts = null;


  public InternalUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "kadri.nebiu@clarivate.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public InternalUser name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kadri Nebiu", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InternalUser sfdcAccounts(List<SFDCAccountReference> sfdcAccounts) {
    
    this.sfdcAccounts = sfdcAccounts;
    return this;
  }

  public InternalUser addSfdcAccountsItem(SFDCAccountReference sfdcAccountsItem) {
    if (this.sfdcAccounts == null) {
      this.sfdcAccounts = new ArrayList<>();
    }
    this.sfdcAccounts.add(sfdcAccountsItem);
    return this;
  }

   /**
   * Get sfdcAccounts
   * @return sfdcAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SFDCAccountReference> getSfdcAccounts() {
    return sfdcAccounts;
  }


  public void setSfdcAccounts(List<SFDCAccountReference> sfdcAccounts) {
    this.sfdcAccounts = sfdcAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalUser internalUser = (InternalUser) o;
    return Objects.equals(this.email, internalUser.email) &&
        Objects.equals(this.name, internalUser.name) &&
        Objects.equals(this.sfdcAccounts, internalUser.sfdcAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, sfdcAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalUser {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sfdcAccounts: ").append(toIndentedString(sfdcAccounts)).append("\n");
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

