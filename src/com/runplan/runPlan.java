package com.runplan;

import java.io.File;
import org.apache.commons.io.FileUtils;
import com.jmxcreater.JmxCreaterTest;

public class runPlan {

	public static void main(String[] args) throws Exception {
		JmxCreaterTest jmxCreaterTest=new JmxCreaterTest();
		String xml=jmxCreaterTest.toString();
		FileUtils.writeStringToFile(new File("Plan.jmx"), xml, "utf-8");
		String planpath=new File("plan.jmx").getAbsolutePath();
		
		//cmd /c start dir：会打开一个新窗口后执行dir指令，原窗口会关闭；
		//cmd /k start dir：会打开一个新窗口后执行dir指令，原窗口不会关闭。
		
		//弹出命令行
		String cmd1="cmd /c start jmeter.bat -n -t "+planpath+" -l result.jtl";
		//不弹出命令行
		String cmd2="jmeter.bat -n -t "+planpath+" -l result.jtl";
		//有界面
		String cmdgui="jmeter.bat -t "+planpath;
		String cmdgui1 ="jmeter.bat";
		//" -l result.jtl -e -o ResultReport "
		//如果已经存在结果文件（.jtl）,可运行如下命令生成报告
		String cmdreport="cmd /c start jmeter.bat -g result.jtl -o ResultReport";
		Process process=Runtime.getRuntime().exec(cmdgui1);
		
		
	}
	
	
	
}
