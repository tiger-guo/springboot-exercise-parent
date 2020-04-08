package com.liuguohu.springboot.result;

import lombok.Getter;

/**
 * @program: springboot-exercise-parent
 * @description: 响应状态码及提示
 * @author: liuguohu
 * @create: 2020-04-08 20:28
 **/

@Getter
public enum ResultCode {

    SUCCESS(1000, "操作成功"),

    FAILED(1001, "响应失败"),

    VALIDATE_FAILED(1002, "参数校验失败"),

    ERROR(5000, "未知错误");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
