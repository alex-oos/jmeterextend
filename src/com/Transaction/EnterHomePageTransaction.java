package com.Transaction;

import java.util.Map;
import org.apache.jmeter.samplers.SampleResult;
import com.request.HttpRequest;

public class EnterHomePageTransaction  extends Transaction{


	@Override
	public SampleResult run(Map map) {
		SampleResult sampleResult=new SampleResult();
		sampleResult.setSampleLabel("进入首页");
		sampleResult.sampleStart();
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_index/get_member_info", "获取会员信息", "POST").run((Map)map.get("get_member_info"));
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
		
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/chain_member/uptoken", "token续期", "POST").run((Map)map.get("uptoken"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/home_page/get_home_page1", "获取首页数据", "POST").run((Map)map.get("get_home_page1"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/chain_msg/msg_uncount", "通知消息未读数", "POST").run((Map)map.get("msg_uncount"));
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
