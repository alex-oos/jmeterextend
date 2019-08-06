package com.jmxelement;

import org.w3c.dom.Element;
import com.jmxelement.abstractelement.Listener;
import com.jmxelement.abstractelement.Plan;
import com.jmxelement.abstractelement.ThreadGroup;
import com.util.Usualutil;

public class TestPlan extends Plan{

	public TestPlan() {
		super();
	}
	
	@Override
	public TestPlan addListener(Listener listener) {
		this.element.appendChild(listener.element);
		return this;
	}

	@Override
	public Element getElement() {
		Element element=Usualutil.getDocument().createElement("TestPlan");
		return element;
	}

	@Override
	public TestPlan addThreadGroup(ThreadGroup threadGroup) {
		this.element.appendChild(threadGroup.element);
		return this;
	}

}
