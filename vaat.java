
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner news = new Scanner(System.in);
        boolean isprime = true;
        int number = news.nextInt();
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isprime = false;
            }

        }
        if (isprime) {
            System.out.println("given number is an prime number");
        } else {
            System.out.println("given number is not a prime");
        }

        // int min = 3;
        // int max = 100;
        // // int count = 0;

        // for (int i = min; i <= max; i++) {
        // int count = 0;
        // for (int j = 1; j <= i; j++) {
        // if (i % j == 0) {
        // count++;
        // }
        // }
        // if (count == 2) {
        // System.out.println("the numbers are " + i);
        // }
        // }

    }
}