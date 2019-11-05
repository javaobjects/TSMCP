package com.tencent.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tencent.mapper.TsmcpUserMapper;
import com.tencent.pojo.TsmcpUser;
import com.tencent.service.ITsmcpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName ITsmcpUserServiceImpl.java
 * @author xianxian
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月29日 18:45:00
 */

@Service("ITsmcpUserService")
@Transactional  //开启注解事务
public class ITsmcpUserServiceImpl implements ITsmcpUserService , Serializable {

    @Autowired
    private TsmcpUserMapper tsmcpUserMapper;


    /**
     *
     *
     *
     * [{
     *     result:true/false,
     *     mes:"",
     *     num:Integer
     * },{},{}]
     *
     * @param username
     * @param password
     * @return
     */

    @Override
    public JSONArray Login(String username, String password) {
        List<TsmcpUser> tsmcpUsers = tsmcpUserMapper.Login(username,password);
        JSONArray jSONArray = new JSONArray();
        JSONObject jb = new JSONObject();
        if(tsmcpUsers == null || tsmcpUsers.isEmpty()){
            //登录不成功
            jb.put("result",false);
            jb.put("message","密码错误");
        }else {
            //登录成功
            jb.put("result",true);
            jb.put("message","");
        }
        jSONArray.add(jb);
        return jSONArray;
    }

    @Override
    public List<TsmcpUser> selectAll() {
        return tsmcpUserMapper.selectAll();
    }

    @Override
    public Boolean isExistUsername(String username) {
        TsmcpUser tsmcpUser = tsmcpUserMapper.isExistUsername(username);
        if(tsmcpUser == null){
            return true;//表示不存在可注册
        }else {
            return false;
        }
    }

    @Override
    public List<Integer> getAllFactoryIds() {
        List<Integer> list = tsmcpUserMapper.getAllFactoryIds();
        return list;
    }

    @Override
    public Boolean insertIntoTsmcpUser(TsmcpUser tsmcpUser) {
        Integer num = tsmcpUserMapper.insertIntoTsmcpUser(tsmcpUser);
        if(num == 1){
            //插入成功
            return true;
        }else {
            //插入失败
            return false;
        }
    }


//    public static void main(String[] args) {
//        JSONArray jSONArray = new JSONArray();
//        JSONObject jb = new JSONObject();
//        jb.put("id", 1);
//        jb.put("name", "s");
//        jSONArray.add(jb);
//        JSONObject j1 = new JSONObject();
//        j1.put("id", 2);
//        j1.put("name", "s");
//        jSONArray.add(j1);
//        StringBuffer sBuffer = new StringBuffer();
//        System.out.println(jSONArray.stream());
//        jSONArray.stream().forEach(jsonobejct->arrayIdToString((JSONObject) jsonobejct,sBuffer));
//        System.out.println(sBuffer.toString());
//    }
//
//    private static StringBuffer arrayIdToString(JSONObject jsonobejct,
//                                                StringBuffer sBuffer) {
//        return sBuffer.append(jsonobejct.getInteger("id")).append(",");
//    }

}
