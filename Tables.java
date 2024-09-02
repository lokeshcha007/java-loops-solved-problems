package loops;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        // tables
        Scanner scn = new Scanner(System.in);
        // System.out.print("Enter the table number and upto multiplier you want :

        System.out.print("enter the table number : ");
        int multiply = scn.nextInt();
        System.out.print("enter the multipliyer upto you want : ");
        int multiplier = scn.nextInt();

        for (int i = 1; i <= multiplier; i++) {
            System.out.println(multiply + " X " + i + " = " + multiply * i);
        }

        // reverse of tables
        Scanner scn2 = new Scanner(System.in);
        // System.out.print("Enter the table number and upto multiplier you want : ");
        System.out.print("enter the table number : ");
        int multiply1 = scn2.nextInt();
        System.out.print("enter the multipliyer upto you want : ");
        int multiplier2 = scn2.nextInt();

        for (int i = multiplier2; i >= 0; i--) {
            System.out.println(multiply1 + " X " + i + " = " + multiply1 * i);
        }

    }

}
