package me.zhengjie.modules.enterprise.respository;

import me.zhengjie.modules.enterprise.domain.EdsStockDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 类描述
 * <p></p>
 *
 * @version 1.0.0
 * @description: EdsStockRepository
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
public interface EdsStockRepository extends JpaRepository<EdsStockDomain, Long>, JpaSpecificationExecutor<EdsStockDomain> {
}
