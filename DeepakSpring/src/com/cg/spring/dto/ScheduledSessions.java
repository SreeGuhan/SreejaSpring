package com.cg.spring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class ScheduledSessions {
	@Id
	@Column(name="id")
	@NotNull(message="Id field will not be empty")
	int id;
	@Column(name="name")
	@NotNull(message="Name should not empty")
	String name;
	@Column(name="duration")
	int duration;
	@Column(name="faculty")
	String faculty;
	
	@Column(name="mode1")
	String mode1;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getMode1() {
		return mode1;
	}

	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", name=" + name + ", duration=" + duration + ", faculty=" + faculty + ", mode1="
				+ mode1 + "]";
	}
	
	
	
}