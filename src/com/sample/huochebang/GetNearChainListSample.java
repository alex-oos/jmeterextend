
package com.sample.huochebang;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import com.request.HuoCheBangHttpRequest;

public class GetNearChainListSample implements JavaSamplerClient {
	
	static List list =new ArrayList();
	static int count=0;
	static{
		list.add("a183500cc79c24ec41a5cd5b0c702c34");
		list.add("d80141c095dbd45c08ded8d602614965");
		list.add("10b6088b5892eee6ad23c22189bd569a");
		list.add("d9a8a8ce327fcb6d24b646d2ad58699a");
		list.add("8a04fce81b80235e497396004bcc9eca");
		list.add("9a87a560b3cf7d7f3015318731ef5d52");
		list.add("3669e5977e27927c88e389a8b471b4f7");
		list.add("032589c35ba117f0186dfcad8a2c38c9");
		list.add("50b65f9a2453ac1a4e867cd49ecef164");
		list.add("a2d65cd4ffa7978fc989ac0c30aeb5ca");
		list.add("5e5615e93d1d523c94164c34823a8907");
		list.add("d6dcd496b3c87575f7f0e78e90effd22");
		list.add("fd0782e9dae24921d98c47b05724e585");
		list.add("40e77fcad25ec9b7faf34372fb47d63e");
		list.add("ec963d13f07ca1c7951e3782456e9955");
		list.add("7740da76768492405372c8cc1563214c");
		list.add("bfb605554fdb22227acb426003a7ecdf");
		list.add("1bce877513bd9cfc15d52d5741093d9b");
		list.add("fc673dc3fa4947dd531a6b008579c275");
		list.add("1fa20074bb104c9770cd14923f837d7d");
		list.add("c44c91cc14e35b107f6df59200d87f8b");
		list.add("065119bd84c1c3de1cb081c41ba61e13");
		list.add("e532c5da72cefa792ac1709ec42da033");
		list.add("4b5ceca1dc992a4a838254a680a24064");
		list.add("50789f994d8a5dc671945be6bd805cd1");
		list.add("b15d41124eda79e72acbc6831ec6231d");
		list.add("c3a9648136c618cf5d71a57bc47b67aa");
		list.add("74e536d0b0d62cc1de9c8356e0bdb4e2");
		list.add("70bb96ce0958fddabf7030809aa085f2");
		list.add("144d317a300f288098997da3904500da");
		list.add("82bdaf3829602e144f9c5f3f32b2b063");
		list.add("52fa017ea078404d94d2dc781187436c");
		list.add("2daa834fe51454cb63f91eb422424084");
		list.add("80619f6f64d4f580b73bc4c6cbcf59ba");
		list.add("a4d2c6fe123af524933f60d97e411bb8");
		list.add("a7079d7eb04e8a12b34425e24b9738e1");
		list.add("f83f24dfbd24b0ba2319db0ac69f3b2b");
		list.add("0638599c8ae54b5085fce1a98e8d703d");
		list.add("19588120ef76216a60e6eed761ca3529");
		list.add("454dcd8a32a2279099b0720592dbf530");
		list.add("a7f50c164a613ad6893bcedfd988da9e");
		list.add("2ee0315c6ef996521209c90729afaae5");
		list.add("ef8cd3803b199938719133ef9a60adf5");
		list.add("7c50fd33f73eac1b5c4c02f59c3d4167");
		list.add("e6df1c827f729e8988def6370dc02101");
		list.add("597245057539a52f58659626d6756c6c");
		list.add("22423c458bb0f5149945640d9be075cc");
		list.add("87af3ae075841f63bd62a3ad6bec6090");
		list.add("6a1e4dea13d5efaabc33f70f910a600a");
		list.add("3d4e6728d9ad2ebd2d9bd2e1d55a2f63");
		list.add("ca093ae0c5dc2bcd3506861b0a5fdce7");
		list.add("be7b719904e7644375a9398f42a265b0");
		list.add("4d0554936d842811e8f6301b26b60d17");
		list.add("d14ee08946b1bf545b601f7de0bc2272");
		list.add("5b1d0a6113cb5079d560c2fa53ff29e6");
		list.add("c23b8f77c3b8157b10c537522b93346a");
		list.add("fcd7b24419564d76700798727b931a05");
		list.add("b1858c98b3d5e7abe558a72e34232064");
		list.add("e61b58089cafbdb6c61d7d0eced304e9");
		list.add("4a11c5b4b5f33fe321fe4aee5600fd67");
		list.add("0611193d050a19dce524145663b7c317");
		list.add("ef9e2793705ed9aa52af05d32459d05f");
		list.add("0f8e7f23e4e86599b667cb1d806733c2");
		list.add("f0d99754f27fd3fdf2df98ecc83ec84e");
		list.add("677772ebdca0f572bf188b0926e00f80");
		list.add("0530ebb9ae8c19ef6578068c0ef13604");
		list.add("6b44efcfb864824995f1f4cb53077f16");
		list.add("12bbd92fc93eabf970042422b2380006");
		list.add("fa56744fdd3a5a47e724b8bc2b310dbf");
		list.add("a812ebbf7b6e6441cf9039909269f9fb");
		list.add("0eec92f899efe7c7c3e5a8fc438b54db");
		list.add("94329a0d88b145baec3e0adce6389f16");
		list.add("90746508dc52a5ef1e69027c95124614");
		list.add("68ba9cbfb33655e37fed19e77f3fb6fb");
		list.add("8ce09c3fd5d7a45c054922a6527a97bc");
		list.add("d9fb955ba19c8570f5f41b6ac40983fe");
		list.add("dff3e87fb1c02e0430515b8dc2899659");
		list.add("e011a179f7a2f2fc723d5c9e6510579a");
		list.add("43ef0de8155ea95f23b4a8173df2e8ae");
		list.add("7da69c8d5b5679e2a739cbf84d2ecf63");
		list.add("2c25d0ecd340b813d5bff00de7856b71");
		list.add("79e6289746216c1c84690479213fca1a");
		list.add("4ccbf33566d6df332d1a0f33827ccf87");
		list.add("18de0bcc00692a4a53e887ca043db4fa");
		list.add("5829ce0e58dc688f9a473910b26b3de0");
		list.add("cec44bc708e3d85997d9cf6ff6bb7d84");
		list.add("a8e9a53a46e19dbb2426bcb97a490f15");
		list.add("ce65eaa0f99ae7a745d181f38c8768ef");
		list.add("a9585de9faf2b304ba93ff1bec1deb31");
		list.add("7258b3ef9fcccaf39125920c6263014b");
		list.add("3fe22d9c63759fdd4f76eaba9e326fa4");
		list.add("17fd414e865eef2d361d2794f4afe456");
		list.add("c5a4082815f86ad1de9964a23dad3a3e");
		list.add("91ca8763228041fc987036d9927865a7");
		list.add("30e0696004906bb835ca548e41b16ae3");
		list.add("6369067dfff3e16d25863a727de0040c");
		list.add("d63c4a4e7ecf9780f2d6b34ba14fbd89");
		list.add("3a40d3a16075903e4b40b24cacc2ce42");
		list.add("8027b069563d0c9840da71b6a54ab291");
		list.add("902738a4e66ec88afec92a769708f490");
		
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
	    
	    
		
		Map map =new HashMap<>();
		
		Map map_data =new HashMap<>();
	
		
		//map_data.put("key", token);
	
		map.put("data", map_data);
	
		Map map_head =new HashMap<>();
		
		//map_head.put("token", token);
		map.put("head", map_head);

		try {
			SampleResult sampleResultsub= new HuoCheBangHttpRequest("/manbang/index.php?act=Chainnew&op=getNearChainList&lat=40.051941&lng=116.363025&page=1&pageCount=12&field=chain_location&key="+token, "获取附近的门店列表", "GET").run(map);
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
	public static void main(String[] args) {
		SampleResult sampleResult=new GetNearChainListSample().runTest(null);
		System.out.println(sampleResult.getTime()+"ms");
		System.out.println(sampleResult.getSamplerData());
		System.out.println(new String(sampleResult.getResponseData()));
	}
}
