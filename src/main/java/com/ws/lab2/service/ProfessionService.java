package com.ws.lab2.service;

import java.util.List;

import com.ws.lab2.entity.Course;
import com.ws.lab2.entity.Profession;
import com.ws.lab2.entity.Student;

public interface ProfessionService {
	public Profession saveProfession(Profession profession);
	public List<Profession> getProfession();
}
