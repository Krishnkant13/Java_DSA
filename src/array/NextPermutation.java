package array;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Find the first decreasing element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If such element is found
        if (i >= 0) {
            int j = nums.length - 1;

            // Find the first number greater than nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Reverse the sub-array after i
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        nextPermutation(nums);

        for (int num : nums) {
            System.out.print(num + " ");  // Expected output: 2 1 3
        }
    }
}
