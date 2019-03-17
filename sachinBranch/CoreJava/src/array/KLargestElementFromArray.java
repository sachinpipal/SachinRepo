package array;

import java.util.Arrays;

public class KLargestElementFromArray {

	public static void main(String[] args) {
	int largestNum=findKLargestElement(new int[] {9,-8,-27,54,21,7,12,23},5);
	System.out.println(largestNum);

	}

	private static int findKLargestElement(int[] array, int K) {
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				if(array[j]<array[i]) {
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
			
			
		}
		System.out.println(Arrays.toString(array));
		return array[array.length-K];
	}

}
