import java.util.Comparator;

public class SortByTotalMarks implements Comparator<Students> {

	@Override
	public int compare(Students s1, Students s2) {
		return s2.totalMarks - s1.totalMarks;

	}

}