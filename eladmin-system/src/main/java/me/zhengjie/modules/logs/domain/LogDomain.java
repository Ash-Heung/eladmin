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
package me.zhengjie.modules.logs.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 系统日志
 * <p></p>
 *
 * @version 1.0.0
 * @description: 系统日志
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
@Getter
@Setter
@TableName("sys_log")
public class LogDomain implements Serializable {

    @TableId(value = "log_id")
    private Long logId;

    /** 描述 */
    private String description;

    /** 日志类型 */
    private String logType;

    /** 方法名 */
    private String method;

    /** 参数 */
    private String params;

    /** 请求ip */
    private String requestIp;

    /** 请求耗时 */
    private Long time;

    /** 操作用户 */
    private String username;

    /** 地址 */
    private String address;

    /** 浏览器  */
    private String browser;

    /** 异常详细  */
    private byte[] exceptionDetail;

    /** 创建日期 */
    private Date createTime;

}
