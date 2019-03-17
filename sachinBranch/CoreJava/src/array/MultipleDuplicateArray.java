package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultipleDuplicateArray {

	public static void main(String[] args) {
		findMultipleDuplicatElements(new int[] { 5, 78, 23, 13, 43, 78, 13, 9, 5, 65 });

	}

	private static void findMultipleDuplicatElements(int[] array) {
		List<Integer> repeatingList = new ArrayList<>();
		Set<Integer> nonrepeatingSet = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			if (nonrepeatingSet.contains(num)) {
				continue;
			}
			if (repeatingList.contains(num)) {
				nonrepeatingSet.add(num);
			} else {
				repeatingList.add(num);
			}
		}
		System.out.println("Repeated set :"+nonrepeatingSet);
	}

}
