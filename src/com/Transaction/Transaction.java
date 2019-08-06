package com.Transaction;

import java.util.Map;

import org.apache.jmeter.samplers.SampleResult;

public abstract class Transaction {

	
	public abstract SampleResult run(Map map) throws Exception;
	
}
