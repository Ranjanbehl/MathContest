public class ProductDivisors {

	public static void main(String[] args) {

	}

	public int sumOfDivisors(int n) {
		int prod = 1;
		for (int k = 2; k * k <= n; k++) {
			int p = 1;
			while (n % k == 0) {
				p = p * k + 1;
				n /= k;
			}
			prod *= p;
		}
		if (n > 1) prod *= 1 + n;
		return prod;
	}
}
