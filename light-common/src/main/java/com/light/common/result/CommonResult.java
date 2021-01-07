package com.light.common.result;

/**
 * @ClassName CommonResult
 * @Description: 通用返回对象
 * @Author Administrator
 * @Date 2021/1/7 19:54
 **/

public class CommonResult<T> {

    private int statusCode;
    private String message;
    private T data;

    public CommonResult() {
        this.statusCode = StatusCodeEnum.SUCCESS.getStatusCode();
        this.message = StatusCodeEnum.SUCCESS.getMessage();
    }

    public CommonResult(T data) {
        this.statusCode = StatusCodeEnum.SUCCESS.getStatusCode();
        this.message = StatusCodeEnum.SUCCESS.getMessage();
        this.data = data;
    }

    public CommonResult(int statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public CommonResult(IStatusCode statusCode) {
        this.statusCode = statusCode.getStatusCode();
        this.message = statusCode.getMessage();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
