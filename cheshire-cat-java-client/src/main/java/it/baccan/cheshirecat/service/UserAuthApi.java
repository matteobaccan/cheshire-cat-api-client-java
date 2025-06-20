package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiResponse;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.Pair;

import javax.ws.rs.core.GenericType;

import it.baccan.cheshirecat.model.AuthPermission;
import it.baccan.cheshirecat.model.HTTPValidationError;
import it.baccan.cheshirecat.model.JWTResponse;
import it.baccan.cheshirecat.model.UserCredentials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class UserAuthApi {
  private ApiClient apiClient;

  public UserAuthApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserAuthApi(ApiClient apiClient) {
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
   * Auth Token
   * Endpoint called from client to get a JWT from local identity provider. This endpoint receives username and password as form-data, validates credentials and issues a JWT.
   * @param userCredentials  (required)
   * @return JWTResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public JWTResponse authToken(@javax.annotation.Nonnull UserCredentials userCredentials) throws ApiException {
    return authTokenWithHttpInfo(userCredentials).getData();
  }

  /**
   * Auth Token
   * Endpoint called from client to get a JWT from local identity provider. This endpoint receives username and password as form-data, validates credentials and issues a JWT.
   * @param userCredentials  (required)
   * @return ApiResponse&lt;JWTResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<JWTResponse> authTokenWithHttpInfo(@javax.annotation.Nonnull UserCredentials userCredentials) throws ApiException {
    // Check required parameters
    if (userCredentials == null) {
      throw new ApiException(400, "Missing the required parameter 'userCredentials' when calling authToken");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<JWTResponse> localVarReturnType = new GenericType<JWTResponse>() {};
    return apiClient.invokeAPI("UserAuthApi.authToken", "/auth/token", "POST", new ArrayList<>(), userCredentials,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get Available Permissions
   * Returns all available resources and permissions.
   * @return Map&lt;String, List&lt;AuthPermission&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public Map<String, List<AuthPermission>> getAvailablePermissions() throws ApiException {
    return getAvailablePermissionsWithHttpInfo().getData();
  }

  /**
   * Get Available Permissions
   * Returns all available resources and permissions.
   * @return ApiResponse&lt;Map&lt;String, List&lt;AuthPermission&gt;&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Map<String, List<AuthPermission>>> getAvailablePermissionsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Map<String, List<AuthPermission>>> localVarReturnType = new GenericType<Map<String, List<AuthPermission>>>() {};
    return apiClient.invokeAPI("UserAuthApi.getAvailablePermissions", "/auth/available-permissions", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
