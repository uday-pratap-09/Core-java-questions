// How to Binary Search

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (array[mid] == target)
                return mid;
            else if (array[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 8, 10};
        int target = 6;
        int index = binarySearch(numbers, target);
        
        if (index != -1)
            System.out.println(target + " found at index " + index);
        else
            System.out.println(target + " not found in the array.");
    }
}