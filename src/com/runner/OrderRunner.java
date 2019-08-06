package com.runner;

import java.util.HashMap;
import java.util.Map;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import com.Transaction.OrderTransaction;


public class OrderRunner extends Runner{

	
	
	
	
	@Override
	public SampleResult run(JavaSamplerContext context)  {
		//在属于自己的list里随机获取一条数据
//		String classname=this.getClass().getName();
//		List list=(List) PrepareData.getPrepareData(classname);
//		int datalength=list.size();
//		int index=(int)(Math.random()*datalength);
//		Map map=(Map) list.get(index);
//		{"sign":"efba160e36f256ad4fd2be40db44a473","term":"哦"}

		Map map_order =new HashMap<>();
		
		
		
		//购物车数量
		Map map_ordercart_count =new HashMap<>();
		
		Map map_ordercart_count_data =new HashMap<>();
		map_ordercart_count_data.put("client_type", "android");
		map_ordercart_count.put("data", map_ordercart_count_data);
		//ce7ae29bf2af2ea6a9b3c551d2d32ee7
		//fa939c3fbcf5b56da945f47748955266
		Map map_ordercart_count_head =new HashMap<>();
		map_ordercart_count_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_ordercart_count.put("head", map_ordercart_count_head);
		
		
		
		//订货通用户登录门店帮 在未填写认证资料时 不能生成订单
		Map map_orderdhtUserNoOrder =new HashMap<>();
		
		Map map_orderdhtUserNoOrder_data =new HashMap<>();
		map_orderdhtUserNoOrder_data.put("client_type", "android");
		map_orderdhtUserNoOrder.put("data", map_orderdhtUserNoOrder_data);
		
		Map map_orderdhtUserNoOrder_head =new HashMap<>();
		map_orderdhtUserNoOrder_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_orderdhtUserNoOrder.put("head", map_orderdhtUserNoOrder_head);
		
		//订单信息确认
		Map map_orderbuy_step1 =new HashMap<>();
		
		Map map_orderbuy_step1_data =new HashMap<>();
		map_orderbuy_step1_data.put("client_type", "android");
		map_orderbuy_step1_data.put("ifcart", "");
		map_orderbuy_step1_data.put("cart_id", "113815|1");
		map_orderbuy_step1.put("data", map_orderbuy_step1_data);
		
		Map map_orderbuy_step1_head =new HashMap<>();
		map_orderbuy_step1_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_orderbuy_step1.put("head", map_orderbuy_step1_head);
		
		//提交订单
		Map map_orderbuy_step2 =new HashMap<>();
		
		Map map_orderbuy_step2_data =new HashMap<>();
		map_orderbuy_step2_data.put("vat_hash", "Y8QM-YvrBX7ksTPLSMCRBWNiFIBwtajMbvH");
		map_orderbuy_step2_data.put("store_delivery", "");
		map_orderbuy_step2_data.put("chain", "3045");
		map_orderbuy_step2_data.put("offpay_hash", "uxjlFxCRBctSDCdsfqwXtX3mpe7GMOlOuq9o8Jc");
		map_orderbuy_step2_data.put("is_pl_order", "0");
		map_orderbuy_step2_data.put("is_chain", "1");
		map_orderbuy_step2_data.put("ifcart", "");
		map_orderbuy_step2_data.put("pay_message", "");
		map_orderbuy_step2_data.put("voucher", "");
		//75375
		///52199
		map_orderbuy_step2_data.put("address_id", "75375");
		map_orderbuy_step2_data.put("pay_name", "online");
		map_orderbuy_step2_data.put("client_type", "android");
		map_orderbuy_step2_data.put("cart_id", "113815|1");
		map_orderbuy_step2_data.put("rcb_pay", "");
		map_orderbuy_step2_data.put("rpt", "");
		map_orderbuy_step2_data.put("offpay_hash_batch", "DK0qtlRst1-W97i-3rwoKWvVO1wLLZO-ULyZ4nAAtaW2O6iB8LOw4LL2AbzSG8I0L-EoDS4nfMDGeeLKtFtWVp0GzZN6iP7c9dFRF6VFk8q_Ga1Tsmx_aUxzcKD-Hdk04KD2sye");
		map_orderbuy_step2_data.put("invoice_id", "");
		map_orderbuy_step2_data.put("appoint_express", "wuliu");
		map_orderbuy_step2.put("data", map_orderbuy_step2_data);
		

		Map map_orderbuy_step2_head =new HashMap<>();
		map_orderbuy_step2_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		//map_orderbuy_step2_head.put("clitype", "android");
		//map_orderbuy_step2_head.put("cliversion", "2.2.8");
		//map_orderbuy_step2_head.put("deviceid", "861608046253413");
		map_orderbuy_step2.put("head", map_orderbuy_step2_head);
		
		//购物车列表
		Map map_ordercart_list =new HashMap<>();
		
		Map map_ordercart_list_data =new HashMap<>();
		
		map_ordercart_list.put("data", map_ordercart_list_data);
		
		Map map_ordercart_list_head =new HashMap<>();
		map_ordercart_list_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_ordercart_list.put("head", map_ordercart_list_head);
		//商品详情
		Map map_ordergoods_detail =new HashMap<>();
		
		Map map_ordergoods_detail_data =new HashMap<>();
		map_ordergoods_detail_data.put("client_type", "android");
		map_ordergoods_detail_data.put("vr_city_id", "9");
		map_ordergoods_detail_data.put("goods_id", "113815");
		map_ordergoods_detail.put("data", map_ordergoods_detail_data);
		
		Map map_ordergoods_detail_head =new HashMap<>();
		map_ordergoods_detail_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_ordergoods_detail.put("head", map_ordergoods_detail_head);
		
		//支付信息获取
		Map map_orderpf_pay =new HashMap<>();
		
		Map map_orderpf_pay_data =new HashMap<>();
		map_orderpf_pay_data.put("pay_sn", "390597235907548506");
		map_orderpf_pay.put("data", map_orderpf_pay_data);
		
		Map map_orderpf_pay_head =new HashMap<>();
		map_orderpf_pay_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_orderpf_pay.put("head", map_orderpf_pay_head);
		
		//获取跳转设置的秒数
		Map map_orderget_set_time =new HashMap<>();
		
		Map map_orderget_set_time_data =new HashMap<>();
		map_orderget_set_time.put("data", map_orderget_set_time_data);
		
		Map map_orderget_set_time_head =new HashMap<>();
		map_orderget_set_time_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_orderget_set_time.put("head", map_orderget_set_time_head);
		
		//支付密码验证1
		Map map_orderpay_password =new HashMap<>();
		
		Map map_orderpay_password_data =new HashMap<>();
		map_orderpay_password_data.put("password", "123456");
		map_orderpay_password_data.put("client_type", "android");
		map_orderpay_password.put("data", map_orderpay_password_data);
		
		Map map_orderpay_password_head =new HashMap<>();
		map_orderpay_password_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_orderpay_password.put("head", map_orderpay_password_head);
		
		//支付密码验证2
		Map map_orderpay_password2 =new HashMap<>();
		
		Map map_orderpay_password_data2 =new HashMap<>();
		map_orderpay_password_data2.put("password", "123456");
		map_orderpay_password_data2.put("client_type", "android");
		map_orderpay_password_data2.put("pay_sn", "390597235907548506");
		map_orderpay_password_data2.put("payment_code", "appalipay");
		map_orderpay_password2.put("data", map_orderpay_password_data2);
		
		Map map_orderpay_password_head2 =new HashMap<>();
		map_orderpay_password_head2.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_orderpay_password2.put("head", map_orderpay_password_head2);
		
		//支付请求
		Map map_orderpay_pforder =new HashMap<>();
		
		Map map_orderpay_pforder_data =new HashMap<>();
		map_orderpay_pforder_data.put("password", "123456");
		map_orderpay_pforder_data.put("pd_pay", "1");
		map_orderpay_pforder_data.put("rcb_pay", "");
		map_orderpay_pforder_data.put("client_type", "android");
		map_orderpay_pforder_data.put("pay_sn", "390597235907548506");
		map_orderpay_pforder_data.put("payment_code", "appalipay");
		map_orderpay_pforder.put("data", map_orderpay_pforder_data);
		
		Map map_orderpay_pforder_head =new HashMap<>();
		map_orderpay_pforder_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_orderpay_pforder.put("head", map_orderpay_pforder_head);

		//采购订单列表
		Map map_orderorder_list =new HashMap<>();
		
		Map map_orderorder_list_data =new HashMap<>();
		map_orderorder_list_data.put("order_key", "");
		map_orderorder_list_data.put("curpage", "1");
		map_orderorder_list_data.put("state_type", "");
		
		map_orderorder_list.put("data", map_orderorder_list_data);
		
		Map map_orderorder_list_head =new HashMap<>();
		map_orderorder_list_head.put("token", "ce7ae29bf2af2ea6a9b3c551d2d32ee7");
		map_orderorder_list.put("head", map_orderorder_list_head);
		
		
		
		
		
		
		
		map_order.put("cart_count", map_ordercart_count);
		map_order.put("dhtUserNoOrder", map_orderdhtUserNoOrder);
		map_order.put("buy_step1", map_orderbuy_step1);
		map_order.put("buy_step2", map_orderbuy_step2);
		map_order.put("cart_list", map_ordercart_list);
		map_order.put("goods_detail", map_ordergoods_detail);
		map_order.put("pf_pay", map_orderpf_pay);
		map_order.put("get_set_time", map_orderget_set_time);
		map_order.put("pay_password1", map_orderpay_password);
		map_order.put("pay_password2", map_orderpay_password2);
		map_order.put("pay_pforder", map_orderpay_pforder);
		map_order.put("order_list", map_orderorder_list);
				
		SampleResult sampleResult=new OrderTransaction().run(map_order);
		return sampleResult;
	}

	
}
