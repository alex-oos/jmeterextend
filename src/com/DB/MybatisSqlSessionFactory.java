package com.DB;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSqlSessionFactory {

	
	private static SqlSessionFactory factory=null;
	static{
		String resource = "mybatis-config.xml";
		//1 读取配置文件(mybatis-config.xml)的输入流
        InputStream is = null;
		try {
			is = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //2 创建sqlSessionFactory对象,完成对配置文件的读取
         factory = new SqlSessionFactoryBuilder().build(is);
       
	}
	public static SqlSessionFactory getSqlSessionFactory () {
		
		return factory;
	}
	
	
}
