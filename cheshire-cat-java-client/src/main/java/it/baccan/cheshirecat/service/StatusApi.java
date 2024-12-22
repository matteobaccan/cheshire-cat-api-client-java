package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiResponse;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.Pair;

import javax.ws.rs.core.GenericType;

import it.baccan.cheshirecat.model.CatMessage;
import it.baccan.cheshirecat.model.HTTPValidationError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class StatusApi {
  private ApiClient apiClient;

  public StatusApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StatusApi(ApiClient apiClient) {
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
   * Home
   * Server status
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public Object home() throws ApiException {
    return homeWithHttpInfo().getData();
  }

  /**
   * Home
   * Server status
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> homeWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("StatusApi.home", "/", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Message With Cat
   * Get a response from the Cat
   * @param body  (optional)
   * @return CatMessage
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public CatMessage messageWithCat(Object body) throws ApiException {
    return messageWithCatWithHttpInfo(body).getData();
  }

  /**
   * Message With Cat
   * Get a response from the Cat
   * @param body  (optional)
   * @return ApiResponse&lt;CatMessage&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CatMessage> messageWithCatWithHttpInfo(Object body) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CatMessage> localVarReturnType = new GenericType<CatMessage>() {};
    return apiClient.invokeAPI("StatusApi.messageWithCat", "/message", "POST", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
