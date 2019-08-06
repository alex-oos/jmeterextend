package com.sample.wap;

import com.request.HttpRequest2;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AjaxGetGoodStoreGradeSample implements JavaSamplerClient {
	static  ArrayList list = new ArrayList<>();
	static int count = 0;
		static {
			list.add("27,84,122,13,122");
			list.add("3");
			list.add("4");
			list.add("5");
			list.add("6");
			list.add("7");
			list.add("8");
			list.add("9");
			list.add("10");
			list.add("11");
			list.add("12");
			list.add("13");
			list.add("14");
			list.add("15");
			list.add("16");
			list.add("18");
			list.add("19");
			list.add("20");

			count = list.size();
		}
//	static  int q = 0;

	@Override
	public Arguments getDefaultParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SampleResult runTest(JavaSamplerContext arg0) {



		int q = (int) (Math.random() * count);

		String storeIds = (String) list.get(q);
//		System.out.println(q);
//		q++;
		Map map_ajax = new HashMap<>();
		map_ajax.put("data", "");
		try {
			SampleResult sampleResult = new HttpRequest2("/mobile/index.php?act=index&op=ajaxGetGoodStoreGrade&storeIds=" + storeIds, "获取商品的店铺信息", "GET").run(map_ajax);
//			System.err.println("请求头："+storeIds);

			return sampleResult;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void setupTest(JavaSamplerContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void teardownTest(JavaSamplerContext arg0) {
		// TODO Auto-generated method stub

	}
//	public static void main(String[] args) {
//		for (int i = 0; i <20; i++) {
//			SampleResult ajaxGetGoodStoreGrade =new AjaxGetGoodStoreGradeSample().runTest(null);
//			System.out.println(new String(ajaxGetGoodStoreGrade.getResponseData()));
//		}
//}




}
