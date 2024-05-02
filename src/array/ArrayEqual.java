package array;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {4, 2, 3, 1};
		System.out.println(checkArrEqual(arr1, arr2));
	}

	public static boolean checkArrEqual(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length)
			return false;
		if (arr1 == null || arr2 == null)
			return arr1 == arr2;

		Arrays.sort(arr2);
		Arrays.sort(arr1);

		for (int i = 0; i < arr1.length; i++)
			if (arr1[i] != arr2[i])
				return false;
		return true;
	}

}
