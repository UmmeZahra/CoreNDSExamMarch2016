package math;

import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int n, c, fact = 1;

        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if ( n < 0 )
            System.out.println("Number should be non-negative.");
        else
        {
            for ( c = 1 ; c <= n ; c++ )
                fact = fact*c;
            System.out.println("Factorial of "+n+" is = "+fact);
        }
        //finding factorial of a number in Java using recursion - Example
        System.out.println("factorial of the number using recursion in Java is: " + factorial(n));

        //finding factorial of a number in Java using Iteration - Example
        System.out.println("factorial of the number using iteration in Java is: " + fact(n));
    }
    public static int factorial(int number){
        //base case
        if(number == 0){
            return 1;
        }
        return number*factorial(number -1); //is this tail-recursion?
    }

    public static int fact(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }

        return result;
    }

    }

