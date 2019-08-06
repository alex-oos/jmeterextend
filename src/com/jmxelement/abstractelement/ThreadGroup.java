package com.jmxelement.abstractelement;

public abstract class ThreadGroup extends JmxElement{

	
	public ThreadGroup() {
		super();
	}
	
	
	public abstract ThreadGroup addController(Controller controller);
	
	public abstract ThreadGroup addSample(Sample sample);
	
	
	
	
	
}
