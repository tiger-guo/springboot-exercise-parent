package com.liuguohu.springboot.exception;

import lombok.Getter;

/**
 * @program: springboot-exercise-parent
 * @description:异常类
 * @author: liuguohu
 * @create: 2020-04-08 20:21
 **/

@Getter
public class APIException extends RuntimeException{

    private int code;
    private String msg;

    public APIException() {
        this(1001, "接口错误");
    }

    public APIException(String msg) {
        this(1001, msg);
    }

    public APIException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
