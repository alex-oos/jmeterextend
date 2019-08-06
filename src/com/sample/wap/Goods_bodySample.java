package com.sample.wap;

import com.request.HttpRequest2;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.*;

/**
 * @author lijiang
 * @date 2019/1/8 - 上午 10:11
 */
public class Goods_bodySample implements JavaSamplerClient {

    static List list = new ArrayList();
    static int count =0;
//    static  int q =0 ;
    static {

        list.add("100021");
        list.add("100023");
        list.add("100024");
        list.add("100025");
        list.add("100026");
        list.add("100027");
        list.add("100028");
        list.add("100029");
        list.add("100030");
        list.add("100031");
        list.add("100032");
        list.add("100033");
        list.add("100034");
        list.add("100035");
        list.add("100036");
        list.add("100037");
        list.add("100038");
        list.add("100039");
        list.add("100040");
        list.add("100041");
        list.add("100042");
        list.add("100043");
        list.add("100045");
        list.add("100046");
        list.add("100048");
        list.add("100049");
        list.add("100050");
        list.add("100051");
        list.add("100052");
        list.add("100054");
        list.add("100055");
        list.add("100057");
        list.add("100058");
        list.add("100059");
        list.add("100060");
        list.add("100062");
        list.add("100063");
        list.add("100064");
        list.add("100065");
        list.add("100066");
        list.add("100067");
        list.add("100068");
        list.add("100069");
        list.add("100070");
        list.add("100071");
        list.add("100072");
        list.add("100073");
        list.add("100074");
        list.add("100075");
        list.add("100076");
        list.add("100077");
        list.add("100078");
        list.add("100079");
        list.add("100080");
        list.add("100081");
        list.add("100083");
        list.add("100084");
        list.add("100085");
        list.add("100086");
        list.add("100087");
        list.add("100088");
        list.add("100089");
        list.add("100090");
        list.add("100091");
        list.add("100092");
        list.add("100093");
        list.add("100094");
        list.add("100095");
        list.add("100096");
        list.add("100098");
        list.add("100099");
        list.add("100100");
        list.add("100101");
        list.add("100102");
        list.add("100103");
        list.add("100104");
        list.add("100105");
        list.add("100106");
        list.add("100108");
        list.add("100109");
        list.add("100110");
        list.add("100111");
        list.add("100113");
        list.add("100114");
        list.add("100115");
        list.add("100116");
        list.add("100117");
        list.add("100118");
        list.add("100119");
        list.add("100120");
        list.add("100121");
        list.add("100122");
        list.add("100123");
        list.add("100124");
        list.add("100125");
        list.add("100126");
        list.add("100127");
        list.add("100128");
        list.add("100129");
        list.add("100130");
        list.add("100131");
        list.add("100132");
        list.add("100133");
        list.add("100134");
        list.add("100135");
        list.add("100142");
        list.add("100143");
        list.add("100146");
        list.add("100147");
        list.add("100148");
        list.add("100149");
        list.add("100150");
        list.add("100151");
        list.add("100152");
        list.add("100153");
        list.add("100154");
        list.add("100155");
        list.add("100156");
        list.add("100157");
        list.add("100158");
        list.add("100159");
        list.add("100160");
        list.add("100161");
        list.add("100165");
        list.add("100166");
        list.add("100167");
        list.add("100168");
        list.add("100171");
        list.add("100172");
        list.add("100173");
        list.add("100174");
        list.add("100175");
        list.add("100176");
        list.add("100177");
        list.add("100178");
        list.add("100180");
        list.add("100181");
        list.add("100182");
        list.add("100183");
        list.add("100184");
        list.add("100185");
        list.add("100186");
        list.add("100187");
        list.add("100188");
        list.add("100190");
        list.add("100191");
        list.add("100192");
        list.add("100193");
        list.add("100195");
        list.add("100196");
        list.add("100197");
        list.add("100198");
        list.add("100199");
        list.add("100200");
        list.add("100201");
        list.add("100203");
        list.add("100204");
        list.add("100205");
        list.add("100206");
        list.add("100207");
        list.add("100208");
        list.add("100209");
        list.add("100210");
        list.add("100211");
        list.add("100212");
        list.add("100213");
        list.add("100214");
        list.add("100215");
        list.add("100216");
        list.add("100217");
        list.add("100218");
        list.add("100219");
        list.add("100220");
        list.add("100221");

        count = list.size();



    }

    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        int q= (int)(Math.random()*count);
        String goods_id= (String) list.get(q);
////        System.out.println("第"+q+"个是"+"goods_id："+goods_id);
//        q++;
        Map map_data =new HashMap();
        map_data.put("data","");
        try {
            SampleResult sampleResult =new HttpRequest2("/mobile/index.php?act=goods&op=goods_body&goods_id="+goods_id+"&key="
                    ,"商品详细页一部分","GET").run(map_data);
            return sampleResult;
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
//      public static void main(String[] args) {
//        for(int i = 0; i<list.size();i++){
//            SampleResult sampleResult =new Goods_bodySample().runTest(null);
//            System.out.println(new String(sampleResult.getResponseData()));
//
//
//        }
//    }

}
