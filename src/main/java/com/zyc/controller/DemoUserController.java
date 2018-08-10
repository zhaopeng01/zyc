package com.zyc.controller;

import com.zyc.entity.DemoUser;
import com.zyc.resultTemplate.ResultGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoUserController {

    @GetMapping("/getUser")
    public Object getUser() {
        return ResultGenerator.successResult(new DemoUser(1L, "张三", 25));
    }
}
