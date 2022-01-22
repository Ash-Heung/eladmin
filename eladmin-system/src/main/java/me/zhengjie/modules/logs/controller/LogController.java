package me.zhengjie.modules.logs.controller;

import io.swagger.annotations.ApiOperation;
import me.zhengjie.annotation.Log;
import me.zhengjie.dto.RestResult;
import me.zhengjie.modules.logs.business.LogBusinessService;
import me.zhengjie.modules.logs.dto.request.LogListRequest;
import me.zhengjie.modules.logs.dto.response.LogPageResponse;
import me.zhengjie.common.PageInfo;
import me.zhengjie.modules.logs.dto.response.LogResponse;
import me.zhengjie.modules.logs.enums.LogTypeEnum;
import me.zhengjie.service.dto.LogQueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 日志 Controller
 * <p></p>
 *
 * @version 1.0.0
 * @description: 系统日志
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
@Controller
@RequestMapping("/api/logs")
public class LogController {

    @Autowired
    private LogBusinessService logBusinessService;


    @Log("导出数据")
    @ApiOperation("导出数据")
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check()")
    public void exportLog(HttpServletResponse response, LogQueryCriteria criteria) throws IOException {
        criteria.setLogType("INFO");
        //logService.download(logService.queryAll(criteria), response);
    }

    @Log("导出错误数据")
    @ApiOperation("导出错误数据")
    @GetMapping(value = "/error/download")
    @PreAuthorize("@el.check()")
    public void exportErrorLog(HttpServletResponse response, LogQueryCriteria criteria) throws IOException {
        criteria.setLogType("ERROR");
       // logService.download(logService.queryAll(criteria), response);
    }

    @ApiOperation("日志查询")
    @PreAuthorize("@el.check()")
    @PostMapping(value = "/info-logs/list")
    public RestResult<PageInfo<LogPageResponse>> queryLog(LogQueryCriteria criteria, Pageable pageable){
        LogListRequest request = new LogListRequest();
        request.setPage(pageable.getPageNumber());
        request.setSize(pageable.getPageSize());
        request.setType(LogTypeEnum.INFO.getType());
        PageInfo<LogPageResponse> pageInfo = logBusinessService.pageInfoLog(request);
        return RestResult.success(pageInfo);
    }

    @GetMapping(value = "/user")
    @ApiOperation("用户日志查询")
    public RestResult<PageInfo<LogPageResponse>> queryUserLog(LogQueryCriteria criteria, Pageable pageable){
        LogListRequest request = new LogListRequest();
        request.setPage(pageable.getPageNumber());
        request.setSize(pageable.getPageSize());
        request.setType(LogTypeEnum.INFO.getType());
        PageInfo<LogPageResponse> pageInfo = logBusinessService.pageInfoLog(request);
        return RestResult.success(pageInfo);
    }

    @GetMapping(value = "/error")
    @ApiOperation("错误日志查询")
    @PreAuthorize("@el.check()")
    public RestResult<PageInfo<LogPageResponse>> queryErrorLog(LogQueryCriteria criteria, Pageable pageable){
        LogListRequest request = new LogListRequest();
        request.setPage(pageable.getPageNumber());
        request.setSize(pageable.getPageSize());
        request.setType(LogTypeEnum.ERROR.getType());
        PageInfo<LogPageResponse> pageInfo = logBusinessService.pageInfoLog(request);
        return RestResult.success(pageInfo);
    }

    @GetMapping(value = "/error/{id}")
    @ApiOperation("日志异常详情查询")
    @PreAuthorize("@el.check()")
    public RestResult<LogResponse> queryErrorLogDetail(@PathVariable Long id){
        LogResponse response = logBusinessService.getLogById(id);
        return RestResult.success(response);
    }

}
