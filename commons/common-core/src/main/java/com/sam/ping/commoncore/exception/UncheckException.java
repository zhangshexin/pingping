package com.sam.ping.commoncore.exception;

import com.sam.ping.commoncore.base.BaseException;

/**
 * @author zhangshexin
 * @createTime 2018/5/22
 * 不可查异常
 */
public abstract class UncheckException extends RuntimeException implements BaseException{


    public UncheckException(int code,String msg){
        super(msg);
        this.code=code;
        this.msg=msg;
    }

    public UncheckException(int code,String format,Object... args){
        super(String.format(format,args));
        this.code=code;
        this.msg=String.format(format,args);
    }

    /**
     * 异常信息
     */
    protected String msg;

    /**
     * 具体异常码
     */
    protected int code;

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public int getCode() {
        return code;
    }
}
