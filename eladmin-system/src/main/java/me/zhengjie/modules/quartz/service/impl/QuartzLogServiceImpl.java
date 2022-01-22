/*
 *  Copyright 2019-2020 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package me.zhengjie.modules.quartz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import me.zhengjie.modules.quartz.domain.QuartzJobDomain;
import me.zhengjie.modules.quartz.domain.QuartzLogDomain;
import me.zhengjie.modules.quartz.dto.request.QuartzLogPageRequest;
import me.zhengjie.modules.quartz.mapper.QuartzLogMapper;
import me.zhengjie.modules.quartz.service.QuartzLogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 定时任务日志
 * <p></p>
 *
 * @version 1.0.0
 * @description: QuartzLogMapper
 * @author: 向鹏飞
 * @since: 2022/1/22
 */
@Slf4j
@Service
public class QuartzLogServiceImpl extends ServiceImpl<QuartzLogMapper, QuartzLogDomain> implements QuartzLogService {


    @Override
    public Page<QuartzLogDomain> pageQuartzLog(QuartzLogPageRequest request) {
        //分页
        Page<QuartzLogDomain> page = new Page(request.getPage(), request.getSize());
        // 查询条件
        LambdaQueryWrapper<QuartzLogDomain> queryWrapper = new QueryWrapper<QuartzLogDomain>()
                .lambda()
                .eq(StringUtils.isNotBlank(request.getBeanName()), QuartzLogDomain::getBeanName, request.getBeanName())
                .eq(Objects.nonNull(request.getStatus()), QuartzLogDomain::getIsSuccess, request.getStatus());
        // 执行查询
        Page<QuartzLogDomain> pageList = page(page, queryWrapper);
        return pageList;
    }



}
