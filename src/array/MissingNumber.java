package array;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {3, 7, 1, 2, 8, 4, 5};
		System.out.println(findMissingNumber(arr));
	}
	public static int findMissingNumber(int[] arr) {
//		int n = arr.length;
//		int total = (n * (n + 1)) / 2;
//		for (int i = 0; i < n; i++)
//			total -= arr[i];
//		return total;
		int n = arr.length;
        int total = (n * (n + 1)) / 2;
        
        for (int i = 0; i < n; i++) {
            total -= arr[i];
        }
        
        return total;
    }
		
	}

