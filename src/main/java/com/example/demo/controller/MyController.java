package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@RestController
public class MyController {
	
	@Autowired
	StudentRepository studentRepos;
	
	@GetMapping("/abcd")
	public String Hello() {
		Student obj=new Student();
		obj.setName("maisum");
		obj.setAge(12);
		studentRepos.save(obj);
		return "javid iqbal";
		
	}
}
