package com.tencent.interceptor;

import com.tencent.pojo.TsmcpUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@Component
public class SecurityInterceptor implements HandlerInterceptor {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("调用方法之前........");
        HttpSession session = request.getSession();
        TsmcpUser tsmcpUser = (TsmcpUser) session.getAttribute("tsmcpUserlist");
        if(tsmcpUser!=null && tsmcpUser.getUserName()!=null&&tsmcpUser.getUserPasswd().length()>0) {//已登录
            return true;
        }else {//未登录
            //直接重定向到登录页面
            response.sendRedirect(request.getContextPath()+"/login.html");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
