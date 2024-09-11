//36. Write a program to find 1s complement of a number in java

package loops;

import java.util.*;

/**
 * ComplementsOfOne
 */

import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the fibonacci number upto you want : ");
        int firstTerm = 0;
        int secondTerm = 1;
        int numbers = number.nextInt();
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 2; i <= numbers; i++) {
            int thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;

        }

    }

}