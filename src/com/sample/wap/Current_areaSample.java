package com.sample.wap;

import com.request.HttpRequest2;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Current_areaSample implements JavaSamplerClient {
	static  ArrayList arrayList =new ArrayList();
	static  int count =0;
	static {

		arrayList.add("9");
		arrayList.add("10");
		arrayList.add("17");
		arrayList.add("18");
		arrayList.add("19");
		arrayList.add("20");
		arrayList.add("21");
		arrayList.add("22");
		arrayList.add("23");
		arrayList.add("24");
		arrayList.add("25");
		arrayList.add("26");
		arrayList.add("27");
		arrayList.add("28");
		arrayList.add("29");
		arrayList.add("30");
		arrayList.add("31");
		arrayList.add("32");
		arrayList.add("33");
		arrayList.add("34");
		arrayList.add("35");
		arrayList.add("36");
		arrayList.add("37");
		arrayList.add("38");
		arrayList.add("39");
		arrayList.add("40");
		arrayList.add("41");
		arrayList.add("42");
		arrayList.add("43");
		arrayList.add("44");
		arrayList.add("45");
		arrayList.add("46");
		arrayList.add("47");
		arrayList.add("48");


		 count=arrayList.size();


	}
//	static  int q = 0;
	@Override
	public SampleResult runTest(JavaSamplerContext arg0) {

		int q=(int) (Math.random()*count);
		String area_id =(String) (arrayList).get(q);
//		System.out.println(q);
//		q++;
		Map map_current =new HashMap<>();
		map_current.put("data", "area_id="+area_id);
//		System.out.println(area_id);
		

	

		
	   try {
		SampleResult sampleResult =new HttpRequest2("/mobile/index.php?act=index&op=current_area", "据地区ID获取当前地区信息", "POST").run(map_current);
//		System.out.println(new String(sampleResult.getResponseData()));
		return sampleResult;
	
	   } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
		return null;
	}

	@Override
	public Arguments getDefaultParameters() {
		// TODO Auto-generated method stub
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
//		for (int i = 0; i < 50; i++) {
//			SampleResult current_area =new Current_areaSample().runTest(null);
//			System.out.println(new String(current_area.getResponseData()));
//
//		}
//
//
//	}



}
