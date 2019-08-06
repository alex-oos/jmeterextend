package com.jmxcreater;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import com.DB.Select;
import com.jmxelement.BackEndListenr;
import com.jmxelement.CustomSample;
import com.jmxelement.RunThreadGroup;
import com.jmxelement.SetupThreadGroup;
import com.jmxelement.TearDownThreadGroup;
import com.jmxelement.TestPlan;
import com.jmxelement.ThroughputController;
import com.util.Usualutil;

public class JmxCreaterTest {
	
	TestPlan testPlan;
	
	
	public void addTestPlan(TestPlan testPlan)  {
		
		 this.testPlan=testPlan;
	}
	
	public void insertafter(Node parent,Node node,Node insert) {
		
		NodeList nodelist=parent.getChildNodes();
		int index=0;
		int length=nodelist.getLength();
		for (int i = 0; i < nodelist.getLength(); i++) {
			if (nodelist.item(i)==node) {
				index=i;
			}
		}
		if (length==1) {
			parent.appendChild(insert);
		}else {
			if (index==length-1) {
				parent.appendChild(insert);
			}else {
				parent.insertBefore(insert, nodelist.item(index+1));
			}
		}
		
	}
	
	public void resolveToTree(Node node) {
		
		NodeList nodelist=node.getChildNodes();
		int length=nodelist.getLength();
		if (length>0) {
			Node  parent=node.getParentNode();
			Element hashTreecontent=Usualutil.getDocument().createElement("hashTree");
			List list=new ArrayList();
			for (int i = 0; i < length; i++) {
				 Node currentnode=nodelist.item(i);
				 list.add(currentnode);
			}
			for (int i = 0; i < list.size(); i++) {
				hashTreecontent.appendChild((Node) list.get(i));
				if (((Node) list.get(i)).getChildNodes().getLength()==0) {
					hashTreecontent.appendChild(Usualutil.getDocument().createElement("hashTree"));
				}
				
			}
			insertafter(parent,node,hashTreecontent);
			//遍历新生成的hashtree
			NodeList nodelisthashTreecontent=hashTreecontent.getChildNodes();
			//先取出子element
			List listhashTreecontent=new ArrayList();
			for (int i = 0; i < nodelisthashTreecontent.getLength(); i++) {
				if (nodelisthashTreecontent.item(i).getChildNodes().getLength()>0) {
					listhashTreecontent.add(nodelisthashTreecontent.item(i));
				}
			}
			for (int i = 0; i < listhashTreecontent.size(); i++) {
				resolveToTree((Node) list.get(i));
			}
			
		}
		
	}
	
