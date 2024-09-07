package Patterns;

public class alphabetsVertical {
    public static void main(String[] args) {
        for (int i = 'a'; i <= 'j'; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((char) (i) + " ");
                // System.out.println(j);
            }
            System.out.println();
        }

        for (int i = 'j'; i >= 'a'; i--) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((char) (i) + " ");
                // System.out.println(j);
            }
            System.out.println();
        }

    }
}
