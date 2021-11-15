# JournalsApi

All URIs are relative to *http://example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**journalsGet**](JournalsApi.md#journalsGet) | **GET** /journals | 
[**journalsUidGet**](JournalsApi.md#journalsUidGet) | **GET** /journals/{uid} | 


<a name="journalsGet"></a>
# **journalsGet**
> JournalsList journalsGet(issn)



### Example
```java
// Import classes:
import com.clarivate.wos.amr.adapter.rest.client.invoker.ApiClient;
import com.clarivate.wos.amr.adapter.rest.client.invoker.ApiException;
import com.clarivate.wos.amr.adapter.rest.client.invoker.Configuration;
import com.clarivate.wos.amr.adapter.rest.client.invoker.models.*;
import com.clarivate.wos.amr.adapter.rest.client.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://example.com");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    String issn = "issn_example"; // String | 
    try {
      JournalsList result = apiInstance.journalsGet(issn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#journalsGet");
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
 **issn** | **String**|  | [optional]

### Return type

[**JournalsList**](JournalsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="journalsUidGet"></a>
# **journalsUidGet**
> Journal journalsUidGet(uid)



### Example
```java
// Import classes:
import com.clarivate.wos.amr.adapter.rest.client.invoker.ApiClient;
import com.clarivate.wos.amr.adapter.rest.client.invoker.ApiException;
import com.clarivate.wos.amr.adapter.rest.client.invoker.Configuration;
import com.clarivate.wos.amr.adapter.rest.client.invoker.models.*;
import com.clarivate.wos.amr.adapter.rest.client.JournalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://example.com");

    JournalsApi apiInstance = new JournalsApi(defaultClient);
    String uid = "uid_example"; // String | 
    try {
      Journal result = apiInstance.journalsUidGet(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JournalsApi#journalsUidGet");
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

[**Journal**](Journal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

