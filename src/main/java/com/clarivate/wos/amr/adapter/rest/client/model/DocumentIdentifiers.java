/*
 * Web of Science™ Starter API
 * The Web of Science™ Starter API provides basic metadata and search functionality for Web of Science™ Documents and Journals. Based on your subscription, this API can return times cited of documents.  ## Resouces This API follows the REST approach to disclose resources in URL format. Only the GET method is currently available to perform requests over HTTP.  The API is available on the [Clarivate Developer Portal](https://developer.clarivate.com/apis/wos-starter). You can find more details about the subscription and the Plans.  ## Content  You can learn more about content at [Web of Science™ Product Page](https://clarivate.com/webofsciencegroup/solutions/web-of-science/) or in the [Web of Science™ Help](https://webofscience.help.clarivate.com/en-us/Content/home.htm).  (TODO: Add list of fields that are returned from this API.)  ## Credentials  All requests require authentication with an API Key authentication flow. For more details, check the [Guide][https://developer.clarivate.com/help/api-access#key_access].   ## API Client Libraries TBD  ## Search and field tags for Web of Science documents Web of Science™ offers [advanced search query builder](https://webofscience.help.clarivate.com/en-us/Content/advanced-search.html). This API does not support all field tags for documents. [Web of Science API Expanded](https://developer.clarivate.com/apis/wos) offers all available field tags. The following table lists the field tags that are supported by this API. | Field Tag | Description                                                                                                                                                 | |-----------|-------------------------------------------------------------------------------------------------------------------------------------------------------------| | TI        | Title of document                                                                                                                                           | | IS        | ISSN or ISBN                                                                                                                                                | | SO        | Source title - The result contains all source titles within product database (for example, journal titles and/or book titles if the product includes books) | | VL        | Volume                                                                                                                                                      | | PG        | Page                                                                                                                                                        | | CS        | Issue                                                                                                                                                       | | PY        | Year Published                                                                                                                                              | | AU        | Author                                                                                                                                                      | | UT        | Accession Number                                                                                                                                            | | DO        | DOI                                                                                                                                                         | | PMID      | PubMed ID                                                                                                                                                   | | OG        | Search for preferred organization names and/or their name variants from the Preferred Organization Index. <p> A search on a preferred organization name returns all records that contain the preferred name and all records that contain its name variants. A search on a name variant returns all records that contain the variant. For example, Cornell Law Sch returns all records that contain Cornell Law Sch in the Addresses field. <p> When searching for organization names that contain a Boolean (AND, NOT, NEAR, and SAME), always enclose the word in quotation marks ( \" \" ). For example: <p>   - OG=(Japan Science \"and\" Technology Agency (JST))      <br>   - OG=(\"Near\" East Univ)         <br> - OG=(\"OR\" Hlth Sci Univ)                           | | TS        | Searches for topic terms in the following fields within a document: <p> - Title <br> - Abstract <br> - Author keywords <br> - Keywords Plus  ## Pagination To ensure fast response time, each search or multiple entity calls (such as `/documents`) retrieve only a certain number of hits/records.  There are two optional request parameters to browse along with the result&#58; _limit_ and _page_.  - limit&#58; Number of returned results, ranging from 0 to 50 (default **10**) - page&#58; Specifying a page to retrieve (default **1**)  Moreover, this information is shown in the response body, in the tag **metadata**&#58;  ```json \"metadata\": {   \"total\": 91,   \"page\": 1,   \"limit\": 10 } ```  ## Errors The WoS Journals API uses conventional HTTP success or failure status codes. For errors, some extra information is included to indicate what went wrong in the JSON response. The list of HTTP codes is listed below.  | Code  | Title  | Description | |---|---|---| | 400  | Bad request  | Request syntax error | | 401  | Unauthorized  | The API key is invalid or missed | | 404  | Not found  | The resource is not found | | 405 | Method not allowed | Method other than GET is not allowed | | 50X  | Server errors  | Technical error with servers| Each error response (except `401 Unauthorized` error) contains the code of the error, the title of the error and detailed description of the error: a misprint in an endpoint, wrong URL parameter, etc. The example of the error message is shown below:  ```json   \"error\": {     \"status\": 404,     \"title\": \"Resource couldn't be found\",     \"details\": \"There is no record found in the Web of Science database. Please check your query.\"   } ``` For the `401 Unauthorized` error the response body is a little bit different: ```json {   \"error_description\": \"The access token is missing\",   \"error\": \"invalid_request\" } 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.clarivate.wos.amr.adapter.rest.client.model;

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
 * DocumentIdentifiers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-15T23:43:27.447525+01:00[Europe/Paris]")
public class DocumentIdentifiers {
  public static final String SERIALIZED_NAME_DOI = "doi";
  @SerializedName(SERIALIZED_NAME_DOI)
  private String doi;

  public static final String SERIALIZED_NAME_ISSN = "issn";
  @SerializedName(SERIALIZED_NAME_ISSN)
  private String issn;

  public static final String SERIALIZED_NAME_EISSN = "eissn";
  @SerializedName(SERIALIZED_NAME_EISSN)
  private String eissn;

  public static final String SERIALIZED_NAME_ISBN = "isbn";
  @SerializedName(SERIALIZED_NAME_ISBN)
  private String isbn;

  public static final String SERIALIZED_NAME_EISBN = "eisbn";
  @SerializedName(SERIALIZED_NAME_EISBN)
  private String eisbn;

  public static final String SERIALIZED_NAME_PMID = "pmid";
  @SerializedName(SERIALIZED_NAME_PMID)
  private String pmid;


  public DocumentIdentifiers doi(String doi) {
    
    this.doi = doi;
    return this;
  }

   /**
   * Get doi
   * @return doi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDoi() {
    return doi;
  }


  public void setDoi(String doi) {
    this.doi = doi;
  }


  public DocumentIdentifiers issn(String issn) {
    
    this.issn = issn;
    return this;
  }

   /**
   * Get issn
   * @return issn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssn() {
    return issn;
  }


  public void setIssn(String issn) {
    this.issn = issn;
  }


  public DocumentIdentifiers eissn(String eissn) {
    
    this.eissn = eissn;
    return this;
  }

   /**
   * Get eissn
   * @return eissn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEissn() {
    return eissn;
  }


  public void setEissn(String eissn) {
    this.eissn = eissn;
  }


  public DocumentIdentifiers isbn(String isbn) {
    
    this.isbn = isbn;
    return this;
  }

   /**
   * Get isbn
   * @return isbn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIsbn() {
    return isbn;
  }


  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }


  public DocumentIdentifiers eisbn(String eisbn) {
    
    this.eisbn = eisbn;
    return this;
  }

   /**
   * Get eisbn
   * @return eisbn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEisbn() {
    return eisbn;
  }


  public void setEisbn(String eisbn) {
    this.eisbn = eisbn;
  }


  public DocumentIdentifiers pmid(String pmid) {
    
    this.pmid = pmid;
    return this;
  }

   /**
   * Get pmid
   * @return pmid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPmid() {
    return pmid;
  }


  public void setPmid(String pmid) {
    this.pmid = pmid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentIdentifiers documentIdentifiers = (DocumentIdentifiers) o;
    return Objects.equals(this.doi, documentIdentifiers.doi) &&
        Objects.equals(this.issn, documentIdentifiers.issn) &&
        Objects.equals(this.eissn, documentIdentifiers.eissn) &&
        Objects.equals(this.isbn, documentIdentifiers.isbn) &&
        Objects.equals(this.eisbn, documentIdentifiers.eisbn) &&
        Objects.equals(this.pmid, documentIdentifiers.pmid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doi, issn, eissn, isbn, eisbn, pmid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentIdentifiers {\n");
    sb.append("    doi: ").append(toIndentedString(doi)).append("\n");
    sb.append("    issn: ").append(toIndentedString(issn)).append("\n");
    sb.append("    eissn: ").append(toIndentedString(eissn)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    eisbn: ").append(toIndentedString(eisbn)).append("\n");
    sb.append("    pmid: ").append(toIndentedString(pmid)).append("\n");
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

