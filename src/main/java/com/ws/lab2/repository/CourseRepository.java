package com.ws.lab2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ws.lab2.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

}