import java.util.Scanner;

public class Factorial 
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to calculate its factorial:");
        int num = scanner.nextInt();
        
        long factorial = fact(num);
        
        System.out.println("Factorial of " + num + " = " + factorial);
        
        scanner.close();
    }
    
    public static long fact(int num) {
        if (num >= 1)
            return num * fact(num - 1);
        else
            return 1;
    }
}
