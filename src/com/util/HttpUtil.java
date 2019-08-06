package com.util;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
 
public class HttpUtil {

	
	public static String post(String strUrl,byte[] data){
        
        try{
            URL url=new URL(strUrl);
            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            
            
            conn.addRequestProperty("token", "8eb5247a1bc1851427da656aa628940b");
            conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36");
            conn.addRequestProperty("Referer", "http://101.200.44.229/");
           
            conn.setConnectTimeout(3000);
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setInstanceFollowRedirects(false);
            OutputStream outStream=conn.getOutputStream();
            outStream.write(data);
            //conn.connect();
            BufferedReader bufReader=new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
            String backData="";
            String line="";
            while((line=bufReader.readLine())!=null) {
                backData=backData+line;
            }
            
            return backData;
        }catch(IOException e){
        	e.printStackTrace();
            return "";
        }
    }
    
    
    public static String get(String strUrl)
    {
        try{
            URL url=new URL(strUrl);
            //System.out.println(url);
            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            
            
            conn.addRequestProperty("token", "93fce726a0843316e90c1b3341f968a4");
            conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36");
            conn.addRequestProperty("Referer", "http://101.200.44.229/");
            
            
            conn.setConnectTimeout(3000);
            conn.setRequestMethod("GET");
            
            BufferedReader bufReader=new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
            String backData="";
            String line="";
            while((line=bufReader.readLine())!=null) {
                backData=backData+line;
            }
            return backData;
        }catch(IOException e){
        	e.printStackTrace();
            return "";
        }
    }
    
    
    
    
    public static void main(String[] args) throws Exception {
    	
    	Map params=new HashMap<>();
    	
    	
    	params.put("order_id", "");
    	params.put("supplier_id", "10006");
    	params.put("company_id", "10003");
    	params.put("department_id", "10004");
    	params.put("buyer_id", "10033");
    	params.put("factorysend_sn", "");
    	params.put("receivables_mode_id", "10017");
    	params.put("business_time", "2018-10-27");
    	params.put("factorysend_time", "");
    	params.put("type", "0");
    	params.put("remark", "");
    	params.put("other_price", "");
    	params.put("other_price_type", "");
    	params.put("warehouse_id", "10017");
    	params.put("goods_info", "[{\"goods_id\":10015,\"goods_num\":10,\"remark\":\"\",\"purchase_price\":\"10.00\",\"batch\":\"201810\",\"production_time\":\"2018-10-24\",\"subtotal_price\":100,\"allocation_id\":10055}]");
    	
    	
    	
    	List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);
 
        String prestr = "";
 
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = (String) params.get(key);
 
            if (i == keys.size() - 1) {//拼接时，不包括最后一个&字符
                prestr = prestr + key + "=" + value;
            } else {
                prestr = prestr + key + "=" + value + "&";
            }
        }
        
    	
    	String value=prestr+"&sign="+SignUtil.getSign(params);
    	
    	System.out.println(value);
    	
    	String string1="purchase/InStorage/addInStorage";
    	
		String string=HttpUtil.post("http://101.200.44.229/"+string1+"?", value.getBytes());
	
		System.out.println(string);
    
    }
}