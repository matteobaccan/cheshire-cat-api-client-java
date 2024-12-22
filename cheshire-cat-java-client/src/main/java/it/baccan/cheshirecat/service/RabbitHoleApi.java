package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiResponse;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;
import it.baccan.cheshirecat.model.HTTPValidationError;
import it.baccan.cheshirecat.model.UploadURLConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RabbitHoleApi {
  private ApiClient apiClient;

  public RabbitHoleApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RabbitHoleApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Allowed Mimetypes
   * Retrieve the allowed mimetypes that can be ingested by the Rabbit Hole
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public Object getAllowedMimetypes() throws ApiException {
    return getAllowedMimetypesWithHttpInfo().getData();
  }

  /**
   * Get Allowed Mimetypes
   * Retrieve the allowed mimetypes that can be ingested by the Rabbit Hole
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> getAllowedMimetypesWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("RabbitHoleApi.getAllowedMimetypes", "/rabbithole/allowed-mimetypes", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Upload File
   * Upload a file containing text (.txt, .md, .pdf, etc.). File content will be extracted and segmented into chunks. Chunks will be then vectorized and stored into documents memory.  Note ---------- &#x60;chunk_size&#x60;, &#x60;chunk_overlap&#x60; anad &#x60;metadata&#x60; must be passed as form data. This is necessary because the HTTP protocol does not allow file uploads to be sent as JSON.  Example ---------- &#x60;&#x60;&#x60; content_type &#x3D; \&quot;application/pdf\&quot; file_name &#x3D; \&quot;sample.pdf\&quot; file_path &#x3D; f\&quot;tests/mocks/{file_name}\&quot; with open(file_path, \&quot;rb\&quot;) as f:     files &#x3D; {\&quot;file\&quot;: (file_name, f, content_type)}      metadata &#x3D; {         \&quot;source\&quot;: \&quot;sample.pdf\&quot;,         \&quot;title\&quot;: \&quot;Test title\&quot;,         \&quot;author\&quot;: \&quot;Test author\&quot;,         \&quot;year\&quot;: 2020,     }     # upload file endpoint only accepts form-encoded data     payload &#x3D; {         \&quot;chunk_size\&quot;: 128,         \&quot;metadata\&quot;: json.dumps(metadata)     }      response &#x3D; requests.post(         \&quot;http://localhost:1865/rabbithole/\&quot;,         files&#x3D;files,         data&#x3D;payload     ) &#x60;&#x60;&#x60;
   * @param _file  (required)
   * @param chunkSize  (optional)
   * @param chunkOverlap  (optional)
   * @param metadata Metadata to be stored with each chunk (e.g. author, category, etc.). Since we are passing this along side form data, must be a JSON string (use &#x60;json.dumps(metadata)&#x60;). (optional, default to {})
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object uploadFile(File _file, Integer chunkSize, Integer chunkOverlap, String metadata) throws ApiException {
    return uploadFileWithHttpInfo(_file, chunkSize, chunkOverlap, metadata).getData();
  }

  /**
   * Upload File
   * Upload a file containing text (.txt, .md, .pdf, etc.). File content will be extracted and segmented into chunks. Chunks will be then vectorized and stored into documents memory.  Note ---------- &#x60;chunk_size&#x60;, &#x60;chunk_overlap&#x60; anad &#x60;metadata&#x60; must be passed as form data. This is necessary because the HTTP protocol does not allow file uploads to be sent as JSON.  Example ---------- &#x60;&#x60;&#x60; content_type &#x3D; \&quot;application/pdf\&quot; file_name &#x3D; \&quot;sample.pdf\&quot; file_path &#x3D; f\&quot;tests/mocks/{file_name}\&quot; with open(file_path, \&quot;rb\&quot;) as f:     files &#x3D; {\&quot;file\&quot;: (file_name, f, content_type)}      metadata &#x3D; {         \&quot;source\&quot;: \&quot;sample.pdf\&quot;,         \&quot;title\&quot;: \&quot;Test title\&quot;,         \&quot;author\&quot;: \&quot;Test author\&quot;,         \&quot;year\&quot;: 2020,     }     # upload file endpoint only accepts form-encoded data     payload &#x3D; {         \&quot;chunk_size\&quot;: 128,         \&quot;metadata\&quot;: json.dumps(metadata)     }      response &#x3D; requests.post(         \&quot;http://localhost:1865/rabbithole/\&quot;,         files&#x3D;files,         data&#x3D;payload     ) &#x60;&#x60;&#x60;
   * @param _file  (required)
   * @param chunkSize  (optional)
   * @param chunkOverlap  (optional)
   * @param metadata Metadata to be stored with each chunk (e.g. author, category, etc.). Since we are passing this along side form data, must be a JSON string (use &#x60;json.dumps(metadata)&#x60;). (optional, default to {})
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> uploadFileWithHttpInfo(File _file, Integer chunkSize, Integer chunkOverlap, String metadata) throws ApiException {
    // Check required parameters
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling uploadFile");
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("file", _file);
    if (chunkSize != null) {
      localVarFormParams.put("chunk_size", chunkSize);
    }
    if (chunkOverlap != null) {
      localVarFormParams.put("chunk_overlap", chunkOverlap);
    }
    if (metadata != null) {
      localVarFormParams.put("metadata", metadata);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("RabbitHoleApi.uploadFile", "/rabbithole/", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Upload Memory
   * Upload a memory json file to the cat memory
   * @param _file  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object uploadMemory(File _file) throws ApiException {
    return uploadMemoryWithHttpInfo(_file).getData();
  }

  /**
   * Upload Memory
   * Upload a memory json file to the cat memory
   * @param _file  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> uploadMemoryWithHttpInfo(File _file) throws ApiException {
    // Check required parameters
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling uploadMemory");
    }

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams.put("file", _file);

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("RabbitHoleApi.uploadMemory", "/rabbithole/memory", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Upload Url
   * Upload a url. Website content will be extracted and segmented into chunks. Chunks will be then vectorized and stored into documents memory.
   * @param uploadURLConfig  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object uploadUrl(UploadURLConfig uploadURLConfig) throws ApiException {
    return uploadUrlWithHttpInfo(uploadURLConfig).getData();
  }

  /**
   * Upload Url
   * Upload a url. Website content will be extracted and segmented into chunks. Chunks will be then vectorized and stored into documents memory.
   * @param uploadURLConfig  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> uploadUrlWithHttpInfo(UploadURLConfig uploadURLConfig) throws ApiException {
    // Check required parameters
    if (uploadURLConfig == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadURLConfig' when calling uploadUrl");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("RabbitHoleApi.uploadUrl", "/rabbithole/web", "POST", new ArrayList<>(), uploadURLConfig,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
