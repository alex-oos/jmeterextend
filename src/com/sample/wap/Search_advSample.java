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
 * @date 2019/1/8 - 上午 9:55
 */
public class Search_advSample  implements JavaSamplerClient {

    static List list = new ArrayList();
    static int count =0;
//    static  int q =0 ;
    static {
        list.add("手机");
        list.add("对讲机");
        list.add("维修保养");
        list.add("轮胎轮毂");
        list.add("轿车轮胎");
        list.add("商用车轮胎");
        list.add("工程车轮胎");
        list.add("润滑油");
        list.add("汽机油");
        list.add("柴机油");
        list.add("刹车油");
        list.add("变速箱油");
        list.add("齿轮油");
        list.add("滤清器");
        list.add("滤清器套装");
        list.add("机油滤清器");
        list.add("空气滤清器");
        list.add("空调滤清器");
        list.add("燃油滤清器");
        list.add("火花塞");
        list.add("刹车片/盘");
        list.add("刹车盘/鼓");
        list.add("刹车片/蹄");
        list.add("蓄电池");
        list.add("汽车蓄电池");
        list.add("添加剂");
        list.add("汽油添加剂");
        list.add("机油添加剂");
        list.add("柴油添加剂");
        list.add("变速箱添加剂");
        list.add("其他添加剂");
        list.add("维保必备");
        list.add("防冻液");
        list.add("雨刷");
        list.add("轮毂");
        list.add("贴膜");
        list.add("车灯");
        list.add("卤素灯");
        list.add("氙气灯");
        list.add("日间行车灯");
        list.add("信号灯");
        list.add("辅助车灯");
        list.add("汽修工具");
        list.add("千斤顶");
        list.add("轮胎扳手");
        list.add("电烙铁");
        list.add("工具箱");
        list.add("车载电器");
        list.add("导航仪");
        list.add("便携式导航");
        list.add("手持GPS");
        list.add("嵌入式导航");
        list.add("其他");
        list.add("安全预警仪");
        list.add("行车记录仪");
        list.add("倒车雷达");
        list.add("吸尘器");
        list.add("蓝牙设备");
        list.add("电源");
        list.add("扩展点烟器");
        list.add("充电器");
        list.add("逆变器");
        list.add("移动电源");
        list.add("应急电源");
        list.add("智能驾驶");
        list.add("OBD设备");
        list.add("抬头显示仪/HUD");
        list.add("冰箱");
        list.add("半导体冷暖箱");
        list.add("压缩机冰箱");
        list.add("美容清洗");
        list.add("洗车配件");
        list.add("车掸");
        list.add("毛巾");
        list.add("海绵");
        list.add("湿巾");
        list.add("水桶");
        list.add("美容添加");
        list.add("玻璃水");
        list.add("雨刮精");
        list.add("防雾剂");
        list.add("玻璃清洗剂");
        list.add("洗车工具");
        list.add("220V高压洗车器");
        list.add("12V电动洗车器");
        list.add("手动洗车器");
        list.add("洗车水枪");
        list.add("洗车器配件");
        list.add("清洁剂");
        list.add("车蜡");
        list.add("补漆笔");
        list.add("汽车装饰");
        list.add("脚垫");
        list.add("通用脚垫");
        list.add("专车专用脚垫");
        list.add("座垫");
        list.add("综合型气动锤足");
        count = list.size();


    }




    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {

        int q = (int) (Math.random() * count);

        String keyword = (String) list.get(q);
//        System.out.println(keyword);
//        System.out.println(q);
//        q++;
        Map map_data =new HashMap();
        map_data.put("data","");

        try {
            SampleResult sampleResult = new HttpRequest2("/mobile/index.php?act=index&op=search_adv" +
                    "&b_id=&gc_id=&keyword="+keyword,"高级搜索","GET").run(map_data);
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

//    public static void main(String[] args) {
//        for (int i=0 ; i< list.size(); i++) {
//            SampleResult sampleResult = new Search_advSample().runTest(null);
//            System.out.println(new String(sampleResult.getResponseData()));
//        }
//    }
}
