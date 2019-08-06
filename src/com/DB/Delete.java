package com.DB;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Delete {

	
	
    public static int deletebysql(String sql) {
        SqlSession sqlSession = null;
        int deleted = 0;
        try {
            // 创建sqlSession
        	sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
            SqlMapper sqlMapper = new SqlMapper(sqlSession);
            //查询，返回List<Map>
            deleted= sqlMapper.delete(sql);
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
        
        return deleted;
    }
	
	
	
	
}
