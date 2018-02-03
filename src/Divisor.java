import java.util.Scanner;
import java.math.*;

public class Divisor {

	public static void main(String args[]) {
		System.out.print("Enter the number :  ");
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		
		
		int sum = 1;
		int half = (int)Math.sqrt(num);

		for (int i = 2; i <= half; i++) {
			{

				if (num % i == 0) {
					sum+=i;
					long d = (num/i);
					if(d!=i){
						sum+=d;
					}
					//sum
				}
			}
		}
		System.out.print("Sum of the Divisors = " + sum);
		scanner.close();
	}
	

}
