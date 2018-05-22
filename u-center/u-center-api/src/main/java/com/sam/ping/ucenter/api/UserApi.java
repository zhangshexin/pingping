package com.sam.ping.ucenter.api;


import com.sam.ping.ucenter.api.hystrix.UserApiHystrix;
import com.sam.ping.ucenter.dto.UserDTO;
import com.sam.ping.ucenter.dto.UserRegistryDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author zhangshexin
 * @createTime 2018/5/18
 */
@FeignClient(name = "u-center-server",fallback = UserApiHystrix.class)
public interface UserApi {
    /**
     * 根据手机号和密码查找用户
     * @param phoneNumber
     * @param pwd
     * @return
     */
    @RequestMapping(value = "/api/user/pwd",method = RequestMethod.GET)
    UserDTO findUserByPwd(@RequestParam(value = "phoneNumber") String phoneNumber,@RequestParam(value = "pwd") String pwd);


    /**
     * 根据手机号查找用户
     * @param phoneNumber
     * @return
     */
    @RequestMapping(value = "/api/user/find",method = RequestMethod.GET)
    UserDTO findUserByPhone(@RequestParam(value = "phoneNumber") String phoneNumber);


    /**
     * 检查用户名是否存在
     * @param userName
     * @return
     */
    @RequestMapping(value = "/api/user/check",method = RequestMethod.GET)
    Boolean check(@RequestParam(value = "userName")String userName);

    /**
     * 注册用户
     * @param userRegistryDTO
     * @return
     */
    @RequestMapping(value = "/api/user/registry",method = RequestMethod.POST)
    UserDTO registry(@RequestBody UserRegistryDTO userRegistryDTO);


    /**
     * 修改用户的注册信息，例如密码和用户名
     * @param userRegistryDTO
     * @return
     */
    @RequestMapping(value = "/api/user/modify")
    UserDTO modify(@RequestBody UserRegistryDTO userRegistryDTO);
}
