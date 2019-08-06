package com.runner;

import java.util.HashMap;
import java.util.Map;

import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import com.Transaction.EnterHomePageTransaction;
import com.Transaction.LoginOnTransaction;

public class EnterHomePageRunner extends Runner{
	

	@Override
	public SampleResult run(JavaSamplerContext context)  {
		//在属于自己的list里随机获取一条数据
//		String classname=this.getClass().getName();
//		List list=(List) PrepareData.getPrepareData(classname);
//		int datalength=list.size();
//		int index=(int)(Math.random()*datalength);
//		Map map=(Map) list.get(index);
		

		Map map =new HashMap<>();
		
		//获取会员信息
		Map mapget_member_info =new HashMap<>();
		
		Map mapget_member_info_data =new HashMap<>();
		mapget_member_info_data.put("client_type", "android");
		mapget_member_info.put("data", mapget_member_info_data);
		
		Map mapget_member_info_head =new HashMap<>();
		mapget_member_info_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		mapget_member_info.put("head", mapget_member_info_head);
		
		
		map.put("get_member_info", mapget_member_info);

		//购物车数量
		Map mapcart_count =new HashMap<>();
		
		Map mapcart_count_data =new HashMap<>();
		mapcart_count_data.put("client_type", "android");
		mapcart_count.put("data", mapcart_count_data);
		
		Map mapcart_count_head =new HashMap<>();
		mapcart_count_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		mapcart_count.put("head", mapcart_count_head);
		
		map.put("cart_count", mapcart_count);
		
		//token续期
		Map mapuptoken =new HashMap<>();
		
		Map mapuptoken_data =new HashMap<>();
		mapuptoken_data.put("client_type", "android");
		mapuptoken.put("data", mapuptoken_data);
		
		Map mapuptoken_head =new HashMap<>();
		mapuptoken_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		mapuptoken.put("head", mapuptoken_head);
		
		map.put("uptoken", mapuptoken);
		
		//获取首页数据
		Map mapget_home_page1 =new HashMap<>();
		
		Map mapget_home_page1_data =new HashMap<>();
		mapget_home_page1_data.put("client_type", "android");
		mapget_home_page1.put("data", mapget_home_page1_data);
		
		Map mapget_home_page1_head =new HashMap<>();
		mapget_home_page1_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		mapget_home_page1.put("head", mapget_home_page1_head);
		
		map.put("get_home_page1", mapget_home_page1);
		
		//通知消息未读数
		Map mapmsg_uncount =new HashMap<>();
		
		Map mapmsg_uncount_data =new HashMap<>();
		mapmsg_uncount_data.put("client_type", "android");
		mapmsg_uncount.put("data", mapmsg_uncount_data);
		
		Map mapmsg_uncount_head =new HashMap<>();
		mapmsg_uncount_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		mapmsg_uncount.put("head", mapmsg_uncount_head);
		
		map.put("msg_uncount", mapmsg_uncount);
		
		SampleResult sampleResult=new EnterHomePageTransaction().run(map);
		return sampleResult;
	}

	
public static void main(String[] args) {
	new EnterHomePageRunner().run(null);
}
	
}
