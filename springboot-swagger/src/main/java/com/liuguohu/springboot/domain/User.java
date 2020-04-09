package com.liuguohu.springboot.domain;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @program: springboot-exercise-parent
 * @description:
 * @author: liuguohu
 * @create: 2020-04-08 19:54
 **/

@Data
@ApiModel(parent = Object.class, description = "用户类")
public class User {

    @ApiModelProperty(value = "用户ID")
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "用户密码")
    private String password;
}
