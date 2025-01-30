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
import it.baccan.cheshirecat.model.MessageWhy;
import it.baccan.cheshirecat.model.ModelInteractionsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import it.baccan.cheshirecat.JSON;


import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import it.baccan.cheshirecat.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
@JsonDeserialize(using=CatMessageWhy.CatMessageWhyDeserializer.class)
@JsonSerialize(using = CatMessageWhy.CatMessageWhySerializer.class)
public class CatMessageWhy extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CatMessageWhy.class.getName());

    public static class CatMessageWhySerializer extends StdSerializer<CatMessageWhy> {
        public CatMessageWhySerializer(Class<CatMessageWhy> t) {
            super(t);
        }

        public CatMessageWhySerializer() {
            this(null);
        }

        @Override
        public void serialize(CatMessageWhy value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CatMessageWhyDeserializer extends StdDeserializer<CatMessageWhy> {
        public CatMessageWhyDeserializer() {
            this(CatMessageWhy.class);
        }

        public CatMessageWhyDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CatMessageWhy deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize MessageWhy
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(MessageWhy.class);
                CatMessageWhy ret = new CatMessageWhy();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'CatMessageWhy'", e);
            }

            // deserialize Object (nullable)
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Object.class);
                CatMessageWhy ret = new CatMessageWhy();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'CatMessageWhy'", e);
            }

            throw new IOException(String.format("Failed deserialization for CatMessageWhy: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CatMessageWhy getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CatMessageWhy cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType<?>> schemas = new HashMap<>();

    public CatMessageWhy() {
        super("anyOf", Boolean.FALSE);
    }

    public CatMessageWhy(MessageWhy o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CatMessageWhy(Object o) {
        super("anyOf", Boolean.TRUE);
        setActualInstance(o);
    }

    static {
        schemas.put("MessageWhy", new GenericType<MessageWhy>() {
        });
        schemas.put("Object", new GenericType<Object>() {
        });
        JSON.registerDescendants(CatMessageWhy.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType<?>> getSchemas() {
        return CatMessageWhy.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * MessageWhy, Object
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(MessageWhy.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Object.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MessageWhy, Object");
    }

    /**
     * Get the actual instance, which can be the following:
     * MessageWhy, Object
     *
     * @return The actual instance (MessageWhy, Object)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MessageWhy`. If the actual instance is not `MessageWhy`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageWhy`
     * @throws ClassCastException if the instance is not `MessageWhy`
     */
    public MessageWhy getMessageWhy() throws ClassCastException {
        return (MessageWhy)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Object`. If the actual instance is not `Object`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Object`
     * @throws ClassCastException if the instance is not `Object`
     */
    public Object getObject() throws ClassCastException {
        return (Object)super.getActualInstance();
    }

}

