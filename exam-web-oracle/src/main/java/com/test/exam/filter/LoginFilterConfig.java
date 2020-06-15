package com.test.exam.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 登录拦截器，编写拦截器配置文件类并继承  WebMvcConfigurer类，并重写其中的方法  addInterceptors并且在主类上加上注解 
 * 基于springboot2.0以上版本
 * @author Administrator
 *
 */
@Configuration
public class LoginFilterConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new UserInterceptor());
        registration.addPathPatterns("/**");                      //所有路径都被拦截
        registration.excludePathPatterns(                         //添加不拦截路径
                                        // "你的登陆路径",            //登录
                                        "/user/login",
                                         "/**/*.html",            //html静态资源
                                         "/**/*.js",              //js静态资源
                                         "/**/*.css"             //css静态资源
                                         );    
    }
    
}
