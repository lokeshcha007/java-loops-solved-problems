package loops;

/**
 * ReverseOfDigits
 */
import java.util.*;

public class ReverseOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scn.nextInt();
        int originalNumber = number;
        int reverse = 0;
        while (number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse of the number is " + reverse);
    }

}