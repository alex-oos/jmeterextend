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
 * @date 2019/1/8 - 上午 10:19
 */
public class Store_infoSample implements JavaSamplerClient {
    static int count =0;
    static List store_idlist =new ArrayList();
//    static  int q = 0;

    static {
        store_idlist.add("4");
        store_idlist.add("5");
        store_idlist.add("6");
        store_idlist.add("7");
        store_idlist.add("8");
        store_idlist.add("9");
        store_idlist.add("10");
        store_idlist.add("11");
        store_idlist.add("12");
        store_idlist.add("13");
        store_idlist.add("14");
        store_idlist.add("15");
        store_idlist.add("16");
        store_idlist.add("18");
        store_idlist.add("19");
        store_idlist.add("20");
        store_idlist.add("21");
        store_idlist.add("22");
        store_idlist.add("24");
        store_idlist.add("25");
        store_idlist.add("26");
        store_idlist.add("27");
        store_idlist.add("28");
        store_idlist.add("29");
        store_idlist.add("30");
        store_idlist.add("31");
        store_idlist.add("32");
        store_idlist.add("33");
        store_idlist.add("34");
        store_idlist.add("35");
        store_idlist.add("36");
        store_idlist.add("37");
        store_idlist.add("38");
        store_idlist.add("39");
        store_idlist.add("40");
        store_idlist.add("41");
        store_idlist.add("42");
        store_idlist.add("44");
        store_idlist.add("45");
        store_idlist.add("46");
        store_idlist.add("47");
        store_idlist.add("48");
        store_idlist.add("49");
        store_idlist.add("50");
        store_idlist.add("51");
        store_idlist.add("52");
        store_idlist.add("53");
        store_idlist.add("54");
        store_idlist.add("55");
        count = store_idlist.size();

    }

    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        int q=(int)(Math.random()*count);
        String store_id = (String) store_idlist.get(q);
//        System.out.println("第"+q+"个,store_id是"+store_id);
//        q++;
        Map map_data =new HashMap();
        map_data.put("data","key=&store_id="+store_id);
        SampleResult sampleResult;
        try {
            sampleResult = new HttpRequest2("/mobile/index.php?act=store&op=store_info","店铺信息","POST")
                    .run(map_data);
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

//    public static void main(String[] args) {
//        for (int i = 0; i <list.size() ; i++) {
//         SampleResult sampleResult =new Store_infoSample().runTest(null);
//         System.out.println(new String(sampleResult.getResponseData()));
//        }
//
//    }
}
