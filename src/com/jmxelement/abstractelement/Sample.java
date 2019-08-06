package com.jmxelement.abstractelement;

public abstract class Sample extends JmxElement{

	
	public Sample() {
		super();
	}
	
	//mb/s
	int Speed=10;
	

	public void setNetSpeed(int speed) {
		this.Speed=speed;
	}
	
}
