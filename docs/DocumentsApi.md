# DocumentsApi

All URIs are relative to *http://example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**documentsGet**](DocumentsApi.md#documentsGet) | **GET** /documents | Query Web of Science documents 
[**documentsUidGet**](DocumentsApi.md#documentsUidGet) | **GET** /documents/{uid} | 


<a name="documentsGet"></a>
# **documentsGet**
> DocumentsList documentsGet(q, db, page, limit, sortField)

Query Web of Science documents 

TODO 

### Example
```java
// Import classes:
import com.clarivate.wos.amr.adapter.rest.client.invoker.ApiClient;
import com.clarivate.wos.amr.adapter.rest.client.invoker.ApiException;
import com.clarivate.wos.amr.adapter.rest.client.invoker.Configuration;
import com.clarivate.wos.amr.adapter.rest.client.invoker.models.*;
import com.clarivate.wos.amr.adapter.rest.client.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://example.com");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String q = "q_example"; // String | 
    String db = "db_example"; // String | 
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    String sortField = "sortField_example"; // String | Order by field(s). Field name and order by clause separated by '+', use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. Supported fields:  * **LD** - Load Date * **PY** - Publication Year * **RS** - Relevance * **TS** - Times Cited 
    try {
      DocumentsList result = apiInstance.documentsGet(q, db, page, limit, sortField);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#documentsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**|  |
 **db** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **sortField** | **String**| Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. Supported fields:  * **LD** - Load Date * **PY** - Publication Year * **RS** - Relevance * **TS** - Times Cited  | [optional]

### Return type

[**DocumentsList**](DocumentsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="documentsUidGet"></a>
# **documentsUidGet**
> Document documentsUidGet(uid)



### Example
```java
// Import classes:
import com.clarivate.wos.amr.adapter.rest.client.invoker.ApiClient;
import com.clarivate.wos.amr.adapter.rest.client.invoker.ApiException;
import com.clarivate.wos.amr.adapter.rest.client.invoker.Configuration;
import com.clarivate.wos.amr.adapter.rest.client.invoker.models.*;
import com.clarivate.wos.amr.adapter.rest.client.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://example.com");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String uid = "uid_example"; // String | 
    try {
      Document result = apiInstance.documentsUidGet(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#documentsUidGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

