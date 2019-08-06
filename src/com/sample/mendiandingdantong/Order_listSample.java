package com.sample.mendiandingdantong;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import com.request.AppHttpRequest;

public class Order_listSample implements JavaSamplerClient {

	static List list =new ArrayList();
	static int count=0;
	static{
		list.add("2a3ac08397206d7f4d514713675d63bc");
		list.add("d6eb2595abaf8f7e8677390d2ded371e");
		list.add("78ccee124be5c5c1a2c1898a07343313");
		list.add("b6b7a1e80accb04e1a055cefc87706d0");
		list.add("ce1127bd5cd5feff210ed2a958489a74");
		list.add("af131aa0f822b9c8e006fc25367b354b");
		list.add("b78f72b8cd94dd1808e29052777ac341");
		list.add("7e2935ea6f10389f5b9c2e8ba4af64ff");
		list.add("588e95a238ac085044e94ef7c2fab181");
		list.add("e89bba9a30ec330a9756febdfd66f650");
		list.add("3eaa453013826ba516347d18121806b6");
		list.add("088687a67ac281a7d134d4cce9d553cd");
		list.add("fdef4720bd3a0ca7e6234bb6c8d0f86f");
		list.add("fb8f96f9d9945eadd79a98a69084573a");
		list.add("fce8f4c530fc2b0c4004f072712a4c36");
		list.add("e3e84ebb258d7a628bc8db8fe2114ddd");
		list.add("80a56b6d513f934f0419c1392d108540");
		list.add("b1d89d88d234acfea1de74d0e699132b");
		list.add("3fd6a81d16c05b335d3018f8028631fa");
		list.add("b08b056c0aa7ddcfe2145576c06b3289");
		list.add("a93da496ffb1da3aeb342970b2d2f197");
		list.add("25144ac625b5c4ef1d191ba3fc7d1b86");
		list.add("45f120c2d2685d5ed2c1cfa6fc5418a7");
		list.add("3d8311891d8c8bbc95c1869ea30ef13d");
		list.add("5a37eb2a0f1d5d847744266c3492c6c6");
		list.add("1ec7886dc1fdddb03e424abebb097b6b");
		list.add("d9211e314ef37686003045053e0e944a");
		list.add("5222d95b03c8bc7c444c7e45bc80fedb");
		list.add("88481441f75f0f3dfc000f9f6072e7c4");
		list.add("dbb6498b99d41f55013dcc015bda1e62");
		list.add("0ea4e00079b0b1f525cb89390d03064d");
		list.add("af31e6e58c734dcaf59e420284f3a872");
		list.add("019950689f5d3ff4410bcae6404ebc81");
		list.add("9744c48887d2dc2c9b501d60b8186108");
		list.add("4280e554a265789ed21b5eabdde0992f");
		list.add("57b17bdbdf2c4e6fe421757cf8561c09");
		list.add("90ff0f4ec87650fe43909856db01e4cf");
		list.add("e132b400136c06f4b2100d656183d510");
		list.add("7011a5bedf9b3e6aa5c4615fd62e9fc9");
		list.add("b9d63e8a0246f06a0f6c585e36ef2678");
		list.add("c815cede5b911598a06753dabd627126");
		list.add("f3df33f6d410124f409f74f45aeaa904");
		list.add("ccbe55eb084ec059ea63bc6e2028a7f5");
		list.add("03a7a4803fdab667bdcf8b4eaa9ce3c4");
		list.add("953c2b26b61519cb7c0f0217b1172e77");
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
	    
	    
	    //采购订单列表
  		Map map_orderorder_list =new HashMap<>();
  		
  		Map map_orderorder_list_data =new HashMap<>();
  		map_orderorder_list_data.put("order_key", "");
  		map_orderorder_list_data.put("curpage", "1");
  		map_orderorder_list_data.put("state_type", "");
  		
  		map_orderorder_list.put("data", map_orderorder_list_data);
  		
  		Map map_orderorder_list_head =new HashMap<>();
  		map_orderorder_list_head.put("token", token);
  		map_orderorder_list.put("head", map_orderorder_list_head);

  		try {
			SampleResult sampleResultsub= new AppHttpRequest("/orderapi/v1/wholesale_order/order_list", "采购订单列表", "POST").run(map_orderorder_list);
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

}
