package com.sam.ping.ucenter.service;

import com.sam.ping.commoncore.base.BaseService;
import com.sam.ping.ucenter.dao.UserMapper;
import com.sam.ping.ucenter.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author zhangshexin
 * @createTime 2018/5/23
 */
@Service
public class UserService extends BaseService<User,UserMapper>{

    public User findUserByPwd(String phoneNumber, String pwd){
        return dao.findUserByPwd(phoneNumber,pwd);
    }

    public User findUserByPhoneNumber(String phoneNumber){
        return dao.findUserByPhoneNumber(phoneNumber);
    }

    /**
     * 查看是否用户名已存在
     * @param userName
     * @return
     */
    public User checkUserName(String userName){
        return dao.checkUserName(userName);
    }

}
