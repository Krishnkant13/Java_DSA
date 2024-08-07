package array.Matrix;

public class MedianInRowWiseSortedMatrix {
    public static int countLessThanMid(int[][] matrix, int mid) {
        int count = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            int j = m - 1;
            while (j >= 0 && matrix[i][j] > mid) {
                j--;
            }
            count += (j + 1);
        }

        return count;
    }

    public static int findMedian(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = 2000;  // Assuming a maximum value as per problem constraints

        while (low <= high) {
            int mid = (low + high) / 2;
            int count = countLessThanMid(matrix, mid);

            if (count < (n * m + 1) / 2) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        System.out.println(findMedian(matrix));  // Expected output: 5
    }
}
