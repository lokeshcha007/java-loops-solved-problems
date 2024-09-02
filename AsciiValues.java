package loops;

import java.util.*;

public class AsciiValues {
    public static void main(String[] args) {
        // 12. Write a program to print the ASCII values
        // for (int i = 0; i <= 127; i++) {
        // System.out.println((char) i);

        // }

        // 13. Write a program to find the factorial value of any number
        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter the number of factorial you want");
        // int value = scn.nextInt();
        // int sum = 1;
        // for (int i = value; i >= 1; i--) {
        // System.out.println(i);
        // sum *= i;
        // }
        // System.out.println(sum);

        // 14. Write a program to find the value of one number raised to the power of
        // another number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = sc.nextInt();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();
        // double result = Math.pow(base, power);
        // System.out.println(base + " raised to the power of " + power + " is " +
        // result);
        double result1 = 1;
        for (int i = 1; i <= power; i++) {
            result1 = result1 * base;
        }
        System.out.println(base + " raised to the power of " + power + " is " + result1);
    }
}
