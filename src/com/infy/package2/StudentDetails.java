package com.infy.package2;

import com.infy.package1.Student;

public class StudentDetails {
	public void calculatePercentage(Student student) {
		var percentage = (student.getTotalMarksObtained()/student.totalMarks)*100;
		System.out.println("Student Percentage: " + percentage + "%");
	};
	
	public void displayStudentDetails(Student s) {
		System.out.println("Student Details: ");
		System.out.println("Student ID: " + s.getStudentId());
		System.out.println("Student Name: " + s.studentName);
		System.out.println("Student Marks: " + s.getTotalMarksObtained());
		System.out.println("Total Marks: " + s.totalMarks);		
	};
	
}
