import java.util.Scanner;

public class GCD{
  public static void main(String[] args){
    // Scanner class for taking imputs
    Scanner  sc= new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    
    // Taking inputs of the two required variables 
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    // ans element
    int gcd = 1;
    int k = 2;
    
    // while loop to find the GCD
    while (k <= num1 && k <= num2) {
      if (num1 % k == 0 && num2 % k == 0) {
        gcd = k;
      }
      k++;
    }
    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
  }
}