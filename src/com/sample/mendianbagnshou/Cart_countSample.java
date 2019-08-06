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

public class Cart_countSample implements JavaSamplerClient {
	public static void main(String[] args) {
		Map mapcart_count =new HashMap<>();
		
		Map mapcart_count_data =new HashMap<>();
		mapcart_count_data.put("client_type", "android");
		mapcart_count.put("data", mapcart_count_data);
		//int q=(int) (Math.random()*count);
	   // String token =(String) list.get(q); 
		Map mapcart_count_head =new HashMap<>();
		//ce7ae29bf2af2ea6a9b3c551d2d32ee7
		mapcart_count_head.put("token", "1cdcb595bd307ba55eab2ceba39f9757");
		mapcart_count.put("head", mapcart_count_head);

		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_cart/cart_count", "购物车数量", "POST").run(mapcart_count);
			System.out.println(new String(sampleResultsub.getResponseData()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static List list =new ArrayList();
	static int count=0;
	static{
		list.add("ae0f71a33c46a564f72bdd62daa5d866");
		list.add("1d12e0203b454fa734ac01b294b27415");
		list.add("cdba59a9e57f1e46729b83b4893841c7");
		list.add("977258b44059077bda3183d8adb98fde");
		list.add("cc1faab80230f265d2dcf83f26f701f3");
		list.add("101452ea3323f049d9636e2fdcb0ce5e");
		list.add("47c80c006275f8f1147c62feb516d81f");
		list.add("bd82d04d765f2fb5be348a58fe05fda9");
		list.add("23533dbd27a5e5d4baec81260e28cc12");
		list.add("618a6c9aa1c2260c9460d00aaf5e7a36");
		list.add("cffa1699b6f35463751e2ce72bd7401b");
		list.add("c9893f39b6c24b6b60aaa4aac6e54d16");
		list.add("b9ce5a16b5bb2bdfbe3e5431cb7ab9d3");
		list.add("79278ebad84e45c0dbe966ead6fad168");
		list.add("d36c8503dc2116dae56f210aaecd6783");
		list.add("ba0ce5be11bec86910de65d2625fb74d");
		list.add("3cfa4a5984e3799f3d6f20df774d267c");
		list.add("5cd180bd3fb917cd08b6649b18434b41");
		list.add("cea6b09b76aa3bbb68b81f0239f1a2ed");
		list.add("e3d1d68a10956d1340ae2dd33399f146");
		list.add("3812e05233521db534bea627c9bc9089");
		list.add("12bf606220915291eaab06bea2cd7391");
		list.add("148aade2a16037fdde32c915fc79ef09");
		list.add("45ae184fcfeb8741310ab95582d9662d");
		list.add("d02880bb8168c6f7903454167eb5a964");
		list.add("ea3488408e98f82325ae670bf2fd217b");
		list.add("3ccee032056e4122dd39efb773ab4439");
		list.add("db772f740dfa2c4c7855ca61e1450a05");
		list.add("c29baba65fdb71e6936b2c680e9154d4");
		list.add("db1f167cecfe93d887ae25c0cd49c4fc");
		list.add("431ee66a532f885b644bbbb6a4aaf8d8");
		list.add("fe0b8a6b9c5b3fab609d88d2707162c9");
		list.add("740a05f4bf95b07e859dea906e2659e2");
		list.add("be50cfebdec1345613e941818182cdd5");
		list.add("8ba59613ea1a756b9150717d9d4b11ed");
		list.add("d649d1e0dd952049ff486cd0df0cc098");
		list.add("c670032a8061f6b5c2cf786b101ef893");
		list.add("727283dca0ce5bb7ca1eb542ce383b20");
		list.add("1ea5c958d54a32ca8ee985a6b16b5d69");
		list.add("58d822ec05818fa6d07c98522d5f2279");
		list.add("1e6a0864ef339ff550f0c6ae0a75343f");
		list.add("cde1ef8f7658ba5fce1236c28e697237");
		list.add("098c124cb04af2cbfc888f40314215f8");
		list.add("9263faaf26e7d05ea1fcbec9ca1e2c28");
		list.add("b005b0d7872ab78b995b2a472288fcff");
		list.add("93a01ecbe833ac2b18d1e5e53253ffe3");
		list.add("5676c509f433be347ec3380e103f6a1f");
		list.add("a5c696d887567f10a39e388fc61a4427");
		list.add("d1afd0debec4e3cd4729e5b475f8c614");
		list.add("e433f6bb57abf6d8cfdba0dd5302212c");
		list.add("1b17cf51f2bb12efae1216512c32e260");
		list.add("84f62356e947e2c3bb257defbbba083b");
		list.add("918d941b13f17112d93fdda148899824");
		list.add("5f374e96b1b8b7c8f079f429364e7ed2");
		list.add("7cf56357a28b4b99dedf4aa74c148832");
		list.add("4f12f380e9e284993c71697332a26a2c");
		list.add("ad19e42a0fa016aa2329836cda694dc8");
		list.add("5a87c65b618a4fdc9895e900bcb325c5");
		list.add("64bae45c42d48065fa04e1a9005e46d4");
		list.add("e203f8e907d54f723939be955e01fc8e");
		list.add("deceff366b154933375e3b7bc805e913");
		list.add("ee8b56f155547fcf9f27ba4265f50216");
		list.add("632e04add842d43d62d625d1abb51df6");
		list.add("964557bf31c08083d6415b90a361cb55");
		list.add("9329ec07395d2fe73c5172043ce79ed2");
		list.add("931c1f4c17fffa591c05accf190225f6");
		list.add("0400cc894039cd76e95d9cfa15dc50c4");
		list.add("586add2bedf78b8ef7a3dee1abfd67c2");
		list.add("df4f32b97339bbc6781c8ce5425b7e64");
		list.add("3c49ac0dcc432b5c319329cbee822792");
		list.add("56f326f8b588900c40febdf2b45f2d1b");
		list.add("92b3b2dceacdcd5a02e31f573b76323f");
		list.add("6c01a4bac66666d364405f7291e5fa12");
		list.add("7cf70949b9562d70fde9118673ecff4a");
		list.add("63e172fc21768fe339b2e074a7d9fac6");
		list.add("320b7fcd649d47bb75b431f5ca4adba3");
		list.add("690fbf378819bcf66c32b99fed664b98");
		list.add("38b0050c5a538726f72eaf5595571e2e");
		list.add("9313699ab45eb66721d792bc1cd84eb2");
		list.add("54b7abac0c62a9b9e46aa41a4eb6cf28");
		list.add("da4281cd0840095949f801c322a4d440");
		list.add("075c225ab7caa98041cee67ed40fe66a");
		list.add("33d9117aa0c3f53184ddefef4e66b4e1");
		list.add("230881e51ad66001b7bb0f7e56fdf49e");
		list.add("36c30a259019979a83af5aa17d175d22");
		list.add("b839c0932c178a3c7ebd98e8284a6e70");
		list.add("aa5d9d2c5ef595378a0065891dec9fe3");
		list.add("63223c12f213e466e10c44c004d7938d");
		list.add("28cdd132e8e99a20fee825e4667045af");
		list.add("f6262be2fac520125c9504b1694390e8");
		list.add("6fa7d732b2d24f7072ed757301fec9cc");
		list.add("50a947e047adc8bbc6ab7289ee71c3be");
		list.add("fca8255407aa8e2f80a8fe04d289dd95");
		list.add("6a184f5906ca2eff923f8c70f300c62b");
		list.add("49e9bd2e32fec8ee9aa3b8d4098016f6");
		list.add("c9b362602e38fbab2215398db057c58a");
		list.add("4878b2a1cf33df5641237078fe4be851");
		list.add("64623e75be5cda43274a8dd73745572e");
	
		
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
		//购物车数量
		Map mapcart_count =new HashMap<>();
		
		Map mapcart_count_data =new HashMap<>();
		mapcart_count_data.put("client_type", "android");
		mapcart_count.put("data", mapcart_count_data);
	
		Map mapcart_count_head =new HashMap<>();
		//ce7ae29bf2af2ea6a9b3c551d2d32ee7
		mapcart_count_head.put("token", token);
		mapcart_count.put("head", mapcart_count_head);

		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_cart/cart_count", "购物车数量", "POST").run(mapcart_count);
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
