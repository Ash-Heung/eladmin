package me.zhengjie.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 分页
 * <p></p>
 *
 * @version 1.0.0
 * @description: PageRequest
 * @author: 向鹏飞
 * @since: 2022/1/22
 */
public class PageRequest implements Serializable {

    @ApiModelProperty("第几页，默认1")
    private int page = 1;

    @ApiModelProperty("每页展示几条，默认10")
    private int size = 10;

    @ApiModelProperty("总记录数")
    private long total;

    public PageRequest(){}

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
