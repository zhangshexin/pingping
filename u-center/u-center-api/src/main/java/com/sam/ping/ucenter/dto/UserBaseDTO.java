package com.sam.ping.ucenter.dto;

import lombok.Data;

/**
 * user DTO 基础类
 */
@Data
public class UserBaseDTO {
    /**
     * 用户id
     */
    private String userId;
    private String phoneNumber;
    private String userName;
    private String email;
    private String pwd;
}
