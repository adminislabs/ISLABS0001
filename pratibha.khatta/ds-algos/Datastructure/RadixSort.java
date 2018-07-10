
public class RadixSort
{
	public static final int max = 10;
	private static int infinity = 99999;
	
	public static void main(String[] args){
		
		int[] toSortArray = new int[max];
		
		//Required Things
		
			int[][] matrix = new int[max][max];
			int[] bucketCounter = new int[max];
		
		//End 
		
		for(int i = 0; i < max; i++){
			
			toSortArray[i] = (int) (Math.random()*100);
			bucketCounter[i] = 0;
			
			for(int j = 0; j < max; j++){
				
				matrix[i][j] = infinity ;
				
			}
			
		}
		
		System.out.println("The array to be sorted is:");
		
		for(int i = 0; i < max; i++){
			
			System.out.print(" | " + toSortArray[i]);
		}
		System.out.println(" | ");

		//Start
		
		//Find the length of the largest element
		
		int maxNum = 0;
		for(int i = 0 ; i < max ; i++){
			
			if(maxNum < toSortArray[i]){
				
				maxNum = toSortArray[i];
				
			}
			
		}
		
		int length = 0;
		
		while(maxNum!=0){
			
			length++;
			maxNum = maxNum/10;
			
		}
		
		System.out.println("The longest number is of " + length + " digits!");
		
		//Put the values in the buckets
		
		int placementIndex = 0;
		int placementCounter = 1;
		int arrayValue;
		
		while(length!=0){
			
			//Get the last digit of the element and place it
		
			
			for(int i = 0; i < max; i++){
				
				arrayValue = toSortArray[i];
				
				for(int count = placementCounter; count != 0; count--){
					
					placementIndex = arrayValue%10;
					arrayValue = arrayValue/10;
					
				}
				
				// placement index holds the value for the bucket
				
				matrix[placementIndex][bucketCounter[placementIndex]] = toSortArray[i];
				bucketCounter[placementIndex]++;
				
			}
			
			System.out.println();
			
			for(int j = 0; j < max; j++){
				
				System.out.print("|");
				
				for(int k = 0; k < max; k++){
					
					System.out.print(matrix[j][k] + "|");
					
				}
				
				System.out.println();
				
			}
			
			System.out.println();
			
			//fill the array!
			
			int horIndex = 0;
			int verIndex = 0;
			
			for(int i = 0; i < max; i++){
			
				while(matrix[verIndex][horIndex]==infinity){
					
					verIndex++;
					horIndex = 0;
					
				}
				
				toSortArray[i] = matrix[verIndex][horIndex];
				horIndex++;
	
			}
			
			System.out.println();
			
			for(int j = 0; j < max; j++){
					
					System.out.print("|" + toSortArray[j]);
				
			}
			
			System.out.println("|");
			
			for(int i = 0; i < max; i++){
				
				bucketCounter[i] = 0;
				
				for(int j = 0; j < max; j++){
					
					matrix[i][j] = infinity;
					
				}
				
			}
			
			length--;
			placementCounter++;
		
		}
		
		//End
		
		System.out.println("The sorted array is: ");
		
		for(int i = 0; i < max; i++){
			
			System.out.print(" | " + toSortArray[i]);
		}
		
		System.out.println(" | ");
		
	}

	
}


}
