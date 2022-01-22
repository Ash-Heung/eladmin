package me.zhengjie.modules.quartz.business.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import me.zhengjie.common.PageInfo;
import me.zhengjie.modules.quartz.business.QuartzJobBusinessService;
import me.zhengjie.modules.quartz.domain.QuartzJobDomain;
import me.zhengjie.modules.quartz.dto.request.QuartzJobPageRequest;
import me.zhengjie.modules.quartz.dto.response.QuartzJobListResponse;
import me.zhengjie.modules.quartz.service.QuartzJobTmpService;
import me.zhengjie.utils.BeanCopierUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * 定时任务 业务 service
 * <p></p>
 *
 * @version 1.0.0
 * @description: QuartzJobBusinessServiceImpl
 * @author: 向鹏飞
 * @since: 2022/1/22
 */
@Slf4j
@Service
public class QuartzJobBusinessServiceImpl implements QuartzJobBusinessService {

    @Autowired
    private QuartzJobTmpService quartzJobTmpService;

    @Override
    public PageInfo<QuartzJobListResponse> page(QuartzJobPageRequest request) {
        // TODO: 2022/1/22 对于时间判断赋予默认值
        Page<QuartzJobDomain> pages = quartzJobTmpService.pageQuartzJob(request);
        // 转 vo
        List<QuartzJobDomain> domainList = pages.getRecords();
        List<QuartzJobListResponse> responsesList = domainList.isEmpty() ? Collections.emptyList() : BeanCopierUtil.copyList(domainList, QuartzJobListResponse.class);
        PageInfo<QuartzJobListResponse> quartzJobPage = new PageInfo();
        quartzJobPage.setTotal(pages.getTotal());
        quartzJobPage.setList(responsesList);
        return quartzJobPage;
    }
}
