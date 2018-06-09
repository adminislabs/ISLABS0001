package studentsorting;

import java.util.Comparator;

public class SortByTotalMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.totalMarks - o1.totalMarks;

	}

}
