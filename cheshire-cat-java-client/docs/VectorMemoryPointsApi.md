# VectorMemoryPointsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMemoryPoint**](VectorMemoryPointsApi.md#createMemoryPoint) | **POST** /memory/collections/{collection_id}/points | Create Memory Point |
| [**deleteMemoryPoint**](VectorMemoryPointsApi.md#deleteMemoryPoint) | **DELETE** /memory/collections/{collection_id}/points/{point_id} | Delete Memory Point |
| [**deleteMemoryPointsByMetadata**](VectorMemoryPointsApi.md#deleteMemoryPointsByMetadata) | **DELETE** /memory/collections/{collection_id}/points | Delete Memory Points By Metadata |
| [**editMemoryPoint**](VectorMemoryPointsApi.md#editMemoryPoint) | **PUT** /memory/collections/{collection_id}/points/{point_id} | Edit Memory Point |
| [**getPointsInCollection**](VectorMemoryPointsApi.md#getPointsInCollection) | **GET** /memory/collections/{collection_id}/points | Get Points In Collection |
| [**recallMemoryPoints**](VectorMemoryPointsApi.md#recallMemoryPoints) | **POST** /memory/recall | Recall Memory Points |
| [**recallMemoryPointsFromText**](VectorMemoryPointsApi.md#recallMemoryPointsFromText) | **GET** /memory/recall | Recall Memory Points From Text |



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
import it.baccan.cheshirecat.service.VectorMemoryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VectorMemoryPointsApi apiInstance = new VectorMemoryPointsApi(defaultClient);
        String collectionId = "collectionId_example"; // String | 
        MemoryPointBase memoryPointBase = new MemoryPointBase(); // MemoryPointBase | 
        try {
            MemoryPoint result = apiInstance.createMemoryPoint(collectionId, memoryPointBase);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorMemoryPointsApi#createMemoryPoint");
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
import it.baccan.cheshirecat.service.VectorMemoryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VectorMemoryPointsApi apiInstance = new VectorMemoryPointsApi(defaultClient);
        String collectionId = "collectionId_example"; // String | 
        String pointId = "pointId_example"; // String | 
        try {
            Object result = apiInstance.deleteMemoryPoint(collectionId, pointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorMemoryPointsApi#deleteMemoryPoint");
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
import it.baccan.cheshirecat.service.VectorMemoryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VectorMemoryPointsApi apiInstance = new VectorMemoryPointsApi(defaultClient);
        String collectionId = "collectionId_example"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.deleteMemoryPointsByMetadata(collectionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorMemoryPointsApi#deleteMemoryPointsByMetadata");
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


## editMemoryPoint

> MemoryPoint editMemoryPoint(collectionId, pointId, memoryPointBase)

Edit Memory Point

Edit a point in memory


Example
----------
```

collection = "declarative"
content = "MIAO!"
metadata = {"custom_key": "custom_value"}
req_json = {
    "content": content,
    "metadata": metadata,
}
# create a point
res = requests.post(
    f"http://localhost:1865/memory/collections/{collection}/points", json=req_json
)
json = res.json()
#get the id
point_id = json["id"]
# new point values
content = "NEW MIAO!"
metadata = {"custom_key": "new_custom_value"}
req_json = {
    "content": content,
    "metadata": metadata,
}

# edit the point
res = requests.put(
    f"http://localhost:1865/memory/collections/{collection}/points/{point_id}", json=req_json
)
json = res.json()
print(json)
```

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.VectorMemoryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VectorMemoryPointsApi apiInstance = new VectorMemoryPointsApi(defaultClient);
        String collectionId = "collectionId_example"; // String | 
        String pointId = "pointId_example"; // String | 
        MemoryPointBase memoryPointBase = new MemoryPointBase(); // MemoryPointBase | 
        try {
            MemoryPoint result = apiInstance.editMemoryPoint(collectionId, pointId, memoryPointBase);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorMemoryPointsApi#editMemoryPoint");
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


## getPointsInCollection

> Object getPointsInCollection(collectionId, limit, offset)

Get Points In Collection

Retrieve all the points from a single collection


Example
----------
```
collection = "declarative"
res = requests.get(
    f"http://localhost:1865/memory/collections/{collection}/points",
)
json = res.json()
points = json["points"]

for point in points:
    payload = point["payload"]
    vector = point["vector"]
    print(payload)
    print(vector)
```

Example using offset
----------
```
# get all the points with limit 10
limit = 10
next_offset = ""
collection = "declarative"

while True:
    res = requests.get(
        f"http://localhost:1865/memory/collections/{collection}/points?limit={limit}&offset={next_offset}",
    )
    json = res.json()
    points = json["points"]
    next_offset = json["next_offset"]

    for point in points:
        payload = point["payload"]
        vector = point["vector"]
        print(payload)
        print(vector)
    
    if next_offset is None:
        break
```

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.VectorMemoryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VectorMemoryPointsApi apiInstance = new VectorMemoryPointsApi(defaultClient);
        String collectionId = "collectionId_example"; // String | 
        Integer limit = 100; // Integer | How many points to return
        String offset = "offset_example"; // String | If provided (or not empty string) - skip points with ids less than given `offset`
        try {
            Object result = apiInstance.getPointsInCollection(collectionId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorMemoryPointsApi#getPointsInCollection");
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
| **limit** | **Integer**| How many points to return | [optional] [default to 100] |
| **offset** | **String**| If provided (or not empty string) - skip points with ids less than given &#x60;offset&#x60; | [optional] |

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


## recallMemoryPoints

> Object recallMemoryPoints(bodyRecallMemoryPoints)

Recall Memory Points

Search k memories similar to given text with specified metadata criteria.
    
Example
----------
```
collection = "episodic"
content = "MIAO!"
metadata = {"custom_key": "custom_value"}
req_json = {
    "content": content,
    "metadata": metadata,
}
# create a point
res = requests.post(
    f"http://localhost:1865/memory/collections/{collection}/points", json=req_json
)

# recall with metadata
req_json = {
    "text": "CAT", 
    "metadata":{"custom_key":"custom_value"}
}
res = requests.post(
    f"http://localhost:1865/memory/recall", json=req_json
)
json = res.json()
print(json)
```

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.VectorMemoryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VectorMemoryPointsApi apiInstance = new VectorMemoryPointsApi(defaultClient);
        BodyRecallMemoryPoints bodyRecallMemoryPoints = new BodyRecallMemoryPoints(); // BodyRecallMemoryPoints | 
        try {
            Object result = apiInstance.recallMemoryPoints(bodyRecallMemoryPoints);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorMemoryPointsApi#recallMemoryPoints");
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
| **bodyRecallMemoryPoints** | [**BodyRecallMemoryPoints**](BodyRecallMemoryPoints.md)|  | |

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


## recallMemoryPointsFromText

> Object recallMemoryPointsFromText(text, k)

Recall Memory Points From Text

Search k memories similar to given text.

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.VectorMemoryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VectorMemoryPointsApi apiInstance = new VectorMemoryPointsApi(defaultClient);
        String text = "text_example"; // String | Find memories similar to this text.
        Integer k = 100; // Integer | How many memories to return.
        try {
            Object result = apiInstance.recallMemoryPointsFromText(text, k);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VectorMemoryPointsApi#recallMemoryPointsFromText");
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

