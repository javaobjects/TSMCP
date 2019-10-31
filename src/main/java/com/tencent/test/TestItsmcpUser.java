package com.tencent.test;

import com.tencent.mapper.TsmcpUserMapper;
import com.tencent.pojo.TsmcpUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @ClassName TestItsmcpUser.java
 * @author xianxian
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年10月29日 19:07:00
 */
@Component
public class TestItsmcpUser {

    @Autowired
    private SqlSessionFactory factory;

    public static void main(String[] args) throws IOException {
        //1.获取SqlSessionFactory接口
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml"));

        //2. 获取SqlSession接口
        SqlSession session = factory.openSession();

        //2.获取TsmcpUserMapper
        TsmcpUserMapper tsmcpUserMapper = session.getMapper(TsmcpUserMapper.class);

        //3.调用查询
        TsmcpUser tsmcpUser = tsmcpUserMapper.Login("SCOTT","123456");
        System.out.println(tsmcpUser);
    }
}
