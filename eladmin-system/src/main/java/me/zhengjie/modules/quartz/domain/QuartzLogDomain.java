/*
 *  Copyright 2019-2020 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package me.zhengjie.modules.quartz.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 定时任务日志
 * <p></p>
 *
 * @param
 * @return
 * @author 向鹏飞
 * @version 1.0.0
 * @date 2022/1/22 16:26
 */
@Getter
@Setter
@TableName("sys_quartz_log")
public class QuartzLogDomain implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "bean名称", hidden = true)
    private String beanName;

    @ApiModelProperty(value = "创建时间", hidden = true)
    private Timestamp createTime;

    @ApiModelProperty(value = "cron表达式", hidden = true)
    private String cronExpression;

    @ApiModelProperty(value = "异常详情", hidden = true)
    private String exceptionDetail;

    @ApiModelProperty(value = "状态", hidden = true)
    private Integer isSuccess;

    @ApiModelProperty(value = "任务名称", hidden = true)
    private String jobName;

    @ApiModelProperty(value = "方法名称", hidden = true)
    private String methodName;

    @ApiModelProperty(value = "参数", hidden = true)
    private String params;

    @ApiModelProperty(value = "执行耗时", hidden = true)
    private Long time;

}
