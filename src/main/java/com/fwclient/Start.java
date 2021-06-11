package com.fwclient;

import com.ioc.framework.core.MyFrameworkApplication;

public class Start {

	public static void main(String[] args) {

		MyFrameworkApplication.startApplication(Start.class);
		
		MyFrameworkApplication.getComponent(BusinessComponent.class).ShowUserJobs();
	
	}

}
