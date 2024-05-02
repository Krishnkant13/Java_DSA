package array;

import java.util.Arrays;

public class BinaryArraySorting {

	public static void sortBinaryArray(int[] arr) {
		int countZerors = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == 0)
				countZerors++;
		for (int i = 0; i < countZerors; i++)
			arr[i] = 0;
		for (int i = countZerors; i < arr.length; i++)
			arr[i] = 1;
	}

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1};
		sortBinaryArray(arr);
		System.err.println(Arrays.toString(arr));

	}

}
