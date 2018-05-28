package com.sam.ping.commoncore.base;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author zhangshexin
 * @createTime 2018/5/25
 */
public abstract class BaseEntity {
    @Setter
    @Getter
    private Integer id;

    @Setter
    @Getter
    private Date createDate=new Date();

    @Setter
    @Getter
    private Date updateDate;
}
