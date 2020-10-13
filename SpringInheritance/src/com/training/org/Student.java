package com.training.org;
import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
	private int numCourses = 0;
	private List<String> courses = new ArrayList<String>();
	private List<Integer> grades = new ArrayList<Integer>();
	
	public void addCourseGrade(String course,int grade)
	{
		courses.add(course);
		grades.add(grade);
		numCourses++;
	}
	
	public Student(String name, String address) {
		super(name, address);
	}
	public int getNumCourses() {
		return numCourses;
	}
	public List<String> getCourses() {
		return courses;
	}
	public List<Integer> getGrades() {
		return grades;
	}
	
	@Override
	public String toString() {
		return "Student [numCourses=" + numCourses + ", courses=" + courses + ", grades=" + grades + ", name=" + name
				+ ", address=" + address + "]";
	}
	
	
}
