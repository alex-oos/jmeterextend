package com.sample.mendianbagnshou;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.request.HttpRequest;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Buy_step2Sample implements JavaSamplerClient {

	static List tokenlist =new ArrayList();
	static int count=0;
	static List goodidlist =new ArrayList();
	static List addressidlist =new ArrayList();
	static int goodidcount=0;
	static{
		tokenlist.add("c9893f39b6c24b6b60aaa4aac6e54d16");
		tokenlist.add("b9ce5a16b5bb2bdfbe3e5431cb7ab9d3");
		tokenlist.add("79278ebad84e45c0dbe966ead6fad168");
		tokenlist.add("d36c8503dc2116dae56f210aaecd6783");
		tokenlist.add("ba0ce5be11bec86910de65d2625fb74d");
		tokenlist.add("3cfa4a5984e3799f3d6f20df774d267c");
		tokenlist.add("5cd180bd3fb917cd08b6649b18434b41");
		tokenlist.add("cea6b09b76aa3bbb68b81f0239f1a2ed");
		tokenlist.add("e3d1d68a10956d1340ae2dd33399f146");
		tokenlist.add("3812e05233521db534bea627c9bc9089");
		tokenlist.add("12bf606220915291eaab06bea2cd7391");
		tokenlist.add("148aade2a16037fdde32c915fc79ef09");
		tokenlist.add("45ae184fcfeb8741310ab95582d9662d");
		tokenlist.add("d02880bb8168c6f7903454167eb5a964");
		tokenlist.add("ea3488408e98f82325ae670bf2fd217b");
		tokenlist.add("3ccee032056e4122dd39efb773ab4439");
		tokenlist.add("db772f740dfa2c4c7855ca61e1450a05");
		tokenlist.add("c29baba65fdb71e6936b2c680e9154d4");
		tokenlist.add("db1f167cecfe93d887ae25c0cd49c4fc");
		tokenlist.add("431ee66a532f885b644bbbb6a4aaf8d8");
		tokenlist.add("fe0b8a6b9c5b3fab609d88d2707162c9");
		tokenlist.add("740a05f4bf95b07e859dea906e2659e2");
		tokenlist.add("c9893f39b6c24b6b60aaa4aac6e54d16");
		tokenlist.add("b9ce5a16b5bb2bdfbe3e5431cb7ab9d3");
		tokenlist.add("79278ebad84e45c0dbe966ead6fad168");
		tokenlist.add("d36c8503dc2116dae56f210aaecd6783");
		tokenlist.add("ba0ce5be11bec86910de65d2625fb74d");
		tokenlist.add("3cfa4a5984e3799f3d6f20df774d267c");
		tokenlist.add("5cd180bd3fb917cd08b6649b18434b41");
		tokenlist.add("cea6b09b76aa3bbb68b81f0239f1a2ed");
		tokenlist.add("e3d1d68a10956d1340ae2dd33399f146");
		tokenlist.add("3812e05233521db534bea627c9bc9089");
		tokenlist.add("12bf606220915291eaab06bea2cd7391");
		tokenlist.add("148aade2a16037fdde32c915fc79ef09");
		tokenlist.add("45ae184fcfeb8741310ab95582d9662d");
		tokenlist.add("d02880bb8168c6f7903454167eb5a964");
		tokenlist.add("ea3488408e98f82325ae670bf2fd217b");
		tokenlist.add("3ccee032056e4122dd39efb773ab4439");
		tokenlist.add("db772f740dfa2c4c7855ca61e1450a05");
		tokenlist.add("c29baba65fdb71e6936b2c680e9154d4");
		tokenlist.add("db1f167cecfe93d887ae25c0cd49c4fc");
		tokenlist.add("431ee66a532f885b644bbbb6a4aaf8d8");
		tokenlist.add("fe0b8a6b9c5b3fab609d88d2707162c9");
		tokenlist.add("740a05f4bf95b07e859dea906e2659e2");
		tokenlist.add("c9893f39b6c24b6b60aaa4aac6e54d16");
		tokenlist.add("b9ce5a16b5bb2bdfbe3e5431cb7ab9d3");
		tokenlist.add("79278ebad84e45c0dbe966ead6fad168");
		tokenlist.add("d36c8503dc2116dae56f210aaecd6783");
		tokenlist.add("ba0ce5be11bec86910de65d2625fb74d");
		tokenlist.add("3cfa4a5984e3799f3d6f20df774d267c");
		tokenlist.add("5cd180bd3fb917cd08b6649b18434b41");
		tokenlist.add("cea6b09b76aa3bbb68b81f0239f1a2ed");
		tokenlist.add("e3d1d68a10956d1340ae2dd33399f146");
		tokenlist.add("3812e05233521db534bea627c9bc9089");
		tokenlist.add("12bf606220915291eaab06bea2cd7391");
		tokenlist.add("148aade2a16037fdde32c915fc79ef09");
		tokenlist.add("45ae184fcfeb8741310ab95582d9662d");
		tokenlist.add("d02880bb8168c6f7903454167eb5a964");
		tokenlist.add("ea3488408e98f82325ae670bf2fd217b");
		tokenlist.add("3ccee032056e4122dd39efb773ab4439");
		tokenlist.add("db772f740dfa2c4c7855ca61e1450a05");
		tokenlist.add("c29baba65fdb71e6936b2c680e9154d4");
		tokenlist.add("db1f167cecfe93d887ae25c0cd49c4fc");
		tokenlist.add("431ee66a532f885b644bbbb6a4aaf8d8");
		tokenlist.add("fe0b8a6b9c5b3fab609d88d2707162c9");
		tokenlist.add("740a05f4bf95b07e859dea906e2659e2");
		tokenlist.add("be50cfebdec1345613e941818182cdd5");
		tokenlist.add("8ba59613ea1a756b9150717d9d4b11ed");
		tokenlist.add("d649d1e0dd952049ff486cd0df0cc098");
		tokenlist.add("c670032a8061f6b5c2cf786b101ef893");
		tokenlist.add("727283dca0ce5bb7ca1eb542ce383b20");
		tokenlist.add("1ea5c958d54a32ca8ee985a6b16b5d69");
		tokenlist.add("58d822ec05818fa6d07c98522d5f2279");
		tokenlist.add("1e6a0864ef339ff550f0c6ae0a75343f");
		tokenlist.add("cde1ef8f7658ba5fce1236c28e697237");
		tokenlist.add("098c124cb04af2cbfc888f40314215f8");
		tokenlist.add("9263faaf26e7d05ea1fcbec9ca1e2c28");
		tokenlist.add("b005b0d7872ab78b995b2a472288fcff");
		tokenlist.add("93a01ecbe833ac2b18d1e5e53253ffe3");
		tokenlist.add("5676c509f433be347ec3380e103f6a1f");
		tokenlist.add("a5c696d887567f10a39e388fc61a4427");
		tokenlist.add("d1afd0debec4e3cd4729e5b475f8c614");
		tokenlist.add("e433f6bb57abf6d8cfdba0dd5302212c");
		tokenlist.add("1b17cf51f2bb12efae1216512c32e260");
		tokenlist.add("84f62356e947e2c3bb257defbbba083b");
		tokenlist.add("918d941b13f17112d93fdda148899824");
		tokenlist.add("5f374e96b1b8b7c8f079f429364e7ed2");
		tokenlist.add("7cf56357a28b4b99dedf4aa74c148832");
		tokenlist.add("4f12f380e9e284993c71697332a26a2c");
		tokenlist.add("ad19e42a0fa016aa2329836cda694dc8");
		tokenlist.add("5a87c65b618a4fdc9895e900bcb325c5");
		tokenlist.add("64bae45c42d48065fa04e1a9005e46d4");
		tokenlist.add("e203f8e907d54f723939be955e01fc8e");
		tokenlist.add("deceff366b154933375e3b7bc805e913");
		tokenlist.add("ee8b56f155547fcf9f27ba4265f50216");
		tokenlist.add("632e04add842d43d62d625d1abb51df6");
		tokenlist.add("964557bf31c08083d6415b90a361cb55");
		tokenlist.add("9329ec07395d2fe73c5172043ce79ed2");
		tokenlist.add("931c1f4c17fffa591c05accf190225f6");
		tokenlist.add("0400cc894039cd76e95d9cfa15dc50c4");

		count=tokenlist.size();




		goodidlist.add("100020");
		goodidlist.add("100021");
		goodidlist.add("100024");
		goodidlist.add("100025");
		goodidlist.add("100026");
		goodidlist.add("100027");
		goodidlist.add("100029");
		goodidlist.add("100030");
		goodidlist.add("100031");
		goodidlist.add("100032");
		goodidlist.add("100033");
		goodidlist.add("100034");
		goodidlist.add("100036");
		goodidlist.add("100038");
		goodidlist.add("100039");
		goodidlist.add("100040");
		goodidlist.add("100041");
		goodidlist.add("100042");
		goodidlist.add("100043");
		goodidlist.add("100045");
		goodidlist.add("100046");
		goodidlist.add("100049");
		goodidlist.add("100050");
		goodidlist.add("100051");
		goodidlist.add("100054");
		goodidlist.add("100055");
		goodidlist.add("100057");
		goodidlist.add("100058");
		goodidlist.add("100059");
		goodidlist.add("100062");
		goodidlist.add("100063");
		goodidlist.add("100064");
		goodidlist.add("100065");
		goodidlist.add("100066");
		goodidlist.add("100067");
		goodidlist.add("100068");
		goodidlist.add("100069");
		goodidlist.add("100070");
		goodidlist.add("100071");
		goodidlist.add("100072");
		goodidlist.add("100073");
		goodidlist.add("100074");
		goodidlist.add("100075");

		goodidcount=goodidlist.size();

		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("373");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1589");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1748");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("1708");
		addressidlist.add("3627");
		addressidlist.add("3627");
		addressidlist.add("3627");
		addressidlist.add("3627");
		addressidlist.add("3627");
		addressidlist.add("3627");
		addressidlist.add("3627");
		addressidlist.add("3627");
		addressidlist.add("3627");

	}

	@Override
	public void setupTest(JavaSamplerContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public SampleResult runTest(JavaSamplerContext context) {

		int index=(int) (Math.random()*count);

		String token =(String) tokenlist.get(index);
		String addressid =(String) addressidlist.get(index);

		String goodid =(String) goodidlist.get((int) (Math.random()*goodidcount));

		//订单信息确认

		Map map_orderbuy_step1 =new HashMap<>();

		Map map_orderbuy_step1_data =new HashMap<>();
		map_orderbuy_step1_data.put("client_type", "android");
		map_orderbuy_step1_data.put("ifcart", "");
		map_orderbuy_step1_data.put("cart_id", goodid+"|1");
		map_orderbuy_step1.put("data", map_orderbuy_step1_data);

		Map map_orderbuy_step1_head =new HashMap<>();
		map_orderbuy_step1_head.put("token", token);
		map_orderbuy_step1.put("head", map_orderbuy_step1_head);

		String vat_hash="";
		String offpay_hash="";
		String offpay_hash_batch="";
		String last_express="";
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_buy/buy_step1", "订单信息确认", "POST").run(map_orderbuy_step1);
			String response=new String(sampleResultsub.getResponseData());

			JsonObject jsonObject=new JsonParser().parse(response).getAsJsonObject();
			vat_hash=jsonObject.get("datas").getAsJsonObject().get("vat_hash").getAsString();
			offpay_hash=jsonObject.get("datas").getAsJsonObject().get("address_api").getAsJsonObject().get("offpay_hash").getAsString();
			offpay_hash_batch=jsonObject.get("datas").getAsJsonObject().get("address_api").getAsJsonObject().get("offpay_hash_batch").getAsString();
			last_express=jsonObject.get("datas").getAsJsonObject().get("last_express").getAsString();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		map_orderbuy_step2_data.put("address_id", addressid);
		map_orderbuy_step2_data.put("pay_name", "online");
		map_orderbuy_step2_data.put("client_type", "android");
		map_orderbuy_step2_data.put("cart_id", goodid+"|1");
		map_orderbuy_step2_data.put("rcb_pay", "");
		map_orderbuy_step2_data.put("rpt", "");
		map_orderbuy_step2_data.put("offpay_hash_batch", "DK0qtlRst1-W97i-3rwoKWvVO1wLLZO-ULyZ4nAAtaW2O6iB8LOw4LL2AbzSG8I0L-EoDS4nfMDGeeLKtFtWVp0GzZN6iP7c9dFRF6VFk8q_Ga1Tsmx_aUxzcKD-Hdk04KD2sye");
		map_orderbuy_step2_data.put("invoice_id", "");
		map_orderbuy_step2_data.put("appoint_express", "wuliu");

		Map map_orderbuy_step2_head =new HashMap<>();
		map_orderbuy_step2_head.put("token", token);


		map_orderbuy_step2.put("data", map_orderbuy_step2_data);
		map_orderbuy_step2.put("head", map_orderbuy_step2_head);



		String pay_sn="";
		try {
			Map step2=(Map)map_orderbuy_step2;
			Map datas=(Map) step2.get("data");
			datas.put("vat_hash", vat_hash);
			datas.put("offpay_hash", offpay_hash);
			datas.put("offpay_hash_batch", offpay_hash_batch);
			datas.put("appoint_express", last_express);

			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_buy/buy_step2", "提交订单", "POST").run(step2);
			String json=new String(sampleResultsub.getResponseData());
			JsonObject jsonObject=new JsonParser().parse(json).getAsJsonObject();
			pay_sn=jsonObject.get("datas").getAsJsonObject().get("pay_sn").getAsString();
			return sampleResultsub;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;


	}

	@Override
	public void teardownTest(JavaSamplerContext context) {
		// TODO Auto-generated method stub

	}
	@Override
	public Arguments getDefaultParameters() {
		// TODO Auto-generated method stub
		return null;
	}
//	public static void main(String[] args) {
////		for (int i = 0; i < 10; i++) {
////			System.out.println(i);
////			SampleResult buy_step2Sample =new Buy_step2Sample().runTest(null);
////			System.out.println(new String(buy_step2Sample.getResponseData()));
////		}
////
////
////	}
}
