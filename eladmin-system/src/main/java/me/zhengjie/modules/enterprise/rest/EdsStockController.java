package me.zhengjie.modules.enterprise.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import me.zhengjie.annotation.AnonymousAccess;
import me.zhengjie.modules.enterprise.domain.EdsStockDomain;
import me.zhengjie.modules.enterprise.service.EdsStockService;
import me.zhengjie.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


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
    private EdsStockService edsStockService;


    @ApiOperation(value = "查询应用")
    @GetMapping("/queryList")
    @AnonymousAccess
    public ResponseEntity<Object> queryList(Pageable pageable){
        List<EdsStockDomain> edsStockDomains = edsStockService.queryTen(pageable);
        Map<String,Object> map = new LinkedHashMap<>(2);
        map.put("content",edsStockDomains);
        map.put("totalElements",2);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

//    @ApiOperation(value = "查询数据库")
//    @GetMapping("/queryOne")
//    @AnonymousAccess
//    public ResponseEntity<Object> queryEdsStock(@RequestBody Long id){
//        return new ResponseEntity<>(edsStockService.findById(id), HttpStatus.OK);
//    }
}
