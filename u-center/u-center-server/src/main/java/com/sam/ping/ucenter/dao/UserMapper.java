package com.sam.ping.ucenter.dao;

import com.sam.ping.commoncore.base.BaseDao;
import com.sam.ping.ucenter.entity.User;


public interface UserMapper extends BaseDao<User>{
    User findUserByPwd(String phoneNumber, String pwd);
}