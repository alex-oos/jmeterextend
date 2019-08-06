package com.runner;

import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public abstract class Runner {

	public abstract SampleResult  run(JavaSamplerContext context) throws Exception;
	
}
