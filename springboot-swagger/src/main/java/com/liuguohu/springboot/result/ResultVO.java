package com.liuguohu.springboot.result;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;

/**
 * @program: springboot-exercise-parent
 * @description:
 * @author: liuguohu
 * @create: 2020-04-09 14:58
 **/

@ApiModel(value = "统一响应类")
@Getter
public class ResultVO {

    private Integer code;
    private String msg;
    private Object data;

    public ResultVO(Object data) {
        this(200, "OK", data);
    }

    public ResultVO(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
