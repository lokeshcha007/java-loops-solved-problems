package Patterns;

/**
 * Pattern16
 */
public class Pattern16 {
    public static void main(String[] args) {
        for (int i = 'a'; i <= 'j'; i++) {
            for (int j = 'a'; j <= i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}