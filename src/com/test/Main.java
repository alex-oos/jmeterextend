package com.test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	
	
	
	public static void main(String[] args) throws Exception {
//		String lookAndFeel =UIManager.getSystemLookAndFeelClassName();
//		UIManager.setLookAndFeel(lookAndFeel);
//		JFrame jFrame=new JFrame("ss");
//		JButton jButton=new JButton();
//		jFrame.add(jButton);
//		jFrame.setSize(400, 400);
//		jFrame.setVisible(true);
//		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		while (true) {
//			Thread.sleep(1000);
//			System.out.println(888);
//		}

		if (args.length==0) {
			System.out.println("没有输入文件路径");
			System.exit(0);
		}

		File file=new File(args[0]);

		System.out.println("使用的文件为");
		System.out.println(file.getAbsolutePath());

		List<String> linelist =new ArrayList<>();


		BufferedReader bReader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String context="";
		String line=null;

		while ((line=bReader.readLine())!=null) {
			if (!line.equals("")) {
				context=context+line+"\n";
				linelist.add(line);
			}
		}

		System.out.println("使用的文件内容为");
		System.out.println(context);



		String config=linelist.get(0);

		String time=config.split(" ")[0];
		String sleeptime=config.split(" ")[1];
		System.out.println("使用的等待时间为");
		System.out.println(sleeptime);
		linelist.remove(0);
		long starttime=new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").parse(time).getTime();

		while (true) {

			if (System.currentTimeMillis()>starttime) {
				System.out.println("开始");
				System.out.println(new Date());
				break;
			}

			Thread.sleep(10000);

		}

		for (int i = 0; i < linelist.size(); i++) {

			String command=linelist.get(i);
			System.out.println(i+"开始");
			System.out.println(command);
			try {
				Process process=Runtime.getRuntime().exec(command);

				new Thread() {
					public void run() {

						BufferedReader bReader=new BufferedReader(new InputStreamReader(process.getErrorStream()));
						String line=null;
						try {
							while ((line=bReader.readLine())!=null) {
								System.out.println(line);
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						}
						try {
							bReader.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					};
				}.start();

				new Thread() {
					public void run() {

						BufferedReader bReader=new BufferedReader(new InputStreamReader(process.getInputStream()));
						String line=null;
						try {
							while ((line=bReader.readLine())!=null) {
								System.out.println(line);
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						}

						try {
							bReader.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					};
				}.start();



				Thread.sleep(1000);

				process.waitFor();
				process.destroy();


			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(i+"完成");
			Thread.sleep(Integer.parseInt(sleeptime));
		}

	}

}

	
	
	

