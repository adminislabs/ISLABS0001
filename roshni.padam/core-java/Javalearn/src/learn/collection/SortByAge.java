package learn.collection;

import java.util.Comparator;

public class SortByAge implements Comparator<Student>{

	

	@Override
	public int compare(Student  o1, Student o2) {
		
		return o2.age-o1.age;
	}

}
