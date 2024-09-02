package loops;

import java.util.Scanner;

/**
 * SumOfNaturalNumbers
 */

// 10. Write a program to find sum of all even numbers between 1 to n
// 11. Write a program to find sum of all odd numbers between 1 to n
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // 9
        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter the number to sum all Natural Numbers : ");
        // int number = scn.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= number; i++) {
        // sum += i;
        // }
        // System.out.println(sum);

        // 10

        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter the number to sum of all even Numbers : ");
        // int number = scn.nextInt();
        // int sum = 0;

        // for (int i = 0; i <= number; i++) {
        // if (i % 2 == 0) {
        // sum += i;
        // }
        // }
        // System.out.println(sum);

        // 11
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number to sum of all odd  Numbers : ");
        int number = scn.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}