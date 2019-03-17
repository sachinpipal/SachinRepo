package array;

import java.util.Arrays;

public class IntersectionOfArray {

	public static void main(String[] args) {
		intersectionOfArray(new int[] { 1, 14, 89, -23, 67, 9, -7 }, new int[] { 6, 45, 89, 11, 67, 9, -7 });

	}

	private static void intersectionOfArray(int[] array1, int[] array2) {
		Arrays.sort(array1);// [-23, -7, 1, 9, 14, 67, 89]
		Arrays.sort(array2);// [-7, 6, 9, 11, 45, 67, 89]
		int i = 0, j = 0;

		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) {
				i++;
			} else if (array1[i] > array2[j]) {
				j++;
			} else if (array1[i] == array2[j]) {
				System.out.print(array1[i] + " ");
				i++;
				j++;
			}
		}

	}

}
