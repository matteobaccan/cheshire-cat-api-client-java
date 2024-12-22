# AuthHandlerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuthHandlerSetting**](AuthHandlerApi.md#getAuthHandlerSetting) | **GET** /auth_handler/settings/{auth_handler_name} | Get Auth Handler Setting |
| [**getAuthHandlerSettings**](AuthHandlerApi.md#getAuthHandlerSettings) | **GET** /auth_handler/settings | Get Auth Handler Settings |
| [**upsertAuthenticatorSetting**](AuthHandlerApi.md#upsertAuthenticatorSetting) | **PUT** /auth_handler/settings/{auth_handler_name} | Upsert Authenticator Setting |



## getAuthHandlerSetting

> Object getAuthHandlerSetting(authHandlerName)

Get Auth Handler Setting

Get the settings of a specific AuthHandler

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.AuthHandlerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthHandlerApi apiInstance = new AuthHandlerApi(defaultClient);
        String authHandlerName = "authHandlerName_example"; // String | 
        try {
            Object result = apiInstance.getAuthHandlerSetting(authHandlerName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthHandlerApi#getAuthHandlerSetting");
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
| **authHandlerName** | **String**|  | |

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
| **422** | Validation Error |  -  |


## getAuthHandlerSettings

> Object getAuthHandlerSettings()

Get Auth Handler Settings

Get the list of the AuthHandlers

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.AuthHandlerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthHandlerApi apiInstance = new AuthHandlerApi(defaultClient);
        try {
            Object result = apiInstance.getAuthHandlerSettings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthHandlerApi#getAuthHandlerSettings");
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


## upsertAuthenticatorSetting

> Object upsertAuthenticatorSetting(authHandlerName, body)

Upsert Authenticator Setting

Upsert the settings of a specific AuthHandler

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.AuthHandlerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthHandlerApi apiInstance = new AuthHandlerApi(defaultClient);
        String authHandlerName = "authHandlerName_example"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.upsertAuthenticatorSetting(authHandlerName, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthHandlerApi#upsertAuthenticatorSetting");
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
| **authHandlerName** | **String**|  | |
| **body** | **Object**|  | |

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

