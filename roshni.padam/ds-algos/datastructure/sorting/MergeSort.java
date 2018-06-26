package learn;

public class MergeSort {
 int arr[];
 int temparr[];
 int length;
 
 public void sort(int inputArr[]) {
     this.arr = inputArr;
     this.length = inputArr.length;
     this.temparr = new int[length];
     doMergeSort(0, length - 1);
 }

 private void doMergeSort(int lowerIndex, int higherIndex) {
      
     if (lowerIndex < higherIndex) {
         int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
         // Below step sorts the left side of the array
         doMergeSort(lowerIndex, middle);
         // Below step sorts the right side of the array
         doMergeSort(middle + 1, higherIndex);
         // Now merge both sides
         mergeParts(lowerIndex, middle, higherIndex);
     }
 }

 private void mergeParts(int lowerIndex, int middle, int higherIndex) {

     for (int i = lowerIndex; i <= higherIndex; i++) {
         temparr[i] = arr[i];
     }
     int i = lowerIndex;
     int j = middle + 1;
     int k = lowerIndex;
     while (i <= middle && j <= higherIndex) {
         if (temparr[i] <= temparr[j]) {
             arr[k] = temparr[i];
             i++;
         } else {
             arr[k] = temparr[j];
             j++;
         }
         k++;
     }
     while (i <= middle) {
         arr[k] = temparr[i];
         k++;
         i++;
     }}

public static void main(String a[]){
    
    int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
    MergeSort m = new MergeSort();
    m.sort(inputArr);
    for(int i:inputArr){
        System.out.print(i);
        System.out.print(" ");
    }}}
	
	
	
