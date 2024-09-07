package Patterns;

/**
 * Pattern17
 */
public class Pattern17 {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (106 - j) + " ");
            }
            System.out.println();
        }
    }
}