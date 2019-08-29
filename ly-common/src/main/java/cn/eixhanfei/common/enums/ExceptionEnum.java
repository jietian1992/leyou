package cn.eixhanfei.common.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    CATEGORY_NOT_FOUND(404,"商品分类没查到"),
    INVALID_PARAM(400,"参数错误"),

    ;

    int value;
    String message;


    public int value(){
        return this.value();
    }

    public String message(){
        return this.message;
    }

}
