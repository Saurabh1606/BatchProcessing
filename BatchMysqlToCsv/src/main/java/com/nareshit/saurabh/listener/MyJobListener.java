package com.nareshit.saurabh.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution je) {
		System.out.println("Starting : " +je.getStatus());

	}

	@Override
	public void afterJob(JobExecution je) {
		System.out.println("Starting : " +je.getStatus());

	}

}
