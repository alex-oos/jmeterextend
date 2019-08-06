package com.request;

import org.apache.jmeter.samplers.SampleResult;

import java.util.Map;

/**
 * @author lijiang
 * @date 2019/1/8 - 下午 4:36
 */
public abstract class Request {
    public abstract SampleResult run(Map map) throws Exception ;
}
