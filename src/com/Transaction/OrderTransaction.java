package com.Transaction;

import java.util.Map;
import org.apache.jmeter.samplers.SampleResult;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.request.HttpRequest;

public class OrderTransaction extends Transaction{

	@Override
	public SampleResult run(Map map)  {
		SampleResult sampleResult=new SampleResult();
		sampleResult.setSampleLabel("下订单");
		sampleResult.sampleStart();
		
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
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_buy/dhtUserNoOrder", "订货通用户认证", "POST").run((Map)map.get("dhtUserNoOrder"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String vat_hash="";
		String offpay_hash="";
		String offpay_hash_batch="";
		String last_express="";
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_buy/buy_step1", "订单信息确认", "POST").run((Map)map.get("buy_step1"));
			sampleResult.addSubResult(sampleResultsub,false);
			String response=new String(sampleResultsub.getResponseData());
			JsonObject jsonObject=new JsonParser().parse(response).getAsJsonObject();
			vat_hash=jsonObject.get("datas").getAsJsonObject().get("vat_hash").getAsString();
			offpay_hash=jsonObject.get("datas").getAsJsonObject().get("address_api").getAsJsonObject().get("offpay_hash").getAsString();
			offpay_hash_batch=jsonObject.get("datas").getAsJsonObject().get("address_api").getAsJsonObject().get("offpay_hash_batch").getAsString();
			last_express=jsonObject.get("datas").getAsJsonObject().get("last_express").getAsString();
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		String pay_sn="";
		try {
			Map step2=(Map)map.get("buy_step2");
			Map datas=(Map) step2.get("data");
			datas.put("vat_hash", vat_hash);
			datas.put("offpay_hash", offpay_hash);
			datas.put("offpay_hash_batch", offpay_hash_batch);
			datas.put("appoint_express", last_express);
		
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_buy/buy_step2", "提交订单", "POST").run(step2);
			sampleResult.addSubResult(sampleResultsub,false);
			String json=new String(sampleResultsub.getResponseData());
			JsonObject jsonObject=new JsonParser().parse(json).getAsJsonObject();
			pay_sn=jsonObject.get("datas").getAsJsonObject().get("pay_sn").getAsString();
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_cart/cart_list", "购物车列表", "POST").run((Map)map.get("cart_list"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/goods/goods_detail", "商品详情", "POST").run((Map)map.get("goods_detail"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Map paymap=(Map)map.get("pf_pay");
			Map datas=(Map) paymap.get("data");
			datas.put("pay_sn",pay_sn);
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_buy/pf_pay", "支付信息获取", "POST").run(paymap);
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/paymentapp/get_set_time", "获取跳转设置的秒数", "POST").run((Map)map.get("get_set_time"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_buy/pay_password", "支付密码验证1", "POST").run((Map)map.get("pay_password1"));
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Map pay_passwordmap=(Map)map.get("pay_password2");
			Map datas=(Map) pay_passwordmap.get("data");
			datas.put("pay_sn",pay_sn);
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_buy/pay_password", "支付密码验证2", "POST").run(pay_passwordmap);
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Map pay_pfordermap=(Map)map.get("pay_pforder");
			Map datas=(Map) pay_pfordermap.get("data");
			datas.put("pay_sn",pay_sn);
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/payment/pay_pforder", "支付请求", "POST").run(pay_pfordermap);
			sampleResult.addSubResult(sampleResultsub,false);
			if (!sampleResultsub.isSuccessful()) {
				sampleResult.setSuccessful(false);
				return sampleResult;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/wholesale_order/order_list", "采购订单列表", "POST").run((Map)map.get("order_list"));
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
