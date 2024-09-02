package loops;

/**
 * SumOfDigits
 * 
 * 
 */

import java.util.*;;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scn.nextInt();
        //
        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            sum += remainder;
            number = number / 10;
        }
        System.out.println("the sum is " + sum);
    }

}