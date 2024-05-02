package array;

public class SearchElement {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5, 6};
		int key = 3;
		System.out.println(searchElement(intArr, key));

	}
	static int searchElement(int[] intArr, int key) {
		int left = 0, right = intArr.length-1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (intArr[mid] == key)
				return mid;
			else if (intArr[mid] > key)
				left = mid + 1;
			else
				right = mid - 1;
		}

		return -1;
	}
}
