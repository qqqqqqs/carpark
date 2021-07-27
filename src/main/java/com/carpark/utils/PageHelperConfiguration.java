package com.carpark.utils;
import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;
/**
 * @Author Zhongks
 * @Description //TODO 分页配置对象
 * @Date 14:47 2021/4/23
 * @Param
 * @return
 **/
@Configuration
public class PageHelperConfiguration {
    /**
     * @Author Zhongks
     * @Description //TODO 分页对象实列化
     * @Date 15:49 2021/4/23
     * @Param []
     * @return com.github.pagehelper.PageHelper
     **/
    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        p.setProperty("dialect", "Oracle");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
