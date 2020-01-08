package me.ziduye.frame.core.jdbc;

public enum DbType {
    MYSQL("mysql","com.mysql.jdbc.Driver","jdbc:mysql://{{host}}:{{port}}/{{dbName}}?{{params}}");

    private String dbType;
    private String driverClassName;
    private String urlFomat;

    DbType(String dbType, String driverClassName, String urlFomat) {
        this.dbType = dbType;
        this.driverClassName = driverClassName;
        this.urlFomat = urlFomat;
    }

    public static DbType get4DbType(String dbType){
        DbType[] arr = DbType.values();
        for(DbType dbType1 : arr){
            if(dbType1.getDbType().equals(dbType)){
                return dbType1;
            }
        }
        throw new RuntimeException("没有对应的枚举项");
    }


    public String getUrl(String host, String port, String dbName, String params){
        String url = this.urlFomat.replace("{{host}}",host)
                .replace("{{port}}",port)
                .replace("{{dbName}}",dbName)
                .replace("{{params}}",params);
//        if(params != null && !params.isEmpty()){
//            String str = params.entrySet().stream().map(ent -> ent.getKey() + "=" +ent.getValue()).collect(Collectors.joining("&amp;"));
//            url = url.replace("{{params}}",str);
//        }
        return url;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrlFomat() {
        return urlFomat;
    }

    public void setUrlFomat(String urlFomat) {
        this.urlFomat = urlFomat;
    }
}
