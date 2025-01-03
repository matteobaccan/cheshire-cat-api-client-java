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


package it.baccan.cheshirecat.model;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import it.baccan.cheshirecat.model.CatMessageWhy;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import it.baccan.cheshirecat.JSON;


/**
 * Class for wrapping cat message  Variables:     content (str): cat message     user_id (str): user id
 */
@JsonPropertyOrder({
  CatMessage.JSON_PROPERTY_CONTENT,
  CatMessage.JSON_PROPERTY_USER_ID,
  CatMessage.JSON_PROPERTY_TYPE,
  CatMessage.JSON_PROPERTY_WHY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CatMessage {
  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nonnull
  private String content;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  @javax.annotation.Nonnull
  private String userId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private String type = "chat";

  public static final String JSON_PROPERTY_WHY = "why";
  @javax.annotation.Nullable
  private CatMessageWhy why;

  public CatMessage() { 
  }

  public CatMessage content(@javax.annotation.Nonnull String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(@javax.annotation.Nonnull String content) {
    this.content = content;
  }


  public CatMessage userId(@javax.annotation.Nonnull String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(@javax.annotation.Nonnull String userId) {
    this.userId = userId;
  }


  public CatMessage type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public CatMessage why(@javax.annotation.Nullable CatMessageWhy why) {
    this.why = why;
    return this;
  }

  /**
   * Get why
   * @return why
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CatMessageWhy getWhy() {
    return why;
  }


  @JsonProperty(JSON_PROPERTY_WHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhy(@javax.annotation.Nullable CatMessageWhy why) {
    this.why = why;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public CatMessage putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this CatMessage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatMessage catMessage = (CatMessage) o;
    return Objects.equals(this.content, catMessage.content) &&
        Objects.equals(this.userId, catMessage.userId) &&
        Objects.equals(this.type, catMessage.type) &&
        Objects.equals(this.why, catMessage.why)&&
        Objects.equals(this.additionalProperties, catMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, userId, type, why, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    why: ").append(toIndentedString(why)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

}

