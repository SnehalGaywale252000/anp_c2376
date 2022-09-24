package org.practicaltest.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student>{
private String name;
private String deptName;
private LocalDate dob;
public Student(String name, String deptName, LocalDate dob) {
	super();
	this.name = name;
	this.deptName = deptName;
	this.dob = dob;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}

@Override
public int hashCode() {
	return Objects.hash(deptName, dob, name);
}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return 0;
}

}