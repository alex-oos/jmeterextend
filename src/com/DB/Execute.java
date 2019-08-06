package com.DB;


import java.sql.Statement;
import org.apache.ibatis.session.SqlSession;

public class Execute {

	
   public static void executesql(Processer processer) throws Exception {
      
       SqlSession sqlSession = null;
       Statement statement=null;
       try {
           // 创建sqlSession
           sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
           statement=sqlSession.getConnection().createStatement();
           SqlMapper sqlMapper = new SqlMapper(sqlSession);
          
           if (processer!=null) {
        	   processer.process(sqlMapper,statement);
           }
           
           sqlSession.commit();
              
       } catch (Exception e) {
    	   sqlSession.rollback();
           e.printStackTrace();
           
       } finally {
    	   statement.close();
           sqlSession.close();
       }
      
   }
   
  public interface Processer{
		
		public void process(SqlMapper sqlMapper,Statement statement)throws Exception ;
		
	}
}
	