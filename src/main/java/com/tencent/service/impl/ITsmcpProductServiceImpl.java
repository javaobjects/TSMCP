package com.tencent.service.impl;

import com.tencent.mapper.TsmcpProductMapper;
import com.tencent.pojo.TsmcpProduct;
import com.tencent.service.ITsmcpProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ITsmcpProductService")
@Transactional  //开启注解事务
public class ITsmcpProductServiceImpl implements ITsmcpProductService {

    @Autowired
    private TsmcpProductMapper tsmcpProductMapper;

    @Override
    public List<TsmcpProduct> selectAll() {
        return tsmcpProductMapper.selectAll();
    }
}