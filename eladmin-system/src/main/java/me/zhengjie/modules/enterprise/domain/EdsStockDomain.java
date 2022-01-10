package me.zhengjie.modules.enterprise.domain;

/**
 * 类描述
 * <p></p>
 *
 * @version 1.0.0
 * @description: EdsStockDomain
 * @author: 向鹏飞
 * @since: 2022/1/9
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="eds_company_stock")
public class EdsStockDomain implements Serializable {

    @Id
    @Column(name = "id")
    @ApiModelProperty(value = "ID", hidden = true)
    private Long id;


    @ApiModelProperty(value = "股票编码")
    private String stockId;

    @ApiModelProperty(value = "股票名称")
    private String stockName;

    @ApiModelProperty(value = "上市时间")
    private Date marketTime;

    @ApiModelProperty(value = "行业分类")
    private String industryCategory;

    @ApiModelProperty(value = "主营业务")
    private String mainBusiness;

}
