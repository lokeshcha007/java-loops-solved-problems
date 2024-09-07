package Patterns;

public class FrequencyandOddEven {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 342, 3, 32 };

        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println("the even are " + number);
            } else {
                System.out.println("the odd are " + number);
            }
        }

    }
}
