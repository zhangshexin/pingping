package com.sam.ping.ucenter.rest;

import com.sam.ping.commoncore.base.Result;
import com.sam.ping.commoncore.exception.UncheckException;
import com.sam.ping.ucenter.api.UserApi;
import com.sam.ping.ucenter.dto.UserDTO;
import com.sam.ping.ucenter.entity.User;
import com.sam.ping.ucenter.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.MappingException;
import org.dozer.loader.DozerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshexin
 * @createTime 2018/5/22
 */
@Api(value = "API-UserApiImpl",description = "用户帐号管理接口")
@RestController
public class UserApiImpl implements UserApi{

    @Autowired
    private UserService userService;

    @Autowired
    private Mapper mapper;


    @ApiOperation(value = "用户登录接口",notes = "验证手机号和密码")
    @Override
    public Result<UserDTO> findUserByPwd(String phoneNumber, String pwd) {
        User userEntity=userService.findUserByPwd(phoneNumber,pwd);
        UserDTO userDTO=mapper.map(userEntity,UserDTO.class);

        return Result.success(userDTO);
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
    public Result<UserDTO> registry(UserDTO userRegistryDTO) {
        try {
            User user=mapper.map(userRegistryDTO,User.class);
            userService.insert(user);
            return Result.success(mapper.map(user,UserDTO.class));
        } catch (UncheckException e) {
            e.printStackTrace();
            return Result.fail(e.getMsg());
        }

    }

    @ApiOperation(value = "修改用户信息",notes = "修改用户信息")
    @Override
    public Result<UserDTO> modify(UserDTO userRegistryDTO) {
        return null;
    }
}
