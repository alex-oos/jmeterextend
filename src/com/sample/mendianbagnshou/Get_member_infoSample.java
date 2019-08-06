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

public class Get_member_infoSample implements JavaSamplerClient {
	
	static List list =new ArrayList();
	static int count=0;
//	static  int q = 0;
	static{

		list.add("a30a904f451352fbc422978ed514de08");
		list.add("be50cfebdec1345613e941818182cdd5");
		list.add("0ecdcd0273c9b0c1d6371e41a962ebe5");
		list.add("320b7fcd649d47bb75b431f5ca4adba3");
		list.add("19c408c4ddaae0736c976275af35f5de");
		list.add("6a184f5906ca2eff923f8c70f300c62b");
		list.add("aa5ce2d653c16b403a1585621f0024ae");
		list.add("82fbcaa3bf1a9427f558c3e9a7469e4b");
		list.add("27c73b8499e359bb402715bceaa6ac76");
		list.add("2e3be0b7db27a45fa4d7ee6da09b08a8");
		list.add("be01dfb4d2c168b3ec6e5a08274e34b0");
		list.add("39541a89bddc7b382020b0fc10d1b751");
		list.add("d715ccdb1f975d512e5a8f7546cf58b9");
		list.add("68ffe19e9b7196381ad99099844f9cb4");
		list.add("f61d046fee434a61f83f3457c0669e09");
		list.add("57a53562e60a282990a0ec99174ea388");
		list.add("5790192534e86e9d70dcd57691085797");
		list.add("ffb7a59db0297f311a6ce65096c1d33b");
		list.add("dc8bc032104fe3343925a4001ed3c511");
		list.add("49a333701f527baae0e5fe019d1859b8");
		list.add("389e49a5e8908e923c77f630304e8558");
		list.add("d48e142ca69d81d73920a95481593046");
		list.add("b8e4b1a0790d31c413c18ecd14880f6c");
		list.add("5709390d7ee22e229a9de60f8f3a97e8");
		list.add("e973f6f31b882b7ef72309347b966bd2");
		list.add("031657921c7205c9ec296a6724e80b52");
		list.add("01c58232b9b92a07e7d36f4d9626d598");
		list.add("6a04106c89c22eba0978aea83b8a0bf3");
		list.add("f1092fcc0d72d77ffe91d83aea14e725");
		list.add("e3551a75bc723b4f9b99c37beffc2706");
		list.add("fd83b440da28e6660e8588614855ef0f");
		list.add("41bac2e9b94c6de59c601a4633869472");
		list.add("f69b90448461ee5aec7d716a58d3d28a");
		list.add("b8833071f03cfffe26c8e7feff104923");
		list.add("044070c33ed022477bdd9e920a05c3a7");
		list.add("7141b36da6bc51154c41fad71810cbf4");
		list.add("5e56c6279006e403a67146655daf411d");
		list.add("43bc71cbdb067f47caf9680d5d206ab0");
		list.add("05981bfda48deebbb3a004f6a0f3766d");
		list.add("f0c1cd78c9f8b18e1656562c0cc3e5f5");
		list.add("8caf8e900ee397d94437618b12a16f5c");
		list.add("046535726c826f101a0ed9ed9bd0e6b1");
		list.add("e18b04ebd86c9814edfd2facf0a5c82f");
		list.add("f972e8fb1391ceab0a8e190696152ac9");
		list.add("1e5db2f76e21dc9034bdcfd6b2816fbc");
		list.add("3e2571f3c5b9e323565ff75f5df3ccd0");
		list.add("fd2b0a93942f225f275e9f0fb0ccf005");
		list.add("8a1d6702e15d2a6aedd29d3cd4a0ca05");
		list.add("7aa87910bff2bc277990014addba468b");
		list.add("23b4e480651d0645e7700710b885ac7f");
		list.add("2a3ac08397206d7f4d514713675d63bc");
		list.add("1c5681358a3c85783366ebbad762aee3");
		list.add("58885ee508764d6b1a4e546fb9319e91");
		list.add("e659f08348359a5a4fd123a512bae09e");
		list.add("1eb68032202c9df2e7040c5e883b9df8");
		list.add("a9c5055a74bf287c5fcd12a4c7110b87");
		list.add("00188959e12d7c70f7bb78369798efed");
		list.add("fc47586dcf91284bd2da3ae4c856bb4e");
		list.add("b2050b63c8dd27e34432a101839fb6c0");
		list.add("27b435b2548333b334076fd7120be4df");
		list.add("b846b8babed672d59ebcc0ff048d8d51");
		list.add("56a496077702db78c971e258d411545b");
		list.add("aa32f23cf1916896d0da0bce9d13e7d2");
		list.add("9c4054b3d26b6110cff7da06107c2415");
		list.add("9c475aaec341ed4e46640dd1334e065a");
		list.add("2333f95f72810519ba12feead117e5cd");
		list.add("b0211f27cb444d00c88c05984a756db8");
		list.add("9f32755212b48cf9ddbb4e1f1a336826");
		list.add("37920df0333a06de03aa8626db41e8be");
		list.add("4060ad289f4c2589ab4b0b5b227151a0");
		list.add("572e1cd4fdc956ed5cd8a58c9cae0981");
		list.add("ecdfe379a43f7576fc413691c9d9eb95");
		list.add("87ed9228ac9c4034a73625d90c895e72");
		list.add("b39815c27bc740ce28e1a3ba02aefe0b");
		list.add("b66cd03315e0739aee3ec7297df58b7e");
		list.add("537f75e450d4cf697114a989d7d1cb74");
		list.add("f38cb52bf2e22500da55883d36ce6ce2");
		list.add("6472c2eec73f705baeaa784fdc10beb0");
		list.add("f538586de96b5de536a8c7b3b077051d");
		list.add("874a52bc38961c845c9d3298ab57b335");
		list.add("758ce17bdd8141a09c6fc244ecae0a10");
		list.add("a1006c65ae377e3f58ae5625998bdd5b");
		list.add("4b83f01b1d043383f9227f8be66a7d88");
		list.add("c815cede5b911598a06753dabd627126");
		list.add("9b5bdd414edf8c9338131d315528dfbf");
		list.add("35198a22b1fd79e8bbd9099e86a233c1");
		list.add("f546af8290c3ea73493dc51246fe2564");
		list.add("5491d8f6219e1bc73e4a6a21b587385b");
		list.add("bcc1c6cd5f9d0308b38709666c1cd091");
		list.add("8156dd9cefb38e8a36d383a002365c92");
		list.add("74063c6d8ba5f9393dbfc3ae0cf9683a");
		list.add("a55ade4046023bef8cbca630f45d3673");
		list.add("fe092683262f082b8996471d793b8f88");
		list.add("4e790127fbf3f276b0ad627d4b426c2a");
		list.add("f89ab25ad4cc7dfe0eed9ac078c6c571");
		list.add("6881ec90a19249543271e02d44c5e404");
		list.add("3055ad34e37dbc23bb4f480af22da049");
		list.add("ae93bb481eb27ffe99a440c576037170");
		list.add("337b126d4ad37add9b2eee10ab6c61bb");
		list.add("2bf3bc766133b93b45af57ccc811ca4f");
		list.add("75c821fb11acd617e6f3a8ce8ba40ae8");
		list.add("70a9f25f5afccbaad6d59daad1cd40e2");
		list.add("1240885aa8ac361cfeaa9fae907ba8ff");
		list.add("dd92488e4ef3373030b8d57a67d5eee0");
		list.add("a77e4b99088c9565875255b108d2d11c");
		list.add("74c6297ccdca05d06d33841d362bc948");
		list.add("616845f19b0887dc58cc870e378880f8");
		list.add("9f9f7e98284ed60c2ecd63c970bb7b6e");
		list.add("f59bdb46c3b9bd0a1a8277344c400218");
		list.add("9d6b08045f7705ef0f38f87dcf15d8fd");
		list.add("ff836b469a8e3a3de4394216edee1f94");
		list.add("c72b97144586987e2ef973105716528a");
		list.add("96bbdab02cc7233e22b3924c5dd46ee7");
		list.add("278e026d51b8f7ea0405e315f98021dd");
		list.add("61d14935a7564ade834da870d75b6123");
		list.add("1d5fd529f9f4a4b9e93dcf95d5cf2c83");
		list.add("20ac4fa98067bb0c19e0751e1809ef5c");
		list.add("65a08409125ad7c943d080e9e7c0c94b");
		list.add("be6270ac591b97da218f5bd4047f465e");
		list.add("e263b07eb9c2609dc8f71292c514d820");
		list.add("a04e6d7f61f5acda8720a3717d780f56");
		list.add("7a74d3e62d102bedf325cd89e5b7389f");
		list.add("869d59841e22b9ced7b352bcd3b47cd5");
		list.add("292988918e518ba79e72664883c22b6c");
		list.add("389a46e61472cbe36c1f80f4628e806d");
		list.add("02cee288c906a777d9937ab00d309ca4");
		list.add("e6ecf7c22346b9695734d2db167d989b");
		list.add("3291d48ace47567459cdb1ed235f0890");
		list.add("f3a2a0be080ab78d570aa6a071e260d0");
		list.add("a72e4afdb62724b69c21bc47640c6968");
		list.add("81862c8d360c566df436994de0e7dab0");
		list.add("b410599570851032a74f125ab616ae65");
		list.add("f38432b7ab335735d210a03821d5e32f");
		list.add("ba1e6917a87652af0c9d9589e09340d7");
		list.add("5ff9000b39363ec5bea6bee6b3f88d53");
		list.add("344e4204f37fb5edf4135dc5942ae9a0");
		list.add("edaa74efde48a5e1c3d40471b766388b");
		list.add("e7219ed0641a13cf970def995cb90542");
		list.add("9f7e0d19162223e132028fce913249ec");
		list.add("81ae355f81f5b5fa6bc6a503e24236ae");
		list.add("edbd1a18004a9415c07950db916b1f03");
		list.add("30075d8a19891ac0506f3bacb2e5364e");
		list.add("2e95d27b5a23617fec8ccc4bb4bea401");
		list.add("56e84647232ae8ad23fbac1f28f9ec7b");
		list.add("716f4db051b2789578f70c36ddbd1632");
		list.add("32a99eef035f43d38ed42bfc2d615e83");
		list.add("895a96d3877d3095cf2d25ecbd29f63c");
		list.add("d501852bf9091152fffe2dbecd6db371");
		list.add("9676fdd735e6eba8ed8c4dc22cff4b6c");
		list.add("a85d757f63d25a5ca6f5ca1298086f19");
		list.add("d327baa76671b0826bf43804bc7141fe");
		list.add("e14b60d24a125b30cd7ef4af7a33ef9f");
		list.add("46faaef3b3664a9cc6446f5c1f0d5e4d");
		list.add("68cc38d545fb39aba3ff561f5de35d3b");
		list.add("5afae97c4aa99d0d577ee7361f8b7af8");
		list.add("036e0a06efdde6eea9b26a9cf2202c16");
		list.add("70cbe995228b9cb996c0f395bd4d3254");
		list.add("fd8722d968a87ac58a160ac680360121");
		list.add("27acbc5ac93ed0b5e609ad82f56090d0");
		list.add("3a8349e0b96c77e23a94131498bb5523");
		list.add("a4a06bca7e6f82c08424f5736f1ca679");
		list.add("abbd833e5c376ef76da42161cd79e33e");
		list.add("559d97814b85b7d5b29e08a8b02686da");
		list.add("b1b6b9f92a63ecd453e5af7b528c8dd6");
		list.add("d9563b98c1f3d44dd5322c6183402773");
		list.add("d794566c85eecb82f5abbb1b71a3a764");
		list.add("b3dff98d62937a5fbe39519c32e7cba7");
		list.add("86f94539f063151f411f7573074ea1a1");
		list.add("a7e73929325b28238ea70059eb123084");
		list.add("40077551f1926018137d2596ba126492");
		list.add("4449a415143b50ec21c92aa2fc135cd4");
		list.add("50b83e2c479f4fb850257d532ae07578");
		list.add("c621c134ed50fe768817ebefe89ee9a1");
		list.add("18804c4744f0ce63240240ce485817b4");
		list.add("f708f9c1b7fd6530932811334301262d");
		list.add("0fbb73ceb8d72a017cfda462cef642ea");
		list.add("991f38a155fa499920f76399d168898b");
		list.add("8b72f2f3b6ab0dc75388c746d5f9d635");
		list.add("8aa6dcacc15de0c775bc379e71d1d764");
		list.add("67db4974ebed17100ea4e6ab217c59a5");
		list.add("fc5d673e1c9032daf1449c43ceff917f");
		list.add("d4f69c2eb5df5546e6c9c5af70382b32");
		list.add("156e4268fabf650659c0fd8f59fd8e42");
		list.add("11e6606d36b710b5ecd1b39c672eb8f9");
		list.add("3a73d74503c46667205ca0a295947ea8");
		list.add("e82f8ea53b3f937c66db13a395c3c683");
		list.add("7f48adba5772688b59c69c6dbeb7465a");
		list.add("d82c56dcb3be31794a17a60bb243e5cc");
		list.add("ff2de6dfdeb01a5b10f8224d65a89e77");
		list.add("a111f52913c15f4d81390997d2a6a41d");
		list.add("cd20918f071a3b86a87a5878bf38d411");
		list.add("7324a8f2ee5017fc31ed8c997005c458");
		list.add("d6eb8354409db921104622fc4f856edd");
		list.add("0187b053e4c6facef4addd8ffb9a6e13");
		list.add("f2b8edde692549cdda6d7ad149670451");
		list.add("3995d3ade8d945b062135f21779b5520");
		list.add("b5b814795c862c6ee932573e203a5de5");
		list.add("c150d13489815c24622ee137a1518019");
		list.add("bedbb05bd09da13118c3a7ad8369f1ec");
	
		
		
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
//		System.out.println(token);
//	    q++;
		
		
	  		//获取会员信息
	  		Map mapget_member_info =new HashMap<>();
	  		
	  		Map mapget_member_info_data =new HashMap<>();
	  		mapget_member_info_data.put("client_type", "android");
	  		mapget_member_info.put("data", mapget_member_info_data);
	  		
	  		Map mapget_member_info_head =new HashMap<>();
	  		mapget_member_info_head.put("token", token);
	  		mapget_member_info.put("head", mapget_member_info_head);
	  		
	  		


		try {
			SampleResult sampleResultsub= new HttpRequest("/chainapi/v1/member_index/get_member_info", "获取会员信息", "POST").run(mapget_member_info);
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
//		for (int i = 0; i <list.size() ; i++) {
//			SampleResult sampleResult = new Get_member_infoSample().runTest(null);
//			System.out.println(new String(sampleResult.getResponseData()));
//
//		}
//	}

}
