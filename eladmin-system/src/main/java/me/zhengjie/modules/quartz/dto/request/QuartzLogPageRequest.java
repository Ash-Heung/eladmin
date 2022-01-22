package me.zhengjie.modules.quartz.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import me.zhengjie.dto.PageRequest;

import java.io.Serializable;

/**
 * 定时任务 分页
 * <p></p>
 *
 * @version 1.0.0
 * @description: QuartzJobPageRequest
 * @author: 向鹏飞
 * @since: 2022/1/22
 */
@Getter
@Setter
public class QuartzLogPageRequest  extends PageRequest {


    @ApiModelProperty(value = "任务名称")
    private String  beanName;

    @ApiModelProperty(value = "开始时间")
    private String startTime;

    @ApiModelProperty(value = "结束时间")
    private String endTime;

    @ApiModelProperty(value = "执行状态")
    private Integer status;


}
