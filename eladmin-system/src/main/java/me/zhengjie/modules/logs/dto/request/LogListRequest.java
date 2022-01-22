package me.zhengjie.modules.logs.dto.request;

import lombok.Data;

import java.io.Serializable;

/**
 * log 查询 request
 * <p></p>
 *
 * @version 1.0.0
 * @description: LogQueryRequest
 * @author: 向鹏飞
 * @since: 2022/1/15
 */
@Data
public class LogListRequest implements Serializable {

    private int page;

    private int size;

    private String type;

}
