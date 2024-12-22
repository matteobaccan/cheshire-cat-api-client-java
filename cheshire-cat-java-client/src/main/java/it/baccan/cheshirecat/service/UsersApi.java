package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiResponse;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.Pair;

import javax.ws.rs.core.GenericType;

import it.baccan.cheshirecat.model.HTTPValidationError;
import it.baccan.cheshirecat.model.UserCreate;
import it.baccan.cheshirecat.model.UserResponse;
import it.baccan.cheshirecat.model.UserUpdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
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
   * Create User
   * 
   * @param userCreate  (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public UserResponse createUser(UserCreate userCreate) throws ApiException {
    return createUserWithHttpInfo(userCreate).getData();
  }

  /**
   * Create User
   * 
   * @param userCreate  (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResponse> createUserWithHttpInfo(UserCreate userCreate) throws ApiException {
    // Check required parameters
    if (userCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'userCreate' when calling createUser");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI("UsersApi.createUser", "/users/", "POST", new ArrayList<>(), userCreate,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete User
   * 
   * @param userId  (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public UserResponse deleteUser(String userId) throws ApiException {
    return deleteUserWithHttpInfo(userId).getData();
  }

  /**
   * Delete User
   * 
   * @param userId  (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResponse> deleteUserWithHttpInfo(String userId) throws ApiException {
    // Check required parameters
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUser");
    }

    // Path parameters
    String localVarPath = "/users/{user_id}"
            .replaceAll("\\{user_id}", apiClient.escapeString(userId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI("UsersApi.deleteUser", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Read User
   * 
   * @param userId  (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public UserResponse readUser(String userId) throws ApiException {
    return readUserWithHttpInfo(userId).getData();
  }

  /**
   * Read User
   * 
   * @param userId  (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResponse> readUserWithHttpInfo(String userId) throws ApiException {
    // Check required parameters
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling readUser");
    }

    // Path parameters
    String localVarPath = "/users/{user_id}"
            .replaceAll("\\{user_id}", apiClient.escapeString(userId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI("UsersApi.readUser", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Read Users
   * 
   * @param skip  (optional, default to 0)
   * @param limit  (optional, default to 100)
   * @return List&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public List<UserResponse> readUsers(Integer skip, Integer limit) throws ApiException {
    return readUsersWithHttpInfo(skip, limit).getData();
  }

  /**
   * Read Users
   * 
   * @param skip  (optional, default to 0)
   * @param limit  (optional, default to 100)
   * @return ApiResponse&lt;List&lt;UserResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UserResponse>> readUsersWithHttpInfo(Integer skip, Integer limit) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "skip", skip)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<UserResponse>> localVarReturnType = new GenericType<List<UserResponse>>() {};
    return apiClient.invokeAPI("UsersApi.readUsers", "/users/", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update User
   * 
   * @param userId  (required)
   * @param userUpdate  (required)
   * @return UserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public UserResponse updateUser(String userId, UserUpdate userUpdate) throws ApiException {
    return updateUserWithHttpInfo(userId, userUpdate).getData();
  }

  /**
   * Update User
   * 
   * @param userId  (required)
   * @param userUpdate  (required)
   * @return ApiResponse&lt;UserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserResponse> updateUserWithHttpInfo(String userId, UserUpdate userUpdate) throws ApiException {
    // Check required parameters
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
    }
    if (userUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'userUpdate' when calling updateUser");
    }

    // Path parameters
    String localVarPath = "/users/{user_id}"
            .replaceAll("\\{user_id}", apiClient.escapeString(userId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<UserResponse> localVarReturnType = new GenericType<UserResponse>() {};
    return apiClient.invokeAPI("UsersApi.updateUser", localVarPath, "PUT", new ArrayList<>(), userUpdate,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
