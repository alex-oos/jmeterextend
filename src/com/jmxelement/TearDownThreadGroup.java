package com.jmxelement;

import org.w3c.dom.Element;

import com.jmxelement.abstractelement.Controller;
import com.jmxelement.abstractelement.Sample;
import com.jmxelement.abstractelement.ThreadGroup;
import com.util.Usualutil;
public class TearDownThreadGroup extends ThreadGroup{

	public TearDownThreadGroup() {
		super();
	}
	@Override
	public ThreadGroup addController(Controller controller) {
		this.element.appendChild(controller.element);
		return this;
	}

	
	@Override
	public Element getElement() {
		Element element=Usualutil.getDocument().createElement("PostThreadGroup");
		return element;
	}


	@Override
	public ThreadGroup addSample(Sample sample) {
		this.element.appendChild(sample.element);
		return this;
	}

	
	
	
	
}
