package com.anbang.server.bean;

/**
 * @author wuweifeng wrote on 2018/3/19.
 */
public class BaseData {
    private int code;
    private String message;

    public BaseData() {
    }

    public BaseData(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "BaseData{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
