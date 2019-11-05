package com.tencent.controller;

import com.alibaba.fastjson.JSONArray;
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
    public List<TsmcpUser> selectAll(){
        return iTsmcpUserService.selectAll();
    }

    @PostMapping("/Login")
    public JSONArray Login(String username, String password){
        JSONArray tsmcpUsers = iTsmcpUserService.Login(username,password);
        return tsmcpUsers;
    }


    /**
     * 判断用户名是否已存在
     * @param username
     * @return
     * @author xianxian
     * @create:2019-10-29
     * @Description
     */
    @PostMapping("/isExistUsername")
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
    @PostMapping("/getAllFactoryIds")
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
    @PostMapping("/insertIntoTsmcpUser")
    public Boolean insertIntoTsmcpUser(TsmcpUser tsmcpUser){
        Boolean result = iTsmcpUserService.insertIntoTsmcpUser(tsmcpUser);
        return result;
    }
}
