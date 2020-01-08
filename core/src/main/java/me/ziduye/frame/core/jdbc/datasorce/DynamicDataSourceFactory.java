package me.ziduye.frame.core.jdbc.datasorce;

import javax.sql.DataSource;
import java.util.Map;

public interface DynamicDataSourceFactory {
    Map<String,DataSource> initDateScource();
}