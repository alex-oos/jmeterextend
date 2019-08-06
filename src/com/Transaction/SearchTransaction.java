package com.Transaction;


import java.util.Map;
import org.apache.jmeter.samplers.SampleResult;
import com.request.HttpRequest;

public class SearchTransaction extends Transaction{

	@Override
	public SampleResult run(Map map)  {
		
		SampleResult sampleResult=new SampleResult();
		sampleResult.setSampleLabel("搜索");
		sampleResult.sampleStart();
		
		try {
			SampleResult sampleResultsub = new HttpRequest("/chainapi/v1/hot_search/auto_complete", "关键词自动补全", "POST").run((Map) map.get("auto_complete"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/active_hint/get_activ_list", "获取活动列表", "POST").run((Map) map.get("get_activ_list"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/goods/goods_list", "商品搜索", "POST").run((Map) map.get("goods_list"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_cart/cart_count", "购物车数量", "POST").run((Map)map.get("cart_count"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		sampleResult.setSuccessful(true);
       
		return sampleResult;
	}

	
}
