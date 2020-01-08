package me.ziduye.frame.core.exception;

import me.ziduye.frame.core.entity.ResultCode;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author ziduye(a)gmail.com
 * @version 2017-01-14 13:44
 */
public class BaseRuntimeException extends RuntimeException {

    private final Map<String,Object> properties = new TreeMap<>();

    private ResultCode resultCode;

    public BaseRuntimeException(ResultCode resultCode){
        this.resultCode = resultCode;
    }

    public BaseRuntimeException(ResultCode resultCode, Throwable throwable){
        super(throwable);
        this.resultCode = resultCode;
    }

    public Map<String,Object> props(){
        return this.properties;
    }

    public BaseRuntimeException set(String name, Object value) {
        properties.put(name, value);
        return this;
    }

    //重写Runtime方法。这里打印虚拟机错误信息，注意PrintStream要同步，不然异常并发时会乱掉
    public void printStackTrace(PrintStream s) {
        synchronized (s) {
            printStackTrace(new PrintWriter(s));
        }
    }

    public void printStackTrace(PrintWriter s) {
        synchronized (s) {
            s.println(this);
            Map<String,Object> properties = props();

            if(properties != null && properties.size() > 0 ){
                s.println("\t--------------properties-----------------");
                for (String key : properties.keySet()) {
                    s.println("\t " + key + "=[" + properties.get(key) + "]");
                }
                s.println();
            }

            StackTraceElement[] trace = getStackTrace();
            for (int i=0; i < trace.length; i++) {
                s.println("\tat " + trace[i]);
            }
            s.flush();
        }
    }

    @Override
    public String getMessage(){
        String message = "";
        if(resultCode != null){
            message = resultCode.getString();
        }else {
            message = super.getMessage();
        }
        return message;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
