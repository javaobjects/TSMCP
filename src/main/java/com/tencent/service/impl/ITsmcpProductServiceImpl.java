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
    public Map<String ,Object> selectAll2() {
        Map<String,Object> map = new HashMap<>();
        List<TsmcpProduct> tsmcpProducts = tsmcpProductMapper.selectAll2();
        /**
         * 此处得空拼接
         */
//        for(int i = 0;i < tsmcpProducts.size();i++){
//            if(tsmcpProducts.get(i).getTsmcpFactory().getFactoryName()){
//
//            }
//        }
        map.put("key","value");
        map.put("data",tsmcpProducts);
        System.out.println(tsmcpProducts.get(0).getTsmcpFactory());
        return map;
    }


    /**
     *
     * @param tsmcpProduct
     * @return
     * @author xianxian
     * @create:2019-11-08
     * @Description
     */
    @Override
    public Boolean addProduct(TsmcpProduct tsmcpProduct) {
        Boolean result = tsmcpProductMapper.addProduct(tsmcpProduct);
        return result;
    }

    /**
     * @param productId
     * @return
     * @author xianxian
     * @create:2019-11-11
     * @Description
     * 根据产品id删除产品
     */
    @Override
    public Boolean deleteProductByProductId(Integer productId) {
        Boolean result = tsmcpProductMapper.deleteProductByProductId(productId);
        return result;
    }

    /**
     *
     * @param tsmcpProduct
     * @return
     * @author xianxian
     * @create:2019-11-11
     * @Description
     * 更新产品
     */
    @Override
    public Boolean updateProduct(TsmcpProduct tsmcpProduct) {
        Boolean resutlt = tsmcpProductMapper.updateProduct(tsmcpProduct);
        return resutlt;
    }
}
