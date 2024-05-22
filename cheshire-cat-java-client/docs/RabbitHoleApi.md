# RabbitHoleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllowedMimetypes**](RabbitHoleApi.md#getAllowedMimetypes) | **GET** /rabbithole/allowed-mimetypes | Get Allowed Mimetypes |
| [**uploadFile**](RabbitHoleApi.md#uploadFile) | **POST** /rabbithole/ | Upload File |
| [**uploadMemory**](RabbitHoleApi.md#uploadMemory) | **POST** /rabbithole/memory | Upload Memory |
| [**uploadUrl**](RabbitHoleApi.md#uploadUrl) | **POST** /rabbithole/web | Upload Url |


<a id="getAllowedMimetypes"></a>
# **getAllowedMimetypes**
> Object getAllowedMimetypes()

Get Allowed Mimetypes

Retrieve the allowed mimetypes that can be ingested by the Rabbit Hole

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.RabbitHoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RabbitHoleApi apiInstance = new RabbitHoleApi(defaultClient);
    try {
      Object result = apiInstance.getAllowedMimetypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RabbitHoleApi#getAllowedMimetypes");
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

<a id="uploadFile"></a>
# **uploadFile**
> Object uploadFile(_file, chunkSize, chunkOverlap)

Upload File

Upload a file containing text (.txt, .md, .pdf, etc.). File content will be extracted and segmented into chunks. Chunks will be then vectorized and stored into documents memory.

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.RabbitHoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RabbitHoleApi apiInstance = new RabbitHoleApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    Integer chunkSize = 56; // Integer | 
    Integer chunkOverlap = 56; // Integer | 
    try {
      Object result = apiInstance.uploadFile(_file, chunkSize, chunkOverlap);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RabbitHoleApi#uploadFile");
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
| **chunkSize** | **Integer**|  | [optional] |
| **chunkOverlap** | **Integer**|  | [optional] |

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

<a id="uploadMemory"></a>
# **uploadMemory**
> Object uploadMemory(_file)

Upload Memory

Upload a memory json file to the cat memory

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.RabbitHoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RabbitHoleApi apiInstance = new RabbitHoleApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    try {
      Object result = apiInstance.uploadMemory(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RabbitHoleApi#uploadMemory");
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

<a id="uploadUrl"></a>
# **uploadUrl**
> Object uploadUrl(bodyUploadUrl)

Upload Url

Upload a url. Website content will be extracted and segmented into chunks. Chunks will be then vectorized and stored into documents memory.

### Example
```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.RabbitHoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RabbitHoleApi apiInstance = new RabbitHoleApi(defaultClient);
    BodyUploadUrl bodyUploadUrl = new BodyUploadUrl(); // BodyUploadUrl | 
    try {
      Object result = apiInstance.uploadUrl(bodyUploadUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RabbitHoleApi#uploadUrl");
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

