import java.util.Comparator;

public class Arrange implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Info ii =(Info) o1;
		Info i1= (Info) o2;
		
		
		
		// TODO Auto-generated method stub
		return (ii.id-i1.id) ;

	
	
	}

}
