package me.ziduye.frame.core.jdbc.dbType.impl;

import lombok.Data;
import me.ziduye.frame.core.jdbc.dbType.DbTypeAble;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

@Data
public class MySqlDbType implements DbTypeAble {

    private final static String dbTypeStr = "mysql";
    private final static String driverClassName = "com.mysql.jdbc.Driver";

    private String url;
    private String host;
    private int port = 3306;
    private String dbName;
    private String params;
    private String username;
    private String password;

    public MySqlDbType(){

    }

    public MySqlDbType(String url){
        this.url = url;
    }

    public MySqlDbType(String host,int port, String dbName,String username,String password, String params){
        this.host = host;
        this.port = port;
        this.dbName = dbName;
        this.params = params;
        this.username = username;
        this.password = password;
    }

    public MySqlDbType(String host,int port, String dbName,String username,String password, Map<String,String> params){
        this(host,port,dbName,username,password,"");
        StringBuilder sb = new StringBuilder();
        if(params != null && params.size() > 0){
            for(String key : params.keySet()){
                String value = params.get(key);
                if(value == null){
                    value = "";
                }
                sb.append(key).append("=").append(value).append("&");
            }
            if(sb.length() > 0){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        this.params = params.toString();

    }

    @Override
    public String dbType() {
        return dbTypeStr;
    }

    @Override
    public String driverClassName() {
        return driverClassName;
    }

    @Override
    public String url() {
        StringBuilder sb = new StringBuilder();
        sb.append("jdbc:mysql://");
        if(StringUtils.isBlank(host)){
            throw new RuntimeException("数据库Host参数不能为空");
        }
        sb.append(host);
        sb.append(":");
        sb.append(port);
        if(StringUtils.isBlank(dbName)){
            throw new RuntimeException("数据库dbName参数不能为空");
        }
        sb.append("/");
        sb.append(dbName);
        if(StringUtils.isNotBlank(params)){
            sb.append("?");
            sb.append(params);
        }
        return sb.toString();
    }

    @Override
    public String username() {
        return username;
    }

    @Override
    public String password() {
        return password;
    }
}
