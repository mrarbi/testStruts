package org.test.struts.appweb;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * 
 * @author PC
 * 
 */
public class HelloWorldAction {

	Logger logger = LogManager.getLogger(HelloWorldAction.class.getName());

	private String name;

	public String execute() throws Exception {
		try {
			throw new Exception("test for exception");
		} catch (Exception e) {
			logger.error(e);
		}
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
