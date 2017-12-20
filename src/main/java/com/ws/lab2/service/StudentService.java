package com.ws.lab2.service;

import java.util.List;

import com.ws.lab2.entity.Student;

public interface StudentService {
	public List<Student> getStudents();
	public Student getStudent(String code);
	public List<Student> getStudentsByCourseName(String courseName);
	public List<Student> getStudentsByProfessionName(String courseName);
	public Student saveStudent(Student student);
	public void deleteStudent(String code);
	public Boolean isExistsById(String code);
}