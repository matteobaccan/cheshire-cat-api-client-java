# HomeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**messageWithCat**](HomeApi.md#messageWithCat) | **POST** /message | Message With Cat |
| [**status**](HomeApi.md#status) | **GET** / | Status |



## messageWithCat

> CatMessage messageWithCat(body)

Message With Cat

Get a response from the Cat

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.HomeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        HomeApi apiInstance = new HomeApi(defaultClient);
        Object body = null; // Object | 
        try {
            CatMessage result = apiInstance.messageWithCat(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HomeApi#messageWithCat");
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

[**CatMessage**](CatMessage.md)

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


## status

> Object status()

Status

Server status

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.HomeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        HomeApi apiInstance = new HomeApi(defaultClient);
        try {
            Object result = apiInstance.status();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HomeApi#status");
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

