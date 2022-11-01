package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.StudentService;


@Component
public class CollegeService {
	

	public void selectingbrachmethod() {
		System.out.println("calling after student admission");
	}

	public void providingopportunity() {
		System.out.println("THANK YOU");
		
	}
}
