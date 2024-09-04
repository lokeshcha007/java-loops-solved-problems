package loops;

/**
 * StrongFrom1to10000
 */
public class StrongFrom1to10000 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10000; i++) {
            int sumOfFactorials = 0;
            int number = i;

            while (number != 0) {
                int remainder = number % 10;
                int factorail = 1;

                for (int j = 1; j <= remainder; j++) {
                    factorail *= j;
                }
                sumOfFactorials += factorail;

                number = number / 10;
            }

            if (sumOfFactorials == i) {
                System.out.println(i);
            }

        }
    }
}