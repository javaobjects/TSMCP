package com.tencent.tsmcp.controller;


import com.tencent.tsmcp.pojo.TsmcpUser;
import com.tencent.tsmcp.service.ITsmcpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

//	@Autowired @Qualifier("empService")//默认根据类型匹配，可以结合@Qualifier注解注明依赖对象的引用名称

    @Autowired
    private ITsmcpUserService tsmcpUserService;

    @RequestMapping("/Login")
    public TsmcpUser login(String username,String password){
        TsmcpUser tsmcpUser = tsmcpUserService.Login("SCOTT","123456");
        return  tsmcpUser;
    }

}
