import java.util.Comparator;

public  class Sort implements Comparator {

	
	@Override
	public int compare(Object o1, Object o2) {
		Data d1=(Data)o1;
		Data d2=(Data)o2;
		
		
		return d1.id-d2.id;
	}

	
	}
	

