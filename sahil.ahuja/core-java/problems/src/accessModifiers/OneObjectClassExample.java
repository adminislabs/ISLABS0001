package accessModifiers;

public class OneObjectClassExample {

	public static void main(String[] args) {
		OneObjectClass oc1=OneObjectClass.getinstance();
		OneObjectClass oc2=OneObjectClass.getinstance();
		OneObjectClass oc3=OneObjectClass.getinstance();
		System.out.println("Without change in value of x in any object");
		System.out.println("First object value "+oc1.x);
		System.out.println("Second object value "+oc2.x);
		System.out.println("Third object value "+oc3.x);
		oc1.x=1;
		System.out.println("After change in value of x in first object");
		System.out.println("First object value "+oc1.x);
		System.out.println("Second object value "+oc2.x);
		System.out.println("Third object value "+oc3.x);
		oc2.x=2;
		System.out.println("After change in value of x in Second object");
		System.out.println("First object value "+oc1.x);
		System.out.println("Second object value "+oc2.x);
		System.out.println("Third object value "+oc3.x);
		oc3.x=3;
		System.out.println("After change in value of x in Third object");
		System.out.println("First object value "+oc1.x);
		System.out.println("Second object value "+oc2.x);
		System.out.println("Third object value "+oc3.x);
	}

}
