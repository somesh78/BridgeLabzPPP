package Arrays.Level2;

import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String numStr = Integer.toString(number);
        int length = numStr.length();

        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }

        System.out.print("The reversed number is: ");
        for (int digit : reversed) {
            System.out.print(digit);
        }
    }
}