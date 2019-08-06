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
 * @date 2019/1/8 - 下午 2:09
 */
public class Check_is_buySample implements JavaSamplerClient {
    static List goodslist =new ArrayList();
    static  int count =0;
    static {
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

        count= goodslist.size();

    }
    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {

        int q=(int)(Math.random()*count);
        String goods_id =(String) goodslist.get(q);

        Map map_data=new HashMap<>();
        map_data.put("data", "");
        try {
            SampleResult sampleResult=new HttpRequest2("/mobile/index.php?act=goods&op=check_is_buy&check_goods_id="+goods_id, "判断是否显示加入购物车购买按钮", "GET").run(map_data);
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
//        for (int i = 0; i <list.size() ; i++) {
//            SampleResult goods_list =new Cart_listSample().runTest(null);
//            System.out.println(new String(goods_list.getResponseData()));
//
//        }
//
//	}

}
