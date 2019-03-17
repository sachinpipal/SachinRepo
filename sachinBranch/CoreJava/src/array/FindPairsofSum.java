package array;

import java.util.ArrayList;
import java.util.List;

public class FindPairsofSum {

	public static void main(String[] args) {
		int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 1, 9 };
		findpairsOfSum(numbersWithDuplicates,7);
		System.out.println("=======================================");
		findpairsOfSum2(numbersWithDuplicates,7);
	}
	private static void findpairsOfSum2(int[] array,int sum) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				
				int tempSum=array[i]+array[j];
				if(sum==tempSum) {
					System.out.println("Pair found :("+ array[i]+" ,"+array[j]+")");
				}
			}
		}
		
	}

	private static void findpairsOfSum(int[] array, int sum) {
		List<Integer> list=new ArrayList<>();
		for (int j = 0; j < array.length; j++) {
			int first = array[j];
			int second=sum-first;
			if(!list.contains(second)) {
				list.add(first);
			}
			else {
				System.out.println("Pair found :("+ first+" ,"+second+")");
			}
			
			
			
			
		}
		
	}

}
