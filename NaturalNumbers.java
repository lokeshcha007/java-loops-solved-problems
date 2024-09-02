package loops;

import java.util.*;

public class NaturalNumbers {
    public static void main(String[] args) {
        System.out.println("hello");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("hello");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scn.nextInt();
        for (int i = number; i >= 1; i--) {
            System.out.println(i);

        }
    }
}