package com.sam.ping.commons.constent;

/**
 * @author zhangshexin
 * @createTime 2018/5/18
 */
public enum CompanyStatusEnum {
    //'状态，0：不可见，1：正常，2：置顶',

    INVALID(0, "不可见"), VALID(1, "正常"), TOP(2, "置顶");

    private int code;
    private String describe;

    CompanyStatusEnum(int code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }

    public int getCode() {
        return code;
    }

    public static CompanyStatusEnum parse(int code) {
        for (CompanyStatusEnum status : CompanyStatusEnum.values()) {
            if (status.getCode() == code)
                return status;
        }
        return VALID;
    }

}
