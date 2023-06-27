// Write a Java program to find the common elements between two arrays

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        List<Integer> commonElements = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return commonElements;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        List<Integer> common = findCommonElements(arr1, arr2);
        System.out.println("Common elements: " + common);
    }
}