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
 * @date 2019/1/8 - 下午 2:03
 */
public class Order_infoSample implements JavaSamplerClient {
    static List tokenlist =new ArrayList();
    static int count=0;
    static  List order_id =new ArrayList();
    static  int orders_idcount = 0;
    static {
        tokenlist.add("cb956b5937740179285ff9174b8958a4");
        tokenlist.add("9450bd32e258c0cae81573c0c66b24b2");
        tokenlist.add("d17c5312e0ca11e8462a5f4268aeea14");
        tokenlist.add("6b94d20808a12e85241986d53c3f0f9a");
        tokenlist.add("c92df6ff882b3994afff0c0d433d2d94");
        tokenlist.add("167a8d01f87a99d195e4d43599e11ece");
        tokenlist.add("cc518f626581907e4e67bead0a5e53bc");
        tokenlist.add("a710a2acdd3fc1aa92140fec5979b929");
        tokenlist.add("3414c46231f70eb642beb381f707b0cf");
        tokenlist.add("1b4a5f9017b1938b0be94d852d887c37");
        tokenlist.add("a0544889ccd536e2164426488b1b7da7");
        tokenlist.add("b20817fd1885b5e74cdfc4ddb4f3f351");
        tokenlist.add("9a464b9a834284b26412b810c467c3f9");
        tokenlist.add("dd03c8b4014c268ef14d3e141e52ad7a");
        tokenlist.add("1d2e9c68011702789a5594faf0993f68");
        tokenlist.add("92fced0ab5b75065a279f0f42cf3e5bf");
        tokenlist.add("2a6d9b1df7a26c38a811462f9f32a728");
        tokenlist.add("ed94b00c18cc6f8f3ca6a22283873c0a");
        tokenlist.add("aa45a2d9a2be1d598f3b2cbac0d99110");
        tokenlist.add("23233543a515dfd64a09f3e6a6d7d787");
        tokenlist.add("4d31a8e2b179ccb8c32bbe8556d7fed2");
        tokenlist.add("94335d3b088bc688a8c6b4af44fe79a6");
        tokenlist.add("1fb68cd4562f87d91f59ea3c20b182eb");
        tokenlist.add("dd4ca9e4849b29ec371e208d6135912d");
        tokenlist.add("6dc2db3a2cc1e445c08652270f8ed2d9");
        tokenlist.add("84411e8550125b8700c00d726946b9d2");
        tokenlist.add("cb956b5937740179285ff9174b8958a4");
        tokenlist.add("9450bd32e258c0cae81573c0c66b24b2");
        tokenlist.add("d17c5312e0ca11e8462a5f4268aeea14");
        tokenlist.add("6b94d20808a12e85241986d53c3f0f9a");
        tokenlist.add("c92df6ff882b3994afff0c0d433d2d94");
        tokenlist.add("167a8d01f87a99d195e4d43599e11ece");
        tokenlist.add("cc518f626581907e4e67bead0a5e53bc");
        tokenlist.add("a710a2acdd3fc1aa92140fec5979b929");
        tokenlist.add("3414c46231f70eb642beb381f707b0cf");
        tokenlist.add("1b4a5f9017b1938b0be94d852d887c37");
        tokenlist.add("a0544889ccd536e2164426488b1b7da7");
        tokenlist.add("b20817fd1885b5e74cdfc4ddb4f3f351");
        tokenlist.add("9a464b9a834284b26412b810c467c3f9");
        tokenlist.add("dd03c8b4014c268ef14d3e141e52ad7a");
        tokenlist.add("1d2e9c68011702789a5594faf0993f68");
        tokenlist.add("92fced0ab5b75065a279f0f42cf3e5bf");
        tokenlist.add("2a6d9b1df7a26c38a811462f9f32a728");
        tokenlist.add("ed94b00c18cc6f8f3ca6a22283873c0a");
        tokenlist.add("aa45a2d9a2be1d598f3b2cbac0d99110");
        tokenlist.add("23233543a515dfd64a09f3e6a6d7d787");
        tokenlist.add("4d31a8e2b179ccb8c32bbe8556d7fed2");
        tokenlist.add("94335d3b088bc688a8c6b4af44fe79a6");
        tokenlist.add("1fb68cd4562f87d91f59ea3c20b182eb");
        tokenlist.add("dd4ca9e4849b29ec371e208d6135912d");
        tokenlist.add("6dc2db3a2cc1e445c08652270f8ed2d9");
        tokenlist.add("84411e8550125b8700c00d726946b9d2");
        tokenlist.add("cb956b5937740179285ff9174b8958a4");
        tokenlist.add("9450bd32e258c0cae81573c0c66b24b2");
        tokenlist.add("d17c5312e0ca11e8462a5f4268aeea14");
        tokenlist.add("6b94d20808a12e85241986d53c3f0f9a");
        tokenlist.add("c92df6ff882b3994afff0c0d433d2d94");
        tokenlist.add("167a8d01f87a99d195e4d43599e11ece");
        tokenlist.add("cc518f626581907e4e67bead0a5e53bc");
        tokenlist.add("a710a2acdd3fc1aa92140fec5979b929");
        tokenlist.add("3414c46231f70eb642beb381f707b0cf");
        tokenlist.add("1b4a5f9017b1938b0be94d852d887c37");
        tokenlist.add("a0544889ccd536e2164426488b1b7da7");
        tokenlist.add("b20817fd1885b5e74cdfc4ddb4f3f351");
        tokenlist.add("9a464b9a834284b26412b810c467c3f9");
        tokenlist.add("dd03c8b4014c268ef14d3e141e52ad7a");
        tokenlist.add("1d2e9c68011702789a5594faf0993f68");
        tokenlist.add("92fced0ab5b75065a279f0f42cf3e5bf");
        tokenlist.add("2a6d9b1df7a26c38a811462f9f32a728");
        tokenlist.add("ed94b00c18cc6f8f3ca6a22283873c0a");
        tokenlist.add("aa45a2d9a2be1d598f3b2cbac0d99110");
        tokenlist.add("23233543a515dfd64a09f3e6a6d7d787");
        tokenlist.add("4d31a8e2b179ccb8c32bbe8556d7fed2");
        tokenlist.add("94335d3b088bc688a8c6b4af44fe79a6");
        tokenlist.add("1fb68cd4562f87d91f59ea3c20b182eb");
        tokenlist.add("dd4ca9e4849b29ec371e208d6135912d");
        tokenlist.add("6dc2db3a2cc1e445c08652270f8ed2d9");
        tokenlist.add("84411e8550125b8700c00d726946b9d2");
        tokenlist.add("cb956b5937740179285ff9174b8958a4");
        tokenlist.add("9450bd32e258c0cae81573c0c66b24b2");
        tokenlist.add("d17c5312e0ca11e8462a5f4268aeea14");
        tokenlist.add("6b94d20808a12e85241986d53c3f0f9a");
        tokenlist.add("c92df6ff882b3994afff0c0d433d2d94");
        tokenlist.add("167a8d01f87a99d195e4d43599e11ece");
        tokenlist.add("cc518f626581907e4e67bead0a5e53bc");
        tokenlist.add("a710a2acdd3fc1aa92140fec5979b929");
        tokenlist.add("3414c46231f70eb642beb381f707b0cf");
        tokenlist.add("1b4a5f9017b1938b0be94d852d887c37");
        tokenlist.add("a0544889ccd536e2164426488b1b7da7");
        tokenlist.add("b20817fd1885b5e74cdfc4ddb4f3f351");
        tokenlist.add("9a464b9a834284b26412b810c467c3f9");
        tokenlist.add("dd03c8b4014c268ef14d3e141e52ad7a");
        tokenlist.add("1d2e9c68011702789a5594faf0993f68");
        tokenlist.add("92fced0ab5b75065a279f0f42cf3e5bf");
        tokenlist.add("2a6d9b1df7a26c38a811462f9f32a728");
        tokenlist.add("ed94b00c18cc6f8f3ca6a22283873c0a");
        tokenlist.add("aa45a2d9a2be1d598f3b2cbac0d99110");
        tokenlist.add("23233543a515dfd64a09f3e6a6d7d787");
        tokenlist.add("4d31a8e2b179ccb8c32bbe8556d7fed2");
        tokenlist.add("94335d3b088bc688a8c6b4af44fe79a6");
    



        count = tokenlist.size();
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33256");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33257");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33258");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");
        order_id.add("33260");

                 
        orders_idcount = order_id.size();
                 
    }
    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        int q =(int) (Math.random()*count);
        String key = (String) tokenlist.get(q);
        String order_id1 = (String) order_id.get(q);


        Map map_data=new HashMap<>();
        map_data.put("data", "");
        try {
            SampleResult sampleResult=new HttpRequest2("/mobile/index.php?act=wholesale_order&op=order_info" +
                    "&key="+key+"&order_id="+order_id1, "订单详情", "GET").run(map_data);
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
//    for (int i = 0; i <tokenlist.size(); i++) {
//        SampleResult sampleResult =new Order_infoSample().runTest(null);
//        System.out.println(new String(sampleResult.getResponseData()));
//
//            }
//        }
}
