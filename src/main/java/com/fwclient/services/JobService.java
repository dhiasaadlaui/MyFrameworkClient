package com.fwclient.services;

import java.util.List;

import com.ioc.framework.core.annotations.Service;

@Service
public interface JobService {

	List<String> getJobs();
	
}
