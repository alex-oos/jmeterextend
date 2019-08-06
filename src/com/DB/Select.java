package com.DB;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;

public class Select {

	
    public static List<Map<String, Object>> selectallbysql(String sql) {
        SqlSession sqlSession = null;
        //查询结果集
        List<Map<String, Object>> List = new  ArrayList<>();

        try {
            // 创建sqlSession
            sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
            //创建sqlMapper
            SqlMapper sqlMapper = new SqlMapper(sqlSession);
            //查询，返回List<Map>
             List= sqlMapper.selectList(sql);
            
           
        } catch (Exception e) {
        	
            e.printStackTrace();
            
        } finally {
            //关闭会话
            sqlSession.close();
        }
        return List;
       
    }
	
    public static Map<String, Object> selectonebysql(String sql) throws Exception{
        SqlSession sqlSession = null;
        //查询结果集
        Map<String, Object> map = new  HashMap<String, Object>();
        Statement statement=null;
        try {
            
            // 创建sqlSession
            sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
            //创建sqlMapper
            statement=sqlSession.getConnection().createStatement();
            //SqlMapper sqlMapper = new SqlMapper(sqlSession);
            //查询，返回List<Map>
            //map= sqlMapper.selectOne(sql);

            //设置连接属性useCursorFetch=true 
            //ps = (PreparedStatement) con.prepareStatement("select * from bigTable",ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            //ps.setFetchSize(Integer.MIN_VALUE);
            //ps.setFetchDirection(ResultSet.FETCH_REVERSE);
           ResultSet resultSet= statement.executeQuery(sql);
           
           ResultSetMetaData resultSetMetaData= resultSet.getMetaData();
           
           int count=resultSetMetaData.getColumnCount();
           if (resultSet.next()) {
			
        	   for (int i = 0; i < count; i++) {
        		   
        		   map.put(resultSetMetaData.getColumnLabel(i+1), resultSet.getObject(i+1));
        		   
        	   }
        	   
        	   
           }
           
        } catch (Exception e) {
        	
            e.printStackTrace();
            
        } finally {
            //关闭会话
        	statement.close();
            sqlSession.close();
        }
        return map;
        
    }
	
	
}
