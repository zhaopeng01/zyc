package com.zyc.controller;

import com.zyc.entity.DemoUser;
import com.zyc.resultTemplate.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoUserController {
    private static final Logger log = LoggerFactory.getLogger(DemoUserController.class);

    @GetMapping("/getUser")
    public Object getUser() {
        DemoUser user = new DemoUser(1L, "张三", 245);
        log.info(user.toString());
        log.error(user.toString());
        return ResultGenerator.successResult(user);
    }
}
