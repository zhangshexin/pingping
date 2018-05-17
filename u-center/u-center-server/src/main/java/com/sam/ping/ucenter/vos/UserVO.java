package com.sam.ping.ucenter.vos;

import lombok.Data;

/**
 * 对外输出的用户对象
 */
@Data
public class UserVO {
    private String userId;
    private String userName;
    private String pwd;
    private String email;
}
