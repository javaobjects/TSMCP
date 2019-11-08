package com.tencent.controller;

import com.alibaba.fastjson.JSONArray;
import com.tencent.pojo.TsmcpUser;
import com.tencent.service.ITsmcpUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TsmcpUserControl.java
 * @author xianxian
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月31日 15:22:00
 */

@Controller
public class TsmcpUserControl {
    private Logger logger = LoggerFactory.getLogger(TsmcpUserControl.class);

    @Autowired
    private ITsmcpUserService iTsmcpUserService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<TsmcpUser> selectAll(){
        return iTsmcpUserService.selectAll();
    }

    @RequestMapping("/")
    public String showHome() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        logger.info("当前登陆用户：" + name);
        return "index.html";
    }

    @RequestMapping(value = "/getName",method = RequestMethod.GET)
    @ResponseBody
    public List<String> index(Principal principal) {
        //如果未登录，principal为null
        String name3 = principal.getName();
        List<String> list = new ArrayList<>();
        list.add(name3);
        System.out.println(name3);
        return list;
    }


    @RequestMapping("/login")
    public String showLogin() {
        return "login.html";
    }

    @RequestMapping("/login/invalid")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public String invalid() {
        return "Session 已过期，请重新登录";
    }

    @RequestMapping("/user")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_USER')")
    public String printUser() {
        return "如果你看见这句话，说明你有ROLE_USER角色";
    }

    @RequestMapping("/Login")
    @ResponseBody
    public JSONArray Login(String username, String password){
        JSONArray tsmcpUsers = iTsmcpUserService.Login(username,password);
        return tsmcpUsers;
    }


    //处理登录失败的请求
    @RequestMapping("/login/error")
    public void loginError(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");
        AuthenticationException exception =
                (AuthenticationException)request.getSession().getAttribute("SPRING_SECURITY_LAST_EXCEPTION");
        try {
            response.getWriter().write(exception.toString());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }



    /**
     * 判断用户名是否已存在
     * @param username
     * @return
     * @author xianxian
     * @create:2019-10-29
     * @Description
     */
    @RequestMapping("/isExistUsername")
    @ResponseBody
    public Boolean isExistUsername(String username){
        Boolean result = iTsmcpUserService.isExistUsername(username);
        return result;
    }
    /**
     * 获取所有的工厂ID
     * 返回前端的是数组格式
     * 如 [1,2,3,4]
     * @return
     * @author xianxian
     * @create:2019-10-29
     * @Description
     */
    @RequestMapping ("/getAllFactoryIds")
    @ResponseBody
    public List<Integer> getAllFactoryIds(){
        List<Integer> list = iTsmcpUserService.getAllFactoryIds();
        return list;
    }

    /**
     * 用户注册
     * @param tsmcpUser
     * @return
     * @author xianxian
     * @create:2019-10-29
     * @Description
     */
    @RequestMapping ("/insertIntoTsmcpUser")
    @ResponseBody
    public Boolean insertIntoTsmcpUser(TsmcpUser tsmcpUser){
        Boolean result = iTsmcpUserService.insertIntoTsmcpUser(tsmcpUser);
        return result;
    }

    /**
     * 测试用户权限接口
     */
    @RequestMapping("/admin")
    @ResponseBody
    @PreAuthorize("hasPermission('/admin','r')")
    public String printAdminR() {
        return "如果你看见这句话，说明你访问/admin路径具有r权限";
    }

    @RequestMapping("/admin/d")
    @ResponseBody
    @PreAuthorize("hasPermission('/admin','d')")
    public String printAdminD() {
        return "如果你看见这句话，说明你访问/admin路径具有D权限";
    }


    @RequestMapping("/admin/c")
    @ResponseBody
    @PreAuthorize("hasPermission('/admin','c')")
    public String printAdminC() {
        return "如果你看见这句话，说明你访问/admin路径具有c权限";
    }

}
