package com.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;

public class Md5Util {

	
	 public static String getMD5FromString(String str) {
	    	//System.out.println(str);
	    	String string="";
	        try {
	            MessageDigest md = MessageDigest.getInstance("MD5");
	            
	            md.update(str.getBytes());

	            string= new BigInteger(1, md.digest()).toString(16);
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        return string;
	        
	    }
	 //e4b2ab14cd708124d7997fcbcc40a7e3
	
	public static void main(String[] args) {
		System.out.println(SignUtil.getSign(new HashMap<>()));
	}
	
}
