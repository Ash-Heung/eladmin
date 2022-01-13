package me.zhengjie.modules.logs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.zhengjie.modules.logs.domain.LogDomain;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 * <p></p>
 *
 * @version 1.0.0
 * @description: 系统日志
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
@Mapper
public interface LogMapper extends BaseMapper<LogDomain> {
}
