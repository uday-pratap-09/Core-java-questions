// Write a program to check if two strings are anagrams

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);

        if (isAnagram)
            System.out.println("The strings are anagrams.");
        else
            System.out.println("The strings are not anagrams.");
    }
}