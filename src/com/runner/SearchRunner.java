package com.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import com.Transaction.SearchTransaction;

public class SearchRunner extends Runner{

	
	public static String getkeyword() {
		List list=new ArrayList();
		list.add("固特异");
		list.add("101H  EAGLENCT5");
		list.add("轮胎205/55R16  安节轮");
		list.add("B250");
		list.add("固特异轮胎275/40R19  三能防爆");
		list.add("H/PSPORT");
		list.add("SCORPIONATR");
		list.add("SVAS");
		list.add("二代");
		list.add("100W PZEROROSSO");
		list.add("普利SPORT");
		list.add("防爆");
		list.add("固特异");
		list.add("玛吉斯轮胎MA501");
		list.add("倍耐力轮胎235/50R19 99W MO PZERO");
		list.add("普利司通轮胎225/65R17 102H H/L400");
		list.add("固特异AICE");
		list.add("倍耐力ZERO");
		list.add("倍耐PZERO");
		list.add("固特SUV");
		list.add("普利H/L33");
		list.add("倍耐力轮Y AO PZERO");
		list.add("倍耐力O PZERO");
		list.add("普利司94V ER33");
		list.add("固特7V 安节轮");
		list.add("倍耐力轮0W PZERO");
		list.add("倍耐力轮  NO PZERO");
		list.add("玛吉R14 CS735");
		list.add("倍耐力RO防爆胎");
		
		
		
		
		int datalength=list.size();
		int index=(int)(Math.random()*datalength);
		String key=(String) list.get(index);
		
		return key;
		

	}
	
	
	@Override
	public SampleResult run(JavaSamplerContext context)  {
		//在属于自己的list里随机获取一条数据
//		String classname=this.getClass().getName();
//		List list=(List) PrepareData.getPrepareData(classname);
//		int datalength=list.size();
//		int index=(int)(Math.random()*datalength);
//		Map map=(Map) list.get(index);
//		{"sign":"efba160e36f256ad4fd2be40db44a473","term":"哦"}
		String keyword=getkeyword();
		Map map_search =new HashMap<>();
		
		//自动补全
		Map map_searchautocomplete =new HashMap<>();
	
		Map map_searchautocomplete_data =new HashMap<>();
		map_searchautocomplete_data.put("term", keyword);
		map_searchautocomplete.put("data", map_searchautocomplete_data);
		
		Map map_searchautocomplete_head =new HashMap<>();
		map_searchautocomplete_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_searchautocomplete.put("head", map_searchautocomplete_head);
		
		//获取活动列表
		Map map_searchget_activ_list =new HashMap<>();
		
		Map map_searchget_activ_list_data =new HashMap<>();
		map_searchget_activ_list_data.put("vr_city_id", "9");
		map_searchget_activ_list.put("data", map_searchget_activ_list_data);
		
		Map map_searchget_activ_list_head =new HashMap<>();
		map_searchget_activ_list_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_searchget_activ_list.put("head", map_searchget_activ_list_head);
		
		//商品搜索
		Map map_searchgoods_list =new HashMap<>();
		
		Map map_searchgoods_list_data =new HashMap<>();
		map_searchgoods_list_data.put("price_from", "");
		map_searchgoods_list_data.put("curpage", "1");
		map_searchgoods_list_data.put("gc_id", "");
		map_searchgoods_list_data.put("price_to", "");
		map_searchgoods_list_data.put("active", "");
		map_searchgoods_list_data.put("client_type", "android");
		map_searchgoods_list_data.put("area_id", "");
		map_searchgoods_list_data.put("store_grade_id", "");
		map_searchgoods_list_data.put("a_id", "");
		map_searchgoods_list_data.put("b_id", "");
		map_searchgoods_list_data.put("is_free", "");
		map_searchgoods_list_data.put("vr_city_id", "9");
		map_searchgoods_list_data.put("store_is_delivery", "");
		map_searchgoods_list_data.put("notthisprovince", "1");
		map_searchgoods_list_data.put("keyword", keyword);
		map_searchgoods_list_data.put("key", "");
		map_searchgoods_list_data.put("order", "");
		map_searchgoods_list.put("data", map_searchgoods_list_data);
		
		Map map_searchgoods_list_head =new HashMap<>();
		map_searchgoods_list_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_searchgoods_list.put("head", map_searchgoods_list_head);
		
		
		
		//购物车数量
		Map map_searchcart_count =new HashMap<>();
		
		Map map_searchcart_count_data =new HashMap<>();
		map_searchcart_count_data.put("client_type", "android");
		map_searchcart_count.put("data", map_searchcart_count_data);
		
		Map map_searchcart_count_head =new HashMap<>();
		map_searchcart_count_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_searchcart_count.put("head", map_searchcart_count_head);
		
		
		
		map_search.put("auto_complete", map_searchautocomplete);
		map_search.put("get_activ_list", map_searchget_activ_list);
		map_search.put("goods_list", map_searchgoods_list);
		map_search.put("cart_count", map_searchcart_count);
		
		
		SampleResult sampleResult=new SearchTransaction().run(map_search);
		return sampleResult;
	}

	
	
}
