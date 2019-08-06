package com.listener;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.apache.bcel.generic.NEW;
import org.apache.commons.io.FileUtils;
import org.apache.jmeter.assertions.AssertionResult;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.save.converters.SampleResultConverter;
import org.apache.jmeter.util.Calculator;
import org.apache.jmeter.visualizers.backend.AbstractBackendListenerClient;
import org.apache.jmeter.visualizers.backend.BackendListenerClient;
import org.apache.jmeter.visualizers.backend.BackendListenerContext;
import org.w3c.dom.Element;

import com.DB.Insert;
import com.util.Usualutil;




public class MyBackendListener implements BackendListenerClient , Runnable {
	
	

	private static final String JAVA_LANG_STRING = "java.lang.String"; //$NON-NLS-1$
	private static final String ATT_CLASS = "class"; //$NON-NLS-1$
	
	// Element tags. Must be unique. Keep sorted.
	protected static final String TAG_COOKIES           = "cookies";          //$NON-NLS-1$
	protected static final String TAG_METHOD            = "method";           //$NON-NLS-1$
	protected static final String TAG_QUERY_STRING      = "queryString";      //$NON-NLS-1$
	protected static final String TAG_REDIRECT_LOCATION = "redirectLocation"; //$NON-NLS-1$
	protected static final String TAG_REQUEST_HEADER    = "requestHeader";    //$NON-NLS-1$
	
	protected static final String TAG_RESPONSE_DATA     = "responseData";     //$NON-NLS-1$
	protected static final String TAG_RESPONSE_HEADER   = "responseHeader";   //$NON-NLS-1$
	protected static final String TAG_SAMPLER_DATA      = "samplerData";      //$NON-NLS-1$
	protected static final String TAG_RESPONSE_FILE     = "responseFile";     //$NON-NLS-1$
	
	// samplerData attributes. Must be unique. Keep sorted by string value.
	// Ensure the Listener documentation is updated when new attributes are added
	private static final String ATT_BYTES             = "by"; //$NON-NLS-1$
	private static final String ATT_SENT_BYTES        = "sby"; //$NON-NLS-1$
	private static final String ATT_DATA_ENCODING     = "de"; //$NON-NLS-1$
	private static final String ATT_DATA_TYPE         = "dt"; //$NON-NLS-1$
	private static final String ATT_ERROR_COUNT       = "ec"; //$NON-NLS-1$
	private static final String ATT_HOSTNAME          = "hn"; //$NON-NLS-1$
	private static final String ATT_LABEL             = "lb"; //$NON-NLS-1$
	private static final String ATT_LATENCY           = "lt"; //$NON-NLS-1$
	private static final String ATT_CONNECT_TIME      = "ct"; //$NON-NLS-1$
	
	private static final String ATT_ALL_THRDS         = "na"; //$NON-NLS-1$
	private static final String ATT_GRP_THRDS         = "ng"; //$NON-NLS-1$
	
	// N.B. Originally the response code was saved with the code "rs"
	// but retrieved with the code "rc". Changed to always use "rc", but
	// allow for "rs" when restoring values.
	private static final String ATT_RESPONSE_CODE     = "rc"; //$NON-NLS-1$
	private static final String ATT_RESPONSE_MESSAGE  = "rm"; //$NON-NLS-1$
	private static final String ATT_RESPONSE_CODE_OLD = "rs"; //$NON-NLS-1$
	
