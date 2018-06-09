package accessModifiers;

public class OneObjectClass {
	private static OneObjectClass oc=null;
	public int x;
	private OneObjectClass(){
		x=5;
	}
	public static OneObjectClass getinstance(){
		if(oc==null){
			oc=new OneObjectClass();
		}
		return oc;
	}
}
