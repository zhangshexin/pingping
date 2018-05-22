package com.sam.ping.ucenter.dto;

import lombok.Data;

/**
 * 对外输出的用户对象
 */
@Data
public class UserDTO extends UserBaseDTO{
    /**
     * 状态码
     */
    private int code;
    /**
     * 响应描述
     */
    private String msg;

}
