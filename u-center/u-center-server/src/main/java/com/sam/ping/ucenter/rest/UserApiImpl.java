package com.sam.ping.ucenter.rest;

import com.sam.ping.commoncore.base.Result;
import com.sam.ping.ucenter.api.UserApi;
import com.sam.ping.ucenter.dto.UserDTO;
import com.sam.ping.ucenter.dto.UserRegistryDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshexin
 * @createTime 2018/5/22
 */
@Api(value = "API-UserApiImpl",description = "用户帐号管理接口")
@RestController
@RequestMapping("/user")
public class UserApiImpl implements UserApi{
    @ApiOperation(value = "用户登录接口",notes = "验证手机号和密码")
    @RequestMapping("/pwd")
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
