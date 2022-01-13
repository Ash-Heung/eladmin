package me.zhengjie.modules.enterprise.business;

import me.zhengjie.modules.enterprise.domain.EdsStockDomain;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 公司股票数据 业务service
 * <p></p>
 *
 * @version 1.0.0
 * @description: EdsStockBusinessService
 * @author: 向鹏飞
 * @since: 2022/1/13
 */
public interface EdsStockBusinessService {

    /**
     * 查询数据列表
     * <p></p>
     *
     * @param limit
     * @param size
     * @return
     * @author 向鹏飞
     * @version 1.0.0
     * @date 2022/1/13 18:02
     */
    List<EdsStockDomain> queryList(int limit, int size);


    /**
     * 方法描述
     * <p></p>
     *
     * @param id 主键id
     * @return
     * @author 向鹏飞
     * @version 1.0.0
     * @date 2022/1/13 18:02
     */
    EdsStockDomain getOne(Long id);

}
