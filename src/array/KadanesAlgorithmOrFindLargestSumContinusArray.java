package array;public class KadanesAlgorithmOrFindLargestSumContinusArray {    public static void maxSubArraySum(int[] arr) {        int size = arr.length;        int max_current = arr[0], max_global = arr[0];        int start = 0, startResult = 0, endResult = 0;        for (int i = 1; i < size; i++) {            if (arr[i] > max_current + arr[i]) {                max_current = arr[i];                start = i;            } else {                max_current += arr[i];            }            if (max_current > max_global) {                max_global = max_current;                startResult = start;                endResult = i;            }        }        System.out.println("Maximum contiguous sum is " + max_global);        System.out.println("Start index: " + startResult);        System.out.println("End index: " + endResult);    }    public static void main(String[] args) {        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};        maxSubArraySum(arr);        // Expected output: Maximum contiguous sum is 7        // Start index: 2        // End index: 6    }}