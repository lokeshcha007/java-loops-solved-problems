/**
 * armstrong
 */
public class armstrong {

    public static void main(String[] args) {

        int min = 1;
        int max = 1000;

        for (int i = min; i <= max; i++) {
            int number = i;
            int Originalnumber = i;
            int count = 0;
            int sum = 0;
            while (number != 0) {
                number /= 10;
                count++;
            }
            while (Originalnumber != 0) {
                int remainder = Originalnumber % 10;
                sum += Math.pow(remainder, count);
                Originalnumber /= 10;
            }
            if (sum == i) {
                System.out.println(sum + "is an armstrong number");
            }
        }
    }
}