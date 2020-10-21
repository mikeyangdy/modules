package com.ydy.jwt.interceptor;

import com.auth0.jwt.JWT;
import com.ydy.jwt.utils.JwtUtil;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("-----------拦截------------");
        System.out.println("token:\t"+request.getHeader("token"));
        System.out.println("object:\t"+handler);

        // 如果不是映射到方法直接通过
        if(!(handler instanceof HandlerMethod)){
            return true;
        }

        if (!StringUtils.isEmpty(request.getHeader("token")) && JwtUtil.verity(request.getHeader("token"))){
            return true;
        }

        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("msg","无权限访问");
        writer.write(map.toString());
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
