package learn.acessmodifiers;

public class Protected {
protected int a=10;
//protected variables or method only 
//access through another class by inheritance 

class Test extends Protected{
	public void main(String args[]){
		Test t=new Test();
		System.out.println(a);
	}
}

}
