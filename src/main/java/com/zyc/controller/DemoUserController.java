package com.zyc.controller;

import com.zyc.entity.DemoUser;
import com.zyc.entity.DemoUser2;
import com.zyc.resultTemplate.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/user")
@Api(value = "demoUser模块", description = "web-demoUser模块")
public class DemoUserController {
    private static final Logger log = LoggerFactory.getLogger(DemoUserController.class);

    @ApiOperation(value = "获取demoUse1r")
    @GetMapping("/getUser")
    public Object getUser() {
        DemoUser user1 = new DemoUser(1, "我就是你看到的标题1", 1, "https://cn.vuejs.org/images/logo.png");
        DemoUser user2 = new DemoUser(2, "我就是你看到的标题2", 1, "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3125349892,2997059783&fm=27&gp=0.jpg");
        DemoUser user3 = new DemoUser(3, "我就是你看到的标题3", 1, "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3125349892,2997059783&fm=27&gp=0.jpg");
        DemoUser user4 = new DemoUser(4, "我就是你看到的标题4", 1, "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3125349892,2997059783&fm=27&gp=0.jpg");
        DemoUser user5 = new DemoUser(5, "我就是你看到的标题5", 1, "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3125349892,2997059783&fm=27&gp=0.jpg");
        List<DemoUser> demoUsers = Arrays.asList(user1, user2, user3, user4, user5);

        return ResultGenerator.successResult(demoUsers);
    }

    @ApiOperation(value = "获取demoUse1r1")
    @GetMapping("/getUser1")
    public Object getUser1() {
        DemoUser user1 = new DemoUser(1, "这就是你看到的标题1", 1, "https://cn.vuejs.org/images/logo.png");
        DemoUser user2 = new DemoUser(2, "这就是你看到的标题2", 1, "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3125349892,2997059783&fm=27&gp=0.jpg");
        DemoUser user3 = new DemoUser(3, "这就是你看到的标题3", 1, "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3125349892,2997059783&fm=27&gp=0.jpg");
        DemoUser user4 = new DemoUser(4, "这就是你看到的标题4", 1, "https://cn.vuejs.org/images/logo.png");
        DemoUser user5 = new DemoUser(5, "这就是你看到的标题5", 1, "https://cn.vuejs.org/images/logo.png");
        List<DemoUser> demoUsers = Arrays.asList(user1, user2, user3, user4, user5);

        return ResultGenerator.successResult(demoUsers);
    }

    @ApiOperation(value = "获取demoUse1r111111")
    @GetMapping("/getUser2")
    public Object getUser2() {
        String docContent = "这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了";
        DemoUser2 demoUser1 = new DemoUser2(1, "这个是正文标题1", "这个是标签1", docContent, "这个是分类1", "2018-2-2 15:23:33");
        DemoUser2 demoUser2 = new DemoUser2(2, "这个是正文标题2", "这个是标签2", docContent, "这个是分类2", "2018-2-2 15:23:33");
        DemoUser2 demoUser3 = new DemoUser2(3, "这个是正文标题3", "这个是标签3", docContent, "这个是分类3", "2018-2-2 15:23:33");
        DemoUser2 demoUser4 = new DemoUser2(4, "这个是正文标题4", "这个是标签4", docContent, "这个是分类4", "2018-2-2 15:23:33");
        DemoUser2 demoUser5 = new DemoUser2(5, "这个是正文标题5", "这个是标签5", docContent, "这个是分类5", "2018-2-2 15:23:33");
        DemoUser2 demoUser6 = new DemoUser2(6, "这个是正文标题6", "这个是标签6", docContent, "这个是分类6", "2018-2-2 15:23:33");
        DemoUser2 demoUser7 = new DemoUser2(7, "这个是正文标题7", "这个是标签7", docContent, "这个是分类7", "2018-2-2 15:23:33");
        DemoUser2 demoUser8 = new DemoUser2(8, "这个是正文标题8", "这个是标签8", docContent, "这个是分类8", "2018-2-2 15:23:33");
        DemoUser2 demoUser9 = new DemoUser2(9, "这个是正文标题9", "这个是标签9", docContent, "这个是分类9", "2018-2-2 15:23:33");
        DemoUser2 demoUser10 = new DemoUser2(10, "这个是正文标题10", "这个是标签10", docContent, "这个是分类10", "2018-2-2");
        List<DemoUser2> demoUsers = Arrays.asList(demoUser1, demoUser2, demoUser3, demoUser4, demoUser5, demoUser6, demoUser7, demoUser8, demoUser9, demoUser10);

        return ResultGenerator.successResult(demoUsers);
    }
}