	private static final String ATT_SUCCESS           = "s";  //$NON-NLS-1$
	private static final String ATT_SAMPLE_COUNT      = "sc"; //$NON-NLS-1$
	private static final String ATT_TIME              = "t";  //$NON-NLS-1$
	private static final String ATT_IDLETIME          = "it"; //$NON-NLS-1$
	private static final String ATT_THREADNAME        = "tn"; //$NON-NLS-1$
	private static final String ATT_TIME_STAMP        = "ts"; //$NON-NLS-1$
	String localip=null;
	private static final Object LOCK = new Object();
	public MyBackendListener() {
		super();
		try {
			localip=InetAddress.getLocalHost().getHostAddress();
		} catch (Exception e) {
			localip=System.getProperty("user.name");
		}
	}
	@Override
	public void run() {
		//AbstractBackendListenerClient
		
	}
	@Override
	public void setupTest(BackendListenerContext context) throws Exception {
		// TODO Auto-generated method stub
		
	}
	public Element sampleResultsToElement(SampleResult sampleResult) {
		
		
		Element sample=Usualutil.getDocument().createElement("sample");
		sample.setAttribute(ATT_TIME, Long.toString(sampleResult.getTime()));
		sample.setAttribute(ATT_IDLETIME, Long.toString(sampleResult.getIdleTime()));
		sample.setAttribute(ATT_LATENCY, Long.toString(sampleResult.getLatency()));
		sample.setAttribute(ATT_CONNECT_TIME, Long.toString(sampleResult.getConnectTime()));
		sample.setAttribute(ATT_TIME_STAMP, Long.toString(sampleResult.getTimeStamp()));
		sample.setAttribute(ATT_SUCCESS, Boolean.toString(sampleResult.isSuccessful()));
		sample.setAttribute(ATT_LABEL, sampleResult.getSampleLabel());
		sample.setAttribute(ATT_RESPONSE_CODE, sampleResult.getResponseCode());
		sample.setAttribute(ATT_RESPONSE_MESSAGE, sampleResult.getResponseMessage());
		sample.setAttribute(ATT_THREADNAME, sampleResult.getThreadName());
		sample.setAttribute(ATT_DATA_TYPE, sampleResult.getDataType());
		sample.setAttribute(ATT_DATA_ENCODING, sampleResult.getDataEncodingNoDefault());
		sample.setAttribute(ATT_BYTES, Long.toString(sampleResult.getBytesAsLong()));
		sample.setAttribute(ATT_SENT_BYTES, Long.toString(sampleResult.getSentBytes()));
		sample.setAttribute(ATT_SAMPLE_COUNT, Long.toString(sampleResult.getSampleCount()));
		sample.setAttribute(ATT_ERROR_COUNT, Long.toString(sampleResult.getErrorCount()));
		sample.setAttribute(ATT_GRP_THRDS, Long.toString(sampleResult.getGroupThreads()));
		sample.setAttribute(ATT_ALL_THRDS, Long.toString(sampleResult.getAllThreads()));
		sample.setAttribute(ATT_HOSTNAME, localip);
		//添加AssertionResult
		AssertionResult[] assertionResults = sampleResult.getAssertionResults();
		
        for (AssertionResult assertionResult : assertionResults) {
        	Element assertionResultelement= Usualutil.getDocument().createElement("assertionResult");
        	//添加AssertionResult的name
        	Element assertionResultelementname= Usualutil.getDocument().createElement("name");
        	assertionResultelementname.setTextContent(assertionResult.getName());
        	assertionResultelement.appendChild(assertionResultelementname);
        	//添加AssertionResult的failure
        	Element assertionResultelementfailure= Usualutil.getDocument().createElement("failure");
        	assertionResultelementfailure.setAttribute("FailureMessage",assertionResult.getFailureMessage());
        	assertionResultelementfailure.setTextContent(Boolean.toString(assertionResult.isFailure()));
        	assertionResultelement.appendChild(assertionResultelementfailure);
        	//添加AssertionResult的error
        	Element assertionResultelementerror= Usualutil.getDocument().createElement("error");
        	assertionResultelementerror.setTextContent(Boolean.toString(assertionResult.isError()));
        	assertionResultelement.appendChild(assertionResultelementerror);
        	sample.appendChild(assertionResultelement);
        }
        
        //添加subSampleResult
        SampleResult[] subResults = sampleResult.getSubResults();
        for (SampleResult subResult : subResults) {
        	Element subsampleResult= sampleResultsToElement(subResult);
        	sample.appendChild(subsampleResult);
        }
        //添加responseHeader
        Element responseHeader=Usualutil.getDocument().createElement(TAG_RESPONSE_HEADER);
        responseHeader.setAttribute(ATT_CLASS,JAVA_LANG_STRING);
        responseHeader.setTextContent(sampleResult.getResponseHeaders());
        sample.appendChild(responseHeader);
        //添加responseHeader
        Element requestHeader=Usualutil.getDocument().createElement(TAG_REQUEST_HEADER);
        requestHeader.setAttribute(ATT_CLASS,JAVA_LANG_STRING);
        requestHeader.setTextContent(sampleResult.getRequestHeaders());
        sample.appendChild(requestHeader);
        //添加responseData
        Element responseData=Usualutil.getDocument().createElement(TAG_RESPONSE_DATA);
        responseData.setAttribute(ATT_CLASS,JAVA_LANG_STRING);
        responseData.setTextContent(sampleResult.getResponseDataAsString());
        sample.appendChild(responseData);
        //添加responseFile
        Element responseFile=Usualutil.getDocument().createElement(TAG_RESPONSE_FILE);
        responseFile.setAttribute(ATT_CLASS,JAVA_LANG_STRING);
        responseFile.setTextContent(sampleResult.getResultFileName());
        sample.appendChild(responseFile);
        //添加samplerData
        Element samplerData=Usualutil.getDocument().createElement(TAG_SAMPLER_DATA);
        samplerData.setAttribute(ATT_CLASS,JAVA_LANG_STRING);
        samplerData.setTextContent(sampleResult.getSamplerData());
        sample.appendChild(samplerData);	 
        //添加URL
        Element URL=Usualutil.getDocument().createElement("java.net.URL");
        URL.setAttribute(ATT_CLASS,JAVA_LANG_STRING);
        URL.setTextContent(sampleResult.getUrlAsString());
        sample.appendChild(URL);	 		  
        		
        
        return sample;
        
	}
	@Override
	public void handleSampleResults(List<SampleResult> sampleResults, BackendListenerContext context) {
		//SampleResultConverter
		synchronized (LOCK) {
			
			
		for (int i = 0; i < sampleResults.size(); i++) {
			
			SampleResult sampleResult=sampleResults.get(i);
			
			Element element=Usualutil.getDocument().createElement("testResults");
			element.setAttribute("version", "1.2");
			element.appendChild(sampleResultsToElement(sampleResult));
			String xml=null;
			try {
				 xml=Usualutil.elementToXml(element);
			} catch (Exception e) {
				xml=Usualutil.exceptionToString(e);
			}
			xml=Base64.getEncoder().encodeToString(xml.getBytes());
			String date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
			//String sql="INSERT INTO testresults (xml,date) VALUE(\""+xml+"\",\""+date+"\" )";
			
			try {
				FileUtils.write(new File("result.log"), date+xml+"\n", "utf-8", true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Insert.insertbysql(sql);
			
		  }
			
			
		}
		
	}
	@Override
	public void teardownTest(BackendListenerContext context) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Arguments getDefaultParameters() {
		// TODO Auto-generated method stub
		return null;
	}
	Calculator calculator=new Calculator();
	@Override
	public SampleResult createSampleResult(BackendListenerContext context, SampleResult result) {
		//添加sampleresult
		
				synchronized (LOCK) {
					
					calculator.addSample(result);
					
					//获取平均 页面返回数据大小
					String AvgPageBytes=Double.toString(calculator.getAvgPageBytes());
					//获取 总数
					String Count=Integer.toString(calculator.getCount());
					//获取 测试中出现错误的请求的数量/请求的总数
					String ErrorPercentage=Double.toString(calculator.getErrorPercentage());
					//获取每秒页面 接受数据大小
					String KBPerSecond=Double.toString(calculator.getKBPerSecond());
					//获取 最大响应时间
					String Max=Long.toString(calculator.getMax());
					//获取 平均响应时间
					String Mean=Double.toString(calculator.getMean());
					//获取 最小响应时间
					String Min=Long.toString(calculator.getMin());
					//获取 吞吐量
					String Rate=Double.toString(calculator.getRate());
					//获取每秒页面 发送数据大小
					String SentKBPerSecond=Double.toString(calculator.getSentKBPerSecond());
					//获取 标准差
					String StandardDeviation=Double.toString(calculator.getStandardDeviation());
					//获取 总byte大小
					calculator.getTotalBytes();
					String a="AvgPageBytes"+AvgPageBytes+" Count"+Count+" ErrorPercentage"+ErrorPercentage+" KBPerSecond"+KBPerSecond+" Max"+Max+" Mean"+Mean+" Min"+Min+" Rate"+Rate+" SentKBPerSecond"+SentKBPerSecond+" StandardDeviation"+StandardDeviation;
					try {
						
						FileUtils.writeStringToFile(new File("sum.log"), a+"\n", "utf-8", true);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		return result;
	}
	
}