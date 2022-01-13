package me.zhengjie.modules.enterprise.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import me.zhengjie.annotation.AnonymousAccess;
import me.zhengjie.dto.RestResult;
import me.zhengjie.modules.enterprise.business.EdsStockBusinessService;
import me.zhengjie.modules.enterprise.domain.EdsStockDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 类描述
 * <p></p>
 *
 * @version 1.0.0
 * @description: EdsStockController
 * @author: 向鹏飞
 * @since: 2022/1/9
 */
@Api(tags = "企业股票数")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/eds/stock")
public class EdsStockController {

    @Autowired
    private EdsStockBusinessService edsStockBusinessService;


    @ApiOperation(value = "查询应用")
    @GetMapping("/queryList")
    @AnonymousAccess
    public RestResult<List<EdsStockDomain>> queryList(Pageable pageable){

        List<EdsStockDomain> queryList =
                edsStockBusinessService.queryList(pageable.getPageNumber(), pageable.getPageSize());

        return RestResult.success(queryList);
    }

//    @ApiOperation(value = "查询数据库")
//    @GetMapping("/queryOne")
//    @AnonymousAccess
//    public ResponseEntity<Object> queryEdsStock(@RequestBody Long id){
//        return new ResponseEntity<>(edsStockService.findById(id), HttpStatus.OK);
//    }
}
