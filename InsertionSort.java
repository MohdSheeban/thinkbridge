import java.util.Scanner;

//A class that implements insertion sort algorithm
public class InsertionSort {

    private int[] arr; // input array

    //Constructor for InsertionSort class
    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    //Method to perform insertion sort
    public void insertionSort() {
        int n = arr.length;

        // Loop through the array, starting from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are greater than the key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key into its correct position
            arr[j + 1] = key;
        }
    }

    //The main method of the program
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

        // Create an object of InsertionSort class
        InsertionSort is = new InsertionSort(arr);

        // Perform insertion sort
        is.insertionSort();

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}