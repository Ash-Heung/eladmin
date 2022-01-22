package me.zhengjie.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * log 分页
 * <p></p>
 *
 * @version 1.0.0
 * @description: LogPageResponse
 * @author: 向鹏飞
 * @since: 2022/1/15
 */
@Data
public class PageInfo<T> implements Serializable {

    /**
     * 当前页
     */
    private long page;
    /**
     * 每页的数量
     */
    private long size;
    /**
     * 总记录数
     */
    private long total;
    /**
     * 总页数
     */
    private long pages;
    /**
     * 数据
     */
    private List<T> list;

    /**
     * 是否有下一页
     */
    private boolean hasNext;

    public PageInfo(){}

    public PageInfo(long page, long size){
        this.page = page;
        this.size = size;
    }


}
