package me.zhengjie.modules.enterprise.service.impl;

import lombok.extern.slf4j.Slf4j;
import me.zhengjie.modules.enterprise.domain.EdsStockDomain;
import me.zhengjie.modules.enterprise.respository.EdsStockRepository;
import me.zhengjie.modules.enterprise.service.EdsStockService;
import me.zhengjie.utils.ValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述
 * <p></p>
 *
 * @version 1.0.0
 * @description: EdsStockServiceImpl
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
@Slf4j
@Service
public class EdsStockServiceImpl implements EdsStockService {

    @Autowired
    private EdsStockRepository edsStockRepository;

    @Override
    public List<EdsStockDomain> queryTen(Pageable pageable) {
        Page<EdsStockDomain> page = edsStockRepository.findAll(pageable);
        return page.getContent();

    }

    @Override
    public EdsStockDomain findById(Long id) {
        EdsStockDomain edsStockDomain = edsStockRepository.findById(id).orElseGet(EdsStockDomain::new);
        ValidationUtil.isNull(edsStockDomain.getId(),"EdsStockDomain","id",id);
        return edsStockDomain;
    }
}
