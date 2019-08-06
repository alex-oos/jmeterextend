package com.runner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import com.Transaction.LoginOnTransaction;
import com.data.PrepareData;

public class LoginOnRunner extends Runner{

	
	
	
	
	@Override
	public SampleResult run(JavaSamplerContext context)  {
		//在属于自己的list里随机获取一条数据
//		String classname=this.getClass().getName();
//		List list=(List) PrepareData.getPrepareData(classname);
//		int datalength=list.size();
//		int index=(int)(Math.random()*datalength);
//		Map map=(Map) list.get(index);
		

		Map map_login =new HashMap<>();
		Map map_login_data =new HashMap<>();
		
		map_login_data.put("password", "123456");
		map_login_data.put("client_type", "android");
		map_login_data.put("user", "changsk0459");
		
		map_login.put("data", map_login_data);
		
		
		SampleResult sampleResult=new LoginOnTransaction().run(map_login);
		return sampleResult;
	}

	
	
}
