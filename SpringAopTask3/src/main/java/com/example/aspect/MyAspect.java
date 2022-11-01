package com.example.aspect;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class MyAspect {
	static Logger logger = Logger.getLogger(MyAspect.class);
	// instance initilizer block
	
	 { 
		 BasicConfigurator.configure(); 
	 }
	 

	@Pointcut("execution(public String com.example.entity.StudentService.applyforadmission())")
	public void insertmethod1() {

	}

	@Before("insertmethod1()")
	public void givingadmission() {
		logger.info("Before applying for admission ");

		// System.out.println("Before applying for admission ");
	}

	@Pointcut("execution(public void com.example.service.CollegeService.providingopportunity())")
	public void insertmethod() {
	}

	@After("insertmethod()")
	public void youhavebrightfuture() {
		logger.debug("ALL THE BEST");
		logger.warn("warn level");
		logger.error("error level message");
		logger.fatal("fatal level message");

		// System.out.println("ALL THE BEST");
	}
	@AfterReturning(pointcut="insertmethod1()",returning="data")
	public void returnme(String data) {
		System.out.println(data);
	}
	
}
