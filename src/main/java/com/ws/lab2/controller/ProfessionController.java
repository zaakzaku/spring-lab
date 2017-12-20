package com.ws.lab2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ws.lab2.entity.Course;
import com.ws.lab2.entity.Profession;
import com.ws.lab2.entity.Student;
import com.ws.lab2.service.CourseService;
import com.ws.lab2.service.ProfessionService;

@Controller
@RequestMapping("/profession")
public class ProfessionController {

	@Autowired
	ProfessionService bookService;

	public void Bookcontroller() {}

	@RequestMapping(value="/", method=RequestMethod.POST)
	@ResponseBody
	public Profession studentsCreate(@RequestBody Profession course) {
		return bookService.saveProfession(course);
	}
	@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public List<Profession>  professiontAll() {
		return bookService.getProfession();
	}
	
}
