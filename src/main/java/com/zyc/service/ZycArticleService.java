package com.zyc.service;

import com.zyc.entity.ZycArticle;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zyc
 * @since 2018-08-17
 */
public interface ZycArticleService extends IService<ZycArticle> {
    public List<ZycArticle> getDocList();
    public List<ZycArticle> getRightDocList();
    public List<ZycArticle> getRightRandDocList();
}
