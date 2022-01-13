package me.zhengjie.modules.enterprise.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.zhengjie.modules.enterprise.domain.EdsStockDomain;
import org.apache.ibatis.annotations.Mapper;


/**
 * 企业股票数据
 * <p></p>
 *
 * @version 1.0.0
 * @description: EdsStockRepository
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
@Mapper
public interface EdsStockMapper extends BaseMapper<EdsStockDomain> {
}
