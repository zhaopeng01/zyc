package com.zyc.mapper;

import com.zyc.entity.ZycArticle;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zyc
 * @since 2018-08-17
 */
public interface ZycArticleMapper extends BaseMapper<ZycArticle> {
    List<ZycArticle> getDocList();
    List<ZycArticle> getRightDocList();
    List<ZycArticle> getRightRandDocList();
}
