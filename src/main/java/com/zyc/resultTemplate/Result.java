package com.zyc.resultTemplate;

/**
 * @author zhaopeng
 * @Description: 返回结果实体
 * @email zp152527@163.com
 * @date 2018/8/10 15:03
 */
public class Result<T> {
    private ResultCodeEnum code;
    private String message;
    private T data;

    public ResultCodeEnum getCode() {
        return code;
    }

    public Result() {
    }

    public Result setCode(ResultCodeEnum resultCode) {
        this.code = resultCode;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }
}