import java.util.Collections;
import java.util.LinkedList;

public class Testy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList<Info> ll = new LinkedList<Info>();
	 Info i1 =new Info(2,3);
	 Info i2= new Info(5,2);
	 ll.add(i1);
	 ll.add(i2);
Collections.sort(ll, new Arrange());
for (Info rr:ll) {
	System.out.println(rr.data + "   "+rr.id );
}

	 
	 
 
	}

}
