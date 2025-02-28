package com.first.spring.boot.project.create_RESTful_API;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course(1,"Java for Android", "Jack"),
				new Course(2,"Kotlin for Android", "me")
				);
	}
}
