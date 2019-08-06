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

public class Pay_password1Sample implements JavaSamplerClient {

	static List list =new ArrayList();
	static int count=0;
	static List goodidlist =new ArrayList();
	static int goodidcount=0;
	static{
		list.add("5d025fe48e25a74d1b4db752dee2336e");
		list.add("a6435ea9e74e7baab4e475332d848363");
		list.add("6db3c871aaab14c7ae30fcc7ae56e1c7");
		list.add("5e3ef252b017f4bb3ecc0944573173e4");
		list.add("2ea7ea8abca978c13f3acfac54af8070");
		list.add("3288a49eddeeca7cca7f8b6f61ff7c86");
		list.add("0c23c1a4467ad2f3cf516a95b4bad011");
		list.add("2d3046996c7f2c0a5e4d7f9042028cb9");
		list.add("1a77252388f36fd0cee965daca8897bb");
		list.add("70f4f472ac02876bd3bea59a330fec77");
		list.add("e93174a158cf9edae8841a41e82e6ebe");
		list.add("165394cb3292a65204e856092d7f0769");
		list.add("47e32f4724475753bbbb38cb06a359a0");
		list.add("5a8a9fd3f077ba63f02ca4401cfc6c71");
		list.add("77c76fb47524e4d10adc5764157fae2b");
		list.add("8620eae68cdc51a9fee838c65826acee");
		list.add("46b5ba5a95595ff1e55c0dc218819bae");
		list.add("c11c2c656377ef92042876f7b97ff3cc");
		list.add("b2540b5af6044b82bfffd8d3eff1ac0c");
		list.add("15f784f35c9bffdb4ba4e87c74f05ffa");
		list.add("b97864a7e825138f837842a71e918025");
		list.add("e8abec42833457e97fc2ca856547032e");
		list.add("2e1ec8fb2c650791002bd187a5c0f39c");
		list.add("f5371a547d1bbcad537befb64e11891f");
		list.add("60e8f839c27bab8ab1d07bf4f20bbadd");
		list.add("5290b7f1148eedb660b2de5a3af1e01e");
		list.add("14853749dc77776026204f6a0527a4d5");
		list.add("8a33bb6cecc8fe368c8d02b28c475fc2");
		list.add("3ee6e939f36a828d7093883cbbde7fa0");
		list.add("5e83a29ff5baa4e7ae310087ab8c80f5");
		list.add("1dafc585f265c47b8d491b70ea3799f3");
		list.add("c863e0ba1cc140fde60dc992e51e22a3");
		list.add("fd6e9f3434f93a75ebb391ecbb82cfe7");
		list.add("77236e33eec456606102406bbf8fd3ff");
		list.add("57839614f2da9c0e35236e6e6cae8d3a");
		list.add("b75878b53853e7a735095f70ba29fa71");
		list.add("248b4d00473b7cbd4a7c4aaa63e80057");
		list.add("ffc6c4c5dc24c72956aef0174aea1090");
		list.add("d14f10645c03e42b684235376fa43d72");
		list.add("9907321eb204511a78349a2137d11170");
		list.add("9045c6913b1277b9337e186052238db7");
		list.add("13ca07790655ce7dbd4897af75223ea6");
		list.add("89747982017cf5a6e8edc77421e5a33c");
		list.add("28ab7e183ad01c9add2c00c5f6599190");
		list.add("6c212dca06cb10d5e73e000ddeb7cf4f");
		list.add("bc690a722bca7f145cecc6f0064bccaa");
		list.add("9d4f3ff0f88732491ea1b221ebdfaa70");
		list.add("c4b682f1933ae38276fa3f67eb4a107e");
		list.add("12f2ff0b12b537920c67d937ac6f38e8");
		list.add("f4d79cf2e979cca4a8d5659a71313ff7");
		list.add("734ac1b8142588f65be9771a3a17f50a");
		list.add("90b5916744caf11b154e7352f96fe941");
		list.add("1cdcb595bd307ba55eab2ceba39f9757");
		count=list.size();
		
		
		
		
		goodidlist.add("100020");
		goodidlist.add("100021");
		goodidlist.add("100023");
		goodidlist.add("100024");
		goodidlist.add("100025");
		goodidlist.add("100026");
		goodidlist.add("100027");
		goodidlist.add("100028");
		goodidlist.add("100029");
		goodidlist.add("100030");
		goodidlist.add("100031");
		goodidlist.add("100032");
		goodidlist.add("100033");
		goodidlist.add("100034");
		goodidlist.add("100035");
		goodidlist.add("100036");
		goodidlist.add("100037");
		goodidlist.add("100038");
		goodidlist.add("100039");
		goodidlist.add("100040");
		goodidlist.add("100041");
		goodidlist.add("100042");
		goodidlist.add("100043");
		goodidlist.add("100045");
		goodidlist.add("100046");
		goodidlist.add("100048");
		goodidlist.add("100049");
		goodidlist.add("100050");
		goodidlist.add("100051");
		goodidlist.add("100052");
		goodidlist.add("100054");
		goodidlist.add("100055");
		goodidlist.add("100057");
		goodidlist.add("100058");
		goodidlist.add("100059");
		goodidlist.add("100060");
		goodidlist.add("100062");
		goodidlist.add("100063");
		goodidlist.add("100064");
		goodidlist.add("100065");
		goodidlist.add("100066");
		goodidlist.add("100067");
		goodidlist.add("100068");
		goodidlist.add("100069");
		goodidlist.add("100070");
		goodidlist.add("100071");
		goodidlist.add("100072");
		goodidlist.add("100073");
		goodidlist.add("100074");
		goodidlist.add("100075");
		
		goodidcount=goodidlist.size();
		
		
		
		
		
		
		
	 }
	
	@Override
	public void setupTest(JavaSamplerContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SampleResult runTest(JavaSamplerContext context) {
		
		
	    String token =(String) list.get((int) (Math.random()*count)); 
	    
	    String goodid =(String) list.get((int) (Math.random()*goodidcount));
	    

		
	    //支付密码验证1
  		Map map_orderpay_password =new HashMap<>();
  		
  		Map map_orderpay_password_data =new HashMap<>();
  		map_orderpay_password_data.put("password", "123456");
  		map_orderpay_password_data.put("client_type", "android");
  		map_orderpay_password.put("data", map_orderpay_password_data);
  		
  		Map map_orderpay_password_head =new HashMap<>();
  		map_orderpay_password_head.put("token", token);
  		map_orderpay_password.put("head", map_orderpay_password_head);

  		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_buy/chain_auth_infochain_auth_info", "支付密码验证1", "POST").run(map_orderpay_password);
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
