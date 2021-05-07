package com.boot.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Author cherrishccl
 * @Date 2021/5/7 10:51
 * @Version 1.0
 * @Description 视图解析器配置 也可以用配置文件
 */
@Configuration
public class ResourceViewResolverConfig {
    /**
     * 注册视图解析器(也可以在配置文件中配置)
     * @return
     */
    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        // 自动添加前缀
        // spring.mvc.view.prefix=/WEB-INF/views/
        resolver.setPrefix("/WEB-INF/views/");
        // 自动添加后缀
        // spring.mvc.view.suffix=.jsp
        resolver.setSuffix(".jsp");
        return resolver;
    }

}
