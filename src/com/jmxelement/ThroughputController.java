package com.jmxelement;

import org.w3c.dom.Element;
import com.jmxelement.abstractelement.Controller;
import com.jmxelement.abstractelement.Sample;
import com.util.Usualutil;

public class ThroughputController extends Controller{

	public ThroughputController() {
		super();
	}
	
	@Override
	public Element getElement() {
		
		Element element=Usualutil.getDocument().createElement("ThroughputController");
		return element;

	}
	
	@Override
	public ThroughputController addSample(Sample sample) {
		
		this.element.appendChild(sample.element);
		return this;
	}

	
}
