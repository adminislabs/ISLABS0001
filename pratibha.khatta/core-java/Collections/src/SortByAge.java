import java.util.Comparator;

public class SortByAge implements Comparator<Students> {

	@Override
	public int compare(Students s1, Students s2) {
		return s1.age - s2.age;
	}
}