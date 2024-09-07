package Patterns;

/**
 * alphabets
 */
public class alphabetsReverseFront {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 'j'; j >= 'a'; j--) {
                System.out.print((char) (j) + " ");
                // System.out.println(j);
            }
            System.out.println();
        }
    }

}