package setexample;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
class Book
{
	String title;
	int price;
	public Book(String title,int price)
	{
		this.title=title;
		this.price=price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	
}
class Mycomparator implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		Book b1=(Book)ob1;
		Book b2=(Book)ob2;
		if(b1.price<b2.price)
			return(-1);
		else
			return(1);
		
		
	}
}

public class Treesetexample {
	public static void main(String[] args)
	{
	Book b1= new Book("php",300);
	Book b2= new Book("c",500);
	Book b3= new Book("java",400);
	TreeSet t=new TreeSet(new Mycomparator());
	t.add(b1);
	t.add(b2);
	t.add(b3);
	Iterator it=t.iterator();
	while(it.hasNext())
	{
		Book b=(Book)it.next();
		System.out.println(b.title+"    "+b.price);
	}
	
	
	}


}
