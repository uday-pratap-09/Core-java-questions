// Sorting an array

import java.util.Arrays;

public class ArraySorting {
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        sortArray(arr);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));
    }
}