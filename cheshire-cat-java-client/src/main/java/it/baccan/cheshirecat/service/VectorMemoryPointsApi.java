package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiResponse;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.Pair;

import javax.ws.rs.core.GenericType;

import it.baccan.cheshirecat.model.BodyRecallMemoryPoints;
import it.baccan.cheshirecat.model.HTTPValidationError;
import it.baccan.cheshirecat.model.MemoryPoint;
import it.baccan.cheshirecat.model.MemoryPointBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class VectorMemoryPointsApi {
  private ApiClient apiClient;

  public VectorMemoryPointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VectorMemoryPointsApi(ApiClient apiClient) {
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
    return apiClient.invokeAPI("VectorMemoryPointsApi.createMemoryPoint", localVarPath, "POST", new ArrayList<>(), memoryPointBase,
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
    return apiClient.invokeAPI("VectorMemoryPointsApi.deleteMemoryPoint", localVarPath, "DELETE", new ArrayList<>(), null,
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
    return apiClient.invokeAPI("VectorMemoryPointsApi.deleteMemoryPointsByMetadata", localVarPath, "DELETE", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Edit Memory Point
   * Edit a point in memory   Example ---------- &#x60;&#x60;&#x60;  collection &#x3D; \&quot;declarative\&quot; content &#x3D; \&quot;MIAO!\&quot; metadata &#x3D; {\&quot;custom_key\&quot;: \&quot;custom_value\&quot;} req_json &#x3D; {     \&quot;content\&quot;: content,     \&quot;metadata\&quot;: metadata, } # create a point res &#x3D; requests.post(     f\&quot;http://localhost:1865/memory/collections/{collection}/points\&quot;, json&#x3D;req_json ) json &#x3D; res.json() #get the id point_id &#x3D; json[\&quot;id\&quot;] # new point values content &#x3D; \&quot;NEW MIAO!\&quot; metadata &#x3D; {\&quot;custom_key\&quot;: \&quot;new_custom_value\&quot;} req_json &#x3D; {     \&quot;content\&quot;: content,     \&quot;metadata\&quot;: metadata, }  # edit the point res &#x3D; requests.put(     f\&quot;http://localhost:1865/memory/collections/{collection}/points/{point_id}\&quot;, json&#x3D;req_json ) json &#x3D; res.json() print(json) &#x60;&#x60;&#x60;
   * @param collectionId  (required)
   * @param pointId  (required)
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
  public MemoryPoint editMemoryPoint(String collectionId, String pointId, MemoryPointBase memoryPointBase) throws ApiException {
    return editMemoryPointWithHttpInfo(collectionId, pointId, memoryPointBase).getData();
  }

  /**
   * Edit Memory Point
   * Edit a point in memory   Example ---------- &#x60;&#x60;&#x60;  collection &#x3D; \&quot;declarative\&quot; content &#x3D; \&quot;MIAO!\&quot; metadata &#x3D; {\&quot;custom_key\&quot;: \&quot;custom_value\&quot;} req_json &#x3D; {     \&quot;content\&quot;: content,     \&quot;metadata\&quot;: metadata, } # create a point res &#x3D; requests.post(     f\&quot;http://localhost:1865/memory/collections/{collection}/points\&quot;, json&#x3D;req_json ) json &#x3D; res.json() #get the id point_id &#x3D; json[\&quot;id\&quot;] # new point values content &#x3D; \&quot;NEW MIAO!\&quot; metadata &#x3D; {\&quot;custom_key\&quot;: \&quot;new_custom_value\&quot;} req_json &#x3D; {     \&quot;content\&quot;: content,     \&quot;metadata\&quot;: metadata, }  # edit the point res &#x3D; requests.put(     f\&quot;http://localhost:1865/memory/collections/{collection}/points/{point_id}\&quot;, json&#x3D;req_json ) json &#x3D; res.json() print(json) &#x60;&#x60;&#x60;
   * @param collectionId  (required)
   * @param pointId  (required)
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
  public ApiResponse<MemoryPoint> editMemoryPointWithHttpInfo(String collectionId, String pointId, MemoryPointBase memoryPointBase) throws ApiException {
    // Check required parameters
    if (collectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'collectionId' when calling editMemoryPoint");
    }
    if (pointId == null) {
      throw new ApiException(400, "Missing the required parameter 'pointId' when calling editMemoryPoint");
    }
    if (memoryPointBase == null) {
      throw new ApiException(400, "Missing the required parameter 'memoryPointBase' when calling editMemoryPoint");
    }

    // Path parameters
    String localVarPath = "/memory/collections/{collection_id}/points/{point_id}"
            .replaceAll("\\{collection_id}", apiClient.escapeString(collectionId.toString()))
            .replaceAll("\\{point_id}", apiClient.escapeString(pointId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<MemoryPoint> localVarReturnType = new GenericType<MemoryPoint>() {};
    return apiClient.invokeAPI("VectorMemoryPointsApi.editMemoryPoint", localVarPath, "PUT", new ArrayList<>(), memoryPointBase,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get Points In Collection
   * Retrieve all the points from a single collection   Example ---------- &#x60;&#x60;&#x60; collection &#x3D; \&quot;declarative\&quot; res &#x3D; requests.get(     f\&quot;http://localhost:1865/memory/collections/{collection}/points\&quot;, ) json &#x3D; res.json() points &#x3D; json[\&quot;points\&quot;]  for point in points:     payload &#x3D; point[\&quot;payload\&quot;]     vector &#x3D; point[\&quot;vector\&quot;]     print(payload)     print(vector) &#x60;&#x60;&#x60;  Example using offset ---------- &#x60;&#x60;&#x60; # get all the points with limit 10 limit &#x3D; 10 next_offset &#x3D; \&quot;\&quot; collection &#x3D; \&quot;declarative\&quot;  while True:     res &#x3D; requests.get(         f\&quot;http://localhost:1865/memory/collections/{collection}/points?limit&#x3D;{limit}&amp;offset&#x3D;{next_offset}\&quot;,     )     json &#x3D; res.json()     points &#x3D; json[\&quot;points\&quot;]     next_offset &#x3D; json[\&quot;next_offset\&quot;]      for point in points:         payload &#x3D; point[\&quot;payload\&quot;]         vector &#x3D; point[\&quot;vector\&quot;]         print(payload)         print(vector)          if next_offset is None:         break &#x60;&#x60;&#x60;
   * @param collectionId  (required)
   * @param limit How many points to return (optional, default to 100)
   * @param offset If provided (or not empty string) - skip points with ids less than given &#x60;offset&#x60; (optional)
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
  public Object getPointsInCollection(String collectionId, Integer limit, String offset) throws ApiException {
    return getPointsInCollectionWithHttpInfo(collectionId, limit, offset).getData();
  }

  /**
   * Get Points In Collection
   * Retrieve all the points from a single collection   Example ---------- &#x60;&#x60;&#x60; collection &#x3D; \&quot;declarative\&quot; res &#x3D; requests.get(     f\&quot;http://localhost:1865/memory/collections/{collection}/points\&quot;, ) json &#x3D; res.json() points &#x3D; json[\&quot;points\&quot;]  for point in points:     payload &#x3D; point[\&quot;payload\&quot;]     vector &#x3D; point[\&quot;vector\&quot;]     print(payload)     print(vector) &#x60;&#x60;&#x60;  Example using offset ---------- &#x60;&#x60;&#x60; # get all the points with limit 10 limit &#x3D; 10 next_offset &#x3D; \&quot;\&quot; collection &#x3D; \&quot;declarative\&quot;  while True:     res &#x3D; requests.get(         f\&quot;http://localhost:1865/memory/collections/{collection}/points?limit&#x3D;{limit}&amp;offset&#x3D;{next_offset}\&quot;,     )     json &#x3D; res.json()     points &#x3D; json[\&quot;points\&quot;]     next_offset &#x3D; json[\&quot;next_offset\&quot;]      for point in points:         payload &#x3D; point[\&quot;payload\&quot;]         vector &#x3D; point[\&quot;vector\&quot;]         print(payload)         print(vector)          if next_offset is None:         break &#x60;&#x60;&#x60;
   * @param collectionId  (required)
   * @param limit How many points to return (optional, default to 100)
   * @param offset If provided (or not empty string) - skip points with ids less than given &#x60;offset&#x60; (optional)
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
  public ApiResponse<Object> getPointsInCollectionWithHttpInfo(String collectionId, Integer limit, String offset) throws ApiException {
    // Check required parameters
    if (collectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'collectionId' when calling getPointsInCollection");
    }

    // Path parameters
    String localVarPath = "/memory/collections/{collection_id}/points"
            .replaceAll("\\{collection_id}", apiClient.escapeString(collectionId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("VectorMemoryPointsApi.getPointsInCollection", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Recall Memory Points
   * Search k memories similar to given text with specified metadata criteria.      Example ---------- &#x60;&#x60;&#x60; collection &#x3D; \&quot;episodic\&quot; content &#x3D; \&quot;MIAO!\&quot; metadata &#x3D; {\&quot;custom_key\&quot;: \&quot;custom_value\&quot;} req_json &#x3D; {     \&quot;content\&quot;: content,     \&quot;metadata\&quot;: metadata, } # create a point res &#x3D; requests.post(     f\&quot;http://localhost:1865/memory/collections/{collection}/points\&quot;, json&#x3D;req_json )  # recall with metadata req_json &#x3D; {     \&quot;text\&quot;: \&quot;CAT\&quot;,      \&quot;metadata\&quot;:{\&quot;custom_key\&quot;:\&quot;custom_value\&quot;} } res &#x3D; requests.post(     f\&quot;http://localhost:1865/memory/recall\&quot;, json&#x3D;req_json ) json &#x3D; res.json() print(json) &#x60;&#x60;&#x60;
   * @param bodyRecallMemoryPoints  (required)
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
  public Object recallMemoryPoints(BodyRecallMemoryPoints bodyRecallMemoryPoints) throws ApiException {
    return recallMemoryPointsWithHttpInfo(bodyRecallMemoryPoints).getData();
  }

  /**
   * Recall Memory Points
   * Search k memories similar to given text with specified metadata criteria.      Example ---------- &#x60;&#x60;&#x60; collection &#x3D; \&quot;episodic\&quot; content &#x3D; \&quot;MIAO!\&quot; metadata &#x3D; {\&quot;custom_key\&quot;: \&quot;custom_value\&quot;} req_json &#x3D; {     \&quot;content\&quot;: content,     \&quot;metadata\&quot;: metadata, } # create a point res &#x3D; requests.post(     f\&quot;http://localhost:1865/memory/collections/{collection}/points\&quot;, json&#x3D;req_json )  # recall with metadata req_json &#x3D; {     \&quot;text\&quot;: \&quot;CAT\&quot;,      \&quot;metadata\&quot;:{\&quot;custom_key\&quot;:\&quot;custom_value\&quot;} } res &#x3D; requests.post(     f\&quot;http://localhost:1865/memory/recall\&quot;, json&#x3D;req_json ) json &#x3D; res.json() print(json) &#x60;&#x60;&#x60;
   * @param bodyRecallMemoryPoints  (required)
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
  public ApiResponse<Object> recallMemoryPointsWithHttpInfo(BodyRecallMemoryPoints bodyRecallMemoryPoints) throws ApiException {
    // Check required parameters
    if (bodyRecallMemoryPoints == null) {
      throw new ApiException(400, "Missing the required parameter 'bodyRecallMemoryPoints' when calling recallMemoryPoints");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("VectorMemoryPointsApi.recallMemoryPoints", "/memory/recall", "POST", new ArrayList<>(), bodyRecallMemoryPoints,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Recall Memory Points From Text
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
   * @deprecated
   */
  @Deprecated
  public Object recallMemoryPointsFromText(String text, Integer k) throws ApiException {
    return recallMemoryPointsFromTextWithHttpInfo(text, k).getData();
  }

  /**
   * Recall Memory Points From Text
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Object> recallMemoryPointsFromTextWithHttpInfo(String text, Integer k) throws ApiException {
    // Check required parameters
    if (text == null) {
      throw new ApiException(400, "Missing the required parameter 'text' when calling recallMemoryPointsFromText");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "text", text)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "k", k));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("VectorMemoryPointsApi.recallMemoryPointsFromText", "/memory/recall", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
