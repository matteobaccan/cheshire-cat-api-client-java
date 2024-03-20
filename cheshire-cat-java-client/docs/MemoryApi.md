# MemoryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePointInMemory**](MemoryApi.md#deletePointInMemory) | **DELETE** /memory/collections/{collection_id}/points/{memory_id} | Delete Point In Memory |
| [**getCollections**](MemoryApi.md#getCollections) | **GET** /memory/collections | Get Collections |
| [**getConversationHistory**](MemoryApi.md#getConversationHistory) | **GET** /memory/conversation_history | Get Conversation History |
| [**recallMemoriesFromText**](MemoryApi.md#recallMemoriesFromText) | **GET** /memory/recall | Recall Memories From Text |
| [**wipeCollections**](MemoryApi.md#wipeCollections) | **DELETE** /memory/collections | Wipe Collections |
| [**wipeConversationHistory**](MemoryApi.md#wipeConversationHistory) | **DELETE** /memory/conversation_history | Wipe Conversation History |
| [**wipeMemoryPoints**](MemoryApi.md#wipeMemoryPoints) | **DELETE** /memory/collections/{collection_id}/points | Wipe Memory Points By Metadata |
| [**wipeSingleCollection**](MemoryApi.md#wipeSingleCollection) | **DELETE** /memory/collections/{collection_id} | Wipe Single Collection |


<a id="deletePointInMemory"></a>
# **deletePointInMemory**
> List&lt;String&gt; deletePointInMemory(collectionId, memoryId)

Delete Point In Memory

Delete specific point in memory

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
      List<String> result = apiInstance.deletePointInMemory(collectionId, memoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoryApi#deletePointInMemory");
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

<a id="getCollections"></a>
# **getCollections**
> CollectionsList getCollections()

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
      CollectionsList result = apiInstance.getCollections();
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

[**CollectionsList**](CollectionsList.md)

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
> ConversationHistory getConversationHistory()

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
      ConversationHistory result = apiInstance.getConversationHistory();
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

[**ConversationHistory**](ConversationHistory.md)

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
> MemoryRecall recallMemoriesFromText(text, k)

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
      MemoryRecall result = apiInstance.recallMemoriesFromText(text, k);
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

[**MemoryRecall**](MemoryRecall.md)

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
> List&lt;String&gt; wipeCollections()

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
      List<String> result = apiInstance.wipeCollections();
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

<a id="wipeConversationHistory"></a>
# **wipeConversationHistory**
> List&lt;String&gt; wipeConversationHistory()

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
      List<String> result = apiInstance.wipeConversationHistory();
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

<a id="wipeMemoryPoints"></a>
# **wipeMemoryPoints**
> List&lt;String&gt; wipeMemoryPoints(collectionId, body)

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
      List<String> result = apiInstance.wipeMemoryPoints(collectionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoryApi#wipeMemoryPoints");
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

**List&lt;String&gt;**

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
> List&lt;String&gt; wipeSingleCollection(collectionId)

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
      List<String> result = apiInstance.wipeSingleCollection(collectionId);
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

