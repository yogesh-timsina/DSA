import java.util.Scanner;

public class FibonacciCalc{
  public static int fibRecursion(int n) {
    if (n== 0) {
      return 0;
    } // Oth fibonacci is 0

    if (n== 1 || n== 2) {
      return 1;
    } // 1st and 2nd Fibonacci are 1 and 1 only

    // calling function recursively for nth Fibonacci
    return fibRecursion(n - 1) + fibRecursion(n - 2);
  }

  public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the value of fib len:");
    int fibo=scanner.nextInt();
    
    
   
    
    
    System.out.print("Fibonacci Series of " + fibo + " numbers is: \n");

    for (int i = 0; i < fibo; i++) {
      System.out.print(fibRecursion(i) + " ");
    }
  }
}
