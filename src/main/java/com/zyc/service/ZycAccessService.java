package com.zyc.service;

import com.zyc.entity.ZycAccess;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zyc
 * @since 2018-08-20
 */
public interface ZycAccessService extends IService<ZycAccess> {

    Integer selectAccessNum();

}
