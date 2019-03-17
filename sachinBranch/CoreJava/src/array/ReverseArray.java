package array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = new int[] { 101, 102, 103, 104, 105 };
		reverseArray(array);
		System.out.println(Arrays.toString(array));
	}

	private static void reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[array.length - 1-i];
			array[array.length - 1-i] =array[i];
			array[i] = temp;
			
		}

	}

}
