package org.practicaltest.service;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import org.practicaltest.model.Student;
public class StudentInfo {

	public static void storeinfo(String name,String dept , String date,TreeSet<Student>stdInfo  ) {
	//	LocalDate dob=LocalDate.parse(date);
		LocalDate dob=LocalDate.parse(date);
		Student stud= new Student(name,dept,dob);
		stdInfo.add(stud);
		
		
	}
	public static void printStudents(TreeSet<Student> st) {
		Iterator<Student> IR=st.iterator();
		Student s= null;
		try {
			while((s=IR.next())!=null) {
				System.out.println(s);
			}
		}catch(NoSuchElementException e) {
			System.out.println("Done");
		}
	}
}
