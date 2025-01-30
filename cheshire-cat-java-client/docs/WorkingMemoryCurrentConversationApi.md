# WorkingMemoryCurrentConversationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConversationHistory**](WorkingMemoryCurrentConversationApi.md#getConversationHistory) | **GET** /memory/conversation_history | Get Conversation History |
| [**wipeConversationHistory**](WorkingMemoryCurrentConversationApi.md#wipeConversationHistory) | **DELETE** /memory/conversation_history | Wipe Conversation History |



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
import it.baccan.cheshirecat.service.WorkingMemoryCurrentConversationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        WorkingMemoryCurrentConversationApi apiInstance = new WorkingMemoryCurrentConversationApi(defaultClient);
        try {
            Object result = apiInstance.getConversationHistory();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkingMemoryCurrentConversationApi#getConversationHistory");
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
import it.baccan.cheshirecat.service.WorkingMemoryCurrentConversationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        WorkingMemoryCurrentConversationApi apiInstance = new WorkingMemoryCurrentConversationApi(defaultClient);
        try {
            Object result = apiInstance.wipeConversationHistory();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkingMemoryCurrentConversationApi#wipeConversationHistory");
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

