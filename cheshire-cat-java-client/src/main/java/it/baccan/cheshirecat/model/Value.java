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
@JsonDeserialize(using=Value.ValueDeserializer.class)
@JsonSerialize(using = Value.ValueSerializer.class)
public class Value extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Value.class.getName());

    public static class ValueSerializer extends StdSerializer<Value> {
        public ValueSerializer(Class<Value> t) {
            super(t);
        }

        public ValueSerializer() {
            this(null);
        }

        @Override
        public void serialize(Value value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ValueDeserializer extends StdDeserializer<Value> {
        public ValueDeserializer() {
            this(Value.class);
        }

        public ValueDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Value deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize Object
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Object.class);
                Value ret = new Value();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'Value'", e);
            }

            // deserialize List<Object>
            try {
                final TypeReference<List<Object>> ref = new TypeReference<List<Object>>(){};
                deserialized = tree.traverse(jp.getCodec()).readValueAs(ref);
                Value ret = new Value();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'Value'", e);
            }

            throw new IOException(String.format("Failed deserialization for Value: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Value getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "Value cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType<?>> schemas = new HashMap<>();

    public Value() {
        super("anyOf", Boolean.FALSE);
    }

    public Value(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Value(List o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<Object>", new GenericType<List<Object>>() {
        });
        schemas.put("Object", new GenericType<Object>() {
        });
        JSON.registerDescendants(Value.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType<?>> getSchemas() {
        return Value.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * List<Object>, Object
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Object.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(List.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be List<Object>, Object");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<Object>, Object
     *
     * @return The actual instance (List<Object>, Object)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
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

    /**
     * Get the actual instance of `List<Object>`. If the actual instance is not `List<Object>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<Object>`
     * @throws ClassCastException if the instance is not `List<Object>`
     */
    public List<Object> getListObject() throws ClassCastException {
        return (List<Object>)super.getActualInstance();
    }

}

