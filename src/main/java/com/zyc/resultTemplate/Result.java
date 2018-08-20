package com.zyc.resultTemplate;

import java.util.Date;

/**
 * @author zhaopeng
 * @Description: 返回结果实体
 * @email zp152527@163.com
 * @date 2018/8/10 15:03
 */
public class Result<T> {
    private Integer code;
    private String message;
    private T data;
    private Date resultDate;

    public Date getResultDate() {
        return resultDate;
    }

    public Result setResultDate(Date resultDate) {
        this.resultDate = resultDate;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public Result() {
    }

    public Result setCode(Integer code) {
        this.code = code;
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