package Patterns;

/**
 * Pattern18
 */
public class Pattern18 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        // int rows = 10;
        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= rows - i; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();

        // }

    }
}