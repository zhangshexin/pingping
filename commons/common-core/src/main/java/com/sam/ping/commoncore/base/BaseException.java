package com.sam.ping.commoncore.base;

/**
 * @author zhangshexin
 * @createTime 2018/5/22
 */
public interface BaseException {
    /**
     * 返回异常信息
     * @return
     */
    String getMsg();

    /**
     * 返回异常编码
     * @return
     */
    int getCode();
}
