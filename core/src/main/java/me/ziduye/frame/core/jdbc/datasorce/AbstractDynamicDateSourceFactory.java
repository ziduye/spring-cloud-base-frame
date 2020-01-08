package me.ziduye.frame.core.jdbc.datasorce;

import lombok.Data;

/**
 * 抽象 设置公共数据 动态数据源
 */
@Data
public abstract class AbstractDynamicDateSourceFactory implements DynamicDataSourceFactory {

    private String dataSourceClass;
    private String dataSourceInitMethod;

    private String driverClass;
    private String url;
    private String username;
    private String password;

    private int initialSize;
    private int minIdle;
    private int maxActive;
    private int maxWait;
    private long timeBetweenEvictionRunsMillis;
    private long minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;

}