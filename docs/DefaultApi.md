# DefaultApi

All URIs are relative to *http://api.clarivate.com/woslookup/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sFDCAccountsEnterpriseIDGet**](DefaultApi.md#sFDCAccountsEnterpriseIDGet) | **GET** /SFDCAccounts/{enterpriseID} | Returns an opportunity by ID
[**sFDCAccountsGet**](DefaultApi.md#sFDCAccountsGet) | **GET** /SFDCAccounts | Returns the list of SFDC accounts
[**sFDCAccountsPost**](DefaultApi.md#sFDCAccountsPost) | **POST** /SFDCAccounts | Update the Account data by providing an excel file
[**sFDCInternalUsersGet**](DefaultApi.md#sFDCInternalUsersGet) | **GET** /SFDCInternalUsers | Returns the list of SFDC users
[**sFDCInternalUsersPost**](DefaultApi.md#sFDCInternalUsersPost) | **POST** /SFDCInternalUsers | Update the Internal users data by providing an excel file
[**sFDCOpportunitiesGet**](DefaultApi.md#sFDCOpportunitiesGet) | **GET** /SFDCOpportunities | Returns the list of opportunities
[**sFDCOpportunitiesOpportunityIDGet**](DefaultApi.md#sFDCOpportunitiesOpportunityIDGet) | **GET** /SFDCOpportunities/{opportunityID} | Returns an opportunity by ID
[**sFDCOpportunitiesPost**](DefaultApi.md#sFDCOpportunitiesPost) | **POST** /SFDCOpportunities | Update the OPP data by providing an excel file
[**subscriptionsGet**](DefaultApi.md#subscriptionsGet) | **GET** /subscriptions | returns application and subscription info for those apps not older than 90 days that have not been approved
[**tasksIdGet**](DefaultApi.md#tasksIdGet) | **GET** /tasks/{id} | Returns the task


<a name="sFDCAccountsEnterpriseIDGet"></a>
# **sFDCAccountsEnterpriseIDGet**
> SFDCAccount sFDCAccountsEnterpriseIDGet(enterpriseID)

Returns an opportunity by ID

TBD

### Example
```java
// Import classes:
import com.clarivate.wos.lookup_client.invoker.ApiClient;
import com.clarivate.wos.lookup_client.invoker.ApiException;
import com.clarivate.wos.lookup_client.invoker.Configuration;
import com.clarivate.wos.lookup_client.invoker.models.*;
import com.clarivate.wos.lookup_client.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/woslookup/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String enterpriseID = "ACT-00000000"; // String | 
    try {
      SFDCAccount result = apiInstance.sFDCAccountsEnterpriseIDGet(enterpriseID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#sFDCAccountsEnterpriseIDGet");
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
 **enterpriseID** | **String**|  |

### Return type

[**SFDCAccount**](SFDCAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Account |  -  |

<a name="sFDCAccountsGet"></a>
# **sFDCAccountsGet**
> SFDCAccountList sFDCAccountsGet(sfdcApiProduct, sfdcAccountName, sfdcAccountDomain, internalUser, limit, page)

Returns the list of SFDC accounts

TBD

### Example
```java
// Import classes:
import com.clarivate.wos.lookup_client.invoker.ApiClient;
import com.clarivate.wos.lookup_client.invoker.ApiException;
import com.clarivate.wos.lookup_client.invoker.Configuration;
import com.clarivate.wos.lookup_client.invoker.models.*;
import com.clarivate.wos.lookup_client.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/woslookup/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sfdcApiProduct = "sfdcApiProduct_example"; // String | Filter by SFDC API Product Code or Name
    String sfdcAccountName = "sfdcAccountName_example"; // String | Filter by SFDC Account Name
    String sfdcAccountDomain = "kit.edu"; // String | Filter by SFDC Account domain(s)
    String internalUser = "internalUser_example"; // String | Filter by name or email address of internal Clarivate account
    Integer limit = 10; // Integer | null
    Integer page = 1; // Integer | null
    try {
      SFDCAccountList result = apiInstance.sFDCAccountsGet(sfdcApiProduct, sfdcAccountName, sfdcAccountDomain, internalUser, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#sFDCAccountsGet");
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
 **sfdcApiProduct** | **String**| Filter by SFDC API Product Code or Name | [optional]
 **sfdcAccountName** | **String**| Filter by SFDC Account Name | [optional]
 **sfdcAccountDomain** | **String**| Filter by SFDC Account domain(s) | [optional]
 **internalUser** | **String**| Filter by name or email address of internal Clarivate account | [optional]
 **limit** | **Integer**| null | [optional] [default to 10]
 **page** | **Integer**| null | [optional] [default to 1]

### Return type

[**SFDCAccountList**](SFDCAccountList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Accounts list |  -  |

<a name="sFDCAccountsPost"></a>
# **sFDCAccountsPost**
> Integer sFDCAccountsPost(file)

Update the Account data by providing an excel file

TBD

### Example
```java
// Import classes:
import com.clarivate.wos.lookup_client.invoker.ApiClient;
import com.clarivate.wos.lookup_client.invoker.ApiException;
import com.clarivate.wos.lookup_client.invoker.Configuration;
import com.clarivate.wos.lookup_client.invoker.models.*;
import com.clarivate.wos.lookup_client.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/woslookup/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    File file = new File("/path/to/file"); // File | 
    try {
      Integer result = apiInstance.sFDCAccountsPost(file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#sFDCAccountsPost");
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
 **file** | **File**|  | [optional]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | OK |  -  |

<a name="sFDCInternalUsersGet"></a>
# **sFDCInternalUsersGet**
> InternalUserList sFDCInternalUsersGet(internalUser, limit, page)

Returns the list of SFDC users

TBD

### Example
```java
// Import classes:
import com.clarivate.wos.lookup_client.invoker.ApiClient;
import com.clarivate.wos.lookup_client.invoker.ApiException;
import com.clarivate.wos.lookup_client.invoker.Configuration;
import com.clarivate.wos.lookup_client.invoker.models.*;
import com.clarivate.wos.lookup_client.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/woslookup/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String internalUser = "internalUser_example"; // String | Filter by name or email address of internal Clarivate account
    Integer limit = 10; // Integer | null
    Integer page = 1; // Integer | null
    try {
      InternalUserList result = apiInstance.sFDCInternalUsersGet(internalUser, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#sFDCInternalUsersGet");
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
 **internalUser** | **String**| Filter by name or email address of internal Clarivate account | [optional]
 **limit** | **Integer**| null | [optional] [default to 10]
 **page** | **Integer**| null | [optional] [default to 1]

### Return type

[**InternalUserList**](InternalUserList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Accounts list |  -  |

<a name="sFDCInternalUsersPost"></a>
# **sFDCInternalUsersPost**
> Integer sFDCInternalUsersPost(file)

Update the Internal users data by providing an excel file

TBD

### Example
```java
// Import classes:
import com.clarivate.wos.lookup_client.invoker.ApiClient;
import com.clarivate.wos.lookup_client.invoker.ApiException;
import com.clarivate.wos.lookup_client.invoker.Configuration;
import com.clarivate.wos.lookup_client.invoker.models.*;
import com.clarivate.wos.lookup_client.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/woslookup/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    File file = new File("/path/to/file"); // File | 
    try {
      Integer result = apiInstance.sFDCInternalUsersPost(file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#sFDCInternalUsersPost");
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
 **file** | **File**|  | [optional]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | OK |  -  |

<a name="sFDCOpportunitiesGet"></a>
# **sFDCOpportunitiesGet**
> SFDCOpportunityList sFDCOpportunitiesGet(sfdcAccount, sfdcApiProduct, sfdcAccountDomain, internalUser, limit, page)

Returns the list of opportunities

TBD

### Example
```java
// Import classes:
import com.clarivate.wos.lookup_client.invoker.ApiClient;
import com.clarivate.wos.lookup_client.invoker.ApiException;
import com.clarivate.wos.lookup_client.invoker.Configuration;
import com.clarivate.wos.lookup_client.invoker.models.*;
import com.clarivate.wos.lookup_client.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/woslookup/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sfdcAccount = "ACT-00000000"; // String | Filter by SFDC account name or enterprise id
    String sfdcApiProduct = "45021425"; // String | Filter by SFDC API Product Code or Name
    String sfdcAccountDomain = "kit.edu"; // String | Filter by SFDC Account domain(s)
    String internalUser = "internalUser_example"; // String | Filter by name or email address of internal Clarivate account
    Integer limit = 10; // Integer | null
    Integer page = 1; // Integer | null
    try {
      SFDCOpportunityList result = apiInstance.sFDCOpportunitiesGet(sfdcAccount, sfdcApiProduct, sfdcAccountDomain, internalUser, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#sFDCOpportunitiesGet");
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
 **sfdcAccount** | **String**| Filter by SFDC account name or enterprise id | [optional]
 **sfdcApiProduct** | **String**| Filter by SFDC API Product Code or Name | [optional]
 **sfdcAccountDomain** | **String**| Filter by SFDC Account domain(s) | [optional]
 **internalUser** | **String**| Filter by name or email address of internal Clarivate account | [optional]
 **limit** | **Integer**| null | [optional] [default to 10]
 **page** | **Integer**| null | [optional] [default to 1]

### Return type

[**SFDCOpportunityList**](SFDCOpportunityList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Opportunity list |  -  |

<a name="sFDCOpportunitiesOpportunityIDGet"></a>
# **sFDCOpportunitiesOpportunityIDGet**
> SFDCOpportunity sFDCOpportunitiesOpportunityIDGet(opportunityID)

Returns an opportunity by ID

TBD

### Example
```java
// Import classes:
import com.clarivate.wos.lookup_client.invoker.ApiClient;
import com.clarivate.wos.lookup_client.invoker.ApiException;
import com.clarivate.wos.lookup_client.invoker.Configuration;
import com.clarivate.wos.lookup_client.invoker.models.*;
import com.clarivate.wos.lookup_client.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/woslookup/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String opportunityID = "OPP-00000000"; // String | 
    try {
      SFDCOpportunity result = apiInstance.sFDCOpportunitiesOpportunityIDGet(opportunityID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#sFDCOpportunitiesOpportunityIDGet");
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
 **opportunityID** | **String**|  |

### Return type

[**SFDCOpportunity**](SFDCOpportunity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Opportunity |  -  |

<a name="sFDCOpportunitiesPost"></a>
# **sFDCOpportunitiesPost**
> Integer sFDCOpportunitiesPost(file)

Update the OPP data by providing an excel file

TBD

### Example
```java
// Import classes:
import com.clarivate.wos.lookup_client.invoker.ApiClient;
import com.clarivate.wos.lookup_client.invoker.ApiException;
import com.clarivate.wos.lookup_client.invoker.Configuration;
import com.clarivate.wos.lookup_client.invoker.models.*;
import com.clarivate.wos.lookup_client.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/woslookup/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    File file = new File("/path/to/file"); // File | 
    try {
      Integer result = apiInstance.sFDCOpportunitiesPost(file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#sFDCOpportunitiesPost");
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
 **file** | **File**|  | [optional]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | OK |  -  |

<a name="subscriptionsGet"></a>
# **subscriptionsGet**
> List&lt;Subscription&gt; subscriptionsGet()

returns application and subscription info for those apps not older than 90 days that have not been approved

TBD

### Example
```java
// Import classes:
import com.clarivate.wos.lookup_client.invoker.ApiClient;
import com.clarivate.wos.lookup_client.invoker.ApiException;
import com.clarivate.wos.lookup_client.invoker.Configuration;
import com.clarivate.wos.lookup_client.invoker.models.*;
import com.clarivate.wos.lookup_client.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/woslookup/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<Subscription> result = apiInstance.subscriptionsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#subscriptionsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Subscription&gt;**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Subscription List |  -  |

<a name="tasksIdGet"></a>
# **tasksIdGet**
> Task tasksIdGet(id)

Returns the task

TBD

### Example
```java
// Import classes:
import com.clarivate.wos.lookup_client.invoker.ApiClient;
import com.clarivate.wos.lookup_client.invoker.ApiException;
import com.clarivate.wos.lookup_client.invoker.Configuration;
import com.clarivate.wos.lookup_client.invoker.models.*;
import com.clarivate.wos.lookup_client.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.clarivate.com/woslookup/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer id = 56; // Integer | Task id
    try {
      Task result = apiInstance.tasksIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tasksIdGet");
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
 **id** | **Integer**| Task id |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Task |  -  |

