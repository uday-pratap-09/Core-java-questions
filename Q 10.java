// Write a Java program to count the occurrences of each element in an array

import java.util.HashMap;
import java.util.Map;

public class ElementCount {
    public static void countElements(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 8, 2, 2, 5};
        countElements(arr);
    }
}