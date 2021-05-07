package com.boot.basic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author cherrishccl
 * @Date 2021/5/7 11:21
 * @Version 1.0
 * @Description WebConfig
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    /**
     * 可以自定义静态资源文件路径
     * @param registry
     */
    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }*/
}
