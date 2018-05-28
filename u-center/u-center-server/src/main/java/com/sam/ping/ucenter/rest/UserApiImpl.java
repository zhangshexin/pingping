package com.sam.ping.ucenter.rest;

import com.sam.ping.commoncore.base.Result;
import com.sam.ping.commoncore.exception.UncheckException;
import com.sam.ping.commons.constent.UserStatusEnum;
import com.sam.ping.ucenter.api.UserApi;
import com.sam.ping.ucenter.dto.UserDTO;
import com.sam.ping.ucenter.entity.User;
import com.sam.ping.ucenter.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Bool;
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
        try {
            User userEntity=userService.findUserByPwd(phoneNumber,pwd);
            //没有对应上
            if(userEntity==null)
                return Result.fail("用户名或密码错误");
            UserDTO userDTO=mapper.map(userEntity,UserDTO.class);
            return Result.success(userDTO);
        } catch (UncheckException e) {
            e.printStackTrace();
            return Result.fail("用户名或密码错误");
        }
    }

    @ApiOperation(value = "查找用户",notes = "根据手机号查找用户，可用于判断此手机号是否注册过")
    @Override
    public Result<UserDTO> findUserByPhone(String phoneNumber) {
        return null;
    }

    @ApiOperation(value = "检查用户名",notes = "查用户名是否已经存在")
    @Override
    public Result<Boolean> check(String userName) {
        User user=userService.checkUserName(userName);
        if(user==null)
            return Result.success(false);
        else
            return Result.fail("用户名 "+userName+" 已存在");
    }


    @ApiOperation(value = "检查手机号是否已存在",notes = "存在了就不要再让往下走了，走也走不通，后台还作了一次判断")
    @Override
    public Result<Boolean> checkPhoneNumber(String phoneNumber) {
        User user=userService.findUserByPhoneNumber(phoneNumber);
        if(user==null)
            return Result.success(true);
        return Result.fail("手机号已存在");
    }

    @ApiOperation(value = "注册用户",notes = "注册用户")
    @Override
    public Result<UserDTO> registry(UserDTO userRegistryDTO) {
        try {
            //先对手机号进行过滤是否已注册过
            Result<Boolean> result=checkPhoneNumber(userRegistryDTO.getPhoneNumber());
            if(!(result.getData() instanceof Boolean)){
                return Result.fail("手机号已存在");
            }
            //继续走注册
            User user=mapper.map(userRegistryDTO,User.class);
            user.setStatus(UserStatusEnum.NORMAL.getCode());
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
        try {
            User user=mapper.map(userRegistryDTO,User.class);
            userService.updateByPrimaryKeySelective(user);
            return Result.success(userRegistryDTO);
        } catch (UncheckException e) {
            e.printStackTrace();
            return Result.fail(e.toString());
        }
    }
}
