# VectorMemoryCollectionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCollections**](VectorMemoryCollectionsApi.md#getCollections) | **GET** /memory/collections | Get Collections |
| [**wipeCollections**](VectorMemoryCollectionsApi.md#wipeCollections) | **DELETE** /memory/collections | Wipe Collections |
| [**wipeSingleCollection**](VectorMemoryCollectionsApi.md#wipeSingleCollection) | **DELETE** /memory/collections/{collection_id} | Wipe Single Collection |



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
import it.baccan.cheshirecat.service.VectorMemoryCollectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VectorMemoryCollectionsApi apiInstance = new VectorMemoryCollectionsApi(defaultClient);
        try {
            Object result = apiInstance.getCollections();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorMemoryCollectionsApi#getCollections");
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
import it.baccan.cheshirecat.service.VectorMemoryCollectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VectorMemoryCollectionsApi apiInstance = new VectorMemoryCollectionsApi(defaultClient);
        try {
            Object result = apiInstance.wipeCollections();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorMemoryCollectionsApi#wipeCollections");
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
import it.baccan.cheshirecat.service.VectorMemoryCollectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VectorMemoryCollectionsApi apiInstance = new VectorMemoryCollectionsApi(defaultClient);
        String collectionId = "collectionId_example"; // String | 
        try {
            Object result = apiInstance.wipeSingleCollection(collectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorMemoryCollectionsApi#wipeSingleCollection");
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

