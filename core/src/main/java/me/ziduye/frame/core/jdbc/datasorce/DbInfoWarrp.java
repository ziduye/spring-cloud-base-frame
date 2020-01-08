package me.ziduye.frame.core.jdbc.datasorce;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import me.ziduye.frame.core.jdbc.DbType;

@Data
@Accessors(chain = true)
public class DbInfoWarrp {

    private String type;
    private String host;
    private String port;
    private String name;
    private String params;

    private String userName;
    private String password;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private DbType dbType;

    private DbInfoWarrp(){

    }

    public static DbInfoWarrp getInstance(){
        DbInfoWarrp ins = new DbInfoWarrp();
        return ins;
    }

    public String getUrl(){
        return DbType.get4DbType(type).getUrl(this.getHost(),this.getPort(),this.getName(),this.getParams());
    }

    public String getDriverClassName(){
       return DbType.get4DbType(type).getDriverClassName();
    }

}
