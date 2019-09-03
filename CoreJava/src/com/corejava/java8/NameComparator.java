package com.corejava.java8;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		//return s1.getStudentName().compareTo(s2.getStudentName());
		return s2.getStudentName().compareTo(s1.getStudentName());
	}

}
