package Patterns;

public class numbersTriangle {
    public static void main(String[] args) {
        int varaibles = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {

                // int varaibles = 1;
                System.out.print(varaibles + " ");
                varaibles++;
            }
            System.out.println();
        }
    }
}
