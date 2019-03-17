package array;

public class MinMaxArrayElement {

	public static void main(String[] args) {
		int[] array = { 122,45, 12, 3, -1, 16, 2,-3, 9, 22 };
		int smallest = array[0];
		int largest = array[0];

		for (int i = 1; i < array.length; i++) {
			int element = array[i];
			if (element < smallest) {
				smallest = element;
			} else if (element > largest) {
				largest = element;
			}
		}
		System.out.println("smallest : " + smallest + " largest " + largest);

	}

}
