/**
 * PerfectNumbers
 */
public class PerfectNumbers {

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                // sum = 0;
                if (i % j == 0) {
                    // System.out.println(j);
                    sum += j;
                }

            }
            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}