//package com.carpark.utils;
/*
这里得到当前session 对象是否为空  为MyCon需要用到的类
 */
//
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//public class MyINT implements HandlerInterceptor {
//    @Override
//    //preHandler表示访问之前就拦截， 拦截有三种方式：访问到controller之前拦截
//    //访问到controller 之后拦截，还有一种是访问的过程中拦截
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        //先拿到当前的session对象
//        HttpSession session=request.getSession();
//        //得到session当前的状态，用来之后做判断
//        String flag= (String) session.getAttribute("admin");
//        if (null==flag || flag.equals("")){
//            response.sendRedirect("loginCheck");
//            return false;
//        }
//            return true;
//    }
//}
