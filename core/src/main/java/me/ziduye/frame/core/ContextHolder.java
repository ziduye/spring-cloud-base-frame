package me.ziduye.frame.core;

import java.util.HashMap;
import java.util.Map;

public class ContextHolder {

    private static final ThreadLocal<Map<String, Object>> THREAD_LOCAL = new ThreadLocal<>();

    private static void setLocalMap(Map<String, Object> threadLocalMap) {
        THREAD_LOCAL.set(threadLocalMap);
    }

    private static Map<String, Object> getLocalMap() {
        Map<String, Object> map = THREAD_LOCAL.get();
        if (map == null) {
            map = new HashMap<>(10);
            setLocalMap(map);
        }
        return map;
    }

    public static void set(String key, Object value){
        Map<String, Object> map = getLocalMap();
        map.put(key,value);
    }

    public static void setLong(String key, Long value) {
        if (value == null) {
            value = 0l;
        }
        set(key,value);
    }

    public static void setString(String key, String value) {
        if (value == null) {
            value = "";
        }
        set(key,value);
    }

    public static void setBoolean(String key, Boolean value) {
        if (value == null) {
            value = false;
        }
        set(key,value);
    }

    public static Object get(String key) {
        Map<String, Object> map = getLocalMap();
        return map.get(key);
    }

    public static <T> T get(String key,Class<T> clazz) {
        Object obj = get(key);
        if(obj != null){
            try{
                T t = (T)obj;
                return t;
            }catch (Exception e){

            }
        }
        return null;
    }

    public static Long getLong(String key) {
        return get(key,Long.class);
    }

    public static String getString(String key) {
        return get(key,String.class);
    }

    public static Boolean getBoolean(String key) {
        return get(key,Boolean.class);
    }

    public static void remove(String key) {
        Map<String, Object> map = getLocalMap();
        map.remove(key);
    }

}
