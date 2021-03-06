package com.example.springBootDemo.enums;

/**
 * 返回码枚举类
 */
public enum CodeMessageEnum {
    OK(200, "操作成功"), ERROR(500, "操作失败"),;

    private Integer code;
    private String msg;

    CodeMessageEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer code() {
        return code;
    }

    public String msg() {
        return msg;
    }
}
