package com.tencent.controller;

import com.tencent.service.ITsmcpEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TsmcpEquipmentControl {

    @Autowired
    private ITsmcpEquipmentService iTsmcpEquipmentService;

    @RequestMapping(value = "/selectAllEq",method = RequestMethod.GET)
    @ResponseBody
    public Integer selectAllEquipment(){
        return iTsmcpEquipmentService.selectAllEquipment();
    }

    @RequestMapping(value = "/selectBadEq",method = RequestMethod.GET)
    @ResponseBody
    public Integer selectBadEquipment(){
        return iTsmcpEquipmentService.selectBadEquipment();
    }

    //查询故障率
    @RequestMapping(value = "/selectRate",method = RequestMethod.GET)
    @ResponseBody
    public List<String> selectEquipmentRate(){
        Integer s1 = iTsmcpEquipmentService.selectAllEquipment();
        Integer s2 = iTsmcpEquipmentService.selectBadEquipment();
        float s3 = (float)s2/s1*100;
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数
        String s = df.format(s3);
        List<String> arr = new ArrayList<>();
        arr.add(s);
        return arr;
    }


}
