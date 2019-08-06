package com.sample.mendianbagnshou;

import com.request.HttpRequest;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Get_activ_listSample implements JavaSamplerClient{

	static List<String> list =new ArrayList<String>();
	static int count=0;
	static{
		list.add("9,10");
		list.add("9,10,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,40,41,42,43,45,46,47,39,44");
		list.add("9");
		list.add("9,10,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,40,41,42,43,45,46,47,39,44");
		list.add("9,10,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,40,41,42,43,45,46,47,39,44");
		list.add("9,10,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,40,41,42,43,45,46,47,39,44");
		list.add("9,10,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,40,41,42,43,45,46,47,39,44");
		list.add("9,10,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,40,41,42,43,45,46,47,39,44");
		list.add("9,10,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,40,41,42,43,45,46,47,39,44");
		list.add("9,10,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,40,41,42,43,45,46,47,39,44");
		list.add("9,10,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,40,41,42,43,45,46,47,39,44");
	
		count=list.size();
	 }
	@Override
	public Arguments getDefaultParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SampleResult runTest(JavaSamplerContext arg0) {
		
		
		int q=(int) (Math.random()*count);
	    String vr_city_id =(String) list.get(q); 
		
		Map<Object, Object> mapget_activ_list =new HashMap<>();
		
		Map<Object, Object> mapget_activ_list_data =new HashMap<>();
		mapget_activ_list_data.put("vr_city_id", vr_city_id);
		mapget_activ_list.put("data", mapget_activ_list_data);
		
  		
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/active_hint/get_activ_list", "获取活动列表", "POST").run(mapget_activ_list);
//			System.err.println(new String(sampleResultsub.getResponseData()));

			return sampleResultsub;
		} catch (Exception e) {
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
//		for (int i = 0; i < 15; i++) {
//			SampleResult get_activ_list =new Get_activ_list().runTest(null);
//		}
//
//
//	}

}
