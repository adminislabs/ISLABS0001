package studentsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentExample {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		ArrayList temp = new ArrayList();
		Student s1 = new Student("john", 12, 522);
		Student s2 = new Student("amanda", 10, 512);
		Student s3 = new Student("mary", 11, 599);
		Student s4 = new Student("johnathan", 10, 455);
		Student s5 = new Student("ram", 13, 523);
		Student s6 = new Student("mike", 12, 545);
		Student s7 = new Student("cheng", 11, 515);
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);
		arr.add(s6);
		arr.add(s7);
		// Collections.sort(arr, new SortByTotalMarks());
		// Collections.sort(arr, new SortByAge());
		Iterator it = arr.iterator();
		Iterator lt = arr.iterator();
		// Iterator kt=arr.iterator();
		// Iterator it=hs.iterator();

		int age = 100;
		int totalmarks = 0;
		while (it.hasNext()) {
			Student s = (Student) it.next();
			if (s.totalMarks > totalmarks) {
				totalmarks = s.totalMarks;
			}
			if (s.age < age) {
				age = s.age;
			}
		}

		while (lt.hasNext()) {
			Student s = (Student) lt.next();
			String name = s.name;
			char[] c = name.toCharArray();
			if (totalmarks == s.totalMarks) {
				System.out.println("Removing employee with maimum marks whose name is " + s.name + " and marks are "
						+ s.totalMarks);

			} else if (age == s.age) {
				System.out.println("Removed youngest employee whose name is " + s.name + " and age is " + s.age
						+ " and totalmarks " + s.totalMarks);

			}

			else if (c[0] == 'c') {
				System.out.println("Removed employee whose name was " + s.name + " and age " + s.age);

			} else {
				temp.add(s);
			}
		}
		Iterator kt = temp.iterator();
		while (kt.hasNext()) {
			Student st = (Student) kt.next();
			System.out.println("age " + st.age + " name " + st.name + " totalmarks " + st.totalMarks);
		}
	}

}
