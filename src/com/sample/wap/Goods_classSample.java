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
 * @date 2019/1/8 - 上午 10:48
 */
public class Goods_classSample implements JavaSamplerClient {

    static int count =0;
    static List list =new ArrayList();
//    static  int q =0;

    static {

        list.add("1929");
        list.add("1935");
        list.add("1941");
        list.add("1945");
        list.add("1952");
        list.add("1955");
        list.add("1961");
        list.add("1966");
        list.add("1985");
        list.add("2172");
        list.add("2177");
        list.add("2246");
        list.add("2000");
        list.add("2005");
        list.add("2023");
        list.add("2029");
        list.add("2033");
        list.add("2193");
        list.add("2200");
        list.add("2038");
        list.add("2046");
        list.add("2053");
        list.add("2059");
        list.add("2205");
        list.add("2213");
        list.add("2214");
        list.add("2230");
        list.add("2064");
        list.add("2067");
        list.add("2070");
        list.add("2073");
        list.add("2076");
        list.add("2081");
        list.add("2086");
        list.add("2091");
        list.add("2100");
        list.add("2111");
        list.add("2131");
        list.add("2137");
        list.add("2145");
        
    
        count = list.size();




    }





    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        int q =(int)(Math.random()*count);

        String gc_id =(String)list.get(q);
//        q++;
        Map map_data=new HashMap();
        map_data.put("data","");
        try {
            SampleResult sampleResult =new HttpRequest2("/mobile/index.php?act=goods_class&op=get_child_all&gc_id="+gc_id,"商品分类(全部，单个)","GET").
                    run(map_data);
            return  sampleResult;
        } catch (Exception e) {
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
//        for (int i = 0; i < list.size(); i++) {
//            SampleResult sampleResult =new Goods_classSample().runTest(null);
//
//            System.out.println(new String(sampleResult.getResponseData()));
//
//        }
//
//    }
}
