package com.zyc.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zyc.entity.ZycAccess;
import com.zyc.resultTemplate.ResultGenerator;
import com.zyc.service.ZycAccessService;
import com.zyc.utils.Constant;
import com.zyc.utils.IpAdrressUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zyc
 * @since 2018-08-20
 */
@RestController
@RequestMapping("/zycAccess")
@Api(value = "访问模块", description = "web-Access模块")
public class ZycAccessController {
    private static final Logger log = LoggerFactory.getLogger(DemoUserController.class);

    @Autowired
    private ZycAccessService zycAccessService;

    /**
     * @Description: 添加访问量
     * @author zhaopeng
     * @email zp152527@163.com
     * @date 2018/8/17 14:28
     */
    @ApiOperation(value = "添加访问量")
    @GetMapping("/addAccess")
    public Object addAccess(HttpServletRequest request) {
        String ipAdrress = IpAdrressUtil.getIpAdrress(request);
        if (ipAdrress == null) {
            ipAdrress = Constant.ADMIN;
        }
        ZycAccess zycAccess = zycAccessService.selectOne(new EntityWrapper<ZycAccess>().eq("req_ip", ipAdrress));
        boolean result = false;
        if (zycAccess == null) {
            result = zycAccessService.insert(new ZycAccess(ipAdrress, Constant.INITNUM));
        } else {
            zycAccess.setReqNum(zycAccess.getReqNum() + Constant.INITNUM);
            result = zycAccessService.updateById(zycAccess);
        }
        Integer count = zycAccessService.selectAccessNum();
        if (result) {
            return ResultGenerator.successResult(count);
        } else {
            return ResultGenerator.failResult(Constant.ADDACCESSEXCEPTION);
        }
    }
}