	public String toString() {
		
		Element jmeterTestPlan=Usualutil.getDocument().createElement("jmeterTestPlan");
		
		jmeterTestPlan.setAttribute("version", "1.2");
		jmeterTestPlan.setAttribute("properties", "5.0");
		jmeterTestPlan.setAttribute("jmeter", "5.0 r1840935");

		Element hashTree=Usualutil.getDocument().createElement("hashTree");
		
		TestPlan mytestPlan =new TestPlan() ;
		mytestPlan.element.setAttribute("guiclass", "TestPlanGui");
		mytestPlan.element.setAttribute("testclass", "TestPlan");
		mytestPlan.element.setAttribute("testname", "Test Plan");
		mytestPlan.element.setAttribute("enabled", "true");
		
		List RunThreadGrouplist=new ArrayList();
		String sql="SELECT\n" +
				"	threadgroup.continueforever,\n" +
				"	threadgroup.customSamplerName,\n" +
				"	threadgroup.ramptime,\n" +
				"	threadgroup.userCount\n" +
				"FROM\n" +
				"	testplan\n" +
				"INNER JOIN threadgroup ON threadgroup.planid = testplan.id\n" +
				"WHERE\n" +
				"	active = TRUE;";
		List list =Select.selectallbysql(sql);
		
		for (int i = 0; i < list.size(); i++) {
			RunThreadGroup runThreadGroup=new RunThreadGroup();
			runThreadGroup.element.setAttribute("guiclass", "ThreadGroupGui");
			runThreadGroup.element.setAttribute("testclass", "ThreadGroup");
			runThreadGroup.element.setAttribute("testname", "Thread Group");
			runThreadGroup.element.setAttribute("enabled", "true");
			

			CustomSample customSample=new CustomSample();
			customSample.element.setAttribute("guiclass", "JavaTestSamplerGui");
			customSample.element.setAttribute("testclass", "JavaSampler");
			customSample.element.setAttribute("testname", "Java Request");
			customSample.element.setAttribute("enabled", "true");
			
			runThreadGroup.addSample(customSample);
			
			mytestPlan.addThreadGroup(runThreadGroup);
			
			List list2=new ArrayList();
			list2.add(runThreadGroup);
			list2.add(customSample);
			RunThreadGrouplist.add(list2);
		}
		
		
		
		
		
		
		
		
		SetupThreadGroup setupThreadGroup=new SetupThreadGroup();
		setupThreadGroup.element.setAttribute("guiclass", "SetupThreadGroupGui");
		setupThreadGroup.element.setAttribute("testclass", "SetupThreadGroup");
		setupThreadGroup.element.setAttribute("testname", "setUp Thread Group");
		setupThreadGroup.element.setAttribute("enabled", "true");
		
		//setupThreadGroup的取样器
		CustomSample setupcustomSample=new CustomSample();
		setupcustomSample.element.setAttribute("guiclass", "JavaTestSamplerGui");
		setupcustomSample.element.setAttribute("testclass", "JavaSampler");
		setupcustomSample.element.setAttribute("testname", "Java Request");
		setupcustomSample.element.setAttribute("enabled", "true");
		setupThreadGroup.addSample(setupcustomSample);
		
		mytestPlan.addThreadGroup(setupThreadGroup);
		
		
		TearDownThreadGroup tearDownThreadGroup=new TearDownThreadGroup();
		tearDownThreadGroup.element.setAttribute("guiclass", "PostThreadGroupGui");
		tearDownThreadGroup.element.setAttribute("testclass", "PostThreadGroup");
		tearDownThreadGroup.element.setAttribute("testname", "tearDown Thread Group");
		tearDownThreadGroup.element.setAttribute("enabled", "true");
		
		mytestPlan.addThreadGroup(tearDownThreadGroup);
		
		BackEndListenr backEndListenr=new BackEndListenr();
		backEndListenr.element.setAttribute("guiclass", "BackendListenerGui");
		backEndListenr.element.setAttribute("testclass", "BackendListener");
		backEndListenr.element.setAttribute("testname", "Backend Listener");
		backEndListenr.element.setAttribute("enabled", "true");
		
		mytestPlan.addListener(backEndListenr);
		
		
		
		this.addTestPlan(mytestPlan);
		
		hashTree.appendChild(testPlan.element);
		resolveToTree(testPlan.element);
		
		
		

		//添加参数
	        
		//添加testplan
		Element element= Usualutil.getDocument().createElement("stringProp");
		element.setAttribute("name", "TestPlan.comments");
		mytestPlan.element.appendChild(element);
		
		Element element2= Usualutil.getDocument().createElement("boolProp");
		element2.setAttribute("name", "TestPlan.functional_mode");
		element2.setTextContent("false");
		mytestPlan.element.appendChild(element2);
		
		Element element3= Usualutil.getDocument().createElement("boolProp");
		element3.setAttribute("name", "TestPlan.tearDown_on_shutdown");
		element3.setTextContent("true");
		mytestPlan.element.appendChild(element3);
		
		Element element4= Usualutil.getDocument().createElement("boolProp");
		element4.setAttribute("name", "TestPlan.serialize_threadgroups");
		element4.setTextContent("false");
		mytestPlan.element.appendChild(element4);
		
		Element element5= Usualutil.getDocument().createElement("elementProp");
		element5.setAttribute("name", "TestPlan.user_defined_variables");
		element5.setAttribute("elementType", "Arguments");
		element5.setAttribute("guiclass", "ArgumentsPanel");
		element5.setAttribute("testclass", "Arguments");
		element5.setAttribute("testname", "User Defined Variables");
		element5.setAttribute("enabled", "true");
		Element element51= Usualutil.getDocument().createElement("collectionProp");
		element51.setAttribute("name", "Arguments.arguments");
		
		element5.appendChild(element51);
		mytestPlan.element.appendChild(element5);
		
		
		Element element6= Usualutil.getDocument().createElement("stringProp");
		element6.setAttribute("name", "TestPlan.user_define_classpath");
		mytestPlan.element.appendChild(element6);

		//添加runThreadGroup 参数
       
        for (int i = 0; i < RunThreadGrouplist.size(); i++) {
        	RunThreadGroup runThreadGroup=(RunThreadGroup) ((List)RunThreadGrouplist.get(i)).get(0);
        	Map map=(Map) list.get(i);
        	
        	String customSamplerName=(String) map.get("customSamplerName");
        	int userCount=(int) map.get("userCount");
        	int ramptime=(int) map.get("ramptime");
        	boolean continueforever=(boolean) map.get("continueforever");
        	
        	Element element7= Usualutil.getDocument().createElement("stringProp");
    		element7.setAttribute("name", "ThreadGroup.on_sample_error");
    		element7.setTextContent("continue");
    		runThreadGroup.element.appendChild(element7);
    		
    		Element element8= Usualutil.getDocument().createElement("elementProp");
    		element8.setAttribute("name", "ThreadGroup.main_controller");
    		element8.setAttribute("elementType", "LoopController");
    		element8.setAttribute("guiclass", "LoopControlPanel");
    		element8.setAttribute("testclass", "LoopController");
    		element8.setAttribute("testname", "Loop Controller");
    		element8.setAttribute("enabled", "true");
    		
    		Element element81= Usualutil.getDocument().createElement("boolProp");
    		element81.setAttribute("name", "LoopController.continue_forever");
    		element81.setTextContent("false");
    		//设置是否永久循环 -1为永久循环 
    		//设置如果不永久循环的次数
    		Element element82= Usualutil.getDocument().createElement("stringProp");
    		element82.setAttribute("name", "LoopController.loops");
    		if (continueforever) {
    			element82.setTextContent("-1");
			}else {
				element82.setTextContent("1");
			}
    		
    		
    		
    		element8.appendChild(element81);
    		element8.appendChild(element82);
    		runThreadGroup.element.appendChild(element8);
    		//设置usercount
    		Element element9= Usualutil.getDocument().createElement("stringProp");
    		element9.setAttribute("name", "ThreadGroup.num_threads");
    		element9.setTextContent(Integer.toString(userCount));
    		runThreadGroup.element.appendChild(element9);
    		//设置多少时间达到usercount
    		Element element10= Usualutil.getDocument().createElement("stringProp");
    		element10.setAttribute("name", "ThreadGroup.ramp_time");
    		element10.setTextContent(Integer.toString(ramptime));
    		runThreadGroup.element.appendChild(element10);
    		
    		Element element11= Usualutil.getDocument().createElement("boolProp");
    		element11.setAttribute("name", "ThreadGroup.scheduler");
    		element11.setTextContent("false");
    		runThreadGroup.element.appendChild(element11);
    		
    		Element element12= Usualutil.getDocument().createElement("stringProp");
    		element12.setAttribute("name", "ThreadGroup.duration");
    		runThreadGroup.element.appendChild(element12);
    		
    		Element element13= Usualutil.getDocument().createElement("stringProp");
    		element13.setAttribute("name", "ThreadGroup.delay");
    		runThreadGroup.element.appendChild(element13);

    		

    		//添加JavaSampler参数
    		
    		Element element18= Usualutil.getDocument().createElement("elementProp");
    		element18.setAttribute("name", "arguments");
    		element18.setAttribute("elementType", "Arguments");
    		element18.setAttribute("guiclass", "ArgumentsPanel");
    		element18.setAttribute("testclass", "Arguments");
    		element18.setAttribute("enabled", "true");
    		
    		Element element181= Usualutil.getDocument().createElement("collectionProp");
    		element181.setAttribute("name", "arguments");
    		element181.setAttribute("elementType", "Arguments");
    		element181.setAttribute("guiclass", "ArgumentsPanel");
    		element181.setAttribute("testclass", "Arguments");
    		element181.setAttribute("enabled", "true");
    		

    		
    		
    		Element element1811= Usualutil.getDocument().createElement("elementProp");
    		element1811.setAttribute("name", "Sleep_Time");
    		element1811.setAttribute("elementType", "Argument");
    		
    		Element element18111= Usualutil.getDocument().createElement("stringProp");
    		element18111.setAttribute("name", "Argument.name");
    		element18111.setTextContent("Sleep_Time");
    		
    		Element element18112= Usualutil.getDocument().createElement("stringProp");
    		element18112.setAttribute("name", "Argument.value");
    		element18112.setTextContent("100");
    		
    		Element element18113= Usualutil.getDocument().createElement("stringProp");
    		element18113.setAttribute("name", "Argument.metadata");
    		element18113.setTextContent("=");
    		
    		element1811.appendChild(element18111);
    		element1811.appendChild(element18112);
    		element1811.appendChild(element18113);
    		
    		element181.appendChild(element1811);
    		
    		element18.appendChild(element181);
    		
    		

    		Element element19= Usualutil.getDocument().createElement("stringProp");
    		element19.setAttribute("name", "classname");
    		//设置具体sample类
    		element19.setTextContent(customSamplerName);
    		
    		CustomSample customSample=(CustomSample) ((List)RunThreadGrouplist.get(i)).get(1);
    		
    		customSample.element.appendChild(element18);
    		customSample.element.appendChild(element19);
		}
		
        //添加setupJavaSampler参数
		
		Element element18= Usualutil.getDocument().createElement("elementProp");
		element18.setAttribute("name", "arguments");
		element18.setAttribute("elementType", "Arguments");
		element18.setAttribute("guiclass", "ArgumentsPanel");
		element18.setAttribute("testclass", "Arguments");
		element18.setAttribute("enabled", "true");
		
		Element element181= Usualutil.getDocument().createElement("collectionProp");
		element181.setAttribute("name", "arguments");
		element181.setAttribute("elementType", "Arguments");
		element181.setAttribute("guiclass", "ArgumentsPanel");
		element181.setAttribute("testclass", "Arguments");
		element181.setAttribute("enabled", "true");
		

		
		
		Element element1811= Usualutil.getDocument().createElement("elementProp");
		element1811.setAttribute("name", "Sleep_Time");
		element1811.setAttribute("elementType", "Argument");
		
		Element element18111= Usualutil.getDocument().createElement("stringProp");
		element18111.setAttribute("name", "Argument.name");
		element18111.setTextContent("Sleep_Time");
		
		Element element18112= Usualutil.getDocument().createElement("stringProp");
		element18112.setAttribute("name", "Argument.value");
		element18112.setTextContent("100");
		
		Element element18113= Usualutil.getDocument().createElement("stringProp");
		element18113.setAttribute("name", "Argument.metadata");
		element18113.setTextContent("=");
		
		element1811.appendChild(element18111);
		element1811.appendChild(element18112);
		element1811.appendChild(element18113);
		
		element181.appendChild(element1811);
		
		element18.appendChild(element181);
		
		

		Element element19= Usualutil.getDocument().createElement("stringProp");
		element19.setAttribute("name", "classname");
		//设置具体sample类
		element19.setTextContent("com.sample.CustomSetUpJavaSample");
		
		setupcustomSample.element.appendChild(element18);
		setupcustomSample.element.appendChild(element19);

		//添加SetupThreadGroup参数
		
		Element element20= Usualutil.getDocument().createElement("stringProp");
		element20.setAttribute("name", "ThreadGroup.on_sample_error");
		element20.setTextContent("continue");
		setupThreadGroup.element.appendChild(element20);
		
		Element element21= Usualutil.getDocument().createElement("elementProp");
		element21.setAttribute("name", "ThreadGroup.main_controller");
		element21.setAttribute("elementType", "LoopController");
		element21.setAttribute("guiclass", "LoopControlPanel");
		element21.setAttribute("testclass", "LoopController");
		element21.setAttribute("testname", "Loop Controller");
		element21.setAttribute("enabled", "true");
		
		Element element211= Usualutil.getDocument().createElement("boolProp");
		element211.setAttribute("name", "LoopController.continue_forever");
		element211.setTextContent("false");
		
		Element element212= Usualutil.getDocument().createElement("stringProp");
		element212.setAttribute("name", "LoopController.loops");
		element212.setTextContent("1");
		
		element21.appendChild(element211);
		element21.appendChild(element212);
		
		setupThreadGroup.element.appendChild(element21);
		
		Element element22= Usualutil.getDocument().createElement("stringProp");
		element22.setAttribute("name", "ThreadGroup.num_threads");
		element22.setTextContent("1");
		setupThreadGroup.element.appendChild(element22);
        
		
		Element element23= Usualutil.getDocument().createElement("stringProp");
		element23.setAttribute("name", "ThreadGroup.ramp_time");
		element23.setTextContent("1");
		setupThreadGroup.element.appendChild(element23);
		
		Element element24= Usualutil.getDocument().createElement("boolProp");
		element24.setAttribute("name", "ThreadGroup.scheduler");
		element24.setTextContent("false");
		setupThreadGroup.element.appendChild(element24);
		
		Element element25= Usualutil.getDocument().createElement("stringProp");
		element25.setAttribute("name", "ThreadGroup.duration");
		
		setupThreadGroup.element.appendChild(element25);
		
		Element element26= Usualutil.getDocument().createElement("stringProp");
		element26.setAttribute("name", "ThreadGroup.delay");
		
		setupThreadGroup.element.appendChild(element26);
		
		
		//添加tearDownThreadGroup参数
		Element element27= Usualutil.getDocument().createElement("stringProp");
		element27.setAttribute("name", "ThreadGroup.on_sample_error");
		element27.setTextContent("continue");
		
		tearDownThreadGroup.element.appendChild(element27);
		
		Element element28= Usualutil.getDocument().createElement("elementProp");
		element28.setAttribute("name", "ThreadGroup.main_controller");
		element28.setAttribute("elementType", "LoopController");
		element28.setAttribute("guiclass", "LoopControlPanel");
		element28.setAttribute("testclass", "LoopController");
		element28.setAttribute("testname", "Loop Controller");
		element28.setAttribute("enabled", "true");
		
		Element element281= Usualutil.getDocument().createElement("boolProp");
		element281.setAttribute("name", "LoopController.continue_forever");
		element281.setTextContent("false");
		
		Element element282= Usualutil.getDocument().createElement("stringProp");
		element282.setAttribute("name", "LoopController.loops");
		element282.setTextContent("1");
		
		element28.appendChild(element281);
		element28.appendChild(element282);
		tearDownThreadGroup.element.appendChild(element28);
		
		
		Element element29= Usualutil.getDocument().createElement("stringProp");
		element29.setAttribute("name", "ThreadGroup.num_threads");
		element29.setTextContent("1");
		
		tearDownThreadGroup.element.appendChild(element29);
       
		Element element30= Usualutil.getDocument().createElement("boolProp");
		element30.setAttribute("name", "ThreadGroup.ramp_time");
		element30.setTextContent("1");
		
		tearDownThreadGroup.element.appendChild(element30);
		
		Element element31= Usualutil.getDocument().createElement("boolProp");
		element31.setAttribute("name", "ThreadGroup.scheduler");
		element31.setTextContent("false");
		
		tearDownThreadGroup.element.appendChild(element31);
		
		Element element32= Usualutil.getDocument().createElement("stringProp");
		element32.setAttribute("name", "ThreadGroup.duration");
	
		
		tearDownThreadGroup.element.appendChild(element32);
		
		Element element33= Usualutil.getDocument().createElement("stringProp");
		element33.setAttribute("name", "ThreadGroup.delay");
	
		
		tearDownThreadGroup.element.appendChild(element33);
		
		
		
		//添加backendlistener参数

		Element element34= Usualutil.getDocument().createElement("elementProp");
		element34.setAttribute("name", "arguments");
		element34.setAttribute("elementType", "Arguments");
		element34.setAttribute("guiclass", "ArgumentsPanel");
		element34.setAttribute("testclass", "Arguments");
		element34.setAttribute("enabled", "true");
		
		Element element341= Usualutil.getDocument().createElement("collectionProp");
		element341.setAttribute("name", "Arguments.argument");
		
		
		Element element3411= Usualutil.getDocument().createElement("elementProp");
		element3411.setAttribute("name", "graphiteMetricsSender");
		element3411.setAttribute("elementType", "Argument");
		
		Element element34111= Usualutil.getDocument().createElement("stringProp");
		element34111.setAttribute("name", "Argument.name");
		element34111.setTextContent("graphiteMetricsSender");
		
		
		
		Element element34112= Usualutil.getDocument().createElement("stringProp");
		element34112.setAttribute("name", "Argument.value");
		element34112.setTextContent("org.apache.jmeter.visualizers.backend.graphite.TextGraphiteMetricsSender");
		
		Element element34113= Usualutil.getDocument().createElement("stringProp");
		element34113.setAttribute("name", "Argument.metadata");
		element34113.setTextContent("=");
		
		
		element3411.appendChild(element34113);
		element3411.appendChild(element34112);
		element3411.appendChild(element34111);
		element341.appendChild(element3411);
		element34.appendChild(element341);
		

		backEndListenr.element.appendChild(element34);
		
		Element element35= Usualutil.getDocument().createElement("stringProp");
		element35.setAttribute("name", "classname");
		element35.setTextContent("com.listener.MyBackendListener");
		
		backEndListenr.element.appendChild(element35);
		
		
		
		
		jmeterTestPlan.appendChild(hashTree);
		
		
		
		
		try {
			return Usualutil.elementToXml(jmeterTestPlan);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	
	public static void main(String[] args) throws Exception {
		JmxCreaterTest jmxCreater=new JmxCreaterTest();
		System.out.println(jmxCreater.toString());
	  
	}
	
	
	
	
	
}
