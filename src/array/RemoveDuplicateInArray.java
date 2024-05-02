package array;

import java.util.Arrays;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5};
		System.out.println(Arrays.toString(removeDuplicate(arr)));
	}
	public static int[] removeDuplicate(int[] arr) {
		int n=arr.length;
		if(n==0|| n==1)
			return arr;
		int[] temp =new int[n];
		Arrays.sort(arr);
		int i=0,j=0;
		temp[j++]=arr[i++];
		for(;i<n-1;i++) {
			if(arr[i]!=arr[i-1])
			temp[j++]=arr[i];
		}
		return temp;
	}

}
