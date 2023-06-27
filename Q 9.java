// Write a Java program to find the length of the longest consecutive sequence in an array

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutiveSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int maxLength = 0;
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentLength = 1;
                while (set.contains(num + currentLength)) {
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int length = findLongestConsecutiveSequence(arr);
        System.out.println("Length of the longest consecutive sequence: " + length);
    }
}