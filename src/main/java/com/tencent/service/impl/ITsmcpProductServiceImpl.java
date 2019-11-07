package com.tencent.service.impl;

import com.tencent.mapper.TsmcpProductMapper;
import com.tencent.pojo.TsmcpProduct;
import com.tencent.service.ITsmcpProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("ITsmcpProductService")
@Transactional  //开启注解事务
public class ITsmcpProductServiceImpl implements ITsmcpProductService {

    @Autowired
    private TsmcpProductMapper tsmcpProductMapper;

    @Override
    public List<TsmcpProduct> selectAll() {
        return tsmcpProductMapper.selectAll();
    }

    @Override
//    public List<TsmcpProduct> selectAll2() {
    public Map<String ,Object> selectAll2() {
        Map<String,Object> map = new HashMap<>();
        List<TsmcpProduct> tsmcpProducts = tsmcpProductMapper.selectAll2();
//        for (int i = 0;i < tsmcpProducts.size();i++){
//            System.out.println(i + ": " + tsmcpProducts.get(i));
//            System.out.println(i + ": " + tsmcpProducts.get(i).getProductName());
//        }
//
//        JSONArray jsonArray = new JSONArray();
//        JSONObject jb = new JSONObject();
//        if(tsmcpProducts == null || tsmcpProducts.isEmpty()){
//            jb.put("data",tsmcpProducts);
//        }
//        jsonArray.add(jb);
//        return jsonArray;

        map.put("key","value");
        map.put("key2",tsmcpProducts);
        return map;
    }
}
