package me.zhengjie.modules.enterprise.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import me.zhengjie.modules.enterprise.domain.EdsStockDomain;
import me.zhengjie.modules.enterprise.mapper.EdsStockMapper;
import me.zhengjie.modules.enterprise.service.EdsStockService;
import org.springframework.stereotype.Service;


/**
 * 企业股票 service
 * <p></p>
 *
 * @version 1.0.0
 * @description: EdsStockServiceImpl
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
@Slf4j
@Service
public class EdsStockServiceImpl extends ServiceImpl<EdsStockMapper, EdsStockDomain>  implements EdsStockService{

}
