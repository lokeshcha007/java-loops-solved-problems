/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        int number = Facto(5);
        // System.out.println(number);
        for (int i = 1; i <= 10; i++) {
            int num = Facto(i);
            System.out.println(num);
        }
    }

    static int Facto(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }

        return sum;

    }

}