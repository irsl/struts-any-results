package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Random;

public class MainAction extends ActionSupport {
	
	private final static Random rnd = new Random();
	private final static String expectedAccessCode = ""+(rnd.nextInt()+100000)+(rnd.nextInt()+100000)+(rnd.nextInt()+100000)+(rnd.nextInt()+100000)+(rnd.nextInt()+100000);
	
	private String accessCode;
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	public String getAccessCode() {
		return accessCode;
	}

	public String execute() throws Exception {
		if(expectedAccessCode.equals(accessCode))
			return "confidential";
		else
		if(accessCode != null)
			this.addActionError("Invalid access code provided!");
				
		return "login";
	}
	
}
