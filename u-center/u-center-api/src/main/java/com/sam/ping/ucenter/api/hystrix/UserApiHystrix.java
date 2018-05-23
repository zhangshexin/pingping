package com.sam.ping.ucenter.api.hystrix;

import com.sam.ping.commoncore.base.Result;
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
    public Result<UserDTO> findUserByPwd(String phoneNumber, String pwd) {
        return null;
    }

    @Override
    public Result<UserDTO> findUserByPhone(String phoneNumber) {
        return null;
    }

    @Override
    public Result<Boolean> check(String userName) {
        return null;
    }

    @Override
    public Result<UserDTO> registry(UserRegistryDTO userRegistryDTO) {
        return null;
    }

    @Override
    public Result<UserDTO> modify(UserRegistryDTO userRegistryDTO) {
        return null;
    }
}
