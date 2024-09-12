package loops;

import java.util.*;

class Questions {
    public static void main(String[] args) {
        // 1
        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n : ");

        // int n = scn.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.println(i);
        // }

        // 2

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n : ");
        // int n = scn.nextInt();

        // for (int i = n; i >= 1; i--) {
        // System.out.println(i);
        // }

        // 3

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n : ");
        // int n = scn.nextInt();

        // for (int i = 1; i <= n; i++) {
        // if (i % 2 == 0) {
        // System.out.println("its an even number : " + i);
        // } else {
        // System.out.println("its an odd number : " + i);
        // }
        // }

        // 4

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n : ");
        // int n = scn.nextInt();
        // int sumOdd = 0;
        // int sumEven = 0;

        // for (int i = 1; i <= n; i++) {
        // if (i % 2 == 0) {
        // sumEven += i;
        // } else {
        // sumOdd += i;
        // }

        // }
        // System.out.println("the sum of even numbers within range is : " + sumEven);
        // System.out.println("the sum of odd numbers within range is : " + sumOdd);

        // 5

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n : ");
        // int n = scn.nextInt();
        // int count = 0;

        // while (n != 0) {
        // int remainder = n % 10;
        // count++;
        // n /= 10;
        // }

        // System.out.println("the count of given number is : " + count);

        // 6

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the number to reverse : ");
        // int n = scn.nextInt();
        // int reverse = 0;

        // while (n != 0) {
        // int remainder = n % 10;
        // reverse = reverse * 10 + remainder;
        // n /= 10;
        // }

        // System.out.println(reverse);

        // 7

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the factorial number : ");
        // int n = scn.nextInt();
        // int fact = 1;
        // for (int i = n; i >= 1; i--) {
        // fact *= i;

        // }

        // System.out.println("the factorial of given number is : " + fact);

        // 8

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the number to sum : ");
        // int n = scn.nextInt();
        // int on = n;
        // int sum = 0;
        // while (n != 0) {
        // int remainder = n % 10;
        // sum += remainder;
        // n /= 10;
        // }
        // System.out.println("the sum of digits are : " + sum);

        // 9

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the binary number : ");
        // int n = scn.nextInt();
        // int count = 0;
        // int on = n;
        // int number = 0;

        // while (n != 0) {
        // int remainder = n % 10;
        // number += (int) Math.pow(2, count) * remainder;

        // count++;
        // n = n / 10;
        // }
        // System.out.println("the decimal value is : " + number);

        // 10

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n : ");
        // int n = scn.nextInt();
        // int on = n;
        // int sum = 0;
        // while (n != 0) {
        // int remainder = n % 10;
        // int fact = factorial(remainder);
        // // System.out.println(fact);
        // sum += fact;
        // n /= 10;
        // }
        // // System.out.println(sum);
        // if (on == sum) {
        // System.out.println("its a strong number ");
        // } else {
        // System.out.println("its not a strong number");
        // }
        // public static int factorial(int n) {
        // int sum = 1;
        // for (int i = 1; i <= n; i++) {
        // // System.out.println();
        // sum *= i;
        // }

        // return sum;
        // }

        // 11 SPY NUMBER

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n : ");
        // int n = scn.nextInt();
        // int on = n;
        // int sum = 1;
        // int add = 0;

        // while (n != 0) {
        // int remainder = n % 10;
        // sum *= remainder;
        // add += remainder;
        // n /= 10;

        // }
        // if (sum == add) {
        // System.out.println("its a spy number");
        // } else {
        // System.out.println("not a spy number");
        // }

        // 12
        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n : ");
        // int n = scn.nextInt();
        // int on = n;
        // int sum = 0;
        // while (n != 0) {
        // int remainder = n % 10;
        // sum += remainder;
        // n /= 10;
        // }

        // if (on % sum == 0) {
        // System.out.println("its a harshad number");
        // } else {
        // System.out.println("not a harshad number");
        // }

        // 13
        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n : ");
        // int n = scn.nextInt();
        // int on = n;
        // int square = n * n;
        // int sum = 0;
        // while (square != 0) {
        // int remainder = square % 10;
        // System.out.println(remainder);
        // sum += remainder;
        // square /= 10;
        // }

        // if (on == sum) {
        // System.out.println("its a neon number ");
        // } else {
        // System.out.println("not a neon number");
        // }

        // 14

        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n1 : ");
        // int num1 = scn.nextInt();
        // System.out.print("enter the n2 : ");
        // int num2 = scn.nextInt();
        // int hcf = 0;
        // for (int i = 1; i <= num1; i++) {
        // if (num1 % i == 0 && num2 % i == 0) {
        // hcf = i;
        // }
        // }
        // System.out.println("the heighhest common factor is : " + hcf);

        // 15
        // i

        // 16
        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the number : ");
        // int n = scn.nextInt();
        // int sum = 0;
        // int on = n;
        // int on1 = n;
        // int count = 0;

        // while (n != 0) {
        // n /= 10;
        // count++;
        // }
        // while (on != 0) {
        // int remainder = on % 10;
        // sum += Math.pow(remainder, count);
        // on /= 10;
        // }

        // System.out.println(sum);
        // if (on1 == sum) {
        // System.out.println("given is an armstrong number");
        // }

        // 17
        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n : ");
        // int n = scn.nextInt();

        // int firstTerm = 0;
        // int secondTerm = 1;

        // if (n >= 1) {
        // System.out.print(firstTerm + " ");
        // }
        // if (n >= 2) {
        // System.out.print(secondTerm + " ");
        // }

        // for (int i = 3; i <= n; i++) {
        // int thirdTerm = firstTerm + secondTerm;
        // firstTerm = secondTerm;
        // secondTerm = thirdTerm;

        // System.out.print(thirdTerm + " ");
        // }

        // 18

        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int n = scn.nextInt();

        // int originalNumber = n;
        // int count = 0;

        // // Calculate the square of the number
        // int square = n * n;

        // // Find the number of digits in the original number
        // while (originalNumber != 0) {
        // originalNumber /= 10;
        // count++;
        // }

        // // Use modulus to get the last 'count' digits of the square
        // int lastDigits = square % (int) Math.pow(10, count);

        // // Check if the last digits match the original number
        // if (lastDigits == n) {
        // System.out.println(n + " is an Automorphic number.");
        // } else {
        // System.out.println(n + " is not an Automorphic number.");
        // }

        // 19

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i);
                number /= i;
            }
        }
        // 20
        // armstrong;
        // for(int i=1;i<=1000;i++){
        // int number = i;
        // int Originalnumber = i;
        // int count = 0;
        // while(number!=0){
        // number/=10;
        // count++;
        // }
        // //System.out.println(i + " has " + count+" :" );
        // int sum = 0;
        // while(Originalnumber!=0){
        // int remainder = Originalnumber%10;
        // sum+=Math.pow(remainder,count);
        // Originalnumber/=10;
        // }
        // if(sum == i){
        // System.out.println(sum +" is a armstrong");
        // }
        // }
        // fibonacci series
        // int min = 1;
        // int max = 1000;
        // int FT = 0;
        // int ST = 1;
        // if(FT<=1000){
        // System.out.print(FT +" " +ST+" ");
        // }
        // for(int i=min;i<=max;i++){

        // int TT = FT+ST;
        // FT = ST;
        // ST = TT;

        // if(TT >= max){
        // break;
        // }
        // System.out.print(TT + " ");

        // }
        // 3 perfect

        // for(int i=1;i<=10000;i++){
        // int number = i;
        // int sum = 0;
        // for(int j=1;j<i;j++){
        // if(i%j==0){
        // sum+=j;
        // }

        // }

        // if(sum == number){
        // System.out.print(sum + " ");
        // }
        // }
        // for(int i=1;i<=10;i++){
        // int fact = Facto(i);
        // System.out.print(fact + " ");
        // }

        // }
        // public static int Facto(int a ){
        // int sum = 1;
        // for(int i=1;i<=a;i++){
        // sum*=i;
        // }
        // return sum;

        // prime number

        // int number =4;
        // boolean isPrime = true;

        // for(int i=2;i<number;i++){
        // if(number%i==0){
        // isPrime = false;
        // }
        // }
        // if(isPrime){
        // System.out.print( " is a prime number");
        // }else{
        // System.out.print(" not a prime");
        // }

        // for(int i=2;i<100;i++){
        // int count = 0;
        // for(int j=2;j<i;j++){
        // if(i%j!=0){
        // count++;
        // }

        // }
        // if(count ==2){
        // System.out.print(i + " ");
        // }

        // }

        for (int i = 2; i <= 100; i++) {
            boolean prime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }

    }
}