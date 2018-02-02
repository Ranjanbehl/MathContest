import java.util.Scanner;
import java.math.*;

public class Divisor {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextInt(), i;
		System.out.print("Enter the number :  ");
		int sum = 0;

		for (i = 2; i <= num / 2; i++) {
			{

				if (num % i == 0) {

					sum += (i * (i + 1) / 2); //sum
				}
			}
		}
		System.out.print("Sum of the Divisors = " + sum);
		scanner.close();
	}

}
