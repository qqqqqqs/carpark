package com.carpark.baidu.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.json.JsonParseException;

import java.lang.reflect.Type;

public class GsonUtils {
    private static Gson gson = new GsonBuilder().create();

    public static String toJson(Object value) {
        return gson.toJson(value);
    }

    public static <T> T fromJson(String json, Class<T> classOfT) throws JsonParseException {
        return gson.fromJson(json, classOfT);
    }

    public static <T> T fromJson(String json, Type typeOfT) throws JsonParseException {
        return (T) gson.fromJson(json, typeOfT);
    }
}


