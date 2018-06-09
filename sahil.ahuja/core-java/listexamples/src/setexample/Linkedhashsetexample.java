package setexample;

import java.util.LinkedHashSet;

public class Linkedhashsetexample {
	
		public static void main(String[] args)
		   {
			LinkedHashSet hs=new LinkedHashSet();
			hs.add("my");
			hs.add("name");
			hs.add("is");
			LinkedHashSet hs1=new LinkedHashSet();
			hs1.addAll(hs);
			hs1.add("sahil");
			hs1.add("ahuja");
			System.out.println(hs);
			System.out.println(hs1);
			
			
			
			
		   }
	
}
