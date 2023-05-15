import java.util.Scanner;

//A class that implements binary search algorithm
class BinarySearch {

    private int[] arr; // input array
    private int target; // element to search for

    //Constructor for BinarySearch class
    public BinarySearch(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
    }

    //Method to perform binary search
    public int binarySearch() {
        int low = 0; // index of the first element in the array
        int high = arr.length - 1; // index of the last element in the array

        while (low <= high) {
            int mid = (low + high) / 2; // index of the middle element in the array

            if (arr[mid] == target) { // if the middle element is the target element
                return mid; // return its index
            } else if (arr[mid] < target) { // if the middle element is less than the target element
                low = mid + 1; // discard the lower half of the array and continue searching in the upper half
            } else { // if the middle element is greater than the target element
                high = mid - 1; // discard the upper half of the array and continue searching in the lower half
            }
        }

        // If the element is not found, return -1
        return -1;
    }
}

public class Main{
    //The main method of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array (in ascending order):");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get the element to search for from the user
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Create an object of BinarySearch class
        BinarySearch bs = new BinarySearch(arr, target);

        // Perform binary search
        int index = bs.binarySearch();

        // Print the result
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }

        scanner.close();
    }
}