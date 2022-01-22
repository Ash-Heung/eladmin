package me.zhengjie.modules.logs.enums;

import lombok.Getter;

/**
 * 日志枚举
 * <p></p>
 *
 * @version 1.0.0
 * @description: LogTypeEnum
 * @author: 向鹏飞
 * @since: 2022/1/15
 */
@Getter
public enum LogTypeEnum {

    INFO("INFO"),
    ERROR("ERROR");

    private String type;
    LogTypeEnum(String type){
        this.type = type;
    }
}
