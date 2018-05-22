package com.sam.ping.commoncore.base;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangshexin
 * @createTime 2018/5/18
 *
 * 结果封装对象
 */
public class Result<T> {
    public static String DEF_FAIL_MSG="系统繁忙，请稍候再试";
    /**
     * 成功返回状态码
     */
    public static int SUCCESS_CODE=200;
    /**
     * 失败返回状态码
     */
    public static int FAIL_CODE=201;


    //默认返回码为正常
    @Getter
    @Setter
    private int code =SUCCESS_CODE;

    @Getter
    @Setter
    private String msg;

    @Getter
    @Setter
    private T data;
    public Result(){}

    public Result(int code,T data,String msg){
        this.code=code;
        this.data=data;
        this.msg=msg;
    }


    /**
     * 请求成功消息，msg为ok
     * @param data
     * @param <E>
     * @return
     */
    public static <E> Result<E> success(E data){
        return new Result<>(SUCCESS_CODE,data,"ok");
    }


    /**
     * 请求成功消息
     * @param data
     * @param msg
     * @param <E>
     * @return
     */
    public static <E> Result<E> success(E data,String msg){
        return new Result<>(SUCCESS_CODE,data,msg);
    }

    /**
     * 失败消息
     * @param code
     * @param msg1
     * @param <E>
     * @return
     */
    public static <E> Result<E> fail(int code,String msg1){
            return new Result<>(code,null,(DEF_FAIL_MSG==null||DEF_FAIL_MSG.isEmpty())?DEF_FAIL_MSG:msg1);
    }

    public static <E> Result<E> fail(String msg){
        return fail(FAIL_CODE,msg);
    }


}
