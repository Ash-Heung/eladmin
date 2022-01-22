package me.zhengjie.modules.logs.dto.response;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import me.zhengjie.modules.logs.domain.LogDomain;
import me.zhengjie.utils.DtoConvert;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * 日志分页response
 * <p></p>
 *
 * @version 1.0.0
 * @description: LogPageResponse
 * @author: 向鹏飞
 * @since: 2022/1/15
 */
@Data
public class LogPageResponse implements Serializable {

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
