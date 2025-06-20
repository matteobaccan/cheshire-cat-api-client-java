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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class LargeLanguageModelApi {
  private ApiClient apiClient;

  public LargeLanguageModelApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LargeLanguageModelApi(ApiClient apiClient) {
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
   * Get Llm Settings
   * Get settings and schema of the specified Large Language Model
   * @param languageModelName  (required)
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
  public Object getLlmSettings(@javax.annotation.Nonnull String languageModelName) throws ApiException {
    return getLlmSettingsWithHttpInfo(languageModelName).getData();
  }

  /**
   * Get Llm Settings
   * Get settings and schema of the specified Large Language Model
   * @param languageModelName  (required)
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
  public ApiResponse<Object> getLlmSettingsWithHttpInfo(@javax.annotation.Nonnull String languageModelName) throws ApiException {
    // Check required parameters
    if (languageModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'languageModelName' when calling getLlmSettings");
    }

    // Path parameters
    String localVarPath = "/llm/settings/{languageModelName}"
            .replaceAll("\\{languageModelName}", apiClient.escapeString(languageModelName.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("LargeLanguageModelApi.getLlmSettings", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get Llms Settings
   * Get the list of the Large Language Models
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public Object getLlmsSettings() throws ApiException {
    return getLlmsSettingsWithHttpInfo().getData();
  }

  /**
   * Get Llms Settings
   * Get the list of the Large Language Models
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> getLlmsSettingsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("LargeLanguageModelApi.getLlmsSettings", "/llm/settings", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Upsert Llm Setting
   * Upsert the Large Language Model setting
   * @param languageModelName  (required)
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
  public Object upsertLlmSetting(@javax.annotation.Nonnull String languageModelName, @javax.annotation.Nullable Object body) throws ApiException {
    return upsertLlmSettingWithHttpInfo(languageModelName, body).getData();
  }

  /**
   * Upsert Llm Setting
   * Upsert the Large Language Model setting
   * @param languageModelName  (required)
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
  public ApiResponse<Object> upsertLlmSettingWithHttpInfo(@javax.annotation.Nonnull String languageModelName, @javax.annotation.Nullable Object body) throws ApiException {
    // Check required parameters
    if (languageModelName == null) {
      throw new ApiException(400, "Missing the required parameter 'languageModelName' when calling upsertLlmSetting");
    }

    // Path parameters
    String localVarPath = "/llm/settings/{languageModelName}"
            .replaceAll("\\{languageModelName}", apiClient.escapeString(languageModelName.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("LargeLanguageModelApi.upsertLlmSetting", localVarPath, "PUT", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
