package radixSort;
import java.util.Scanner;

/**
 * Thisclass has the main method and main method takes the input from the user
 * in array and sorts that array
 * 
 * @author sahil
 * 
 */
public class RadixSortExample {

	public static void main(String[] args) {
		RadixSort rs = new RadixSort();
		Scanner scan = new Scanner(System.in);
		System.out.println("Radix Sort Test\n");
		int n;
		int i;
		/* Accept number of elements */
		System.out.println("Enter number of integer elements");
		n = scan.nextInt();
		/* Create integer array of n elements */
		int arr[] = new int[n];
		/* Accept elements */
		System.out.println("\nEnter " + n + " integer elements");
		for (i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		rs.sort(arr);
		/** Print sorted Array **/
		System.out.println("\nElements after sorting ");
		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
			scan.close();
		}
	}
}
