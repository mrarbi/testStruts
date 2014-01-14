package org.test.struts.appweb;


/**
 * 
 * @author PC
 * 
 */
public class HelloWorldAction {

	private String name;

	public String execute() throws Exception {
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
