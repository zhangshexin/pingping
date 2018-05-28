package com.sam.ping.ucenter.api.hystrix;

import com.sam.ping.commoncore.base.Result;
import com.sam.ping.ucenter.api.UserApi;
import com.sam.ping.ucenter.dto.UserDTO;
import org.springframework.stereotype.Component;

/**
 * @author zhangshexin
 * @createTime 2018/5/18
 */
@Component
public class UserApiHystrix implements UserApi{
    @Override
    public Result<UserDTO> findUserByPwd(String phoneNumber, String pwd) {
        return Result.fail(Result.DEF_FAIL_MSG);
    }

    @Override
    public Result<UserDTO> findUserByPhone(String phoneNumber) {
        return Result.fail(Result.DEF_FAIL_MSG);
    }

    @Override
    public Result<Boolean> check(String userName) {
        return Result.fail(Result.DEF_FAIL_MSG);
    }

    @Override
    public Result<UserDTO> registry(UserDTO userRegistryDTO) {
        return Result.fail(Result.DEF_FAIL_MSG);
    }

    @Override
    public Result<UserDTO> modify(UserDTO userRegistryDTO) {
        return Result.fail(Result.DEF_FAIL_MSG);
    }
}
