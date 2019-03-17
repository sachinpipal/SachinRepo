package array;
import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {

	public static void main(String[] args) {
		printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
		
		// three missing number
		printMultipleMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
		printMultipleMissingNumber(new int[]{1, 8, 10, 17, 22, 28, 87}, 10);


	}

	private static void printMissingNumber(int[] array, int count) {
		int expectedSum=count*(count+1)/2;
		System.out.println("expectedSum : "+expectedSum);
		int totalSum=0;
		for (int i = 0; i < array.length; i++) {
			totalSum=totalSum+array[i];
		}
		System.out.println("missing sum :"+(expectedSum-totalSum));
		
	}
	public static void printMultipleMissingNumber(int[] array, int count) {
	 int missingCount = count - array.length;
	 System.out.println("missingCount :"+missingCount);
     BitSet bitSet = new BitSet(count);

     for (int number : array) {
         bitSet.set(number - 1);
     }

     Arrays.toString(array);
     int lastMissingIndex = 0;

     for (int i = 0; i < missingCount; i++) {
         lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
         System.out.println(++lastMissingIndex);
     }
	}
}
