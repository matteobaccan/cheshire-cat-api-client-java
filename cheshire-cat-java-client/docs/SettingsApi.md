# SettingsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSetting**](SettingsApi.md#createSetting) | **POST** /settings/ | Create Setting |
| [**deleteSetting**](SettingsApi.md#deleteSetting) | **DELETE** /settings/{settingId} | Delete Setting |
| [**getSetting**](SettingsApi.md#getSetting) | **GET** /settings/{settingId} | Get Setting |
| [**getSettings**](SettingsApi.md#getSettings) | **GET** /settings/ | Get Settings |
| [**updateSetting**](SettingsApi.md#updateSetting) | **PUT** /settings/{settingId} | Update Setting |



## createSetting

> Object createSetting(settingBody)

Create Setting

Create a new setting in the database

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        SettingBody settingBody = new SettingBody(); // SettingBody | 
        try {
            Object result = apiInstance.createSetting(settingBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#createSetting");
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
| **settingBody** | [**SettingBody**](SettingBody.md)|  | |

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


## deleteSetting

> Object deleteSetting(settingId)

Delete Setting

Delete a specific setting in the database

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        String settingId = "settingId_example"; // String | 
        try {
            Object result = apiInstance.deleteSetting(settingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#deleteSetting");
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
| **settingId** | **String**|  | |

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


## getSetting

> Object getSetting(settingId)

Get Setting

Get the a specific setting from the database

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        String settingId = "settingId_example"; // String | 
        try {
            Object result = apiInstance.getSetting(settingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#getSetting");
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
| **settingId** | **String**|  | |

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


## getSettings

> Object getSettings(search)

Get Settings

Get the entire list of settings available in the database

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        String search = ""; // String | 
        try {
            Object result = apiInstance.getSettings(search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#getSettings");
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
| **search** | **String**|  | [optional] [default to ] |

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


## updateSetting

> Object updateSetting(settingId, settingBody)

Update Setting

Update a specific setting in the database if it exists

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        String settingId = "settingId_example"; // String | 
        SettingBody settingBody = new SettingBody(); // SettingBody | 
        try {
            Object result = apiInstance.updateSetting(settingId, settingBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#updateSetting");
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
| **settingId** | **String**|  | |
| **settingBody** | [**SettingBody**](SettingBody.md)|  | |

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

