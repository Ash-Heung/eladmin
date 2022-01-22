package me.zhengjie.modules.quartz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import me.zhengjie.modules.logs.domain.LogDomain;
import me.zhengjie.modules.quartz.domain.QuartzJobDomain;
import me.zhengjie.modules.quartz.dto.request.QuartzJobPageRequest;
import me.zhengjie.modules.quartz.mapper.QuartzJobMapper;
import me.zhengjie.modules.quartz.service.QuartzJobTmpService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 定时任务
 * <p></p>
 *
 * @version 1.0.0
 * @description: QuartzJobTmpServiceImpl
 * @author: 向鹏飞
 * @since: 2022/1/22
 */
@Slf4j
@Service
public class QuartzJobTmpServiceImpl extends ServiceImpl<QuartzJobMapper, QuartzJobDomain> implements QuartzJobTmpService {

    @Override
    public Page<QuartzJobDomain> pageQuartzJob(QuartzJobPageRequest request) {
        //分页
        Page<QuartzJobDomain> page = new Page(request.getPage(), request.getSize());
        // 查询条件
        LambdaQueryWrapper<QuartzJobDomain> queryWrapper = new QueryWrapper<QuartzJobDomain>()
                .lambda()
                .eq(StringUtils.isNotBlank(request.getBeanName()), QuartzJobDomain::getBeanName, request.getBeanName());
        // 执行查询
        Page<QuartzJobDomain> pageList = page(page, queryWrapper);
        return pageList;
    }
}
