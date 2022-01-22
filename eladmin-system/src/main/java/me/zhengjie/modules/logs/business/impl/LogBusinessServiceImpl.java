package me.zhengjie.modules.logs.business.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import me.zhengjie.modules.logs.business.LogBusinessService;
import me.zhengjie.modules.logs.domain.LogDomain;
import me.zhengjie.modules.logs.dto.request.LogListRequest;
import me.zhengjie.modules.logs.dto.response.LogPageResponse;
import me.zhengjie.common.PageInfo;
import me.zhengjie.modules.logs.dto.response.LogResponse;
import me.zhengjie.modules.logs.service.LogService;
import me.zhengjie.utils.BeanCopierUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


/**
 * 日志 业务 service
 * <p></p>
 *
 * @version 1.0.0
 * @description: 系统日志
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
@Service
public class LogBusinessServiceImpl implements LogBusinessService {

    @Autowired
    private LogService logService;

    @Override
    public PageInfo<LogPageResponse> pageInfoLog(LogListRequest request) {
        Page<LogDomain> logDomainPage = logService.listLog(request);
        // 转成
        List<PageInfo> list = BeanCopierUtil.copyList(logDomainPage.getRecords(), PageInfo.class);
        List<LogPageResponse> responseList = BeanCopierUtil.copyList(list, LogPageResponse.class);
        PageInfo<LogPageResponse> response = new PageInfo<LogPageResponse>(logDomainPage.getPages(), logDomainPage.getSize());
        response.setList(responseList);
        response.setTotal(logDomainPage.getTotal());
        return response;
    }

    @Override
    public LogResponse getLogById(Long id) {
        LogDomain logDomain = logService.getById(id);
        if (Objects.isNull(logDomain)) {
            return new LogResponse();
        }
        LogResponse response = new LogResponse();
        BeanCopierUtil.copy(logDomain, response);
        return response;
    }

    @Override
    public void save(String username, String browser, String ip, ProceedingJoinPoint joinPoint, LogDomain log) {

    }


}
