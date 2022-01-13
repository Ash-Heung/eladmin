package me.zhengjie.modules.enterprise.business.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import me.zhengjie.modules.enterprise.business.EdsStockBusinessService;
import me.zhengjie.modules.enterprise.domain.EdsStockDomain;
import me.zhengjie.modules.enterprise.service.EdsStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公司股票数据 业务service
 * <p></p>
 *
 * @version 1.0.0
 * @description: EdsStockBusinessServiceImpl
 * @author: 向鹏飞
 * @since: 2022/1/13
 */
@Service
public class EdsStockBusinessServiceImpl implements EdsStockBusinessService {

    @Autowired
    private EdsStockService edsStockService;

    @Override
    public List<EdsStockDomain> queryList(int limit, int size) {
        Page<EdsStockDomain> page = new Page<>(limit, size);
        Page<EdsStockDomain> pageList = edsStockService.page(page);
        return pageList.getRecords();
    }

    @Override
    public EdsStockDomain getOne(Long id) {
        return edsStockService.getById(id);
    }
}
