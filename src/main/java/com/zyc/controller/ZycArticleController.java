package com.zyc.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zyc.entity.ZycArticle;
import com.zyc.resultTemplate.ResultGenerator;
import com.zyc.service.ZycArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zyc
 * @since 2018-08-17
 */
@RestController
@RequestMapping("/zycArticle")
@Api(value = "文章模块", description = "web-Article模块")
public class ZycArticleController {

    private static final Logger log = LoggerFactory.getLogger(DemoUserController.class);

    @Autowired
    private ZycArticleService zycArticleService;

    /**
     * @Description: 查询文章数量
     * @author zhaopeng
     * @email zp152527@163.com
     * @date 2018/8/17 14:28
     */
    @ApiOperation(value = "根据id查询")
    @GetMapping("/findDocNum")
    public Object findDocNum() {
        int count = zycArticleService.selectCount(new EntityWrapper<>());
        return ResultGenerator.successResult(count);
    }

    /**
     * @Description: 根据id查询
     * @author zhaopeng
     * @email zp152527@163.com
     * @date 2018/8/17 14:28
     */
    @ApiOperation(value = "根据id查询")
    @GetMapping("/findById")
    public Object findById(Integer id) {
        ZycArticle zycArticle = zycArticleService.selectById(id);
        return ResultGenerator.successResult(zycArticle);
    }


    /**
     * @Description: 获取首页列表
     * @author zhaopeng
     * @email zp152527@163.com
     * @date 2018/8/17 14:28
     */
    @ApiOperation(value = "获取首页列表")
    @GetMapping("/getDocList")
    public Object getDocList() {
        List<ZycArticle> docList = zycArticleService.getDocList();
        return ResultGenerator.successResult(docList);
    }

    /**
     * @Description: 获取首页列表
     * @author zhaopeng
     * @email zp152527@163.com
     * @date 2018/8/17 14:28
     */
    @ApiOperation(value = "获取右侧列表")
    @GetMapping("/getRightDocList")
    public Object getRightDocList() {
        List<ZycArticle> docList = zycArticleService.getRightDocList();
        return ResultGenerator.successResult(docList);
    }

    /**
     * @Description: 获取首页列表
     * @author zhaopeng
     * @email zp152527@163.com
     * @date 2018/8/17 14:28
     */
    @ApiOperation(value = "获取右侧随机列表")
    @GetMapping("/getRightRandDocList")
    public Object getRightRandDocList() {
        List<ZycArticle> docList = zycArticleService.getRightRandDocList();
        return ResultGenerator.successResult(docList);
    }


}

