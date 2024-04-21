# EmbedderApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEmbedderSettings**](EmbedderApi.md#getEmbedderSettings) | **GET** /embedder/settings/{languageEmbedderName} | Get Embedder Settings |
| [**getEmbeddersSettings**](EmbedderApi.md#getEmbeddersSettings) | **GET** /embedder/settings | Get Embedders Settings |
| [**upsertEmbedderSetting**](EmbedderApi.md#upsertEmbedderSetting) | **PUT** /embedder/settings/{languageEmbedderName} | Upsert Embedder Setting |


<a id="getEmbedderSettings"></a>
# **getEmbedderSettings**
> Object getEmbedderSettings(languageEmbedderName)

Get Embedder Settings

Get settings and schema of the specified Embedder

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.EmbedderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmbedderApi apiInstance = new EmbedderApi(defaultClient);
    String languageEmbedderName = "languageEmbedderName_example"; // String | 
    try {
      Object result = apiInstance.getEmbedderSettings(languageEmbedderName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedderApi#getEmbedderSettings");
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
| **languageEmbedderName** | **String**|  | |

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

<a id="getEmbeddersSettings"></a>
# **getEmbeddersSettings**
> Object getEmbeddersSettings()

Get Embedders Settings

Get the list of the Embedders

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.EmbedderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmbedderApi apiInstance = new EmbedderApi(defaultClient);
    try {
      Object result = apiInstance.getEmbeddersSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedderApi#getEmbeddersSettings");
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

<a id="upsertEmbedderSetting"></a>
# **upsertEmbedderSetting**
> Object upsertEmbedderSetting(languageEmbedderName, body)

Upsert Embedder Setting

Upsert the Embedder setting

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.EmbedderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmbedderApi apiInstance = new EmbedderApi(defaultClient);
    String languageEmbedderName = "languageEmbedderName_example"; // String | 
    Object body = null; // Object | 
    try {
      Object result = apiInstance.upsertEmbedderSetting(languageEmbedderName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedderApi#upsertEmbedderSetting");
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
| **languageEmbedderName** | **String**|  | |
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

