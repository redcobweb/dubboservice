package com.zac.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zac.demo.service.UserService;

/**
 * <h3>dubboservice</h3>
 * <p>UserService实现类</p>
 *
 * @author : 沈疴
 * @date : 2020-09-19 16:18
 **/

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName(){
        return "zac";
    }
}
