// Write a program to find the largest element in an array

public class LargestElement {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7};
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("Largest element in the array: " + largest);
    }
}