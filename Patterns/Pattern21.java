package Patterns;

/**
 * Pattern21
 */
public class Pattern21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 10 - i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}