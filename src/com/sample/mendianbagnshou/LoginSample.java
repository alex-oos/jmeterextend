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

public class LoginSample implements JavaSamplerClient {

	static List list =new ArrayList();
	static int count=0;
	static{
		list.add("13244444444");
		list.add("13281028898");
		list.add("13308093426");
		list.add("13350533303");
		list.add("13368527555");
		list.add("13387153772");
		list.add("13541021633");
		list.add("13541226465");
		list.add("13541997099");
		list.add("13550485257");
		list.add("13673992369");
		list.add("13698277400");
		list.add("13778889909");
		list.add("13786675013");
		list.add("13881789884");
		list.add("13980838356");
		list.add("13982022822");
		list.add("15082329319");
		list.add("15108480686");
		list.add("15183996779");
		list.add("15282747010");
		list.add("15756325398");
		list.add("15883308111");
		list.add("15884553758");
		list.add("15892577964");
		list.add("17508220366");
		list.add("18080167527");
		list.add("18090513451");
		list.add("18116577233");
		list.add("18188422290");
		list.add("18228160944");
		list.add("18728752555");
		list.add("18989266991");
		list.add("18990575592");
		list.add("a18625606990");
		list.add("anfw2880");
		list.add("anjz1515");
		list.add("ankang7280");
		list.add("anmq0099");
		list.add("anqh6398");
		list.add("anqing9452");
		list.add("anxd6940");
		list.add("baib6088");
		list.add("baich7372");
		list.add("baigp1871");
		list.add("baijd2465");
		list.add("baikf9222");
		list.add("baiqy6318");
		list.add("baixc6909");
		list.add("baixw2548");
		list.add("baizh1093");
		list.add("banxs8018");
		list.add("baosm3324");
		list.add("baosx3111");
		list.add("baxy2951");
		list.add("biandc1666");
		list.add("biantz9944");
		list.add("bianwz8269");
		list.add("bianxin6886");
		list.add("bianxs7117");
		list.add("bianzq1837");
		list.add("bizq8719");
		list.add("boqy9098");
		list.add("bowt7082");
		list.add("boxs8440");
		list.add("buqs5005");
		list.add("caijj3444");
		list.add("cailc7085");
		list.add("caiqi0786");
		list.add("caiwq1870");
		list.add("caixin2188");
		list.add("caobs7643");
		list.add("caocj3981");
		list.add("caocj7686");
		list.add("caofr9877");
		list.add("caogh7748");
		list.add("caohq6158");
		list.add("caojc9182");
		list.add("caojf6249");
		list.add("caojl5088");
		list.add("caojw6182");
		list.add("caomq1100");
		list.add("caomq2315");
		list.add("caoms6589");
		list.add("caosh6218");
		list.add("caotq5192");
		list.add("caowl2199");
		list.add("caoww6887");
		list.add("caoxh9518");
		list.add("caoxl2292");
		list.add("caoxm0061");
		list.add("caoxp9996");
		list.add("caoxy5038");
		list.add("caoxz3219");
		list.add("caoyan1273");
		list.add("caoyb5214");
		list.add("caozl9056");
		list.add("caozy1197");
		list.add("castcrus");
		list.add("ceshi0913");
		list.add("ceshi2109");
		list.add("ceshi22");
		list.add("ceshi520");
		list.add("ceshidian");
		list.add("chaiby7649");
		list.add("chaics7298");
		list.add("chaigz7344");
		list.add("chairf7818");
		list.add("chairl7856");
		list.add("chaish1880");
		list.add("chaisj7928");
		list.add("chaiss9880");
		list.add("chaixb3114");
		list.add("chaixz6605");
		list.add("chaiyf7818");
		list.add("chaiyj5403");
		list.add("chaiyl3262");
		list.add("changap8238");
		list.add("changchang0005");
		list.add("changhb3557");
		list.add("changjc3517");
		list.add("changjk7031");
		list.add("changliang0084");
		list.add("changsk0459");
		list.add("changtw9523");
		list.add("changwk0668");
		list.add("changys1892");
		list.add("changzw0258");
		list.add("changzw0917");
		list.add("chaofl9896");
		list.add("chaoyang7765");
		list.add("che16");
		list.add("chehh9591");
		list.add("chejp8463");
		list.add("chenbb4300");
		list.add("chenchong4455");
		list.add("chencj7218");
		list.add("chency9978");
		list.add("chendl6866");
		list.add("chenfd8855");
		list.add("chenfeng0261");
		list.add("chenfeng3808");
		list.add("chenfu4318");
		        
		
		
		
		count=list.size();
	 }
	
	@Override
	public void setupTest(JavaSamplerContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SampleResult runTest(JavaSamplerContext context) {
		
		
		int q=(int) (Math.random()*count);
	    String user =(String) list.get(q); 
	    
	    
	    Map map_login =new HashMap<>();
		Map map_login_data =new HashMap<>();
		
		map_login_data.put("password", "123456");
		map_login_data.put("client_type", "android");
		map_login_data.put("user", user);
		
		map_login.put("data", map_login_data);

		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member/login", "进行登录", "POST").run(map_login);
//			System.out.println(new String(sampleResultsub.getResponseData()));
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

//	public static void main(String[] args) {
//		for (int i = 0; i <list.size(); i++) {
//			SampleResult loginSample = new LoginSample().runTest(null);
//			System.out.println(new String(loginSample.getResponseData()));
//
//		}
//
//
//	}

}
