class HelloWorld {
    public static void main(String[] args) {
        // Loop through each number from 1 to 10,000
        for (int i = 1; i <= 10000; i++) {
            int sum = 0; // Initialize sum for the current number

            // Find proper divisors and sum them
            for (int j = 1; j < i; j++) { // Loop up to but not including the number itself
                if (i % j == 0) {
                    sum += j; // Add divisor to sum
                }
            }

            // Check if the sum of divisors equals the number
            if (sum == i) {
                // Print only the perfect number
                System.out.println(sum + " is a perfect number.");
            }
        }
    }
}
