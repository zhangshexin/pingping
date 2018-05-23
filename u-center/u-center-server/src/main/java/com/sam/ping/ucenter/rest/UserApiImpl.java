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
public class UserApiImpl implements UserApi{
    @ApiOperation(value = "用户登录接口",notes = "验证手机号和密码")
    @Override
    public Result<UserDTO> findUserByPwd(String phoneNumber, String pwd) {
        return null;
    }

    @ApiOperation(value = "查找用户",notes = "根据手机号查找用户，可用于判断此手机号是否注册过")
    @Override
    public Result<UserDTO> findUserByPhone(String phoneNumber) {
        return null;
    }

    @ApiOperation(value = "检查用户名",notes = "查用户名是否已经存在")
    @Override
    public Result<Boolean> check(String userName) {
        return null;
    }

    @ApiOperation(value = "注册用户",notes = "注册用户")
    @Override
    public Result<UserDTO> registry(UserRegistryDTO userRegistryDTO) {
        return null;
    }

    @ApiOperation(value = "修改用户信息",notes = "修改用户信息")
    @Override
    public Result<UserDTO> modify(UserRegistryDTO userRegistryDTO) {
        return null;
    }
}
