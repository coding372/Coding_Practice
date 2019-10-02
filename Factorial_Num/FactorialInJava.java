package Factorial_Num;
import java.util.Scanner;
/**
 * Simple Java program to find the factorial of a number using recursion and iteration.
 * Iteration will use for loop while recursion will call method itself
 */
public class FactorialInJava{

    public static void main(String args[]) {
     
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number to find factorial using recursion");
        int num1=scan.nextInt();
        System.out.println("Enter Number to find factorial using iteration");
        int num2=scan.nextInt();
      //finding factorial of a number in Java using recursion - Example
      System.out.println("factorial using recursion in Java is: " + factorial(num1));
     
      //finding factorial of a number in Java using Iteration - Example
       System.out.println("factorial using iteration in Java is: " + fact(num2));
    }
 
    /* Java program example to find factorial of a number using recursion     */
    public static int factorial(int number){      
        //base case
        if(number == 0){
            return 1;
        }
        return number*factorial(number -1); //is this tail-recursion?
    }
 
    /*
     * Java program example to calculate factorial using while loop or iteration
     * @return factorial of number
     */
 
    public static int fact(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }
     
        return result;
    }
}
