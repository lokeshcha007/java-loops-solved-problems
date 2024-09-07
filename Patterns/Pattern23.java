package Patterns;

/**
 * Pattern23
 */
public class Pattern23 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            int number = (i < 5) ? 8 : 2;

            for (int j = 1; j <= number; j++) {
                System.out.print("* ");
            }
            // System.out.println(number);
            System.out.println();
        }
    }
}