package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiResponse;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.Pair;

import javax.ws.rs.core.GenericType;

import it.baccan.cheshirecat.model.HTTPValidationError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EmbedderApi {
  private ApiClient apiClient;

  public EmbedderApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EmbedderApi(ApiClient apiClient) {
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
   * Get Embedder Settings
   * Get settings and schema of the specified Embedder
   * @param languageEmbedderName  (required)
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
  public Object getEmbedderSettings(String languageEmbedderName) throws ApiException {
    return getEmbedderSettingsWithHttpInfo(languageEmbedderName).getData();
  }

  /**
   * Get Embedder Settings
   * Get settings and schema of the specified Embedder
   * @param languageEmbedderName  (required)
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
  public ApiResponse<Object> getEmbedderSettingsWithHttpInfo(String languageEmbedderName) throws ApiException {
    // Check required parameters
    if (languageEmbedderName == null) {
      throw new ApiException(400, "Missing the required parameter 'languageEmbedderName' when calling getEmbedderSettings");
    }

    // Path parameters
    String localVarPath = "/embedder/settings/{languageEmbedderName}"
            .replaceAll("\\{languageEmbedderName}", apiClient.escapeString(languageEmbedderName.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("EmbedderApi.getEmbedderSettings", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get Embedders Settings
   * Get the list of the Embedders
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public Object getEmbeddersSettings() throws ApiException {
    return getEmbeddersSettingsWithHttpInfo().getData();
  }

  /**
   * Get Embedders Settings
   * Get the list of the Embedders
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> getEmbeddersSettingsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("EmbedderApi.getEmbeddersSettings", "/embedder/settings", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Upsert Embedder Setting
   * Upsert the Embedder setting
   * @param languageEmbedderName  (required)
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
  public Object upsertEmbedderSetting(String languageEmbedderName, Object body) throws ApiException {
    return upsertEmbedderSettingWithHttpInfo(languageEmbedderName, body).getData();
  }

  /**
   * Upsert Embedder Setting
   * Upsert the Embedder setting
   * @param languageEmbedderName  (required)
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
  public ApiResponse<Object> upsertEmbedderSettingWithHttpInfo(String languageEmbedderName, Object body) throws ApiException {
    // Check required parameters
    if (languageEmbedderName == null) {
      throw new ApiException(400, "Missing the required parameter 'languageEmbedderName' when calling upsertEmbedderSetting");
    }

    // Path parameters
    String localVarPath = "/embedder/settings/{languageEmbedderName}"
            .replaceAll("\\{languageEmbedderName}", apiClient.escapeString(languageEmbedderName.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("EmbedderApi.upsertEmbedderSetting", localVarPath, "PUT", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
