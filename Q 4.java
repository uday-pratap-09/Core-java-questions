// Write a Java program to find the Fibonacci series up to a given number

public class FibonacciSeries {
    public static void printFibonacciSeries(int limit) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < limit; i++) {
            int next = n1 + n2;
            System.out.print(next + " ");
            n1 = n2;
            n2 = next;
        }
    }

    public static void main(String[] args) {
        int limit = 10;
        System.out.println("Fibonacci series up to " + limit + ":");
        printFibonacciSeries(limit);
    }
}