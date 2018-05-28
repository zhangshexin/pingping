package com.sam.ping.ucenter.entity;

import com.sam.ping.commoncore.base.BaseEntity;
import lombok.Data;

@Data
public class User extends BaseEntity{

    private String name;

    private String pwd;

    private String email;

    private Integer status;

    private String phoneNumber;
}