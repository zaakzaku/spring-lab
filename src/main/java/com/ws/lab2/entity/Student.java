package com.ws.lab2.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Student  implements Serializable {
	@Id
	private String code;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@ManyToMany(cascade=CascadeType.ALL)
//    @JoinTable(joinColumns = @JoinColumn(name="student_code", referencedColumnName = "code"), inverseJoinColumns = @JoinColumn(name="course_id", referencedColumnName="id"))
  //  @JsonManagedReference
	private List<Course> courses;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn
    @JsonManagedReference
    private Profession profession;

	public Student() {}

	public Student(String firstName, String lastName, String code) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.code = code;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Profession getProfession() {
		return this.profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

    public List<Course> getCourses() {
        return courses;
    }
}
