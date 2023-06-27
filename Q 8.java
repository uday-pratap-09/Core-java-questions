// Write a Java program to find the sum of all prime numbers up to a given number

public class SumOfPrimes {
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static int sumOfPrimes(int limit) {
        int sum = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i))
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int limit = 10;
        int sum = sumOfPrimes(limit);
        System.out.println("Sum of prime numbers up to " + limit + ": " + sum);
    }
}