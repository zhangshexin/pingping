package com.sam.ping.commons.constent;

/**
 * @author zhangshexin
 * @createTime 2018/5/18
 */
public enum UserStatusEnum {
    //用户帐号状态，0：注销，1：正常，2：冻结
    LOGOUT(0,"注销"), NORMAL(1,"正常"),FREEZE(2,"冻结");



    private int code;
    private String describe;

    UserStatusEnum(int code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    public int getCode(){
        return code;
    }

    public String getDescribe(){
        return describe;
    }


    public static UserStatusEnum parse(int code){
        for (UserStatusEnum status : UserStatusEnum.values()){
            if(status.getCode()==code)
                return status;
        }
        return NORMAL;
    }
}
