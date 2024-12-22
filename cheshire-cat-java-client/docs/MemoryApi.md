# MemoryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMemoryPoint**](MemoryApi.md#createMemoryPoint) | **POST** /memory/collections/{collection_id}/points | Create Memory Point |
| [**deleteMemoryPoint**](MemoryApi.md#deleteMemoryPoint) | **DELETE** /memory/collections/{collection_id}/points/{point_id} | Delete Memory Point |
| [**deleteMemoryPointsByMetadata**](MemoryApi.md#deleteMemoryPointsByMetadata) | **DELETE** /memory/collections/{collection_id}/points | Delete Memory Points By Metadata |
| [**getCollections**](MemoryApi.md#getCollections) | **GET** /memory/collections | Get Collections |
| [**getConversationHistory**](MemoryApi.md#getConversationHistory) | **GET** /memory/conversation_history | Get Conversation History |
| [**recallMemoriesFromText**](MemoryApi.md#recallMemoriesFromText) | **GET** /memory/recall | Recall Memories From Text |
| [**wipeCollections**](MemoryApi.md#wipeCollections) | **DELETE** /memory/collections | Wipe Collections |
| [**wipeConversationHistory**](MemoryApi.md#wipeConversationHistory) | **DELETE** /memory/conversation_history | Wipe Conversation History |
| [**wipeSingleCollection**](MemoryApi.md#wipeSingleCollection) | **DELETE** /memory/collections/{collection_id} | Wipe Single Collection |



## createMemoryPoint

> MemoryPoint createMemoryPoint(collectionId, memoryPointBase)

Create Memory Point

Create a point in memory

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        MemoryApi apiInstance = new MemoryApi(defaultClient);
        String collectionId = "collectionId_example"; // String | 
        MemoryPointBase memoryPointBase = new MemoryPointBase(); // MemoryPointBase | 
        try {
            MemoryPoint result = apiInstance.createMemoryPoint(collectionId, memoryPointBase);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MemoryApi#createMemoryPoint");
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
| **memoryPointBase** | [**MemoryPointBase**](MemoryPointBase.md)|  | |

### Return type

[**MemoryPoint**](MemoryPoint.md)

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


## deleteMemoryPoint

> Object deleteMemoryPoint(collectionId, pointId)

Delete Memory Point

Delete a specific point in memory

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        MemoryApi apiInstance = new MemoryApi(defaultClient);
        String collectionId = "collectionId_example"; // String | 
        String pointId = "pointId_example"; // String | 
        try {
            Object result = apiInstance.deleteMemoryPoint(collectionId, pointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MemoryApi#deleteMemoryPoint");
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
| **pointId** | **String**|  | |

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


## deleteMemoryPointsByMetadata

> Object deleteMemoryPointsByMetadata(collectionId, body)

Delete Memory Points By Metadata

Delete points in memory by filter

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.MemoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        MemoryApi apiInstance = new MemoryApi(defaultClient);
        String collectionId = "collectionId_example"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.deleteMemoryPointsByMetadata(collectionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MemoryApi#deleteMemoryPointsByMetadata");
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


## getCollections

> Object getCollections()

Get Collections

Get list of available collections

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
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


## getConversationHistory

> Object getConversationHistory()

Get Conversation History

Get the specified user's conversation history from working memory

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
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


## recallMemoriesFromText

> Object recallMemoriesFromText(text, k)

Recall Memories From Text

Search k memories similar to given text.

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
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


## wipeCollections

> Object wipeCollections()

Wipe Collections

Delete and create all collections

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
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


## wipeConversationHistory

> Object wipeConversationHistory()

Wipe Conversation History

Delete the specified user's conversation history from working memory

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
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


## wipeSingleCollection

> Object wipeSingleCollection(collectionId)

Wipe Single Collection

Delete and recreate a collection

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
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

