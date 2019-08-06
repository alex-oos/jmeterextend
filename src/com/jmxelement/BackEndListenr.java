package com.jmxelement;

import org.w3c.dom.Element;
import com.jmxelement.abstractelement.Listener;
import com.util.Usualutil;

public class BackEndListenr extends Listener{

	
	
	
	public BackEndListenr() {
		super();
	}
	
	@Override
	public Element getElement() {
		Element element=Usualutil.getDocument().createElement("BackendListener");
		return element;
	}

	

	
	
	
	
}
