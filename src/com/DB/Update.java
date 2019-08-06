package com.DB;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Update {


    public static int updatebysql(String sql) {
        SqlSession sqlSession = null;
        int updated=0;
        try {
            // 创建sqlSession
        	sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
            SqlMapper sqlMapper = new SqlMapper(sqlSession);
            updated= sqlMapper.update(sql);
            
            //5 提交事务
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            //出现异常回滚事务
            sqlSession.rollback();
        } finally {
            //关闭会话
            sqlSession.close();
        }
        return updated;
    }
	
}
