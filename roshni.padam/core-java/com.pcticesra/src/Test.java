import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	

	public static void main(String[] args) {
		
	ArrayList <Data> rr=new ArrayList<Data>();
		
		Data d1 =new Data(7, "rosh");
		Data d2 =new Data(5,"rish");
		Data d3 =new Data(3, "shaurya");
		rr.add(d1);
		rr.add(d2);
		rr.add(d3);
		for(Data tt:rr)
		{
			System.out.println(tt.id +"  " + tt.name);
			
		}
		
		Collections.sort(rr, new Sort());
		for(Data tt:rr)
		{
			System.out.println(tt.id +"  " + tt.name);
			
		}
		
		
		
	}

}
