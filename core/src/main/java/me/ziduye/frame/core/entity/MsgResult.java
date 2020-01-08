package me.ziduye.frame.core.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class MsgResult<T> implements Serializable {
    private boolean succ ; // 是否成功
    private String code ;  // 信息代码
	private String msg ;   // 提示信息
	private T data;        // 数据
	private long timestamp = System.currentTimeMillis();


	private MsgResult() {

	}

	public boolean getSucc(){
    	return succ;
	}

    public static MsgResult TrueMsg(){
		return new MsgResult().setSucc(true).setCode("200");
    }

	public static MsgResult FalseMsg(){
		return new MsgResult().setSucc(false).setCode("500");
	}

}
