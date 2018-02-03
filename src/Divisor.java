import java.util.Scanner;
import java.math.*;

public class Divisor {

	public static void main(String args[]) {
		long begin = System.currentTimeMillis();
		long current = 1L;
		while(current <= 1000000){
			if(genus(4, current)==divisorSum(current)){
				System.out.println(current);
			}
			current++;
		}
		long end = System.currentTimeMillis();
		System.out.println("Processing time: " + (end-begin)/1000.0 + " seconds");
	}
	
	public static long genus(long series, long number){
		return (long) ((series + 0.5)*number);
	}
	
	public static long divisorSum(long input){
		long num = input;
		
		
		long sum = 1;
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
		sum+=num;
		return sum;
	}
	

}
