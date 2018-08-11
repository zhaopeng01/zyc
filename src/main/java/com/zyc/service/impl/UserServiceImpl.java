package com.zyc.service.impl;

import com.zyc.entity.User;
import com.zyc.mapper.UserMapper;
import com.zyc.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zyc
 * @since 2018-08-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
