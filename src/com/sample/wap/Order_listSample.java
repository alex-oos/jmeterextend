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
 * @date 2019/1/8 - 上午 11:58
 */
public class Order_listSample implements JavaSamplerClient {
    static List tokenlist =new ArrayList();
    static int count=0;
    static {
        tokenlist.add("232c1af7451579587b415191e0f24b4c");
        tokenlist.add("a30a904f451352fbc422978ed514de08");
        tokenlist.add("c1c37a52a8becf2a2a4bb73c6714ad9e");
        tokenlist.add("cc339180cd1a20fac1cee569e15dc623");
        tokenlist.add("85c087bf482a6bb53b4a0cb12a0f0e65");
        tokenlist.add("a22f39ab9efd9933c00de890558dc090");
        tokenlist.add("c8604789a424ad42cdb5aadcde1dd1d8");
        tokenlist.add("074245e74060a6b5200f186225c6c12e");
        tokenlist.add("e1d3a03e935dd67dd01c1f6f5c087205");
        tokenlist.add("b3029769f6f87e68642c928908bef8a3");
        tokenlist.add("973400fb8f4fee45b2d0f8b60ae56d59");
        tokenlist.add("09b3e7cc2cc144c209473b375f93d443");
        tokenlist.add("3aa91fa98c16651b5f903d94eeff70a5");
        tokenlist.add("fea73007d4c29d321a358c18f0dcbc74");
        tokenlist.add("f62d232525412e02c4e4fe64e1e6a0fb");
        tokenlist.add("27465f2ef005eb80682fffa792c7990c");
        tokenlist.add("b95b70f6d900c55706c66c312c7077a4");
        tokenlist.add("d66e044b01fa1402b9210b2d26fd328a");
        tokenlist.add("871ca394249fd4f0a9707b63104276ad");
        tokenlist.add("554988e63d383ca33156be732a67f21a");
        tokenlist.add("eddd0b51ae9657b721f28d300c9376af");
        tokenlist.add("c9893f39b6c24b6b60aaa4aac6e54d16");
        tokenlist.add("b9ce5a16b5bb2bdfbe3e5431cb7ab9d3");
        tokenlist.add("79278ebad84e45c0dbe966ead6fad168");
        tokenlist.add("46c576117c5cb509c72363576d9c2347");
        tokenlist.add("13212f0f0d5a3bf12e7eb78b17d97ca4");
        tokenlist.add("b64ca04e6b67c8aa9c880ed84e35e7ab");
        tokenlist.add("f34b590b40087925dbd7031f265959c7");
        tokenlist.add("ad3b5a9d893ec7ea325f458cc8483482");
        tokenlist.add("ad0f5a38481007b2c1f35745d66f94f3");
        tokenlist.add("2382e26f2b355b492a104cbc47d45240");
        tokenlist.add("ee229826fb853ca2829dc8b9e17deca5");
        tokenlist.add("680b8d5ad28a0df3f447625f20ebe96c");
        tokenlist.add("e4cc9d8b2051a66249331c6e723be966");
        tokenlist.add("75aed768ac086936f26ad62755db2c70");
        tokenlist.add("19c408c4ddaae0736c976275af35f5de");
        tokenlist.add("82fbcaa3bf1a9427f558c3e9a7469e4b");
        tokenlist.add("27c73b8499e359bb402715bceaa6ac76");
        tokenlist.add("3578f89531a19350052a34a6dcabbff6");
        tokenlist.add("048dd4eda6941372d58f61e0949fc2ba");
        tokenlist.add("9a563f7391e13ccd88b013740e7ac258");
        tokenlist.add("421b84173a50ca397774e3064762aabe");
        tokenlist.add("9c24580216b40b34b139d411b499ea89");
        tokenlist.add("fa8b1c9b5eb0636513f11acc74e3325d");
        tokenlist.add("c188f185f07fe90fe75c98dae15164ef");
        tokenlist.add("4df3d68648cdb7bf4fe7cbbefe97c311");
        tokenlist.add("cf60875a86aac766e3dc0c1281579c21");
        tokenlist.add("39541a89bddc7b382020b0fc10d1b751");
        tokenlist.add("d715ccdb1f975d512e5a8f7546cf58b9");
        tokenlist.add("69f7e9e79ad5b083e0f259bf1e4bba7e");
        tokenlist.add("c766ca5d041351b862c2e951fa8f8861");
        tokenlist.add("07973190c6b299311388d896e15717db");
        tokenlist.add("d013cdee1e38f3bb5a4f0d56fd59125b");
        tokenlist.add("2434ed9a59089507a7c57677aebf4423");
        tokenlist.add("1aa297a54af97d167d8951f75c5a997d");
        tokenlist.add("a653a0dd273a81a5537170339a224fba");
        tokenlist.add("05669293ddcb48971c75af97db683a17");
        tokenlist.add("6e10821770574a6d75b1fa43f69b8414");
        tokenlist.add("595be1bc57d877bc68e1631b293a3218");
        tokenlist.add("f37f468ab4bf3c05e3d3872d2f6f5e1e");
        tokenlist.add("f0287b10d71252bdd588eccbbfab6343");
        tokenlist.add("68ffe19e9b7196381ad99099844f9cb4");
        tokenlist.add("32ec19a6e3025e98dbb200a04322cb00");
        tokenlist.add("b824088d6bb3d918fd527e0db04fe2ad");
        tokenlist.add("3d535bd1c1761a177c64a21f382d2495");
        tokenlist.add("9e96f505ddd21e2481452cafdb047873");
        tokenlist.add("b825bf150b8c1bb945893a3a1ee2143b");
        tokenlist.add("7a3ea01e4229f17e09e3fdfd26346a85");
        tokenlist.add("7e122b9397feac973f487f22bb55c936");
        tokenlist.add("dbbe31720bccfa6f8179ba565f7def87");
        tokenlist.add("37911c4bf039ab6410f6acd57ad6b775");
        tokenlist.add("f61d046fee434a61f83f3457c0669e09");
        tokenlist.add("3d0d26b7641b30b858d079cc9a9eac70");
        tokenlist.add("e2967ee55c00c0a9e6611b6d8c624784");
        tokenlist.add("1e58f72d351bbfc4bbf24893cb0601a9");
        tokenlist.add("d6aa0a9e39bc481897cd14927938aacd");
        tokenlist.add("5790192534e86e9d70dcd57691085797");
        tokenlist.add("b60c782bcc670f96ad6838bc625c7925");
        tokenlist.add("cb8f6e334d2892529bdeaa3680585d4b");
        tokenlist.add("ffb7a59db0297f311a6ce65096c1d33b");
        tokenlist.add("4214b083264b5e4911ac4a964304db58");
        tokenlist.add("adba367ce35c8b05bf32d6ffa0186db3");
        tokenlist.add("10d6c5b0ef0ebf26f01d931ac021bf51");
        tokenlist.add("5709390d7ee22e229a9de60f8f3a97e8");
        tokenlist.add("196f82660ad8edcbda3a9dc2313302ea");
        tokenlist.add("6a15cae1e533b8ed9093453be1a14885");
        tokenlist.add("01c58232b9b92a07e7d36f4d9626d598");
        tokenlist.add("b1991f7af369c27b6c067fff4d6892af");
        tokenlist.add("f1092fcc0d72d77ffe91d83aea14e725");
        tokenlist.add("e3551a75bc723b4f9b99c37beffc2706");
        tokenlist.add("02202aa52e9812059cc0a51d5ac754b8");
        tokenlist.add("f69b90448461ee5aec7d716a58d3d28a");
        tokenlist.add("981b0930c029257037be61f74bd40b1c");
        tokenlist.add("621b89280793433cbaafe6284db5fbb3");
        tokenlist.add("044070c33ed022477bdd9e920a05c3a7");
        tokenlist.add("8b531a70cc2b3c8c4dc2b713e2fd8281");
        tokenlist.add("dca657b9794f50597cb72d3a9128889a");
        tokenlist.add("964f99d625b3d16ffdb65b7406ffb3fd");
        tokenlist.add("a01288c3417c370c93708d655426a86c");
        tokenlist.add("38e8b5883aa71aac873bd1fa3419ff7b");
    


        count = tokenlist.size();
    }
    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {

        int q =(int) (Math.random()*count);
        String key = (String) tokenlist.get(q);
//        System.out.println(q+"    "+key);
        Map map_data=new HashMap<>();
        map_data.put("data", "key="+key+"&state_type=&order_key=");
        try {
            SampleResult sampleResult=new HttpRequest2("/mobile/index.php?act=wholesale_order&op=order_list&page=10&curpage=1", "订单列表", "POST").run(map_data);
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
//            SampleResult sampleResult =new Order_listSample().runTest(null);
//            System.out.println(new String(sampleResult.getResponseData()));
//
//        }
//    }
}
