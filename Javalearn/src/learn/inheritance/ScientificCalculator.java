package learn.inheritance;

	public class ScientificCalculator extends BasicCalculator {
		public int sum (int... num) {
			int sum=0;
			for (int i=0;i<num.length;i++) {
				sum=sum+num[i];
			}
			return(sum);
		}

		

			public int multiply (int... num){
				int multiply =1;
				for (int i=1;i<num.length;i++) {
					multiply=multiply*num[i];
				}
				return (multiply);
				
			
			}
			
			
		}

