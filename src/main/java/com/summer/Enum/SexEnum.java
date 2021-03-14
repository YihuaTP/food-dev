package com.summer.Enum;


import lombok.Getter;

@Getter
public enum SexEnum {

    MAN(0, "男"),

    WOMAN(1, "女"),

    SECRET(2, "保密");

    private Integer sexType;

    private String message;

    SexEnum(Integer type, String message) {
        this.sexType = type;
        this.message = message;
    }
}
