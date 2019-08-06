package com.Transaction;

import java.util.Map;
import org.apache.jmeter.samplers.SampleResult;
import com.request.HttpRequest;

public class LoginOnTransaction extends Transaction{

	@Override
	public SampleResult run(Map map)  {
		SampleResult sampleResult=new SampleResult();
		sampleResult.setSampleLabel("登录");
		sampleResult.sampleStart();
		
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member/login", "进行登录", "POST").run(map);
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
