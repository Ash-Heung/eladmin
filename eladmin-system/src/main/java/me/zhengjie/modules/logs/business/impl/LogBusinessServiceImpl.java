package me.zhengjie.modules.logs.business.impl;

import me.zhengjie.modules.logs.business.LogBusinessService;
import me.zhengjie.modules.logs.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

}
