package me.ziduye.frame.core.entity;

public interface ResultCode {
    /**
     * 消息
     *
     * @return String
     */
    String getMessage();

    /**
     * 状态码
     *
     * @return int
     */
    int getCode();

    default String getString() {
        return "[code: " + this.getCode() + ", message: " + this.getMessage() +"]";
    }

}
