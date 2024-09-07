package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(9 - j);
            }
            System.out.println();
        }

        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
