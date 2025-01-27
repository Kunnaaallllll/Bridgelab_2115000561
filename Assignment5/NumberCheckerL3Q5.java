public class NumberCheckerL3Q5 {

    public static void main(String[] args) {
        int number = 37;

        System.out.println("Number: " + number);
        System.out.println("Prime number: " + isPrime(number));
        System.out.println("Neon number: " + isNeon(number));
        System.out.println("Spy number: " + isSpy(number));
        System.out.println("Automorphic number: " + isAutomorphic(number));
        System.out.println("Buzz number: " + isBuzz(number));
    }

    // Method to check if the number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if the number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if the number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return (square % Math.pow(10, countDigits(number))) == number;
    }

    // Method to check if the number is a buzz number
    public static boolean isBuzz(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }

    // Helper method to count digits in a number
    public static int countDigits(int number) {
        return (int) Math.log10(number) + 1;
    }
}
