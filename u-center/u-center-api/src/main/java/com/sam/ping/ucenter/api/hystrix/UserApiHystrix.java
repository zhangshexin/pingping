package com.sam.ping.ucenter.api.hystrix;

import com.sam.ping.ucenter.api.UserApi;
import com.sam.ping.ucenter.dto.UserDTO;
import com.sam.ping.ucenter.dto.UserRegistryDTO;
import org.springframework.stereotype.Component;

/**
 * @author zhangshexin
 * @createTime 2018/5/18
 */
@Component
public class UserApiHystrix implements UserApi{
    @Override
    public UserDTO findUserByPwd(String phoneNumber, String pwd) {
        return null;
    }

    @Override
    public UserDTO findUserByPhone(String phoneNumber) {
        return null;
    }

    @Override
    public Boolean check(String userName) {
        return null;
    }

    @Override
    public UserDTO registry(UserRegistryDTO userRegistryDTO) {
        return null;
    }

    @Override
    public UserDTO modify(UserRegistryDTO userRegistryDTO) {
        return null;
    }
}
