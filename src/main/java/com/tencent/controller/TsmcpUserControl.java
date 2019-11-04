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
    public List<TsmcpUser> selectAll(){
        return iTsmcpUserService.selectAll();
    }

    @PostMapping("/Login")
    public List<TsmcpUser> login(String username, String password){
//    public Map<Boolean,String> login(String username, String password){
        List<TsmcpUser> tsmcpUser = iTsmcpUserService.Login(username,password);
//        Map<> tsmcpUser = iTsmcpUserService.Login(username,password);

//        Map<Boolean,String> map =new HashMap<>();
//
//        if(tsmcpUser == null){
//            Boolean result = false;
//            map.put(result,"密码错误");
//        }else {
//            Boolean result = true;
//            map.put(result,"");
//        }



//        List<Object> objects = new ArrayList<>();

//        objects.add({
//                key:value,
//                key2:value2;
//        })

//        return [{result:boolean,message:String}];

//        return  map;
        return  tsmcpUser;
    }

    @PostMapping("/isExistUsername")
    public Boolean isExistUsername(String username){
        Boolean result = iTsmcpUserService.isExistUsername(username);
        return result;
    }
}
