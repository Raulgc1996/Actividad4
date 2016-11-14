package org.gonicollazo.raulTarea5.Models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
private long id;
private String name;
private String area;
private List<Patient> patients = new ArrayList<Patient>();
public Doctor(String name, String area) {
	this.name = name;
	this.area = area;
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
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public List<Patient> getPatients() {
	return patients;
}
public void setPatients(List<Patient> patients) {
	this.patients = patients;
}
public void addPa(Patient pa){
	this.patients.add(pa);
}
}
