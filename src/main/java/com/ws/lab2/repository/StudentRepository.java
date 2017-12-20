package com.ws.lab2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ws.lab2.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
	public List<Student> findByCoursesName(String couresName);
	public List<Student> findByProfessionName(String couresName);
}