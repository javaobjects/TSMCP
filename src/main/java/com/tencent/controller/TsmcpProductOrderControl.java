package com.tencent.controller;

import com.tencent.pojo.TsmcpProductOrderSum;
import com.tencent.service.ITsmcpProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class TsmcpProductOrderControl {
    @Autowired
    private ITsmcpProductOrderService iTsmcpProductOrderService;

    @RequestMapping(value = "/selectOrderSum",method = RequestMethod.GET)
    @ResponseBody
    public List<TsmcpProductOrderSum> selectOrderStatusSum(){
        List<TsmcpProductOrderSum> tsmcpProductOrderSumList = iTsmcpProductOrderService.selectOrderStatusSum();
        return tsmcpProductOrderSumList;
    }
}
