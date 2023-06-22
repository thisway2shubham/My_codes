package GCD;

import java.util.Scanner;

public class GCD_HackerRank {
	public static boolean isPossible(int[] arr, int n) {
		// Check if the GCD of any two elements in the array is greater than 1.
		for (int i = 0; i < n / 2; i++) {
			for (int j = i + 1; j < n / 2; j++) {
				if (gcd(arr[i], arr[j]) > 1) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scanner.nextInt();
			}
			System.out.println(isPossible(arr, n) ? "YES" : "NO");
		}
	}

	public static boolean isPrime(int x) {
		int check = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				check++;
			}
		}

		if (check == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static int gcd(int a, int b) {
		if (isPrime(a) == true && isPrime(b) == true) {
			return 1;
		}
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;
		} else {
			a = a;
			b = b;
		}

		while (b != 0) {
			int r = a % b;
			int q = a / b;
			a = b;
			b = r;
		}

		return a;
	}

}
