package com.sample.wap;

import com.request.HttpRequest2;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lijiang
 * @date 2019/1/8 - 下午 3:04
 */
public class Recommend_listSample implements JavaSamplerClient {

    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        Map map_data=new HashMap<>();
        map_data.put("data", "");
        try {
            SampleResult sampleResult=new HttpRequest2("/mobile/index.php?act=brand&op=recommend_list", "品牌分类", "GET").run(map_data);
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
//        for (int i = 0; i <10 ; i++) {
//            SampleResult sampleResult =new  Recommend_listSample().runTest(null);
//            System.out.println(new String(sampleResult.getResponseData()));
//
//        }
//
//    }
}
