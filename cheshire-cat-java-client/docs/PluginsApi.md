# PluginsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePlugin**](PluginsApi.md#deletePlugin) | **DELETE** /plugins/{plugin_id} | Delete Plugin |
| [**getAvailablePlugins**](PluginsApi.md#getAvailablePlugins) | **GET** /plugins/ | Get Available Plugins |
| [**getPluginDetails**](PluginsApi.md#getPluginDetails) | **GET** /plugins/{plugin_id} | Get Plugin Details |
| [**getPluginSettings**](PluginsApi.md#getPluginSettings) | **GET** /plugins/settings/{plugin_id} | Get Plugin Settings |
| [**getPluginsSettings**](PluginsApi.md#getPluginsSettings) | **GET** /plugins/settings | Get Plugins Settings |
| [**installPlugin**](PluginsApi.md#installPlugin) | **POST** /plugins/upload | Install Plugin |
| [**installPluginFromRegistry**](PluginsApi.md#installPluginFromRegistry) | **POST** /plugins/upload/registry | Install Plugin From Registry |
| [**togglePlugin**](PluginsApi.md#togglePlugin) | **PUT** /plugins/toggle/{plugin_id} | Toggle Plugin |
| [**upsertPluginSettings**](PluginsApi.md#upsertPluginSettings) | **PUT** /plugins/settings/{plugin_id} | Upsert Plugin Settings |


<a id="deletePlugin"></a>
# **deletePlugin**
> Object deletePlugin(pluginId)

Delete Plugin

Physically remove plugin.

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
      Object result = apiInstance.deletePlugin(pluginId);
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

<a id="getAvailablePlugins"></a>
# **getAvailablePlugins**
> Object getAvailablePlugins(query)

Get Available Plugins

List available plugins

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
      Object result = apiInstance.getAvailablePlugins(query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginsApi#getAvailablePlugins");
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

<a id="getPluginDetails"></a>
# **getPluginDetails**
> Object getPluginDetails(pluginId)

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
      Object result = apiInstance.getPluginDetails(pluginId);
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

<a id="getPluginSettings"></a>
# **getPluginSettings**
> Object getPluginSettings(pluginId)

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
      Object result = apiInstance.getPluginSettings(pluginId);
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

<a id="getPluginsSettings"></a>
# **getPluginsSettings**
> Object getPluginsSettings()

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
      Object result = apiInstance.getPluginsSettings();
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

<a id="installPlugin"></a>
# **installPlugin**
> Object installPlugin(_file)

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
      Object result = apiInstance.installPlugin(_file);
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

**Object**

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
> Object installPluginFromRegistry(body)

Install Plugin From Registry

Install a new plugin from registry

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
    Object body = null; // Object | 
    try {
      Object result = apiInstance.installPluginFromRegistry(body);
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

<a id="togglePlugin"></a>
# **togglePlugin**
> Object togglePlugin(pluginId)

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
      Object result = apiInstance.togglePlugin(pluginId);
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

<a id="upsertPluginSettings"></a>
# **upsertPluginSettings**
> Object upsertPluginSettings(pluginId, body)

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
    Object body = null; // Object | 
    try {
      Object result = apiInstance.upsertPluginSettings(pluginId, body);
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

