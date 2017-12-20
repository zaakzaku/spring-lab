package com.ws.lab2.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Profession  implements Serializable {
	@Id
	private String id;
   
	@Column
    private String name;

	@OneToOne(mappedBy = "profession",cascade=CascadeType.ALL)
	@JsonBackReference
    private Student student;

    public Profession() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAge() {
		return name;
	}

	public void setAge(String age) {
		this.name = age;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
