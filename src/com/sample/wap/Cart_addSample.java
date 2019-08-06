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
 * @date 2019/1/8 - 下午 2:15
 */
public class Cart_addSample implements JavaSamplerClient {

    static List tokenlist =new ArrayList();
    static List goodslist= new ArrayList();
    static  int goods_idcount = 0;
    static int count=0;
    static  int q = 0;
    static{
        tokenlist.add("0000248f5ca64d7d871af2a74a8fd544");
        tokenlist.add("00005c0085361434abe338002f2ae538");
        tokenlist.add("00008c2ea8d6e9be7f604db973bac12f");
        tokenlist.add("0000a17959db3c79f5b7265e0ec3f0ca");
        tokenlist.add("0000b1675efeadc1e088e61b60644e31");
        tokenlist.add("0000bfec6f8220e6ca43522186ee38ea");
        tokenlist.add("0000c38f241a3c84562ebd35c4909986");
        tokenlist.add("0000d14b197b8c1379f2e6542f76539c");
        tokenlist.add("0000df98d3cf8c4a445ddcc095cfbc31");
        tokenlist.add("0000f63d37163c8ea97f99ee7aa3bffa");
        tokenlist.add("0000fa0e3546ee4d1a6b5dc0adf17128");
        tokenlist.add("000100f5db8b53cefbc38cada94b0fbc");
        tokenlist.add("000113f34fd8f888624baf753722011b");
        tokenlist.add("00011f886790c648a1150d1d45383f7e");
        tokenlist.add("00014e55c57b0c9a33b88ec1e905ad1f");
        tokenlist.add("0001b5704dda7855a98ced9f66447f54");
        tokenlist.add("0001bba4414eab3f3ce9d96f9e1b4147");
        tokenlist.add("0001d04b1c054e48670db096c1dedc98");
        tokenlist.add("0001d920e469889f6f9fa7502d2b30cd");
        tokenlist.add("0001ebaac2a011fa83692bda80dfea8f");
        tokenlist.add("00020201613b7307bb93aa34a93db4b8");
        tokenlist.add("00022f87f96efc5ea2d3db5c409ec226");
        tokenlist.add("00024d2fb0d6df58a8487f5f2e6d0b40");
        tokenlist.add("00026d4d2774f43fa8dc61df591b7053");
        tokenlist.add("000273a53e46fd6980a917d81ce21a90");
        tokenlist.add("0002c0bf1b5be59bc17d44eff909ad35");
        tokenlist.add("0002c6cc8287ebb855f4550feb9845c8");
        tokenlist.add("0002c8d22d0c1ab9590fe960631b9184");
        tokenlist.add("0002c8f1279b981fc048f874b07b804f");
        tokenlist.add("0002da0a1d977ed01b37f3c3c2ff0b34");
        tokenlist.add("0002e99a7220cf2535eabded7ec5efc4");
        tokenlist.add("0002f0d6f068480322b9067ee36d95f9");
        tokenlist.add("000323b65e4d10d5d1bec9830f9ae4fe");
        tokenlist.add("0003459b96846cfb0c8f58f9716fe617");
        tokenlist.add("000346fb82a694d9b6c3d61e7711322e");
        tokenlist.add("00034f97f8116cc7820621a0e5dbe7c0");
        tokenlist.add("000351d6b9c9a588568b539ead1e0efe");
        tokenlist.add("00035fb57729bfe6ae0a674c39497163");
        tokenlist.add("00036e5e892907984e0ce60444977a24");
        tokenlist.add("00037274a5e6e79d075cd5f73a409f79");
        tokenlist.add("000378bb9430e48091257c05fb6c87a2");
        tokenlist.add("000384cba155b37703d10710592ef0e3");
        tokenlist.add("00038a46970781a9cd6ddc898ad75023");
        tokenlist.add("0003922d0d1ff023b65c885aed0e1a84");
        tokenlist.add("00039a2d44a77ad68299815218f42296");
        tokenlist.add("0003a81f2099d512e457bf39d113889d");
        tokenlist.add("0003c2fb250555b5b74b414f0acbd159");
        tokenlist.add("0003f535f50d6ab5196403d1b5022573");
        tokenlist.add("000409ec658e2ced250eb025d2afa220");
        tokenlist.add("00040d78c87b4cbcd42bb528f57792dc");
        tokenlist.add("00040e7c685796cb4b3b2e114e32aa50");
        tokenlist.add("00041af65fd321d4b1140438e58dbe04");
        tokenlist.add("00042d24f6f55b605a5bee0ea999f2c7");
        tokenlist.add("000446699e659c4494d9f93e6c677af0");
        tokenlist.add("000448394ea74fc1185329658da28425");
        tokenlist.add("00044caaacadc8c6137b1b1438a53f1c");
        tokenlist.add("00046bfa1f844eccdb748a4b1d3bf9be");
        tokenlist.add("0004c62e58e03f238d01942292b75ece");
        tokenlist.add("0004deab24796e957506f212a0e41ca8");
        tokenlist.add("0005108aa7c5186146afcf0339ffd8a6");
        tokenlist.add("0005245bd476c222943f70a78a7464ce");
        tokenlist.add("00052f1401bcc2c75cdca9f3f6efdacd");
        tokenlist.add("000567f34a3c49e26655c407006913af");
        tokenlist.add("00057273202746438e9aab2b8e8a3013");
        tokenlist.add("00057cd0b03cde65629d5a6acabd392e");
        tokenlist.add("00059999b648b5ba111f89114e7e9868");
        tokenlist.add("0005ce85c80ca775bf0e88dd45e6ff2c");
        tokenlist.add("0005f7d1e017b9001ea4bc0e69096b19");
        tokenlist.add("0005f80dd04774fbafa47beae21c48a3");
        tokenlist.add("000614e6eef82f3361cffc28cc40f6ee");
        tokenlist.add("0006243d60b2338adbba847f2c881cc2");
        tokenlist.add("0006400d76a6d8f4db43a51278a6b47b");
        tokenlist.add("000642a58ca135c75db45514430c1e90");
        tokenlist.add("000663e1aa979756f60636dfb57e1e5b");
        tokenlist.add("0006737e96ebe4a6c13e5dbcc3bb2a2e");
        tokenlist.add("000679af64d6841a3507c8e852396e2f");
        tokenlist.add("00067a160827e27dad231188892e60a1");
        tokenlist.add("00068020b79c188c474e1528c437fbea");
        tokenlist.add("00069fb4b7e0b986f9db83590aeb2df7");
        tokenlist.add("0006a560f9203da87d86fc9e467d65b9");
        tokenlist.add("0006cd947695325ab00895ee7d1867d3");
        tokenlist.add("0006ec119fdf808bf8fbf90fba5d7468");
        tokenlist.add("0006f72754a4f5a6467f68ddd134ae53");
        tokenlist.add("0006f7901aca1bb7499f1d4ec2966395");
        tokenlist.add("0007033460487d6b1fa2c5b9d7e50582");
        tokenlist.add("0007055e4629143299612296605872e2");
        tokenlist.add("000720cbfd8da47d5ad1a2109245f1f9");
        tokenlist.add("000728fab1cc86e7aed687d3fe9d3b06");
        tokenlist.add("00072aa026e4bdc763ccc4b8675565e4");
        tokenlist.add("00073dc667f7a223b9d7d17c901e69a4");
        tokenlist.add("000748c47a72d3ae39fbb70735fcdeef");
        tokenlist.add("000749bd1e99b7d77a6c552e996e465d");
        tokenlist.add("000749e2b23a4bb8f026d375530236d1");
        tokenlist.add("00077cd18883007ac20aa49bd5951be0");
        tokenlist.add("0007c8c0ca24151b68274ff81e78436c");
        tokenlist.add("0007cee6c7713399cb5406546157fc38");
        tokenlist.add("0007d2a2d890a9e81609afd5d4031f84");
        tokenlist.add("0007ef4abdedfd7da3c667d4e1efdef3");
        tokenlist.add("0007fe84b3626d0035dc336d649b3f8e");
        tokenlist.add("000800eca3e8e82808b22615b9019828");


        count=tokenlist.size();
        goodslist.add("100021");
        goodslist.add("100023");
        goodslist.add("100024");
        goodslist.add("100025");
        goodslist.add("100026");
        goodslist.add("100027");
        goodslist.add("100028");
        goodslist.add("100029");
        goodslist.add("100030");
        goodslist.add("100031");
        goodslist.add("100032");
        goodslist.add("100033");
        goodslist.add("100034");
        goodslist.add("100035");
        goodslist.add("100036");
        goodslist.add("100037");
        goodslist.add("100038");
        goodslist.add("100039");
        goodslist.add("100040");
        goodslist.add("100041");
        goodslist.add("100042");







        goods_idcount=goodslist.size();



    }

    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        int q =(int)(Math.random()*count);
        String key =(String) tokenlist.get(q);
        int goods =(int)(Math.random()*count);
        String goods_id =(String) goodslist.get(goods);

        Map map_data=new HashMap<>();
        map_data.put("data", "key="+key+"&goods_id="+goods_id+"&quantity="+q);
//        System.out.println("key="+key+"&goods_id="+goods_id+"&quantity="+q);
        try {
            SampleResult sampleResult=new HttpRequest2("/mobile/index.php?act=member_cart&op=cart_add", "添加购物车", "POST").run(map_data);
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
//
//    public static void main(String[] args) {
//        for (int i = 0; i < tokenlist.size(); i++) {
//            SampleResult sampleResult =new Cart_addSample().runTest(null);
//            System.out.println(new String(sampleResult.getResponseData()));
//
//        }
//    }
}
