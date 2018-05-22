package com.sam.ping.commons.constent;

/**
 * @author zhangshexin
 * @createTime 2018/5/18
 */
public enum  CommentStatusEnum {
    //状态：0：不可见，1：可见
    VALID(1,"可见的"),INVALID(0,"不可见的");

    private int code;
    private String describe;
    CommentStatusEnum(int code,String describe){
        this.code=code;
        this.describe=describe;
    }

    public int getCode() {
        return code;
    }

    public String getDescribe() {
        return describe;
    }

    public static CommentStatusEnum parse(int code){
        for (CommentStatusEnum status : CommentStatusEnum.values()){
            if(status.getCode()==code)
                return status;
        }
        return VALID;
    }
}
