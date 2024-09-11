/**
 * FibbinocciNumbers
 */
public class FibbinocciNumbers {

    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        int firstTerm = 0;
        int secondTerm = 1;
        if (firstTerm <= max) {
            System.out.print(firstTerm + " " + secondTerm + " ");
        }
        for (int i = min; i <= max; i++) {
            int temp = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = temp;

            if (temp >= max) {
                break;
            }

            System.out.print(temp + " ");
        }

    }
}