package com.ws.lab2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ws.lab2.entity.Course;
import com.ws.lab2.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseService bookService;
	public void Bookcontroller() {}

	@RequestMapping(value="/", method=RequestMethod.POST)
	@ResponseBody
	public Course studentsCreate(@RequestBody Course course) {
		return bookService.saveCourse(course);
	}
}
