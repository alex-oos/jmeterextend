package com.sample.mendiandingdantong;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import com.request.AppHttpRequest;

public class Get_member_infoSample implements JavaSamplerClient {
	
	static List list =new ArrayList();
	static int count=0;
	static{
		list.add("2a3ac08397206d7f4d514713675d63bc");
		list.add("af131aa0f822b9c8e006fc25367b354b");
		list.add("b78f72b8cd94dd1808e29052777ac341");
		list.add("3eaa453013826ba516347d18121806b6");
		list.add("088687a67ac281a7d134d4cce9d553cd");
		list.add("e3e84ebb258d7a628bc8db8fe2114ddd");
		list.add("25144ac625b5c4ef1d191ba3fc7d1b86");
		list.add("3d8311891d8c8bbc95c1869ea30ef13d");
		list.add("5a37eb2a0f1d5d847744266c3492c6c6");
		list.add("1ec7886dc1fdddb03e424abebb097b6b");
		list.add("d9211e314ef37686003045053e0e944a");
		list.add("88481441f75f0f3dfc000f9f6072e7c4");
		list.add("dbb6498b99d41f55013dcc015bda1e62");
		list.add("0ea4e00079b0b1f525cb89390d03064d");
		list.add("af31e6e58c734dcaf59e420284f3a872");
		list.add("e132b400136c06f4b2100d656183d510");
		list.add("7011a5bedf9b3e6aa5c4615fd62e9fc9");
		list.add("c815cede5b911598a06753dabd627126");
		list.add("ccbe55eb084ec059ea63bc6e2028a7f5");
		list.add("03a7a4803fdab667bdcf8b4eaa9ce3c4");
		list.add("014111537153ba5280da0e45a925e2ec");
		list.add("8d17db782f7fe20efc8d499ce8b552bc");
		
		count=list.size();
	 }
	
	@Override
	public void setupTest(JavaSamplerContext context) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public SampleResult runTest(JavaSamplerContext context) {
		
		int q=(int) (Math.random()*count);
		
	    String token =(String) list.get(q); 
	    //获取会员信息
  		Map mapget_member_info =new HashMap<>();
  		
  		Map mapget_member_info_data =new HashMap<>();
  		mapget_member_info_data.put("client_type", "android");
  		mapget_member_info.put("data", mapget_member_info_data);
  		
  		Map mapget_member_info_head =new HashMap<>();
  		mapget_member_info_head.put("token", token);
  		mapget_member_info.put("head", mapget_member_info_head);
	  		
	  		


		try {
			SampleResult sampleResultsub= new AppHttpRequest("/orderapi/v1/member_index/get_member_info", "获取会员信息", "POST").run(mapget_member_info);
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
	public static void main(String[] args) {
		
			SampleResult sampleResult=new Get_member_infoSample().runTest(null);
			System.out.println(sampleResult.getTime()+"ms");
			System.out.println(new String(sampleResult.getResponseData()));

	}
}
