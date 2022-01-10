package me.zhengjie.modules.enterprise.service;

import me.zhengjie.modules.enterprise.domain.EdsStockDomain;
import me.zhengjie.modules.mnt.service.dto.DatabaseDto;
import me.zhengjie.modules.mnt.service.dto.DatabaseQueryCriteria;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 接口描述
 * <p></p>
 *
 * @version 1.0.0
 * @description: EdsStockService
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
public interface EdsStockService {

    /**
     * 查询全部
     * @return /
     * @param pageable
     */
    List<EdsStockDomain> queryTen(Pageable pageable);

    /**
     * 根据ID查询
     * @param id /
     * @return /
     */
    EdsStockDomain findById(Long id);

}
