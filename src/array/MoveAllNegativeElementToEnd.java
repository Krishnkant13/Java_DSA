package array;

public class MoveAllNegativeElementToEnd {

    public static void moveNegatives(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            // Increment left pointer while the element is non-negative
            while (left <= right && arr[left] >= 0) {
                left++;
            }

            // Decrement right pointer while the element is negative
            while (left <= right && arr[right] < 0) {
                right--;
            }

            // Swap the elements at left and right
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6, 7};
        moveNegatives(arr);

        // Printing the array
        for (int num : arr) {
            System.out.print(num + " ");  // Expected output: 1 7 3 5 -4 -6 -2
        }
    }
}
