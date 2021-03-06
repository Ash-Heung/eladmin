package me.zhengjie.modules.enterprise.business.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import me.zhengjie.common.PageInfo;
import me.zhengjie.modules.enterprise.business.EdsStockBusinessService;
import me.zhengjie.modules.enterprise.domain.EdsStockDomain;
import me.zhengjie.modules.enterprise.service.EdsStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public PageInfo<EdsStockDomain> queryList(int limit, int size) {
        Page<EdsStockDomain> page = new Page<>(limit, size);
        Page<EdsStockDomain> pageList = edsStockService.page(page);

        PageInfo<EdsStockDomain> pageInfo = new PageInfo();
        pageInfo.setTotal(pageList.getTotal());
        pageInfo.setList(pageList.getRecords());
        return pageInfo;
    }

    @Override
    public EdsStockDomain getOne(Long id) {
        return edsStockService.getById(id);
    }
}
