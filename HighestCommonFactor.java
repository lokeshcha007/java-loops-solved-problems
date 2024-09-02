package loops;

/**
 * HighestCommonFactor
 */

import java.util.*;

public class HighestCommonFactor {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number1: ");
        int num1 = scn.nextInt();
        System.out.print("Enter your number2: ");
        int num2 = scn.nextInt();

        // Find maximum possible size for arrays
        int maxSize = Math.max(num1, num2);

        // Initialize arrays to store factors
        int[] factorsNum1 = new int[maxSize];
        int[] factorsNum2 = new int[maxSize];

        int index1 = 0;
        int index2 = 0;

        // Populate factors for num1
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                factorsNum1[index1++] = i;
            }
        }

        // Populate factors for num2
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                factorsNum2[index2++] = i;
            }
        }

        // Find common factors
        int hcf = 1;
        for (int i = 0; i < index1; i++) {
            for (int j = 0; j < index2; j++) {
                if (factorsNum1[i] == factorsNum2[j]) {
                    if (factorsNum1[i] > hcf) {
                        hcf = factorsNum1[i];
                    }
                }
            }
        }

        System.out.println("The Highest Common Factor is: " + hcf);
    }
}

// import java.util.Scanner;

// class HCFofTwoNumbers {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the first number: ");
// int num1 = sc.nextInt();
// System.out.println("Enter the second number: ");
// int num2 = sc.nextInt();
// int flag = 0;
// for (int i = 1; i <= num2; i++) {
// if (num1 % i == 0 && num2 % i == 0) {
// flag = i;

// }
// }
// System.out.println("The HCF of " + num1 + " and " + num2 + " is " + flag);
// sc.close();
// }
// }