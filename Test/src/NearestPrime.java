public class NearestPrime {
	static void nearestPrime(int n) {
		for (int i = 1;; i++) {
			if ((isPrime(n - i)) && (isPrime(n + i))) {
				System.out.println(n - i);
				System.out.println(n + i);
				break;
			} else {
				if (isPrime(n - i)) {
					System.out.println(n - i);
					break;
				}
				if (isPrime(n + i)) {
					System.out.println(n + i);
					break;
				}
			}
		}
	}

	static boolean isPrime(int p) {
		int fac = 0;
		for (int i = 1; i <= p; i++) {
			if (p % i == 0)
				fac++;
		}
		if (fac == 2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int x = 101;
		nearestPrime(x);
	}

}