package inheritance;

public class ScientificCalculator extends BasicCalculator {
	public int sum(int... num){
		int  sum=0;
		for(int i=0;i<num.length;i++){
			sum=sum+num[i];
			
		}
		return sum;
	}
	public int sub(int... num){
		int  sub=num[0];
		for(int i=1;i<num.length;i++){
			sub=sub-num[i];
			
		}
		return sub;
	}
	public int multiply(int... num){
		int  multi=1;
		for(int i=0;i<num.length;i++){
			multi=multi*num[i];
			
		}
		return multi;
	}
	public int divide(int... num){
		int  div=num[0];
		for(int i=1;i<num.length;i++){
			div=div/num[i];
			
		}
		return div;
	}
	

}
