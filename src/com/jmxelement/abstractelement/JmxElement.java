package com.jmxelement.abstractelement;

import org.w3c.dom.Element;

public abstract class JmxElement {

	public Element element;
	public JmxElement() {
		element=getElement();
	}
	public abstract Element getElement() ;
	
	
	public Element toElement(){
		
	return element;
	
	}

	
	public void fromElement(JmxElement jmxelement){
		
		this.element=(Element) jmxelement.element.cloneNode(true);
	
	}
	
}



