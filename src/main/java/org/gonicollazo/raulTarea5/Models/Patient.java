package org.gonicollazo.raulTarea5.Models;

import java.util.ArrayList;
import java.util.List;

public class Patient {
private long id;
private String name;
private String sex;
private List<Doctor> doctors = new ArrayList<Doctor>();
public Patient(String name, String sex) {
	this.name = name;
	this.sex = sex;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public List<Doctor> getPatients() {
	return doctors;
}
public void setPatients(List<Doctor> doctors) {
	this.doctors = doctors;
}
public void addDoctor(Doctor doc){
	this.doctors.add(doc);
}
}
