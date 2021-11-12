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
import com.clarivate.wos.lookup_client.model.InternalUserReference;
import com.clarivate.wos.lookup_client.model.SearchMatch;
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
 * InternalUserListRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T17:30:38.696406200+01:00[Europe/Paris]")
public class InternalUserListRecord {
  public static final String SERIALIZED_NAME_INTERNAL_USER_REF = "internalUserRef";
  @SerializedName(SERIALIZED_NAME_INTERNAL_USER_REF)
  private InternalUserReference internalUserRef;

  public static final String SERIALIZED_NAME_MATCHES = "matches";
  @SerializedName(SERIALIZED_NAME_MATCHES)
  private List<SearchMatch> matches = null;


  public InternalUserListRecord internalUserRef(InternalUserReference internalUserRef) {
    
    this.internalUserRef = internalUserRef;
    return this;
  }

   /**
   * Get internalUserRef
   * @return internalUserRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InternalUserReference getInternalUserRef() {
    return internalUserRef;
  }


  public void setInternalUserRef(InternalUserReference internalUserRef) {
    this.internalUserRef = internalUserRef;
  }


  public InternalUserListRecord matches(List<SearchMatch> matches) {
    
    this.matches = matches;
    return this;
  }

  public InternalUserListRecord addMatchesItem(SearchMatch matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchMatch> getMatches() {
    return matches;
  }


  public void setMatches(List<SearchMatch> matches) {
    this.matches = matches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalUserListRecord internalUserListRecord = (InternalUserListRecord) o;
    return Objects.equals(this.internalUserRef, internalUserListRecord.internalUserRef) &&
        Objects.equals(this.matches, internalUserListRecord.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalUserRef, matches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalUserListRecord {\n");
    sb.append("    internalUserRef: ").append(toIndentedString(internalUserRef)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

