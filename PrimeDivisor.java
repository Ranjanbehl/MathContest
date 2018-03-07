import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.math.*;

/*
part A answers:
4320
4680
26208
20427264
Part B answers:
*/

public class PrimeDivisor {

	public static void main(String args[]) {
		long begin = System.currentTimeMillis();
		long current = 0;
		Scanner user_input = new Scanner(System.in);

		System.out.println("Enter the genus value:");
		int g = user_input.nextInt();
		System.out.println("Enter the upper boundary limit:");
		long limit = user_input.nextLong();

		while (current <= limit) {
			if (genus(g, current) == factor(current)) {
				System.out.println(current);
			}
			current++;
		}
		long end = System.currentTimeMillis();
		System.out.println("Processing time: " + (end - begin) / 1000.0 + " seconds");
	}

	public static long genus(long series, long number) {
		return (long) ((series + 0.5) * number);
	}

	private static long factor(long input) {
		long num = input;

		long primeFactorization = factor(num);
		long total = 1;
		for (long p = 2; p <= primeFactorization; p++) {

			int factor = 1;
			for (long i = 0; i < p; i++) {
				factor *= p;
				factor += 1;
			}
			total *= factor; //For example, for 10 you have 10=2*5 and hence the result is (1+2)(1+5) = 18.
		}
		return total;
	}

}
