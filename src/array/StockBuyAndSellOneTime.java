package array;

public class StockBuyAndSellOneTime {

	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}
	public static int maxProfit(int[] arr) {
		int minValue=Integer.MAX_VALUE;
		int maxProfit=0;
		for(int i=0;i<arr.length;i++) {
			minValue=Math.min(minValue, arr[i]);
			maxProfit=Math.max(maxProfit, arr[i]-minValue);
		}
		return maxProfit;
	}
}
