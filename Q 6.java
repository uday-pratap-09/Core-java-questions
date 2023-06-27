// Write a Java program to calculate the average of numbers in an array

public class Average {
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        double average = calculateAverage(arr);
        System.out.println("Average: " + average);
    }
}