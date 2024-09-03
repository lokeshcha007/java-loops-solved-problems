package loops;

import java.util.Scanner;

public class Binarytodecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binary = scn.nextInt();
        int number = binary;
        int count = 0;
        int remainder = 0;
        int sum = 0;

        while (binary != 0) {
            remainder = binary % 10;
            sum += Math.pow(2, count) * remainder;
            binary = binary / 10;
            count++;
        }

        System.out.println("Decimal equivalent: " + sum);
    }
}
