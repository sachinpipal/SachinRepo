package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfArrays {
	public static void main(String[] args) {
		unionOfArray(new int[] { 1, 14, 89, -23, 67, 8, 17,13 }, new int[] { 6, 45, 89, 11, 67, 9, -7 });
		sortedUnionOfArrays(new int[] { 1, 14, 89, -11, 23, 8, 17,13 }, new int[] { 6, 45, 89, 11, 4, 5, 8 });
	}

	private static void sortedUnionOfArrays(int[] array1, int[] array2) {
		int commonArrayLength=findCommonElementslength(array1, array2);
		union(array1.length+array2.length-commonArrayLength);
		
	}

	private static void union(int i) {
		int[]result=new int[i];
		
	}

	private static int findCommonElementslength(int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		List<Integer>result=new ArrayList<>();
		int i=0,j=0,k=0;
		while (i<array1.length&& j<array2.length) {
			if(array1[i]<array2[j]) {
				i++;
			}else if(array1[i]>array2[j]){
				j++;
			}else if(array1[i]==array2[j]){
				result.add(array1[i]);
				i++;
				j++;
				k++;
			}
		}
		
		return k;
	}

	private static void unionOfArray(int[] array1, int[] array2) {
		int i = 0, j = 0;
		int m = array1.length;
		int n = array2.length;
		while (i < m && j < n) {
			if (array1[i] < array2[j]) {
				System.out.print(array1[i] + " ");
				i++;
			} else if (array2[j] < array1[i]) {
				System.out.print(array2[j] + " ");
				j++;
			} else if (array2[j] == array1[i]) {
				System.out.print(array2[j] + " ");
				j++;
				i++;
			}
		}

		/*
		 * Print remaining elements of the larger array
		 */
		while (i < m)
			System.out.print(array1[i++] + " ");
		while (j < n)
			System.out.print(array2[j++] + " ");

	}

}