package studentsorting;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	String name;
	int age;
	int totalMarks;
	public Student(String name,int age,int totalMarks){
		this.age=age;
		this.name=name;
		this.totalMarks=totalMarks;
		
	}
	@Override
	public int compare(Student s1, Student s2) {
		return s1.age - s2.age;
	}

}
