package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PRIME1 {

	private static int[] primes = new int[12000];

	private static void generatePrimes() {
		int j = 0;
		for (int i = 2; i <= 32000; i++) {
			if (isPrime(i)) {
				primes[j++] = i;
			}
		}
	}

	private static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	private static void printPrimes(int m, int n) {
		if(m==1){
			m++;
		}
		for (int i = m; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 0; primes[j] <= Math.sqrt(i); j++) {
				if (i % primes[j] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		generatePrimes();
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String[] input = br.readLine().split(" ");
			int m = Integer.parseInt(input[0]);
			int n = Integer.parseInt(input[1]);
			printPrimes(m, n);
		}
	}
}
