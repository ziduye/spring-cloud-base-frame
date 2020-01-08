package me.ziduye.frame.core.jdbc.dbType;

public interface DbTypeAble {
    String dbType();
    String driverClassName();
    String url();
    String username();
    String password();

//    MYSQL("mysql","com.mysql.jdbc.Driver","jdbc:mysql://{{host}}:{{port}}/{{dbName}}?{{params}}"),
//    SQLITE("sqlite","org.sqlite.JDBC","jdbc:sqlite:{{host}}"),
//    MSSQL("mssql","com.microsoft.jdbc.sqlserver.SQLServerDriver","jdbc:microsoft:sqlserver://{{host}}:{{port}}"),
//    ORACLE("oracle","com.microsoft.jdbc.sqlserver.SQLServerDriver","jdbc:oracle:thin:@{{host}}:{{port}}:{{dbName}}"),
//    MYSQL("mysql","com.mysql.jdbc.Driver","jdbc:mysql://{{host}}:{{port}}/{{dbName}}?{{params}}");
//
//    private String dbType;
//    private String driverClassName;
//    private String urlFomat;
//
//    DbTypeAble(String dbType, String driverClassName, String urlFomat) {
//        this.dbType = dbType;
//        this.driverClassName = driverClassName;
//        this.urlFomat = urlFomat;
//    }
//
//    public static DbTypeAble get4DbType(String dbType){
//        DbTypeAble[] arr = DbTypeAble.values();
//        for(DbTypeAble dbType1 : arr){
//            if(dbType1.getDbType().equals(dbType)){
//                return dbType1;
//            }
//        }
//        throw new RuntimeException("没有对应的枚举项");
//    }
//
//
//    public String getUrl(String host, String port, String dbName, String params){
//        String url = this.urlFomat.replace("{{host}}",host)
//                .replace("{{port}}",port)
//                .replace("{{dbName}}",dbName)
//                .replace("{{params}}",params);
////        if(params != null && !params.isEmpty()){
////            String str = params.entrySet().stream().map(ent -> ent.getKey() + "=" +ent.getValue()).collect(Collectors.joining("&amp;"));
////            url = url.replace("{{params}}",str);
////        }
//        return url;
//    }
//
//    public String getDbType() {
//        return dbType;
//    }
//
//    public void setDbType(String dbType) {
//        this.dbType = dbType;
//    }
//
//    public String getDriverClassName() {
//        return driverClassName;
//    }
//
//    public void setDriverClassName(String driverClassName) {
//        this.driverClassName = driverClassName;
//    }
//
//    public String getUrlFomat() {
//        return urlFomat;
//    }
//
//    public void setUrlFomat(String urlFomat) {
//        this.urlFomat = urlFomat;
//    }
}
