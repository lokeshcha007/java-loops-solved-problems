package Patterns;

class Pattern15 {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}