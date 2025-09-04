package Methods.Level3;

import java.util.Scanner;

public class FactorialRecursion_1{

    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   
        }
        return n * factorial(n - 1);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long fact = factorial(num);

        System.out.println("Factorial of " + num + " is: " + fact);

        sc.close();
    }
}