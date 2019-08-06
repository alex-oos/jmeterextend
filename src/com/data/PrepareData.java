package com.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrepareData {

	
	
	private static	Map map=new HashMap<>();
	private static  List list=new ArrayList<>();
	private static int count=0;
	public static void addPrepareData(String key,Object value) {
		map.put(key, value);
	}
	
	
	public static Object getPrepareData(String key) {
			
		return map.get(key);
	}
	
	public static void addPrepareData(Map map) {
		list.add(map);
		count=list.size();
	}
	public static int getLength() {
		return count;
	}
	
	
	public static Map getPrepareData(int index) {
			
		return (Map) list.get(index);
	}
}
