package loops;

/**
 * Numberssigncount
 */

import java.util.*;

public class Numberssigncount {

    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        boolean ban = true;
        while (ban) {
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int num = scn.nextInt();
            System.out.println(num);
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeroes++;
            }
            System.out.println("Enter Any number to Resume / to Exit Enter 0");
            int values = scn.nextInt();
            if (values == 0) {
                break;
            }

        }
        System.out.println("the positive numbers are " + positive);
        System.out.println("the negative numbers are " + negative);
        System.out.println("the zeroes numbers are " + zeroes);
    }
}