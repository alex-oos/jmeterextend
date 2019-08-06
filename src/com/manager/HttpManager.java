package com.manager;


import java.net.HttpURLConnection;
/* 
 * 主机地址
 * */

public class HttpManager {

	
	
	public void process(HttpURLConnection conn) {
		conn.setConnectTimeout(15000);
		conn.setReadTimeout(15000);
	}
	
	public String address() {


		return "https://huochebang.jybd.cn";

		
		
	
	}
	
	
}
