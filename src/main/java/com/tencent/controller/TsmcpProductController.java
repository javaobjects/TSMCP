package com.tencent.controller;

import com.tencent.pojo.TsmcpProductOrder;
import com.tencent.pojo.TsmcpProductOrderSum;
import com.tencent.service.ITsmcpProductOrderService;
import com.tencent.service.ITsmcpProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
public class TsmcpProductController {
    @Autowired
    private ITsmcpProductOrderService iTsmcpProductOrderService;

    @RequestMapping(value = "/selectOrderSum",method = RequestMethod.GET)
    @ResponseBody
    public List<TsmcpProductOrderSum> selectOrderStatusSum(){
        List<TsmcpProductOrderSum> tsmcpProductOrderSumList = iTsmcpProductOrderService.selectOrderStatusSum();
        return tsmcpProductOrderSumList;
    }
}
