# PluginsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePlugin**](PluginsApi.md#deletePlugin) | **DELETE** /plugins/{plugin_id} | Delete Plugin |
| [**getPluginDetails**](PluginsApi.md#getPluginDetails) | **GET** /plugins/{plugin_id} | Get Plugin Details |
| [**getPluginSettings**](PluginsApi.md#getPluginSettings) | **GET** /plugins/settings/{plugin_id} | Get Plugin Settings |
| [**getPluginsSettings**](PluginsApi.md#getPluginsSettings) | **GET** /plugins/settings | Get Plugins Settings |
| [**installPlugin**](PluginsApi.md#installPlugin) | **POST** /plugins/upload | Install Plugin |
| [**installPluginFromRegistry**](PluginsApi.md#installPluginFromRegistry) | **POST** /plugins/upload/registry | Install Plugin From Registry |
| [**listAvailablePlugins**](PluginsApi.md#listAvailablePlugins) | **GET** /plugins | List Available Plugins |
| [**togglePlugin**](PluginsApi.md#togglePlugin) | **PUT** /plugins/toggle/{plugin_id} | Toggle Plugin |
| [**upsertPluginSettings**](PluginsApi.md#upsertPluginSettings) | **PUT** /plugins/settings/{plugin_id} | Upsert Plugin Settings |


<a id="deletePlugin"></a>
# **deletePlugin**
> List&lt;String&gt; deletePlugin(pluginId)

Delete Plugin

Physically remove a plugin

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.PluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PluginsApi apiInstance = new PluginsApi(defaultClient);
    String pluginId = "pluginId_example"; // String | 
    try {
      List<String> result = apiInstance.deletePlugin(pluginId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginsApi#deletePlugin");
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
| **pluginId** | **String**|  | |

### Return type

**List&lt;String&gt;**

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

<a id="getPluginDetails"></a>
# **getPluginDetails**
> Plugin getPluginDetails(pluginId)

Get Plugin Details

Returns information on a single plugin

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.PluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PluginsApi apiInstance = new PluginsApi(defaultClient);
    String pluginId = "pluginId_example"; // String | 
    try {
      Plugin result = apiInstance.getPluginDetails(pluginId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginsApi#getPluginDetails");
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
| **pluginId** | **String**|  | |

### Return type

[**Plugin**](Plugin.md)

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

<a id="getPluginSettings"></a>
# **getPluginSettings**
> GetPluginSettings200Response getPluginSettings(pluginId)

Get Plugin Settings

Returns the settings of a specific plugin

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.PluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PluginsApi apiInstance = new PluginsApi(defaultClient);
    String pluginId = "pluginId_example"; // String | 
    try {
      GetPluginSettings200Response result = apiInstance.getPluginSettings(pluginId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginsApi#getPluginSettings");
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
| **pluginId** | **String**|  | |

### Return type

[**GetPluginSettings200Response**](GetPluginSettings200Response.md)

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

<a id="getPluginsSettings"></a>
# **getPluginsSettings**
> SettingsResponse getPluginsSettings()

Get Plugins Settings

Returns the settings of all the plugins

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.PluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PluginsApi apiInstance = new PluginsApi(defaultClient);
    try {
      SettingsResponse result = apiInstance.getPluginsSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginsApi#getPluginsSettings");
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

[**SettingsResponse**](SettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a id="installPlugin"></a>
# **installPlugin**
> FileResponse installPlugin(_file)

Install Plugin

Install a new plugin from a zip file

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.PluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PluginsApi apiInstance = new PluginsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    try {
      FileResponse result = apiInstance.installPlugin(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginsApi#installPlugin");
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
| **_file** | **File**|  | |

### Return type

[**FileResponse**](FileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="installPluginFromRegistry"></a>
# **installPluginFromRegistry**
> FileResponse installPluginFromRegistry(bodyUploadUrl)

Install Plugin From Registry

Install a new plugin from external repository

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.PluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PluginsApi apiInstance = new PluginsApi(defaultClient);
    BodyUploadUrl bodyUploadUrl = new BodyUploadUrl(); // BodyUploadUrl | 
    try {
      FileResponse result = apiInstance.installPluginFromRegistry(bodyUploadUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginsApi#installPluginFromRegistry");
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
| **bodyUploadUrl** | [**BodyUploadUrl**](BodyUploadUrl.md)|  | |

### Return type

[**FileResponse**](FileResponse.md)

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

<a id="listAvailablePlugins"></a>
# **listAvailablePlugins**
> PluginsList listAvailablePlugins(query)

List Available Plugins

List both installed and registry plugins

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.PluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PluginsApi apiInstance = new PluginsApi(defaultClient);
    String query = "query_example"; // String | 
    try {
      PluginsList result = apiInstance.listAvailablePlugins(query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginsApi#listAvailablePlugins");
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
| **query** | **String**|  | [optional] |

### Return type

[**PluginsList**](PluginsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a id="togglePlugin"></a>
# **togglePlugin**
> ToggleResponse togglePlugin(pluginId)

Toggle Plugin

Enable or disable a single plugin

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.PluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PluginsApi apiInstance = new PluginsApi(defaultClient);
    String pluginId = "pluginId_example"; // String | 
    try {
      ToggleResponse result = apiInstance.togglePlugin(pluginId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginsApi#togglePlugin");
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
| **pluginId** | **String**|  | |

### Return type

[**ToggleResponse**](ToggleResponse.md)

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

<a id="upsertPluginSettings"></a>
# **upsertPluginSettings**
> Setting upsertPluginSettings(pluginId, body)

Upsert Plugin Settings

Updates the settings of a specific plugin

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.PluginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PluginsApi apiInstance = new PluginsApi(defaultClient);
    String pluginId = "pluginId_example"; // String | 
    Object body = {"setting_a":"some value","setting_b":"another value"}; // Object | 
    try {
      Setting result = apiInstance.upsertPluginSettings(pluginId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginsApi#upsertPluginSettings");
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
| **pluginId** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**Setting**](Setting.md)

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

