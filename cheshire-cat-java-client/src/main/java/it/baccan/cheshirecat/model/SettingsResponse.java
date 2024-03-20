/*
 * 😸 Cheshire-Cat API
 * Customizable AI architecture
 *
 * The version of the OpenAPI document: 0.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.baccan.cheshirecat.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import it.baccan.cheshirecat.model.Setting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.baccan.cheshirecat.JSON;

/**
 * SettingsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-20T01:30:20.533391300+01:00[Europe/Berlin]")
public class SettingsResponse {
  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private List<Setting> settings = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTED_CONFIGURATION = "selected_configuration";
  @SerializedName(SERIALIZED_NAME_SELECTED_CONFIGURATION)
  private String selectedConfiguration;

  public SettingsResponse() {
  }

  public SettingsResponse settings(List<Setting> settings) {
    this.settings = settings;
    return this;
  }

  public SettingsResponse addSettingsItem(Setting settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nonnull
  public List<Setting> getSettings() {
    return settings;
  }

  public void setSettings(List<Setting> settings) {
    this.settings = settings;
  }


  public SettingsResponse selectedConfiguration(String selectedConfiguration) {
    this.selectedConfiguration = selectedConfiguration;
    return this;
  }

   /**
   * Get selectedConfiguration
   * @return selectedConfiguration
  **/
  @javax.annotation.Nullable
  public String getSelectedConfiguration() {
    return selectedConfiguration;
  }

  public void setSelectedConfiguration(String selectedConfiguration) {
    this.selectedConfiguration = selectedConfiguration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsResponse settingsResponse = (SettingsResponse) o;
    return Objects.equals(this.settings, settingsResponse.settings) &&
        Objects.equals(this.selectedConfiguration, settingsResponse.selectedConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings, selectedConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsResponse {\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    selectedConfiguration: ").append(toIndentedString(selectedConfiguration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("settings");
    openapiFields.add("selected_configuration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("settings");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettingsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SettingsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettingsResponse is not found in the empty JSON string", SettingsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SettingsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SettingsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SettingsResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("settings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `settings` to be an array in the JSON string but got `%s`", jsonObj.get("settings").toString()));
      }

      JsonArray jsonArraysettings = jsonObj.getAsJsonArray("settings");
      // validate the required field `settings` (array)
      for (int i = 0; i < jsonArraysettings.size(); i++) {
        Setting.validateJsonElement(jsonArraysettings.get(i));
      };
      if ((jsonObj.get("selected_configuration") != null && !jsonObj.get("selected_configuration").isJsonNull()) && !jsonObj.get("selected_configuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selected_configuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selected_configuration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettingsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettingsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettingsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettingsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SettingsResponse>() {
           @Override
           public void write(JsonWriter out, SettingsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettingsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettingsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettingsResponse
  * @throws IOException if the JSON string is invalid with respect to SettingsResponse
  */
  public static SettingsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettingsResponse.class);
  }

 /**
  * Convert an instance of SettingsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
