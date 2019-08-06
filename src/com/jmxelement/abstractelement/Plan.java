package com.jmxelement.abstractelement;

import com.jmxelement.TestPlan;

public abstract class Plan extends JmxElement{

	public Plan() {
		super();
	}
	public abstract TestPlan addThreadGroup(ThreadGroup threadGroup);
		
	public abstract TestPlan addListener(Listener listener);
	
	
	
	
}
