package me.zhengjie.modules.logs.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import me.zhengjie.modules.logs.domain.LogDomain;
import me.zhengjie.modules.logs.dto.request.LogListRequest;

/**
 * 系统日志
 * <p></p>
 *
 * @version 1.0.0
 * @description: 系统日志
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
public interface LogService extends IService<LogDomain>{

    /**
     * 查询 log列表
     * <p></p>
     *
     * @param
     * @return
     * @author 向鹏飞
     * @version 1.0.0
     * @date 2022/1/15 10:19
     */
    Page<LogDomain> listLog(LogListRequest logListRequest);

}
