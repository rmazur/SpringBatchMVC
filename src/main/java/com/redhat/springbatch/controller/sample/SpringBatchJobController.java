package com.redhat.springbatch.controller.sample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class SpringBatchJobController extends AbstractController{

	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("contextFromFileToFile.xml");
		ModelAndView model = new ModelAndView("LaunchJobsPage");
		model.addObject("msg", "Access this page to run Spring Batch jobs");
		JobLauncher jobLauncher = (JobLauncher) applicationContext.getBean("jobLauncher");
    	Job simpleJob = (Job) applicationContext.getBean("simpleJob"); 
        jobLauncher.run(simpleJob, new JobParameters());
      	return model;
	}
    
    

}
