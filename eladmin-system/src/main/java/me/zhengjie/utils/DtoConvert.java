package me.zhengjie.utils;

/**
 * dto 转换工具类
 * <p></p>
 *
 * @version 1.0.0
 * @description: DtoConvert
 * @author: 向鹏飞
 * @since: 2022/1/15
 */
public interface DtoConvert<INT, OUT> {

    OUT covert(INT source);

}
