package com.sample.wap;

import com.request.HttpRequest2;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lijiang
 * @date 2019/1/8 - 下午 2:19
 */
public class Buy_step1Sample implements JavaSamplerClient {

    static List tokenlist =new ArrayList();
    static List goodslist= new ArrayList();
    static  int goods_idcount = 0;
    static int count=0;
//    static  int q =0;
    static{
        tokenlist.add("dc9bd4b0bd6dbecf080489f1d10737dd");
        tokenlist.add("214c34e10cee31f65db63ee5ca1eb503");
        tokenlist.add("b11424123cf47f5fd6b88d2d1482c85f");
        tokenlist.add("793a9eaafa47e985d74815f5b7c78c35");
        tokenlist.add("2123260615dcd13d1eb359adb5a85e6a");
        tokenlist.add("bcc1b8dbbcb55cfcba63a0498295028c");
        tokenlist.add("dbe8d2810c1c40cd4cf21bde69e70120");
        tokenlist.add("5e3ffe8c5ab4b643623a65b703a89778");
        tokenlist.add("8b6989944af4a74d4663c059f1fab66c");
        tokenlist.add("8ec59ae0530b9bf53c4016f9ad385a4e");
        tokenlist.add("cf4911646364c141f7a03b4f6a4e9f02");
        tokenlist.add("5f06bcf8786e88713d0b6b14b8db07bf");
        tokenlist.add("9506349d68cdcdca57090196a6ba9ff7");
        tokenlist.add("acf5ccafc2724504200a607d9f3e9a3c");
        tokenlist.add("1f98000ce7e4a0ad177987ed9eb0309b");
        tokenlist.add("d375b917fc1eaf8f33a0928a7c45e405");
        tokenlist.add("869157d58cd4a476de00967e726908a2");
        tokenlist.add("f7fea9230f5da5f1d7d72fa15cf139de");
        tokenlist.add("69d8598c2c23a49fb5820ff12d5573d5");
        tokenlist.add("8ac236844c175e5d516edf18fbfe52b0");
        tokenlist.add("c214730d15911b6692aa0a834e667ad2");
        tokenlist.add("5817d0e7a7123bdfe5c3f258e5b37c69");
        tokenlist.add("78c9d03175f2c166fa3369398d7bd394");
        tokenlist.add("b01a84ab26acb208263a51f98d202ee8");
        tokenlist.add("88097088557dfb98367d5364b0fef4dc");
        tokenlist.add("773bcffd725d5256496b2f5f98934c3a");
        tokenlist.add("568d22e948134899fe99b451d3d417b8");
        tokenlist.add("7523a31aeff1af6eefee99b1bcc96fc7");
        tokenlist.add("60ae0ad47b51de341b84d2d9d1f45c87");
        tokenlist.add("a39df0837012d460a5585a10df487082");
        tokenlist.add("36dbdda80ca443ce9ed09971472e8c69");
        tokenlist.add("d9ab7d2252bebedccb2c030df096e8eb");
        tokenlist.add("07cb17ea25ba9fc0fed2583281977fdc");
        tokenlist.add("7b330ee654b4a704973ab061eaba56b3");
        tokenlist.add("871f6e84ea6edf37b8b617185aabd6fb");
        tokenlist.add("2a3b556adc560c7e8b55440df7aa2bf8");
        tokenlist.add("4ce5cff5738016809bd9a697dfe523ec");
        tokenlist.add("0ee2535b25716c00a06d9041b203e92b");
        tokenlist.add("43da2b2ef52d58cc932c000132e78b46");
        tokenlist.add("64b6e531ded0cc36d6ce691e4cbd5c3a");
        tokenlist.add("a3e5335cd8fe336322f4290ec3f469af");
        tokenlist.add("bb5b557844819b9b073583949cb7398d");
        tokenlist.add("04419113d095fc9b5bc303840696ba3d");
        tokenlist.add("5b5ab7fe38e69bbd3567e0fd7f17a13d");
        tokenlist.add("88058e186c1b5898c80ed2f2546e4dc9");
        tokenlist.add("4bf79741628a58702dc10f262cef3b57");
        tokenlist.add("bc05ff9bf63deab6c83529654cc96e95");
        tokenlist.add("bc05ff9bf63deab6c83529654cc96e95");
        tokenlist.add("ec5401316876c8be725589bd700dd12d");
        tokenlist.add("2b28dcea5bcc9b1fa36455d88e5aab0d");
        tokenlist.add("61f6190ab6d84edce64497f0d45cdf82");
        tokenlist.add("61f6190ab6d84edce64497f0d45cdf82");
        tokenlist.add("61f6190ab6d84edce64497f0d45cdf82");
        tokenlist.add("5d144514986f962379cba6ea6b79745c");
        tokenlist.add("5d144514986f962379cba6ea6b79745c");
        tokenlist.add("a6069cb2484e830b682979002e9c223a");
        tokenlist.add("a6069cb2484e830b682979002e9c223a");
        tokenlist.add("d19352da730da184fa3e561fa2fbc0e1");
        tokenlist.add("d1c1b85638405c1a77129b257748fe1f");
        tokenlist.add("d1c1b85638405c1a77129b257748fe1f");
        tokenlist.add("d1c1b85638405c1a77129b257748fe1f");
        tokenlist.add("4616afae3d705f06bdd59b5aa061d657");
        tokenlist.add("4616afae3d705f06bdd59b5aa061d657");
        tokenlist.add("7ba694bc8560a9d09ba89556090b6aa7");
        tokenlist.add("8496ac0287730b748faacc7c3b19ed3e");
        tokenlist.add("8496ac0287730b748faacc7c3b19ed3e");
        tokenlist.add("be85b5b918f6b0060c84ae5fcab9f017");
        tokenlist.add("be85b5b918f6b0060c84ae5fcab9f017");
        tokenlist.add("be85b5b918f6b0060c84ae5fcab9f017");
        tokenlist.add("b3cf74aac75cf208fd3fcd31e80e9ce2");
        tokenlist.add("5c59d2380ca12a1d64758664bfbbe54a");
        tokenlist.add("5c59d2380ca12a1d64758664bfbbe54a");
        tokenlist.add("5c59d2380ca12a1d64758664bfbbe54a");
        tokenlist.add("5c59d2380ca12a1d64758664bfbbe54a");
        tokenlist.add("5c59d2380ca12a1d64758664bfbbe54a");
        tokenlist.add("5c59d2380ca12a1d64758664bfbbe54a");
        tokenlist.add("dd25506ea91a48af01b13351b10c914f");
        tokenlist.add("dd25506ea91a48af01b13351b10c914f");
        tokenlist.add("86c78eb9edd11f34e9e2799ca35d33b8");
        tokenlist.add("7212980666f1510d52be2fb5f12f8580");
        tokenlist.add("f2003dd1c31f329e40b52a892ec77be0");
        tokenlist.add("11ebd11561b0c74d998da566d06f0ce9");
        tokenlist.add("99aab7b17432aa1e0d7856ae1c71f044");
        tokenlist.add("99aab7b17432aa1e0d7856ae1c71f044");
        tokenlist.add("99aab7b17432aa1e0d7856ae1c71f044");
        tokenlist.add("b712fc85abbbc892b810726c8cebbefc");
        tokenlist.add("b712fc85abbbc892b810726c8cebbefc");
        tokenlist.add("b712fc85abbbc892b810726c8cebbefc");
        tokenlist.add("2bfcbd458b808a2445c1f159812d547c");
        tokenlist.add("a6e19970cd8506f53fd90794a11bdb39");
        tokenlist.add("a6e19970cd8506f53fd90794a11bdb39");
        tokenlist.add("14f0c7d2ce30d5331cc2473068d83ec4");
        tokenlist.add("14f0c7d2ce30d5331cc2473068d83ec4");
        tokenlist.add("14f0c7d2ce30d5331cc2473068d83ec4");
        tokenlist.add("ee070dc85db2bde2a4ca40444edacfb1");
        tokenlist.add("ee070dc85db2bde2a4ca40444edacfb1");
        tokenlist.add("54e34938ccfa167d1c16dccc485ab141");
        tokenlist.add("5fdb44f8904d70da2157526067edd273");
        tokenlist.add("d5388039b980e006897fe7369883f5e9");
        tokenlist.add("d5388039b980e006897fe7369883f5e9");



        count=tokenlist.size();
        goodslist.add("70");
        goodslist.add("70");
        goodslist.add("70");
        goodslist.add("125");
        goodslist.add("144");
        goodslist.add("181");
        goodslist.add("184");
        goodslist.add("184");
        goodslist.add("184");
        goodslist.add("184");
        goodslist.add("184");
        goodslist.add("184");
        goodslist.add("184");
        goodslist.add("184");
        goodslist.add("184");
        goodslist.add("184");
        goodslist.add("184");
        goodslist.add("192");
        goodslist.add("192");
        goodslist.add("192");
        goodslist.add("192");
        goodslist.add("192");
        goodslist.add("192");
        goodslist.add("192");
        goodslist.add("192");
        goodslist.add("194");
        goodslist.add("194");
        goodslist.add("194");
        goodslist.add("194");
        goodslist.add("194");
        goodslist.add("194");
        goodslist.add("194");
        goodslist.add("272");
        goodslist.add("272");
        goodslist.add("272");
        goodslist.add("272");
        goodslist.add("272");
        goodslist.add("272");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");
        goodslist.add("336");

        goods_idcount=goodslist.size();



    }

    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        int q =(int)(Math.random()*count);

        String key =(String) tokenlist.get(q);
        String cart_id =(String) goodslist.get(q);



        Map map_data=new HashMap<>();
        map_data.put("data", "key="+key+"&cart_id="+cart_id+"|1"+
                "&ifcart=1&address_id=&contact_id=&chain_install_id=");
//        System.out.println("key="+key+"&cart_id="+cart_id +
//                "&ifcart=1&address_id=&contact_id=&chain_install_id=");
        try {
            SampleResult sampleResult=new HttpRequest2("/mobile/index.php?act=member_buy&op=buy_step1", "购物车", "POST").run(map_data);
            return sampleResult;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void teardownTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public Arguments getDefaultParameters() {
        return null;
    }

//    public static void main(String[] args) {
//        for (int i = 0; i <tokenlist.size(); i++) {
//            SampleResult sampleResult =new Buy_step1Sample().runTest(null);
//            System.out.println(new String(sampleResult.getResponseData()));
//
//        }
//    }
}
