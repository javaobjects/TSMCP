package com.tencent.tsmcp;

import com.tencent.tsmcp.mapper.TsmcpUserMapper;
import com.tencent.tsmcp.pojo.TsmcpUser;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TsmcpApplicationTests {

    @Autowired
    private SqlSessionFactory factory;

    @Test
    void contextLoads() {
        //1.获取SqlSessionFactory接口
        //SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml"));

        //2. 获取SqlSession接口
        SqlSession session = factory.openSession();

        //2.获取TsmcpUserMapper
        TsmcpUserMapper tsmcpUserMapper = session.getMapper(TsmcpUserMapper.class);

        //3.调用查询
        TsmcpUser tsmcpUser = tsmcpUserMapper.Login("SCOTT","123456");
        System.out.println(tsmcpUser);
    }

}
