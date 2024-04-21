# StatusApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**home**](StatusApi.md#home) | **GET** / | Home |
| [**messageWithCat**](StatusApi.md#messageWithCat) | **POST** /message | Message With Cat |


<a id="home"></a>
# **home**
> Object home()

Home

Server status

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.StatusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    StatusApi apiInstance = new StatusApi(defaultClient);
    try {
      Object result = apiInstance.home();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#home");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a id="messageWithCat"></a>
# **messageWithCat**
> Object messageWithCat(body)

Message With Cat

Get a response from the Cat

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.StatusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    StatusApi apiInstance = new StatusApi(defaultClient);
    Object body = null; // Object | 
    try {
      Object result = apiInstance.messageWithCat(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#messageWithCat");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

