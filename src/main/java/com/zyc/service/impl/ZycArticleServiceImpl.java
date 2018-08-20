package com.zyc.service.impl;

import com.zyc.controller.DemoUserController;
import com.zyc.entity.ZycArticle;
import com.zyc.mapper.ZycArticleMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zyc.service.ZycArticleService;
import com.zyc.utils.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zyc
 * @since 2018-08-17
 */
@Service
public class ZycArticleServiceImpl extends ServiceImpl<ZycArticleMapper, ZycArticle> implements ZycArticleService {
    private static final Logger log = LoggerFactory.getLogger(DemoUserController.class);

    @Resource
    private ZycArticleMapper zycArticleMapper;

    /**
    *
    * @Description: 获取首页列表
    * @author zhaopeng
    * @email zp152527@163.com
    * @date 2018/8/17 16:21 
    *
    */
    @Override
    public List<ZycArticle> getDocList() {
        List<ZycArticle> list = zycArticleMapper.getDocList();
        if (list.size() <= 0) {
            log.info("获取首页列表" + Constant.SERVICEEXCEPTION);
        }
        return list;
    }

    /**
    *
    * @Description: 获取右侧列表
    * @author zhaopeng
    * @email zp152527@163.com
    * @date 2018/8/17 16:22 
    *
    */
    @Override
    public List<ZycArticle> getRightDocList() {
        List<ZycArticle> list = zycArticleMapper.getRightDocList();
        if (list.size() <= 0) {
            log.info("获取右侧列表" + Constant.SERVICEEXCEPTION);
        }
        return list;
    }

    /**
    *
    * @Description: 获取右侧随机列表
    * @author zhaopeng
    * @email zp152527@163.com
    * @date 2018/8/17 17:43
    *
    */
    @Override
    public List<ZycArticle> getRightRandDocList() {
        List<ZycArticle> list = zycArticleMapper.getRightRandDocList();
        if (list.size() <= 0) {
            log.info("获取右侧随机列表" + Constant.SERVICEEXCEPTION);
        }
        return list;
    }
}
