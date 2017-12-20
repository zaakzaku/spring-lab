package com.ws.lab2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.lab2.entity.Course;
import com.ws.lab2.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository bookRepository;

	@Override
	public Course saveCourse(Course course) {
		return bookRepository.save(course);
	}

}
