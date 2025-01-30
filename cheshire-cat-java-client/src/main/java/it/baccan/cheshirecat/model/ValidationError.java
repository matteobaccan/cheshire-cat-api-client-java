/*
 * 😸 Cheshire-Cat API
 * Production ready AI assistant framework
 *
 * The version of the OpenAPI document: 1.8.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.baccan.cheshirecat.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import it.baccan.cheshirecat.model.ValidationErrorLocInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import it.baccan.cheshirecat.JSON;


/**
 * ValidationError
 */
@JsonPropertyOrder({
  ValidationError.JSON_PROPERTY_LOC,
  ValidationError.JSON_PROPERTY_MSG,
  ValidationError.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ValidationError {
  public static final String JSON_PROPERTY_LOC = "loc";
  @javax.annotation.Nonnull
  private List<ValidationErrorLocInner> loc = new ArrayList<>();

  public static final String JSON_PROPERTY_MSG = "msg";
  @javax.annotation.Nonnull
  private String msg;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public ValidationError() { 
  }

  public ValidationError loc(@javax.annotation.Nonnull List<ValidationErrorLocInner> loc) {
    this.loc = loc;
    return this;
  }

  public ValidationError addLocItem(ValidationErrorLocInner locItem) {
    if (this.loc == null) {
      this.loc = new ArrayList<>();
    }
    this.loc.add(locItem);
    return this;
  }

  /**
   * Get loc
   * @return loc
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ValidationErrorLocInner> getLoc() {
    return loc;
  }


  @JsonProperty(JSON_PROPERTY_LOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoc(@javax.annotation.Nonnull List<ValidationErrorLocInner> loc) {
    this.loc = loc;
  }


  public ValidationError msg(@javax.annotation.Nonnull String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Get msg
   * @return msg
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMsg() {
    return msg;
  }


  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsg(@javax.annotation.Nonnull String msg) {
    this.msg = msg;
  }


  public ValidationError type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  /**
   * Return true if this ValidationError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.loc, validationError.loc) &&
        Objects.equals(this.msg, validationError.msg) &&
        Objects.equals(this.type, validationError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loc, msg, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    sb.append("    loc: ").append(toIndentedString(loc)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

