package com.example.fuse;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CamelProcess implements Processor {

	private static final Logger LOG= LoggerFactory.getLogger(CamelProcess.class);
	@Override
	public void process(Exchange arg0) throws Exception {
		// TODO Auto-generated method stub
		String body=arg0.getIn().getBody(String.class);
		LOG.info("Java  method invoked"+body);
		
	}

}
