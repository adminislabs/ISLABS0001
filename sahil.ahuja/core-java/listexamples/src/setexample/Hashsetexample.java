package setexample;

import java.util.HashSet;

public class Hashsetexample {
	public static void main(String[] args)
	   {
		HashSet hs=new HashSet();
		hs.add("my");
		hs.add("name");
		hs.add("is");
		HashSet hs1=new HashSet();
		hs1.addAll(hs);
		hs1.add("sahil");
		hs1.add("ahuja");
		System.out.println(hs);
		System.out.println(hs1);
		
		
		
		
	   }
	

}
