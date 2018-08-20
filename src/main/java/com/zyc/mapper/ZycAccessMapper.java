package com.zyc.mapper;

import com.zyc.entity.ZycAccess;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zyc
 * @since 2018-08-20
 */
public interface ZycAccessMapper extends BaseMapper<ZycAccess> {
    List<Integer> selectAccessNum();
}
