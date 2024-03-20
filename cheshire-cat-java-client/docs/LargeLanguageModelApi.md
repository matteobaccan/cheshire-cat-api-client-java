# LargeLanguageModelApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLlmSettings**](LargeLanguageModelApi.md#getLlmSettings) | **GET** /llm/settings/{languageModelName} | Get Llm Settings |
| [**getLlmsSettings**](LargeLanguageModelApi.md#getLlmsSettings) | **GET** /llm/settings | Get LLMs Settings |
| [**upsertLlmSetting**](LargeLanguageModelApi.md#upsertLlmSetting) | **PUT** /llm/settings/{languageModelName} | Upsert LLM Setting |


<a id="getLlmSettings"></a>
# **getLlmSettings**
> Setting getLlmSettings(languageModelName)

Get Llm Settings

Get settings and schema of the specified Large Language Model

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.LargeLanguageModelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LargeLanguageModelApi apiInstance = new LargeLanguageModelApi(defaultClient);
    String languageModelName = "languageModelName_example"; // String | 
    try {
      Setting result = apiInstance.getLlmSettings(languageModelName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LargeLanguageModelApi#getLlmSettings");
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
| **languageModelName** | **String**|  | |

### Return type

[**Setting**](Setting.md)

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

<a id="getLlmsSettings"></a>
# **getLlmsSettings**
> SettingsResponse getLlmsSettings()

Get LLMs Settings

Get the list of the Large Language Models

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.LargeLanguageModelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LargeLanguageModelApi apiInstance = new LargeLanguageModelApi(defaultClient);
    try {
      SettingsResponse result = apiInstance.getLlmsSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LargeLanguageModelApi#getLlmsSettings");
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

<a id="upsertLlmSetting"></a>
# **upsertLlmSetting**
> Setting upsertLlmSetting(languageModelName, body)

Upsert LLM Setting

Upsert the Large Language Model setting

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.LargeLanguageModelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LargeLanguageModelApi apiInstance = new LargeLanguageModelApi(defaultClient);
    String languageModelName = "languageModelName_example"; // String | 
    Object body = {"openai_api_key":"your-key-here"}; // Object | 
    try {
      Setting result = apiInstance.upsertLlmSetting(languageModelName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LargeLanguageModelApi#upsertLlmSetting");
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
| **languageModelName** | **String**|  | |
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

