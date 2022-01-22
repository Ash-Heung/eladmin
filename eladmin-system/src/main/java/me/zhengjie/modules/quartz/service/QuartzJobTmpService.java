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
package me.zhengjie.modules.quartz.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import me.zhengjie.modules.quartz.domain.QuartzJobDomain;
import me.zhengjie.modules.quartz.dto.request.QuartzJobPageRequest;

/**
 * 定时任务
 * <p></p>
 *
 * @version 1.0.0
 * @description: QuartzLogMapper
 * @author: 向鹏飞
 * @since: 2022/1/22
 */
public interface QuartzJobTmpService extends IService<QuartzJobDomain> {


    /**
     * 分页查询
     * <p></p>
     *
     * @param request
     * @return
     * @author 向鹏飞
     * @version 1.0.0
     * @date 2022/1/22 17:18
     */
    Page<QuartzJobDomain> pageQuartzJob(QuartzJobPageRequest request);

}
