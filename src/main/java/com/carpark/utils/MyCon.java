//package com.carpark.utils;
///*
//这个是拦截器的代码，拦截没有登录的不明访问，调MyINT的方法
// */
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
//public class MyCon implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //这里设置的是不需要拦截的方法，单独写出来  剩下的都需要拦截 这里是多态的体现
//        registry.addInterceptor(new MyINT()).addPathPatterns("/**")
//                .excludePathPatterns("/sign_in")
//                .excludePathPatterns("/sign_ln")
//                .excludePathPatterns("login")
//                .excludePathPatterns("loginCheck");
//    }
//}
