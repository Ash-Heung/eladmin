package me.zhengjie.modules.logs.controller;

import io.swagger.annotations.ApiOperation;
import me.zhengjie.annotation.Log;
import me.zhengjie.modules.logs.business.LogBusinessService;
import me.zhengjie.service.dto.LogQueryCriteria;
import me.zhengjie.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @GetMapping
    @ApiOperation("日志查询")
    @PreAuthorize("@el.check()")
    public ResponseEntity<Object> queryLog(LogQueryCriteria criteria, Pageable pageable){
        criteria.setLogType("INFO");
        return new ResponseEntity<>(logService.queryAll(criteria,pageable), HttpStatus.OK);
    }

    @GetMapping(value = "/user")
    @ApiOperation("用户日志查询")
    public ResponseEntity<Object> queryUserLog(LogQueryCriteria criteria, Pageable pageable){
        criteria.setLogType("INFO");
        criteria.setBlurry(SecurityUtils.getCurrentUsername());
        return new ResponseEntity<>(logService.queryAllByUser(criteria,pageable), HttpStatus.OK);
    }

    @GetMapping(value = "/error")
    @ApiOperation("错误日志查询")
    @PreAuthorize("@el.check()")
    public ResponseEntity<Object> queryErrorLog(LogQueryCriteria criteria, Pageable pageable){
        criteria.setLogType("ERROR");
        return new ResponseEntity<>(logService.queryAll(criteria,pageable), HttpStatus.OK);
    }

    @GetMapping(value = "/error/{id}")
    @ApiOperation("日志异常详情查询")
    @PreAuthorize("@el.check()")
    public ResponseEntity<Object> queryErrorLogDetail(@PathVariable Long id){
        return new ResponseEntity<>(logService.findByErrDetail(id), HttpStatus.OK);
    }
    @DeleteMapping(value = "/del/error")
    @Log("删除所有ERROR日志")
    @ApiOperation("删除所有ERROR日志")
    @PreAuthorize("@el.check()")
    public ResponseEntity<Object> delAllErrorLog(){
        logService.delAllByError();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/del/info")
    @Log("删除所有INFO日志")
    @ApiOperation("删除所有INFO日志")
    @PreAuthorize("@el.check()")
    public ResponseEntity<Object> delAllInfoLog(){
        logService.delAllByInfo();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
