// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package loops;

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // for (int i = 0; i <= 9; i++) {
        // for (int j = 9; j >= i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        Scanner scn = new Scanner(System.in);
        boolean UserDesire = true;
        int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(min);
        while (UserDesire) {
            System.out.print("Enter your number1 : ");
            int num1 = scn.nextInt();
            System.out.print("Enter your number2 : ");
            int num2 = scn.nextInt();
            if (num1 > max) {
                max = num1;
                // System.out.println(num1);
            }
            if (num2 <= min) {
                min = num2;
            }
            System.out.println("Do you want to enter another number (1/0)");
            int choice = scn.nextInt();
            if (choice == 0) {
                break;
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}