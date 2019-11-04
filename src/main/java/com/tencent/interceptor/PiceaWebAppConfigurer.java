package com.tencent.interceptor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PiceaWebAppConfigurer implements WebMvcConfigurer {

    @Autowired
    private SecurityInterceptor securityInterceptor;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //这个方法是用来配置静态资源的，比如html，js，css，等等
        registry.addResourceHandler("/webapp")
                .addResourceLocations("/css/**")
                .addResourceLocations("/font/**")
                .addResourceLocations("/img/**")
                .addResourceLocations("/js/**");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns("/**") 表示拦截所有的请求，
        //registryexcludePathPatterns("/login", "/register"); //表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
        registry.addInterceptor(securityInterceptor).addPathPatterns("/**").excludePathPatterns("/login", "/register");
    }
}
