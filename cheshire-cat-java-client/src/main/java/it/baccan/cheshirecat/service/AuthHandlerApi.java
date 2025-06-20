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
public class AuthHandlerApi {
  private ApiClient apiClient;

  public AuthHandlerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthHandlerApi(ApiClient apiClient) {
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
   * Get Auth Handler Setting
   * Get the settings of a specific AuthHandler
   * @param authHandlerName  (required)
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
  public Object getAuthHandlerSetting(@javax.annotation.Nonnull String authHandlerName) throws ApiException {
    return getAuthHandlerSettingWithHttpInfo(authHandlerName).getData();
  }

  /**
   * Get Auth Handler Setting
   * Get the settings of a specific AuthHandler
   * @param authHandlerName  (required)
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
  public ApiResponse<Object> getAuthHandlerSettingWithHttpInfo(@javax.annotation.Nonnull String authHandlerName) throws ApiException {
    // Check required parameters
    if (authHandlerName == null) {
      throw new ApiException(400, "Missing the required parameter 'authHandlerName' when calling getAuthHandlerSetting");
    }

    // Path parameters
    String localVarPath = "/auth_handler/settings/{auth_handler_name}"
            .replaceAll("\\{auth_handler_name}", apiClient.escapeString(authHandlerName.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("AuthHandlerApi.getAuthHandlerSetting", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get Auth Handler Settings
   * Get the list of the AuthHandlers
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public Object getAuthHandlerSettings() throws ApiException {
    return getAuthHandlerSettingsWithHttpInfo().getData();
  }

  /**
   * Get Auth Handler Settings
   * Get the list of the AuthHandlers
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> getAuthHandlerSettingsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("AuthHandlerApi.getAuthHandlerSettings", "/auth_handler/settings", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Upsert Authenticator Setting
   * Upsert the settings of a specific AuthHandler
   * @param authHandlerName  (required)
   * @param body  (required)
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
  public Object upsertAuthenticatorSetting(@javax.annotation.Nonnull String authHandlerName, @javax.annotation.Nonnull Object body) throws ApiException {
    return upsertAuthenticatorSettingWithHttpInfo(authHandlerName, body).getData();
  }

  /**
   * Upsert Authenticator Setting
   * Upsert the settings of a specific AuthHandler
   * @param authHandlerName  (required)
   * @param body  (required)
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
  public ApiResponse<Object> upsertAuthenticatorSettingWithHttpInfo(@javax.annotation.Nonnull String authHandlerName, @javax.annotation.Nonnull Object body) throws ApiException {
    // Check required parameters
    if (authHandlerName == null) {
      throw new ApiException(400, "Missing the required parameter 'authHandlerName' when calling upsertAuthenticatorSetting");
    }
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling upsertAuthenticatorSetting");
    }

    // Path parameters
    String localVarPath = "/auth_handler/settings/{auth_handler_name}"
            .replaceAll("\\{auth_handler_name}", apiClient.escapeString(authHandlerName.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("AuthHandlerApi.upsertAuthenticatorSetting", localVarPath, "PUT", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
