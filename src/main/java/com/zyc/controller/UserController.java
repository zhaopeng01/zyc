package com.zyc.controller;


import com.zyc.resultTemplate.ResultGenerator;
import com.zyc.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author zyc
 * @since 2018-08-11
 */
@RestController
@RequestMapping("/user1")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "测试返回")
    @GetMapping("/get")
    public Object getUsers() {
        return ResultGenerator.successResult(userService.selectById(1));
    }
}

