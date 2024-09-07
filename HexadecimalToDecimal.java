// package loops;

// /**
//  * HexadecimalToDecimal
//  */
// import java.util.*;;

// public class HexadecimalToDecimal {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter the hexadecimal value : ");
//         int hexadecimal = scn.nextInt();
//         int count = 0;
//         int sum = 0;
//         while (hexadecimal != 0) {
//             int remainder = hexadecimal % 10;
//             sum += Math.pow(16, count) * remainder;
//             hexadecimal = hexadecimal / 10;
//             count++;

//         }
//         System.out.println("the decimal value is  " + sum);

//     }
// }
import java.util.Scanner;

public class HexadecimalToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the hexadecimal value: ");
        String hex = scn.nextLine();

        try {
            // Parse the hexadecimal string to a decimal integer
            int decimal = Integer.parseInt(hex, 16);
            System.out.println("The decimal value is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal number.");
        }

        scn.close();
    }
}
