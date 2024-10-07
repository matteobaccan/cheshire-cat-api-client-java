/*
 * 😸 Cheshire-Cat API
 * Production ready AI assistant framework
 *
 * The version of the OpenAPI document: 1.6.1
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
import it.baccan.cheshirecat.model.ValidationError;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.baccan.cheshirecat.JSON;

/**
 * HTTPValidationError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class HTTPValidationError {
  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private List<ValidationError> detail = new ArrayList<>();

  public HTTPValidationError() {
  }

  public HTTPValidationError detail(List<ValidationError> detail) {
    this.detail = detail;
    return this;
  }

  public HTTPValidationError addDetailItem(ValidationError detailItem) {
    if (this.detail == null) {
      this.detail = new ArrayList<>();
    }
    this.detail.add(detailItem);
    return this;
  }

  /**
   * Get detail
   * @return detail
   */
  @javax.annotation.Nullable
  public List<ValidationError> getDetail() {
    return detail;
  }

  public void setDetail(List<ValidationError> detail) {
    this.detail = detail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPValidationError htTPValidationError = (HTTPValidationError) o;
    return Objects.equals(this.detail, htTPValidationError.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPValidationError {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
    openapiFields.add("detail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HTTPValidationError
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HTTPValidationError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HTTPValidationError is not found in the empty JSON string", HTTPValidationError.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HTTPValidationError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HTTPValidationError` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonNull()) {
        JsonArray jsonArraydetail = jsonObj.getAsJsonArray("detail");
        if (jsonArraydetail != null) {
          // ensure the json data is an array
          if (!jsonObj.get("detail").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `detail` to be an array in the JSON string but got `%s`", jsonObj.get("detail").toString()));
          }

          // validate the optional field `detail` (array)
          for (int i = 0; i < jsonArraydetail.size(); i++) {
            ValidationError.validateJsonElement(jsonArraydetail.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HTTPValidationError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HTTPValidationError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HTTPValidationError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HTTPValidationError.class));

       return (TypeAdapter<T>) new TypeAdapter<HTTPValidationError>() {
           @Override
           public void write(JsonWriter out, HTTPValidationError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HTTPValidationError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HTTPValidationError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HTTPValidationError
   * @throws IOException if the JSON string is invalid with respect to HTTPValidationError
   */
  public static HTTPValidationError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HTTPValidationError.class);
  }

  /**
   * Convert an instance of HTTPValidationError to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

