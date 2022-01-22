package me.zhengjie.modules.logs.business;


import me.zhengjie.modules.logs.domain.LogDomain;
import me.zhengjie.modules.logs.dto.request.LogListRequest;
import me.zhengjie.modules.logs.dto.response.LogPageResponse;
import me.zhengjie.common.PageInfo;
import me.zhengjie.modules.logs.dto.response.LogResponse;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 日志 业务 service
 * <p></p>
 *
 * @version 1.0.0
 * @description: 系统日志
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
public interface LogBusinessService {

    /**
     * log 分页查询
     * <p></p>
     *
     * @param
     * @return
     * @author 向鹏飞
     * @version 1.0.0
     * @date 2022/1/15 10:26
     */
    PageInfo<LogPageResponse> pageInfoLog(LogListRequest request);

    /**
     * 查询单个日志
     * <p></p>
     *
     * @param id
     * @return
     * @author 向鹏飞
     * @version 1.0.0
     * @date 2022/1/15 10:26
     */
    LogResponse getLogById(Long id);


    void save(String username, String browser, String ip, ProceedingJoinPoint joinPoint, LogDomain log);
}
