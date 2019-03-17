package array;

public class FinaLargestnSmallestNumber {

	public static void main(String[] args) {
		printLargestnSmallest(new int[] { 1, 67, 89, -23, 14, 9, -7 });
	}

	

	private static void printLargestnSmallest(int[] array) {
		int largestNum = Integer.MIN_VALUE;
		int smallestNum = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			if (num > largestNum) {
				largestNum = num;
			} else if (num < smallestNum) {
				smallestNum = num;
			}
		}
		System.out.println("largest number is :" + largestNum + " and smallest numver is :" + smallestNum);
	}

}
