package com.runner;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.commons.io.input.CountingInputStream;
import org.apache.jmeter.assertions.AssertionResult;
import org.apache.jmeter.protocol.http.util.HTTPConstants;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.DB.Select;
import com.data.PrepareData;
import com.util.Usualutil;

public class MyRunner extends Runner{
	
	//private static final Logger log = LoggerFactory.getLogger(Runner.class);
	
	public void setRequestProperty(HttpURLConnection conn) {
		//设置请求头
	}
	
	public String signapi(String string) {
	    //api签名
		return string;
	}
	
	public void loginOn(HttpURLConnection conn) throws Exception {
		 HttpURLConnection connloginOn=(HttpURLConnection)new URL("https://www.baidu.com/").openConnection();
	        
       //conn.addRequestProperty("token", "93fce726a0843316e90c1b3341f968a4");
         conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36");
       //conn.addRequestProperty("Referer", "http://101.200.44.229/");
         
       int code=  connloginOn.getResponseCode();
       //设置登录认证
       conn.setRequestProperty("", "");
	        
	}
	
	@Override
	public SampleResult run(JavaSamplerContext context) throws Exception  {
		SampleResult sampleResult=new SampleResult();
		//在属于自己的list里随机获取一条数据
		String classname=this.getClass().getName();
		List list=(List) PrepareData.getPrepareData(classname);
		int datalength=list.size();
		int index=(int)(Math.random()*datalength);
		Map map=(Map) list.get(index);
		
		//String strUrl = "https://www.baidu.com";
		String strUrl = (String) map.get("url");
		//byte[] data = new byte[0];
		byte[] data = ((String)map.get("data")).getBytes();
		
		
		//开始http请求
		URL url=new URL(strUrl);
        HttpURLConnection conn=(HttpURLConnection)url.openConnection();
        //设置请求参数
        setRequestProperty(conn);
        //处理登录验证
        loginOn(conn);
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(10000);
        //conn.setRequestMethod("POST");
        conn.setRequestMethod("GET");
        
        conn.setDoOutput(true);
        //设置自动重定向
       // conn.setInstanceFollowRedirects(false);
        String RequestProperties=Usualutil.getRequestProperties(conn);
        //取样开始
        sampleResult.sampleStart();
        //设置user思考时间
        Thread.sleep(1000);
        conn.connect();
        //连接上网
        sampleResult.connectEnd();
        CountingInputStream instream = null;
        
        try {
        	
        	OutputStream outStream=conn.getOutputStream();
            outStream.write(data);
        	
        	boolean gzipped = HTTPConstants.ENCODING_GZIP.equals(conn.getContentEncoding());
          
            InputStream inputStream=null;
            instream = new CountingInputStream(conn.getInputStream());
            if (gzipped) {
            	inputStream = new GZIPInputStream(instream);
            } else {
            	inputStream = instream;
            }
        	
            BufferedReader bufReader=new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
            StringBuilder sb=new StringBuilder();
            String line="";
            while((line=bufReader.readLine())!=null) {
            	
            	sb.append(line);
            }
            //设置接受数据完成的时间
    		sampleResult.latencyEnd();
            //设置请求的url
            sampleResult.setURL(conn.getURL());
            //设置response头
            sampleResult.setResponseHeaders(Usualutil.getResponseHeaders(conn));
            //设置response头大小
            sampleResult.setHeadersSize(Usualutil.getResponseHeaders(conn).getBytes().length);
            //设置request头
            sampleResult.setRequestHeaders(RequestProperties);
            //设置返回状态码
            sampleResult.setResponseCode(Integer.toString(conn.getResponseCode()));
            //设置返回数据
            sampleResult.setResponseData(sb.toString().getBytes());
            //设置返回总数据
            sampleResult.setBytes((long)(Usualutil.getResponseHeaders(conn)+sb.toString()).getBytes().length);
            //设置发送的数据大小
            sampleResult.setSentBytes(data.length+RequestProperties.getBytes().length);
            //设置body大小
            sampleResult.setBodySize(instream.getByteCount());
            //设置取样成功
            sampleResult.setSuccessful(true);
            //设置取样 label
            sampleResult.setSampleLabel("xxx取样");
            //设置取样 用的数据
            sampleResult.setSamplerData(new String(data));
            //设置取样的个数
            sampleResult.setSampleCount(1);
            //连接关闭
            conn.disconnect();
            //取样结束
            sampleResult.sampleEnd();
            
            AssertionResult assertionResult=new AssertionResult("xxx验证");
            boolean error=false;
            try {
            	 if (error) {
                 	assertionResult.setError(true);
     			}
			} catch (Exception e) {
				//设置 Failure message
				assertionResult.setResultForFailure(Usualutil.exceptionToString(e));
			}
           
            //设置AssertionResult
            sampleResult.addAssertionResult(assertionResult);
           
		} catch (Exception e) {
			e.printStackTrace();
			sampleResult.setSuccessful(false);
		}
        	
        SampleResult sampleResult2=new SampleResult();
        sampleResult2.sampleStart();
        sampleResult2.sampleEnd();
        sampleResult2.setSuccessful(true);
        sampleResult.addSubResult(sampleResult2);
        
		return sampleResult;
	}
	
}
