package com.ws.lab2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.lab2.entity.Course;
import com.ws.lab2.entity.Profession;
import com.ws.lab2.repository.CourseRepository;
import com.ws.lab2.repository.ProfessionRepository;

@Service
public class ProfessionServiceImpl implements ProfessionService{
	@Autowired
	ProfessionRepository bookRepository;

	@Override
	public Profession saveProfession(Profession course) {
		return bookRepository.save(course);
	}

	@Override
	public List<Profession> getProfession() {
		return bookRepository.findAll();
	}
}
