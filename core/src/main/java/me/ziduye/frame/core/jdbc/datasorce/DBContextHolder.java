package me.ziduye.frame.core.jdbc.datasorce;

public class DBContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDBKey(String dbKey) {
        contextHolder.set(dbKey);
    }

    public static String getDBKey() {
        return contextHolder.get();
    }

    public static void clear() {
        contextHolder.remove();
    }

}
