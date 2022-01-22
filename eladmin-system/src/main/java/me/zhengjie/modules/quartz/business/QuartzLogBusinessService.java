package me.zhengjie.modules.quartz.business;

import me.zhengjie.common.PageInfo;
import me.zhengjie.modules.quartz.dto.request.QuartzJobPageRequest;
import me.zhengjie.modules.quartz.dto.request.QuartzLogPageRequest;
import me.zhengjie.modules.quartz.dto.response.QuartzJobListResponse;

/**
 * 任务日志 业务 service
 * <p></p>
 *
 * @version 1.0.0
 * @description: QuartzLogBusinessService
 * @author: 向鹏飞
 * @since: 2022/1/22
 */
public interface QuartzLogBusinessService {

    /**
     * 定时任务 分页
     * <p></p>
     *
     * @param
     * @return
     * @author 向鹏飞
     * @version 1.0.0
     * @date 2022/1/22 17:45
     */
    PageInfo<QuartzJobListResponse> page(QuartzLogPageRequest request);

}
