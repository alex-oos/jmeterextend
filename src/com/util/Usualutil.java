package com.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.threads.JMeterContext;
import org.apache.jmeter.threads.JMeterContextService;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Usualutil {

	static Document document=null;
	
	
	static {
		try {
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void init() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		document = builder.newDocument();
	}
	
	
	public static Document getDocument()  {
		return document;
	}

	public static Element xmlToElement(String xml) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document=	builder.parse(new ByteArrayInputStream(xml.getBytes()));
		
		return null;
	}

	public static String elementToXml(Node element) throws Exception {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		document = builder.newDocument();
		document.adoptNode(element);
		document.appendChild(element);
		
		//document.setXmlStandalone(false);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		DOMSource source = new DOMSource(document);
		transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		//transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
		StreamResult result = new StreamResult(byteArrayOutputStream);
		
		transformer.transform(source, result);
		//System.out.println("生成XML文件成功!");
		
		return byteArrayOutputStream.toString();
	}
	
	public static JMeterContext name() {
		//JMeterContextService
		return JMeterContextService.getContext();
	}
	
	public static String getResponseHeaders(HttpURLConnection conn) {
        StringBuilder headerBuf = new StringBuilder();
        headerBuf.append(conn.getHeaderField(0));// Leave header as is
        headerBuf.append("\n"); //$NON-NLS-1$

        String hfk;
        for (int i = 1; (hfk=conn.getHeaderFieldKey(i)) != null; i++) {
            headerBuf.append(hfk);
            headerBuf.append(": "); // $NON-NLS-1$
            headerBuf.append(conn.getHeaderField(i));
            headerBuf.append("\n"); // $NON-NLS-1$
        }
        return headerBuf.toString();
    }
	
	public static String getRequestProperties(HttpURLConnection conn) {
        StringBuilder headerBuf = new StringBuilder();
        Map map=conn.getRequestProperties();
        headerBuf.append(conn.getRequestMethod()+" "+conn.getURL());
        headerBuf.append("\n"); //$NON-NLS-1$
       
		for (Entry entry : (Set<Entry>)map.entrySet()) {
			headerBuf.append(entry.getKey());
            headerBuf.append(": "); // $NON-NLS-1$
            
            headerBuf.append((entry.getValue().toString()).substring(1, (entry.getValue().toString()).length()-1));
            headerBuf.append("\n"); // $NON-NLS-1$
		}
        return headerBuf.toString();
    }
	
	public static String exceptionToString(Exception e) {
		ByteArrayOutputStream byteArrayOutputStream =new ByteArrayOutputStream();
		
		e.printStackTrace(new PrintStream(byteArrayOutputStream));
		
		return byteArrayOutputStream.toString();
	}
//	String cn = "你";
//    System.out.println(cnToUnicode(cn));
//     字符串 : \u5f00\u59cb\u4efb\u52a1 ，由于 \ 在java里是转义字符，要写出下面这种形式
//    String unicode = "\\u4f60";
//    System.out.println(unicodeToCn(unicode));
	public static String unicodeToCn(String unicode) {
        /** 以 \ u 分割，因为java注释也能识别unicode，因此中间加了一个空格*/
        String[] strs = unicode.split("\\\\u");
        String returnStr = "";
        // 由于unicode字符串以 \ u 开头，因此分割出的第一个字符是""。
        for (int i = 1; i < strs.length; i++) {
          returnStr += (char) Integer.valueOf(strs[i], 16).intValue();
        }
        return returnStr;
    }
     
	 public static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
          returnStr += "\\u" + Integer.toString(chars[i], 16);
        }
        return returnStr;
    }
	
	public static SampleResult creatsample(String label) {
		SampleResult sampleResult=new SampleResult();
		sampleResult.setSampleLabel(label);
		sampleResult.sampleStart();
		sampleResult.sampleEnd();
		sampleResult.setSuccessful(false);
		return sampleResult;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		System.out.println(Integer.MAX_VALUE);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		document = builder.newDocument();
		Element aElement= document.createElement("ss");
		
		System.out.println(elementToXml(aElement));
		
	
	}

	
}
