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

/**
 * Information about total number of items in the retrieve, number of recodrs on the page, and the page number.
 */
@ApiModel(description = "Information about total number of items in the retrieve, number of recodrs on the page, and the page number.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T17:30:38.696406200+01:00[Europe/Paris]")
public class Metadata {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;


  public Metadata total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of records for the request.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of records for the request.")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public Metadata page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Page number (default is 1)
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number (default is 1)")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public Metadata limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Number of records on a page (default is 10).
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of records on a page (default is 10).")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.total, metadata.total) &&
        Objects.equals(this.page, metadata.page) &&
        Objects.equals(this.limit, metadata.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, page, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
