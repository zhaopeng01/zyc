package com.zyc.resultTemplate;

import java.util.Date;

/**
 * @author zhaopeng
 * @Description: 结果
 * @email zp152527@163.com
 * @date 2018/8/10 14:56
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";


    public static Result successResult() {
        return new Result()
                .setCode(ResultCodeEnum.SUCCESS.getCode())
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setResultDate(new Date());
    }

    public static <T> Result<T> successResult(T data) {
        return new Result()
                .setCode(ResultCodeEnum.SUCCESS.getCode())
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data)
                .setResultDate(new Date());
    }

    public static Result failResult(String message) {
        return new Result()
                .setCode(ResultCodeEnum.FAIL.getCode())
                .setMessage(message)
                .setResultDate(new Date());
    }

    public static Result unauthorizedResult() {
        return new Result()
                .setCode(ResultCodeEnum.UNAUTHORIZED.getCode())
                .setMessage("权限不足！")
                .setResultDate(new Date());
    }
}