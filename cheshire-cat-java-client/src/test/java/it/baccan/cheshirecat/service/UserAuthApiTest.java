/*
 * 😸 Cheshire-Cat API
 * Production ready AI assistant framework
 *
 * The version of the OpenAPI document: 1.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.*;
import it.baccan.cheshirecat.auth.*;
import it.baccan.cheshirecat.model.AuthPermission;
import it.baccan.cheshirecat.model.HTTPValidationError;
import it.baccan.cheshirecat.model.JWTResponse;
import it.baccan.cheshirecat.model.UserCredentials;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserAuthApi
 */
public class UserAuthApiTest {

    private final UserAuthApi api = new UserAuthApi();

    /**
     * Auth Token
     *
     * Endpoint called from client to get a JWT from local identity provider. This endpoint receives username and password as form-data, validates credentials and issues a JWT.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authTokenTest() throws ApiException {
        //UserCredentials userCredentials = null;
        //JWTResponse response = api.authToken(userCredentials);
        // TODO: test validations
    }

    /**
     * Get Available Permissions
     *
     * Returns all available resources and permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAvailablePermissionsTest() throws ApiException {
        //Map<String, List<AuthPermission>> response = api.getAvailablePermissions();
        // TODO: test validations
    }

}
