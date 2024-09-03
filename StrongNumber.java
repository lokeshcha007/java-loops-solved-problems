package loops;

/**
 * StrongNumber
 */
import java.util.*;

public class StrongNumber {

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int strong = 0;
        int originalNumber = number;
        while (number != 0) {
            int remainder = number % 10;
            int sum = 1;
            for (int i = 1; i <= remainder; i++) {
                sum *= i;
                System.out.println("the sum is " + sum);
            }
            strong += sum;
            number = number / 10;

        }

        if (originalNumber == strong) {
            System.out.println("its an strong number");
        } else {
            System.out.println("not a strong number");
        }
    }
}