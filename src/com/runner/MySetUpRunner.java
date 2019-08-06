package com.runner;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import com.DB.Select;
import com.data.PrepareData;


public class MySetUpRunner extends Runner{
	
	//private static final Logger log = LoggerFactory.getLogger(Runner.class);
	
	@Override
	public SampleResult run(JavaSamplerContext context) throws Exception  {
		String localip=InetAddress.getLocalHost().getHostAddress();
		SampleResult sampleResult=new SampleResult();
		String sql="SELECT remote.id FROM remote WHERE remote.ip=\""+localip+"\" limit 1";
		Map map=Select.selectonebysql(sql);
		String sql2="SELECT *  from testdata WHERE testdata.remoteid="+map.get("id");
		List list=Select.selectallbysql(sql2);
		for (int i = 0; i < list.size(); i++) {
			
			Map datamap=(Map)list.get(i);
			String sampleclassname= (String) datamap.get("runnername");
			if (PrepareData.getPrepareData(sampleclassname)==null) {
				PrepareData.addPrepareData(sampleclassname, new ArrayList<>());
			}
			((List)PrepareData.getPrepareData(sampleclassname)).add(datamap);
			
		}
		sampleResult.setSuccessful(true);
		sampleResult.setSampleLabel("准备数据");
		return null;
	}

	
}
