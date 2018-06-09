package threadProducerConsumer;

public class GenerateFiboNumber {
	int[] fib=new int[50];
 	public int generate(int j){
 		fib[0]=fib[1]=1;
		for(int i=2;i<=48;i++){
			fib[i]=fib[i-1]+fib[i-2];
			
		}
		return fib[j];
	}

}
