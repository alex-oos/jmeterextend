package com.DB;

import org.apache.ibatis.session.SqlSession;

public class Insert {

	
	
    public static int insertbysql(String sql) {
        
        SqlSession sqlSession = null;
        
        int inserted=0;
        try {
            // 创建sqlSession
        	sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
            SqlMapper sqlMapper = new SqlMapper(sqlSession);
           
             inserted= sqlMapper.insert(sql);
            // 提交事务
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            //出现异常回滚事务
            sqlSession.rollback();
        } finally {
            //关闭会话
            sqlSession.close();
        }
        
        return inserted;
    }
	
	
}
