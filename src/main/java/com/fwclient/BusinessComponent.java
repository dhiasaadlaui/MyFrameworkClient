package com.fwclient;

import java.util.Iterator;
import java.util.List;

import com.fwclient.services.JobService;
import com.fwclient.services.UserService;
import com.ioc.framework.core.annotations.Autowired;
import com.ioc.framework.core.annotations.Component;
import com.ioc.framework.core.annotations.Qualifier;

@Component
public class BusinessComponent {

	@Autowired
	UserService userService;
	
	@Autowired
	@Qualifier("jobServiceImpl2")
	JobService jobService;
	
	public void ShowUserJobs() {
		List<String> jobs = jobService.getJobs();
		for (String job : jobs) {
			System.out.println(userService.getUserName() +" has applied for the job :"+job);
		}
		
		
	}
	
}
