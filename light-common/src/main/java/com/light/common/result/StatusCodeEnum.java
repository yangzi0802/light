package com.light.common.result;

/**
 * @ClassName StatusCodeEnum
 * @Description: TODO
 * @Author Administrator
 * @Date 2021/1/7 20:02
 **/

public enum  StatusCodeEnum implements IStatusCode {
    /**
     * 操作成功
     */
    SUCCESS(200, "操作成功"),

    /**
     * 操作失败
     */
    FAILED(500, "操作失败"),;


    private int statusCode;
    private String message;

    StatusCodeEnum(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    @Override
    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
