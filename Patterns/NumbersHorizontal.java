package Patterns;

public class NumbersHorizontal {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
