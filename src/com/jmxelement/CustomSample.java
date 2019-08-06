package com.jmxelement;

import org.w3c.dom.Element;

import com.jmxelement.abstractelement.Sample;
import com.util.Usualutil;

public class CustomSample extends Sample{

	
	
	public CustomSample() {
		super();
	}
	
	
	@Override
	public Element getElement() {
		Element element=Usualutil.getDocument().createElement("JavaSampler");
		return element;
	}

	
	
	
	
	
	
	
}
