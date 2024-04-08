# MemoryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCollections**](MemoryApi.md#getCollections) | **GET** /memory/collections | Get Collections |
| [**getConversationHistory**](MemoryApi.md#getConversationHistory) | **GET** /memory/conversation_history | Get Conversation History |
| [**recallMemoriesFromText**](MemoryApi.md#recallMemoriesFromText) | **GET** /memory/recall | Recall Memories From Text |
| [**wipeCollections**](MemoryApi.md#wipeCollections) | **DELETE** /memory/collections | Wipe Collections |
| [**wipeConversationHistory**](MemoryApi.md#wipeConversationHistory) | **DELETE** /memory/conversation_history | Wipe Conversation History |
| [**wipeMemoryPoint**](MemoryApi.md#wipeMemoryPoint) | **DELETE** /memory/collections/{collection_id}/points/{memory_id} | Wipe Memory Point |
| [**wipeMemoryPointsByMetadata**](MemoryApi.md#wipeMemoryPointsByMetadata) | **DELETE** /memory/collections/{collection_id}/points | Wipe Memory Points By Metadata |
| [**wipeSingleCollection**](MemoryApi.md#wipeSingleCollection) | **DELETE** /memory/collections/{collection_id} | Wipe Single Collection |


<a id="getCollections"></a>
# **getCollections**
> Object getCollections()

Get Collections

Get list of available collections

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MemoryApi apiInstance = new MemoryApi(defaultClient);
    try {
      Object result = apiInstance.getCollections();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoryApi#getCollections");
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

<a id="getConversationHistory"></a>
# **getConversationHistory**
> Object getConversationHistory()

Get Conversation History

Get the specified user&#39;s conversation history from working memory

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MemoryApi apiInstance = new MemoryApi(defaultClient);
    try {
      Object result = apiInstance.getConversationHistory();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoryApi#getConversationHistory");
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

<a id="recallMemoriesFromText"></a>
# **recallMemoriesFromText**
> Object recallMemoriesFromText(text, k)

Recall Memories From Text

Search k memories similar to given text.

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MemoryApi apiInstance = new MemoryApi(defaultClient);
    String text = "text_example"; // String | Find memories similar to this text.
    Integer k = 100; // Integer | How many memories to return.
    try {
      Object result = apiInstance.recallMemoriesFromText(text, k);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoryApi#recallMemoriesFromText");
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
| **text** | **String**| Find memories similar to this text. | |
| **k** | **Integer**| How many memories to return. | [optional] [default to 100] |

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

<a id="wipeCollections"></a>
# **wipeCollections**
> Object wipeCollections()

Wipe Collections

Delete and create all collections

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MemoryApi apiInstance = new MemoryApi(defaultClient);
    try {
      Object result = apiInstance.wipeCollections();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoryApi#wipeCollections");
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

<a id="wipeConversationHistory"></a>
# **wipeConversationHistory**
> Object wipeConversationHistory()

Wipe Conversation History

Delete the specified user&#39;s conversation history from working memory

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MemoryApi apiInstance = new MemoryApi(defaultClient);
    try {
      Object result = apiInstance.wipeConversationHistory();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoryApi#wipeConversationHistory");
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

<a id="wipeMemoryPoint"></a>
# **wipeMemoryPoint**
> Object wipeMemoryPoint(collectionId, memoryId)

Wipe Memory Point

Delete a specific point in memory

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MemoryApi apiInstance = new MemoryApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String memoryId = "memoryId_example"; // String | 
    try {
      Object result = apiInstance.wipeMemoryPoint(collectionId, memoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoryApi#wipeMemoryPoint");
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
| **collectionId** | **String**|  | |
| **memoryId** | **String**|  | |

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

<a id="wipeMemoryPointsByMetadata"></a>
# **wipeMemoryPointsByMetadata**
> Object wipeMemoryPointsByMetadata(collectionId, body)

Wipe Memory Points By Metadata

Delete points in memory by filter

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MemoryApi apiInstance = new MemoryApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    Object body = null; // Object | 
    try {
      Object result = apiInstance.wipeMemoryPointsByMetadata(collectionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoryApi#wipeMemoryPointsByMetadata");
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
| **collectionId** | **String**|  | |
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

<a id="wipeSingleCollection"></a>
# **wipeSingleCollection**
> Object wipeSingleCollection(collectionId)

Wipe Single Collection

Delete and recreate a collection

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MemoryApi apiInstance = new MemoryApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    try {
      Object result = apiInstance.wipeSingleCollection(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoryApi#wipeSingleCollection");
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
| **collectionId** | **String**|  | |

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

