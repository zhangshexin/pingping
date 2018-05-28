package com.sam.ping.ucenter.dao;

import com.sam.ping.commoncore.base.BaseDao;
import com.sam.ping.ucenter.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper extends BaseDao<User>{
    User findUserByPwd(@Param("phoneNumber") String phoneNumber,@Param("pwd") String pwd);

    User findUserByPhoneNumber(String phoneNumber);

    /**
     * 查看是否用户名已存在
     * @param userName
     * @return
     */
    User checkUserName(String userName);
}