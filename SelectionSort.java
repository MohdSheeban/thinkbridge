import java.util.Scanner;

//A class that implements selection sort algorithm
class SelectionSort {

    private int[] arr; // input array

    //Constructor for SelectionSort class
    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    //Method to perform selection sort
    public void selectionSort() {
        int n = arr.length;

        // Loop through the array, selecting the minimum element in each iteration
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the remaining unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element in the unsorted portion of the array
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
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
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create an object of SelectionSort class
        SelectionSort ss = new SelectionSort(arr);

        // Perform selection sort
        ss.selectionSort();

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}