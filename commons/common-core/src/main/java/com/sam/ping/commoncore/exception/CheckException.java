package com.sam.ping.commoncore.exception;

import com.sam.ping.commoncore.base.BaseException;

/**
 * @author zhangshexin
 * @createTime 2018/5/22
 * 可查异常
 *
 * 运行时异常和非运行时异常 https://www.cnblogs.com/diegodu/p/7298882.html
 *
 * <p>
 * <p>
 * 通常，Java的异常(包括Exception和Error)分为可查的异常（checked exceptions）和不可查的异常（unchecked exceptions）。
 * 可查异常（编译器要求必须处置的异常）：正确的程序在运行中，很容易出现的、情理可容的异常状况。可查异常虽然是异常状况，但在一定程度上它的发生是可以预计的，而且一旦发生这种异常状况，就必须采取某种方式进行处理。
 * 除了RuntimeException及其子类以外，其他的Exception类及其子类都属于可查异常。这种异常的特点是Java编译器会检查它，也就是说，当程序中可能出现这类异常，要么用try-catch语句捕获它，要么用throws子句声明抛出它，否则编译不会通过。
 * 不可查异常(编译器不要求强制处置的异常):包括运行时异常（RuntimeException与其子类）和错误（Error）。
 * <p>
 * 如果使用throw在方法体中抛出可查异常，则需要在方法头部声明方法可能抛出的异常类型。程序会在throw语句后立即终止，它后面的语句执行不到，然后在包含它的所有try块中（可能在上层调用函数中）从里向外寻找含有与其匹配的catch子句的try块。
 */
public abstract class CheckException extends Exception implements BaseException{


    public CheckException(int code,String msg){
        super(msg);
        this.code=code;
        this.msg=msg;
    }

    public CheckException(int code,String format,Object... args){
        super(String.format(format,args));
        this.code=code;
        this.msg=String.format(format,args);
    }


    protected int code;
    protected String msg;

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public int getCode() {
        return code;
    }
}
