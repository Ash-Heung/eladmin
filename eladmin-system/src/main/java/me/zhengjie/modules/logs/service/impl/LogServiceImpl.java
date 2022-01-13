package me.zhengjie.modules.logs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import me.zhengjie.modules.logs.domain.LogDomain;
import me.zhengjie.modules.logs.mapper.LogMapper;
import me.zhengjie.modules.logs.service.LogService;
import org.springframework.stereotype.Service;

/**
 * 系统日志
 * <p></p>
 *
 * @version 1.0.0
 * @description: 系统日志
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, LogDomain> implements LogService {
}
