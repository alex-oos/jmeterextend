package com.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.input.CountingInputStream;
import org.apache.jmeter.assertions.AssertionResult;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.http.util.HTTPConstants;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import com.data.PrepareData;
import com.runner.MyRunner;
import com.util.Usualutil;

public class CustomJavaSample5 implements JavaSamplerClient {

	@Override
	public void setupTest(JavaSamplerContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult sampleResult=new SampleResult();
		try {
			sampleResult.sampleStart();
			//在属于自己的list里随机获取一条数据
			String result=	db.select5().toString();
            //设置接受数据完成的时间
    		sampleResult.latencyEnd();
    		 //取样结束
            sampleResult.sampleEnd();
            //设置返回数据
            sampleResult.setResponseData(result.toString().getBytes());
            //设置返回总数据
            sampleResult.setBytes((long)(result.toString()).getBytes().length);
         
            //设置取样成功
            sampleResult.setSuccessful(true);
            //设置取样 label
            sampleResult.setSampleLabel("5");
            //设置取样的个数
            sampleResult.setSampleCount(1);
           
            
		} catch (Exception e) {
			e.printStackTrace();
			sampleResult.setSuccessful(false);
		}
        	
		return sampleResult;
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

}
