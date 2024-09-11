
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

    }
}