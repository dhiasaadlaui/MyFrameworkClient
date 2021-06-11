package com.fwclient.services;

import java.util.ArrayList;
import java.util.List;

import com.ioc.framework.core.annotations.Component;


public class JobServiceImpl2 implements JobService {

	public List<String> getJobs() {
		List<String> jobs = new ArrayList<String>();
		jobs.add("job from impl2");
		jobs.add("job from impl2");
		jobs.add("job from impl2");
		return jobs;
	}

}
