package com.liuguohu.springboot.exception;

import com.liuguohu.springboot.result.ResultCode;
import com.liuguohu.springboot.result.ResultVO;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: springboot-exercise-parent
 * @description:全局异常捕捉
 * @author: liuguohu
 * @create: 2020-04-08 20:08
 **/

@RestControllerAdvice
public class ExceptionControllerAdvice {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return new ResultVO<>(ResultCode.FAILED, objectError.getDefaultMessage());
    }

    @ExceptionHandler(APIException.class)
    public ResultVO<String> APIExceptionHandler(APIException e) {
        return new ResultVO<>(ResultCode.VALIDATE_FAILED, e.getMsg());
    }
}
