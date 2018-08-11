package com.zyc.controller;

import com.zyc.entity.DemoUser;
import com.zyc.resultTemplate.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "demoUser模块", description = "web-demoUser模块")
public class DemoUserController {
    private static final Logger log = LoggerFactory.getLogger(DemoUserController.class);

    @ApiOperation(value="获取demoUse1r")
    @GetMapping("/getUser")
    public Object getUser() {
        DemoUser user = new DemoUser(1L, "张三", 245);
        log.info(user.toString());
        log.error(user.toString());
        return ResultGenerator.successResult(user);
    }
}
