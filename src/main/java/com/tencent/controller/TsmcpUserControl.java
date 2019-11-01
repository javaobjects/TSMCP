package com.tencent.controller;

import com.tencent.pojo.TsmcpUser;
import com.tencent.service.ITsmcpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName TsmcpUserControl.java
 * @author xianxian
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月31日 15:22:00
 */

@RestController
public class TsmcpUserControl {

    @Autowired
    private ITsmcpUserService iTsmcpUserService;

    @RequestMapping("/selectAll")
    public List<com.tencent.pojo.TsmcpUser> selectAll(){
        return iTsmcpUserService.selectAll();
    }

//    @RequestMapping("/Login")
//    @GetMapping("/Login")
    @PostMapping("/Login")
    public com.tencent.pojo.TsmcpUser login(String username, String password){
        TsmcpUser tsmcpUser = iTsmcpUserService.Login("SCOTT","123456");
        return  tsmcpUser;
    }

}
