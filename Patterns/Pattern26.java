package Patterns;

/**
 * Pattern26
 */
public class Pattern26 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        int ns = 4;
        for (int i = ns; i >= 1; i--) {
            // Print stars on the left
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (ns - i); j++) {
                System.out.print(" ");
            }
            // Print stars on the right
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}