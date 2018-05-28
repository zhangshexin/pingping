package com.sam.ping.ucenter.api;


import com.sam.ping.commoncore.base.Result;
import com.sam.ping.ucenter.api.hystrix.UserApiHystrix;
import com.sam.ping.ucenter.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author zhangshexin
 * @createTime 2018/5/18
 */
@FeignClient(name = "u-center-server",path = "/api",fallback = UserApiHystrix.class)
public interface UserApi {
    /**
     * 根据手机号和密码查找用户
     * @param phoneNumber
     * @param pwd
     * @return
     */
    @RequestMapping(value = "/user/pwd",method = RequestMethod.GET)
    Result<UserDTO> findUserByPwd(@RequestParam(value = "phoneNumber") String phoneNumber, @RequestParam(value = "pwd") String pwd);


    /**
     * 根据手机号查找用户
     * @param phoneNumber
     * @return
     */
    @RequestMapping(value = "/user/find",method = RequestMethod.GET)
    Result<UserDTO> findUserByPhone(@RequestParam(value = "phoneNumber") String phoneNumber);


    /**
     * 检查用户名是否存在
     * @param userName
     * @return
     */
    @RequestMapping(value = "/user/check",method = RequestMethod.GET)
    Result<Boolean> check(@RequestParam(value = "userName")String userName);

    /**
     * 注册用户
     * @param userRegistryDTO
     * @return
     */
    @RequestMapping(value = "/user/registry",method = RequestMethod.POST)
    Result<UserDTO> registry(@RequestBody UserDTO userRegistryDTO);


    /**
     * 修改用户的注册信息，例如密码和用户名
     * @param userRegistryDTO
     * @return
     */
    @RequestMapping(value = "/user/modify",method = RequestMethod.POST)
    Result<UserDTO> modify(@RequestBody UserDTO userRegistryDTO);
}
