package loops;

/**
 * PrimeNumberCheck
 * 
 */

import java.util.*;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scn.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            System.out.println("Its not a prime number");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("its a prime number");
        } else {
            System.out.println("not a prime");
        }
    }
}