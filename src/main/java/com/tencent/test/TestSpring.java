package com.tencent.test;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tencent.dao.DeptMapper;
import com.tencent.pojo.Dept;

public class TestSpring {

	public static void main(String[] args) throws IOException {

		//1.获取SqlSessionFactory接口
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("com/tencent/sqlMapConfig.xml"));
		
		//2. 获取SqlSession接口
		SqlSession session = factory.openSession();
		
		//2.获取DeptDao
		DeptMapper deptMapper =  session.getMapper(DeptMapper.class);
		
		//3.调用查询
		Dept dept = deptMapper.selectDeptByDeptno(10);
		System.out.println(dept);
	}
}
