import java.util.Scanner;
public class ProductDivisors
{
public static void main(String[] args)
{
    @SuppressWarnings("resource")
    Scanner read = new Scanner(System.in);

  
    int len = read.nextInt();

    for(int w = 0; w < len; w++)
    {
        System.out.print("Number: ");
        int input = read.nextInt();

        int remains = 1;
        int sum = remains;

        

        for(int i = 2; i <= input / 2; i++)
        {
            if(input % i == 0) sum += i;
        }

           System.out.print("Result: " + sum);
    }
}
}