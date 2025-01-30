# RabbitHoleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllowedMimetypes**](RabbitHoleApi.md#getAllowedMimetypes) | **GET** /rabbithole/allowed-mimetypes | Get Allowed Mimetypes |
| [**uploadFile**](RabbitHoleApi.md#uploadFile) | **POST** /rabbithole/ | Upload File |
| [**uploadFiles**](RabbitHoleApi.md#uploadFiles) | **POST** /rabbithole/batch | Upload Files |
| [**uploadMemory**](RabbitHoleApi.md#uploadMemory) | **POST** /rabbithole/memory | Upload Memory |
| [**uploadUrl**](RabbitHoleApi.md#uploadUrl) | **POST** /rabbithole/web | Upload Url |



## getAllowedMimetypes

> Object getAllowedMimetypes()

Get Allowed Mimetypes

Retrieve the allowed mimetypes that can be ingested by the Rabbit Hole

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
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


## uploadFile

> Object uploadFile(_file, chunkSize, chunkOverlap, metadata)

Upload File

Upload a file containing text (.txt, .md, .pdf, etc.). File content will be extracted and segmented into chunks.
Chunks will be then vectorized and stored into documents memory.

Note
----------
`chunk_size`, `chunk_overlap` anad `metadata` must be passed as form data.
This is necessary because the HTTP protocol does not allow file uploads to be sent as JSON.

Example
----------
```
content_type = "application/pdf"
file_name = "sample.pdf"
file_path = f"tests/mocks/{file_name}"
with open(file_path, "rb") as f:
    files = {"file": (file_name, f, content_type)}

    metadata = {
        "source": "sample.pdf",
        "title": "Test title",
        "author": "Test author",
        "year": 2020,
    }
    # upload file endpoint only accepts form-encoded data
    payload = {
        "chunk_size": 128,
        "metadata": json.dumps(metadata)
    }

    response = requests.post(
        "http://localhost:1865/rabbithole/",
        files=files,
        data=payload
    )
```

### Example

```java
import java.io.File;
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.RabbitHoleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RabbitHoleApi apiInstance = new RabbitHoleApi(defaultClient);
        File _file = new File("/path/to/file"); // File | 
        Integer chunkSize = 56; // Integer | 
        Integer chunkOverlap = 56; // Integer | 
        String metadata = "{}"; // String | Metadata to be stored with each chunk (e.g. author, category, etc.). Since we are passing this along side form data, must be a JSON string (use `json.dumps(metadata)`).
        try {
            Object result = apiInstance.uploadFile(_file, chunkSize, chunkOverlap, metadata);
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
| **metadata** | **String**| Metadata to be stored with each chunk (e.g. author, category, etc.). Since we are passing this along side form data, must be a JSON string (use &#x60;json.dumps(metadata)&#x60;). | [optional] [default to {}] |

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


## uploadFiles

> Object uploadFiles(files, chunkSize, chunkOverlap, metadata)

Upload Files

Batch upload multiple files containing text (.txt, .md, .pdf, etc.). File content will be extracted and segmented into chunks.
Chunks will be then vectorized and stored into documents memory.

Note
----------
`chunk_size`, `chunk_overlap` anad `metadata` must be passed as form data.
This is necessary because the HTTP protocol does not allow file uploads to be sent as JSON.

Example
----------
```
files = []
files_to_upload = {"sample.pdf":"application/pdf","sample.txt":"application/txt"}

for file_name in files_to_upload:
    content_type = files_to_upload[file_name]
    file_path = f"tests/mocks/{file_name}"
    files.append(  ("files", ((file_name, open(file_path, "rb"), content_type))) )


metadata = {
    "sample.pdf":{
        "source": "sample.pdf",
        "title": "Test title",
        "author": "Test author",
        "year": 2020
    },
    "sample.txt":{
        "source": "sample.txt",
        "title": "Test title",
        "author": "Test author",
        "year": 2021
    }
}
    
# upload file endpoint only accepts form-encoded data
payload = {
    "chunk_size": 128,
    "metadata": json.dumps(metadata)
}

response = requests.post(
    "http://localhost:1865/rabbithole/batch",
    files=files,
    data=payload
)
```

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.RabbitHoleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RabbitHoleApi apiInstance = new RabbitHoleApi(defaultClient);
        List<File> files = Arrays.asList(); // List<File> | 
        Integer chunkSize = 56; // Integer | 
        Integer chunkOverlap = 56; // Integer | 
        String metadata = "{}"; // String | Metadata to be stored where each key is the name of a file being uploaded, and the corresponding value is another dictionary containing metadata specific to that file. Since we are passing this along side form data, metadata must be a JSON string (use `json.dumps(metadata)`).
        try {
            Object result = apiInstance.uploadFiles(files, chunkSize, chunkOverlap, metadata);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RabbitHoleApi#uploadFiles");
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
| **files** | **List&lt;File&gt;**|  | |
| **chunkSize** | **Integer**|  | [optional] |
| **chunkOverlap** | **Integer**|  | [optional] |
| **metadata** | **String**| Metadata to be stored where each key is the name of a file being uploaded, and the corresponding value is another dictionary containing metadata specific to that file. Since we are passing this along side form data, metadata must be a JSON string (use &#x60;json.dumps(metadata)&#x60;). | [optional] [default to {}] |

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


## uploadMemory

> Object uploadMemory(_file)

Upload Memory

Upload a memory json file to the cat memory

### Example

```java
import java.io.File;
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
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


## uploadUrl

> Object uploadUrl(uploadURLConfig)

Upload Url

Upload a url. Website content will be extracted and segmented into chunks.
Chunks will be then vectorized and stored into documents memory.

### Example

```java
// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.model.*;
import it.baccan.cheshirecat.service.RabbitHoleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RabbitHoleApi apiInstance = new RabbitHoleApi(defaultClient);
        UploadURLConfig uploadURLConfig = new UploadURLConfig(); // UploadURLConfig | 
        try {
            Object result = apiInstance.uploadUrl(uploadURLConfig);
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
| **uploadURLConfig** | [**UploadURLConfig**](UploadURLConfig.md)|  | |

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

