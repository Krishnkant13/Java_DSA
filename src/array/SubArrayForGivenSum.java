package array;

public class SubArrayForGivenSum {

    public static void findSubarray(int[] arr, int sum) {
        int n = arr.length;
        int currentSum = arr[0], start = 0;

        for (int end = 1; end <= n; end++) {
            // Clean the current sum from the left
            while (currentSum > sum && start < end - 1) {
                currentSum -= arr[start];
                start++;
            }

            // If we've found the sum, print the subarray
            if (currentSum == sum) {
                System.out.println("Subarray with given sum is found between indexes " + start + " and " + (end-1));
                return;
            }

            // Add next element to the current sum
            if (end < n) {
                currentSum += arr[end];
            }
        }

        System.out.println("No subarray with the given sum found.");
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        findSubarray(arr, sum);  // Expected output: Subarray with given sum is found between indexes 1 and 4
    }
}
