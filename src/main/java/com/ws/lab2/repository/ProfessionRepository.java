package com.ws.lab2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.lab2.entity.Course;
import com.ws.lab2.entity.Profession;
import com.ws.lab2.entity.Student;

public interface ProfessionRepository  extends JpaRepository<Profession, String> {

}
