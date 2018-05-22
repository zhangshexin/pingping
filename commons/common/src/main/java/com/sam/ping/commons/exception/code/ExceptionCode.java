package com.sam.ping.commons.exception.code;

/**
 * @author zhangshexin
 * @createTime 2018/5/18
 */
public enum ExceptionCode {
    UNKNOWN_ERROR(10000,"未定义的错误"),
    //*******系统错提示**********
    SYSTEM_ERROR(10001,"系统开小差了，稍等一下哈！")
    ;

    private int code;
    private String msg;

    ExceptionCode(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static ExceptionCode parse(int code){
        for(ExceptionCode ec:ExceptionCode.values()){
            if(ec.getCode()==code)
                return ec;
        }
        return UNKNOWN_ERROR;
    }
}
