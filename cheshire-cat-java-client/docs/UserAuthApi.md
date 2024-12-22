# UserAuthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authToken**](UserAuthApi.md#authToken) | **POST** /auth/token | Auth Token |
| [**getAvailablePermissions**](UserAuthApi.md#getAvailablePermissions) | **GET** /auth/available-permissions | Get Available Permissions |



## authToken

> JWTResponse authToken(userCredentials)

Auth Token

Endpoint called from client to get a JWT from local identity provider.
This endpoint receives username and password as form-data, validates credentials and issues a JWT.

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.UserAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserAuthApi apiInstance = new UserAuthApi(defaultClient);
        UserCredentials userCredentials = new UserCredentials(); // UserCredentials | 
        try {
            JWTResponse result = apiInstance.authToken(userCredentials);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAuthApi#authToken");
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
| **userCredentials** | [**UserCredentials**](UserCredentials.md)|  | |

### Return type

[**JWTResponse**](JWTResponse.md)

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


## getAvailablePermissions

> Map&lt;String, List&lt;AuthPermission&gt;&gt; getAvailablePermissions()

Get Available Permissions

Returns all available resources and permissions.

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.UserAuthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UserAuthApi apiInstance = new UserAuthApi(defaultClient);
        try {
            Map<String, List<AuthPermission>> result = apiInstance.getAvailablePermissions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAuthApi#getAvailablePermissions");
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

[**Map&lt;String, List&lt;AuthPermission&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

