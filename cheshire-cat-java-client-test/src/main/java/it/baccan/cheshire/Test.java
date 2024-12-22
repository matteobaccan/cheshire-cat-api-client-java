/*
 * Author Matteo Baccan
 * http://www.baccan.it
 *
 * Distributed under the GPL v3 software license, see the accompanying
 * file LICENSE or http://www.gnu.org/licenses/gpl.html.
 *
 */
package it.baccan.cheshire;

import lombok.extern.slf4j.Slf4j;
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.service.StatusApi;
import it.baccan.cheshirecat.service.EmbedderApi;
import it.baccan.cheshirecat.service.PluginsApi;

/**
 * @author Matteo Baccan
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://10.11.4.141:1865");

        StatusApi statusApi = new StatusApi(defaultClient);
        try {
            Object result = statusApi.home();
            log.info("[{}]", result);
        } catch (ApiException e) {
            log.error("Exception when calling statusApi#home");
            log.error("Status code: " + e.getCode());
            log.error("Reason: " + e.getResponseBody());
            log.error("Response headers: " + e.getResponseHeaders());
            log.error("ApiException", e);
        }

        EmbedderApi embedderApi = new EmbedderApi(defaultClient);
        try {
            Object result = embedderApi.getEmbeddersSettings();
            log.info("[{}]", result);
        } catch (ApiException e) {
            log.error("Exception when calling embedderApi#getEmbeddersSettings");
            log.error("Status code: " + e.getCode());
            log.error("Reason: " + e.getResponseBody());
            log.error("Response headers: " + e.getResponseHeaders());
            log.error("ApiException", e);
        }

        PluginsApi pluginsApi = new PluginsApi(defaultClient);
        try {
            Object result = pluginsApi.getAvailablePlugins("core_plugin");
            log.info("[{}]", result);
        } catch (ApiException e) {
            log.error("Exception when calling pluginsApi#getAvailablePlugins");
            log.error("Status code: " + e.getCode());
            log.error("Reason: " + e.getResponseBody());
            log.error("Response headers: " + e.getResponseHeaders());
            log.error("ApiException", e);
        }

    }

}
