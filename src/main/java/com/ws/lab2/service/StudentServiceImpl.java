package com.ws.lab2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.lab2.entity.Student;
import com.ws.lab2.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent(String code) {
		return studentRepository.getOne(code);
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	
	

	@Override
	public List<Student> getStudentsByCourseName(String courseName) {
		return studentRepository.findByCoursesName(courseName);
	}

	@Override
	public void deleteStudent(String code) {
		studentRepository.delete(code);
	}

	@Override
	public Boolean isExistsById(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentsByProfessionName(String courseName) {
		// TODO Auto-generated method stub
		return studentRepository.findByProfessionName(courseName);
	}
}