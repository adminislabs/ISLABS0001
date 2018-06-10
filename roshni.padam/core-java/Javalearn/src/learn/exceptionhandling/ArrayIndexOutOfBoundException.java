package learn.exceptionhandling;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
	
		try{int[] array={0,1,2,3,4};
		System.out.println(array[6]);
		}
		catch(ArrayIndexOutOfBoundsException  e){
			System.out.println(e);
			
		}
	}

}
