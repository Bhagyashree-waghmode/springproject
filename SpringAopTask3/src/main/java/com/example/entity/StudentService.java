package com.example.entity;




import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	static Logger logger= Logger.getLogger(StudentService.class);
 
	private int id;
 private String name;
	public StudentService() {
		super();

	}
	public StudentService(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String applyforadmission() {
		System.out.println("ok i will applyly ");
	logger.info("done");
		return "Done";
	}


	public void aftertakingadmission() {
		logger.warn("fill properly");
		System.out.println("calling after");
	}
	
}