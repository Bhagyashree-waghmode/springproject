package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.entity.StudentService;
import com.example.service.CollegeService;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class App {

	public static void main(String[] args)

	{
		System.out.println("Hello World!");
		ApplicationContext app = new AnnotationConfigApplicationContext(App.class);
		StudentService stu = app.getBean(StudentService.class);
		stu.applyforadmission();
		// stu.aftertakingadmission();
		/*
		 * StudentService a= new StudentService(); a.setId(123); a.setName("kili");
		 */

		CollegeService cs = app.getBean(CollegeService.class);
		cs.providingopportunity();

	}
}
