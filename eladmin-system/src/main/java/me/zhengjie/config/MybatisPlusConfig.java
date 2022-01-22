package me.zhengjie.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * mybatis 配置
 * <p></p>
 *
 * @version 1.0.0
 * @description: RestResult
 * @author: 向鹏飞
 * @since: 2022/1/13
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "me.zhengjie.modules.*.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
