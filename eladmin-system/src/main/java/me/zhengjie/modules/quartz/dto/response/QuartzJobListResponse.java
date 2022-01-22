package me.zhengjie.modules.quartz.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 定时任务 分页
 * <p></p>
 *
 * @version 1.0.0
 * @description: QuartzJobListResponse
 * @author: 向鹏飞
 * @since: 2022/1/22
 */
@Getter
@Setter
public class QuartzJobListResponse implements Serializable {

    private Long id;

    @ApiModelProperty(value = "Bean名称")
    private String beanName;

    @ApiModelProperty(value = "cron表达式")
    private String cronExpression;

    @ApiModelProperty(value = "状态，暂时或启动")
    private Boolean isPause = false;

    @ApiModelProperty(value = "定时器名称")
    private String jobName;

    @ApiModelProperty(value = "方法名称")
    private String methodName;

    @ApiModelProperty(value = "参数")
    private String params;

    @ApiModelProperty(value = "备注")
    private String description;

    @ApiModelProperty(value = "负责人")
    private String personInCharge;

    @ApiModelProperty(value = "报警邮箱")
    private String email;

    @ApiModelProperty(value = "子任务")
    private String subTask;

    @ApiModelProperty(value = "失败后暂停")
    private Boolean pauseAfterFailure;

    private String createBy;

    private String updateBy;

    private String createTime;

    private String updateTime;

}
