package array;

public class StockBuyAndSellTwo {

	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4,8};
		System.out.println(maxProfit(arr));
	}
	
	public static int maxProfit(int[] arr) {
		int maxProfit=0;
		for(int i=1;i<arr.length;i++)
			if(arr[i]>arr[i-1])
				maxProfit+=arr[i]-arr[i-1];
		return maxProfit;
	}

}
