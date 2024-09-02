package loops;

public class EvenNumbers {
    public static void main(String[] args) {
        // 7. Write a program to print all even numbers between 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 8. Write a program to print all odd number between 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
