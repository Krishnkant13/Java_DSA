package string;

import java.util.Scanner;

public class WordWrap {

    static int wordWrap(int[] wordLengths, int n, int maxWidth) {
        int[][] extraSpace = new int[n + 1][n + 1];
        int[] minCost = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            extraSpace[i][i] = maxWidth - wordLengths[i - 1];
            for (int j = i + 1; j <= n; j++) {
                extraSpace[i][j] = extraSpace[i][j - 1] - wordLengths[j - 1] - 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            minCost[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= i; j++) {
                int cost = (extraSpace[j][i] < 0) ? Integer.MAX_VALUE :
                        (i == n && extraSpace[j][i] >= 0) ? 0 :
                                extraSpace[j][i] * extraSpace[j][i] * extraSpace[j][i];

                minCost[i] = (minCost[j - 1] != Integer.MAX_VALUE && cost != Integer.MAX_VALUE
                        && minCost[j - 1] + cost < minCost[i]) ? minCost[j - 1] + cost : minCost[i];
            }
        }
        return minCost[n];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] wordSize = new int[n];
            for (int i = 0; i < n; i++) wordSize[i] = sc.nextInt();
            System.out.println(wordWrap(wordSize, n, sc.nextInt()));
        }
        sc.close();
    }
}
