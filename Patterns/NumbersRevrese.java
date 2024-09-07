package Patterns;

public class NumbersRevrese {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 9; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
