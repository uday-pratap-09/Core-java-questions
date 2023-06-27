// Write a Java program to find the second largest element in an array

public class SecondLargestElement {
    public static int findSecondLargestElement(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 25, 15};
        int secondLargestElement = findSecondLargestElement(arr);
        System.out.println("Second largest element in the array: " + secondLargestElement);
    }
}