package com.request;

import com.manager.HttpManager;
import com.util.Usualutil;
import org.apache.commons.io.input.CountingInputStream;
import org.apache.jmeter.protocol.http.util.HTTPConstants;
import org.apache.jmeter.samplers.SampleResult;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPInputStream;

public class HttpRequest2 extends Request {

	
	String address="";
	String label="";
	String method="";
	
	public HttpRequest2(String address,String label,String method) {
		 this.address=address;
		 this.label=label;
		 this.method=method;
	}
	
	@Override
	public SampleResult run(Map map) throws Exception {
		SampleResult sampleResult=new SampleResult();
		  //设置取样 label
        sampleResult.setSampleLabel(label);
		try {
			
			
			HttpManager httpManager= new HttpManager();
			

			String strUrl = httpManager.address()+address;
			String maparg =(String)map.get("data");
               
//			System.out.println(maparg);
			
	    	
	    	
			
			byte[] data=maparg.getBytes();
		
			
//			data = DES3Util.encrypt(data);
			
			
			//开始请求

			
	    	URL url=new URL(strUrl);
	        HttpURLConnection conn=(HttpURLConnection)url.openConnection();
	        Map headmap= (Map)map.get("head");

	        if (headmap!=null) {
	        	 for (Entry entry : (Set<Entry>)((Map) headmap.get("head")).entrySet()) {
	             	conn.addRequestProperty((String)entry.getKey(), (String)entry.getValue());
	     		}
			}
	       
	        
	        httpManager.process(conn);
	        
	        conn.setRequestMethod(method);
	       
	        conn.setDoOutput(true);
	        //设置自动重定向
	        //conn.setInstanceFollowRedirects(false);
	        String RequestProperties=Usualutil.getRequestProperties(conn);
	        //取样开始
	        sampleResult.sampleStart();
	        //设置user思考时间
	        //Thread.sleep(1000);
	        conn.connect();
	        //连接上网
	        sampleResult.connectEnd();
	        CountingInputStream instream = null;
	        
	    	
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
	    	
	       // BufferedReader bufReader=new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
//	        StringBuilder sb=new StringBuilder();
//	        String line="";
//	        while((line=bufReader.readLine())!=null) {
//	        	
//	        	sb.append(line);
//	        }
	        
	        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
	        byte[] b = new byte[2048];
	        int length;
	        while ((length = inputStream.read(b)) > 0) {
	        	byteArrayOutputStream.write(b, 0, length);
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
	        sampleResult.setResponseData(byteArrayOutputStream.toByteArray());
	        //设置返回总数据
	        sampleResult.setBytes((long)(Usualutil.getResponseHeaders(conn).getBytes().length+byteArrayOutputStream.toByteArray().length));
	        //设置发送的数据大小
	        sampleResult.setSentBytes(data.length+RequestProperties.getBytes().length);
	        //设置body大小
	        sampleResult.setBodySize(instream.getByteCount());
	        //设置取样成功
	        sampleResult.setSuccessful(true);
	      
	        //设置取样 用的数据
	        sampleResult.setSamplerData(new String(data));
	  
	        //连接关闭
	        conn.disconnect();
	        //取样结束
	        sampleResult.sampleEnd();
		} catch (Exception e) {
			e.printStackTrace();
			sampleResult.setSuccessful(false);
			 //取样结束
	        sampleResult.sampleEnd();
			return sampleResult;
		}
		

		return sampleResult;
	}



}
