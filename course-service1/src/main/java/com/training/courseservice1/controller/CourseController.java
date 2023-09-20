package com.training.courseservice1.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.courseservice1.intercomm.StudentClient;
import com.training.courseservice1.model.Course;
import com.training.courseservice1.model.Student;
import com.training.courseservice1.repository.CourseRepository;
 
@RestController
@RequestMapping("/courseapi")
public class CourseController {
	
	@Autowired
	CourseRepository repository;
	
	@Autowired
	StudentClient studClient;
	//@GetMapping("/course")
//	public List<Course> getCourse()
//	{
//		//List<Course> courseList = new ArrayList<>();
//		//courseList.add(new Course("OS", 3));
//		//courseList.add(new Course("DBMS",4));
//	    //return courseList;
//		return repository.findAll();
//	}
//	
	
	@GetMapping("/course")
	public ResponseEntity<List<Course>> getCourses(){
		List<Course> courseList = repository.findAll();
		return new ResponseEntity<>(courseList, HttpStatus.OK);
	}
//	@PostMapping("/post")
//	public void post(@RequestBody Course course)
//	{
//		repository.save(course);
//	}
 // to post data in other format
	@PostMapping("/post")
	public ResponseEntity addCourse(@RequestBody Course course)
	{
		return new ResponseEntity(repository.save(course), HttpStatus.CREATED);
	}
	
	@GetMapping("/service/stud/{studId}")
	public Student getStud(@PathVariable int studId)
	{
		return studClient.getStudent(studId);
	}
}
