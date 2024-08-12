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
import java.util.List;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import it.baccan.cheshirecat.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Value extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Value.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Value.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Value' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Object> adapterObject = gson.getDelegateAdapter(this, TypeToken.get(Object.class));

            final Type typeInstanceListObject = new TypeToken<List<Object>>(){}.getType();
            final TypeAdapter<List<Object>> adapterListObject = (TypeAdapter<List<Object>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListObject));

            return (TypeAdapter<T>) new TypeAdapter<Value>() {
                @Override
                public void write(JsonWriter out, Value value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Object`
                    if (value.getActualInstance() instanceof Object) {
                        JsonPrimitive primitive = adapterObject.toJsonTree((Object)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    // check if the actual instance is of the type `List<Object>`
                    if (value.getActualInstance() instanceof List<?>) {
                        JsonPrimitive primitive = adapterListObject.toJsonTree((List<Object>)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: List<Object>, Object");
                }

                @Override
                public Value read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Object
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.getAsJsonPrimitive().isNumber()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
                        }
                        actualAdapter = adapterObject;
                        Value ret = new Value();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Object failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Object'", e);
                    }
                    // deserialize List<Object>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            if (!element.getAsJsonPrimitive().isNumber()) {
                                throw new IllegalArgumentException(String.format("Expected array items to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
                            }
                        }
                        actualAdapter = adapterListObject;
                        Value ret = new Value();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<Object> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<Object>'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for Value: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Value() {
        super("anyOf", Boolean.FALSE);
    }

    public Value(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Object", Object.class);
        schemas.put("List<Object>", List.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Value.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * List<Object>, Object
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Object) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof Object) {
                super.setActualInstance(instance);
                return;
            }
        }

        throw new RuntimeException("Invalid instance type. Must be List<Object>, Object");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<Object>, Object
     *
     * @return The actual instance (List<Object>, Object)
     */
    @SuppressWarnings("unchecked")
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

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Value
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Object
        try {
            if (!jsonElement.getAsJsonPrimitive().isNumber()) {
                throw new IllegalArgumentException(String.format("Expected json element to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
            }
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Object failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with List<Object>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                if (!element.getAsJsonPrimitive().isNumber()) {
                    throw new IllegalArgumentException(String.format("Expected array items to be of type Number in the JSON string but got `%s`", jsonElement.toString()));
                }
            }
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<Object> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for Value with anyOf schemas: List<Object>, Object. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of Value given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Value
     * @throws IOException if the JSON string is invalid with respect to Value
     */
    public static Value fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Value.class);
    }

    /**
     * Convert an instance of Value to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

