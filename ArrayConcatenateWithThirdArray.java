import java.util.Arrays;

public class ArrayConcatenateWithThirdArray {

	public static void main(String args[]) {

		int position = 0;

		int[] array1 = {1, 2, 3, 4};

		int[] array2 = {8, 9, 0};

		int length = array1.length + array2.length;

		int[] result = new int[length]; // third array created which can hold both the array contents

		for(int element : array1) {

			result[position] = element;

			position++;

		}

		for(int element : array2) {

			result[position] = element;

			position++;

		}

		System.out.println("\nThe concatenated array values: "+Arrays.toString(result));

	}

}
