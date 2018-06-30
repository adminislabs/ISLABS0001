package radixSort;

/**
 * 
 * @author sahil This class performs the radix sort by using the concept of
 *         bucket
 */
public class RadixSort {

	/**
	 * This method sorts the passed array using radix sort technique
	 * 
	 * @param array
	 */
	public void sort(int[] arr) {
		int max = arr[0];
		int div = 1;
		int length = arr.length;
		int[] temp = new int[length];
		// finding maximum element in array
		for (int i = 1; i < length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		while (max / div > 0) {
			int[] bucket = new int[10];

			for (int i = 0; i < length; i++)
				bucket[(arr[i] / div) % 10]++;
			for (int i = 1; i < 10; i++)
				bucket[i] += bucket[i - 1];
			for (int i = length - 1; i >= 0; i--) {
				bucket[(arr[i] / div) % 10]--;
				temp[bucket[(arr[i] / div) % 10]] = arr[i];
			}
			for (int i = 0; i < length; i++)
				arr[i] = temp[i];
			div *= 10;
		}
	}
}