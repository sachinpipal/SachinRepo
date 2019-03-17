package array;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] result=removeDuplicateNumbers(new int[]{1,2,3,4,77,6,9,8,77,2,56,43});
		System.out.println(Arrays.toString(result));
	}

	private static int[] removeDuplicateNumbers(int[] array) {
		Arrays.sort(array);
		int[] result=new int[array.length];
		result[0]=array[0];
		int previous=array[0];
		for (int i = 1; i < array.length; i++) {
			int nextElement=array[i];
			System.out.println("nextElement :"+nextElement);
			if(previous!=nextElement) {
				result[i]=nextElement;
			}
			previous=nextElement;
		}
		return result;
	}

}
