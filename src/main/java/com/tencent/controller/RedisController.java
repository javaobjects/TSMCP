package com.tencent.controller;


import com.tencent.pojo.UserColor;
import com.tencent.utill.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @program: springbootdemo
 * @Date: 2019/11/7 17:43
 * @Author: Mr.Zheng
 * @Description:
 */

@RequestMapping("/redis")
@Controller
public class RedisController {

    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    private Logger logger = LoggerFactory.getLogger(TsmcpUserControl.class);

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("set")
    @ResponseBody
    public boolean redisset(String key, String value){
//        UserEntity userEntity =new UserEntity();
//        userEntity.setId(Long.valueOf(1));
//        userEntity.setGuid(String.valueOf(1));
//        userEntity.setName("zhangsan");
//        userEntity.setAge(String.valueOf(20));
//        userEntity.setCreateTime(new Date());
//        return redisUtil.set(key,userEntity,ExpireTime);
        return redisUtil.set(key,value);
    }

    @RequestMapping("get")
    @ResponseBody
    public Object redisget(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    @ResponseBody
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }
}

