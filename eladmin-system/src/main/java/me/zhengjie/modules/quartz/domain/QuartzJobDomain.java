package me.zhengjie.modules.quartz.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 定时任务
 * <p></p>
 *
 * @param
 * @return
 * @author 向鹏飞
 * @version 1.0.0
 * @date 2022/1/22 16:24
 */
@Getter
@Setter
@TableName("sys_quartz_job")
public class QuartzJobDomain implements Serializable {

    public static final String JOB_KEY = "JOB_KEY";

    @TableId(value = "id", type = IdType.AUTO)
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
