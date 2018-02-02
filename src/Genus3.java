import java.util.Scanner;
import java.math.*;

public class Genus3 {

	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the genus :  ");
        System.out.println("Enter the limit value :  ");
        long num = scanner.nextInt(), i;
        int genus =  scanner.nextInt(),j;
        System.out.print("Semi-multiperfect number of" + genus + " = 1 , ");
        
        for(i = 1; i <= num/2; i++)
        {
        	 if (num % i == 0);
        	 {
        		 System.out.print(num += i); 
        	 }
        	 
        }
        
        System.out.println(num);
        scanner.close();
	

	
	
	}
}