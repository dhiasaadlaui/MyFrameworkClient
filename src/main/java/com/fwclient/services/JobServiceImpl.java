package com.fwclient.services;

import java.util.ArrayList;
import java.util.List;

import com.ioc.framework.core.annotations.Component;


public class JobServiceImpl implements JobService {

	
	public List<String> getJobs() {
		// TODO Auto-generated method stub
		List<String> jobs = new ArrayList<String>();
		jobs.add("Data scientist");
		jobs.add("Business Analyst");
		jobs.add("Software Developer");
		return jobs;
	}

}
