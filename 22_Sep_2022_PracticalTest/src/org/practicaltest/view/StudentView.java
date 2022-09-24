package org.practicaltest.view;
//package org.practicaltest.view;
//import org.practicaltest.service.StudentInfo;
import java.util.TreeSet;

import org.practicaltest.service.StudentInfo;

import java.util.Scanner;
 public class StudentView {
	static String name;

	static String deptName;
	static String dob;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		TreeSet<org.practicaltest.model.Student> stdInfo=new TreeSet<>();
		System.out.println("================Student Information=================");
		for(int i=1;i<=10;i++) {
			System.out.println(i+"name");
			name=sc.next();
			
			System.out.println(i+"Department");
			deptName=sc.next();
			System.out.println(i+"dob");
			dob=sc.next();
			StudentInfo.storeinfo(name,  deptName, dob, stdInfo);
		}
		StudentInfo.printStudents(stdInfo);
	}
	

	

}
