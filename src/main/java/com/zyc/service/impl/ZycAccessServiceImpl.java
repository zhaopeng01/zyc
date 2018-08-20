package com.zyc.service.impl;

import com.zyc.entity.ZycAccess;
import com.zyc.mapper.ZycAccessMapper;
import com.zyc.service.ZycAccessService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zyc
 * @since 2018-08-20
 */
@Service
public class ZycAccessServiceImpl extends ServiceImpl<ZycAccessMapper, ZycAccess> implements ZycAccessService {

    @Resource
    private ZycAccessMapper zycAccessMapper;

    /**
    *
    * @Description: 查询访问量
    * @author zhaopeng
    * @email zp152527@163.com
    * @date 2018/8/20 17:22
    *
    */
    @Override
    public Integer selectAccessNum() {
        List<Integer> integers = zycAccessMapper.selectAccessNum();
        Integer result = 0;
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        return sum;
    }
}
