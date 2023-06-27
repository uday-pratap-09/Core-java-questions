// How to print Array Sum

public class ArraySum {
    public static int sum(int[] array) {
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int arraySum = sum(numbers);
        System.out.println("Sum of array elements: " + arraySum);
    }
}