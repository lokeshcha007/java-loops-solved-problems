package loops;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int number = scn.nextInt();
        // int sum = 0;
        // //int number1 = number;
        // int count = 0;

        // //int length = number.length()
        // //System.out.println(count);

        // while(number!=0){
        // int remainder = number%10;
        // sum+=Math.pow(2,count)*remainder;
        // count++;
        // number/=10;
        // }
        // System.out.println(sum);

        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter base of the number : ");
        // int base = scn.nextInt();
        // System.out.print("Enter exponent of the number : ");
        // int exponent = scn.nextInt();
        // int result =1;

        // for(int i=0;i<exponent;i++){
        // result*=base;
        // }

        // // int answer = (int)Math.pow(base,exponent);
        // System.out.print(result);

        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter the number : ");

        // int number = scn.nextInt();
        // int original = number;
        // int square = number * number;
        // System.out.println(square);
        // int sum = 0;
        // while(square!=0){
        // int remainder = square %10;
        // sum+=remainder;
        // square/=10;
        // }

        // System.out.println("the sum is : " + sum );

        // if(sum == original){
        // System.out.print("its a neon number");
        // }else{
        // System.out.print("not a neon number");
        // }

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        String input = scn.nextLine();
        // System.out.print(Integer.parseInt(input));
        boolean isDuck = true;

        Integer.parseInt(input);

        if (input.charAt(0) == '0') {
            isDuck = false;
        } else {
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == '0') {
                    isDuck = true;
                }
            }
        }

        if (isDuck) {
            System.out.print("its a duck number");
        } else {
            System.out.print("not a duck number");
        }

        // System.out.print("not a duck number");

        // int number = 30;
        // int sum = 0;
        // while (number != 0) {
        // int remainder = number % 10;
        // sum += remainder;
        // number /= 10;
        // }

        // if (number / sum == 0) {
        // System.out.print("its a niven number");
        // } else {
        // System.out.print("not a niven number");
        // }

    }
}