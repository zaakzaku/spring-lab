package com.ws.lab2.controller;

import java.io.Console;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ws.lab2.entity.Course;
import com.ws.lab2.entity.Student;
import com.ws.lab2.service.StudentService;

@Controller
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;

	public StudentController() {}

	@RequestMapping(value="/course/{name}/", method=RequestMethod.GET)
	@ResponseBody
	public List<Student> studentsList(@PathVariable("name") String name) {
		if (name != null) {
			return studentService.getStudentsByCourseName(name);
		}
		return studentService.getStudents();
	}

	@RequestMapping(value="/profession/", method=RequestMethod.GET)
	@ResponseBody
	public List<Student> studentsListProp(@PathVariable("name") String name) {
		if (name != null) {
			return studentService.getStudentsByProfessionName(name);
		}
		return studentService.getStudents();
	}
	@RequestMapping(value="/profession/{name}/", method=RequestMethod.GET)
	@ResponseBody
	public List<Student> studentsListPro(@PathVariable("name") String name) {
		if (name != null) {
			return studentService.getStudentsByProfessionName(name);
		}
		return studentService.getStudents();
	}

	
	@RequestMapping(value="/", method=RequestMethod.POST)
	@ResponseBody
	public Student studentsCreate(@RequestBody Student course) {
		return studentService.saveStudent(course);
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public List<Student>  studentAll() {
		return studentService.getStudents();
	}
	@RequestMapping(value="/{code}/", method=RequestMethod.GET)
	@ResponseBody
	public Student studentDetail(@PathVariable("code") String code) {
		return studentService.getStudent(code);
	}
	
	//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	@RequestMapping(value="/{code}/", method=RequestMethod.DELETE)
	@ResponseBody
	public void studentDelete(@PathVariable("code") String code) {
		studentService.deleteStudent(code);
		
	}
}