package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiResponse;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.Pair;

import javax.ws.rs.core.GenericType;

import it.baccan.cheshirecat.model.HTTPValidationError;
import it.baccan.cheshirecat.model.MemoryPoint;
import it.baccan.cheshirecat.model.MemoryPointBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class MemoryApi {
  private ApiClient apiClient;

  public MemoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MemoryApi(ApiClient apiClient) {
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
   * Create Memory Point
   * Create a point in memory
   * @param collectionId  (required)
   * @param memoryPointBase  (required)
   * @return MemoryPoint
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public MemoryPoint createMemoryPoint(String collectionId, MemoryPointBase memoryPointBase) throws ApiException {
    return createMemoryPointWithHttpInfo(collectionId, memoryPointBase).getData();
  }

  /**
   * Create Memory Point
   * Create a point in memory
   * @param collectionId  (required)
   * @param memoryPointBase  (required)
   * @return ApiResponse&lt;MemoryPoint&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MemoryPoint> createMemoryPointWithHttpInfo(String collectionId, MemoryPointBase memoryPointBase) throws ApiException {
    // Check required parameters
    if (collectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'collectionId' when calling createMemoryPoint");
    }
    if (memoryPointBase == null) {
      throw new ApiException(400, "Missing the required parameter 'memoryPointBase' when calling createMemoryPoint");
    }

    // Path parameters
    String localVarPath = "/memory/collections/{collection_id}/points"
            .replaceAll("\\{collection_id}", apiClient.escapeString(collectionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<MemoryPoint> localVarReturnType = new GenericType<MemoryPoint>() {};
    return apiClient.invokeAPI("MemoryApi.createMemoryPoint", localVarPath, "POST", new ArrayList<>(), memoryPointBase,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete Memory Point
   * Delete a specific point in memory
   * @param collectionId  (required)
   * @param pointId  (required)
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
  public Object deleteMemoryPoint(String collectionId, String pointId) throws ApiException {
    return deleteMemoryPointWithHttpInfo(collectionId, pointId).getData();
  }

  /**
   * Delete Memory Point
   * Delete a specific point in memory
   * @param collectionId  (required)
   * @param pointId  (required)
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
  public ApiResponse<Object> deleteMemoryPointWithHttpInfo(String collectionId, String pointId) throws ApiException {
    // Check required parameters
    if (collectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'collectionId' when calling deleteMemoryPoint");
    }
    if (pointId == null) {
      throw new ApiException(400, "Missing the required parameter 'pointId' when calling deleteMemoryPoint");
    }

    // Path parameters
    String localVarPath = "/memory/collections/{collection_id}/points/{point_id}"
            .replaceAll("\\{collection_id}", apiClient.escapeString(collectionId.toString()))
            .replaceAll("\\{point_id}", apiClient.escapeString(pointId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("MemoryApi.deleteMemoryPoint", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete Memory Points By Metadata
   * Delete points in memory by filter
   * @param collectionId  (required)
   * @param body  (optional)
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
  public Object deleteMemoryPointsByMetadata(String collectionId, Object body) throws ApiException {
    return deleteMemoryPointsByMetadataWithHttpInfo(collectionId, body).getData();
  }

  /**
   * Delete Memory Points By Metadata
   * Delete points in memory by filter
   * @param collectionId  (required)
   * @param body  (optional)
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
  public ApiResponse<Object> deleteMemoryPointsByMetadataWithHttpInfo(String collectionId, Object body) throws ApiException {
    // Check required parameters
    if (collectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'collectionId' when calling deleteMemoryPointsByMetadata");
    }

    // Path parameters
    String localVarPath = "/memory/collections/{collection_id}/points"
            .replaceAll("\\{collection_id}", apiClient.escapeString(collectionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("MemoryApi.deleteMemoryPointsByMetadata", localVarPath, "DELETE", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get Collections
   * Get list of available collections
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public Object getCollections() throws ApiException {
    return getCollectionsWithHttpInfo().getData();
  }

  /**
   * Get Collections
   * Get list of available collections
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> getCollectionsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("MemoryApi.getCollections", "/memory/collections", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get Conversation History
   * Get the specified user&#39;s conversation history from working memory
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public Object getConversationHistory() throws ApiException {
    return getConversationHistoryWithHttpInfo().getData();
  }

  /**
   * Get Conversation History
   * Get the specified user&#39;s conversation history from working memory
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> getConversationHistoryWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("MemoryApi.getConversationHistory", "/memory/conversation_history", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Recall Memories From Text
   * Search k memories similar to given text.
   * @param text Find memories similar to this text. (required)
   * @param k How many memories to return. (optional, default to 100)
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
  public Object recallMemoriesFromText(String text, Integer k) throws ApiException {
    return recallMemoriesFromTextWithHttpInfo(text, k).getData();
  }

  /**
   * Recall Memories From Text
   * Search k memories similar to given text.
   * @param text Find memories similar to this text. (required)
   * @param k How many memories to return. (optional, default to 100)
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
  public ApiResponse<Object> recallMemoriesFromTextWithHttpInfo(String text, Integer k) throws ApiException {
    // Check required parameters
    if (text == null) {
      throw new ApiException(400, "Missing the required parameter 'text' when calling recallMemoriesFromText");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "text", text)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "k", k));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("MemoryApi.recallMemoriesFromText", "/memory/recall", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Wipe Collections
   * Delete and create all collections
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public Object wipeCollections() throws ApiException {
    return wipeCollectionsWithHttpInfo().getData();
  }

  /**
   * Wipe Collections
   * Delete and create all collections
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> wipeCollectionsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("MemoryApi.wipeCollections", "/memory/collections", "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Wipe Conversation History
   * Delete the specified user&#39;s conversation history from working memory
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public Object wipeConversationHistory() throws ApiException {
    return wipeConversationHistoryWithHttpInfo().getData();
  }

  /**
   * Wipe Conversation History
   * Delete the specified user&#39;s conversation history from working memory
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> wipeConversationHistoryWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("MemoryApi.wipeConversationHistory", "/memory/conversation_history", "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Wipe Single Collection
   * Delete and recreate a collection
   * @param collectionId  (required)
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
  public Object wipeSingleCollection(String collectionId) throws ApiException {
    return wipeSingleCollectionWithHttpInfo(collectionId).getData();
  }

  /**
   * Wipe Single Collection
   * Delete and recreate a collection
   * @param collectionId  (required)
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
  public ApiResponse<Object> wipeSingleCollectionWithHttpInfo(String collectionId) throws ApiException {
    // Check required parameters
    if (collectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'collectionId' when calling wipeSingleCollection");
    }

    // Path parameters
    String localVarPath = "/memory/collections/{collection_id}"
            .replaceAll("\\{collection_id}", apiClient.escapeString(collectionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("MemoryApi.wipeSingleCollection", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
