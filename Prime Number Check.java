// How to check if a number is a prime number

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
            
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int number = 17;
        boolean prime = isPrime(number);
        System.out.println(number + " is a prime number: " + prime);
    }
}