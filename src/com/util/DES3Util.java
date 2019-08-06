package com.util;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

import com.google.gson.JsonObject;

/**
 * 3DES加密解密
 * key长度为24个字符，不足可补零
 * IV向量必须为8位<br/>
 * 使用Base64.encodeToString(byte[], Base64.NO_WRAP);来将加密后的byte[]转为String<br/>
 * 使用Base64.decode(String, Base64.NO_WRAP);将转为String的加密字符转换为byte[]<br/>
 * new String(byte[])将解密后的byte[]转为String<br/>
 */
public class DES3Util {
	
	

	
    private static final String TAG = "DES3Util";
    private static final String DES3 = "DESede";

    ///////////////////////////////////////////////////////////////////////////
    // DES3
    ///////////////////////////////////////////////////////////////////////////

    /**
     * 3DES ECB模式加密
     */
    public static byte[] des3EncodeECB(byte[] key, byte[] data) {
        try {
            SecretKey DESKey = new SecretKeySpec(key, DES3);    //生成密钥
            Cipher cipher = Cipher.getInstance(DES3 + "/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, DESKey);
            return cipher.doFinal(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 3DES ECB模式解密
     */
    public static byte[] des3DecodeECB(byte[] key, byte[] data) {
        try {
            SecretKey DESKey = new SecretKeySpec(key, DES3);    //生成密钥
            Cipher cipher = Cipher.getInstance(DES3 + "/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, DESKey);
           
            return cipher.doFinal(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 3DES CBC模式加密
     */
    public static byte[] des3EncodeCBC(byte[] key, byte[] iv, byte[] data) {
        try {
            SecretKey DESKey = new SecretKeySpec(key, DES3);    //生成密钥
            Cipher cipher = Cipher.getInstance(DES3 + "/CBC/PKCS5Padding");
            IvParameterSpec ips = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, DESKey, ips);
            return cipher.doFinal(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 3DES CBC模式加密
     */
    public static byte[] des3DecodeCBC(byte[] key, byte[] iv, byte[] data) {
        try {
            SecretKey DESKey = new SecretKeySpec(key, DES3);    //生成密钥
            Cipher cipher = Cipher.getInstance(DES3 + "/CBC/PKCS5Padding");
            IvParameterSpec ips = new IvParameterSpec(iv);
            cipher.init(Cipher.DECRYPT_MODE, DESKey, ips);
           
            return cipher.doFinal(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * 根据字符串生成密钥字节数组
     *
     * @param keyStr 密钥字符串
     */
    private static byte[] build3DesKey(String keyStr) {
    	
    	
        try {
            byte[] key = new byte[24];    //声明一个24位的字节数组，默认里面都是0
            for (int i = 0; i < key.length; i++) {
            	key[i]=0;
			}
            byte[] temp = keyStr.getBytes("UTF-8");    //将字符串转成字节数组
            if (key.length > temp.length) {
                //如果temp不够24位，则拷贝temp数组整个长度的内容到key数组中
                System.arraycopy(temp, 0, key, 0, temp.length);
            } else {
                //如果temp大于24位，则拷贝temp数组24个长度的内容到key数组中
                System.arraycopy(temp, 0, key, 0, key.length);
            }
            return key;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
        
        
    }
    
    private static byte[] build3Desvi(String keyStr) {
    	
    	
        try {
            byte[] key = new byte[8];    //声明一个24位的字节数组，默认里面都是0
            byte[] temp = keyStr.getBytes("UTF-8");    //将字符串转成字节数组
            if (key.length > temp.length) {
                //如果temp不够8位，则拷贝temp数组整个长度的内容到vi数组中
                System.arraycopy(temp, 0, key, 0, temp.length);
            } else {
                //如果temp大于8位，则拷贝temp数组24个长度的内容到vi数组中
                System.arraycopy(temp, 0, key, 0, key.length);
            }
            return key;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
        
        
    }
    
    
  
    public static byte[] encrypt( byte[] data) {
    	String deskey = "CCD4B08FD71A076556C7729679C6EBC7";
		String desvi = "20170809";
		data=des3EncodeCBC(build3DesKey(deskey), build3Desvi(desvi), data);
		data=Base64.encodeBase64(data);
		return data;
		
	}
    public static String encrypt(String data) {
    	String deskey = "CCD4B08FD71A076556C7729679C6EBC7";
    	String desvi = "20170809";
    	byte[] bytes=des3EncodeCBC(build3DesKey(deskey), build3Desvi(desvi), data.getBytes());
    	bytes=Base64.encodeBase64(bytes);
    	return new String(bytes);
    	
    }
    
    public static byte[] decrypt( byte[] data) {
    	String deskey = "CCD4B08FD71A076556C7729679C6EBC7";
		String desvi = "20170809";
		data=Base64.decodeBase64(data);
		data=des3DecodeCBC(build3DesKey(deskey), build3Desvi(desvi), data);
		return data;
		
	}
    
    public static String decrypt(String data) {
    	String deskey = "CCD4B08FD71A076556C7729679C6EBC7";
		String desvi = "20170809";
		byte[] bytes=Base64.decodeBase64(data.getBytes());
		bytes=des3DecodeCBC(build3DesKey(deskey), build3Desvi(desvi), bytes);
		return new String(bytes);
		
	}
    
    public static void main(String[] args) {
    	
		String string="cVD7AdwQdecdSFFUEidl3y6cL8c55B7W6La3NHGG/QynXzhXst7+ZZeKy9If vJqlrD3WPaRxkHcrstyBOR5+nlRGx3WAljaE".replace(" ", "");
		String sss="{\"sign\":\"25ba127c6716e56582d140fae45499d2\",\"client_type\":\"android\"}";
		String key = "jybd";
		String deskey = "CCD4B08FD71A076556C7729679C6EBC7";
		String desvi = "20170809";
		
		Map map =new HashMap<>();
		map.put("password", "123456");
		map.put("client_type", "android");
		map.put("user", "13522228898");
		
		String sign=SignUtil.getSign(map);
		
		JsonObject jsonObject=new JsonObject();
		jsonObject.addProperty("password", "123456");
		jsonObject.addProperty("client_type", "android");
		jsonObject.addProperty("user", "13522228898");
		jsonObject.addProperty("sign", sign);
		
		//System.out.println(new String(decrypt(encrypt(jsonObject.toString().getBytes()))));
		
		
		System.out.println(decrypt("cVD7AdwQdeebT/+RlYJOjRKOPq4f5gKMR2quQfOEZx5LLht6s6odyH8UefSJ O5bO"));
		
		//System.out.println(Usualutil.unicodeToCn("\\u89e3\\u5bc6\\u9519\\u8bef"));
		
    }
    
    
}

