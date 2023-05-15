import java.util.Scanner;

//class that implements linear search algorithm
class LinearSearch {

    private int[] arr; // input array
    private int target; // element to search for

    //Constructor for LinearSearch class
    public LinearSearch(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
    }

    //Function to perform linear search
    public int linearSearch() {
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // If the element is found, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // If the element is not found, return -1
        return -1;
    }
}


public class Main {
    // Main method of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get the element to search for from the user
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Create an object of LinearSearch class
        LinearSearch ls = new LinearSearch(arr, target);

        // Perform linear search
        int index = ls.linearSearch();

        // Print the result
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }

        scanner.close();
    }
}