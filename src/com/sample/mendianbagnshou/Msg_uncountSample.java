package com.sample.mendianbagnshou;

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

import org.apache.bcel.generic.NEW;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import com.request.HttpRequest;

public class Msg_uncountSample implements JavaSamplerClient {
	
	static List list =new ArrayList();
	static int count=0;
	static{    
		list.add("87ff1ad0281a619ce6060606572c10f6");
		list.add("c0c74d8097b877002bec71cee30b0706");
		list.add("891477c02e312b7f765eae7935628942");
		list.add("6a31ca707334a6ec1c67c9781b3af4c7");
		list.add("a6435ea9e74e7baab4e475332d848363");
		list.add("849fa6f581ae3564a5bc19a4cef879fd");
		list.add("5531c72230ae7c957f9d1e0e3761c1d4");
		list.add("bbba4f92fcaaa1fd3667c19867fd8c7c");
		list.add("555bb0e9ffb490cc65126542f7c38a86");
		list.add("7a9859f69ee41cf2da43c8f324ef3f0f");
		list.add("a5992481dc2e2264574f41add4e8b24c");
		list.add("e78cc48600f4add97ecbcc72195f9ee1");
		list.add("46371cbe28331155675b81047c91b99e");
		list.add("b20b156d1a3493aae5cc31267fdcad3d");
		list.add("4461fafc46ea6b2deac21c52fdf383b1");
		list.add("61fe6c0aa826dc1cd813944123ab85ad");
		list.add("62655632455179835fe1b4e65faa4b30");
		list.add("88760c57309ccb0886494ce8a1ff4cb3");
		list.add("6a9e9d4b4f9e22f433216f3e1768c8cd");
		list.add("8e99323c51eaac533342b972a458a862");
		list.add("082b83529bae491dda524aba0640fd2b");
		list.add("e93174a158cf9edae8841a41e82e6ebe");
		list.add("5f81fb299db28074d20fbb3743a0a8e2");
		list.add("ed988c24513ee5d81caca3fb37ccb55f");
		list.add("b02eadfe596b978d093b6d4160b52b06");
		list.add("444b1db74db6d608dd8bf30b8c8dc67a");
		list.add("7b0e8759df8ead07c26e90ead56b4f3e");
		list.add("165394cb3292a65204e856092d7f0769");
		list.add("8c124454dc5eb060fdf91d70ec352dc0");
		list.add("faf6345b534474396e58e291137dde45");
		list.add("ff9df32afb2e65ef2002874383bea0b7");
		list.add("d99eb255b6c900b8c05cbb0a2f940f4e");
		list.add("5ebc64fd2c57d04b1dba821ef97d9e9d");
		list.add("77c76fb47524e4d10adc5764157fae2b");
		list.add("ba9681d3dd9c49fa55d2d97713082310");
		list.add("62c699d39f67c95229097db28a631351");
		list.add("e97f2647d3ed37769a6cd33aedd6e87d");
		list.add("8620eae68cdc51a9fee838c65826acee");
		list.add("c38e9353d11c96ffb8d482ea5301e2cb");
		list.add("d2a449c024db224d64d63f0a2ea01645");
		list.add("5631706c2335aca85042870555a9e475");
		list.add("26a8a93964b76d3a8aa83cab5a6ef839");
		list.add("0cc17ec41b68f2a0cf8e8c10f7190909");
		list.add("acfa245c4c08371dab79436bb3a5dff6");
		list.add("86d669ccedfd9dd7052357aa359a1f28");
		list.add("e65a3103fafaed78d21725fb2f268e67");
		list.add("504a043d8b8bac2791c28c91fed8a40f");
		list.add("bfac66f1550f0f26ab0f699c0527c6bc");
		list.add("827a551c89a9bdc9e29a95bc48fb4e05");
		list.add("19cf103c7b92d62928cc57ac116f67bd");
		list.add("699ccc5cab4073fd9deadba0c71489b1");
		list.add("f5371a547d1bbcad537befb64e11891f");
		list.add("edd8b142b3448c512e22410e9cf56833");
		list.add("5cb7189f7f648ee940404794bb4d822e");
		list.add("9858a62208e0c1d3e20f449fe9316709");
		list.add("e1d2deed1ff7262aafde14de1835514e");
		list.add("4ab658700a12c7968a730c1b01bdc97d");
		list.add("5e45f3aff9f9f99536c4615218817924");
		list.add("3ee6e939f36a828d7093883cbbde7fa0");
		list.add("a11f433335c691a4ccab67516121c2e4");
		list.add("5e83a29ff5baa4e7ae310087ab8c80f5");
		list.add("2aff644f7b897968a88732af9bf8e8c5");
		list.add("c863e0ba1cc140fde60dc992e51e22a3");
		list.add("3e360be30f971f605fc3cb6f3fd12a08");
		list.add("579011fa0c7d119720592c76a63305e7");
		list.add("56bf0b7ac1158ba55404c3e83e461838");
		list.add("2516de6f3992d4802b6e55bd90298618");
		list.add("173c5884c3081445a4b811e5351eaafb");
		list.add("4876eed5df8baa385978f458a46ecfc2");
		list.add("57839614f2da9c0e35236e6e6cae8d3a");
		list.add("abadc9d83ec35f3375ec72eb74104f48");
		list.add("a6a8d437eedbef04c0ec47dc9640e2ee");
		list.add("6a73946b10932a6ea9195b01132ab57d");
		list.add("4eb50bd5907f474447d4e03d45fb54eb");
		list.add("e5883ec974de0dee627aad6faeba8939");
		list.add("0740d53c523520512f5c2f38cfd9839a");
		list.add("62847f77338b336811fcbaee946762e5");
		list.add("3021fe6b6fcf7af2fc46e81cc0545b2f");
		list.add("965047433b430f18dd5bf3347ae57ed4");
		list.add("dc5d6b90ff1c1b54eff600f4b08f7d37");
		list.add("8b225d96034fa1113212ff30dae15f91");
		list.add("941f190373ba260e717d9db1f3658f86");
		list.add("28ab7e183ad01c9add2c00c5f6599190");
		list.add("c901d8dcfcdaf1eb16b63efd2628cc16");
		list.add("312b18bbfdc4d8f5e008c02ef602f3c5");
		list.add("30ef87a6b7ec25691910bfefe3291cea");
		list.add("d5798c134d781e526d9c40c29bb482f5");
		list.add("8b0f0bcc82e947feabd550bac4a42d77");
		list.add("79e019f20e27a4ef8ea2f3e0d1e17f24");
		list.add("d3dc9c80f2a79c8f7e274a596892fce5");
		list.add("f4985aae7b4b0abc116cc852fe9b9a95");
		list.add("6822236d1305d2ed364d9aef4ba7cf78");
		list.add("f690732af5e42b2cbd5546190c2c7026");
		list.add("45f120c2d2685d5ed2c1cfa6fc5418a7");
		list.add("ed708ab0c76bf3fb85edb9a0aeaf496c");
		list.add("c8a93bed3466a5a5b9eb65857ee31081");
		list.add("a49e615839d270c5b4f5242fd2669956");
		list.add("734ac1b8142588f65be9771a3a17f50a");
		list.add("b91fca8b4d01901a9074bbeb72e2e73b");
		list.add("606c0e727289dc9bf41510c9d4b5c37d");
		list.add("23ebced539c55c7234198168810341e3");
		list.add("2ed9aed9a631c865eefc4c2d2656f359");
		list.add("c4e70adb7b299fdfd17116c534862035");
		list.add("b56823ea66d1a4286937f7fe12a1fdd7");
		list.add("372b8e3dbe1b7a918e2954dc11f5604d");
		list.add("5dcaa3bee205b9d533bba16c25a128f8");
		list.add("c9d20e8a57a15a6d9b13d761e8c197ab");
		
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
		
		
	    //通知消息未读数
  		Map mapmsg_uncount =new HashMap<>();
  		
  		Map mapmsg_uncount_data =new HashMap<>();
  		mapmsg_uncount_data.put("client_type", "android");
  		mapmsg_uncount.put("data", mapmsg_uncount_data);
  		
  		Map mapmsg_uncount_head =new HashMap<>();
  		mapmsg_uncount_head.put("token", token);
  		mapmsg_uncount.put("head", mapmsg_uncount_head);
	  		
  		
		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/chain_msg/msg_uncount", "通知消息未读数", "POST").run(mapmsg_uncount);
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
