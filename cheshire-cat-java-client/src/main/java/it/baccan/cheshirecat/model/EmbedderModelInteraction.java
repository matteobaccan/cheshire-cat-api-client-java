/*
 * 😸 Cheshire-Cat API
 * Production ready AI assistant framework
 *
 * The version of the OpenAPI document: 1.9.1
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import it.baccan.cheshirecat.JSON;


/**
 * Represents an interaction with an embedding model.  Inherits from ModelInteraction and includes attributes specific to embedding interactions.  Attributes ---------- model_type : Literal[\&quot;embedder\&quot;]     The type of model, which is fixed to \&quot;embedder\&quot;. source : str     The source of the interaction, defaulting to \&quot;recall\&quot;. reply : List[float]     The embeddings generated by the embedder.
 */
@JsonPropertyOrder({
  EmbedderModelInteraction.JSON_PROPERTY_MODEL_TYPE,
  EmbedderModelInteraction.JSON_PROPERTY_SOURCE,
  EmbedderModelInteraction.JSON_PROPERTY_PROMPT,
  EmbedderModelInteraction.JSON_PROPERTY_INPUT_TOKENS,
  EmbedderModelInteraction.JSON_PROPERTY_STARTED_AT,
  EmbedderModelInteraction.JSON_PROPERTY_REPLY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class EmbedderModelInteraction {
  public static final String JSON_PROPERTY_MODEL_TYPE = "model_type";
  private JsonNullable<Object> modelType = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SOURCE = "source";
  @javax.annotation.Nullable
  private String source = "recall";

  public static final String JSON_PROPERTY_PROMPT = "prompt";
  @javax.annotation.Nonnull
  private List<String> prompt = new ArrayList<>();

  public static final String JSON_PROPERTY_INPUT_TOKENS = "input_tokens";
  @javax.annotation.Nonnull
  private Integer inputTokens;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  @javax.annotation.Nullable
  private BigDecimal startedAt;

  public static final String JSON_PROPERTY_REPLY = "reply";
  @javax.annotation.Nonnull
  private List<BigDecimal> reply = new ArrayList<>();

  public EmbedderModelInteraction() { 
  }

  public EmbedderModelInteraction modelType(@javax.annotation.Nullable Object modelType) {
    this.modelType = JsonNullable.<Object>of(modelType);
    return this;
  }

  /**
   * Get modelType
   * @return modelType
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getModelType() {
        return modelType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getModelType_JsonNullable() {
    return modelType;
  }
  
  @JsonProperty(JSON_PROPERTY_MODEL_TYPE)
  public void setModelType_JsonNullable(JsonNullable<Object> modelType) {
    this.modelType = modelType;
  }

  public void setModelType(@javax.annotation.Nullable Object modelType) {
    this.modelType = JsonNullable.<Object>of(modelType);
  }


  public EmbedderModelInteraction source(@javax.annotation.Nullable String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(@javax.annotation.Nullable String source) {
    this.source = source;
  }


  public EmbedderModelInteraction prompt(@javax.annotation.Nonnull List<String> prompt) {
    this.prompt = prompt;
    return this;
  }

  public EmbedderModelInteraction addPromptItem(String promptItem) {
    if (this.prompt == null) {
      this.prompt = new ArrayList<>();
    }
    this.prompt.add(promptItem);
    return this;
  }

  /**
   * Get prompt
   * @return prompt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getPrompt() {
    return prompt;
  }


  @JsonProperty(JSON_PROPERTY_PROMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrompt(@javax.annotation.Nonnull List<String> prompt) {
    this.prompt = prompt;
  }


  public EmbedderModelInteraction inputTokens(@javax.annotation.Nonnull Integer inputTokens) {
    this.inputTokens = inputTokens;
    return this;
  }

  /**
   * Get inputTokens
   * @return inputTokens
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getInputTokens() {
    return inputTokens;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInputTokens(@javax.annotation.Nonnull Integer inputTokens) {
    this.inputTokens = inputTokens;
  }


  public EmbedderModelInteraction startedAt(@javax.annotation.Nullable BigDecimal startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartedAt(@javax.annotation.Nullable BigDecimal startedAt) {
    this.startedAt = startedAt;
  }


  public EmbedderModelInteraction reply(@javax.annotation.Nonnull List<BigDecimal> reply) {
    this.reply = reply;
    return this;
  }

  public EmbedderModelInteraction addReplyItem(BigDecimal replyItem) {
    if (this.reply == null) {
      this.reply = new ArrayList<>();
    }
    this.reply.add(replyItem);
    return this;
  }

  /**
   * Get reply
   * @return reply
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<BigDecimal> getReply() {
    return reply;
  }


  @JsonProperty(JSON_PROPERTY_REPLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReply(@javax.annotation.Nonnull List<BigDecimal> reply) {
    this.reply = reply;
  }


  /**
   * Return true if this EmbedderModelInteraction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbedderModelInteraction embedderModelInteraction = (EmbedderModelInteraction) o;
    return equalsNullable(this.modelType, embedderModelInteraction.modelType) &&
        Objects.equals(this.source, embedderModelInteraction.source) &&
        Objects.equals(this.prompt, embedderModelInteraction.prompt) &&
        Objects.equals(this.inputTokens, embedderModelInteraction.inputTokens) &&
        Objects.equals(this.startedAt, embedderModelInteraction.startedAt) &&
        Objects.equals(this.reply, embedderModelInteraction.reply);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(modelType), source, prompt, inputTokens, startedAt, reply);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbedderModelInteraction {\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
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

