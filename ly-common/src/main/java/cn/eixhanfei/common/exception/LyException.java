package cn.eixhanfei.common.exception;

import cn.eixhanfei.common.enums.ExceptionEnum;
import lombok.Getter;

@Getter
public class LyException extends RuntimeException{

    private ExceptionEnum exceptionEnum;

    public LyException(ExceptionEnum exceptionEnum){
        this.exceptionEnum=exceptionEnum;
    }
}
