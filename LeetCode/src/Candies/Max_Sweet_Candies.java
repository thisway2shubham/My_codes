package Candies;
import java.util.*;

public class Max_Sweet_Candies {

	public static int maxSweetness(int n, int d, int[] prices, int[] sweetness) {
		// Create a table of the maximum sweetness that Chef can buy for each price.
		int[][] dp = new int[n + 1][d + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= d; j++) {
				dp[i][j] = 0;
			}
		}

		// Iterate over the candies and update the table.
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= d; j++) {
				if (prices[i - 1] <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], sweetness[i - 1] + dp[i - 1][j - prices[i - 1]]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		// Return the maximum sweetness that Chef can buy.
		return dp[n][d];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int d = scanner.nextInt();
			int[] prices = new int[n];
			int[] sweetness = new int[n];
			for (int j = 0; j < n; j++) {
				prices[j] = scanner.nextInt();
			}
			for (int j = 0; j < n; j++) {
				sweetness[j] = scanner.nextInt();
			}
			System.out.println(maxSweetness(n, d, prices, sweetness));
		}
	}
}

