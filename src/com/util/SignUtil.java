package com.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Eason
 * @CreatTime: 2017-08-09 18:27
 * @LastModify: Eason
 * @LastModifyTime: 2017-08-09 18:27
 * @LastCheckedBy: Eason
 */
public class SignUtil {

    private static String sqrtMap(Map map) {
    	if (map==null) {
    		map=new HashMap<>();
		}
        List<Map.Entry<String, String>> infoIds = new ArrayList<Map.Entry<String, String>>(map.entrySet());
        //排序
        Collections.sort(infoIds, new Comparator<Map.Entry<String, String>>() {
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                //return (o2.getValue() - o1.getValue());
                return (o1.getKey()).toString().compareTo(o2.getKey());
            }
        });

        //排序后
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < infoIds.size(); i++) {
            String content = infoIds.get(i).toString();
            if (!infoIds.get(i).getKey().equals("sign")) {
                buffer.append(content + "&");
            }
//            System.out.println(buffer);
        }
        buffer.append("key=jybd");
        String result = "";
        if (buffer.length() > 0) {
            result = buffer.substring(0, buffer.length());
        }
        return result;
    }

 


    /**
     * 作用：得到一个sign的值
     */
    public static String getSign(Map paraMap)  {
        String params = sqrtMap(paraMap);
//        LogUtil.e("params-->",params);
        String md5 = getMd5Value(params);
//        LogUtil.e("sign-->",md5);
        return md5;
    }


    /***
     * MD5加码 生成32位md5码
     */
 
    private static   String getMd5Value(String sSecret) {
        try {
            MessageDigest bmd5 = MessageDigest.getInstance("MD5");
            bmd5.update(sSecret.getBytes());
            int i;
            StringBuffer buf = new StringBuffer();
            byte[] b = bmd5.digest();
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

}
