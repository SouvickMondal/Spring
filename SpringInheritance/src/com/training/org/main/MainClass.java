package com.training.org.main;

import com.training.org.Student;
import com.training.org.Teacher;

public class MainClass {

	public static void main(String[] args) {
		Student studentObj = new Student("Souvick Mondal","Kolkata");
		studentObj.addCourseGrade("CSE", 94);
		studentObj.addCourseGrade("INT", 85);
		System.out.println(studentObj);
		Teacher teacherObj = new Teacher("Ravi Kant Sahu","Patna");
		teacherObj.addCourse("Programmimg");
		System.out.println(teacherObj);
	}

}