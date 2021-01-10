package PrimeNumber;

public class PrimeNumbers {
	public static void main(String[] args) {
		findPrime(7);
		findPrime(2);

	}

	public static void findPrime(int n) {
		int i, m = 0, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println("not a prime");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println("Not a prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Prime Num");
			}
		}
	}
}